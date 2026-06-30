package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq {
    public static final ys1 a = new ys1(v4.r);
    public static final ys1 b = new ys1(v4.s);
    public static final ys1 c = new ys1(v4.u);
    public static final ys1 d = new ys1(v4.t);
    public static final ys1 e = new ys1(v4.w);
    public static final ys1 f = new ys1(v4.v);
    public static final ys1 g = new ys1(v4.C);
    public static final ys1 h = new ys1(v4.y);
    public static final ys1 i = new ys1(v4.z);
    public static final ys1 j = new ys1(v4.B);
    public static final ys1 k = new ys1(v4.A);
    public static final ys1 l = new ys1(v4.D);
    public static final ys1 m = new ys1(v4.E);
    public static final ys1 n = new ys1(v4.F);
    public static final ys1 o = new ys1(v4.H);
    public static final ys1 p;
    public static final ys1 q;
    public static final ys1 r;
    public static final ys1 s;
    public static final ys1 t;
    public static final ys1 u;
    public static final ys1 v;
    public static final ys1 w;
    public static final bq x;
    public static final ys1 y;

    static {
        al.F(new e2(9));
        p = new ys1(zp.h);
        q = new ys1(v4.J);
        r = new ys1(zp.i);
        s = new ys1(zp.j);
        t = new ys1(zp.k);
        u = new ys1(zp.l);
        v = new ys1(zp.g);
        w = new ys1(v4.G);
        x = new bq(v4.I);
        y = new ys1(v4.x);
    }

    public static final void a(w31 w31Var, l91 l91Var, wa0 wa0Var, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(1925803616);
        int i4 = i2 | (ob0Var.f(w31Var) ? 4 : 2) | (ob0Var.f(l91Var) ? 32 : 16) | (ob0Var.h(wa0Var) ? 256 : 128);
        if (ob0Var.N(i4 & 1, (i4 & 147) != 146)) {
            h4 h4Var = (h4) w31Var;
            pb1 pb1VarA = a.a(h4Var.getAccessibilityManager());
            pb1 pb1VarA2 = b.a(h4Var.getAutofill());
            pb1 pb1VarA3 = d.a(h4Var.getAutofillManager());
            pb1 pb1VarA4 = c.a(h4Var.getAutofillTree());
            pb1 pb1VarA5 = e.a(h4Var.getClipboardManager());
            pb1 pb1VarA6 = f.a(h4Var.getClipboard());
            pb1 pb1VarA7 = h.a(h4Var.getDensity());
            pb1 pb1VarA8 = i.a(h4Var.getFocusOwner());
            pb1 pb1VarA9 = j.a(h4Var.getFontLoader());
            pb1VarA9.g = false;
            pb1 pb1VarA10 = k.a(h4Var.getFontFamilyResolver());
            pb1VarA10.g = false;
            pb1 pb1VarA11 = l.a(h4Var.getHapticFeedBack());
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objK = ob0Var.K();
            l91 l91Var2 = kp.a;
            if (z || objK == l91Var2) {
                objK = new b4(h4Var, 3);
                ob0Var.f0(objK);
            }
            pb1 pb1VarC = m.c((sa0) objK);
            pb1 pb1VarA12 = n.a(h4Var.getLayoutDirection());
            boolean z2 = i5 == 4;
            Object objK2 = ob0Var.K();
            if (z2 || objK2 == l91Var2) {
                i3 = 4;
                objK2 = new b4(h4Var, i3);
                ob0Var.f0(objK2);
            } else {
                i3 = 4;
            }
            pb1 pb1VarC2 = p.c((sa0) objK2);
            boolean z3 = i5 == i3;
            Object objK3 = ob0Var.K();
            if (z3 || objK3 == l91Var2) {
                objK3 = new b4(h4Var, 5);
                ob0Var.f0(objK3);
            }
            pb1 pb1VarC3 = q.c((sa0) objK3);
            boolean z4 = i5 == 4;
            Object objK4 = ob0Var.K();
            if (z4 || objK4 == l91Var2) {
                objK4 = new b4(h4Var, 6);
                ob0Var.f0(objK4);
            }
            pb1 pb1VarC4 = r.c((sa0) objK4);
            pb1 pb1VarA13 = s.a(l91Var);
            pb1 pb1VarA14 = t.a(h4Var.getViewConfiguration());
            pb1 pb1VarA15 = u.a(h4Var.getWindowInfo());
            boolean z5 = i5 == 4;
            Object objK5 = ob0Var.K();
            if (z5 || objK5 == l91Var2) {
                objK5 = new b4(h4Var, 7);
                ob0Var.f0(objK5);
            }
            lk.j(new pb1[]{pb1VarA, pb1VarA2, pb1VarA3, pb1VarA4, pb1VarA5, pb1VarA6, pb1VarA7, pb1VarA8, pb1VarA9, pb1VarA10, pb1VarA11, pb1VarC, pb1VarA12, pb1VarC2, pb1VarC3, pb1VarC4, pb1VarA13, pb1VarA14, pb1VarA15, w.c((sa0) objK5), g.a(h4Var.getGraphicsContext()), wr0.a.a(h4Var.getRetainedValuesStore()), o.a(h4Var.getLocaleList())}, wa0Var, ob0Var, ((i4 >> 3) & 112) | 8);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new l5(w31Var, l91Var, wa0Var, i2, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
