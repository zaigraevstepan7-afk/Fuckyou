package p074l;

import android.graphics.Canvas;
import p065g.AbstractC0712h;

/* JADX INFO: renamed from: l.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0976v0 extends AbstractC0712h {

    /* JADX INFO: renamed from: b */
    public boolean f3862b;

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f3862b) {
            super.draw(canvas);
        }
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f3862b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f3862b) {
            super.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f3862b) {
            return this.f2844a.setState(iArr);
        }
        return false;
    }

    @Override // p065g.AbstractC0712h, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f3862b) {
            return super.setVisible(z2, z3);
        }
        return false;
    }
}
