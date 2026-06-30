package p074l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0917b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f3703a;

    public C0917b(ActionBarContainer actionBarContainer) {
        this.f3703a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3703a;
        if (actionBarContainer.f1291g) {
            Drawable drawable = actionBarContainer.f1290f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1288d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1289e;
        if (drawable3 == null || !actionBarContainer.f1292h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3703a;
        if (actionBarContainer.f1291g) {
            if (actionBarContainer.f1290f != null) {
                actionBarContainer.f1288d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1288d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
