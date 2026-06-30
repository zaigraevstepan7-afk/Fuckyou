package p099y;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p093v.C1066g;

/* JADX INFO: renamed from: y.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1117t extends AbstractC1100c {

    /* JADX INFO: renamed from: h */
    public boolean f4811h;

    /* JADX INFO: renamed from: i */
    public boolean f4812i;

    @Override // p099y.AbstractC1100c
    /* JADX INFO: renamed from: e */
    public final void mo2735e(ConstraintLayout constraintLayout) {
        m2734d(constraintLayout);
    }

    @Override // p099y.AbstractC1100c
    /* JADX INFO: renamed from: g */
    public void mo2737g(AttributeSet attributeSet) {
        super.mo2737g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1115r.f4802b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f4811h = true;
                } else if (index == 22) {
                    this.f4812i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1242j(C1066g c1066g, int i2, int i3);

    @Override // p099y.AbstractC1100c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4811h || this.f4812i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f4592b; i2++) {
                    View view = (View) constraintLayout.f1420a.get(this.f4591a[i2]);
                    if (view != null) {
                        if (this.f4811h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f4812i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2734d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2734d((ConstraintLayout) parent);
    }
}
