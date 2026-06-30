package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qq1 {
    public final sa0 a;
    public boolean c;
    public i2 h;
    public pq1 i;
    public final AtomicReference b = new AtomicReference(null);
    public final ud d = new ud(18, this);
    public final n e = new n(29, this);
    public final iy0 f = new iy0(new pq1[16]);
    public final Object g = new Object();
    public long j = -1;

    public qq1(sa0 sa0Var) {
        this.a = sa0Var;
    }

    public final void a() {
        synchronized (this.g) {
            iy0 iy0Var = this.f;
            Object[] objArr = iy0Var.e;
            int i = iy0Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                pq1 pq1Var = (pq1) objArr[i2];
                pq1Var.e.a();
                pq1Var.f.a();
                pq1Var.l.a();
                pq1Var.m.clear();
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        mp.b("Unexpected notification");
                        yc.j();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                iy0 iy0Var = this.f;
                Object[] objArr = iy0Var.e;
                int i = iy0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((pq1) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, sa0 sa0Var, ha0 ha0Var) {
        iy0 iy0Var;
        Object obj2;
        pq1 pq1Var;
        boolean z;
        pq1 pq1Var2;
        long j;
        long j2;
        pq1 pq1Var3;
        sp1 f22Var;
        long j3;
        Object obj3;
        ox0 ox0Var;
        Object obj4;
        int i;
        long j4;
        ox0 ox0Var2;
        long jQ = xc.q();
        synchronized (this.g) {
            iy0Var = this.f;
            Object[] objArr = iy0Var.e;
            int i2 = iy0Var.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((pq1) obj2).a == sa0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            pq1Var = (pq1) obj2;
            z = true;
            if (pq1Var == null) {
                sa0Var.getClass();
                s22.i(1, sa0Var);
                pq1Var = new pq1(sa0Var);
                iy0Var.b(pq1Var);
            }
            pq1Var2 = this.i;
            j = this.j;
        }
        Object obj5 = iy0Var;
        if (j != -1) {
            obj5 = iy0Var;
            if (j != jQ) {
                String name = Thread.currentThread().getName();
                StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
                sb.append(j);
                sb.append("), currentThread={id=");
                sb.append(jQ);
                sb.append(", name=");
                sb.append(name);
                sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                e91.a(sb.toString());
                obj5 = sb;
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = pq1Var;
                    this.j = jQ;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj5;
                }
            }
            n nVar = this.e;
            Object obj6 = pq1Var.b;
            ox0 ox0Var3 = pq1Var.c;
            int i4 = pq1Var.d;
            pq1Var.b = obj;
            pq1Var.c = (ox0) pq1Var.f.g(obj);
            if (pq1Var.d == -1) {
                pq1Var.d = Long.hashCode(aq1.j().g());
            }
            nb0 nb0Var = pq1Var.i;
            iy0 iy0VarR = xc.r();
            try {
                iy0VarR.b(nb0Var);
                if (nVar == null) {
                    ha0Var.a();
                    pq1Var3 = pq1Var;
                } else {
                    sp1 sp1Var = (sp1) aq1.b.h();
                    if (sp1Var instanceof f22) {
                        pq1Var3 = pq1Var;
                        if (((f22) sp1Var).t == xc.q()) {
                            sa0 sa0Var2 = ((f22) sp1Var).r;
                            sa0 sa0Var3 = ((f22) sp1Var).s;
                            try {
                                ((f22) sp1Var).r = aq1.k(nVar, sa0Var2, true);
                                ((f22) sp1Var).s = sa0Var3;
                                ha0Var.a();
                                ((f22) sp1Var).r = sa0Var2;
                                ((f22) sp1Var).s = sa0Var3;
                            } catch (Throwable th2) {
                                ((f22) sp1Var).r = sa0Var2;
                                ((f22) sp1Var).s = sa0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        pq1Var3 = pq1Var;
                    }
                    if (sp1Var == null || (sp1Var instanceof ey0)) {
                        f22Var = new f22(sp1Var instanceof ey0 ? (ey0) sp1Var : null, nVar, null, true, false);
                    } else {
                        f22Var = sp1Var.u(nVar);
                    }
                    try {
                        sp1 sp1VarJ = f22Var.j();
                        try {
                            ha0Var.a();
                            sp1.q(sp1VarJ);
                            f22Var.c();
                        } catch (Throwable th3) {
                            try {
                                sp1.q(sp1VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    f22Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    iy0VarR.k(iy0VarR.g - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                iy0VarR.k(iy0VarR.g - 1);
                pq1 pq1Var4 = pq1Var3;
                Object obj7 = pq1Var4.b;
                obj7.getClass();
                int i5 = pq1Var4.d;
                ox0 ox0Var4 = pq1Var4.c;
                if (ox0Var4 != null) {
                    try {
                        long[] jArr = ox0Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                ox0 ox0Var5 = ox0Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            ox0Var2 = ox0Var5;
                                            Object obj8 = ox0Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = ox0Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    zx0 zx0Var = pq1Var4.e;
                                                    qc1.v(zx0Var, obj8, obj7);
                                                    obj4 = obj7;
                                                    if ((obj8 instanceof qx) && !zx0Var.c(obj8)) {
                                                        qc1.w(pq1Var4.l, obj8);
                                                        pq1Var4.m.remove(obj8);
                                                    }
                                                } else {
                                                    obj4 = obj7;
                                                }
                                                if (z3) {
                                                    ox0Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = pq1Var2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            obj4 = obj7;
                                            i = i8;
                                            j4 = j5;
                                            ox0Var2 = ox0Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        ox0Var5 = ox0Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                        obj7 = obj4;
                                    }
                                    obj3 = obj7;
                                    ox0Var = ox0Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    obj3 = obj7;
                                    ox0Var = ox0Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                ox0Var4 = ox0Var;
                                z = z2;
                                j = j3;
                                obj7 = obj3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                        }
                    }
                }
                pq1Var4.b = obj6;
                pq1Var4.c = ox0Var3;
                pq1Var4.d = i4;
                synchronized (this.g) {
                    this.i = pq1Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                iy0VarR.k(iy0VarR.g - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void d() {
        ud udVar = this.d;
        aq1.e(aq1.a);
        synchronized (aq1.c) {
            aq1.h = pl.k0(aq1.h, udVar);
        }
        this.h = new i2(udVar);
    }
}
