package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.reddit.secondpage.R;
import defpackage.al;
import defpackage.eu0;
import defpackage.fu0;
import defpackage.lg;
import defpackage.nu0;
import defpackage.qt0;
import defpackage.tb1;
import defpackage.yc;
import defpackage.zm1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends al {
    public final boolean f;
    public int g;
    public boolean h;
    public final fu0 i;
    public final ColorStateList j;
    public final boolean k;
    public final zm1 l;
    public boolean m;
    public final ValueAnimator n;
    public final int o;
    public final boolean p;
    public int q;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int resourceId;
        ColorStateList colorStateListT;
        this.f = true;
        new qt0(this);
        this.q = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tb1.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListT = nu0.t(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateListT;
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.l = zm1.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        zm1 zm1Var = this.l;
        if (zm1Var != null) {
            fu0 fu0Var = new fu0(zm1Var);
            this.i = fu0Var;
            fu0Var.h(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                fu0 fu0Var2 = this.i;
                eu0 eu0Var = fu0Var2.b;
                if (eu0Var.c != colorStateList) {
                    eu0Var.c = colorStateList;
                    fu0Var2.onStateChange(fu0Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.n.addUpdateListener(new lg(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            W(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            W(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.p != z) {
            this.p = z;
            if (!z && this.q == 5 && this.q != 4) {
                this.q = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f != z2) {
            this.f = z2;
            int i2 = (z2 && this.q == 6) ? 3 : this.q;
            if (this.q != i2) {
                this.q = i2;
            }
            X(this.q);
        }
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            yc.p("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                yc.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.o = dimensionPixelOffset;
            X(this.q);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                yc.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.o = i3;
            X(this.q);
        }
        typedArrayObtainStyledAttributes.getInt(14, 500);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, false);
        typedArrayObtainStyledAttributes.getBoolean(22, false);
        typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.k = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void W(int i) {
        boolean z = this.h;
        if (i == -1) {
            if (z) {
                return;
            }
            this.h = true;
        } else if (z || this.g != i) {
            this.h = false;
            this.g = Math.max(0, i);
        }
    }

    public final void X(int i) {
        fu0 fu0Var;
        if (i == 2) {
            return;
        }
        boolean z = this.q == 3 && this.k;
        if (this.m == z || (fu0Var = this.i) == null) {
            return;
        }
        this.m = z;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(fu0Var.b.h, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.m ? 0.0f : 1.0f;
        eu0 eu0Var = fu0Var.b;
        if (eu0Var.h != f) {
            eu0Var.h = f;
            fu0Var.f = true;
            fu0Var.g = true;
            fu0Var.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.f = true;
        new qt0(this);
        this.q = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
    }
}
