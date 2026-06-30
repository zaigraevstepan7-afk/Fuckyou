package p075l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0988d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f3909a;

    public C0988d(Drawable.ConstantState constantState) {
        this.f3909a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3909a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3909a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0989e c0989e = new C0989e(null);
        Drawable drawableNewDrawable = this.f3909a.newDrawable();
        c0989e.f3918a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0989e.f3915f);
        return c0989e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0989e c0989e = new C0989e(null);
        Drawable drawableNewDrawable = this.f3909a.newDrawable(resources);
        c0989e.f3918a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0989e.f3915f);
        return c0989e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0989e c0989e = new C0989e(null);
        Drawable drawableNewDrawable = this.f3909a.newDrawable(resources, theme);
        c0989e.f3918a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0989e.f3915f);
        return c0989e;
    }
}
