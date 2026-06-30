package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 extends ne1 implements wa0 {
    public final /* synthetic */ int g = 1;
    public int h;
    public /* synthetic */ Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk1(g6 g6Var, go1 go1Var, ex1 ex1Var, ks ksVar) {
        super(ksVar);
        this.j = g6Var;
        this.k = go1Var;
        this.l = ex1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.g;
        t32 t32Var = t32.a;
        ev1 ev1Var = (ev1) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((zk1) o(ksVar, ev1Var)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.g;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                zk1 zk1Var = new zk1((g6) this.j, (go1) this.k, (ex1) obj2, ksVar);
                zk1Var.i = obj;
                return zk1Var;
            default:
                zk1 zk1Var2 = new zk1((cu1) obj2, ksVar);
                zk1Var2.i = obj;
                return zk1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x01be, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00b6, B:24:0x0095], limit reached: 239 */
    /* JADX WARN: Path cross not found for [B:32:0x00bb, B:35:0x00c1], limit reached: 239 */
    /* JADX WARN: Path cross not found for [B:60:0x012e, B:55:0x0118], limit reached: 239 */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0243 -> B:140:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:40:0x00d6). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ev1 ev1Var;
        Object objH;
        boolean zA;
        ev1 ev1Var2;
        Object objA;
        boolean z;
        ev1 ev1Var3;
        f81 f81Var;
        l81 l81Var;
        Object objA2;
        int size;
        int i;
        f81 f81Var2;
        Object obj2;
        l81 l81Var2;
        l81 l81Var3;
        ev1 ev1Var4;
        int i2;
        f81 f81Var3;
        Object objA3;
        int size2;
        int i3;
        Object obj3;
        l81 l81Var4;
        int i4 = this.g;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        Object obj4 = this.l;
        switch (i4) {
            case 0:
                g6 g6Var = (g6) this.j;
                int i5 = this.h;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ev1Var = (ev1) this.i;
                        xc.G(obj);
                        objH = obj;
                    } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                        xc.G(obj);
                    } else {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    xc.G(obj);
                    ev1Var = (ev1) this.i;
                    this.i = ev1Var;
                    this.h = 1;
                    objH = af1.h(ev1Var, this);
                    if (objH == wtVar) {
                    }
                }
                e81 e81Var = (e81) objH;
                j62 j62Var = (j62) g6Var.b;
                l81 l81Var5 = (l81) g6Var.c;
                l81 l81Var6 = (l81) e81Var.a.get(0);
                if (l81Var5 == null || l81Var6.b - l81Var5.b >= j62Var.b()) {
                    g6Var.a = 1;
                    g6Var.c = l81Var6;
                    zA = el1.a(e81Var);
                    if (!zA && (e81Var.d & 33) != 0) {
                        List list = e81Var.a;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            if (((l81) list.get(i6)).c()) {
                                if (!zA) {
                                }
                            }
                        }
                        go1 go1Var = (go1) this.k;
                        this.i = null;
                        this.h = 2;
                        if (af1.y(ev1Var, go1Var, g6Var, e81Var, this) == wtVar) {
                        }
                    } else if (!zA) {
                        int i7 = g6Var.a;
                        ex1 ex1Var = (ex1) obj4;
                        if (i7 == 1) {
                            this.i = null;
                            this.h = 3;
                            if (af1.D(ev1Var, ex1Var, e81Var, this) == wtVar) {
                            }
                        } else {
                            this.i = null;
                            this.h = 4;
                            if (af1.i(ev1Var, ex1Var, e81Var, i7, this) == wtVar) {
                            }
                        }
                    }
                } else {
                    if (w01.c(w01.d(l81Var5.c, l81Var6.c)) < s00.f(j62Var, l81Var5.i)) {
                        g6Var.a++;
                    }
                    g6Var.c = l81Var6;
                    zA = el1.a(e81Var);
                    if (!zA) {
                        if (!zA) {
                        }
                    }
                }
                break;
            default:
                cu1 cu1Var = (cu1) obj4;
                int i8 = this.h;
                f81 f81Var4 = f81.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ev1Var2 = (ev1) this.i;
                        xc.G(obj);
                        objA = obj;
                    } else if (i8 == 2) {
                        f81Var = (f81) this.k;
                        l81Var = (l81) this.j;
                        ev1Var3 = (ev1) this.i;
                        xc.G(obj);
                        objA2 = obj;
                        e81 e81Var2 = (e81) objA2;
                        List list2 = e81Var2.a;
                        size = list2.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                                obj2 = list2.get(i);
                                l81 l81Var7 = (l81) obj2;
                                if (l81Var7.c()) {
                                    i2 = i;
                                    f81Var2 = f81Var4;
                                } else {
                                    f81Var2 = f81Var4;
                                    i2 = i;
                                    if (!al.v(l81Var7.a, l81Var.a) || !l81Var7.d) {
                                    }
                                }
                                i = i2 + 1;
                                f81Var4 = f81Var2;
                            } else {
                                f81Var2 = f81Var4;
                                obj2 = null;
                            }
                        }
                        l81Var2 = (l81) obj2;
                        if (l81Var2 == null || l81Var2.b - l81Var.b >= ev1Var3.f().c() || e81Var2.c == 2) {
                            l81Var2 = null;
                        } else if (w01.c(w01.d(l81Var2.c, l81Var.c)) <= ev1Var3.f().e()) {
                            f81Var4 = f81Var2;
                            this.i = ev1Var3;
                            this.j = l81Var;
                            this.k = f81Var;
                            this.h = 2;
                            objA2 = ev1Var3.a(f81Var, this);
                            if (objA2 == wtVar) {
                            }
                            e81 e81Var22 = (e81) objA2;
                            List list22 = e81Var22.a;
                            size = list22.size();
                            i = 0;
                            while (true) {
                                if (i >= size) {
                                }
                                i = i2 + 1;
                                f81Var4 = f81Var2;
                            }
                            l81Var2 = (l81) obj2;
                            if (l81Var2 == null) {
                                if (w01.c(w01.d(l81Var2.c, l81Var.c)) <= ev1Var3.f().e()) {
                                }
                            }
                            l81Var2 = null;
                        }
                        if (l81Var2 != null) {
                            if (!cu1Var.v) {
                                sv0 sv0VarK = cu1Var.e;
                                iy0 iy0Var = null;
                                while (true) {
                                    if (sv0VarK == null) {
                                        if (!cu1Var.e.r) {
                                            ng0.b("visitChildren called on an unattached node");
                                        }
                                        iy0 iy0Var2 = new iy0(new sv0[16]);
                                        sv0 sv0Var = cu1Var.e;
                                        sv0 sv0Var2 = sv0Var.j;
                                        if (sv0Var2 == null) {
                                            bl.h(iy0Var2, sv0Var);
                                        } else {
                                            iy0Var2.b(sv0Var2);
                                        }
                                        while (true) {
                                            int i9 = iy0Var2.g;
                                            if (i9 != 0) {
                                                sv0 sv0VarK2 = (sv0) iy0Var2.k(i9 - 1);
                                                if ((sv0VarK2.h & 1024) == 0) {
                                                    bl.h(iy0Var2, sv0VarK2);
                                                } else {
                                                    while (true) {
                                                        if (sv0VarK2 == null) {
                                                        }
                                                        if ((sv0VarK2.g & 1024) != 0) {
                                                            iy0 iy0Var3 = null;
                                                            while (sv0VarK2 != null) {
                                                                if (sv0VarK2 instanceof w80) {
                                                                    ((w80) sv0VarK2).S0(7);
                                                                } else {
                                                                    if ((sv0VarK2.g & 1024) != 0 && (sv0VarK2 instanceof yw)) {
                                                                        int i10 = 0;
                                                                        for (sv0 sv0Var3 = ((yw) sv0VarK2).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                                                            if ((sv0Var3.g & 1024) != 0) {
                                                                                i10++;
                                                                                if (i10 == 1) {
                                                                                    sv0VarK2 = sv0Var3;
                                                                                } else {
                                                                                    if (iy0Var3 == null) {
                                                                                        iy0Var3 = new iy0(new sv0[16]);
                                                                                    }
                                                                                    if (sv0VarK2 != null) {
                                                                                        iy0Var3.b(sv0VarK2);
                                                                                        sv0VarK2 = null;
                                                                                    }
                                                                                    iy0Var3.b(sv0Var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i10 == 1) {
                                                                        }
                                                                    }
                                                                    sv0VarK2 = bl.k(iy0Var3);
                                                                }
                                                            }
                                                        } else {
                                                            sv0VarK2 = sv0VarK2.j;
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    } else if (sv0VarK instanceof w80) {
                                        ((w80) sv0VarK).S0(7);
                                    } else {
                                        if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                            int i11 = 0;
                                            for (sv0 sv0Var4 = ((yw) sv0VarK).t; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
                                                if ((sv0Var4.g & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        sv0VarK = sv0Var4;
                                                    } else {
                                                        if (iy0Var == null) {
                                                            iy0Var = new iy0(new sv0[16]);
                                                        }
                                                        if (sv0VarK != null) {
                                                            iy0Var.b(sv0VarK);
                                                            sv0VarK = null;
                                                        }
                                                        iy0Var.b(sv0Var4);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        sv0VarK = bl.k(iy0Var);
                                    }
                                }
                            }
                            cu1Var.u.a();
                            l81Var2.a();
                            l81Var3 = l81Var;
                            ev1Var4 = ev1Var3;
                            this.i = ev1Var4;
                            this.j = l81Var3;
                            this.k = null;
                            this.h = 3;
                            f81Var3 = f81Var2;
                            objA3 = ev1Var4.a(f81Var3, this);
                            if (objA3 == wtVar) {
                            }
                            List list3 = ((e81) objA3).a;
                            size2 = list3.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                }
                                i3++;
                            }
                            l81Var4 = (l81) obj3;
                            if (l81Var4 != null) {
                            }
                        }
                    } else if (i8 == 3) {
                        l81Var3 = (l81) this.j;
                        ev1Var4 = (ev1) this.i;
                        xc.G(obj);
                        objA3 = obj;
                        f81Var3 = f81Var4;
                        List list32 = ((e81) objA3).a;
                        size2 = list32.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                obj3 = list32.get(i3);
                                l81 l81Var8 = (l81) obj3;
                                if (l81Var8.c() || !al.v(l81Var8.a, l81Var3.a) || !l81Var8.d) {
                                    i3++;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        l81Var4 = (l81) obj3;
                        if (l81Var4 != null) {
                            l81Var4.a();
                            f81Var2 = f81Var3;
                            this.i = ev1Var4;
                            this.j = l81Var3;
                            this.k = null;
                            this.h = 3;
                            f81Var3 = f81Var2;
                            objA3 = ev1Var4.a(f81Var3, this);
                            if (objA3 == wtVar) {
                            }
                            List list322 = ((e81) objA3).a;
                            size2 = list322.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                }
                                i3++;
                            }
                            l81Var4 = (l81) obj3;
                            if (l81Var4 != null) {
                            }
                        }
                    } else {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    xc.G(obj);
                    ev1Var2 = (ev1) this.i;
                    this.i = ev1Var2;
                    this.h = 1;
                    objA = xv1.a(ev1Var2, true, f81Var4, this);
                    if (objA == wtVar) {
                    }
                }
                l81 l81Var9 = (l81) objA;
                int i12 = l81Var9.i;
                long j = l81Var9.c;
                if (i12 == 3 || i12 == 4) {
                    int i13 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i13) >= 0.0f && Float.intBitsToFloat(i13) < ((int) (ev1Var2.j.B >> 32))) {
                        int i14 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i14) >= 0.0f && Float.intBitsToFloat(i14) < ((int) (4294967295L & ev1Var2.j.B))) {
                            z = true;
                        }
                        ev1Var3 = ev1Var2;
                        f81Var = (!cu1Var.v || z) ? f81Var4 : f81.f;
                        l81Var = l81Var9;
                        this.i = ev1Var3;
                        this.j = l81Var;
                        this.k = f81Var;
                        this.h = 2;
                        objA2 = ev1Var3.a(f81Var, this);
                        if (objA2 == wtVar) {
                        }
                        e81 e81Var222 = (e81) objA2;
                        List list222 = e81Var222.a;
                        size = list222.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                            }
                            i = i2 + 1;
                            f81Var4 = f81Var2;
                        }
                        l81Var2 = (l81) obj2;
                        if (l81Var2 == null) {
                        }
                        l81Var2 = null;
                        if (l81Var2 != null) {
                        }
                    }
                    z = false;
                    ev1Var3 = ev1Var2;
                    f81Var = (!cu1Var.v || z) ? f81Var4 : f81.f;
                    l81Var = l81Var9;
                    this.i = ev1Var3;
                    this.j = l81Var;
                    this.k = f81Var;
                    this.h = 2;
                    objA2 = ev1Var3.a(f81Var, this);
                    if (objA2 == wtVar) {
                    }
                    e81 e81Var2222 = (e81) objA2;
                    List list2222 = e81Var2222.a;
                    size = list2222.size();
                    i = 0;
                    while (true) {
                        if (i >= size) {
                        }
                        i = i2 + 1;
                        f81Var4 = f81Var2;
                    }
                    l81Var2 = (l81) obj2;
                    if (l81Var2 == null) {
                    }
                    l81Var2 = null;
                    if (l81Var2 != null) {
                    }
                }
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk1(cu1 cu1Var, ks ksVar) {
        super(ksVar);
        this.l = cu1Var;
    }
}
