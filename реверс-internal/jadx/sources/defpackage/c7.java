package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c7 implements vt {
    public final View e;
    public final gz1 f;
    public final vt g;
    public final AtomicReference h = new AtomicReference(null);

    public c7(View view, gz1 gz1Var, vt vtVar) {
        this.e = view;
        this.f = gz1Var;
        this.g = vtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ko0 ko0Var, ls lsVar) {
        z6 z6Var;
        if (lsVar instanceof z6) {
            z6Var = (z6) lsVar;
            int i = z6Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6Var.j = i - Integer.MIN_VALUE;
            } else {
                z6Var = new z6(this, lsVar);
            }
        }
        Object obj = z6Var.h;
        int i2 = z6Var.j;
        if (i2 == 0) {
            xc.G(obj);
            b7 b7Var = new b7(0, ko0Var, this);
            ks ksVar = null;
            e eVar = new e(this, ksVar, 3);
            z6Var.j = 1;
            if (bl.r(new m6(b7Var, this.h, eVar, ksVar, 14), z6Var) == wt.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            xc.G(obj);
        }
        yc.j();
    }

    @Override // defpackage.vt
    public final lt f() {
        return this.g.f();
    }
}
