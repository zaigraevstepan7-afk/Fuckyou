package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r70 implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r70(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(pz pzVar, ks ksVar) {
        br0 br0Var;
        if (ksVar instanceof br0) {
            br0Var = (br0) ksVar;
            int i = br0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                br0Var.k = i - Integer.MIN_VALUE;
            } else {
                br0Var = new br0(this, ksVar);
            }
        }
        Object obj = br0Var.i;
        int i2 = br0Var.k;
        if (i2 == 0) {
            xc.G(obj);
            ya1 ya1Var = (ya1) this.f;
            bs1 bs1Var = new bs1(pzVar);
            br0Var.h = pzVar;
            br0Var.k = 1;
            Object objC = ya1Var.j.c(br0Var, bs1Var);
            wt wtVar = wt.e;
            if (objC == wtVar) {
                return wtVar;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pzVar = br0Var.h;
            xc.G(obj);
        }
        if (pzVar instanceof mz) {
            ((zc1) this.g).e = ((mz) pzVar).a;
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0262  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) {
        q70 q70Var;
        u70 u70Var;
        Object obj2 = obj;
        int i = this.e;
        wt wtVar = wt.e;
        int i2 = 0;
        ks ksVar2 = null;
        t32 t32Var = t32.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                if (ksVar instanceof q70) {
                    q70Var = (q70) ksVar;
                    int i3 = q70Var.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q70Var.i = i3 - Integer.MIN_VALUE;
                    } else {
                        q70Var = new q70(this, ksVar);
                    }
                }
                Object objH = q70Var.h;
                int i4 = q70Var.i;
                if (i4 == 0) {
                    xc.G(objH);
                    q70Var.k = obj2;
                    q70Var.l = 0;
                    q70Var.i = 1;
                    objH = ((xu) obj4).h(obj2, q70Var);
                    if (objH == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            xc.G(objH);
                            return t32Var;
                        }
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = q70Var.l;
                    obj2 = q70Var.k;
                    xc.G(objH);
                }
                if (!((Boolean) objH).booleanValue()) {
                    throw new a(this);
                }
                q70Var.k = null;
                q70Var.l = i2;
                q70Var.i = 2;
                if (((g70) obj3).l(obj2, q70Var) == wtVar) {
                    return wtVar;
                }
                return t32Var;
            case 1:
                if (ksVar instanceof u70) {
                    u70Var = (u70) ksVar;
                    int i5 = u70Var.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        u70Var.i = i5 - Integer.MIN_VALUE;
                    } else {
                        u70Var = new u70(this, ksVar);
                    }
                }
                Object objH2 = u70Var.h;
                int i6 = u70Var.i;
                if (i6 == 0) {
                    xc.G(objH2);
                    u70Var.k = obj2;
                    u70Var.i = 1;
                    objH2 = ((wa0) obj4).h(obj2, u70Var);
                    if (objH2 == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i6 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = u70Var.k;
                    xc.G(objH2);
                }
                if (!((Boolean) objH2).booleanValue()) {
                    return t32Var;
                }
                ((zc1) obj3).e = obj2;
                throw new a(this);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                yh0 yh0Var = (yh0) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (yh0Var instanceof c80) {
                    arrayList.add(yh0Var);
                } else if (yh0Var instanceof d80) {
                    arrayList.remove(((d80) yh0Var).a);
                }
                boolean z = !arrayList.isEmpty();
                sf0 sf0Var = (sf0) obj3;
                if (z != sf0Var.y) {
                    sf0Var.y = z;
                    sf0Var.P0();
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return a((pz) obj2, ksVar);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vt vtVar = (vt) obj3;
                yh0 yh0Var2 = (yh0) obj2;
                q7 q7Var = (q7) obj4;
                v41 v41Var = q7Var.F;
                if (yh0Var2 instanceof qa1) {
                    if (q7Var.z) {
                        q7Var.L0((qa1) yh0Var2);
                    } else {
                        q7Var.A.a(yh0Var2);
                    }
                }
                ((Boolean) v41Var.getValue()).getClass();
                ArrayList arrayList2 = q7Var.C;
                if (yh0Var2 instanceof ce0) {
                    arrayList2.add(yh0Var2);
                } else if (yh0Var2 instanceof de0) {
                    arrayList2.remove(((de0) yh0Var2).a);
                } else if (yh0Var2 instanceof c80) {
                    arrayList2.add(yh0Var2);
                    v41Var.setValue(Boolean.TRUE);
                } else if (yh0Var2 instanceof d80) {
                    arrayList2.remove(((d80) yh0Var2).a);
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            v41Var.setValue(Boolean.FALSE);
                        } else if (!(((yh0) arrayList2.get(i7)) instanceof c80)) {
                            i7++;
                        }
                    }
                } else if (yh0Var2 instanceof b10) {
                    arrayList2.add(yh0Var2);
                } else {
                    if (!(yh0Var2 instanceof c10)) {
                        if (yh0Var2 instanceof a10) {
                            arrayList2.remove(((a10) yh0Var2).a);
                        }
                        return t32Var;
                    }
                    arrayList2.remove(((c10) yh0Var2).a);
                }
                yh0 yh0Var3 = (yh0) pl.j0(arrayList2);
                uf1 uf1Var = (uf1) q7Var.w.a();
                if (!xi0.o(q7Var.D, yh0Var3)) {
                    if (yh0Var3 != null) {
                        boolean z2 = yh0Var3 instanceof ce0;
                        float f = 0.0f;
                        if (z2) {
                            if (uf1Var.c instanceof rf1) {
                                f = 0.08f;
                            }
                        } else if (yh0Var3 instanceof c80) {
                            if (uf1Var.b instanceof pf1) {
                                f = 0.1f;
                            }
                        } else if ((yh0Var3 instanceof b10) && (uf1Var.d instanceof nf1)) {
                            f = 0.16f;
                        }
                        q22 q22Var = if1.a;
                        if (!z2 && ((yh0Var3 instanceof c80) || (yh0Var3 instanceof b10))) {
                            q22Var = new q22(45, 0, k20.b);
                        }
                        nu0.A(vtVar, null, null, new lf1(q7Var, f, q22Var, null), 3);
                    } else {
                        yh0 yh0Var4 = q7Var.D;
                        q22 q22Var2 = if1.a;
                        if (!(yh0Var4 instanceof ce0) && !(yh0Var4 instanceof c80) && (yh0Var4 instanceof b10)) {
                            q22Var2 = new q22(150, 0, k20.b);
                        }
                        nu0.A(vtVar, null, null, new e(q7Var, q22Var2, ksVar2, 27), 3);
                    }
                    nu0.A(vtVar, null, null, new tv(q7Var, ksVar2, 11), 3);
                    q7Var.D = yh0Var3;
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                long j = ((w01) obj2).a;
                h9 h9Var = (h9) obj4;
                if ((((w01) h9Var.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((w01) h9Var.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objF = h9Var.f(ksVar, new w01(j));
                    return objF == wtVar ? objF : t32Var;
                }
                nu0.A((vt) obj3, null, null, new jl1(h9Var, j, (ks) null), 3);
                return t32Var;
            default:
                yh0 yh0Var5 = (yh0) obj2;
                xc1 xc1Var = (xc1) obj4;
                if (yh0Var5 instanceof oa1) {
                    xc1Var.e++;
                } else if ((yh0Var5 instanceof pa1) || (yh0Var5 instanceof na1)) {
                    xc1Var.e--;
                }
                boolean z3 = xc1Var.e > 0;
                v02 v02Var = (v02) obj3;
                if (v02Var.v != z3) {
                    v02Var.v = z3;
                    el.D(v02Var);
                }
                return t32Var;
        }
    }
}
