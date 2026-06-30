package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 implements aw0 {
    public final Context e;
    public js f;
    public final r41 g = new r41(1.0f);
    public jr1 h;

    public bw0(Context context) {
        this.e = context;
    }

    @Override // defpackage.lt
    public final lt j(lt ltVar) {
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public final jt l(kt ktVar) {
        return hk.v(this, ktVar);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public final lt u(kt ktVar) {
        return hk.J(this, ktVar);
    }

    @Override // defpackage.aw0
    public final float v() {
        ks ksVar;
        os1 os1Var;
        if (this.h == null) {
            Context context = this.e;
            zx0 zx0Var = l92.a;
            synchronized (zx0Var) {
                try {
                    Object objG = zx0Var.g(context);
                    ksVar = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        rh rhVarD = nu0.d(-1, 6, null);
                        y41 y41Var = new y41(8, new pr0(contentResolver, uriFor, new k92(rhVarD, bl.s(Looper.getMainLooper())), rhVarD, context, null));
                        qu1 qu1Var = new qu1(null);
                        lw lwVar = qy.a;
                        objG = xk.O(y41Var, new js(hk.L(qu1Var, kt0.a)), new ls1(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        zx0Var.m(context, objG);
                    }
                    os1Var = (os1) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g.h(((Number) os1Var.getValue()).floatValue());
            js jsVar = this.f;
            if (jsVar == null) {
                yc.l("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.h = nu0.A(jsVar, null, null, new e(os1Var, this, ksVar, 22), 3);
        }
        return this.g.g();
    }
}
