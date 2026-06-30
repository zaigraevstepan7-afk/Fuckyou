package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n00 extends ne1 implements wa0 {
    public e81 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vc1 k;
    public final /* synthetic */ zc1 l;
    public final /* synthetic */ zc1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(vc1 vc1Var, zc1 zc1Var, zc1 zc1Var2, ks ksVar) {
        super(ksVar);
        this.k = vc1Var;
        this.l = zc1Var;
        this.m = zc1Var2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((n00) o((ks) obj2, (ev1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        n00 n00Var = new n00(this.k, this.l, this.m, ksVar);
        n00Var.j = obj;
        return n00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[EDGE_INSN: B:69:0x00ce->B:45:0x00ce BREAK  A[LOOP:0: B:40:0x00bb->B:44:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ev1 ev1Var;
        int i;
        Object objA;
        e81 e81Var;
        int size;
        int i2;
        int size2;
        int i3;
        Object objA2;
        Object obj2;
        Object obj3;
        int i4 = this.i;
        e81 e81Var2 = null;
        int i5 = 2;
        int i6 = 1;
        wt wtVar = wt.e;
        if (i4 == 0) {
            xc.G(obj);
            ev1Var = (ev1) this.j;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.h;
                ev1Var = (ev1) this.j;
                xc.G(obj);
                objA = obj;
                e81Var = (e81) objA;
                List list = e81Var.a;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List list2 = e81Var.a;
                size2 = list2.size();
                while (i3 < size2) {
                }
                if (e81Var.c != i5) {
                }
                this.j = ev1Var;
                this.g = e81Var;
                this.h = i;
                this.i = i5;
                objA2 = ev1Var.a(f81.g, this);
                if (objA2 != wtVar) {
                }
                return wtVar;
            }
            if (i4 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.h;
            e81 e81Var3 = this.g;
            ev1 ev1Var2 = (ev1) this.j;
            xc.G(obj);
            int i7 = 1;
            objA2 = obj;
            List list3 = ((e81) objA2).a;
            int size3 = list3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((l81) list3.get(i8)).c()) {
                    i = i7;
                    break;
                }
                i8++;
            }
            zc1 zc1Var = this.l;
            boolean zE = s00.e(e81Var3, ((l81) zc1Var.e).a);
            List list4 = e81Var3.a;
            zc1 zc1Var2 = this.m;
            if (!zE) {
                int size4 = list4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = e81Var2;
                        break;
                    }
                    obj3 = list4.get(i9);
                    if (((l81) obj3).d) {
                        break;
                    }
                    i9++;
                }
                l81 l81Var = (l81) obj3;
                if (l81Var == null) {
                    i = i7;
                    i6 = i;
                    ev1Var = ev1Var2;
                    if (i != 0) {
                        return t32.a;
                    }
                    this.j = ev1Var;
                    this.g = e81Var2;
                    this.h = i;
                    this.i = i6;
                    objA = ev1Var.a(f81.f, this);
                    if (objA != wtVar) {
                        e81Var = (e81) objA;
                        List list5 = e81Var.a;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i6;
                                break;
                            }
                            if (!lk.t((l81) list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List list22 = e81Var.a;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            l81 l81Var2 = (l81) list22.get(i3);
                            if (l81Var2.c() || lk.T(l81Var2, ev1Var.j.B, ev1Var.c())) {
                                break;
                            }
                        }
                        if (e81Var.c != i5) {
                            i7 = 1;
                            this.k.e = true;
                            i = 1;
                        } else {
                            i7 = 1;
                        }
                        this.j = ev1Var;
                        this.g = e81Var;
                        this.h = i;
                        this.i = i5;
                        objA2 = ev1Var.a(f81.g, this);
                        if (objA2 != wtVar) {
                            ev1Var2 = ev1Var;
                            e81Var3 = e81Var;
                            List list32 = ((e81) objA2).a;
                            int size32 = list32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            zc1 zc1Var3 = this.l;
                            boolean zE2 = s00.e(e81Var3, ((l81) zc1Var3.e).a);
                            List list42 = e81Var3.a;
                            zc1 zc1Var22 = this.m;
                            if (!zE2) {
                                int size5 = list42.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list42.get(i10);
                                    if (al.v(((l81) obj2).a, ((l81) zc1Var3.e).a)) {
                                        break;
                                    }
                                    i10++;
                                }
                                zc1Var22.e = obj2;
                            }
                        }
                    }
                    return wtVar;
                }
                zc1Var3.e = l81Var;
                zc1Var22.e = l81Var;
            }
            ev1Var = ev1Var2;
            e81Var2 = null;
            i5 = 2;
            i6 = 1;
            if (i != 0) {
            }
        }
    }
}
