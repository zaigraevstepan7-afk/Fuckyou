package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m22 {
    public static final m22 e = new m22(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final wr c;
    public Object[] d;

    public m22(int i, int i2, Object[] objArr, wr wrVar) {
        this.a = i;
        this.b = i2;
        this.c = wrVar;
        this.d = objArr;
    }

    public static m22 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, wr wrVar) {
        if (i3 > 30) {
            return new m22(0, 0, new Object[]{obj, obj2, obj3, obj4}, wrVar);
        }
        int iY = xc.y(i, i3);
        int iY2 = xc.y(i2, i3);
        if (iY != iY2) {
            return new m22((1 << iY) | (1 << iY2), 0, iY < iY2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, wrVar);
        }
        return new m22(0, 1 << iY, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, wrVar)}, wrVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, wr wrVar) {
        Object obj3 = this.d[i];
        m22 m22VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, wrVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        nd.P(objArr, objArr2, 0, i, 6);
        nd.M(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = m22VarJ;
        nd.M(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        ph0 ph0VarK0 = lk.k0(lk.o0(0, this.d.length));
        int i = ph0VarK0.e;
        int i2 = ph0VarK0.f;
        int i3 = ph0VarK0.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!xi0.o(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iY = 1 << xc.y(i, i2);
        if (h(iY)) {
            return xi0.o(obj, this.d[f(iY)]);
        }
        if (!i(iY)) {
            return false;
        }
        m22 m22VarS = s(t(iY));
        return i2 == 30 ? m22VarS.c(obj) : m22VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(m22 m22Var) {
        if (this == m22Var) {
            return true;
        }
        if (this.b == m22Var.b && this.a == m22Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == m22Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iY = 1 << xc.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (xi0.o(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iY)) {
            return null;
        }
        m22 m22VarS = s(t(iY));
        if (i2 != 30) {
            return m22VarS.g(i, i2 + 5, obj);
        }
        ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
        int i3 = ph0VarK0.e;
        int i4 = ph0VarK0.f;
        int i5 = ph0VarK0.g;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!xi0.o(obj, m22VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return m22VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final m22 k(int i, e61 e61Var) {
        e61Var.c(e61Var.j - 1);
        e61Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != e61Var.f) {
            return new m22(0, 0, xc.h(i, objArr), e61Var.f);
        }
        this.d = xc.h(i, objArr);
        return this;
    }

    public final m22 l(int i, Object obj, Object obj2, int i2, e61 e61Var) {
        e61 e61Var2;
        m22 m22VarL;
        int iY = 1 << xc.y(i, i2);
        boolean zH = h(iY);
        wr wrVar = this.c;
        if (zH) {
            int iF = f(iY);
            if (!xi0.o(obj, this.d[iF])) {
                e61Var.c(e61Var.j + 1);
                wr wrVar2 = e61Var.f;
                if (wrVar != wrVar2) {
                    return new m22(this.a ^ iY, this.b | iY, a(iF, iY, i, obj, obj2, i2, wrVar2), wrVar2);
                }
                this.d = a(iF, iY, i, obj, obj2, i2, wrVar2);
                this.a ^= iY;
                this.b |= iY;
                return this;
            }
            e61Var.h = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (wrVar == e61Var.f) {
                this.d[iF + 1] = obj2;
                return this;
            }
            e61Var.i++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new m22(this.a, this.b, objArrCopyOf, e61Var.f);
        }
        if (!i(iY)) {
            e61Var.c(e61Var.j + 1);
            wr wrVar3 = e61Var.f;
            int iF2 = f(iY);
            Object[] objArr2 = this.d;
            if (wrVar != wrVar3) {
                return new m22(this.a | iY, this.b, xc.g(objArr2, iF2, obj, obj2), wrVar3);
            }
            this.d = xc.g(objArr2, iF2, obj, obj2);
            this.a |= iY;
            return this;
        }
        int iT = t(iY);
        m22 m22VarS = s(iT);
        if (i2 == 30) {
            ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
            int i3 = ph0VarK0.e;
            int i4 = ph0VarK0.f;
            int i5 = ph0VarK0.g;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                e61Var.c(e61Var.j + 1);
                m22VarL = new m22(0, 0, xc.g(m22VarS.d, 0, obj, obj2), e61Var.f);
                e61Var2 = e61Var;
            } else {
                while (!xi0.o(obj, m22VarS.d[i3])) {
                    if (i3 == i4) {
                        e61Var.c(e61Var.j + 1);
                        m22VarL = new m22(0, 0, xc.g(m22VarS.d, 0, obj, obj2), e61Var.f);
                        break;
                    }
                    i3 += i5;
                }
                e61Var.h = m22VarS.x(i3);
                if (m22VarS.c == e61Var.f) {
                    m22VarS.d[i3 + 1] = obj2;
                    m22VarL = m22VarS;
                } else {
                    e61Var.i++;
                    Object[] objArr3 = m22VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    m22VarL = new m22(0, 0, objArrCopyOf2, e61Var.f);
                }
                e61Var2 = e61Var;
            }
        } else {
            e61Var2 = e61Var;
            m22VarL = m22VarS.l(i, obj, obj2, i2 + 5, e61Var2);
        }
        return m22VarS == m22VarL ? this : r(iT, m22VarL, e61Var2.f);
    }

    public final m22 m(m22 m22Var, int i, gx gxVar, e61 e61Var) {
        Object[] objArr;
        m22 m22VarJ;
        if (this == m22Var) {
            gxVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            wr wrVar = e61Var.f;
            int i3 = m22Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + m22Var.d.length);
            int length = this.d.length;
            ph0 ph0VarK0 = lk.k0(lk.o0(0, m22Var.d.length));
            int i4 = ph0VarK0.e;
            int i5 = ph0VarK0.f;
            int i6 = ph0VarK0.g;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(m22Var.d[i4])) {
                        gxVar.a++;
                    } else {
                        Object[] objArr3 = m22Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == m22Var.d.length ? m22Var : length == objArrCopyOf.length ? new m22(0, 0, objArrCopyOf, wrVar) : new m22(0, 0, Arrays.copyOf(objArrCopyOf, length), wrVar);
            }
        } else {
            int i7 = this.b | m22Var.b;
            int i8 = this.a;
            int i9 = m22Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (xi0.o(this.d[f(iLowestOneBit)], m22Var.d[m22Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                e91.b("Check failed.");
            }
            m22 m22Var2 = (xi0.o(this.c, e61Var.f) && this.a == i12 && this.b == i7) ? this : new m22(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = m22Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    m22VarJ = s(t(iLowestOneBit2));
                    if (m22Var.i(iLowestOneBit2)) {
                        m22VarJ = m22VarJ.m(m22Var.s(m22Var.t(iLowestOneBit2)), i + 5, gxVar, e61Var);
                        objArr = objArr4;
                    } else if (m22Var.h(iLowestOneBit2)) {
                        int iF = m22Var.f(iLowestOneBit2);
                        Object obj = m22Var.d[iF];
                        Object objX = m22Var.x(iF);
                        int i15 = e61Var.j;
                        objArr = objArr4;
                        m22VarJ = m22VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, e61Var);
                        if (e61Var.j == i15) {
                            gxVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (m22Var.i(iLowestOneBit2)) {
                        m22 m22VarS = m22Var.s(m22Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (m22VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                gxVar.a++;
                                m22VarJ = m22VarS;
                            } else {
                                m22VarJ = m22VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, e61Var);
                            }
                        } else {
                            m22VarJ = m22VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = m22Var.f(iLowestOneBit2);
                        Object obj4 = m22Var.d[iF4];
                        m22VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, m22Var.x(iF4), i + 5, e61Var.f);
                    }
                }
                objArr[length2] = m22VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (m22Var.h(iLowestOneBit3)) {
                    int iF5 = m22Var.f(iLowestOneBit3);
                    Object[] objArr5 = m22Var2.d;
                    objArr5[i18] = m22Var.d[iF5];
                    objArr5[i18 + 1] = m22Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        gxVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = m22Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(m22Var2)) {
                return m22Var.e(m22Var2) ? m22Var : m22Var2;
            }
        }
        return this;
    }

    public final m22 n(int i, Object obj, int i2, e61 e61Var) {
        m22 m22VarN;
        int iY = 1 << xc.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (xi0.o(obj, this.d[iF])) {
                return p(iF, iY, e61Var);
            }
        } else if (i(iY)) {
            int iT = t(iY);
            m22 m22VarS = s(iT);
            if (i2 == 30) {
                ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
                int i3 = ph0VarK0.e;
                int i4 = ph0VarK0.f;
                int i5 = ph0VarK0.g;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    m22VarN = m22VarS;
                    break;
                }
                while (!xi0.o(obj, m22VarS.d[i3])) {
                    if (i3 == i4) {
                        m22VarN = m22VarS;
                        break;
                    }
                    i3 += i5;
                }
                m22VarN = m22VarS.k(i3, e61Var);
            } else {
                m22VarN = m22VarS.n(i, obj, i2 + 5, e61Var);
            }
            return q(m22VarS, m22VarN, iT, iY, e61Var.f);
        }
        return this;
    }

    public final m22 o(int i, Object obj, Object obj2, int i2, e61 e61Var) {
        e61 e61Var2;
        m22 m22VarO;
        int iY = 1 << xc.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            return (xi0.o(obj, this.d[iF]) && xi0.o(obj2, x(iF))) ? p(iF, iY, e61Var) : this;
        }
        if (!i(iY)) {
            return this;
        }
        int iT = t(iY);
        m22 m22VarS = s(iT);
        if (i2 == 30) {
            ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
            int i3 = ph0VarK0.e;
            int i4 = ph0VarK0.f;
            int i5 = ph0VarK0.g;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                m22VarO = m22VarS;
                e61Var2 = e61Var;
            } else {
                while (true) {
                    if (!xi0.o(obj, m22VarS.d[i3]) || !xi0.o(obj2, m22VarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        m22VarO = m22VarS.k(i3, e61Var);
                        break;
                    }
                }
                m22VarO = m22VarS;
                e61Var2 = e61Var;
            }
        } else {
            e61Var2 = e61Var;
            m22VarO = m22VarS.o(i, obj, obj2, i2 + 5, e61Var2);
        }
        return q(m22VarS, m22VarO, iT, iY, e61Var2.f);
    }

    public final m22 p(int i, int i2, e61 e61Var) {
        e61Var.c(e61Var.j - 1);
        e61Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != e61Var.f) {
            return new m22(i2 ^ this.a, this.b, xc.h(i, objArr), e61Var.f);
        }
        this.d = xc.h(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final m22 q(m22 m22Var, m22 m22Var2, int i, int i2, wr wrVar) {
        wr wrVar2 = this.c;
        if (m22Var2 != null) {
            return (wrVar2 == wrVar || m22Var != m22Var2) ? r(i, m22Var2, wrVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (wrVar2 != wrVar) {
            return new m22(this.a, this.b ^ i2, xc.i(i, objArr), wrVar);
        }
        this.d = xc.i(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final m22 r(int i, m22 m22Var, wr wrVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && m22Var.d.length == 2 && m22Var.b == 0) {
            m22Var.a = this.b;
            return m22Var;
        }
        if (this.c == wrVar) {
            objArr[i] = m22Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = m22Var;
        return new m22(this.a, this.b, objArrCopyOf, wrVar);
    }

    public final m22 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (m22) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r13.b = w(r11, r4, (defpackage.m22) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qn u(int i, int i2, Object obj, Object obj2) {
        qn qnVarU;
        int i3 = 1;
        int iY = 1 << xc.y(i, i2);
        int i4 = 0;
        if (h(iY)) {
            int iF = f(iY);
            if (!xi0.o(obj, this.d[iF])) {
                return new qn(i3, new m22(this.a ^ iY, this.b | iY, a(iF, iY, i, obj, obj2, i2, null), null));
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new qn(i4, new m22(this.a, this.b, objArrCopyOf, null));
            }
        } else {
            if (!i(iY)) {
                return new qn(i3, new m22(this.a | iY, this.b, xc.g(this.d, f(iY), obj, obj2), null));
            }
            int iT = t(iY);
            m22 m22VarS = s(iT);
            if (i2 == 30) {
                ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
                int i5 = ph0VarK0.e;
                int i6 = ph0VarK0.f;
                int i7 = ph0VarK0.g;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!xi0.o(obj, m22VarS.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == m22VarS.x(i5)) {
                        qnVarU = null;
                    } else {
                        Object[] objArr2 = m22VarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i5 + 1] = obj2;
                        qnVarU = new qn(i4, new m22(0, 0, objArrCopyOf2, null));
                    }
                }
                qnVarU = new qn(i3, new m22(0, 0, xc.g(m22VarS.d, 0, obj, obj2), null));
                break;
            }
            qnVarU = m22VarS.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final m22 v(int i, int i2, Object obj) {
        m22 m22VarV;
        int iY = 1 << xc.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (!xi0.o(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new m22(this.a ^ iY, this.b, xc.h(iF, objArr), null);
            }
        } else {
            if (!i(iY)) {
                return this;
            }
            int iT = t(iY);
            m22 m22VarS = s(iT);
            if (i2 == 30) {
                ph0 ph0VarK0 = lk.k0(lk.o0(0, m22VarS.d.length));
                int i3 = ph0VarK0.e;
                int i4 = ph0VarK0.f;
                int i5 = ph0VarK0.g;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    m22VarV = m22VarS;
                    break;
                }
                while (!xi0.o(obj, m22VarS.d[i3])) {
                    if (i3 == i4) {
                        m22VarV = m22VarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = m22VarS.d;
                m22VarV = objArr2.length == 2 ? null : new m22(0, 0, xc.h(i3, objArr2), null);
            } else {
                m22VarV = m22VarS.v(i, i2 + 5, obj);
            }
            if (m22VarV != null) {
                return m22VarS != m22VarV ? w(iT, iY, m22VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new m22(this.a, this.b ^ iY, xc.i(iT, objArr3), null);
            }
        }
        return null;
    }

    public final m22 w(int i, int i2, m22 m22Var) {
        Object[] objArr = m22Var.d;
        if (objArr.length != 2 || m22Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = m22Var;
            return new m22(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            m22Var.a = this.b;
            return m22Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        nd.M(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        nd.M(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m22(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
