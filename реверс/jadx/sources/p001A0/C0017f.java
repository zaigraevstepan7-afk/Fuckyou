package p001A0;

import android.graphics.drawable.Drawable;
import p065g.AbstractC0712h;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0017f extends AbstractC0712h {

    /* JADX INFO: renamed from: b */
    public final int f38b;

    /* JADX INFO: renamed from: c */
    public final int f39c;

    public C0017f(Drawable drawable, int i2, int i3) {
        super(drawable);
        this.f38b = i2;
        this.f39c = i3;
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f39c;
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38b;
    }
}
