package defpackage;

import android.graphics.Rect;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj) {
        super(2);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0223, code lost:
    
        defpackage.x82.b(r1, r3, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    @Override // defpackage.wa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        eh0 eh0Var;
        ug0 ug0Var;
        sy syVarG;
        sy syVarG2;
        ug0 ug0Var2;
        sy syVarG3;
        int i;
        p82 p82VarE;
        eh0 eh0Var2;
        int i2 = this.f;
        qv0 qv0Var = qv0.a;
        boolean z = false;
        t32 t32Var = t32.a;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((r) obj3).b(ob0Var, 0);
                } else {
                    ob0Var.Q();
                }
                break;
            case 1:
                rs0 rs0Var = (rs0) obj;
                xd0 xd0Var = (xd0) obj2;
                v3 v3Var = (v3) obj3;
                x82 x82Var = v3Var.s;
                if (x82Var == null) {
                    x82Var = new x82(v3Var.v.getInsetsWatcher());
                    v3Var.s = x82Var;
                }
                z82 z82Var = x82Var.a;
                hx0 hx0Var = x82.e;
                int[] iArr = hx0Var.b;
                Object[] objArr = hx0Var.c;
                long[] jArr = hx0Var.a;
                int length = jArr.length - 2;
                eh0 eh0Var3 = eh0.e;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            for (?? r15 = z; r15 < i5; r15++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + r15;
                                    int i7 = iArr[i6];
                                    i = i4;
                                    v82 v82Var = (v82) objArr[i6];
                                    eh0Var = eh0Var3;
                                    if (x82.a(xd0Var, ((w82) v82Var).c)) {
                                        ug0Var2 = ((w82) v82Var).c;
                                        v82.a.getClass();
                                        if (v82Var == u82.j) {
                                            p82 p82VarE2 = z82Var.E();
                                            if (p82VarE2 != null) {
                                                syVarG3 = p82VarE2.a.g();
                                                if (syVarG3 != null) {
                                                }
                                                x82.b(rs0Var, ug0Var2, eh0VarA);
                                            }
                                        } else {
                                            p82 p82VarE3 = z82Var.E();
                                            eh0 eh0VarH = p82VarE3 != null ? p82VarE3.a.h(i7) : null;
                                            if (eh0VarH != null) {
                                                x82.b(rs0Var, ug0Var2, eh0VarH);
                                            }
                                        }
                                        break;
                                    } else {
                                        ug0Var = ((w82) v82Var).d;
                                        if (x82.a(xd0Var, ug0Var)) {
                                            v82.a.getClass();
                                            if (v82Var == u82.j) {
                                                p82 p82VarE4 = z82Var.E();
                                                if (p82VarE4 != null) {
                                                    syVarG2 = p82VarE4.a.g();
                                                    if (syVarG2 != null) {
                                                    }
                                                    x82.b(rs0Var, ug0Var, eh0VarA);
                                                }
                                                break;
                                            } else {
                                                if (v82Var != u82.d && (p82VarE = z82Var.E()) != null) {
                                                    eh0VarI = p82VarE.a.i(i7);
                                                }
                                                eh0Var2 = eh0VarI;
                                                if (eh0Var2 != null) {
                                                }
                                            }
                                        } else if (i7 != -1 && (ug0Var = (ug0) x82.c.b(i7)) != null) {
                                            if (x82.a(xd0Var, ug0Var)) {
                                                v82.a.getClass();
                                                if (v82Var == u82.j) {
                                                    p82 p82VarE5 = z82Var.E();
                                                    if (p82VarE5 != null) {
                                                        syVarG2 = p82VarE5.a.g();
                                                        if (syVarG2 != null) {
                                                        }
                                                        x82.b(rs0Var, ug0Var, eh0VarA);
                                                    }
                                                    break;
                                                } else {
                                                    y82 y82Var = (y82) z82Var.G(i7).getValue();
                                                    eh0Var2 = y82Var != null ? y82Var.a : null;
                                                    if (eh0Var2 != null) {
                                                    }
                                                }
                                            } else {
                                                ug0Var = (ug0) x82.d.b(i7);
                                                if (ug0Var != null && x82.a(xd0Var, ug0Var)) {
                                                    v82.a.getClass();
                                                    if (v82Var == u82.j) {
                                                        p82 p82VarE6 = z82Var.E();
                                                        if (p82VarE6 != null) {
                                                            syVarG2 = p82VarE6.a.g();
                                                            if (syVarG2 != null) {
                                                            }
                                                            x82.b(rs0Var, ug0Var, eh0VarA);
                                                        }
                                                        break;
                                                    } else {
                                                        y82 y82Var2 = (y82) z82Var.G(i7).getValue();
                                                        eh0Var2 = y82Var2 != null ? y82Var2.b : null;
                                                        if (eh0Var2 != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    eh0Var = eh0Var3;
                                    i = i4;
                                }
                                j >>= i;
                                i4 = i;
                                eh0Var3 = eh0Var;
                            }
                            eh0Var = eh0Var3;
                            if (i5 == i4) {
                            }
                        } else {
                            eh0Var = eh0Var3;
                        }
                        if (i3 != length) {
                            i3++;
                            eh0Var3 = eh0Var;
                            z = false;
                        }
                    }
                    x82.b(rs0Var, ug0Var2, eh0VarA);
                } else {
                    eh0Var = eh0Var3;
                }
                v82.a.getClass();
                w82 w82Var = u82.j;
                if (x82.a(xd0Var, w82Var.c)) {
                    ug0Var2 = w82Var.c;
                    p82 p82VarE7 = z82Var.E();
                    if (p82VarE7 != null) {
                        syVarG3 = p82VarE7.a.g();
                        eh0 eh0VarA = syVarG3 != null ? syVarG3.a() : eh0Var;
                        x82.b(rs0Var, ug0Var2, eh0VarA);
                    }
                } else {
                    ug0Var = w82Var.d;
                    if (x82.a(xd0Var, ug0Var)) {
                        p82 p82VarE8 = z82Var.E();
                        if (p82VarE8 != null) {
                            syVarG2 = p82VarE8.a.g();
                            eh0 eh0VarA2 = syVarG2 != null ? syVarG2.a() : eh0Var;
                            x82.b(rs0Var, ug0Var, eh0VarA2);
                        }
                    } else {
                        ug0[] ug0VarArr = x82.b;
                        int length2 = ug0VarArr.length;
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i8 < length2) {
                                ug0 ug0Var3 = ug0VarArr[i8];
                                int i10 = i9 + 1;
                                if (x82.a(xd0Var, ug0Var3)) {
                                    p82 p82VarE9 = z82Var.E();
                                    if (p82VarE9 != null && (syVarG = p82VarE9.a.g()) != null) {
                                        Rect rect = (Rect) (Build.VERSION.SDK_INT >= 28 ? ry.b(syVarG.a) : Collections.EMPTY_LIST).get(i9);
                                        rs0Var.a(ug0Var3.b(), rect.left);
                                        rs0Var.a(ug0Var3.d(), rect.top);
                                        rs0Var.a(ug0Var3.c(), rect.right);
                                        rs0Var.a(ug0Var3.a(), rect.bottom);
                                    }
                                } else {
                                    i8++;
                                    i9 = i10;
                                }
                            }
                        }
                    }
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (ob0Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    Object objK = ob0Var2.K();
                    if (objK == kp.a) {
                        objK = a4.k;
                        ob0Var2.f0(objK);
                    }
                    nu0.h(ol1.a(qv0Var, false, (sa0) objK), (wa0) ((fy0) obj3).getValue(), ob0Var2, 0);
                } else {
                    ob0Var2.Q();
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                k40 k40Var = (k40) obj;
                k40 k40Var2 = (k40) obj2;
                k40 k40Var3 = k40.g;
                if (k40Var == k40Var3 && k40Var2 == k40Var3 && !((j50) obj3).a.c) {
                    z = true;
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                ((fp) obj3).b((ob0) obj, al.V(1));
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                tv0 tv0Var = (tv0) obj;
                tv0 tv0VarO = (rv0) obj2;
                ob0 ob0Var3 = (ob0) obj3;
                if (tv0VarO instanceof jp) {
                    xa0 xa0Var = ((jp) tv0VarO).a;
                    s22.i(3, xa0Var);
                    tv0VarO = bk.O(ob0Var3, (tv0) xa0Var.f(qv0Var, ob0Var3, 0));
                }
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Number) obj2).intValue();
                ((cy) obj3).b((ob0) obj, al.V(1));
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ob0 ob0Var4 = (ob0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (ob0Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        wa0 wa0Var = (wa0) list.get(i11);
                        int iHashCode = Long.hashCode(ob0Var4.T);
                        ep.c.getClass();
                        v4 v4Var = dp.c;
                        ob0Var4.Z();
                        if (ob0Var4.S) {
                            ob0Var4.k(v4Var);
                        } else {
                            ob0Var4.i0();
                        }
                        xc.E(dp.g, ob0Var4, Integer.valueOf(iHashCode));
                        wa0Var.h(ob0Var4, 0);
                        ob0Var4.p(true);
                    }
                } else {
                    ob0Var4.Q();
                }
                break;
            default:
                ((Number) obj2).intValue();
                ((v81) obj3).b((ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = rVar;
    }
}
