package p074l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: l.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0875G extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C0871E f3534a;

    public C0875G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        AbstractC0911Y0.m2344a(this, getContext());
        C0871E c0871e = new C0871E(this);
        this.f3534a = c0871e;
        c0871e.mo2279b(attributeSet, R.attr.resc);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f3534a.f3529c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
