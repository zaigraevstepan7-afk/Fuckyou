// Reconstructed string-obfuscation primitive.
//
// The original binary hides sensitive literals (library names, paths, tags)
// from `strings`/static scanners by never emitting them as a plain C string.
// Instead each byte is pre-scrambled at compile time and stored as the raw
// bits of a double/float immediate (loaded via `ldr d0/d8/s0` instead of an
// `adr`/`ldr` into .rodata treated as text), then unscrambled at runtime with
// a per-callsite XOR + subtract transform. Recovered by emulating the
// disassembly at 0x4c0f4/0x4c1b0 against the raw bytes at 0x15ac8/0x159d0
// in the original .so, which decoded to "libunity.so":
//
//   decoded[i] = (((i + K) & 0xFF) ^ enc[i]) - D   (mod 256)
//
// This header reproduces the same transform generically so call sites read
// as plain strings in source but never exist as a contiguous literal in the
// compiled .rodata.

#pragma once
#include <cstdint>
#include <cstddef>

namespace obf {

template <std::size_t N>
struct Obfuscated {
    uint8_t enc[N]{};
    uint32_t key;
    uint8_t sub;

    constexpr Obfuscated(const char (&s)[N], uint32_t k, uint8_t d) : key(k), sub(d) {
        for (std::size_t i = 0; i < N; ++i) {
            uint8_t plain = static_cast<uint8_t>(s[i]);
            uint8_t t = static_cast<uint8_t>((i + k) & 0xFF);
            enc[i] = static_cast<uint8_t>((plain + d) ^ t);
        }
    }

    // Decodes into a caller-provided stack buffer; never returns a pointer
    // into .rodata/.data so the plaintext only exists transiently on the stack.
    void decode(char* out) const {
        for (std::size_t i = 0; i < N; ++i) {
            uint8_t t = static_cast<uint8_t>((i + key) & 0xFF);
            out[i] = static_cast<char>((enc[i] ^ t) - sub);
        }
    }
};

} // namespace obf

// Usage: OBF_DECL(name, "literal", key, sub) then OBF_STR(name) to get a
// decoded stack-local `const char*` valid for the current scope.
#define OBF_DECL(name, literal, key, sub) \
    static constexpr ::obf::Obfuscated<sizeof(literal)> name##_enc(literal, key, sub)

#define OBF_STR(name) \
    ([&]() -> const char* { \
        static thread_local char buf[sizeof(name##_enc.enc)]; \
        name##_enc.decode(buf); \
        return buf; \
    }())
