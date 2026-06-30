package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.InterfaceC0572d;
import androidx.lifecycle.InterfaceC0586r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p000A.C0001b;
import p070i0.C0784a;
import p070i0.InterfaceC0785b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0785b {
    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: a */
    public final List mo1283a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: b */
    public final Object mo1284b(Context context) {
        C0503q c0503q = new C0503q(new C0001b(context));
        c0503q.f1516a = 1;
        if (C0496j.f1520k == null) {
            synchronized (C0496j.f1519j) {
                try {
                    if (C0496j.f1520k == null) {
                        C0496j.f1520k = new C0496j(c0503q);
                    }
                } finally {
                }
            }
        }
        m1285c(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public final void m1285c(Context context) {
        Object objM2135b;
        C0784a c0784aM2133c = C0784a.m2133c(context);
        c0784aM2133c.getClass();
        synchronized (C0784a.f3160e) {
            try {
                objM2135b = c0784aM2133c.f3161a.get(ProcessLifecycleInitializer.class);
                if (objM2135b == null) {
                    objM2135b = c0784aM2133c.m2135b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final C0588t c0588tMo1164d = ((InterfaceC0586r) objM2135b).mo1164d();
        c0588tMo1164d.m1481a(new InterfaceC0572d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0572d
            /* JADX INFO: renamed from: a */
            public final void mo1286a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0488b.m1287a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0498l(), 500L);
                c0588tMo1164d.m1486f(this);
            }
        });
    }
}
