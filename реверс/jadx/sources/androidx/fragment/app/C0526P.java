package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0526P extends Writer {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f1663b = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final String f1662a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m1407a() {
        StringBuilder sb = this.f1663b;
        if (sb.length() > 0) {
            Log.d(this.f1662a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1407a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1407a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m1407a();
            } else {
                this.f1663b.append(c2);
            }
        }
    }
}
