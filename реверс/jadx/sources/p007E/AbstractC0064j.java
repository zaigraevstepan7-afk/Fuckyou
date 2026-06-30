package p007E;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: E.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064j {
    /* JADX INFO: renamed from: a */
    public static Drawable m344a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m345b(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }
}
