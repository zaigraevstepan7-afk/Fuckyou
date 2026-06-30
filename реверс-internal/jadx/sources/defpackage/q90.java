package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q90 {
    public static final dt0 a = new dt0(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final zn1 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new xd1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new zn1();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((k90) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p90 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceI;
        dt0 dt0Var = a;
        qc1.e("getFontSync");
        try {
            Typeface typeface = (Typeface) dt0Var.a(str);
            if (typeface != null) {
                return new p90(typeface);
            }
            qn qnVarA = j90.a(context, list);
            List list2 = (List) qnVarA.b;
            int i3 = qnVarA.a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                ca0[] ca0VarArr = (ca0[]) list2.get(0);
                if (ca0VarArr == null || ca0VarArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = ca0VarArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = ca0VarArr[i4].f;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new p90(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                ca0[] ca0VarArr2 = (ca0[]) list2.get(0);
                qc1 qc1Var = v22.a;
                qc1.e("TypefaceCompat.createFromFontInfo");
                typefaceI = v22.a.i(context, ca0VarArr2, i);
                Trace.endSection();
            } else {
                qc1 qc1Var2 = v22.a;
                qc1.e("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceI = v22.a.j(context, list2, i);
                Trace.endSection();
            }
            if (typefaceI == null) {
                return new p90(-3);
            }
            dt0Var.b(str, typefaceI);
            return new p90(typefaceI);
        } catch (PackageManager.NameNotFoundException unused) {
            return new p90(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
