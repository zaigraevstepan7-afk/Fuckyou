// Reconstructed from JNI_OnLoad at file offset 0x4ce38 in the original
// binary. Disassembly:
//
//   cmp  x1, #0x539            ; reserved == 1337 ?
//   b.ne 0x4ceb4               ; if not: return JNI_VERSION_1_6, do nothing
//   ...
//   adr  x8, 0x4c040           ; payload thread entry
//   pthread_create(...)
//   ...
// 0x4ceb4:
//   return 0x10006             ; JNI_VERSION_1_6
//
// A plain System.loadLibrary() call always passes reserved == NULL, so this
// function is a no-op unless something calls JNI_OnLoad(vm, (void*)1337)
// directly (dlsym + manual invocation) - a deliberate anti-analysis trick:
// naive static/dynamic scanners that just watch JNI_OnLoad see an empty
// function. This file preserves that exact gate for fidelity. The "real"
// entry point for an actual Magisk/Zygisk load is zygisk_module.cpp
// (postAppSpecialize), since pltHookRegister/etc. are only available
// through the Zygisk Api object, which this path does not have access to.

#include "zygisk_entry.h"

#include <jni.h>

extern "C" JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* /*vm*/, void* reserved) {
    if (reserved == reinterpret_cast<void*>(1337)) {
        zentry::start_thread();
    }
    return JNI_VERSION_1_6;
}
