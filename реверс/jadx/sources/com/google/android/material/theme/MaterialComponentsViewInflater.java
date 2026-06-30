package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p008E0.C0073a;
import p023M0.C0219y;
import p025N0.C0300a;
import p027O0.AbstractC0322a;
import p036T.AbstractC0372b;
import p060e.C0651G;
import p074l.C0873F;
import p074l.C0927e0;
import p074l.C0956o;
import p074l.C0962q;
import p074l.C0965r;
import p079n0.AbstractC1013a;
import p096w0.C1092c;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0651G {
    @Override // p060e.C0651G
    /* JADX INFO: renamed from: a */
    public final C0956o mo1786a(Context context, AttributeSet attributeSet) {
        return new C0219y(context, attributeSet);
    }

    @Override // p060e.C0651G
    /* JADX INFO: renamed from: b */
    public final C0962q mo1787b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p060e.C0651G
    /* JADX INFO: renamed from: c */
    public final C0965r mo1788c(Context context, AttributeSet attributeSet) {
        return new C1092c(context, attributeSet);
    }

    @Override // p060e.C0651G
    /* JADX INFO: renamed from: d */
    public final C0873F mo1789d(Context context, AttributeSet attributeSet) {
        C0073a c0073a = new C0073a(AbstractC0322a.m979a(context, attributeSet, R.attr.resc, R.style.resc), attributeSet);
        Context context2 = c0073a.getContext();
        TypedArray typedArrayM279h = AbstractC0047m.m279h(context2, attributeSet, AbstractC1013a.f4036r, R.attr.resc, R.style.resc, new int[0]);
        if (typedArrayM279h.hasValue(0)) {
            AbstractC0372b.m1005c(c0073a, AbstractC0016e.m162K(context2, typedArrayM279h, 0));
        }
        c0073a.f235f = typedArrayM279h.getBoolean(1, false);
        typedArrayM279h.recycle();
        return c0073a;
    }

    @Override // p060e.C0651G
    /* JADX INFO: renamed from: e */
    public final C0927e0 mo1790e(Context context, AttributeSet attributeSet) {
        C0300a c0300a = new C0300a(AbstractC0322a.m979a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0300a.getContext();
        if (AbstractC0016e.m191p0(context2, R.attr.resc, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1013a.f4040v;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM927h = C0300a.m927h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM927h == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1013a.f4039u);
                    int iM927h2 = C0300a.m927h(c0300a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM927h2 >= 0) {
                        c0300a.setLineHeight(iM927h2);
                    }
                }
            }
        }
        return c0300a;
    }
}
