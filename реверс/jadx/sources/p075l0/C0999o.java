package p075l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0999o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f3960a;

    /* JADX INFO: renamed from: b */
    public C0998n f3961b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f3962c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f3963d;

    /* JADX INFO: renamed from: e */
    public boolean f3964e;

    /* JADX INFO: renamed from: f */
    public Bitmap f3965f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3966g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3967h;

    /* JADX INFO: renamed from: i */
    public int f3968i;

    /* JADX INFO: renamed from: j */
    public boolean f3969j;

    /* JADX INFO: renamed from: k */
    public boolean f3970k;

    /* JADX INFO: renamed from: l */
    public Paint f3971l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3960a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1001q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1001q(this);
    }
}
