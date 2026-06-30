package defpackage;

import android.view.View;
import com.reddit.secondpage.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef1 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.ev1 r6, defpackage.ye r7) {
        /*
            boolean r0 = r7 instanceof defpackage.df1
            if (r0 == 0) goto L13
            r0 = r7
            df1 r0 = (defpackage.df1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            df1 r0 = new df1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ev1 r6 = r0.h
            defpackage.xc.G(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.yc.l(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.xc.G(r7)
        L31:
            r0.h = r6
            r0.j = r2
            f81 r7 = defpackage.f81.f
            java.lang.Object r7 = r6.a(r7, r0)
            wt r1 = defpackage.wt.e
            if (r7 != r1) goto L40
            return r1
        L40:
            e81 r7 = (defpackage.e81) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            l81 r5 = (defpackage.l81) r5
            boolean r5 = defpackage.lk.q(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef1.a(ev1, ye):java.lang.Object");
    }

    public static final pc1 b(y61 y61Var, int i, v12 v12Var, pz1 pz1Var, boolean z, int i2) {
        pc1 pc1VarC = pz1Var != null ? pz1Var.c(v12Var.b.g(i)) : pc1.e;
        float f = pc1VarC.a;
        int iN = y61Var.N(2.0f);
        return new pc1(z ? (i2 - f) - iN : f, pc1VarC.b, z ? i2 - f : iN + f, pc1VarC.d);
    }

    public static final kw1 c(xw xwVar) {
        vw1 vw1Var;
        iw1 iw1Var = new iw1();
        pd1.t(xwVar, mw1.a, new wt1(new wt1(3, iw1Var), new ux1(1, iw1Var, iw1.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 1)));
        sx0 sx0Var = new sx0();
        sx0 sx0Var2 = iw1Var.a;
        Object[] objArr = sx0Var2.a;
        int i = sx0Var2.b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        jw1 jw1Var = null;
        while (true) {
            vw1Var = vw1.b;
            if (i3 >= i) {
                break;
            }
            jw1 jw1Var2 = (jw1) objArr[i3];
            if (!z || jw1Var2 != vw1Var) {
                if (jw1Var2 == vw1Var && jw1Var == vw1Var) {
                    z = false;
                    break;
                    break;
                }
                if (jw1Var2 != vw1Var) {
                    sx0 sx0Var3 = iw1Var.b;
                    Object[] objArr2 = sx0Var3.a;
                    int i4 = sx0Var3.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((sa0) objArr2[i5]).i(jw1Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                sx0Var.a(jw1Var2);
                z = false;
                jw1Var = jw1Var2;
            }
            i3++;
        }
        if (((jw1) (sx0Var.h() ? null : sx0Var.a[sx0Var.b - 1])) == vw1Var) {
            sx0Var.k(sx0Var.b - 1);
        }
        qx0 qx0Var = sx0Var.c;
        if (qx0Var == null) {
            qx0Var = new qx0(i2, sx0Var);
            sx0Var.c = qx0Var;
        }
        return new kw1(qx0Var);
    }

    public static final int f(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int g(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static g12 h(double d, double d2) {
        ld0 ld0VarU;
        f12 f12Var = new f12(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                ld0VarU = hk.u(f12Var.a, f12Var.b, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = f12Var.a(i3) < f12Var.a(i4);
            if (f12Var.a(i3) >= f12Var.b - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        ld0VarU = hk.u(f12Var.a, f12Var.b, i2);
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new g12(d, d2, ld0VarU);
    }

    public static final xo0 i(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            xo0 xo0Var = tag instanceof xo0 ? (xo0) tag : null;
            if (xo0Var != null) {
                return xo0Var;
            }
            Object objS = af1.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final long j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final rg1 k(pu0 pu0Var) {
        Object objI = pu0Var.i();
        if (objI instanceof rg1) {
            return (rg1) objI;
        }
        return null;
    }

    public static final ee1 l(pz1 pz1Var, int i) {
        oz1 oz1Var = pz1Var.a;
        vw0 vw0Var = pz1Var.b;
        if (oz1Var.a.f.length() != 0) {
            int iD = vw0Var.d(i);
            if ((i != 0 && iD == vw0Var.d(i - 1)) || (i != oz1Var.a.f.length() && iD == vw0Var.d(i + 1))) {
                return pz1Var.a(i);
            }
        }
        return pz1Var.g(i);
    }

    public static final float m(rg1 rg1Var) {
        if (rg1Var != null) {
            return rg1Var.a;
        }
        return 0.0f;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final tm1 o(tm1 tm1Var, tm1 tm1Var2, float f) {
        tm1Var.getClass();
        tm1Var2.getClass();
        float fA = xk.A(vz.a(0L), vz.a(0L), f);
        float fA2 = xk.A(vz.b(0L), vz.b(0L), f);
        Float.floatToRawIntBits(fA);
        Float.floatToRawIntBits(fA2);
        lk.U(f, 0L, 0L);
        throw null;
    }

    public static final String p(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = bufferedReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final long q(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final ih0 r(eh0 eh0Var) {
        return new ih0(eh0Var.a, eh0Var.b, eh0Var.c, eh0Var.d);
    }

    public abstract String d(byte[] bArr, int i, int i2);

    public abstract int e(String str, byte[] bArr, int i, int i2);
}
