package defpackage;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 extends zu1 implements xa0 {
    public List i;
    public List j;
    public List k;
    public ay0 l;
    public ay0 m;
    public ay0 n;
    public Set o;
    public ay0 p;
    public int q;
    public /* synthetic */ y8 r;
    public final /* synthetic */ jc1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(jc1 jc1Var, ks ksVar) {
        super(3, ksVar);
        this.s = jc1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(jc1 jc1Var, List list, List list2, List list3, ay0 ay0Var, ay0 ay0Var2, ay0 ay0Var3, ay0 ay0Var4) {
        char c;
        long j;
        long j2;
        synchronized (jc1Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    tp tpVar = (tp) list3.get(i);
                    tpVar.a();
                    jc1Var.L(tpVar);
                }
                list3.clear();
                Object[] objArr = ay0Var.b;
                long[] jArr = ay0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    tp tpVar2 = (tp) objArr[(i2 << 3) + i4];
                                    tpVar2.a();
                                    jc1Var.L(tpVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                ay0Var.b();
                Object[] objArr2 = ay0Var2.b;
                long[] jArr2 = ay0Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((tp) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                ay0Var2.b();
                ay0Var3.b();
                Object[] objArr3 = ay0Var4.b;
                long[] jArr3 = ay0Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    tp tpVar3 = (tp) objArr3[(i8 << 3) + i10];
                                    tpVar3.a();
                                    jc1Var.L(tpVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                ay0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void t(List list, jc1 jc1Var) {
        list.clear();
        synchronized (jc1Var.c) {
            try {
                ArrayList arrayList = jc1Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((sw0) arrayList.get(i));
                }
                jc1Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        ic1 ic1Var = new ic1(this.s, (ks) obj3);
        ic1Var.r = (y8) obj2;
        ic1Var.q(t32.a);
        return wt.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        y8 y8Var;
        ay0 ay0Var;
        ay0 ay0Var2;
        List list;
        Set set;
        final List list2;
        ay0 ay0Var3;
        List list3;
        ay0 ay0Var4;
        final List list4;
        final ay0 ay0Var5;
        final List list5;
        final ay0 ay0Var6;
        jc1 jc1Var;
        Object objT;
        xi xiVar;
        wt wtVar;
        y8 y8Var2;
        sx0 sx0Var;
        wt wtVar2 = wt.e;
        int i = this.q;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            xc.G(obj);
            y8Var = this.r;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ay0 ay0Var7 = qi1.a;
            ay0Var = new ay0();
            ay0 ay0Var8 = new ay0();
            ay0 ay0Var9 = new ay0();
            ri1 ri1Var = new ri1(ay0Var9);
            ay0Var2 = new ay0();
            list = arrayList;
            set = ri1Var;
            list2 = arrayList2;
            ay0Var3 = ay0Var9;
            list3 = arrayList3;
            ay0Var4 = ay0Var8;
            synchronized (this.s.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ay0 ay0Var10 = this.p;
                set = this.o;
                ay0Var3 = this.n;
                ay0Var4 = this.m;
                ay0Var = this.l;
                list3 = this.k;
                list2 = this.j;
                list = this.i;
                y8 y8Var3 = this.r;
                xc.G(obj);
                ay0Var2 = ay0Var10;
                y8Var = y8Var3;
                jc1 jc1Var2 = this.s;
                synchronized (jc1Var2.c) {
                    try {
                        if (jc1Var2.l.j()) {
                            sx0 sx0VarB = bx0.b(jc1Var2.l);
                            jc1Var2.l.a();
                            xg0 xg0Var = jc1Var2.m;
                            ((zx0) xg0Var.f).a();
                            ((zx0) xg0Var.g).a();
                            jc1Var2.o.a();
                            sx0Var = new sx0(sx0VarB.b);
                            Object[] objArr = sx0VarB.a;
                            int i4 = sx0VarB.b;
                            wtVar = wtVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                sw0 sw0Var = (sw0) objArr[i5];
                                sx0Var.a(new j41(sw0Var, jc1Var2.n.g(sw0Var)));
                                i5 = i6 + 1;
                                y8Var = y8Var;
                                objArr = objArr;
                            }
                            y8Var2 = y8Var;
                            jc1Var2.n.a();
                        } else {
                            wtVar = wtVar2;
                            y8Var2 = y8Var;
                            sx0Var = s01.b;
                            sx0Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = sx0Var.a;
                int i7 = sx0Var.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    j41 j41Var = (j41) objArr2[i8];
                }
                oc ocVar = this.s.b;
                ((xd) ocVar.a).set(0);
                ((me) ocVar.b).f(new mt(20));
                wtVar2 = wtVar;
                y8Var = y8Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.s.c) {
                }
                jc1 jc1Var3 = this.s;
                this.r = y8Var;
                this.i = list;
                this.j = list2;
                this.k = list3;
                this.l = ay0Var;
                this.m = ay0Var4;
                this.n = ay0Var3;
                this.o = set;
                this.p = ay0Var2;
                this.q = i3;
                if (jc1Var3.C()) {
                    objT = t32.a;
                } else {
                    xi xiVar2 = new xi(i3, bl.E(this));
                    xiVar2.v();
                    synchronized (jc1Var3.c) {
                        if (jc1Var3.C()) {
                            xiVar = xiVar2;
                        } else {
                            jc1Var3.r = xiVar2;
                            xiVar = null;
                        }
                    }
                    if (xiVar != null) {
                        xiVar.g(t32.a);
                    }
                    objT = xiVar2.t();
                    if (objT != wt.e) {
                        objT = t32.a;
                    }
                }
                if (objT != wtVar2) {
                    List list6 = list;
                    ay0Var5 = ay0Var;
                    ay0Var6 = ay0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final ay0 ay0Var11 = ay0Var4;
                    final ay0 ay0Var12 = ay0Var3;
                    jc1Var = this.s;
                    qs1 qs1Var = jc1.z;
                    if (jc1Var.K()) {
                        List list7 = list4;
                        ay0Var2 = ay0Var6;
                        ay0Var = ay0Var5;
                        list = list5;
                        list3 = list7;
                        ay0Var3 = ay0Var12;
                        ay0Var4 = ay0Var11;
                        set = set2;
                        synchronized (this.s.c) {
                        }
                    } else {
                        final jc1 jc1Var4 = this.s;
                        sa0 sa0Var = new sa0() { // from class: hc1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
                            /* JADX WARN: Removed duplicated region for block: B:239:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:243:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:272:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
                            /* JADX WARN: Type inference failed for: r11v10 */
                            /* JADX WARN: Type inference failed for: r11v11 */
                            /* JADX WARN: Type inference failed for: r11v2 */
                            /* JADX WARN: Type inference failed for: r11v3, types: [int] */
                            /* JADX WARN: Type inference failed for: r11v4 */
                            /* JADX WARN: Type inference failed for: r11v5, types: [int] */
                            /* JADX WARN: Type inference failed for: r15v10 */
                            /* JADX WARN: Type inference failed for: r15v11 */
                            /* JADX WARN: Type inference failed for: r15v9 */
                            /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
                            /* JADX WARN: Type inference failed for: r4v1 */
                            /* JADX WARN: Type inference failed for: r4v14 */
                            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                            /* JADX WARN: Type inference failed for: r4v3 */
                            /* JADX WARN: Type inference failed for: r4v9 */
                            @Override // defpackage.sa0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object i(Object obj2) {
                                boolean z;
                                Object[] objArr3;
                                sp1 f22Var;
                                sp1 sp1VarJ;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                ?? r15;
                                ay0 ay0Var13;
                                Object[] objArr4;
                                boolean z2;
                                jc1 jc1Var5 = jc1Var4;
                                ay0 ay0Var14 = ay0Var12;
                                ay0 ay0Var15 = ay0Var6;
                                List list12 = list5;
                                List list13 = list2;
                                ay0 ay0Var16 = ay0Var5;
                                ?? r4 = list4;
                                ay0 ay0Var17 = ay0Var11;
                                Set set3 = set2;
                                long jLongValue = ((Long) obj2).longValue();
                                synchronized (jc1Var5.c) {
                                    z = jc1Var5.z();
                                }
                                boolean z3 = false;
                                if (z) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((me) jc1Var5.a.g).f(new g5(1, jLongValue));
                                        synchronized (aq1.c) {
                                            ay0 ay0Var18 = aq1.j.h;
                                            if (ay0Var18 != null) {
                                                z2 = ay0Var18.h();
                                            }
                                        }
                                        if (z2) {
                                            aq1.a();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    jc1Var5.K();
                                    synchronized (jc1Var5.c) {
                                        try {
                                            iy0 iy0Var = jc1Var5.i;
                                            Object[] objArr5 = iy0Var.e;
                                            int i9 = iy0Var.g;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list12.add((tp) objArr5[i10]);
                                            }
                                            jc1Var5.i.g();
                                        } finally {
                                        }
                                    }
                                    ay0Var14.b();
                                    ay0Var15.b();
                                    try {
                                        try {
                                            while (true) {
                                                if (list12.isEmpty() && list13.isEmpty()) {
                                                    break;
                                                }
                                                try {
                                                    int size = list12.size();
                                                    for (int i11 = 0; i11 < size; i11++) {
                                                        tp tpVar = (tp) list12.get(i11);
                                                        tp tpVarI = jc1Var5.I(tpVar, ay0Var14);
                                                        if (tpVarI != null) {
                                                            r4.add(tpVarI);
                                                        }
                                                        ay0Var15.a(tpVar);
                                                    }
                                                    list12.clear();
                                                    if (ay0Var14.h() || jc1Var5.i.g != 0) {
                                                        synchronized (jc1Var5.c) {
                                                            try {
                                                                List listD = jc1Var5.D();
                                                                int size2 = listD.size();
                                                                for (int i12 = 0; i12 < size2; i12++) {
                                                                    tp tpVar2 = (tp) listD.get(i12);
                                                                    if (!ay0Var15.c(tpVar2) && tpVar2.w(set3)) {
                                                                        list12.add(tpVar2);
                                                                    }
                                                                }
                                                                iy0 iy0Var2 = jc1Var5.i;
                                                                int i13 = iy0Var2.g;
                                                                int i14 = 0;
                                                                int i15 = 0;
                                                                while (true) {
                                                                    objArr3 = iy0Var2.e;
                                                                    if (i14 >= i13) {
                                                                        break;
                                                                    }
                                                                    tp tpVar3 = (tp) objArr3[i14];
                                                                    if (!ay0Var15.c(tpVar3) && !list12.contains(tpVar3)) {
                                                                        list12.add(tpVar3);
                                                                        i15++;
                                                                    } else if (i15 > 0) {
                                                                        Object[] objArr6 = iy0Var2.e;
                                                                        objArr6[i14 - i15] = objArr6[i14];
                                                                    }
                                                                    i14++;
                                                                }
                                                                int i16 = i13 - i15;
                                                                Arrays.fill(objArr3, i16, i13, (Object) null);
                                                                iy0Var2.g = i16;
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (list12.isEmpty()) {
                                                        try {
                                                            ic1.t(list13, jc1Var5);
                                                            while (!list13.isEmpty()) {
                                                                List listH = jc1Var5.H(list13, ay0Var14);
                                                                ay0Var16.getClass();
                                                                Iterator it = listH.iterator();
                                                                while (it.hasNext()) {
                                                                    ay0Var16.k(it.next());
                                                                }
                                                                ic1.t(list13, jc1Var5);
                                                            }
                                                        } catch (Throwable th2) {
                                                            jc1Var5.J(th2, null);
                                                            ic1.s(jc1Var5, list12, list13, r4, ay0Var16, ay0Var17, ay0Var14, ay0Var15);
                                                        }
                                                    }
                                                    z3 = false;
                                                } catch (Throwable th3) {
                                                    try {
                                                        jc1Var5.J(th3, null);
                                                        ic1.s(jc1Var5, list12, list13, r4, ay0Var16, ay0Var17, ay0Var14, ay0Var15);
                                                    } finally {
                                                        list12.clear();
                                                    }
                                                }
                                                return t32.a;
                                            }
                                            if (r4.isEmpty()) {
                                                if (ay0Var16.h()) {
                                                }
                                                if (ay0Var17.h()) {
                                                }
                                                f22Var.c();
                                                synchronized (jc1Var5.c) {
                                                }
                                            } else {
                                                try {
                                                    int size3 = r4.size();
                                                    for (?? r11 = z3; r11 < size3; r11++) {
                                                        ay0Var17.a((tp) r4.get(r11));
                                                    }
                                                    int size4 = r4.size();
                                                    for (?? r112 = z3; r112 < size4; r112++) {
                                                        ((tp) r4.get(r112)).d();
                                                    }
                                                    if (ay0Var16.h()) {
                                                        j = 255;
                                                    } else {
                                                        try {
                                                            ay0Var17.j(ay0Var16);
                                                            Object[] objArr7 = ay0Var16.b;
                                                            long[] jArr = ay0Var16.a;
                                                            int length = jArr.length - 2;
                                                            if (length >= 0) {
                                                                int i17 = 0;
                                                                j = 255;
                                                                while (true) {
                                                                    long j2 = jArr[i17];
                                                                    list8 = list12;
                                                                    list9 = list13;
                                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                                            if ((j2 & 255) < 128) {
                                                                                try {
                                                                                    ((tp) objArr7[(i17 << 3) + i19]).f();
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    try {
                                                                                        jc1Var5.J(th, null);
                                                                                        ic1.s(jc1Var5, list8, list9, r4, ay0Var16, ay0Var17, ay0Var14, ay0Var15);
                                                                                        sp1.q(sp1VarJ);
                                                                                        return t32.a;
                                                                                    } finally {
                                                                                        ay0Var16.b();
                                                                                    }
                                                                                }
                                                                            }
                                                                            j2 >>= 8;
                                                                        }
                                                                        if (i18 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i17 == length) {
                                                                            break;
                                                                        }
                                                                        i17++;
                                                                        list12 = list8;
                                                                        list13 = list9;
                                                                    }
                                                                }
                                                            } else {
                                                                list8 = list12;
                                                                list9 = list13;
                                                                j = 255;
                                                            }
                                                            list12 = list8;
                                                            list13 = list9;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            list8 = list12;
                                                            list9 = list13;
                                                        }
                                                    }
                                                    if (ay0Var17.h()) {
                                                        try {
                                                            Object[] objArr8 = ay0Var17.b;
                                                            long[] jArr2 = ay0Var17.a;
                                                            int length2 = jArr2.length - 2;
                                                            if (length2 >= 0) {
                                                                list10 = list12;
                                                                list11 = list13;
                                                                int i20 = 0;
                                                                r4 = r4;
                                                                while (true) {
                                                                    try {
                                                                        long j3 = jArr2[i20];
                                                                        r15 = r4;
                                                                        ay0Var13 = ay0Var16;
                                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                                            int i22 = 0;
                                                                            while (i22 < i21) {
                                                                                if ((j3 & j) < 128) {
                                                                                    try {
                                                                                        ((tp) objArr8[(i20 << 3) + i22]).g();
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        try {
                                                                                            jc1Var5.J(th, null);
                                                                                            ic1.s(jc1Var5, list10, list11, r15, ay0Var13, ay0Var17, ay0Var14, ay0Var15);
                                                                                            return t32.a;
                                                                                        } finally {
                                                                                            ay0Var17.b();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j3 >>= 8;
                                                                                i22++;
                                                                                objArr8 = objArr8;
                                                                            }
                                                                            objArr4 = objArr8;
                                                                            if (i21 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            objArr4 = objArr8;
                                                                        }
                                                                        if (i20 == length2) {
                                                                            break;
                                                                        }
                                                                        i20++;
                                                                        ay0Var16 = ay0Var13;
                                                                        r4 = r15;
                                                                        objArr8 = objArr4;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        r15 = r4;
                                                                        ay0Var13 = ay0Var16;
                                                                        jc1Var5.J(th, null);
                                                                        ic1.s(jc1Var5, list10, list11, r15, ay0Var13, ay0Var17, ay0Var14, ay0Var15);
                                                                        return t32.a;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            list10 = list12;
                                                            list11 = list13;
                                                        }
                                                    }
                                                    f22Var.c();
                                                    synchronized (jc1Var5.c) {
                                                        if (jc1Var5.y() != null) {
                                                            mp.a("unexpected to get continuation here");
                                                        }
                                                    }
                                                    aq1.j().m();
                                                    ay0Var15.b();
                                                    ay0Var14.b();
                                                    jc1Var5.q = null;
                                                } catch (Throwable th9) {
                                                    try {
                                                        jc1Var5.J(th9, null);
                                                        ic1.s(jc1Var5, list12, list13, r4, ay0Var16, ay0Var17, ay0Var14, ay0Var15);
                                                        sp1.q(sp1VarJ);
                                                        return t32.a;
                                                    } finally {
                                                        r4.clear();
                                                    }
                                                }
                                            }
                                            return t32.a;
                                        } finally {
                                            sp1.q(sp1VarJ);
                                        }
                                        sp1VarJ = f22Var.j();
                                    } finally {
                                        f22Var.c();
                                    }
                                    sp1 sp1VarJ2 = aq1.j();
                                    f22Var = sp1VarJ2 instanceof ey0 ? new f22((ey0) sp1VarJ2, null, null, true, false) : new g22(sp1VarJ2, null, true, z3);
                                } finally {
                                }
                            }
                        };
                        this.r = y8Var;
                        this.i = list5;
                        this.j = list2;
                        this.k = list4;
                        this.l = ay0Var5;
                        this.m = ay0Var11;
                        this.n = ay0Var12;
                        this.o = set2;
                        this.p = ay0Var6;
                        this.q = i2;
                        if (y8Var.c(sa0Var, this) != wtVar2) {
                            List list8 = list4;
                            ay0Var2 = ay0Var6;
                            ay0Var = ay0Var5;
                            list = list5;
                            list3 = list8;
                            ay0Var3 = ay0Var12;
                            ay0Var4 = ay0Var11;
                            set = set2;
                            jc1 jc1Var22 = this.s;
                            synchronized (jc1Var22.c) {
                            }
                        }
                    }
                }
                return wtVar2;
            }
            ay0 ay0Var13 = this.p;
            set = this.o;
            ay0Var3 = this.n;
            ay0Var4 = this.m;
            ay0 ay0Var14 = this.l;
            List list9 = this.k;
            list2 = this.j;
            List list10 = this.i;
            y8 y8Var4 = this.r;
            xc.G(obj);
            ay0Var6 = ay0Var13;
            y8Var = y8Var4;
            list4 = list9;
            list5 = list10;
            ay0Var5 = ay0Var14;
            final Set set22 = set;
            final ay0 ay0Var112 = ay0Var4;
            final ay0 ay0Var122 = ay0Var3;
            jc1Var = this.s;
            qs1 qs1Var2 = jc1.z;
            if (jc1Var.K()) {
            }
        }
    }
}
