package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wb {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static wb c;
    public he1 a;

    public static synchronized void b() {
        if (c == null) {
            wb wbVar = new wb();
            c = wbVar;
            wbVar.a = he1.c();
            he1 he1Var = c.a;
            vb vbVar = new vb();
            synchronized (he1Var) {
                he1Var.e = vbVar;
            }
        }
    }

    public static void c(Drawable drawable, a12 a12Var, int[] iArr) {
        PorterDuff.Mode mode = he1.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = a12Var.d;
            if (!z && !a12Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterF = null;
            ColorStateList colorStateList = z ? a12Var.a : null;
            PorterDuff.Mode mode2 = a12Var.c ? a12Var.b : he1.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterF = he1.f(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.d(context, i);
    }
}
