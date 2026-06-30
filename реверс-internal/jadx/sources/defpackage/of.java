package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ of(q20 q20Var, kv1 kv1Var, kv1 kv1Var2, MainActivity mainActivity, View view) {
        this.f = q20Var;
        this.g = kv1Var;
        this.h = kv1Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ey0 ey0VarC;
        int i = this.e;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                d02 d02Var = (d02) obj5;
                al0 al0Var = (al0) obj4;
                String str = (String) obj3;
                hx hxVar = (hx) obj2;
                c90 c90Var = (c90) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    sp1 sp1VarJ = aq1.j();
                    ey0 ey0Var = sp1VarJ instanceof ey0 ? (ey0) sp1VarJ : null;
                    if (ey0Var == null || (ey0VarC = ey0Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        sp1 sp1VarJ2 = ey0VarC.j();
                        try {
                            d02 d02VarX = qc1.x(d02Var, al0Var);
                            f40 f40Var = f40.e;
                            v6 v6Var = new v6(str, d02VarX, f40Var, f40Var, c90Var, hxVar);
                            v6Var.c();
                            v6Var.a();
                            sp1.q(sp1VarJ2);
                            ey0VarC.w().f();
                            ey0VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            sp1.q(sp1VarJ2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                q20 q20Var = (q20) obj5;
                kv1 kv1Var = (kv1) obj4;
                kv1 kv1Var2 = (kv1) obj3;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                sa0 sa0Var = kv1Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) sa0Var.i(resources)).booleanValue();
                sa0 sa0Var2 = kv1Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                q20Var.b(kv1Var, kv1Var2, window, view, zBooleanValue, ((Boolean) sa0Var2.i(resources2)).booleanValue());
                return;
        }
    }

    public /* synthetic */ of(d02 d02Var, al0 al0Var, String str, hx hxVar, c90 c90Var, boolean z) {
        this.f = d02Var;
        this.g = al0Var;
        this.h = str;
        this.i = hxVar;
        this.j = c90Var;
    }
}
