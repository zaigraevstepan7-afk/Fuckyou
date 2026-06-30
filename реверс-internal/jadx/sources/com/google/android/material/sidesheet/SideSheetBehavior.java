package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.reddit.secondpage.R;
import defpackage.al;
import defpackage.eu0;
import defpackage.fu0;
import defpackage.nu0;
import defpackage.tb1;
import defpackage.y41;
import defpackage.zm1;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends al {
    public final fu0 f;
    public final ColorStateList g;
    public final zm1 h;
    public int i;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList colorStateListT;
        new y41(this);
        this.i = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tb1.i);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.g = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListT = nu0.t(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateListT;
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.h = zm1.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        zm1 zm1Var = this.h;
        if (zm1Var != null) {
            fu0 fu0Var = new fu0(zm1Var);
            this.f = fu0Var;
            fu0Var.h(context);
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                fu0 fu0Var2 = this.f;
                eu0 eu0Var = fu0Var2.b;
                if (eu0Var.c != colorStateList) {
                    eu0Var.c = colorStateList;
                    fu0Var2.onStateChange(fu0Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new y41(this);
        this.i = 5;
        new LinkedHashSet();
    }
}
