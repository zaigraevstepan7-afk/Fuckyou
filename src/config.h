#pragma once

namespace config {

// Reconstructed from the fopen()/fgets()/sscanf("%lx %lx", ...) sequence in
// the original payload thread. The exact on-disk format and path used by the
// original author weren't recoverable from the stripped binary (no format
// string for the path survived in .rodata), so this is a best-effort
// reconstruction of the *shape* of the check (two bounds read from a local
// file, current value must fall inside them) rather than a byte-exact copy.
// Adjust kConfigPath / the comparison below to match your real source.
bool load_and_validate();

} // namespace config
