package defpackage;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0652  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int i;
        wf wfVar;
        float f;
        char c;
        ej ejVar;
        oc ocVar;
        float f2;
        float f3;
        long jQ;
        String strConcat;
        int length;
        int i2;
        String str;
        pn0 pn0Var;
        jo0 jo0Var;
        int i3 = 4;
        int i4 = 10;
        float f4 = 0.0f;
        pn0 pn0Var2 = null;
        switch (this.e) {
            case 0:
                return obj == ((o) this.f) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                c61 c61Var = (c61) this.f;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == c61Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != c61Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                p2 p2Var = (p2) this.f;
                p2Var.u.h((iw1) obj, hk.o(p2Var, w4.b));
                return t32.a;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((am1) obj).a(hl1.a, new gl1(ad0.e, ((a11) this.f).a(), fl1.f, true));
                return t32.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new j2(i3, (hf) this.f);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ig igVar = (ig) this.f;
                li liVar = (li) obj;
                int i5 = 3;
                if (liVar.b() * igVar.v < 0.0f || io1.b(liVar.e.d()) <= 0.0f) {
                    return liVar.a(new p1(i5));
                }
                final float fMin = Math.min(tz.b(igVar.v, 0.0f) ? 1.0f : (float) Math.ceil(liVar.b() * igVar.v), (float) Math.ceil(io1.b(liVar.e.d()) / 2.0f));
                final float f5 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (liVar.e.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (liVar.e.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f6 = fMin * 2.0f;
                boolean z = f6 > io1.b(liVar.e.d());
                hk hkVarA = igVar.x.a(liVar.e.d(), liVar.e.getLayoutDirection(), liVar);
                if (!(hkVarA instanceof n31)) {
                    if (!(hkVarA instanceof p31)) {
                        boolean z2 = z;
                        if (!(hkVarA instanceof o31)) {
                            ez1.a();
                            return null;
                        }
                        final uq1 uq1Var = igVar.w;
                        if (z2) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j = jFloatToRawIntBits;
                        if (z2) {
                            jFloatToRawIntBits2 = liVar.e.d();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final q10 kt1Var = z2 ? i60.a : new kt1(fMin, 0.0f, 0, 0, 30);
                        return liVar.a(new sa0() { // from class: cg
                            @Override // defpackage.sa0
                            public final Object i(Object obj2) {
                                sl0 sl0Var = (sl0) obj2;
                                sl0Var.a();
                                p10.x(sl0Var, uq1Var, j, j2, 0.0f, kt1Var, null, 104);
                                return t32.a;
                            }
                        });
                    }
                    final uq1 uq1Var2 = igVar.w;
                    hg1 hg1Var = ((p31) hkVarA).b;
                    if (xc.A(hg1Var)) {
                        final long j3 = hg1Var.e;
                        final kt1 kt1Var2 = new kt1(fMin, 0.0f, 0, 0, 30);
                        final boolean z3 = z;
                        return liVar.a(new sa0() { // from class: gg
                            @Override // defpackage.sa0
                            public final Object i(Object obj2) throws Throwable {
                                long j4;
                                sl0 sl0Var = (sl0) obj2;
                                sl0Var.a();
                                ej ejVar2 = sl0Var.e;
                                boolean z4 = z3;
                                lh lhVar = uq1Var2;
                                long j5 = j3;
                                if (z4) {
                                    p10.j0(sl0Var, lhVar, 0L, 0L, j5, 0.0f, null, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f7 = f5;
                                    if (fIntBitsToFloat < f7) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ejVar2.d() >> 32));
                                        float f8 = fMin;
                                        float f9 = fIntBitsToFloat2 - f8;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (ejVar2.d() & 4294967295L)) - f8;
                                        oc ocVar2 = ejVar2.f;
                                        long jQ2 = ocVar2.q();
                                        ocVar2.i().l();
                                        try {
                                            ((oc) ((qt0) ocVar2.a).f).i().e(f8, f8, f9, fIntBitsToFloat3, 0);
                                            j4 = jQ2;
                                            try {
                                                p10.j0(sl0Var, lhVar, 0L, 0L, j5, 0.0f, null, null, 246);
                                                s91.r(ocVar2, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                s91.r(ocVar2, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jQ2;
                                        }
                                    } else {
                                        p10.j0(sl0Var, lhVar, jFloatToRawIntBits, jFloatToRawIntBits2, u4.u(f7, j5), 0.0f, kt1Var2, null, 208);
                                    }
                                }
                                return t32.a;
                            }
                        });
                    }
                    boolean z4 = z;
                    if (igVar.u == null) {
                        igVar.u = new bg();
                    }
                    bg bgVar = igVar.u;
                    bgVar.getClass();
                    w6 w6VarA = bgVar.d;
                    if (w6VarA == null) {
                        w6VarA = y6.a();
                        bgVar.d = w6VarA;
                    }
                    w6VarA.g();
                    w6.c(w6VarA, hg1Var);
                    if (!z4) {
                        w6 w6VarA2 = y6.a();
                        w6.c(w6VarA2, new hg1(fMin, fMin, hg1Var.b() - fMin, hg1Var.a() - fMin, u4.u(fMin, hg1Var.e), u4.u(fMin, hg1Var.f), u4.u(fMin, hg1Var.g), u4.u(fMin, hg1Var.h)));
                        w6VarA.f(w6VarA, w6VarA2, 0);
                    }
                    return liVar.a(new d(i5, w6VarA, uq1Var2));
                }
                uq1 uq1Var3 = igVar.w;
                n31 n31Var = (n31) hkVarA;
                w6 w6Var = n31Var.b;
                if (z) {
                    return liVar.a(new d(i3, n31Var, uq1Var3));
                }
                if (uq1Var3 != null) {
                    wfVar = new wf(5, vl.b(1.0f, uq1Var3.a));
                    i = 1;
                } else {
                    i = 0;
                    wfVar = null;
                }
                pc1 pc1VarD = w6Var.d();
                float f7 = pc1VarD.b;
                float f8 = pc1VarD.a;
                if (igVar.u == null) {
                    igVar.u = new bg();
                }
                bg bgVar2 = igVar.u;
                bgVar2.getClass();
                w6 w6VarA3 = bgVar2.d;
                if (w6VarA3 == null) {
                    w6VarA3 = y6.a();
                    bgVar2.d = w6VarA3;
                }
                w6VarA3.g();
                w6.b(w6VarA3, pc1VarD);
                w6VarA3.f(w6VarA3, w6Var, 0);
                zc1 zc1Var = new zc1();
                w6 w6Var2 = w6VarA3;
                long jCeil = (((long) ((int) Math.ceil(pc1VarD.c - f8))) << 32) | (((long) ((int) Math.ceil(pc1VarD.d - f7))) & 4294967295L);
                bg bgVar3 = igVar.u;
                bgVar3.getClass();
                f6 f6VarB = bgVar3.a;
                n3 n3VarD = bgVar3.b;
                ve0 ve0Var = f6VarB != null ? new ve0(f6VarB.a()) : null;
                if (ve0Var != null && ve0Var.a == 0) {
                    z = true;
                } else {
                    ve0 ve0Var2 = f6VarB != null ? new ve0(f6VarB.a()) : null;
                    if (ve0Var2 != null && i == ve0Var2.a) {
                    }
                }
                try {
                    try {
                        if (f6VarB != null && n3VarD != null) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (liVar.e.d() >> 32));
                            Bitmap bitmap = f6VarB.a;
                            f = 1.0f;
                            if (fIntBitsToFloat <= bitmap.getWidth()) {
                                c = ' ';
                                if (Float.intBitsToFloat((int) (liVar.e.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                                }
                                ejVar = bgVar3.c;
                                if (ejVar == null) {
                                    ejVar = new ej();
                                    bgVar3.c = ejVar;
                                }
                                ocVar = ejVar.f;
                                dj djVar = ejVar.e;
                                long jP = xk.P(jCeil);
                                al0 layoutDirection = liVar.e.getLayoutDirection();
                                char c2 = c;
                                hx hxVar = djVar.a;
                                al0 al0Var = djVar.b;
                                ej ejVar2 = ejVar;
                                cj cjVar = djVar.c;
                                long j4 = djVar.d;
                                djVar.a = liVar;
                                djVar.b = layoutDirection;
                                djVar.c = n3VarD;
                                djVar.d = jP;
                                n3VarD.l();
                                p10.e0(ejVar2, vl.b, 0L, jP, 58);
                                f2 = -f8;
                                f3 = -f7;
                                ((qt0) ocVar.a).A(f2, f3);
                                p10.y0(ejVar2, n31Var.b, uq1Var3, 0.0f, new kt1(f6, 0.0f, 0, 0, 30), null, 52);
                                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (ejVar2.d() >> c2)) + f) / Float.intBitsToFloat((int) (ejVar2.d() >> c2));
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (ejVar2.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (ejVar2.d() & 4294967295L));
                                long jS = ejVar2.S();
                                f6 f6Var = f6VarB;
                                n3 n3Var = n3VarD;
                                jQ = ocVar.q();
                                ocVar.i().l();
                                ((qt0) ocVar.a).x(fIntBitsToFloat2, fIntBitsToFloat3, jS);
                                p10.y0(ejVar2, w6Var2, uq1Var3, 0.0f, null, null, 28);
                                ((qt0) ocVar.a).A(-f2, -f3);
                                n3Var.i();
                                djVar.a = hxVar;
                                djVar.b = al0Var;
                                djVar.c = cjVar;
                                djVar.d = j4;
                                f6Var.a.prepareToDraw();
                                zc1Var.e = f6Var;
                                return liVar.a(new hg(pc1VarD, zc1Var, jCeil, wfVar));
                            }
                            f6VarB = el.b((int) (jCeil >> c), (int) (jCeil & 4294967295L), i);
                            bgVar3.a = f6VarB;
                            n3VarD = c2.d(f6VarB);
                            bgVar3.b = n3VarD;
                            ejVar = bgVar3.c;
                            if (ejVar == null) {
                            }
                            ocVar = ejVar.f;
                            dj djVar2 = ejVar.e;
                            long jP2 = xk.P(jCeil);
                            al0 layoutDirection2 = liVar.e.getLayoutDirection();
                            char c22 = c;
                            hx hxVar2 = djVar2.a;
                            al0 al0Var2 = djVar2.b;
                            ej ejVar22 = ejVar;
                            cj cjVar2 = djVar2.c;
                            long j42 = djVar2.d;
                            djVar2.a = liVar;
                            djVar2.b = layoutDirection2;
                            djVar2.c = n3VarD;
                            djVar2.d = jP2;
                            n3VarD.l();
                            p10.e0(ejVar22, vl.b, 0L, jP2, 58);
                            f2 = -f8;
                            f3 = -f7;
                            ((qt0) ocVar.a).A(f2, f3);
                            p10.y0(ejVar22, n31Var.b, uq1Var3, 0.0f, new kt1(f6, 0.0f, 0, 0, 30), null, 52);
                            float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (ejVar22.d() >> c22)) + f) / Float.intBitsToFloat((int) (ejVar22.d() >> c22));
                            float fIntBitsToFloat32 = (Float.intBitsToFloat((int) (ejVar22.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (ejVar22.d() & 4294967295L));
                            long jS2 = ejVar22.S();
                            f6 f6Var2 = f6VarB;
                            n3 n3Var2 = n3VarD;
                            jQ = ocVar.q();
                            ocVar.i().l();
                            ((qt0) ocVar.a).x(fIntBitsToFloat22, fIntBitsToFloat32, jS2);
                            p10.y0(ejVar22, w6Var2, uq1Var3, 0.0f, null, null, 28);
                            ((qt0) ocVar.a).A(-f2, -f3);
                            n3Var2.i();
                            djVar2.a = hxVar2;
                            djVar2.b = al0Var2;
                            djVar2.c = cjVar2;
                            djVar2.d = j42;
                            f6Var2.a.prepareToDraw();
                            zc1Var.e = f6Var2;
                            return liVar.a(new hg(pc1VarD, zc1Var, jCeil, wfVar));
                        }
                        f = 1.0f;
                        ((qt0) ocVar.a).x(fIntBitsToFloat22, fIntBitsToFloat32, jS2);
                        p10.y0(ejVar22, w6Var2, uq1Var3, 0.0f, null, null, 28);
                        ((qt0) ocVar.a).A(-f2, -f3);
                        n3Var2.i();
                        djVar2.a = hxVar2;
                        djVar2.b = al0Var2;
                        djVar2.c = cjVar2;
                        djVar2.d = j42;
                        f6Var2.a.prepareToDraw();
                        zc1Var.e = f6Var2;
                        return liVar.a(new hg(pc1VarD, zc1Var, jCeil, wfVar));
                    } finally {
                        ocVar.i().i();
                        ocVar.B(jQ);
                    }
                    p10.y0(ejVar22, n31Var.b, uq1Var3, 0.0f, new kt1(f6, 0.0f, 0, 0, 30), null, 52);
                    float fIntBitsToFloat222 = (Float.intBitsToFloat((int) (ejVar22.d() >> c22)) + f) / Float.intBitsToFloat((int) (ejVar22.d() >> c22));
                    float fIntBitsToFloat322 = (Float.intBitsToFloat((int) (ejVar22.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (ejVar22.d() & 4294967295L));
                    long jS22 = ejVar22.S();
                    f6 f6Var22 = f6VarB;
                    n3 n3Var22 = n3VarD;
                    jQ = ocVar.q();
                    ocVar.i().l();
                } catch (Throwable th) {
                    ((qt0) ocVar.a).A(-f2, -f3);
                    throw th;
                }
                c = ' ';
                f6VarB = el.b((int) (jCeil >> c), (int) (jCeil & 4294967295L), i);
                bgVar3.a = f6VarB;
                n3VarD = c2.d(f6VarB);
                bgVar3.b = n3VarD;
                ejVar = bgVar3.c;
                if (ejVar == null) {
                }
                ocVar = ejVar.f;
                dj djVar22 = ejVar.e;
                long jP22 = xk.P(jCeil);
                al0 layoutDirection22 = liVar.e.getLayoutDirection();
                char c222 = c;
                hx hxVar22 = djVar22.a;
                al0 al0Var22 = djVar22.b;
                ej ejVar222 = ejVar;
                cj cjVar22 = djVar22.c;
                long j422 = djVar22.d;
                djVar22.a = liVar;
                djVar22.b = layoutDirection22;
                djVar22.c = n3VarD;
                djVar22.d = jP22;
                n3VarD.l();
                p10.e0(ejVar222, vl.b, 0L, jP22, 58);
                f2 = -f8;
                f3 = -f7;
                ((qt0) ocVar.a).A(f2, f3);
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                List list = (List) this.f;
                String str2 = (String) obj;
                str2.getClass();
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (jt1.H(str2, (String) it.next(), true)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                mv mvVar = (mv) this.f;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    mvVar.k.B(new n60(th2));
                }
                if (mvVar.m.f != l91.u) {
                    ((e60) mvVar.m.getValue()).close();
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((os0) this.f).a();
                return t32.a;
            case el.a /* 9 */:
                ac0 ac0Var = (ac0) obj;
                return Boolean.valueOf(ac0Var instanceof e10 ? ((Boolean) ((t00) this.f).i(ac0Var)).booleanValue() : true);
            case el.b /* 10 */:
                w20 w20Var = (w20) obj;
                String str3 = ((w20) this.f) == w20Var ? " > " : "   ";
                if (w20Var instanceof in) {
                    in inVar = (in) w20Var;
                    length = inVar.a.f.length();
                    i2 = inVar.b;
                    str = "CommitTextCommand(text.length=";
                } else {
                    if (!(w20Var instanceof qm1)) {
                        if (w20Var instanceof pm1) {
                            strConcat = ((pm1) w20Var).toString();
                        } else if (w20Var instanceof ex) {
                            strConcat = ((ex) w20Var).toString();
                        } else if (w20Var instanceof fx) {
                            strConcat = ((fx) w20Var).toString();
                        } else if (w20Var instanceof rm1) {
                            strConcat = ((rm1) w20Var).toString();
                        } else if (w20Var instanceof o60) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (w20Var instanceof dx) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strC = ad1.a(w20Var.getClass()).c();
                            if (strC == null) {
                                strC = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strC);
                        }
                        return str3.concat(strConcat);
                    }
                    qm1 qm1Var = (qm1) w20Var;
                    length = qm1Var.a.f.length();
                    i2 = qm1Var.b;
                    str = "SetComposingTextCommand(text.length=";
                }
                strConcat = s91.k(str, length, ", newCursorPosition=", i2, ")");
                return str3.concat(strConcat);
            case 11:
                c32 c32Var = (c32) obj;
                return ((d90) this.f).a(new c32(null, c32Var.b, c32Var.c, c32Var.d, c32Var.e)).e;
            case el.c /* 12 */:
                sf0 sf0Var = (sf0) this.f;
                li liVar2 = (li) obj;
                float fB = liVar2.b() * ((tz) sf0Var.D.d()).e;
                w6 w6VarA4 = y6.a();
                ym1 ym1VarA = sf0Var.C;
                if (ym1VarA == null) {
                    ym1VarA = qn1.a(((ju0) hk.o(sf0Var, mu0.b)).c, u4.n);
                }
                hk hkVarA2 = ym1VarA.a(liVar2.e.d(), liVar2.e.getLayoutDirection(), liVar2);
                if (hkVarA2 instanceof o31) {
                    w6.b(w6VarA4, ((o31) hkVarA2).b);
                } else if (hkVarA2 instanceof p31) {
                    w6.c(w6VarA4, ((p31) hkVarA2).b);
                } else {
                    if (!(hkVarA2 instanceof n31)) {
                        ez1.a();
                        return null;
                    }
                    w6.a(w6VarA4, ((n31) hkVarA2).b);
                }
                w6 w6VarA5 = y6.a();
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (liVar2.e.d() & 4294967295L)) - fB;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (liVar2.e.d() >> 32));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (liVar2.e.d() & 4294967295L));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat4) || Float.isNaN(fIntBitsToFloat5) || Float.isNaN(fIntBitsToFloat6)) {
                    y6.b("Invalid rectangle, make sure no value is NaN");
                }
                if (w6VarA5.b == null) {
                    w6VarA5.b = new RectF();
                }
                RectF rectF = w6VarA5.b;
                rectF.getClass();
                rectF.set(0.0f, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6);
                Path path = w6VarA5.a;
                RectF rectF2 = w6VarA5.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                w6 w6VarA6 = y6.a();
                w6VarA6.f(w6VarA5, w6VarA4, 1);
                return liVar2.a(new d(i4, w6VarA6, sf0Var));
            case 13:
                return new j2(8, (rm0) this.f);
            case 14:
                return new j2(i4, (xm0) this.f);
            case 15:
                un0 un0Var = (un0) this.f;
                float f9 = -((Float) obj).floatValue();
                if ((f9 >= 0.0f || un0Var.c()) && (f9 <= 0.0f || un0Var.a())) {
                    if (Math.abs(un0Var.h) > 0.5f) {
                        qg0.c("entered drag with non-zero pending scroll");
                    }
                    un0Var.d = true;
                    float f10 = un0Var.h + f9;
                    un0Var.h = f10;
                    if (Math.abs(f10) > 0.5f) {
                        float f11 = un0Var.h;
                        int iRound = Math.round(f11);
                        pn0 pn0VarH = ((pn0) un0Var.f.getValue()).h(iRound, !un0Var.b);
                        if (pn0VarH == null || (pn0Var = un0Var.c) == null) {
                            pn0Var2 = pn0VarH;
                            if (pn0Var2 == null) {
                                un0Var.f(pn0Var2, un0Var.b, true);
                                un0Var.v.setValue(t32.a);
                                un0Var.h(f11 - un0Var.h, pn0Var2);
                            } else {
                                ql0 ql0Var = un0Var.k;
                                if (ql0Var != null) {
                                    ql0Var.k();
                                }
                                un0Var.h(f11 - un0Var.h, un0Var.g());
                            }
                        } else {
                            pn0 pn0VarH2 = pn0Var.h(iRound, true);
                            if (pn0VarH2 != null) {
                                un0Var.c = pn0VarH2;
                                pn0Var2 = pn0VarH;
                            }
                            if (pn0Var2 == null) {
                            }
                        }
                    }
                    if (Math.abs(un0Var.h) > 0.5f) {
                        f9 -= un0Var.h;
                        un0Var.h = 0.0f;
                    }
                    f4 = f9;
                }
                return Float.valueOf(-f4);
            case 16:
                jh1 jh1Var = (jh1) this.f;
                return Boolean.valueOf(jh1Var != null ? jh1Var.d(obj) : true);
            case 17:
                ((uy0) this.f).h(null);
                return t32.a;
            case 18:
                ((tp) this.f).z(obj);
                return t32.a;
            case 19:
                jc1 jc1Var = (jc1) this.f;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                synchronized (jc1Var.c) {
                    try {
                        oj0 oj0Var = jc1Var.d;
                        if (oj0Var != null) {
                            qs1 qs1Var = jc1Var.u;
                            gc1 gc1Var = gc1.f;
                            qs1Var.getClass();
                            qs1Var.k(null, gc1Var);
                            oj0Var.a(cancellationException);
                            jc1Var.r = null;
                            oj0Var.s(new d(18, jc1Var, th3));
                        } else {
                            jc1Var.e = cancellationException;
                            qs1 qs1Var2 = jc1Var.u;
                            gc1 gc1Var2 = gc1.e;
                            qs1Var2.getClass();
                            qs1Var2.k(null, gc1Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return t32.a;
            case 20:
                ((mc1) this.f).a((w20) obj);
                return t32.a;
            case 21:
                jh1 jh1Var2 = ((ih1) this.f).g;
                return Boolean.valueOf(jh1Var2 != null ? jh1Var2.d(obj) : true);
            case 22:
                ((r41) this.f).h(((Float) obj).floatValue());
                return t32.a;
            case 23:
                hj1 hj1Var = (hj1) this.f;
                float fFloatValue = ((Float) obj).floatValue();
                s41 s41Var = hj1Var.a;
                float fG = s41Var.g() + fFloatValue + hj1Var.g;
                float fZ = lk.z(fG, 0.0f, hj1Var.f.g());
                z = fG == fZ;
                float fG2 = fZ - s41Var.g();
                int iRound2 = Math.round(fG2);
                s41Var.h(s41Var.g() + iRound2);
                hj1Var.g = fG2 - iRound2;
                if (!z) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 24:
                bk1 bk1Var = (bk1) this.f;
                return new w01(bk1Var.d(bk1Var.k, ((w01) obj).a, bk1Var.j));
            case 25:
                go1 go1Var = (go1) this.f;
                l81 l81Var = (l81) obj;
                long j5 = l81Var.c;
                ry1 ry1Var = (ry1) go1Var.d;
                if (ry1Var.k() && ry1Var.n().a.f.length() != 0 && (jo0Var = ry1Var.d) != null && jo0Var.d() != null) {
                    go1Var.c(ry1Var.n(), j5, false, l91.l);
                    z = true;
                }
                if (z) {
                    l81Var.a();
                }
                return t32.a;
            case 26:
                e2 e2Var = (e2) this.f;
                obj.getClass();
                return e2Var.a();
            case 27:
                ArrayList arrayList = (ArrayList) this.f;
                y61 y61Var = (y61) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    y61Var.g((z61) arrayList.get(i6), 0, 0, 0.0f);
                }
                return t32.a;
            case 28:
                ho1 ho1Var = (ho1) this.f;
                im1 im1Var = ho1Var.f;
                im1Var.getClass();
                if (!xi0.o(ho1Var.f, im1Var)) {
                    e91.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                ay0 ay0Var = ho1Var.e;
                Object obj2 = ho1Var.c;
                if (ay0Var != null) {
                    if (obj2 != null) {
                        e91.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ay0Var.a(obj);
                } else if (obj2 == null) {
                    ho1Var.c = obj;
                } else {
                    ay0 ay0Var2 = qi1.a;
                    ay0 ay0Var3 = new ay0();
                    ay0Var3.a(obj2);
                    ay0Var3.a(obj);
                    ho1Var.e = ay0Var3;
                    ho1Var.c = null;
                }
                return t32.a;
            default:
                qq1 qq1Var = (qq1) this.f;
                synchronized (qq1Var.g) {
                    pq1 pq1Var = qq1Var.i;
                    pq1Var.getClass();
                    Object obj3 = pq1Var.b;
                    obj3.getClass();
                    int i7 = pq1Var.d;
                    ox0 ox0Var = pq1Var.c;
                    if (ox0Var == null) {
                        ox0Var = new ox0();
                        pq1Var.c = ox0Var;
                        pq1Var.f.m(obj3, ox0Var);
                    }
                    pq1Var.b(obj, i7, obj3, ox0Var);
                }
                return t32.a;
        }
    }

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
    }
}
