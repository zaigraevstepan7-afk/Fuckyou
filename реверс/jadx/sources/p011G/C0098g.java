package p011G;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: G.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0098g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f294a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f295b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f296c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f297d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i2 = this.f294a;
        Drawable.ConstantState constantState = this.f295b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0097f c0097f = new C0097f();
        c0097f.f291d = this;
        Drawable.ConstantState constantState = this.f295b;
        if (constantState != null) {
            c0097f.m444h(constantState.newDrawable(resources));
        }
        C0097f.m437a();
        return c0097f;
    }
}
