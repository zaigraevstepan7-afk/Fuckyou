package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p024N.C0295x0;
import p024N.InterfaceC0282r;
import p099y.AbstractC1115r;
import p099y.C1111n;

/* JADX INFO: renamed from: com.google.android.material.datepicker.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0617l implements InterfaceC0282r {

    /* JADX INFO: renamed from: a */
    public final Object f2223a;

    /* JADX INFO: renamed from: b */
    public int f2224b;

    /* JADX INFO: renamed from: c */
    public int f2225c;

    public C0617l(View view) {
        this.f2223a = view;
    }

    @Override // p024N.InterfaceC0282r
    /* JADX INFO: renamed from: p */
    public C0295x0 mo51p(View view, C0295x0 c0295x0) {
        int i2 = c0295x0.f882a.mo896f(7).f239b;
        View view2 = (View) this.f2223a;
        int i3 = this.f2224b;
        if (i3 >= 0) {
            view2.getLayoutParams().height = i3 + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2225c + i2, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0295x0;
    }

    public C0617l(Context context, XmlResourceParser xmlResourceParser) {
        this.f2223a = new ArrayList();
        this.f2225c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1115r.f4808h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f2224b = typedArrayObtainStyledAttributes.getResourceId(index, this.f2224b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2225c);
                this.f2225c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1111n().m2757b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0617l(View view, int i2, int i3) {
        this.f2224b = i2;
        this.f2223a = view;
        this.f2225c = i3;
    }
}
