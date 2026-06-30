package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l8 f;

    public /* synthetic */ d8(l8 l8Var, int i) {
        this.e = i;
        this.f = l8Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        l8 l8Var = this.f;
        switch (i) {
            case 0:
                ha0 ha0Var = (ha0) obj;
                View view = l8Var.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ha0Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new r3(ha0Var, 2));
                    }
                }
                return t32Var;
            case 1:
                ActionMode actionMode = l8Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ActionMode actionMode2 = l8Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return t32Var;
            default:
                l8Var.e.d();
                return new j2(3, l8Var);
        }
    }
}
