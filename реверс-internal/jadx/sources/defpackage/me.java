package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class me implements n41 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public me(hb hbVar, d02 d02Var, List list, hx hxVar, c90 c90Var) {
        int i;
        int i2;
        List list2;
        hb hbVar2 = hbVar;
        d02 d02Var2 = d02Var;
        this.a = hbVar2;
        this.b = list;
        final int i3 = 0;
        this.c = al.E(new ha0(this) { // from class: ww0
            public final /* synthetic */ me f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                me meVar = this.f;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) meVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((m41) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((m41) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        m41 m41Var = (m41) obj;
                        return Float.valueOf(m41Var != null ? m41Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) meVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((m41) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((m41) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        m41 m41Var2 = (m41) obj;
                        return Float.valueOf(m41Var2 != null ? m41Var2.a.i.c() : 0.0f);
                }
            }
        });
        final int i4 = 1;
        this.d = al.E(new ha0(this) { // from class: ww0
            public final /* synthetic */ me f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i42 = i4;
                Object obj = null;
                int i5 = 1;
                me meVar = this.f;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) meVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((m41) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((m41) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        m41 m41Var = (m41) obj;
                        return Float.valueOf(m41Var != null ? m41Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) meVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((m41) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((m41) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        m41 m41Var2 = (m41) obj;
                        return Float.valueOf(m41Var2 != null ? m41Var2.a.i.c() : 0.0f);
                }
            }
        });
        p41 p41Var = d02Var2.b;
        hb hbVar3 = ib.a;
        ArrayList arrayList = hbVar2.h;
        String str = hbVar2.f;
        f40 f40Var = f40.e;
        List listM0 = arrayList != null ? pl.m0(arrayList, new x80(6)) : f40Var;
        ArrayList arrayList2 = new ArrayList();
        fd fdVar = new fd();
        int size = listM0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            gb gbVar = (gb) listM0.get(i5);
            p41 p41VarA = p41Var.a((p41) gbVar.a);
            int i7 = gbVar.b;
            int i8 = gbVar.c;
            if (i7 > i8) {
                og0.a("Reversed range is not supported");
            }
            while (i6 < i7 && !fdVar.isEmpty()) {
                gb gbVar2 = (gb) fdVar.last();
                List list3 = listM0;
                int i9 = gbVar2.c;
                f40 f40Var2 = f40Var;
                Object obj = gbVar2.a;
                if (i7 < i9) {
                    arrayList2.add(new gb(i6, i7, obj));
                    i6 = i7;
                    listM0 = list3;
                    f40Var = f40Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new gb(i6, i9, obj));
                    i6 = gbVar2.c;
                    while (!fdVar.isEmpty() && i6 == ((gb) fdVar.last()).c) {
                        fdVar.removeLast();
                    }
                    listM0 = list3;
                    f40Var = f40Var2;
                    size = i10;
                }
            }
            List list4 = listM0;
            f40 f40Var3 = f40Var;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new gb(i6, i7, p41Var));
                i6 = i7;
            }
            gb gbVar3 = (gb) fdVar.g();
            if (gbVar3 != null) {
                int i12 = gbVar3.c;
                Object obj2 = gbVar3.a;
                int i13 = gbVar3.b;
                if (i13 == i7 && i12 == i8) {
                    fdVar.removeLast();
                    fdVar.addLast(new gb(i7, i8, ((p41) obj2).a(p41VarA)));
                } else if (i13 == i12) {
                    arrayList2.add(new gb(i13, i12, obj2));
                    fdVar.removeLast();
                    fdVar.addLast(new gb(i7, i8, p41VarA));
                } else {
                    if (i12 < i8) {
                        throw new IllegalArgumentException();
                    }
                    fdVar.addLast(new gb(i7, i8, ((p41) obj2).a(p41VarA)));
                }
            } else {
                fdVar.addLast(new gb(i7, i8, p41VarA));
            }
            i5++;
            listM0 = list4;
            f40Var = f40Var3;
            size = i11;
        }
        f40 f40Var4 = f40Var;
        while (i6 <= str.length() && !fdVar.isEmpty()) {
            gb gbVar4 = (gb) fdVar.last();
            Object obj3 = gbVar4.a;
            int i14 = gbVar4.c;
            arrayList2.add(new gb(i6, i14, obj3));
            while (!fdVar.isEmpty() && i14 == ((gb) fdVar.last()).c) {
                fdVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str.length()) {
            arrayList2.add(new gb(i6, str.length(), p41Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new gb(0, 0, p41Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            gb gbVar5 = (gb) arrayList2.get(i15);
            int i16 = gbVar5.b;
            int i17 = gbVar5.c;
            String strSubstring = i16 != i17 ? str.substring(i16, i17) : "";
            List listA = ib.a(hbVar2, i16, i17, new p1(1));
            hb hbVar4 = new hb(strSubstring, listA == null ? f40Var4 : listA);
            p41 p41Var2 = (p41) gbVar5.a;
            if (p41Var2.b == 0) {
                i2 = size2;
                p41Var2 = new p41(p41Var2.a, p41Var.b, p41Var2.c, p41Var2.d, p41Var2.e, p41Var2.f, p41Var2.g, p41Var2.h, p41Var2.i);
            } else {
                i2 = size2;
            }
            d02 d02Var3 = new d02(d02Var2.a, p41Var.a(p41Var2));
            List list5 = hbVar4.e;
            List list6 = list5 == null ? f40Var4 : list5;
            List list7 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i18 = 0;
            while (i18 < size3) {
                gb gbVar6 = (gb) list7.get(i18);
                p41 p41Var3 = p41Var;
                int i19 = gbVar6.b;
                d02 d02Var4 = d02Var3;
                int i20 = gbVar6.c;
                if (ib.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        og0.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList4.add(new gb(i19 - i16, i20 - i16, gbVar6.a));
                } else {
                    list2 = list7;
                }
                i18++;
                list7 = list2;
                d02Var3 = d02Var4;
                p41Var = p41Var3;
            }
            arrayList3.add(new m41(new v6(strSubstring, d02Var3, list6, arrayList4, c90Var, hxVar), i16, i17));
            i15++;
            hbVar2 = hbVar;
            d02Var2 = d02Var;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.n41
    public float a() {
        return ((Number) ((hm0) this.c).getValue()).floatValue();
    }

    @Override // defpackage.n41
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((m41) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n41
    public float c() {
        return ((Number) ((hm0) this.d).getValue()).floatValue();
    }

    public zi d(le leVar, ha0 ha0Var) {
        int i;
        int i2;
        int i3;
        xc1 xc1Var = new xc1();
        xc1Var.e = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                leVar.b(th);
                return v20.v;
            }
            xd xdVar = (xd) this.c;
            do {
                i = xdVar.get();
                i2 = i + 1;
            } while (!xdVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            xc1Var.e = (i2 >>> 27) & 15;
            ((sx0) this.d).a(leVar);
            if (z && ha0Var != null) {
                try {
                    ha0Var.a();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                sx0 sx0Var = (sx0) this.d;
                                Object[] objArr = sx0Var.a;
                                int i5 = sx0Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((le) objArr[i6]).b(th2);
                                }
                                ((sx0) this.d).d();
                                xd xdVar2 = (xd) this.c;
                                do {
                                    i3 = xdVar2.get();
                                } while (!xdVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new xg0(new ke(leVar, this, xc1Var, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi e(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(j(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public void f(sa0 sa0Var) {
        int i;
        synchronized (this.a) {
            try {
                sx0 sx0Var = (sx0) this.d;
                this.d = (sx0) this.e;
                this.e = sx0Var;
                xd xdVar = (xd) this.c;
                do {
                    i = xdVar.get();
                } while (!xdVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = sx0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    sa0Var.i(sx0Var.f(i3));
                }
                sx0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float g(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float h(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return g(i, z);
        }
        int iW = xk.w(layout, i, z2);
        int lineStart = layout.getLineStart(iW);
        int lineEnd = layout.getLineEnd(iW);
        if (i != lineStart && i != lineEnd) {
            return g(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return g(i, z);
        }
        int i4 = i(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(j(i4))) == -1;
        int iK = k(lineEnd, lineStart);
        int iJ = j(i4);
        int i5 = lineStart - iJ;
        int i6 = iK - iJ;
        Bidi bidiE = e(i4);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i5, i6) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iW) : layout.getLineRight(iW);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        cl0[] cl0VarArr = new cl0[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            cl0VarArr[i7] = new cl0(bidiCreateLineBidi.getRunStart(i7) + lineStart, bidiCreateLineBidi.getRunLimit(i7) + lineStart, bidiCreateLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) bidiCreateLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, cl0VarArr, 0, runCount);
        if (i == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (cl0VarArr[i9].a == i) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == cl0VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iW) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(cl0VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(cl0VarArr[i3 + 1].a) : layout.getLineRight(iW);
        }
        int iK2 = i > iK ? k(i, lineStart) : i;
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i2 = -1;
                break;
            }
            if (cl0VarArr[i10].b == iK2) {
                i2 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == cl0VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iW) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(cl0VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(cl0VarArr[i2 + 1].b) : layout.getLineRight(iW);
    }

    public int i(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.b;
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        hk.O(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iS = el.s((Comparable) arrayList.get(i2), numValueOf);
            if (iS >= 0) {
                if (iS <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i5 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public int j(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public int k(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((xi0.t(cCharAt, 8192) < 0 || xi0.t(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void l(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        qs1 qs1Var = (qs1) ((LinkedHashMap) this.c).get(str);
        if (qs1Var != null) {
            qs1Var.j(obj);
        }
        qs1 qs1Var2 = (qs1) ((LinkedHashMap) this.d).get(str);
        if (qs1Var2 != null) {
            qs1Var2.j(obj);
        }
    }

    public me() {
        this.a = new Object();
        this.c = new xd(0);
        this.d = new sx0();
        this.e = new sx0();
    }

    public me(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new un(2, this);
    }
}
