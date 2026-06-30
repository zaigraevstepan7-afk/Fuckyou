package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p004C.RunnableC0024e;
import p005C0.C0048n;
import p007E.AbstractC0056b;
import p007E.C0061g;
import p007E.C0063i;
import p007E.InterfaceC0060f;
import p007E.RunnableC0068n;
import p018K.AbstractC0153i;
import p018K.C0149e;
import p018K.C0151g;
import p018K.C0152h;
import p018K.CallableC0150f;
import p018K.RunnableC0145a;
import p018K.RunnableC0158n;
import p066g0.C0757j0;
import p084q.C1031j;

/* JADX INFO: renamed from: F.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0016e f245a;

    /* JADX INFO: renamed from: b */
    public static final C0757j0 f246b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f245a = new C0085l();
        } else if (i2 >= 28) {
            f245a = new C0084k();
        } else if (i2 >= 26) {
            f245a = new C0083j();
        } else if (i2 < 24) {
            f245a = new C0081h();
        } else {
            Method method = C0082i.f254m;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f245a = new C0082i();
            }
        }
        f246b = new C0757j0(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m365a(Context context, InterfaceC0060f interfaceC0060f, Resources resources, int i2, String str, int i3, int i4, AbstractC0056b abstractC0056b, boolean z2) {
        Typeface typefaceMo225u;
        Typeface typefaceCreate;
        int i5 = 1;
        int i6 = 0;
        int i7 = -3;
        if (interfaceC0060f instanceof C0063i) {
            C0063i c0063i = (C0063i) interfaceC0060f;
            String str2 = c0063i.f207d;
            typefaceMo225u = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (abstractC0056b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0068n(abstractC0056b, i6, typefaceCreate));
                    }
                    return typefaceCreate;
                }
                boolean z3 = !z2 ? abstractC0056b != null : c0063i.f206c != 0;
                int i8 = z2 ? c0063i.f205b : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                C0001b c0001b = new C0001b(3);
                c0001b.f1b = abstractC0056b;
                C0149e c0149e = c0063i.f204a;
                C0048n c0048n = new C0048n(c0001b, 2, handler);
                if (z3) {
                    C0757j0 c0757j0 = AbstractC0153i.f480a;
                    String str3 = ((String) c0149e.f469e) + "-" + i4;
                    Typeface typeface = (Typeface) AbstractC0153i.f480a.m2085f(str3);
                    if (typeface != null) {
                        handler.post(new RunnableC0024e(c0001b, 3, typeface));
                        typefaceMo225u = typeface;
                    } else if (i8 == -1) {
                        C0152h c0152hM568a = AbstractC0153i.m568a(str3, context, c0149e, i4);
                        c0048n.m288F(c0152hM568a);
                        typefaceMo225u = c0152hM568a.f478a;
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        C0152h c0152h = (C0152h) AbstractC0153i.f481b.submit(new CallableC0150f(str3, context, c0149e, i4, 0)).get(i8, TimeUnit.MILLISECONDS);
                                        c0048n.m288F(c0152h);
                                        typefaceMo225u = c0152h.f478a;
                                    } catch (TimeoutException unused) {
                                        throw new InterruptedException("timeout");
                                    }
                                } catch (InterruptedException e2) {
                                    throw e2;
                                }
                            } catch (ExecutionException e3) {
                                throw new RuntimeException(e3);
                            }
                        } catch (InterruptedException unused2) {
                            ((Handler) c0048n.f175c).post(new RunnableC0145a((C0001b) c0048n.f174b, i7, i6));
                        }
                    }
                } else {
                    C0757j0 c0757j02 = AbstractC0153i.f480a;
                    String str4 = ((String) c0149e.f469e) + "-" + i4;
                    Typeface typeface2 = (Typeface) AbstractC0153i.f480a.m2085f(str4);
                    if (typeface2 != null) {
                        handler.post(new RunnableC0024e(c0001b, 3, typeface2));
                        typefaceMo225u = typeface2;
                    } else {
                        C0151g c0151g = new C0151g(i6, c0048n);
                        synchronized (AbstractC0153i.f482c) {
                            try {
                                C1031j c1031j = AbstractC0153i.f483d;
                                ArrayList arrayList = (ArrayList) c1031j.get(str4);
                                if (arrayList != null) {
                                    arrayList.add(c0151g);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(c0151g);
                                    c1031j.put(str4, arrayList2);
                                    CallableC0150f callableC0150f = new CallableC0150f(str4, context, c0149e, i4, 1);
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC0153i.f481b;
                                    C0151g c0151g2 = new C0151g(i5, str4);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC0158n runnableC0158n = new RunnableC0158n();
                                    runnableC0158n.f493b = callableC0150f;
                                    runnableC0158n.f494c = c0151g2;
                                    runnableC0158n.f495d = handler2;
                                    threadPoolExecutor.execute(runnableC0158n);
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceMo225u = f245a.mo225u(context, (C0061g) interfaceC0060f, resources, i4);
            if (abstractC0056b != null) {
                if (typefaceMo225u != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0068n(abstractC0056b, i6, typefaceMo225u));
                } else {
                    abstractC0056b.m336a(-3);
                }
            }
        }
        if (typefaceMo225u != null) {
            f246b.m2089j(m366b(resources, i2, str, i3, i4), typefaceMo225u);
        }
        return typefaceMo225u;
    }

    /* JADX INFO: renamed from: b */
    public static String m366b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
