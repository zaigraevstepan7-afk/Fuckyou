package p075l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1000p extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f3972a;

    public C1000p(Drawable.ConstantState constantState) {
        this.f3972a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3972a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3972a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1001q c1001q = new C1001q();
        c1001q.f3918a = (VectorDrawable) this.f3972a.newDrawable();
        return c1001q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1001q c1001q = new C1001q();
        c1001q.f3918a = (VectorDrawable) this.f3972a.newDrawable(resources);
        return c1001q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1001q c1001q = new C1001q();
        c1001q.f3918a = (VectorDrawable) this.f3972a.newDrawable(resources, theme);
        return c1001q;
    }
}
