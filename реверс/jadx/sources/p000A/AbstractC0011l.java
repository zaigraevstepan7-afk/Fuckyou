package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: A.l */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0011l {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f26a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f27b = null;

    static {
        ZLoader.registerNativesForClass(11, AbstractC0011l.class);
        Hidden0.special_clinit_11_00(AbstractC0011l.class);
    }

    /* JADX INFO: renamed from: a */
    public static native void m92a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix);
}
