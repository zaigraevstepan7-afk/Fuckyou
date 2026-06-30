package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w91 implements an0 {
    public final int e;
    public final oc f;
    public final sa0 g;
    public kr h;
    public iu1 i;
    public dm0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Object n;
    public boolean o;
    public v91 p;
    public boolean q;
    public long r;
    public long s;
    public long t = yv0.a();
    public boolean u;
    public final /* synthetic */ tk0 v;

    public w91(tk0 tk0Var, int i, oc ocVar, mt mtVar) {
        this.v = tk0Var;
        this.e = i;
        this.f = ocVar;
        this.g = mtVar;
    }

    @Override // defpackage.an0
    public final void a() {
        this.q = true;
    }

    public final void b() {
        dm0 dm0Var = this.j;
        if (dm0Var != null) {
            switch (dm0Var.a) {
                case 0:
                    break;
                default:
                    wl0 wl0VarB = dm0Var.b();
                    if ((wl0VarB != null ? wl0VarB.f : null) != null) {
                        em0.c(dm0Var.b, dm0Var.c);
                    }
                    break;
            }
        }
        this.j = null;
        iu1 iu1Var = this.i;
        if (iu1Var != null) {
            iu1Var.a();
        }
        this.i = null;
        this.p = null;
    }

    public final boolean c(n7 n7Var) {
        boolean zD;
        if (!this.v.a) {
            return false;
        }
        if (this.q) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(n7Var);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(n7Var);
        }
        c2.w("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.an0
    public final void cancel() {
        if (this.l) {
            return;
        }
        this.l = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0246  */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(n7 n7Var) {
        long j;
        boolean z;
        List[] listArr;
        w91 w91Var;
        ?? r9;
        int i;
        List list;
        int i2;
        boolean z2;
        List[] listArr2;
        iu1 iu1VarF;
        int i3 = this.e;
        long j2 = i3;
        c2.w("compose:lazy:prefetch:execute:item", j2);
        kn0 kn0Var = (kn0) ((sm0) this.v.b).b.a();
        if (!this.l) {
            int iC = kn0Var.c();
            if (i3 >= 0 && i3 < iC) {
                Object objD = kn0Var.d(i3);
                Object obj = this.n;
                if (obj != null && !objD.equals(obj)) {
                    b();
                    return false;
                }
                kn0Var.b(i3);
                oc ocVar = this.f;
                he heVar = (he) ocVar.c;
                w91 w91Var2 = null;
                if (ocVar.b != null || heVar == null) {
                    zx0 zx0Var = (zx0) ocVar.a;
                    Object objG = zx0Var.g(null);
                    Object obj2 = objG;
                    if (objG == null) {
                        he heVar2 = new he();
                        heVar2.e = -1;
                        zx0Var.m(null, heVar2);
                        obj2 = heVar2;
                    }
                    heVar = (he) obj2;
                    ocVar.b = null;
                    ocVar.c = heVar;
                }
                e();
                long jA = n7Var.a();
                this.r = jA;
                this.t = yv0.a();
                this.s = 0L;
                c2.w("compose:lazy:prefetch:available_time_nanos", jA);
                if (e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.r, heVar.a + heVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objD, null, heVar);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.j != null) {
                    if (!g(this.r, heVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        dm0 dm0Var = this.j;
                        if (dm0Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (dm0Var.a) {
                            case 0:
                                iu1VarF = dm0Var.b.f(dm0Var.c);
                                break;
                            default:
                                em0 em0Var = dm0Var.b;
                                wl0 wl0VarB = dm0Var.b();
                                if (wl0VarB != null) {
                                    em0Var.d(wl0VarB, false);
                                }
                                iu1VarF = em0Var.f(dm0Var.c);
                                break;
                        }
                        this.i = iu1VarF;
                        this.j = null;
                        this.m = true;
                        Trace.endSection();
                        h();
                        heVar.c = he.a(this.s, heVar.c);
                    } finally {
                    }
                }
                if (!this.o) {
                    if (this.r <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        iu1 iu1Var = this.i;
                        if (iu1Var == null) {
                            throw s91.v("Should precompose before resolving nested prefetch states");
                        }
                        zc1 zc1Var = new zc1();
                        iu1Var.b(new rk(1, zc1Var));
                        List list2 = (List) zc1Var.e;
                        this.p = list2 != null ? new v91(this, list2) : null;
                        this.o = true;
                    } finally {
                    }
                }
                v91 v91Var = this.p;
                if (v91Var != null) {
                    int i4 = heVar.e;
                    boolean z3 = this.q;
                    List[] listArr3 = v91Var.b;
                    int i5 = v91Var.c;
                    List list3 = v91Var.a;
                    if (i5 < list3.size()) {
                        if (v91Var.f.l) {
                            qg0.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((bn0) list3.get(i6)).d = i4;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (v91Var.c < list3.size()) {
                                try {
                                    if (listArr3[v91Var.c] != null) {
                                        z = z3;
                                        listArr = listArr3;
                                        w91Var = w91Var2;
                                    } else {
                                        if (n7Var.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i7 = v91Var.c;
                                        bn0 bn0Var = (bn0) list3.get(i7);
                                        rn0 rn0Var = bn0Var.a;
                                        if (rn0Var == null) {
                                            list = f40.e;
                                            i = i7;
                                            z = z3;
                                            listArr = listArr3;
                                            w91Var = w91Var2;
                                        } else {
                                            int i8 = bn0Var.d;
                                            ArrayList arrayList = new ArrayList();
                                            int i9 = rn0Var.e;
                                            sp1 sp1VarL = uc1.l();
                                            i = i7;
                                            uc1.B(sp1VarL, uc1.u(sp1VarL), sp1VarL != null ? sp1VarL.e() : null);
                                            if (i8 == -1) {
                                                i8 = 2;
                                            }
                                            int i10 = 0;
                                            while (i10 < i8) {
                                                int i11 = i9 + i10;
                                                tk0 tk0Var = bn0Var.c;
                                                if (tk0Var == null) {
                                                    i2 = i10;
                                                    z2 = z3;
                                                    listArr2 = listArr3;
                                                } else {
                                                    i2 = i10;
                                                    z2 = z3;
                                                    listArr2 = listArr3;
                                                    arrayList.add(new w91(tk0Var, i11, bn0Var.b, null));
                                                }
                                                i10 = i2 + 1;
                                                z3 = z2;
                                                listArr3 = listArr2;
                                            }
                                            z = z3;
                                            listArr = listArr3;
                                            w91Var = null;
                                            bn0Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list4 = listArr[v91Var.c];
                                    list4.getClass();
                                    while (v91Var.d < list4.size()) {
                                        w91 w91Var3 = (w91) list4.get(v91Var.d);
                                        if (z) {
                                            w91 w91Var4 = w91Var3 != null ? w91Var3 : w91Var;
                                            if (w91Var4 != null) {
                                                r9 = 1;
                                                w91Var4.q = true;
                                            }
                                        } else {
                                            r9 = 1;
                                        }
                                        v91Var.e = r9;
                                        if (w91Var3.c(n7Var)) {
                                            return r9;
                                        }
                                        v91Var.d += r9;
                                    }
                                    v91Var.d = 0;
                                    v91Var.c++;
                                    w91Var2 = w91Var;
                                    z3 = z;
                                    listArr3 = listArr;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                v91 v91Var2 = this.p;
                if (v91Var2 != null && v91Var2.e) {
                    h();
                    c2.w("compose:lazy:prefetch:execute:item", j2);
                    v91 v91Var3 = this.p;
                    if (v91Var3 != null) {
                        v91Var3.e = false;
                    }
                }
                kr krVar = this.h;
                if (!this.k && krVar != null) {
                    if (!g(this.r, heVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = krVar.a;
                        if (this.l) {
                            qg0.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.k) {
                            qg0.a("Request was already measured!");
                        }
                        this.k = true;
                        iu1 iu1Var2 = this.i;
                        if (iu1Var2 == null) {
                            throw s91.v("performComposition() must be called before performMeasure()");
                        }
                        int iC2 = iu1Var2.c();
                        for (int i12 = 0; i12 < iC2; i12++) {
                            iu1Var2.d(i12, j3);
                        }
                        Trace.endSection();
                        h();
                        heVar.d = he.a(this.s, heVar.d);
                        sa0 sa0Var = this.g;
                        if (sa0Var != null) {
                            sa0Var.i(this);
                        }
                    } finally {
                    }
                }
                v91 v91Var4 = this.p;
                if (!this.k || !this.o || v91Var4 == null) {
                    return false;
                }
                List list5 = v91Var4.a;
                int size2 = list5.size();
                int iMin = Integer.MAX_VALUE;
                for (int i13 = 0; i13 < size2; i13++) {
                    iMin = Math.min(iMin, ((bn0) list5.get(i13)).e);
                }
                if (iMin == Integer.MAX_VALUE) {
                    iMin = 0;
                }
                int i14 = heVar.e;
                heVar.e = i14 == -1 ? iMin : ((i14 * 3) + iMin) / 4;
                int size3 = list5.size();
                int iMin2 = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size3; i15++) {
                    iMin2 = Math.min(iMin2, ((bn0) list5.get(i15)).f);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    iMin2 = 0;
                }
                if (iMin2 >= iMin) {
                    return false;
                }
                heVar.d = 0L;
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        dm0 dm0Var;
        return this.m || ((dm0Var = this.j) != null && dm0Var.c());
    }

    public final void f(Object obj, Object obj2, final he heVar) {
        dm0 dm0Var;
        dm0 dm0Var2 = this.j;
        int i = 0;
        if (dm0Var2 == null) {
            tk0 tk0Var = this.v;
            wa0 wa0VarA = ((sm0) tk0Var.b).a(this.e, obj, obj2);
            em0 em0VarA = ((ku1) tk0Var.c).a();
            if (em0VarA.e.J()) {
                em0VarA.k(obj, wa0VarA, true);
                dm0Var = new dm0(em0VarA, obj, 1);
            } else {
                dm0Var = new dm0(em0VarA, obj, i);
            }
            dm0Var2 = dm0Var;
            this.j = dm0Var2;
            this.n = obj;
        }
        this.u = false;
        while (!dm0Var2.c() && !this.u) {
            yn1 yn1Var = new yn1() { // from class: u91
                @Override // defpackage.yn1
                public final boolean a() {
                    w91 w91Var = this.e;
                    if (!w91Var.u) {
                        w91Var.h();
                        long j = w91Var.s;
                        he heVar2 = heVar;
                        heVar2.a = he.a(j, heVar2.a);
                        w91Var.u = !w91Var.g(w91Var.r, r1 + heVar2.b);
                    }
                    return w91Var.u;
                }
            };
            switch (dm0Var2.a) {
                case 0:
                    break;
                default:
                    wl0 wl0VarB = dm0Var2.b();
                    v51 v51Var = wl0VarB != null ? wl0VarB.f : null;
                    if (v51Var != null && !v51Var.c()) {
                        sp1 sp1VarL = uc1.l();
                        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1 sp1VarU = uc1.u(sp1VarL);
                        try {
                            v51Var.e(yn1Var);
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.u;
        long j = this.s;
        if (z) {
            heVar.b = he.a(j, heVar.b);
        } else {
            heVar.a = he.a(j, heVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.q) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jZ;
        long jA = yv0.a();
        long j = this.t;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jZ = (1 | (jA - 1)) == Long.MAX_VALUE ? xk.z(jA) : xk.N(jA, j);
        } else if (jA == j) {
            wr wrVar = z10.e;
            jZ = 0;
        } else {
            long jZ2 = xk.z(j);
            wr wrVar2 = z10.e;
            jZ = ((-(jZ2 >> 1)) << 1) + ((long) (((int) jZ2) & 1));
            int i = b20.a;
        }
        long j3 = jZ >> 1;
        wr wrVar3 = z10.e;
        if ((((int) jZ) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.s = j2;
        long j4 = this.r - j2;
        this.r = j4;
        this.t = jA;
        c2.w("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.e + ", constraints = " + this.h + ", isComposed = " + e() + ", isMeasured = " + this.k + ", isCanceled = " + this.l + " }";
    }
}
