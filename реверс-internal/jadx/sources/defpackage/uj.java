package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uj implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ uj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(yh0 yh0Var, ks ksVar) {
        gy0 gy0Var;
        Iterator it;
        yh0 yh0Var2;
        l1 l1Var = (l1) this.i;
        l1 l1Var2 = (l1) this.h;
        l1 l1Var3 = (l1) this.f;
        hy0 hy0Var = (hy0) this.g;
        if (ksVar instanceof gy0) {
            gy0Var = (gy0) ksVar;
            int i = gy0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy0Var.m = i - Integer.MIN_VALUE;
            } else {
                gy0Var = new gy0(this, ksVar);
            }
        }
        Object obj = gy0Var.k;
        int i2 = gy0Var.m;
        t32 t32Var = t32.a;
        if (i2 == 0) {
            xc.G(obj);
            if (yh0Var instanceof oa1) {
                l1Var3.a(yh0Var);
                hy0Var.c(true);
                return t32Var;
            }
            if (yh0Var instanceof pa1) {
                l1Var3.b(((pa1) yh0Var).a);
                hy0Var.c(l1Var3.a != null);
                return t32Var;
            }
            if (yh0Var instanceof na1) {
                l1Var3.b(((na1) yh0Var).a);
                hy0Var.c(l1Var3.a != null);
                return t32Var;
            }
            if (yh0Var instanceof ce0) {
                l1Var2.a(yh0Var);
                hy0Var.b(true);
                return t32Var;
            }
            if (yh0Var instanceof de0) {
                l1Var2.b(((de0) yh0Var).a);
                hy0Var.b(l1Var2.a != null);
                return t32Var;
            }
            if (yh0Var instanceof c80) {
                l1Var.a(yh0Var);
                hy0Var.a(true);
                return t32Var;
            }
            if (yh0Var instanceof d80) {
                l1Var.b(((d80) yh0Var).a);
                hy0Var.a(l1Var.a != null);
                return t32Var;
            }
            it = hy0Var.b.f.iterator();
            yh0Var2 = yh0Var;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = gy0Var.j;
            hy0 hy0Var2 = gy0Var.i;
            yh0 yh0Var3 = gy0Var.h;
            xc.G(obj);
            hy0Var = hy0Var2;
            yh0Var2 = yh0Var3;
        }
        while (it.hasNext()) {
            au1 au1Var = (au1) ((Map.Entry) it.next()).getKey();
            gy0Var.h = yh0Var2;
            gy0Var.i = hy0Var;
            gy0Var.j = it;
            gy0Var.m = 1;
            au1Var.getClass();
            wt wtVar = wt.e;
            if (t32Var == wtVar) {
                return wtVar;
            }
        }
        return t32Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) {
        tj tjVar;
        int i = this.e;
        int i2 = 1;
        int i3 = 0;
        t32 t32Var = t32.a;
        Object obj2 = this.i;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                zc1 zc1Var = (zc1) obj3;
                if (ksVar instanceof tj) {
                    tjVar = (tj) ksVar;
                    int i4 = tjVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        tjVar.k = i4 - Integer.MIN_VALUE;
                    } else {
                        tjVar = new tj(this, ksVar);
                    }
                }
                Object obj6 = tjVar.i;
                int i5 = tjVar.k;
                if (i5 == 0) {
                    xc.G(obj6);
                    oj0 oj0Var = (oj0) zc1Var.e;
                    if (oj0Var != null) {
                        oj0Var.a(new ck("Child of the scoped flow was cancelled", i3));
                        tjVar.h = obj;
                        tjVar.k = 1;
                        Object objW = oj0Var.w(tjVar);
                        wt wtVar = wt.e;
                        if (objW == wtVar) {
                            return wtVar;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = tjVar.h;
                    xc.G(obj6);
                }
                zc1Var.e = nu0.A((vt) obj4, null, yt.h, new sj((vj) obj5, (g70) obj2, obj, null), 1);
                return t32Var;
            case 1:
                ry1 ry1Var = (ry1) obj5;
                jo0 jo0Var = (jo0) obj3;
                if (((Boolean) obj).booleanValue() && jo0Var.b()) {
                    bl.S((gz1) obj4, jo0Var, ry1Var.n(), (df0) obj2, ry1Var.b);
                } else {
                    bl.v(jo0Var);
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                yh0 yh0Var = (yh0) obj;
                xc1 xc1Var = (xc1) obj5;
                xc1 xc1Var2 = (xc1) obj4;
                xc1 xc1Var3 = (xc1) obj3;
                if (yh0Var instanceof oa1) {
                    xc1Var3.e++;
                } else if ((yh0Var instanceof pa1) || (yh0Var instanceof na1)) {
                    xc1Var3.e--;
                } else if (yh0Var instanceof ce0) {
                    xc1Var2.e++;
                } else if (yh0Var instanceof de0) {
                    xc1Var2.e--;
                } else if (yh0Var instanceof c80) {
                    xc1Var.e++;
                } else if (yh0Var instanceof d80) {
                    xc1Var.e--;
                }
                boolean z = xc1Var3.e > 0;
                boolean z2 = xc1Var2.e > 0;
                boolean z3 = xc1Var.e > 0;
                uv uvVar = (uv) obj2;
                if (uvVar.t != z) {
                    uvVar.t = z;
                    i3 = 1;
                }
                if (uvVar.u != z2) {
                    uvVar.u = z2;
                    i3 = 1;
                }
                if (uvVar.v != z3) {
                    uvVar.v = z3;
                } else {
                    i2 = i3;
                }
                if (i2 != 0) {
                    al.C(uvVar);
                }
                return t32Var;
            default:
                return a((yh0) obj, ksVar);
        }
    }
}
