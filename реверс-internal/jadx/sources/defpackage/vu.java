package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vu implements h52 {
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public vu(Typeface typeface, jv0 jv0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = typeface;
        this.e = jv0Var;
        this.g = new kv0(1024);
        int iA = jv0Var.a(6);
        if (iA != 0) {
            int i5 = iA + jv0Var.e;
            i = ((ByteBuffer) jv0Var.h).getInt(((ByteBuffer) jv0Var.h).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f = new char[i * 2];
        int iA2 = jv0Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + jv0Var.e;
            i2 = ((ByteBuffer) jv0Var.h).getInt(((ByteBuffer) jv0Var.h).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            a32 a32Var = new a32(this, i7);
            iv0 iv0VarB = a32Var.b();
            int iA3 = iv0VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) iv0VarB.h).getInt(iA3 + iv0VarB.e) : 0, (char[]) this.f, i7 * 2);
            iv0 iv0VarB2 = a32Var.b();
            int iA4 = iv0VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + iv0VarB2.e;
                i3 = ((ByteBuffer) iv0VarB2.h).getInt(((ByteBuffer) iv0VarB2.h).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                yc.p("invalid metadata codepoint length");
                throw null;
            }
            kv0 kv0Var = (kv0) this.g;
            iv0 iv0VarB3 = a32Var.b();
            int iA5 = iv0VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + iv0VarB3.e;
                i4 = ((ByteBuffer) iv0VarB3.h).getInt(((ByteBuffer) iv0VarB3.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            kv0Var.a(a32Var, 0, i4 - 1);
        }
    }

    @Override // defpackage.e52
    public long b(cb cbVar, cb cbVar2, cb cbVar3) {
        int iB = cbVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((y41) this.e).s(i).d(cbVar.a(i), cbVar2.a(i), cbVar3.a(i)));
        }
        return jMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(long j, long j2, ls lsVar) {
        iz0 iz0Var;
        long j3;
        if (lsVar instanceof iz0) {
            iz0Var = (iz0) lsVar;
            int i = iz0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz0Var.j = i - Integer.MIN_VALUE;
            } else {
                iz0Var = new iz0(this, lsVar);
            }
        }
        iz0 iz0Var2 = iz0Var;
        Object objN0 = iz0Var2.h;
        int i2 = iz0Var2.j;
        if (i2 == 0) {
            xc.G(objN0);
            mz0 mz0Var = (mz0) this.e;
            mz0 mz0VarM0 = mz0Var != null ? mz0Var.M0() : null;
            j3 = 0;
            wt wtVar = wt.e;
            if (mz0VarM0 == null) {
                mz0 mz0Var2 = (mz0) this.f;
                if (mz0Var2 != null) {
                    iz0Var2.j = 1;
                    objN0 = mz0Var2.N0(j, j2, iz0Var2);
                }
            } else {
                mz0 mz0Var3 = (mz0) this.e;
                mz0 mz0VarM02 = mz0Var3 != null ? mz0Var3.M0() : null;
                if (mz0VarM02 != null) {
                    iz0Var2.j = 2;
                    objN0 = mz0VarM02.N0(j, j2, iz0Var2);
                }
            }
        } else if (i2 == 1) {
            xc.G(objN0);
            j3 = ((o52) objN0).a;
        } else {
            if (i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objN0);
            j3 = ((o52) objN0).a;
        }
        return new o52(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j, ls lsVar) {
        jz0 jz0Var;
        long j2;
        if (lsVar instanceof jz0) {
            jz0Var = (jz0) lsVar;
            int i = jz0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jz0Var.j = i - Integer.MIN_VALUE;
            } else {
                jz0Var = new jz0(this, lsVar);
            }
        }
        Object objP0 = jz0Var.h;
        int i2 = jz0Var.j;
        if (i2 == 0) {
            xc.G(objP0);
            mz0 mz0Var = (mz0) this.e;
            mz0 mz0VarM0 = mz0Var != null ? mz0Var.M0() : null;
            if (mz0VarM0 == null) {
                j2 = 0;
                return new o52(j2);
            }
            jz0Var.j = 1;
            objP0 = mz0VarM0.P0(j, jz0Var);
            wt wtVar = wt.e;
            if (objP0 == wtVar) {
                return wtVar;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objP0);
        }
        j2 = ((o52) objP0).a;
        return new o52(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(ls lsVar) {
        ru ruVar;
        lu luVar;
        mv mvVar = (mv) this.h;
        if (lsVar instanceof ru) {
            ruVar = (ru) lsVar;
            int i = ruVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ruVar.j = i - Integer.MIN_VALUE;
            } else {
                ruVar = new ru(this, lsVar);
            }
        }
        Object objF = ruVar.h;
        int i2 = ruVar.j;
        if (i2 == 0) {
            xc.G(objF);
            List list = (List) this.g;
            wt wtVar = wt.e;
            if (list == null || list.isEmpty()) {
                ruVar.j = 1;
                objF = mv.f(mvVar, false, ruVar);
            } else {
                fo1 fo1VarI = mvVar.i();
                uu uuVar = new uu(mvVar, this, null);
                ruVar.j = 2;
                objF = fo1VarI.b(uuVar, ruVar);
            }
            return wtVar;
        }
        if (i2 == 1) {
            xc.G(objF);
            luVar = (lu) objF;
        } else {
            if (i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objF);
            luVar = (lu) objF;
        }
        mvVar.k.B(luVar);
        return t32.a;
    }

    public vt f() {
        vt vtVar = (vt) ((ha0) this.g).a();
        if (vtVar != null) {
            return vtVar;
        }
        yc.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public cb g(long j, cb cbVar, cb cbVar2) {
        if (((cb) this.g) == null) {
            this.g = cbVar.c();
        }
        cb cbVar3 = (cb) this.g;
        if (cbVar3 == null) {
            xi0.K("velocityVector");
            throw null;
        }
        int iB = cbVar3.b();
        int i = 0;
        while (true) {
            cb cbVar4 = (cb) this.g;
            if (i >= iB) {
                if (cbVar4 != null) {
                    return cbVar4;
                }
                xi0.K("velocityVector");
                throw null;
            }
            if (cbVar4 == null) {
                xi0.K("velocityVector");
                throw null;
            }
            y41 y41Var = (y41) this.e;
            cbVar.getClass();
            long j2 = j / 1000000;
            t60 t60VarA = ((u60) y41Var.f).a(cbVar2.a(i));
            long j3 = t60VarA.c;
            cbVar4.e(i, (((Math.signum(t60VarA.a) * a6.a(j3 > 0 ? j2 / j3 : 1.0f).b) * t60VarA.b) / j3) * 1000.0f);
            i++;
        }
    }

    public o62 h(mk mkVar, String str) {
        o62 o62Var;
        boolean zIsInstance;
        o62 o62VarA;
        synchronized (((t61) this.h)) {
            try {
                o62Var = (o62) ((et0) this.e).a.get(str);
                Class clsQ = mkVar.a;
                clsQ.getClass();
                Map map = mk.b;
                map.getClass();
                Integer num = (Integer) map.get(clsQ);
                if (num != null) {
                    zIsInstance = s22.w(num.intValue(), o62Var);
                } else {
                    if (clsQ.isPrimitive()) {
                        clsQ = lk.Q(ad1.a(clsQ));
                    }
                    zIsInstance = clsQ.isInstance(o62Var);
                }
                if (zIsInstance) {
                    r62 r62Var = (r62) this.f;
                    if (r62Var instanceof wh1) {
                        wh1 wh1Var = (wh1) r62Var;
                        o62Var.getClass();
                        zo0 zo0Var = wh1Var.d;
                        if (zo0Var != null) {
                            n81 n81Var = wh1Var.e;
                            n81Var.getClass();
                            bl.p(o62Var, n81Var, zo0Var);
                        }
                    }
                    o62Var.getClass();
                } else {
                    cx0 cx0Var = new cx0((cu) this.g);
                    cx0Var.a.put(qt0.h, str);
                    r62 r62Var2 = (r62) this.f;
                    r62Var2.getClass();
                    try {
                        try {
                            o62VarA = r62Var2.c(mkVar, cx0Var);
                        } catch (AbstractMethodError unused) {
                            o62VarA = r62Var2.b(lk.P(mkVar), cx0Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        o62VarA = r62Var2.a(lk.P(mkVar));
                    }
                    o62Var = o62VarA;
                    et0 et0Var = (et0) this.e;
                    o62Var.getClass();
                    o62 o62Var2 = (o62) et0Var.a.put(str, o62Var);
                    if (o62Var2 != null) {
                        o62Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(ls lsVar) throws Throwable {
        wg1 wg1Var;
        sy0 sy0Var;
        Throwable th;
        sy0 sy0Var2;
        ln lnVar = (ln) this.f;
        if (lsVar instanceof wg1) {
            wg1Var = (wg1) lsVar;
            int i = wg1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg1Var.k = i - Integer.MIN_VALUE;
            } else {
                wg1Var = new wg1(this, lsVar);
            }
        }
        Object obj = wg1Var.i;
        int i2 = wg1Var.k;
        t32 t32Var = t32.a;
        Object obj2 = wt.e;
        try {
            if (i2 == 0) {
                xc.G(obj);
                if (!(lnVar.P() instanceof if0)) {
                    return t32Var;
                }
                uy0 uy0Var = (uy0) this.e;
                wg1Var.h = uy0Var;
                wg1Var.k = 1;
                Object objE = uy0Var.e(wg1Var);
                sy0Var = uy0Var;
                if (objE != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sy0Var2 = wg1Var.h;
                try {
                    xc.G(obj);
                    sy0Var2 = sy0Var2;
                    lnVar.V(t32Var);
                    ((uy0) sy0Var2).h(null);
                    return t32Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((uy0) sy0Var2).h(null);
                    throw th;
                }
            }
            sy0 sy0Var3 = wg1Var.h;
            xc.G(obj);
            sy0Var = sy0Var3;
            if (!(lnVar.P() instanceof if0)) {
                ((uy0) sy0Var).h(null);
                return t32Var;
            }
            wg1Var.h = sy0Var;
            wg1Var.k = 2;
            if (e(wg1Var) != obj2) {
                sy0Var2 = sy0Var;
                lnVar.V(t32Var);
                ((uy0) sy0Var2).h(null);
                return t32Var;
            }
            return obj2;
        } catch (Throwable th3) {
            sy0 sy0Var4 = sy0Var;
            th = th3;
            sy0Var2 = sy0Var4;
            ((uy0) sy0Var2).h(null);
            throw th;
        }
    }

    @Override // defpackage.e52
    public cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        if (((cb) this.g) == null) {
            this.g = cbVar3.c();
        }
        cb cbVar4 = (cb) this.g;
        if (cbVar4 == null) {
            xi0.K("velocityVector");
            throw null;
        }
        int iB = cbVar4.b();
        int i = 0;
        while (true) {
            cb cbVar5 = (cb) this.g;
            if (i >= iB) {
                if (cbVar5 != null) {
                    return cbVar5;
                }
                xi0.K("velocityVector");
                throw null;
            }
            if (cbVar5 == null) {
                xi0.K("velocityVector");
                throw null;
            }
            cbVar5.e(i, ((y41) this.e).s(i).c(j, cbVar.a(i), cbVar2.a(i), cbVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.e52
    public cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        if (((cb) this.f) == null) {
            this.f = cbVar.c();
        }
        cb cbVar4 = (cb) this.f;
        if (cbVar4 == null) {
            xi0.K("valueVector");
            throw null;
        }
        int iB = cbVar4.b();
        int i = 0;
        while (true) {
            cb cbVar5 = (cb) this.f;
            if (i >= iB) {
                if (cbVar5 != null) {
                    return cbVar5;
                }
                xi0.K("valueVector");
                throw null;
            }
            if (cbVar5 == null) {
                xi0.K("valueVector");
                throw null;
            }
            cbVar5.e(i, ((y41) this.e).s(i).b(j, cbVar.a(i), cbVar2.a(i), cbVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.e52
    public cb p(cb cbVar, cb cbVar2, cb cbVar3) {
        if (((cb) this.h) == null) {
            this.h = cbVar3.c();
        }
        cb cbVar4 = (cb) this.h;
        if (cbVar4 == null) {
            xi0.K("endVelocityVector");
            throw null;
        }
        int iB = cbVar4.b();
        int i = 0;
        while (true) {
            cb cbVar5 = (cb) this.h;
            if (i >= iB) {
                if (cbVar5 != null) {
                    return cbVar5;
                }
                xi0.K("endVelocityVector");
                throw null;
            }
            if (cbVar5 == null) {
                xi0.K("endVelocityVector");
                throw null;
            }
            cbVar5.e(i, ((y41) this.e).s(i).e(cbVar.a(i), cbVar2.a(i), cbVar3.a(i)));
            i++;
        }
    }

    public vu(et0 et0Var, r62 r62Var, cu cuVar) {
        r62Var.getClass();
        cuVar.getClass();
        this.e = et0Var;
        this.f = r62Var;
        this.g = cuVar;
        this.h = new t61(25);
    }

    public /* synthetic */ vu(Object obj) {
        this.e = obj;
    }

    public vu(y60 y60Var) {
        this(new y41(22, y60Var));
    }
}
