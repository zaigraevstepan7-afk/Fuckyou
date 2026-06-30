package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y71 {
    public static final ys1 a = new ys1(zp.r);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(eo0 eo0Var, m6 m6Var, ls lsVar) {
        w71 w71Var;
        if (lsVar instanceof w71) {
            w71Var = (w71) lsVar;
            int i = w71Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                w71Var.i = i - Integer.MIN_VALUE;
            } else {
                w71Var = new w71(lsVar);
            }
        }
        Object obj = w71Var.h;
        int i2 = w71Var.i;
        if (i2 != 0) {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                xc.G(obj);
                yc.j();
                return;
            }
        }
        xc.G(obj);
        if (!eo0Var.e.r) {
            yc.p("establishTextInputSession called from an unattached node");
            return;
        }
        w31 w31VarQ = bl.Q(eo0Var);
        b61 b61Var = (b61) bl.P(eo0Var).E;
        b61Var.getClass();
        if (xk.I(b61Var, a) != null) {
            yc.d();
        } else {
            w71Var.i = 1;
            b(w31VarQ, m6Var, w71Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w31 w31Var, wa0 wa0Var, ls lsVar) {
        x71 x71Var;
        if (lsVar instanceof x71) {
            x71Var = (x71) lsVar;
            int i = x71Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                x71Var.i = i - Integer.MIN_VALUE;
            } else {
                x71Var = new x71(lsVar);
            }
        }
        Object obj = x71Var.h;
        int i2 = x71Var.i;
        if (i2 == 0) {
            xc.G(obj);
            x71Var.i = 1;
            ((h4) w31Var).H(wa0Var, x71Var);
        } else if (i2 == 1) {
            xc.G(obj);
            yc.j();
        } else if (i2 != 2) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
        } else {
            xc.G(obj);
            yc.j();
        }
    }
}
