package p099y;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: y.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1113p extends View {

    /* JADX INFO: renamed from: a */
    public boolean f4800a;

    public C1113p(Context context) {
        super(context);
        this.f4800a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f4800a = z2;
    }

    public void setGuidelineBegin(int i2) {
        C1102e c1102e = (C1102e) getLayoutParams();
        if (this.f4800a && c1102e.f4625a == i2) {
            return;
        }
        c1102e.f4625a = i2;
        setLayoutParams(c1102e);
    }

    public void setGuidelineEnd(int i2) {
        C1102e c1102e = (C1102e) getLayoutParams();
        if (this.f4800a && c1102e.f4627b == i2) {
            return;
        }
        c1102e.f4627b = i2;
        setLayoutParams(c1102e);
    }

    public void setGuidelinePercent(float f) {
        C1102e c1102e = (C1102e) getLayoutParams();
        if (this.f4800a && c1102e.f4629c == f) {
            return;
        }
        c1102e.f4629c = f;
        setLayoutParams(c1102e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
