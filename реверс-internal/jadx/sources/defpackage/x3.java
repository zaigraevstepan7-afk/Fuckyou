package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(h4 h4Var, int i) {
        super(0);
        this.f = i;
        this.g = h4Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        switch (this.f) {
            case 0:
                Boolean bool = (Boolean) this.g.s.getValue();
                bool.getClass();
                return bool;
            case 1:
                this.g.getAndroidViewsHandler();
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                LocaleList locales = this.g.getConfiguration().getLocales();
                bs0 bs0Var = new bs0(new cs0(locales));
                if (locales.isEmpty()) {
                    bs0Var = new bs0(new cs0(LocaleList.getDefault()));
                }
                LocaleList localeList = bs0Var.a.a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Locale locale = localeList.get(i);
                    locale.getClass();
                    arrayList.add(new zr0(locale));
                }
                return new as0(arrayList);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                l91 l91Var = h4.J0;
                h4 h4Var = this.g;
                if (Build.VERSION.SDK_INT > 28 && h4Var.isAttachedToWindow()) {
                    if (h4.O0 == null) {
                        t3 t3Var = new t3();
                        h4.O0 = t3Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (h4.K0 == null) {
                                h4.K0 = Class.forName("android.os.SystemProperties");
                            }
                            if (h4.M0 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = h4.K0;
                                h4.M0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = h4.M0;
                            if (method != null) {
                                method.invoke(null, t3Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    sx0 sx0Var = h4.N0;
                    synchronized (sx0Var) {
                        sx0Var.a(h4Var);
                    }
                }
                return t32.a;
            default:
                h4 h4Var2 = this.g;
                MotionEvent motionEvent = h4Var2.o0;
                if (motionEvent != null) {
                    boolean zContains = hk.H(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = h4Var2.o0;
                    boolean z = motionEvent2 != null && motionEvent2.getButtonState() == 0;
                    if (zContains && z) {
                        h4Var2.p0 = SystemClock.uptimeMillis();
                        h4Var2.post(h4Var2.w0);
                    }
                }
                h4Var2.C0.a();
                return t32.a;
        }
    }
}
