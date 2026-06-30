package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.reddit.secondpage.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oc {
    public static volatile oc d;
    public static final Object e = new Object();
    public Object a;
    public Object b;
    public Object c;

    public oc(int i) {
        switch (i) {
            case t91.LONG_FIELD_NUMBER /* 4 */:
                this.a = new qt0(17);
                this.b = new qt0(17);
                this.c = new qt0(17);
                break;
            case 13:
                long[] jArr = pi1.a;
                this.a = new zx0();
                break;
            case 15:
                this.a = new AtomicReference(nu0.r);
                this.b = new Object();
                break;
            case 18:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
            default:
                this.c = new t61(27);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(oc ocVar, ya1 ya1Var, xq0 xq0Var, String str, String str2, ls lsVar) {
        zq0 zq0Var;
        ya1 ya1Var2;
        oj0 oj0Var;
        boolean zM;
        ocVar.getClass();
        t32 t32Var = t32.a;
        if (lsVar instanceof zq0) {
            zq0Var = (zq0) lsVar;
            int i = zq0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq0Var.p = i - Integer.MIN_VALUE;
            } else {
                zq0Var = new zq0(ocVar, lsVar);
            }
        }
        Object objP = zq0Var.n;
        wt wtVar = wt.e;
        int i2 = zq0Var.p;
        int i3 = 5;
        int i4 = 4;
        ks ksVar = null;
        if (i2 == 0) {
            xc.G(objP);
            ds1 ds1Var = ds1.a;
            zq0Var.h = ya1Var;
            zq0Var.i = xq0Var;
            zq0Var.j = str;
            zq0Var.k = str2;
            zq0Var.p = 1;
            if (ya1Var.j.c(zq0Var, ds1Var) != wtVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        xc.G(objP);
                        return t32Var;
                    }
                    if (i2 == 5) {
                        xc.G(objP);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zM = zq0Var.m;
                oj0Var = zq0Var.l;
                ya1Var2 = zq0Var.h;
                xc.G(objP);
                oj0Var.a(null);
                cs1 cs1Var = new cs1(new wr1("Success", "Injection complete."));
                zq0Var.h = null;
                zq0Var.i = null;
                zq0Var.j = null;
                zq0Var.k = null;
                zq0Var.l = null;
                zq0Var.m = zM;
                zq0Var.p = 4;
                return ya1Var2.j.c(zq0Var, cs1Var) != wtVar ? wtVar : t32Var;
            }
            oj0Var = zq0Var.l;
            ya1Var2 = zq0Var.h;
            xc.G(objP);
            String strA = ((zf1) objP).a();
            ((dr0) ocVar.b).getClass();
            zM = ct1.M(strA, "Injected");
            if (zM) {
                oj0Var.a(null);
                if (strA.length() == 0) {
                    strA = "Authorization/injection failed.";
                }
                cs1 cs1Var2 = new cs1(new sr1(strA));
                zq0Var.h = null;
                zq0Var.i = null;
                zq0Var.j = null;
                zq0Var.k = null;
                zq0Var.l = null;
                zq0Var.m = zM;
                zq0Var.p = 5;
                if (ya1Var2.j.c(zq0Var, cs1Var2) == wtVar) {
                }
            } else {
                tv tvVar = new tv(oj0Var, ksVar, i4);
                zq0Var.h = ya1Var2;
                zq0Var.i = null;
                zq0Var.j = null;
                zq0Var.k = null;
                zq0Var.l = oj0Var;
                zq0Var.m = zM;
                zq0Var.p = 3;
                if (af1.F(8000L, tvVar, zq0Var) != wtVar) {
                    oj0Var.a(null);
                    cs1 cs1Var3 = new cs1(new wr1("Success", "Injection complete."));
                    zq0Var.h = null;
                    zq0Var.i = null;
                    zq0Var.j = null;
                    zq0Var.k = null;
                    zq0Var.l = null;
                    zq0Var.m = zM;
                    zq0Var.p = 4;
                    if (ya1Var2.j.c(zq0Var, cs1Var3) != wtVar) {
                    }
                }
            }
        }
        str2 = zq0Var.k;
        str = zq0Var.j;
        xq0Var = zq0Var.i;
        ya1Var = zq0Var.h;
        xc.G(objP);
        String str3 = l91.h;
        String str4 = l91.v(str2) + " " + l91.v(str) + " " + xq0Var.b;
        jr1 jr1VarA = nu0.A(ya1Var, null, yt.f, new tv(str3, ksVar, i3), 1);
        jr1VarA.start();
        zq0Var.h = ya1Var;
        zq0Var.i = null;
        zq0Var.j = null;
        zq0Var.k = null;
        zq0Var.l = jr1VarA;
        zq0Var.p = 2;
        lw lwVar = qy.a;
        objP = nu0.P(fw.g, new cg1(new String[]{str3, "-c", str4}, 1500L, null), zq0Var);
        if (objP != wtVar) {
            ya1Var2 = ya1Var;
            oj0Var = jr1VarA;
            String strA2 = ((zf1) objP).a();
            ((dr0) ocVar.b).getClass();
            zM = ct1.M(strA2, "Injected");
            if (zM) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x020b, code lost:
    
        if (r1.t(r2) == r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0281, code lost:
    
        if (defpackage.al.s(1000, r2) != r10) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167 A[PHI: r0 r3 r11
      0x0167: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v8 java.lang.String) binds: [B:40:0x0163, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r3v13 ya1) = (r3v11 ya1), (r3v14 ya1) binds: [B:40:0x0163, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r11v8 long) = (r11v6 long), (r11v9 long) binds: [B:40:0x0163, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0180 A[PHI: r0 r3 r11
      0x0180: PHI (r0v9 java.lang.String) = (r0v7 java.lang.String), (r0v17 java.lang.String) binds: [B:43:0x017c, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r3v15 ya1) = (r3v13 ya1), (r3v16 ya1) binds: [B:43:0x017c, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r11v10 long) = (r11v8 long), (r11v11 long) binds: [B:43:0x017c, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025f A[PHI: r0 r1 r3 r5 r11
      0x025f: PHI (r0v30 int) = (r0v27 int), (r0v31 int) binds: [B:15:0x0048, B:67:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r1v39 java.lang.Object) = (r1v1 java.lang.Object), (r1v46 java.lang.Object) binds: [B:15:0x0048, B:67:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r3v25 int) = (r3v23 int), (r3v26 int) binds: [B:15:0x0048, B:67:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r5v9 long) = (r5v7 long), (r5v10 long) binds: [B:15:0x0048, B:67:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v16 ya1) = (r11v14 ya1), (r11v17 ya1) binds: [B:15:0x0048, B:67:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b6 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0281 -> B:76:0x0284). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(oc ocVar, ya1 ya1Var, xq0 xq0Var, String str, String str2, ls lsVar) throws Throwable {
        ar0 ar0Var;
        String str3;
        ya1 ya1Var2;
        xq0 xq0Var2;
        String str4;
        Object objP;
        ya1 ya1Var3;
        long j;
        Object objP2;
        long j2;
        int iIntValue;
        ya1 ya1Var4;
        int i;
        int i2;
        String str5;
        cs1 cs1Var;
        ocVar.getClass();
        if (lsVar instanceof ar0) {
            ar0Var = (ar0) lsVar;
            int i3 = ar0Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ar0Var.q = i3 - Integer.MIN_VALUE;
            } else {
                ar0Var = new ar0(ocVar, lsVar);
            }
        }
        Object objP3 = ar0Var.o;
        int i4 = ar0Var.q;
        int i5 = 1;
        Object obj = t32.a;
        ks ksVar = null;
        Object obj2 = wt.e;
        switch (i4) {
            case 0:
                xc.G(objP3);
                ar0Var.h = ya1Var;
                ar0Var.i = xq0Var;
                ar0Var.j = str;
                ar0Var.k = str2;
                ar0Var.q = 1;
                Object objP4 = ocVar.p(ar0Var);
                if (objP4 != obj2) {
                    objP3 = objP4;
                    str3 = str2;
                    ya1Var2 = ya1Var;
                    xq0Var2 = xq0Var;
                    str4 = str;
                    long jLongValue = ((Number) objP3).longValue();
                    float f = xq0Var2.b;
                    boolean z = xq0Var2.c;
                    boolean z2 = xq0Var2.d;
                    ar0Var.h = ya1Var2;
                    ar0Var.i = null;
                    ar0Var.j = null;
                    ar0Var.k = str3;
                    ar0Var.l = jLongValue;
                    ar0Var.q = 2;
                    String[] strArr = {"mkdir -p /data/local/z", s91.l("printf '%s' ", s91.l("'", jt1.J(str4 + "|" + f + "|" + z + "|" + z2 + "|" + jLongValue, "'", "'\"'\"'"), "'"), " > /data/local/z/input")};
                    lw lwVar = qy.a;
                    objP = nu0.P(fw.g, new q71(strArr, ksVar, i5), ar0Var);
                    if (objP != obj2) {
                        objP = obj;
                    }
                    if (objP != obj2) {
                        ya1Var3 = ya1Var2;
                        j = jLongValue;
                        ar0Var.h = ya1Var3;
                        ar0Var.i = null;
                        ar0Var.j = null;
                        ar0Var.k = str3;
                        ar0Var.l = j;
                        ar0Var.q = 3;
                        lw lwVar2 = qy.a;
                        objP2 = nu0.P(fw.g, new q71(new String[]{"mkdir -p \"/storage/emulated/0/Zenin/cfg/wav\"", "chmod 0777 \"/storage/emulated/0/Zenin\" \"/storage/emulated/0/Zenin/cfg\" \"/storage/emulated/0/Zenin/cfg/wav\""}, ksVar, i5), ar0Var);
                        if (objP2 != obj2) {
                            objP2 = obj;
                        }
                        if (objP2 != obj2) {
                            ar0Var.h = ya1Var3;
                            ar0Var.i = null;
                            ar0Var.j = null;
                            ar0Var.k = str3;
                            ar0Var.l = j;
                            ar0Var.q = 4;
                            if (ya1Var3.j.c(ar0Var, es1.a) != obj2) {
                                String strL = str3 != null ? "''" : s91.l("'", jt1.J(str3, "'", "'\"'\"'"), "'");
                                ar0Var.h = ya1Var3;
                                ar0Var.i = null;
                                ar0Var.j = null;
                                ar0Var.k = null;
                                ar0Var.l = j;
                                ar0Var.q = 5;
                                lw lwVar3 = qy.a;
                                objP3 = nu0.P(fw.g, new q71(new String[]{"[ -x " + strL + " ] && nohup " + strL + " > /dev/null 2>&1 &"}, ksVar, i5), ar0Var);
                                if (objP3 != obj2) {
                                    j2 = j;
                                    iIntValue = ((Number) objP3).intValue();
                                    if (iIntValue != 0) {
                                        l91 l91Var = l91.g;
                                        ar0Var.h = ya1Var3;
                                        ar0Var.i = null;
                                        ar0Var.j = null;
                                        ar0Var.k = null;
                                        ar0Var.l = j2;
                                        ar0Var.m = iIntValue;
                                        ar0Var.q = 7;
                                    } else {
                                        cs1 cs1Var2 = new cs1(new ur1());
                                        ar0Var.h = null;
                                        ar0Var.i = null;
                                        ar0Var.j = null;
                                        ar0Var.k = null;
                                        ar0Var.l = j2;
                                        ar0Var.m = iIntValue;
                                        ar0Var.q = 6;
                                        if (ya1Var3.j.c(ar0Var, cs1Var2) != obj2) {
                                            return obj;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return obj2;
            case 1:
                str3 = ar0Var.k;
                str4 = ar0Var.j;
                xq0Var2 = ar0Var.i;
                ya1Var2 = ar0Var.h;
                xc.G(objP3);
                long jLongValue2 = ((Number) objP3).longValue();
                float f2 = xq0Var2.b;
                boolean z3 = xq0Var2.c;
                boolean z22 = xq0Var2.d;
                ar0Var.h = ya1Var2;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = str3;
                ar0Var.l = jLongValue2;
                ar0Var.q = 2;
                String[] strArr2 = {"mkdir -p /data/local/z", s91.l("printf '%s' ", s91.l("'", jt1.J(str4 + "|" + f2 + "|" + z3 + "|" + z22 + "|" + jLongValue2, "'", "'\"'\"'"), "'"), " > /data/local/z/input")};
                lw lwVar4 = qy.a;
                objP = nu0.P(fw.g, new q71(strArr2, ksVar, i5), ar0Var);
                if (objP != obj2) {
                }
                if (objP != obj2) {
                }
                return obj2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                j = ar0Var.l;
                str3 = ar0Var.k;
                ya1Var3 = ar0Var.h;
                xc.G(objP3);
                ar0Var.h = ya1Var3;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = str3;
                ar0Var.l = j;
                ar0Var.q = 3;
                lw lwVar22 = qy.a;
                objP2 = nu0.P(fw.g, new q71(new String[]{"mkdir -p \"/storage/emulated/0/Zenin/cfg/wav\"", "chmod 0777 \"/storage/emulated/0/Zenin\" \"/storage/emulated/0/Zenin/cfg\" \"/storage/emulated/0/Zenin/cfg/wav\""}, ksVar, i5), ar0Var);
                if (objP2 != obj2) {
                }
                if (objP2 != obj2) {
                }
                return obj2;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                j = ar0Var.l;
                str3 = ar0Var.k;
                ya1Var3 = ar0Var.h;
                xc.G(objP3);
                ar0Var.h = ya1Var3;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = str3;
                ar0Var.l = j;
                ar0Var.q = 4;
                if (ya1Var3.j.c(ar0Var, es1.a) != obj2) {
                }
                return obj2;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                j = ar0Var.l;
                str3 = ar0Var.k;
                ya1Var3 = ar0Var.h;
                xc.G(objP3);
                if (str3 != null) {
                }
                ar0Var.h = ya1Var3;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = null;
                ar0Var.l = j;
                ar0Var.q = 5;
                lw lwVar32 = qy.a;
                objP3 = nu0.P(fw.g, new q71(new String[]{"[ -x " + strL + " ] && nohup " + strL + " > /dev/null 2>&1 &"}, ksVar, i5), ar0Var);
                if (objP3 != obj2) {
                }
                return obj2;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                j2 = ar0Var.l;
                ya1 ya1Var5 = ar0Var.h;
                xc.G(objP3);
                ya1Var3 = ya1Var5;
                iIntValue = ((Number) objP3).intValue();
                if (iIntValue != 0) {
                }
                return obj2;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                xc.G(objP3);
                return obj;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                iIntValue = ar0Var.m;
                j2 = ar0Var.l;
                ya1Var3 = ar0Var.h;
                xc.G(objP3);
                ya1Var4 = ya1Var3;
                i = iIntValue;
                i2 = 0;
                if (i2 >= 15) {
                    is1 is1Var = new is1(i2 + 1);
                    ar0Var.h = ya1Var4;
                    ar0Var.i = null;
                    ar0Var.j = null;
                    ar0Var.k = null;
                    ar0Var.l = j2;
                    ar0Var.m = i;
                    ar0Var.n = i2;
                    ar0Var.q = 8;
                    if (ya1Var4.j.c(ar0Var, is1Var) != obj2) {
                        ar0Var.h = ya1Var4;
                        ar0Var.i = null;
                        ar0Var.j = null;
                        ar0Var.k = null;
                        ar0Var.l = j2;
                        ar0Var.m = i;
                        ar0Var.n = i2;
                        ar0Var.q = 9;
                        lw lwVar5 = qy.a;
                        objP3 = nu0.P(fw.g, new ba1("/data/local/z/response", ksVar, 3), ar0Var);
                        if (objP3 != obj2) {
                            str5 = (String) objP3;
                            if (str5 != null || str5.length() == 0) {
                                ar0Var.h = ya1Var4;
                                ar0Var.i = null;
                                ar0Var.j = null;
                                ar0Var.k = null;
                                ar0Var.l = j2;
                                ar0Var.m = i;
                                ar0Var.n = i2;
                                ar0Var.q = 10;
                                break;
                            } else {
                                cs1Var = new cs1(str5 == null ? new vr1(str5) : new wr1("Done", "Script started."));
                                ar0Var.h = null;
                                ar0Var.i = null;
                                ar0Var.j = null;
                                ar0Var.k = null;
                                ar0Var.l = j2;
                                ar0Var.m = i;
                                ar0Var.q = 11;
                                if (ya1Var4.j.c(ar0Var, cs1Var) == obj2) {
                                }
                            }
                        }
                    }
                    return obj2;
                }
                str5 = null;
                cs1Var = new cs1(str5 == null ? new vr1(str5) : new wr1("Done", "Script started."));
                ar0Var.h = null;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = null;
                ar0Var.l = j2;
                ar0Var.m = i;
                ar0Var.q = 11;
                if (ya1Var4.j.c(ar0Var, cs1Var) == obj2) {
                    return obj2;
                }
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                i2 = ar0Var.n;
                i = ar0Var.m;
                j2 = ar0Var.l;
                ya1Var4 = ar0Var.h;
                xc.G(objP3);
                ar0Var.h = ya1Var4;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = null;
                ar0Var.l = j2;
                ar0Var.m = i;
                ar0Var.n = i2;
                ar0Var.q = 9;
                lw lwVar52 = qy.a;
                objP3 = nu0.P(fw.g, new ba1("/data/local/z/response", ksVar, 3), ar0Var);
                if (objP3 != obj2) {
                }
                return obj2;
            case el.a /* 9 */:
                i2 = ar0Var.n;
                i = ar0Var.m;
                j2 = ar0Var.l;
                ya1Var4 = ar0Var.h;
                xc.G(objP3);
                str5 = (String) objP3;
                if (str5 != null) {
                }
                ar0Var.h = ya1Var4;
                ar0Var.i = null;
                ar0Var.j = null;
                ar0Var.k = null;
                ar0Var.l = j2;
                ar0Var.m = i;
                ar0Var.n = i2;
                ar0Var.q = 10;
                break;
            case el.b /* 10 */:
                i2 = ar0Var.n;
                i = ar0Var.m;
                j2 = ar0Var.l;
                ya1Var4 = ar0Var.h;
                xc.G(objP3);
                i2++;
                if (i2 >= 15) {
                }
                break;
            case 11:
                xc.G(objP3);
                return obj;
            default:
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        b32[] b32VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (b32VarArr = (b32[]) editable.getSpans(selectionStart, selectionEnd, b32.class)) != null && b32VarArr.length > 0) {
                for (b32 b32Var : b32VarArr) {
                    int spanStart = editable.getSpanStart(b32Var);
                    int spanEnd = editable.getSpanEnd(b32Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static oc m(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        oc ocVar = new oc();
                        ocVar.c = context.getApplicationContext();
                        ocVar.b = new HashSet();
                        ocVar.a = new HashMap();
                        d = ocVar;
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void A(al0 al0Var) {
        ((ej) this.c).e.b = al0Var;
    }

    public void B(long j) {
        ((ej) this.c).e.d = j;
    }

    public void C() {
        zx0 zx0Var = (zx0) this.a;
        String str = (String) this.b;
        List list = (List) zx0Var.k(str);
        if (list != null) {
            list.remove((ha0) this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        zx0Var.m(str, list);
    }

    public void c(ql0 ql0Var, gj0 gj0Var) {
        qt0 qt0Var = (qt0) this.a;
        qt0 qt0Var2 = (qt0) this.b;
        qt0 qt0Var3 = (qt0) this.c;
        int iOrdinal = gj0Var.ordinal();
        if (iOrdinal == 0) {
            qt0Var.h(ql0Var);
            qt0Var3.h(ql0Var);
            return;
        }
        if (iOrdinal == 1) {
            qt0Var2.h(ql0Var);
            qt0Var3.h(ql0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (ql0Var.l != null) {
                qt0Var3.h(ql0Var);
                return;
            } else {
                qt0Var.h(ql0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            ez1.a();
        } else if (ql0Var.l != null) {
            qt0Var3.h(ql0Var);
        } else {
            qt0Var2.h(ql0Var);
        }
    }

    public boolean d(ql0 ql0Var) {
        return !(ql0Var.l == null) && (((vq1) ((qt0) this.a).f).contains(ql0Var) || ((vq1) ((qt0) this.b).f).contains(ql0Var));
    }

    public void f(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (kg0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    g((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new pn(e2);
            }
        }
    }

    public Object g(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.a;
        if (qc1.q()) {
            try {
                qc1.e(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                kg0 kg0Var = (kg0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = kg0Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            g(cls2, hashSet);
                        }
                    }
                }
                objB = kg0Var.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new pn(th);
            }
        }
        return objB;
    }

    public Object h() {
        long jQ = xc.q();
        if (jQ == p02.a) {
            return this.c;
        }
        m02 m02Var = (m02) ((AtomicReference) this.a).get();
        int iA = m02Var.a(jQ);
        if (iA >= 0) {
            return m02Var.c[iA];
        }
        return null;
    }

    public cj i() {
        return ((ej) this.c).e.c;
    }

    public as0 j() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((t61) this.c)) {
            try {
                as0 as0Var = (as0) this.b;
                if (as0Var != null && localeList == ((LocaleList) this.a)) {
                    return as0Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new zr0(localeList.get(i)));
                }
                as0 as0Var2 = new as0(arrayList);
                this.a = localeList;
                this.b = as0Var2;
                return as0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public hx k() {
        return ((ej) this.c).e.a;
    }

    public Typeface l(int i, int i2, zb zbVar) throws Exception {
        zb zbVar2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.a).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.b) == null) {
                this.b = new TypedValue();
            }
            Context context = (Context) this.c;
            TypedValue typedValue = (TypedValue) this.b;
            ThreadLocal threadLocal = ke1.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    zbVar.a(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                dt0 dt0Var = v22.b;
                Typeface typeface = (Typeface) dt0Var.a(v22.b(resources, resourceId, string, i3, i2));
                int i4 = 3;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new y4(i4, zbVar, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e2) {
                    e = e2;
                    zbVar2 = zbVar;
                } catch (XmlPullParserException e3) {
                    e = e3;
                    zbVar2 = zbVar;
                }
                try {
                    if (!string.toLowerCase().endsWith(".xml")) {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceK = v22.a.k(context, resources, resourceId, string);
                        if (typefaceK != null) {
                            dt0Var.b(v22.b(resources, resourceId, string, i5, i2), typefaceK);
                        }
                        if (typefaceK != null) {
                            new Handler(Looper.getMainLooper()).post(new y4(i4, zbVar, typefaceK));
                        } else {
                            zbVar.a(-3);
                        }
                        return typefaceK;
                    }
                    r90 r90VarK = bl.K(resources.getXml(resourceId), resources);
                    if (r90VarK != null) {
                        return v22.a(context, r90VarK, resources, resourceId, string, typedValue.assetCookie, i2, zbVar, true);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        zbVar.a(-3);
                        return null;
                    } catch (IOException e4) {
                        iOException = e4;
                        zbVar2 = zbVar;
                    } catch (XmlPullParserException e5) {
                        xmlPullParserException = e5;
                        zbVar2 = zbVar;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        zbVar2.a(-3);
                        return null;
                    }
                } catch (IOException e6) {
                    e = e6;
                    iOException = e;
                } catch (XmlPullParserException e7) {
                    e = e7;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                    zbVar2.a(-3);
                    return null;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                zbVar2.a(-3);
                return null;
            }
        }
        return null;
    }

    public lk0 n() {
        lk0 lk0Var = (lk0) this.b;
        if (lk0Var != null) {
            return lk0Var;
        }
        xi0.K("keyboardActions");
        throw null;
    }

    public al0 o() {
        return ((ej) this.c).e.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(ls lsVar) throws Throwable {
        yq0 yq0Var;
        long j;
        xg0 xg0Var = (xg0) this.a;
        if (lsVar instanceof yq0) {
            yq0Var = (yq0) lsVar;
            int i = yq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yq0Var.k = i - Integer.MIN_VALUE;
            } else {
                yq0Var = new yq0(this, lsVar);
            }
        }
        Object objS = yq0Var.i;
        int i2 = yq0Var.k;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(objS);
            y41 y41Var = (y41) xg0Var.g;
            yq0Var.k = 1;
            objS = xk.s(y41Var, yq0Var);
            if (objS != wtVar) {
            }
            return wtVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = yq0Var.h;
            xc.G(objS);
            return new Long(j);
        }
        xc.G(objS);
        Long lK = jt1.K(((ga2) objS).e);
        long jLongValue = lK != null ? lK.longValue() : 0L;
        if (jLongValue > 0) {
            return new Long(jLongValue);
        }
        g0 g0Var = wb1.e;
        long jNextInt = ((long) wb1.e.d().nextInt(900000000)) + 100000000;
        String strValueOf = String.valueOf(jNextInt);
        yq0Var.h = jNextInt;
        yq0Var.k = 2;
        if (xg0Var.G(strValueOf, yq0Var) != wtVar) {
            j = jNextInt;
            return new Long(j);
        }
        return wtVar;
    }

    public long q() {
        return ((ej) this.c).e.d;
    }

    public boolean r(CharSequence charSequence, int i, int i2, a32 a32Var) {
        if ((a32Var.c & 3) == 0) {
            cw cwVar = (cw) this.c;
            iv0 iv0VarB = a32Var.b();
            int iA = iv0VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) iv0VarB.h).getShort(iA + iv0VarB.e);
            }
            cwVar.getClass();
            ThreadLocal threadLocal = cw.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = cwVar.a.hasGlyph(sb.toString());
            int i3 = a32Var.c & 4;
            a32Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (a32Var.c & 3) == 2;
    }

    public boolean s() {
        return !(((vq1) ((qt0) this.a).f).isEmpty() && ((vq1) ((qt0) this.c).f).isEmpty() && ((vq1) ((qt0) this.b).f).isEmpty());
    }

    public boolean t() {
        if (((ns1) this.a).getValue() != this.c) {
            return true;
        }
        oc ocVar = (oc) this.b;
        return ocVar != null && ocVar.t();
    }

    public Object u(CharSequence charSequence, int i, int i2, int i3, boolean z, q30 q30Var) {
        int i4;
        char c;
        t30 t30Var = new t30((kv0) ((vu) this.b).g);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zB = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zB) {
                SparseArray sparseArray = t30Var.c.a;
                kv0 kv0Var = sparseArray == null ? null : (kv0) sparseArray.get(iCodePointAt);
                if (t30Var.a == 2) {
                    if (kv0Var != null) {
                        t30Var.c = kv0Var;
                        t30Var.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            t30Var.a();
                        } else if (iCodePointAt != 65039) {
                            kv0 kv0Var2 = t30Var.c;
                            if (kv0Var2.b != null) {
                                if (t30Var.f != 1) {
                                    t30Var.d = kv0Var2;
                                    t30Var.a();
                                } else if (t30Var.b()) {
                                    t30Var.d = t30Var.c;
                                    t30Var.a();
                                } else {
                                    t30Var.a();
                                }
                                c = 3;
                            } else {
                                t30Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (kv0Var == null) {
                    t30Var.a();
                    c = 1;
                } else {
                    t30Var.a = 2;
                    t30Var.c = kv0Var;
                    t30Var.f = 1;
                    c = 2;
                }
                t30Var.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !r(charSequence, i4, iCharCount, t30Var.d.b)) {
                        zB = q30Var.b(charSequence, i4, iCharCount, t30Var.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (t30Var.a == 2 && t30Var.c.b != null && ((t30Var.f > 1 || t30Var.b()) && i5 < i3 && zB && (z || !r(charSequence, i4, iCharCount, t30Var.c.b)))) {
            q30Var.b(charSequence, i4, iCharCount, t30Var.c.b);
        }
        return q30Var.a();
    }

    public void v() {
        ((TypedArray) this.a).recycle();
    }

    public boolean w(int i) {
        rq1 rq1Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            n();
        } else if (i != 1 && i != 0) {
            yc.l("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            j80 j80Var = (j80) this.c;
            if (j80Var != null) {
                ((m80) j80Var).g(1, true);
                return true;
            }
            xi0.K("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (rq1Var = (rq1) this.a) == null) {
                return false;
            }
            ((zw) rq1Var).a();
            return true;
        }
        j80 j80Var2 = (j80) this.c;
        if (j80Var2 != null) {
            ((m80) j80Var2).g(2, true);
            return true;
        }
        xi0.K("focusManager");
        throw null;
    }

    public void x(Object obj) {
        long jQ = xc.q();
        if (jQ == p02.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            m02 m02Var = (m02) ((AtomicReference) this.a).get();
            int iA = m02Var.a(jQ);
            if (iA < 0) {
                ((AtomicReference) this.a).set(m02Var.b(jQ, obj));
            } else {
                m02Var.c[iA] = obj;
            }
        }
    }

    public void y(cj cjVar) {
        ((ej) this.c).e.c = cjVar;
    }

    public void z(hx hxVar) {
        ((ej) this.c).e.a = hxVar;
    }

    public /* synthetic */ oc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public oc(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public oc(d32 d32Var, oc ocVar) {
        this.a = d32Var;
        this.b = ocVar;
        this.c = d32Var.e;
    }
}
