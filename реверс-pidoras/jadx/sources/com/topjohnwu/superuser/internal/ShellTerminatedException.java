package com.topjohnwu.superuser.internal;

import java.io.IOException;

/* JADX INFO: compiled from: ShellImpl.java */
/* JADX INFO: loaded from: classes.dex */
class ShellTerminatedException extends IOException {
    ShellTerminatedException() {
        super("Shell terminated unexpectedly");
    }
}
