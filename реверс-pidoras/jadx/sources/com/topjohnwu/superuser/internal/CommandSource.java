package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: ShellInputSource.java */
/* JADX INFO: loaded from: classes.dex */
class CommandSource implements ShellInputSource {
    private final String[] cmd;

    CommandSource(String[] cmd) {
        this.cmd = cmd;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream out) throws IOException {
        for (String command : this.cmd) {
            out.write(command.getBytes(StandardCharsets.UTF_8));
            out.write(10);
            Utils.log(ShellInputSource.TAG, command);
        }
    }
}
