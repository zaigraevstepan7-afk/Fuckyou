package androidx.emoji2.text;

import android.os.Trace;
import java.lang.reflect.Method;
import p016J.AbstractC0139k;

/* JADX INFO: renamed from: androidx.emoji2.text.l */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0498l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC0139k.f445b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0496j.f1520k != null) {
                C0496j.m1303a().m1305c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = AbstractC0139k.f445b;
            Trace.endSection();
            throw th;
        }
    }
}
