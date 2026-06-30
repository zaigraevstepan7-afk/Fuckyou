package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jx implements ix, e92 {
    public static final jx e = new jx();
    public static final jx f = new jx();

    @Override // defpackage.e92
    public a92 d(Context context, ix ixVar) {
        ixVar.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new a92(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.ix
    public float g(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
