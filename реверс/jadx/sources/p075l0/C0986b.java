package p075l0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p011G.AbstractC0092a;
import p096w0.C1090a;
import p096w0.C1092c;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0986b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1090a f3904a;

    public C0986b(C1090a c1090a) {
        this.f3904a = c1090a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3904a.f4490b.f4506o;
        if (colorStateList != null) {
            AbstractC0092a.m429h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C1092c c1092c = this.f3904a.f4490b;
        ColorStateList colorStateList = c1092c.f4506o;
        if (colorStateList != null) {
            AbstractC0092a.m428g(drawable, colorStateList.getColorForState(c1092c.f4510s, colorStateList.getDefaultColor()));
        }
    }
}
