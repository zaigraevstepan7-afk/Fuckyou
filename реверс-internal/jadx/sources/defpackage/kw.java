package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kw implements vo0 {
    public final /* synthetic */ int e = 2;
    public final Object f;
    public final Object g;

    public kw(wo0 wo0Var) {
        this.f = wo0Var;
        pk pkVar = pk.c;
        Class<?> cls = wo0Var.getClass();
        nk nkVar = (nk) pkVar.a.get(cls);
        this.g = nkVar == null ? pkVar.a(cls, null) : nkVar;
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                iw iwVar = (iw) obj;
                switch (jw.a[po0Var.ordinal()]) {
                    case 1:
                        iwVar.getClass();
                        break;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        iwVar.b(xo0Var);
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        iwVar.c(xo0Var);
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        iwVar.getClass();
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        iwVar.a(xo0Var);
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        iwVar.getClass();
                        break;
                    case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                        yc.p("ON_ANY must not been send by anybody");
                        break;
                    default:
                        ez1.a();
                        break;
                }
                vo0 vo0Var = (vo0) obj2;
                if (vo0Var != null) {
                    vo0Var.e(xo0Var, po0Var);
                }
                break;
            case 1:
                if (po0Var == po0.ON_START) {
                    ((zo0) obj).f(this);
                    ((n81) obj2).o();
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                i11 i11Var = (i11) obj;
                int i2 = m11.a[po0Var.ordinal()];
                if (i2 == 1) {
                    i11Var.h(true);
                    break;
                } else if (i2 == 2) {
                    i11Var.h(false);
                    break;
                } else if (i2 == 3) {
                    i11Var.f();
                    ((zo0) obj2).f(this);
                    break;
                }
                break;
            default:
                HashMap map = ((nk) obj2).a;
                nk.a((List) map.get(po0Var), xo0Var, po0Var, obj);
                nk.a((List) map.get(po0.ON_ANY), xo0Var, po0Var, obj);
                break;
        }
    }

    public kw(iw iwVar, vo0 vo0Var) {
        iwVar.getClass();
        this.f = iwVar;
        this.g = vo0Var;
    }

    public kw(zo0 zo0Var, n81 n81Var) {
        this.f = zo0Var;
        this.g = n81Var;
    }

    public kw(i11 i11Var, n11 n11Var, zo0 zo0Var) {
        this.f = i11Var;
        this.g = zo0Var;
    }
}
