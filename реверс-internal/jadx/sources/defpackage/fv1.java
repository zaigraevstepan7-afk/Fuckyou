package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 extends sv0 implements q81, hx, p81 {
    public e81 A;
    public long B;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public jr1 v;
    public e81 w = bv1.a;
    public final iy0 x;
    public final iy0 y;
    public final iy0 z;

    public fv1(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        iy0 iy0Var = new iy0(new ev1[16]);
        this.x = iy0Var;
        this.y = iy0Var;
        this.z = new iy0(new ev1[16]);
        this.B = 0L;
    }

    @Override // defpackage.sv0
    public final void E0() {
        N0();
    }

    @Override // defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        this.B = j;
        if (f81Var == f81.e) {
            this.w = e81Var;
        }
        ks ksVar = null;
        if (this.v == null) {
            this.v = nu0.A(z0(), null, yt.h, new tv(this, ksVar, 12), 1);
        }
        M0(e81Var, f81Var);
        List list = e81Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                e81Var = null;
                break;
            } else if (!lk.t((l81) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.A = e81Var;
    }

    public final Object L0(wa0 wa0Var, ks ksVar) {
        xi xiVar = new xi(1, bl.E(ksVar));
        xiVar.v();
        ev1 ev1Var = new ev1(this, xiVar);
        synchronized (this.y) {
            this.x.b(ev1Var);
            new bh1(bl.E(bl.t(ev1Var, ev1Var, wa0Var))).g(t32.a);
        }
        xiVar.x(new g3(21, ev1Var));
        return xiVar.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(e81 e81Var, f81 f81Var) {
        int i;
        int i2;
        xi xiVar;
        xi xiVar2;
        synchronized (this.y) {
            iy0 iy0Var = this.z;
            iy0Var.c(iy0Var.g, this.x);
        }
        try {
            int iOrdinal = f81Var.ordinal();
            if (iOrdinal == 0) {
                iy0 iy0Var2 = this.z;
                Object[] objArr = iy0Var2.e;
                i = iy0Var2.g;
                for (i2 = 0; i2 < i; i2++) {
                    ev1 ev1Var = (ev1) objArr[i2];
                    if (f81Var == ev1Var.h && (xiVar = ev1Var.g) != null) {
                        ev1Var.g = null;
                        xiVar.g(e81Var);
                    }
                }
            } else if (iOrdinal == 1) {
                iy0 iy0Var3 = this.z;
                int i3 = iy0Var3.g - 1;
                Object[] objArr2 = iy0Var3.e;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        ev1 ev1Var2 = (ev1) objArr2[i3];
                        if (f81Var == ev1Var2.h && (xiVar2 = ev1Var2.g) != null) {
                            ev1Var2.g = null;
                            xiVar2.g(e81Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new pn();
                }
                iy0 iy0Var22 = this.z;
                Object[] objArr3 = iy0Var22.e;
                i = iy0Var22.g;
                while (i2 < i) {
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void N0() {
        jr1 jr1Var = this.v;
        if (jr1Var != null) {
            jr1Var.D(new wv0("Pointer input was reset", 2));
            this.v = null;
        }
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
        N0();
    }

    @Override // defpackage.p81
    public final void a0() {
        N0();
    }

    @Override // defpackage.hx
    public final float b() {
        return bl.P(this).B.b();
    }

    @Override // defpackage.p81
    public final void h0() {
        e81 e81Var = this.A;
        if (e81Var == null) {
            return;
        }
        List list = e81Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((l81) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    l81 l81Var = (l81) list.get(i2);
                    long j = l81Var.a;
                    long j2 = l81Var.c;
                    long j3 = l81Var.b;
                    float f = l81Var.e;
                    boolean z = l81Var.d;
                    arrayList.add(new l81(j, j3, j2, false, f, j3, j2, z, z, l81Var.i, 0L, 1.0f, 0L));
                }
                e81 e81Var2 = new e81(arrayList, null);
                this.w = e81Var2;
                M0(e81Var2, f81.e);
                M0(e81Var2, f81.f);
                M0(e81Var2, f81.g);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.hx
    public final float l() {
        return bl.P(this).B.l();
    }
}
