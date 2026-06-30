package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uo extends ne1 implements wa0 {
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(vo voVar, ks ksVar) {
        super(ksVar);
        this.l = voVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((uo) o((ks) obj2, (lm1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        uo uoVar = new uo(this.l, ksVar);
        uoVar.k = obj;
        return uoVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        lm1 lm1Var;
        int i;
        int i2;
        int i3;
        String strJ;
        int i4;
        int i5;
        String str;
        vo voVar = this.l;
        sx0 sx0Var = voVar.e;
        gx0 gx0Var = voVar.g;
        int i6 = this.j;
        if (i6 == 0) {
            xc.G(obj);
            lm1Var = (lm1) this.k;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.i;
            i2 = this.h;
            i3 = this.g;
            lm1Var = (lm1) this.k;
            xc.G(obj);
        }
        if (i3 >= Math.min(voVar.h + 10, gx0Var.b)) {
            return t32.a;
        }
        int i7 = i3 + 1;
        int iC = gx0Var.c(i3);
        switch (iC) {
            case 0:
                strJ = "up";
                break;
            case 1:
                Object objF = sx0Var.f(i2);
                i2++;
                strJ = "down " + objF;
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                strJ = s91.j("remove ", gx0Var.c(i7), " ", gx0Var.c(i3 + 2));
                i7 = i3 + 3;
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                int iC2 = gx0Var.c(i7);
                int iC3 = gx0Var.c(i3 + 2);
                int iC4 = gx0Var.c(i3 + 3);
                StringBuilder sbN = s91.n("move ", iC2, " ", iC3, " ");
                sbN.append(iC4);
                strJ = sbN.toString();
                i7 = i3 + 4;
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                strJ = "clear";
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int iC5 = gx0Var.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + sx0Var.f(i2);
                int i8 = i4;
                strJ = str;
                i7 = i8;
                i2 = i5;
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int iC6 = gx0Var.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + sx0Var.f(i2);
                int i82 = i4;
                strJ = str;
                i7 = i82;
                i2 = i5;
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                Object objF2 = sx0Var.f(i2);
                objF2.getClass();
                s22.i(2, objF2);
                i2 += 2;
                strJ = "apply " + ((wa0) objF2);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                strJ = "reuse " + voVar.f.f(i);
                i++;
                break;
            case el.a /* 9 */:
                strJ = "recompose pending";
                break;
            default:
                strJ = s91.i("unknown op: ", iC);
                break;
        }
        this.k = lm1Var;
        this.g = i7;
        this.h = i2;
        this.i = i;
        this.j = 1;
        lm1Var.b(i3 + ": " + strJ, this);
        return wt.e;
    }
}
