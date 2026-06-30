package p004C;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.DialogC0467l;
import androidx.activity.ExecutorC0465j;
import androidx.emoji2.text.C0502p;
import androidx.lifecycle.C0558B;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0636e;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p006D.AbstractC0052b;
import p006D.AbstractC0054d;
import p009F.AbstractC0080g;
import p015I0.C0109e;
import p016J.AbstractC0139k;
import p017J0.C0144e;
import p018K.C0155k;
import p023M0.C0199e;
import p023M0.C0207m;
import p036T.AbstractC0383m;
import p042W.C0404e;
import p051a1.AbstractC0451c;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: C.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0020a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52b;

    public /* synthetic */ RunnableC0020a(int i2, Object obj) {
        this.f51a = i2;
        this.f52b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object systemService = null;
        switch (this.f51a) {
            case 0:
                Activity activity = (Activity) this.f52b;
                if (activity.isFinishing()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    Class cls = AbstractC0026g.f66a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0026g.f66a;
                boolean z2 = i2 == 26 || i2 == 27;
                Method method = AbstractC0026g.f71f;
                if ((!z2 || method != null) && (AbstractC0026g.f70e != null || AbstractC0026g.f69d != null)) {
                    try {
                        Object obj2 = AbstractC0026g.f68c.get(activity);
                        if (obj2 != null && (obj = AbstractC0026g.f67b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0025f c0025f = new C0025f(activity);
                            application.registerActivityLifecycleCallbacks(c0025f);
                            Handler handler = AbstractC0026g.f72g;
                            handler.post(new RunnableC0024e(c0025f, 0, obj2));
                            try {
                                if (i2 == 26 || i2 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC0024e(application, c0025f, 1, false));
                                return;
                            } finally {
                                handler.post(new RunnableC0024e(application, c0025f, 1, false));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                View view = (View) this.f52b;
                Context context = view.getContext();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 23) {
                    systemService = AbstractC0052b.m318b(context, InputMethodManager.class);
                } else {
                    String strM319c = i3 >= 23 ? AbstractC0052b.m319c(context, InputMethodManager.class) : (String) AbstractC0054d.f179a.get(InputMethodManager.class);
                    if (strM319c != null) {
                        systemService = context.getSystemService(strM319c);
                    }
                }
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                return;
            case 2:
                C0144e c0144e = (C0144e) this.f52b;
                c0144e.f455c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0144e.f457e;
                C0404e c0404e = sideSheetBehavior.f2315i;
                if (c0404e != null && c0404e.m1120f()) {
                    c0144e.m554a(c0144e.f454b);
                    return;
                } else {
                    if (sideSheetBehavior.f2314h == 2) {
                        sideSheetBehavior.m1757r(c0144e.f454b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0199e) this.f52b).m642t(true);
                return;
            case 4:
                C0207m c0207m = (C0207m) this.f52b;
                boolean zIsPopupShowing = c0207m.f666h.isPopupShowing();
                c0207m.m653t(zIsPopupShowing);
                c0207m.f671m = zIsPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f52b).f2367d.requestLayout();
                return;
            case 6:
                ((AbstractActivityC0669k) this.f52b).invalidateOptionsMenu();
                return;
            case 7:
                ExecutorC0465j executorC0465j = (ExecutorC0465j) this.f52b;
                Runnable runnable = executorC0465j.f1175b;
                if (runnable != null) {
                    runnable.run();
                    executorC0465j.f1175b = null;
                    return;
                }
                return;
            case 8:
                DialogC0467l.m1169a((DialogC0467l) this.f52b);
                return;
            case 9:
                C0502p c0502p = (C0502p) this.f52b;
                synchronized (c0502p.f1541d) {
                    try {
                        if (c0502p.f1545h == null) {
                            return;
                        }
                        try {
                            C0155k c0155kM1314c = c0502p.m1314c();
                            int i4 = c0155kM1314c.f490e;
                            if (i4 == 2) {
                                synchronized (c0502p.f1541d) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                Method method2 = AbstractC0139k.f445b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0109e c0109e = c0502p.f1540c;
                                Context context2 = c0502p.f1538a;
                                c0109e.getClass();
                                Typeface typefaceMo227v = AbstractC0080g.f245a.mo227v(context2, new C0155k[]{c0155kM1314c}, 0);
                                MappedByteBuffer mappedByteBufferM181j0 = AbstractC0016e.m181j0(c0502p.f1538a, c0155kM1314c.f486a);
                                if (mappedByteBufferM181j0 == null || typefaceMo227v == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0010k c0010k = new C0010k(typefaceMo227v, AbstractC0383m.m1034X(mappedByteBufferM181j0));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0502p.f1541d) {
                                        try {
                                            AbstractC0383m abstractC0383m = c0502p.f1545h;
                                            if (abstractC0383m != null) {
                                                abstractC0383m.mo1065P(c0010k);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    c0502p.m1312a();
                                    return;
                                } finally {
                                    Method method3 = AbstractC0139k.f445b;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0502p.f1541d) {
                                try {
                                    AbstractC0383m abstractC0383m2 = c0502p.f1545h;
                                    if (abstractC0383m2 != null) {
                                        abstractC0383m2.mo1062M(th2);
                                    }
                                    c0502p.m1312a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 10:
                C0558B c0558b = (C0558B) this.f52b;
                AbstractC0451c.m1146e(c0558b, "this$0");
                int i5 = c0558b.f1828b;
                C0588t c0588t = c0558b.f1832f;
                if (i5 == 0) {
                    c0558b.f1829c = true;
                    c0588t.m1484d(EnumC0580l.ON_PAUSE);
                }
                if (c0558b.f1827a == 0 && c0558b.f1829c) {
                    c0588t.m1484d(EnumC0580l.ON_STOP);
                    c0558b.f1830d = true;
                    return;
                }
                return;
            case 11:
                ((AbstractC0636e) this.f52b).mo1792m();
                return;
            default:
                ((CarouselLayoutManager) this.f52b).m2009o0();
                return;
        }
    }
}
