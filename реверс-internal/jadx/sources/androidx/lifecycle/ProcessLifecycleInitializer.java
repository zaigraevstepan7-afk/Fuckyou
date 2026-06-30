package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.f40;
import defpackage.kg0;
import defpackage.oc;
import defpackage.po0;
import defpackage.ro0;
import defpackage.so0;
import defpackage.ta1;
import defpackage.ua1;
import defpackage.yc;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements kg0 {
    @Override // defpackage.kg0
    public final List a() {
        return f40.e;
    }

    @Override // defpackage.kg0
    public final Object b(Context context) {
        context.getClass();
        oc ocVarM = oc.m(context);
        ocVarM.getClass();
        if (!((HashSet) ocVarM.b).contains(ProcessLifecycleInitializer.class)) {
            yc.l("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!so0.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ro0());
        }
        ua1 ua1Var = ua1.m;
        ua1Var.getClass();
        ua1Var.i = new Handler();
        ua1Var.j.d(po0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ta1(ua1Var));
        return ua1Var;
    }
}
