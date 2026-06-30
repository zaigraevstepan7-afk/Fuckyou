package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gs implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gs(View view, boolean z) {
        this.e = 2;
        this.g = view;
        this.f = z;
    }

    @Override // defpackage.ha0
    public final Object a() {
        dy0 dy0VarI;
        int i = this.e;
        t32 t32Var = t32.a;
        boolean z = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ha0 ha0Var = (ha0) obj;
                if (z) {
                    ha0Var.a();
                }
                break;
            case 1:
                n6 n6Var = (n6) obj;
                if (z && (dy0VarI = n6Var.i()) != null) {
                    ((tn1) dy0VarI).r(t32Var);
                }
                break;
            default:
                Context context = ((View) obj).getContext();
                context.getClass();
                Window window = ((Activity) context).getWindow();
                pd1.p(window, false);
                int i2 = Build.VERSION.SDK_INT;
                af1 s82Var = i2 >= 35 ? new s82(window) : i2 >= 30 ? new r82(window) : new q82(window);
                boolean z2 = !z;
                s82Var.C(z2);
                s82Var.B(z2);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ gs(int i, Object obj, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
