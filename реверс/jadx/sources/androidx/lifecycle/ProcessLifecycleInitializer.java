package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p035S0.C0367d;
import p051a1.AbstractC0451c;
import p070i0.C0784a;
import p070i0.InterfaceC0785b;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0785b {
    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: a */
    public final List mo1283a() {
        return C0367d.f1010a;
    }

    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: b */
    public final Object mo1284b(Context context) {
        AbstractC0451c.m1146e(context, "context");
        C0784a c0784aM2133c = C0784a.m2133c(context);
        AbstractC0451c.m1145d(c0784aM2133c, "getInstance(context)");
        if (!c0784aM2133c.f3162b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0583o.f1872a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0451c.m1144c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0582n());
        }
        C0558B c0558b = C0558B.f1826i;
        c0558b.getClass();
        c0558b.f1831e = new Handler();
        c0558b.f1832f.m1484d(EnumC0580l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0451c.m1144c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0557A(c0558b));
        return c0558b;
    }
}
