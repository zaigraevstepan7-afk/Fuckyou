package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p015I0.C0109e;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0608c {

    /* JADX INFO: renamed from: a */
    public final C0109e f2194a;

    /* JADX INFO: renamed from: b */
    public final C0109e f2195b;

    public C0608c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0016e.m197s0(context, R.attr.resc, C0616k.class.getCanonicalName()).data, AbstractC1013a.f4032n);
        C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM162K = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 7);
        this.f2194a = C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2195b = C0109e.m454a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM162K.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
