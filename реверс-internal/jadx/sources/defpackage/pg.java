package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pg implements og, e92 {
    public static final pg e = new pg();
    public static final pg f = new pg();

    @Override // defpackage.e92
    public a92 d(Context context, ix ixVar) {
        ixVar.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f2 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new a92(bounds, f2);
    }

    @Override // defpackage.og
    public Rect e(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
