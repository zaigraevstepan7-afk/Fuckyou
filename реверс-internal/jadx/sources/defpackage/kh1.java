package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 implements jh1 {
    public final sa0 e;
    public final zx0 f;
    public zx0 g;

    public kh1(Map map, sa0 sa0Var) {
        zx0 zx0Var;
        this.e = sa0Var;
        if (map == null || map.isEmpty()) {
            zx0Var = null;
        } else {
            zx0Var = new zx0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                zx0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f = zx0Var;
    }

    @Override // defpackage.jh1
    public final oc a(String str, ha0 ha0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!s22.x(str.charAt(i))) {
                zx0 zx0Var = this.g;
                if (zx0Var == null) {
                    long[] jArr = pi1.a;
                    zx0Var = new zx0();
                    this.g = zx0Var;
                }
                Object objG = zx0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    zx0Var.m(str, objG);
                }
                ((List) objG).add(ha0Var);
                return new oc(zx0Var, str, ha0Var);
            }
        }
        yc.p("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.jh1
    public final boolean d(Object obj) {
        return ((Boolean) this.e.i(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.jh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        zx0 zx0Var = this.f;
        if (zx0Var == null && this.g == null) {
            return g40.e;
        }
        int i3 = 0;
        int i4 = zx0Var != null ? zx0Var.e : 0;
        zx0 zx0Var2 = this.g;
        HashMap map = new HashMap(i4 + (zx0Var2 != null ? zx0Var2.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (zx0Var != null) {
            Object[] objArr = zx0Var.b;
            Object[] objArr2 = zx0Var.c;
            long[] jArr3 = zx0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        }
        zx0 zx0Var3 = this.g;
        if (zx0Var3 != null) {
            Object[] objArr3 = zx0Var3.b;
            Object[] objArr4 = zx0Var3.c;
            long[] jArr4 = zx0Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j7 = jArr4[i10];
                    if ((((~j7) << c) & j7 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j7 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((ha0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!d(objA)) {
                                            throw new IllegalStateException(kd1.k(objA).toString());
                                        }
                                        map.put(str, hk.j(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((ha0) list.get(i3)).a();
                                        if (objA2 != null && !d(objA2)) {
                                            throw new IllegalStateException(kd1.k(objA2).toString());
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j7 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.jh1
    public final Object f(String str) {
        zx0 zx0Var = this.f;
        List list = zx0Var != null ? (List) zx0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && zx0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = zx0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = zx0Var.c;
            Object obj = objArr[iF];
            zx0Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
