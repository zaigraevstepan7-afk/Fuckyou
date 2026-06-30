package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0682x {
    static {
        ZLoader.registerNativesForClass(118, AbstractC0682x.class);
        Hidden0.special_clinit_118_00(AbstractC0682x.class);
    }

    /* JADX INFO: renamed from: a */
    public static native OnBackInvokedDispatcher m1912a(Activity activity);

    /* JADX INFO: renamed from: b */
    public static native OnBackInvokedCallback m1913b(Object obj, LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D);

    /* JADX INFO: renamed from: c */
    public static native void m1914c(Object obj, Object obj2);
}
