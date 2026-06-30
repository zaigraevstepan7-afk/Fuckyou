package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ShellInputSource.java */
/* JADX INFO: loaded from: classes.dex */
class InputStreamSource implements ShellInputSource {
    private final InputStream in;

    InputStreamSource(InputStream in) {
        this.in = in;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream out) throws IOException {
        Utils.pump(this.in, out);
        this.in.close();
        out.write(10);
        Utils.log(ShellInputSource.TAG, "<InputStream>");
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.in.close();
        } catch (IOException e) {
        }
    }
}
