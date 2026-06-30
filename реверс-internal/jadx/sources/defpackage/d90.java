package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d90 implements c90 {
    public final l91 a;
    public final b6 b;
    public final n81 c;
    public final h90 d;
    public final y41 e;

    public d90(l91 l91Var, b6 b6Var) {
        n81 n81Var = e90.a;
        h90 h90Var = new h90();
        g90 g90Var = h90.a;
        ed0 ed0Var = py.a;
        g90Var.getClass();
        bl.d(hk.L(g90Var, ed0Var).j(d40.e).j(new qu1(null)));
        y41 y41Var = new y41(1);
        this.a = l91Var;
        this.b = b6Var;
        this.c = n81Var;
        this.d = h90Var;
        this.e = y41Var;
        new n(11, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #3 {Exception -> 0x00a2, blocks: (B:25:0x0040, B:27:0x0054, B:30:0x0059, B:32:0x005d, B:37:0x0072, B:53:0x009a, B:54:0x00a1, B:33:0x0064, B:34:0x0066, B:35:0x0069, B:36:0x006e), top: B:65:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d32 a(c32 c32Var) {
        Typeface typefaceC;
        Object objRemove;
        n81 n81Var = this.c;
        synchronized (((t61) n81Var.b)) {
            try {
                d32 d32Var = (d32) ((dt0) n81Var.c).a(c32Var);
                if (d32Var != null) {
                    if (d32Var.f) {
                        return d32Var;
                    }
                    dt0 dt0Var = (dt0) n81Var.c;
                    synchronized (dt0Var.c) {
                        et0 et0Var = dt0Var.b;
                        et0Var.getClass();
                        objRemove = et0Var.a.remove(c32Var);
                        if (objRemove != null) {
                            dt0Var.d--;
                        }
                    }
                }
                try {
                    this.d.getClass();
                    lv1 lv1Var = c32Var.a;
                    t61 t61Var = (t61) this.e.f;
                    int i = c32Var.c;
                    aa0 aa0Var = c32Var.b;
                    d32 d32Var2 = null;
                    if (lv1Var != null && !(lv1Var instanceof bw)) {
                        if (lv1Var instanceof zb0) {
                            typefaceC = t61Var.e((zb0) lv1Var, aa0Var, i);
                        }
                        if (d32Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((t61) n81Var.b)) {
                            if (((dt0) n81Var.c).a(c32Var) == null && d32Var2.f) {
                                ((dt0) n81Var.c).b(c32Var, d32Var2);
                            }
                        }
                        return d32Var2;
                    }
                    switch (t61Var.e) {
                        case t91.FLOAT_FIELD_NUMBER /* 2 */:
                            typefaceC = t61.c(null, aa0Var, i);
                            break;
                        default:
                            typefaceC = t61.d(null, aa0Var, i);
                            break;
                    }
                    d32Var2 = new d32(typefaceC);
                    if (d32Var2 != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d32 b(lv1 lv1Var, aa0 aa0Var, int i, int i2) {
        b6 b6Var = this.b;
        b6Var.getClass();
        int i3 = b6Var.e;
        aa0 aa0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? aa0Var : new aa0(lk.A(aa0Var.e + i3, 1, 1000));
        this.a.getClass();
        return a(new c32(lv1Var, aa0Var2, i, i2, null));
    }
}
