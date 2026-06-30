package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l21 extends d31 {
    public static final l21 d;
    public static final l21 e;
    public static final l21 f;
    public static final l21 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new l21(i, 2, 0);
        int i2 = 1;
        e = new l21(i2, i2, 1);
        f = new l21(i, 2, 2);
        int i3 = 1;
        g = new l21(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l21(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        switch (this.c) {
            case 0:
                Object objA = ((ha0) llVar.e(0)).a();
                jb0 jb0Var = (jb0) llVar.e(1);
                int iD = llVar.d(0);
                jb0Var.getClass();
                mp1Var.U(mp1Var.c(jb0Var), objA);
                vcVar.f(iD, objA);
                vcVar.d(objA);
                break;
            case 1:
                jb0 jb0Var2 = (jb0) llVar.e(0);
                int iD2 = llVar.d(0);
                vcVar.q();
                jb0Var2.getClass();
                vcVar.c(iD2, mp1Var.D(mp1Var.c(jb0Var2)));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Object objE = llVar.e(0);
                jb0 jb0Var3 = (jb0) llVar.e(1);
                int iD3 = llVar.d(0);
                if (objE instanceof sb0) {
                    sb0 sb0Var = (sb0) objE;
                    hd1Var.e.b(sb0Var);
                    hd1Var.d.a(sb0Var);
                }
                Object objK = mp1Var.K(mp1Var.c(jb0Var3), iD3, objE);
                if (objK instanceof sb0) {
                    hd1Var.e((sb0) objK);
                } else if (objK instanceof dc1) {
                    ((dc1) objK).c();
                }
                break;
            default:
                Object objE2 = llVar.e(0);
                int iD4 = llVar.d(0);
                if (objE2 instanceof sb0) {
                    sb0 sb0Var2 = (sb0) objE2;
                    hd1Var.e.b(sb0Var2);
                    hd1Var.d.a(sb0Var2);
                }
                Object objK2 = mp1Var.K(mp1Var.t, iD4, objE2);
                if (objK2 instanceof sb0) {
                    hd1Var.e((sb0) objK2);
                } else if (objK2 instanceof dc1) {
                    ((dc1) objK2).c();
                }
                break;
        }
    }

    @Override // defpackage.d31
    public jb0 b(ll llVar) {
        switch (this.c) {
            case 0:
                return (jb0) llVar.e(1);
            case 1:
                return (jb0) llVar.e(0);
            default:
                return super.b(llVar);
        }
    }
}
