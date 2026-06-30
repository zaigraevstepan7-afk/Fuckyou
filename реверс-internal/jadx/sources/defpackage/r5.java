package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r5 implements View.OnDragListener, yz {
    public final a00 a;
    public final md b;
    public final q5 c;

    public r5() {
        a00 a00Var = new a00();
        a00Var.u = 0L;
        this.a = a00Var;
        this.b = new md();
        this.c = new q5(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        qt0 qt0Var = new qt0(18, dragEvent);
        int action = dragEvent.getAction();
        h22 h22Var = h22.e;
        md mdVar = this.b;
        a00 a00Var = this.a;
        switch (action) {
            case 1:
                vc1 vc1Var = new vc1();
                zz zzVar = new zz(qt0Var, a00Var, vc1Var);
                if (zzVar.i(a00Var) == h22Var) {
                    pd1.w(a00Var, zzVar);
                }
                boolean z = vc1Var.e;
                mdVar.getClass();
                hd hdVar = new hd(mdVar);
                while (hdVar.hasNext()) {
                    ((a00) hdVar.next()).P0();
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                a00Var.O0(qt0Var);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                g3 g3Var = new g3(9, qt0Var);
                if (g3Var.i(a00Var) == h22Var) {
                    pd1.w(a00Var, g3Var);
                }
                mdVar.clear();
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                a00Var.M0();
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                a00Var.N0();
                break;
        }
        return false;
    }
}
