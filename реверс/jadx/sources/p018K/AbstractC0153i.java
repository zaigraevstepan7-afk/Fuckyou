package p018K;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009F.AbstractC0080g;
import p066g0.C0757j0;
import p084q.C1031j;

/* JADX INFO: renamed from: K.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153i {

    /* JADX INFO: renamed from: a */
    public static final C0757j0 f480a = new C0757j0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f481b;

    /* JADX INFO: renamed from: c */
    public static final Object f482c;

    /* JADX INFO: renamed from: d */
    public static final C1031j f483d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0157m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f481b = threadPoolExecutor;
        f482c = new Object();
        f483d = new C1031j(0);
    }

    /* JADX INFO: renamed from: a */
    public static C0152h m568a(String str, Context context, C0149e c0149e, int i2) throws Throwable {
        C0757j0 c0757j0 = f480a;
        Typeface typeface = (Typeface) c0757j0.m2085f(str);
        if (typeface != null) {
            return new C0152h(typeface);
        }
        try {
            C0154j c0154jM556a = AbstractC0148d.m556a(context, c0149e);
            int i3 = 1;
            C0155k[] c0155kArr = (C0155k[]) c0154jM556a.f485b;
            int i4 = c0154jM556a.f484a;
            if (i4 != 0) {
                i3 = i4 != 1 ? -3 : -2;
            } else if (c0155kArr != null && c0155kArr.length != 0) {
                int length = c0155kArr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = c0155kArr[i5].f490e;
                    if (i6 == 0) {
                        i5++;
                    } else if (i6 >= 0) {
                        i3 = i6;
                    }
                }
            }
            if (i3 != 0) {
                return new C0152h(i3);
            }
            Typeface typefaceMo227v = AbstractC0080g.f245a.mo227v(context, c0155kArr, i2);
            if (typefaceMo227v == null) {
                return new C0152h(-3);
            }
            c0757j0.m2089j(str, typefaceMo227v);
            return new C0152h(typefaceMo227v);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0152h(-1);
        }
    }
}
