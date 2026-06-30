package com.topjohnwu.superuser.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
abstract class StreamGobbler<T> implements Callable<T> {
    private static final String TAG = "SHELLOUT";
    protected final InputStream in;
    protected final List<String> list;

    StreamGobbler(InputStream in, List<String> list) {
        this.in = in;
        this.list = list;
    }

    private boolean outputAndCheck(String line) {
        if (line == null) {
            return false;
        }
        int len = line.length();
        boolean end = line.startsWith(JobImpl.END_UUID, len - 36);
        if (end) {
            if (len == 36) {
                return false;
            }
            line = line.substring(0, len - 36);
        }
        if (this.list != null) {
            this.list.add(line);
            Utils.log(TAG, line);
        }
        return !end;
    }

    protected String process(boolean res) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(this.in, StandardCharsets.UTF_8));
        do {
            line = br.readLine();
        } while (outputAndCheck(line));
        if (res) {
            return br.readLine();
        }
        return null;
    }

    static class OUT extends StreamGobbler<Integer> {
        private static final int NO_RESULT_CODE = 1;

        OUT(InputStream in, List<String> list) {
            super(in, list);
        }

        @Override // java.util.concurrent.Callable
        public Integer call() throws Exception {
            int code;
            String codeStr = process(true);
            if (codeStr == null) {
                code = 1;
            } else {
                try {
                    code = Integer.parseInt(codeStr);
                } catch (NumberFormatException e) {
                    return 1;
                }
            }
            Utils.log(StreamGobbler.TAG, "(exit code: " + code + ")");
            return Integer.valueOf(code);
        }
    }

    static class ERR extends StreamGobbler<Void> {
        ERR(InputStream in, List<String> list) {
            super(in, list);
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            process(false);
            return null;
        }
    }
}
