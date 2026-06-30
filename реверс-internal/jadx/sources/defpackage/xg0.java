package defpackage;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 implements zk, q30, f70, nu1, zi, e31 {
    public static volatile xg0 i;
    public final /* synthetic */ int e;
    public Object f;
    public Object g;
    public static final t61 h = new t61(5);
    public static final i91 j = new i91("loader_key");
    public static final i91 k = new i91("overlay_enabled");
    public static final i91 l = new i91("safe_mode");
    public static final i91 m = new i91("ui_scale");
    public static final i91 n = new i91("script_id");
    public static final i91 o = new i91("su_path");

    public xg0(Context context) {
        this.e = 1;
        int i2 = 14;
        p7 p7Var = new p7(i2, context);
        lw lwVar = qy.a;
        fw fwVar = fw.g;
        qu1 qu1Var = new qu1(null);
        fwVar.getClass();
        js jsVarD = bl.d(hk.L(fwVar, qu1Var));
        mv mvVar = new mv(new b60(new p7(13, p7Var)), hk.G(new e(f40.e, null, i2)), new wr(26), jsVarD);
        int i3 = 3;
        y41 y41Var = new y41(i3, mvVar);
        this.f = new y41(i3, y41Var);
        this.g = new y41(4, new xg0(i2, y41Var.h(), new z91(3, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(xg0 xg0Var, String str, String str2, ls lsVar) {
        oq oqVar;
        String strSubstring;
        String str3;
        String str4;
        int i2;
        int i3;
        Object objP;
        wt wtVar;
        xg0Var.getClass();
        if (lsVar instanceof oq) {
            oqVar = (oq) lsVar;
            int i4 = oqVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oqVar.p = i4 - Integer.MIN_VALUE;
            } else {
                oqVar = new oq(xg0Var, lsVar);
            }
        }
        Object obj = oqVar.n;
        int i5 = oqVar.p;
        ks ksVar = null;
        int i6 = 1;
        if (i5 == 0) {
            xc.G(obj);
            int iQ = ct1.Q(str2);
            String strSubstring2 = iQ > 0 ? str2.substring(0, iQ) : str2;
            strSubstring = iQ > 0 ? str2.substring(iQ) : "";
            str3 = strSubstring2;
            str4 = str + "/" + str2;
            i2 = iQ;
            i3 = 1;
            oqVar.h = str;
            oqVar.i = str3;
            oqVar.j = strSubstring;
            oqVar.k = str4;
            oqVar.l = i2;
            oqVar.m = i3;
            oqVar.p = 1;
            lw lwVar = qy.a;
            objP = nu0.P(fw.g, new bg1(str4, ksVar, i6), oqVar);
            wtVar = wt.e;
            if (objP != wtVar) {
            }
        } else {
            if (i5 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = oqVar.m;
            int i8 = oqVar.l;
            str4 = oqVar.k;
            strSubstring = oqVar.j;
            str3 = oqVar.i;
            String str5 = oqVar.h;
            xc.G(obj);
            int i9 = i8;
            int i10 = i7;
            str = str5;
            String str6 = str3;
            String str7 = strSubstring;
            oq oqVar2 = oqVar;
            String str8 = str4;
            int i11 = i9;
            if (!((Boolean) obj).booleanValue()) {
                str4 = str + "/" + str6 + "_" + i10 + str7;
                i3 = i10 + 1;
                i2 = i11;
                oqVar = oqVar2;
                strSubstring = str7;
                str3 = str6;
                oqVar.h = str;
                oqVar.i = str3;
                oqVar.j = strSubstring;
                oqVar.k = str4;
                oqVar.l = i2;
                oqVar.m = i3;
                oqVar.p = 1;
                lw lwVar2 = qy.a;
                objP = nu0.P(fw.g, new bg1(str4, ksVar, i6), oqVar);
                wtVar = wt.e;
                if (objP != wtVar) {
                    return wtVar;
                }
                i9 = i2;
                i10 = i3;
                obj = objP;
                String str62 = str3;
                String str72 = strSubstring;
                oq oqVar22 = oqVar;
                String str82 = str4;
                int i112 = i9;
                if (!((Boolean) obj).booleanValue()) {
                    return str82;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(xg0 xg0Var, rd rdVar, ls lsVar) {
        pq pqVar;
        xg0Var.getClass();
        if (lsVar instanceof pq) {
            pqVar = (pq) lsVar;
            int i2 = pqVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pqVar.j = i2 - Integer.MIN_VALUE;
            } else {
                pqVar = new pq(xg0Var, lsVar);
            }
        }
        Object objP = pqVar.h;
        wt wtVar = wt.e;
        int i3 = pqVar.j;
        try {
            if (i3 == 0) {
                xc.G(objP);
                Iterator it = rdVar.d.iterator();
                while (it.hasNext()) {
                    try {
                        new File((String) it.next()).mkdirs();
                    } catch (Throwable unused) {
                    }
                }
                String str = "mkdir -p " + pl.h0(rdVar.d, " ", null, null, new um(29), 30);
                pqVar.j = 1;
                String[] strArr = {l91.h, "-c", str};
                lw lwVar = qy.a;
                objP = nu0.P(fw.g, new cg1(strArr, 1500L, null), pqVar);
                if (objP == wtVar) {
                    return wtVar;
                }
            } else {
                if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(objP);
            }
        } catch (Throwable unused2) {
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(xg0 xg0Var, String str, List list, ls lsVar) {
        rq rqVar;
        if (lsVar instanceof rq) {
            rqVar = (rq) lsVar;
            int i2 = rqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rqVar.l = i2 - Integer.MIN_VALUE;
            } else {
                rqVar = new rq(xg0Var, lsVar);
            }
        }
        Object objP = rqVar.j;
        wt wtVar = wt.e;
        int i3 = rqVar.l;
        if (i3 == 0) {
            xc.G(objP);
            String strConcat = "ls -1 ".concat(l91.v(str));
            rqVar.h = str;
            rqVar.i = list;
            rqVar.l = 1;
            String[] strArr = {l91.h, "-c", strConcat};
            lw lwVar = qy.a;
            objP = nu0.P(fw.g, new cg1(strArr, 1500L, null), rqVar);
            if (objP == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = rqVar.i;
            str = rqVar.h;
            xc.G(objP);
        }
        zf1 zf1Var = (zf1) objP;
        if (!zf1Var.b()) {
            return f40.e;
        }
        int i4 = 2;
        int i5 = 0;
        return mm1.H(new m60(new m60(new m60(new up0(i4, zf1Var.b), new um(28), i4), new n(6, list), i5), new kq(str, i5), i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(xg0 xg0Var, File file, String str, String str2, ls lsVar) throws Exception {
        sq sqVar;
        Object oe1Var;
        File file2;
        Object oe1Var2;
        xg0Var.getClass();
        t32 t32Var = t32.a;
        if (lsVar instanceof sq) {
            sqVar = (sq) lsVar;
            int i2 = sqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sqVar.l = i2 - Integer.MIN_VALUE;
            } else {
                sqVar = new sq(xg0Var, lsVar);
            }
        }
        Object obj = sqVar.j;
        wt wtVar = wt.e;
        int i3 = sqVar.l;
        if (i3 == 0) {
            xc.G(obj);
            File file3 = new File(str);
            try {
                oe1Var = Boolean.valueOf(file.renameTo(file3));
            } catch (Throwable th) {
                oe1Var = new oe1(th);
            }
            Object obj2 = Boolean.FALSE;
            if (oe1Var instanceof oe1) {
                oe1Var = obj2;
            }
            if (((Boolean) oe1Var).booleanValue()) {
                return t32Var;
            }
            String parent = file3.getParent();
            if (parent != null) {
                str2 = parent;
            }
            String strV = l91.v(str2);
            String strV2 = l91.v(file.getAbsolutePath());
            String strV3 = l91.v(str);
            String strV4 = l91.v(str);
            StringBuilder sbO = s91.o("mkdir -p ", strV, " && mv -f ", strV2, " ");
            sbO.append(strV3);
            sbO.append(" && chmod 0666 ");
            sbO.append(strV4);
            String string = sbO.toString();
            sqVar.h = file;
            sqVar.i = file3;
            sqVar.l = 1;
            String[] strArr = {l91.h, "-c", string};
            lw lwVar = qy.a;
            Object objP = nu0.P(fw.g, new cg1(strArr, 1500L, null), sqVar);
            if (objP == wtVar) {
                return wtVar;
            }
            file2 = file3;
            obj = objP;
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file4 = sqVar.i;
            File file5 = sqVar.h;
            xc.G(obj);
            file2 = file4;
            file = file5;
        }
        zf1 zf1Var = (zf1) obj;
        if (zf1Var.b()) {
            return t32Var;
        }
        try {
            h60.Y(file, file2);
            oe1Var2 = file2;
        } catch (Throwable th2) {
            oe1Var2 = new oe1(th2);
        }
        if (pe1.a(oe1Var2) == null) {
            return t32Var;
        }
        String strA = zf1Var.a();
        if (strA.length() == 0) {
            strA = "Failed to move file";
        }
        throw new Exception(strA);
    }

    public static final String n(xg0 xg0Var, Uri uri) throws IOException {
        int columnIndex;
        Cursor cursorQuery = ((Context) xg0Var.g).getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                    String string = cursorQuery.getString(columnIndex);
                    cursorQuery.close();
                    return string;
                }
                cursorQuery.close();
            } finally {
            }
        }
        return uri.getLastPathSegment();
    }

    public static final String o(xg0 xg0Var, String str) {
        xg0Var.getClass();
        Pattern patternCompile = Pattern.compile("[\\\\/*?\"<>|]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        String string = ct1.X(strReplaceAll).toString();
        return string.length() == 0 ? "file" : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void s(ql0 ql0Var) {
        if (ql0Var.Q > 0) {
            if (ql0Var.J.d == ml0.i && !ql0Var.p() && !ql0Var.q() && !ql0Var.R && ql0Var.K()) {
                sv0 sv0Var = ql0Var.I.f;
                if ((sv0Var.h & 256) != 0) {
                    while (sv0Var != null) {
                        if ((sv0Var.g & 256) != 0) {
                            ?? K = sv0Var;
                            ?? iy0Var = 0;
                            while (K != 0) {
                                if (K instanceof cc0) {
                                    cc0 cc0Var = (cc0) K;
                                    cc0Var.t(bl.N(cc0Var, 256));
                                } else if ((K.g & 256) != 0 && (K instanceof yw)) {
                                    sv0 sv0Var2 = ((yw) K).t;
                                    int i2 = 0;
                                    K = K;
                                    iy0Var = iy0Var;
                                    while (sv0Var2 != null) {
                                        if ((sv0Var2.g & 256) != 0) {
                                            i2++;
                                            iy0Var = iy0Var;
                                            if (i2 == 1) {
                                                K = sv0Var2;
                                            } else {
                                                if (iy0Var == 0) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (K != 0) {
                                                    iy0Var.b(K);
                                                    K = 0;
                                                }
                                                iy0Var.b(sv0Var2);
                                            }
                                        }
                                        sv0Var2 = sv0Var2.j;
                                        K = K;
                                        iy0Var = iy0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                K = bl.k(iy0Var);
                            }
                        }
                        if ((sv0Var.h & 256) == 0) {
                            break;
                        } else {
                            sv0Var = sv0Var.j;
                        }
                    }
                }
            }
            ql0Var.P = false;
            iy0 iy0VarY = ql0Var.y();
            Object[] objArr = iy0VarY.e;
            int i3 = iy0VarY.g;
            for (int i4 = 0; i4 < i3; i4++) {
                s((ql0) objArr[i4]);
            }
        }
    }

    public void A(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            w().notifyViewVisibilityChanged(view, i2, z);
        }
    }

    public void B(p90 p90Var) {
        yd1 yd1Var = (yd1) this.g;
        y41 y41Var = (y41) this.f;
        int i2 = p90Var.b;
        if (i2 != 0) {
            yd1Var.execute(new qi(y41Var, i2));
        } else {
            yd1Var.execute(new pi(0, y41Var, p90Var.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, ls lsVar) {
        aa1 aa1Var;
        if (lsVar instanceof aa1) {
            aa1Var = (aa1) lsVar;
            int i2 = aa1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aa1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                aa1Var = new aa1(this, lsVar);
            }
        }
        Object objR = aa1Var.h;
        int i3 = aa1Var.j;
        ks ksVar = null;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            ba1 ba1Var = new ba1(str, ksVar, 0);
            aa1Var.j = 1;
            objR = hk.r(y41Var, ba1Var, aa1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(boolean z, ls lsVar) {
        ca1 ca1Var;
        if (lsVar instanceof ca1) {
            ca1Var = (ca1) lsVar;
            int i2 = ca1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ca1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                ca1Var = new ca1(this, lsVar);
            }
        }
        Object objR = ca1Var.h;
        int i3 = ca1Var.j;
        ks ksVar = null;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            da1 da1Var = new da1(z, ksVar, 0);
            ca1Var.j = 1;
            objR = hk.r(y41Var, da1Var, ca1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(boolean z, ls lsVar) {
        ea1 ea1Var;
        if (lsVar instanceof ea1) {
            ea1Var = (ea1) lsVar;
            int i2 = ea1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ea1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                ea1Var = new ea1(this, lsVar);
            }
        }
        Object objR = ea1Var.h;
        int i3 = ea1Var.j;
        ks ksVar = null;
        int i4 = 1;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            da1 da1Var = new da1(z, ksVar, i4);
            ea1Var.j = 1;
            objR = hk.r(y41Var, da1Var, ea1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(float f, ls lsVar) {
        fa1 fa1Var;
        if (lsVar instanceof fa1) {
            fa1Var = (fa1) lsVar;
            int i2 = fa1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fa1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                fa1Var = new fa1(this, lsVar);
            }
        }
        Object objR = fa1Var.h;
        int i3 = fa1Var.j;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            ga1 ga1Var = new ga1(f, null);
            fa1Var.j = 1;
            objR = hk.r(y41Var, ga1Var, fa1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(String str, ls lsVar) {
        ha1 ha1Var;
        if (lsVar instanceof ha1) {
            ha1Var = (ha1) lsVar;
            int i2 = ha1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ha1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                ha1Var = new ha1(this, lsVar);
            }
        }
        Object objR = ha1Var.h;
        int i3 = ha1Var.j;
        ks ksVar = null;
        int i4 = 1;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            ba1 ba1Var = new ba1(str, ksVar, i4);
            ha1Var.j = 1;
            objR = hk.r(y41Var, ba1Var, ha1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(String str, ls lsVar) {
        ia1 ia1Var;
        if (lsVar instanceof ia1) {
            ia1Var = (ia1) lsVar;
            int i2 = ia1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ia1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                ia1Var = new ia1(this, lsVar);
            }
        }
        Object objR = ia1Var.h;
        int i3 = ia1Var.j;
        ks ksVar = null;
        if (i3 == 0) {
            xc.G(objR);
            y41 y41Var = (y41) this.f;
            ba1 ba1Var = new ba1(str, ksVar, 2);
            ia1Var.j = 1;
            objR = hk.r(y41Var, ba1Var, ia1Var);
            wt wtVar = wt.e;
            if (objR == wtVar) {
                return wtVar;
            }
        } else {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objR);
        }
        return t32.a;
    }

    @Override // defpackage.q30
    public Object a() {
        return (y32) this.f;
    }

    @Override // defpackage.q30
    public boolean b(CharSequence charSequence, int i2, int i3, a32 a32Var) {
        if ((a32Var.c & 4) > 0) {
            return true;
        }
        if (((y32) this.f) == null) {
            this.f = new y32(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((wr) this.g).getClass();
        ((y32) this.f).setSpan(new b32(a32Var), i2, i3, 33);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        if (r13 == r6) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r12v0, types: [xg0] */
    /* JADX WARN: Type inference failed for: r12v2, types: [ls] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v7, types: [ls] */
    @Override // defpackage.f70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(g70 g70Var, ks ksVar) {
        j70 j70Var;
        k70 k70Var;
        yg1 yg1Var;
        g70 g70Var2;
        f70 f70Var;
        l70 l70Var;
        p70 p70Var;
        r70 r70Var;
        int i2 = this.e;
        int i3 = 0;
        t32 t32Var = t32.a;
        Object obj = wt.e;
        int i4 = 1;
        switch (i2) {
            case el.c /* 12 */:
                yu yuVar = (yu) this.g;
                if (ksVar instanceof j70) {
                    j70Var = (j70) ksVar;
                    int i5 = j70Var.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j70Var.i = i5 - Integer.MIN_VALUE;
                    } else {
                        j70Var = new j70(this, ksVar);
                    }
                }
                Object obj2 = j70Var.h;
                int i6 = j70Var.i;
                try {
                    try {
                    } finally {
                        this.r();
                    }
                } catch (Throwable th) {
                    s02 s02Var = new s02(th);
                    j70Var.k = null;
                    j70Var.l = th;
                    j70Var.m = i3;
                    j70Var.i = 2;
                    if (bl.j(s02Var, yuVar, th, j70Var) != obj) {
                        throw th;
                    }
                }
                if (i6 == 0) {
                    xc.G(obj2);
                    qt0 qt0Var = (qt0) this.f;
                    j70Var.k = g70Var;
                    j70Var.m = 0;
                    j70Var.i = 1;
                    if (qt0Var.c(g70Var, j70Var) != obj) {
                    }
                    return obj;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        Throwable th2 = (Throwable) j70Var.l;
                        xc.G(obj2);
                        throw th2;
                    }
                    if (i6 != 3) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yg1 yg1Var2 = (yg1) j70Var.l;
                    xc.G(obj2);
                    this = yg1Var2;
                    return t32Var;
                }
                i3 = j70Var.m;
                g70Var = j70Var.k;
                xc.G(obj2);
                lt ltVar = j70Var.f;
                ltVar.getClass();
                yg1 yg1Var3 = new yg1(g70Var, ltVar);
                j70Var.k = null;
                j70Var.l = yg1Var3;
                j70Var.m = i3;
                j70Var.i = 3;
                Object objF = yuVar.f(yg1Var3, null, j70Var);
                this = yg1Var3;
                break;
            case 13:
                if (ksVar instanceof k70) {
                    k70Var = (k70) ksVar;
                    int i7 = k70Var.i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        k70Var.i = i7 - Integer.MIN_VALUE;
                    } else {
                        k70Var = new k70(this, ksVar);
                    }
                }
                Object obj3 = k70Var.h;
                int i8 = k70Var.i;
                if (i8 == 0) {
                    xc.G(obj3);
                    lt ltVar2 = k70Var.f;
                    ltVar2.getClass();
                    yg1 yg1Var4 = new yg1(g70Var, ltVar2);
                    try {
                        wu wuVar = (wu) this.f;
                        k70Var.k = g70Var;
                        k70Var.l = yg1Var4;
                        k70Var.m = 0;
                        k70Var.i = 1;
                        if (wuVar.h(yg1Var4, k70Var) != obj) {
                            g70Var2 = g70Var;
                            yg1Var = yg1Var4;
                            yg1Var.r();
                            f70Var = (f70) this.g;
                            k70Var.k = null;
                            k70Var.l = null;
                            k70Var.m = i3;
                            k70Var.i = 2;
                            if (f70Var.c(g70Var2, k70Var) != obj) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yg1Var = yg1Var4;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            xc.G(obj3);
                            return t32Var;
                        }
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = k70Var.m;
                    yg1Var = k70Var.l;
                    g70Var2 = k70Var.k;
                    try {
                        xc.G(obj3);
                        yg1Var.r();
                        f70Var = (f70) this.g;
                        k70Var.k = null;
                        k70Var.l = null;
                        k70Var.m = i3;
                        k70Var.i = 2;
                        if (f70Var.c(g70Var2, k70Var) != obj) {
                            return t32Var;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                return obj;
            case 14:
                if (ksVar instanceof l70) {
                    l70Var = (l70) ksVar;
                    int i9 = l70Var.i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        l70Var.i = i9 - Integer.MIN_VALUE;
                    } else {
                        l70Var = new l70(this, ksVar);
                    }
                }
                Object objG = l70Var.h;
                int i10 = l70Var.i;
                if (i10 == 0) {
                    xc.G(objG);
                    f70 f70Var2 = (f70) this.f;
                    l70Var.k = g70Var;
                    l70Var.l = 0;
                    l70Var.i = 1;
                    objG = xk.g(f70Var2, g70Var, l70Var);
                    if (objG != obj) {
                    }
                    return obj;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        xc.G(objG);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = l70Var.l;
                g70Var = l70Var.k;
                xc.G(objG);
                Throwable th5 = (Throwable) objG;
                if (th5 == null) {
                    return t32Var;
                }
                z91 z91Var = (z91) this.g;
                l70Var.k = null;
                l70Var.l = i3;
                l70Var.i = 2;
                if (z91Var.f(g70Var, th5, l70Var) != obj) {
                    return t32Var;
                }
                return obj;
            case 15:
                Object objC = ((f70) this.f).c(new ma(new vc1(), g70Var, (wa0) this.g, i4), ksVar);
                return objC == obj ? objC : t32Var;
            default:
                if (ksVar instanceof p70) {
                    p70Var = (p70) ksVar;
                    int i11 = p70Var.i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        p70Var.i = i11 - Integer.MIN_VALUE;
                    } else {
                        p70Var = new p70(this, ksVar);
                    }
                }
                Object obj4 = p70Var.h;
                int i12 = p70Var.i;
                if (i12 == 0) {
                    xc.G(obj4);
                    xg0 xg0Var = (xg0) this.f;
                    r70 r70Var2 = new r70(i3, (xu) this.g, g70Var);
                    try {
                        p70Var.k = r70Var2;
                        p70Var.i = 1;
                        return xg0Var.c(r70Var2, p70Var) == obj ? obj : t32Var;
                    } catch (a e) {
                        e = e;
                        r70Var = r70Var2;
                    }
                } else {
                    if (i12 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r70Var = p70Var.k;
                    try {
                        xc.G(obj4);
                        return t32Var;
                    } catch (a e2) {
                        e = e2;
                    }
                }
                if (e.e != r70Var) {
                    throw e;
                }
                lt ltVar3 = p70Var.f;
                ltVar3.getClass();
                bk.t(ltVar3);
                return t32Var;
        }
    }

    @Override // defpackage.zi
    public void cancel() {
        if (((xd) this.g).compareAndSet(1, 1)) {
            return;
        }
        ((ke) this.f).a();
    }

    @Override // defpackage.e31
    public List d(Integer num) {
        List listD = ((e31) this.f).d(null);
        mp1 mp1Var = (mp1) this.g;
        int i2 = mp1Var.v;
        return i2 < 0 ? listD : pl.l0(al.l(mp1Var, num, i2, Integer.valueOf(mp1Var.E(mp1Var.b, i2))), listD);
    }

    @Override // defpackage.nu1
    public void f(mu1 mu1Var) {
        ox0 ox0Var = (ox0) this.g;
        ox0Var.a();
        tx0 tx0Var = (tx0) mu1Var.f;
        Object[] objArr = tx0Var.b;
        long[] jArr = tx0Var.c;
        int i2 = tx0Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object objB = ((sm0) this.f).b(obj);
            int iD = ox0Var.d(objB);
            int i4 = iD >= 0 ? ox0Var.c[iD] : 0;
            if (i4 == 7) {
                mu1Var.remove(obj);
            } else {
                ox0Var.g(i4 + 1, objB);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.e31
    public boolean g() {
        return ((e31) this.f).g();
    }

    @Override // defpackage.nu1
    public boolean h(Object obj, Object obj2) {
        sm0 sm0Var = (sm0) this.f;
        return xi0.o(sm0Var.b(obj), sm0Var.b(obj2));
    }

    public boolean p(long j2) {
        Object obj;
        List list = (List) ((n81) this.g).b;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (al.v(((o81) obj).a, j2)) {
                break;
            }
            i2++;
        }
        o81 o81Var = (o81) obj;
        if (o81Var != null) {
            return o81Var.h;
        }
        return false;
    }

    public az1 q(List list) {
        w20 w20Var;
        Exception e;
        w20 w20Var2;
        try {
            int size = list.size();
            int i2 = 0;
            w20Var = null;
            while (i2 < size) {
                try {
                    w20Var2 = (w20) list.get(i2);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    w20Var2.a((x20) this.g);
                    i2++;
                    w20Var = w20Var2;
                } catch (Exception e3) {
                    e = e3;
                    w20Var = w20Var2;
                    StringBuilder sb = new StringBuilder();
                    int iC = ((x20) this.g).a.c();
                    wz1 wz1VarC = ((x20) this.g).c();
                    x20 x20Var = (x20) this.g;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + iC + ", composition=" + wz1VarC + ", selection=" + wz1.h(af1.g(x20Var.b, x20Var.c)) + "):");
                    sb.append('\n');
                    pl.g0(list, sb, new n(10, w20Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            x20 x20Var2 = (x20) this.g;
            x20Var2.getClass();
            hb hbVar = new hb(x20Var2.a.toString());
            x20 x20Var3 = (x20) this.g;
            long jG = af1.g(x20Var3.b, x20Var3.c);
            wz1 wz1Var = wz1.g(((az1) this.f).b) ? null : new wz1(jG);
            az1 az1Var = new az1(hbVar, wz1Var != null ? wz1Var.a : af1.g(wz1.e(jG), wz1.f(jG)), ((x20) this.g).c());
            this.f = az1Var;
            return az1Var;
        } catch (Exception e4) {
            w20Var = null;
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        Object[] objArr;
        iy0 iy0Var = (iy0) this.f;
        Arrays.sort(iy0Var.e, 0, iy0Var.g, x80.d);
        int i2 = iy0Var.g;
        ql0[] ql0VarArr = (ql0[]) this.g;
        if (ql0VarArr != null) {
            int length = ql0VarArr.length;
            objArr = ql0VarArr;
            if (length < i2) {
                objArr = new ql0[Math.max(16, i2)];
            }
        }
        this.g = null;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = iy0Var.e[i3];
        }
        iy0Var.g();
        while (true) {
            i2--;
            if (-1 >= i2) {
                this.g = objArr;
                return;
            }
            ql0 ql0Var = objArr[i2];
            ql0Var.getClass();
            if (ql0Var.P) {
                s(ql0Var);
            }
            objArr[i2] = 0;
        }
    }

    public ClipboardManager t() {
        ClipboardManager clipboardManager = (ClipboardManager) this.g;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.f).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.g = clipboardManager2;
        return clipboardManager2;
    }

    public InputMethodManager u() {
        return (InputMethodManager) ((hm0) this.g).getValue();
    }

    public uu0 v() {
        return (uu0) ((v41) this.g).getValue();
    }

    public AutofillManager w() {
        AutofillManager autofillManager = (AutofillManager) this.g;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.f).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.g = autofillManager2;
            return autofillManager2;
        }
        yc.l("Could not locate AutofillManager from context");
        return null;
    }

    public rh0 x() {
        Matcher matcher = (Matcher) this.f;
        return lk.o0(matcher.start(), matcher.end());
    }

    public Object y(rd rdVar, zu1 zu1Var) {
        lw lwVar = qy.a;
        return nu0.P(fw.g, new e(rdVar, this, null, 10), zu1Var);
    }

    public AutofillId z(long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return qr.b(m3.f(this.g), ((View) this.f).getAutofillId(), j2);
        }
        return null;
    }

    public /* synthetic */ xg0(int i2, boolean z) {
        this.e = i2;
    }

    public /* synthetic */ xg0(Context context, int i2) {
        this.e = i2;
        this.f = context;
    }

    public xg0(Application application) {
        this.e = 6;
        dr0 dr0Var = wq0.a;
        application.getClass();
        dr0Var.getClass();
        this.f = dr0Var;
        this.g = application.getApplicationContext();
    }

    public xg0(int i2) {
        this.e = i2;
        switch (i2) {
            case 23:
                this.f = xc.B(Boolean.FALSE);
                break;
            case 24:
            default:
                this.f = new q52(true);
                this.g = new q52(true);
                break;
            case 25:
                this.f = new zx0();
                this.g = new zx0();
                break;
            case 26:
                this.f = new iy0(new ql0[16]);
                break;
        }
    }

    public /* synthetic */ xg0(int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    public xg0(ql0 ql0Var, uu0 uu0Var) {
        this.e = 19;
        this.f = ql0Var;
        this.g = xc.B(uu0Var);
    }

    public xg0(ke keVar) {
        this.e = 27;
        this.f = keVar;
        this.g = new xd(0);
    }

    public xg0(View view) {
        this.e = 0;
        this.f = view;
        this.g = al.E(new p7(9, this));
    }

    public xg0(ContentCaptureSession contentCaptureSession, View view) {
        this.e = 7;
        this.g = contentCaptureSession;
        this.f = view;
    }

    public xg0(sm0 sm0Var) {
        this.e = 20;
        this.f = sm0Var;
        ox0 ox0Var = r01.a;
        this.g = new ox0();
    }

    public xg0(ArrayList arrayList, ArrayList arrayList2) {
        this.e = 17;
        int size = arrayList.size();
        this.f = new int[size];
        this.g = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.g)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public xg0(int i2, int i3) {
        this.e = 17;
        this.f = new int[]{i2, i3};
        this.g = new float[]{0.0f, 1.0f};
    }

    public xg0(tb tbVar) {
        this.e = 10;
        this.f = tbVar;
        y30 y30Var = new y30(tbVar);
        this.g = y30Var;
        tbVar.addTextChangedListener(y30Var);
        if (k30.b == null) {
            synchronized (k30.a) {
                try {
                    if (k30.b == null) {
                        k30 k30Var = new k30();
                        try {
                            k30.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, k30.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        k30.b = k30Var;
                    }
                } finally {
                }
            }
        }
        tbVar.setEditableFactory(k30.b);
    }

    public xg0(int i2, int i3, int i4) {
        this.e = 17;
        this.f = new int[]{i2, i3, i4};
        this.g = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xg0(Object obj) {
        this(23);
        this.e = 23;
        this.g = xc.B(obj);
        xc.B(obj);
    }
}
