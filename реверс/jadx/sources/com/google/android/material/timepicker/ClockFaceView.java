package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0016e;
import p024N.AbstractC0240S;
import p079n0.AbstractC1013a;
import p099y.C1106i;
import p099y.C1107j;
import p099y.C1111n;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC0636e implements InterfaceC0635d {

    /* JADX INFO: renamed from: A */
    public final float[] f2415A;

    /* JADX INFO: renamed from: B */
    public final int f2416B;

    /* JADX INFO: renamed from: C */
    public final int f2417C;

    /* JADX INFO: renamed from: D */
    public final int f2418D;

    /* JADX INFO: renamed from: E */
    public final int f2419E;

    /* JADX INFO: renamed from: F */
    public final String[] f2420F;

    /* JADX INFO: renamed from: G */
    public float f2421G;

    /* JADX INFO: renamed from: H */
    public final ColorStateList f2422H;

    /* JADX INFO: renamed from: t */
    public final ClockHandView f2423t;

    /* JADX INFO: renamed from: u */
    public final Rect f2424u;

    /* JADX INFO: renamed from: v */
    public final RectF f2425v;

    /* JADX INFO: renamed from: w */
    public final Rect f2426w;

    /* JADX INFO: renamed from: x */
    public final SparseArray f2427x;

    /* JADX INFO: renamed from: y */
    public final C0634c f2428y;

    /* JADX INFO: renamed from: z */
    public final int[] f2429z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2424u = new Rect();
        this.f2425v = new RectF();
        this.f2426w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2427x = sparseArray;
        this.f2415A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4023e, R.attr.resc, R.style.resc);
        Resources resources = getResources();
        ColorStateList colorStateListM162K = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 1);
        this.f2422H = colorStateListM162K;
        LayoutInflater.from(context).inflate(R.layout.resc, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.resc);
        this.f2423t = clockHandView;
        this.f2416B = resources.getDimensionPixelSize(R.dimen.resc);
        int colorForState = colorStateListM162K.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM162K.getDefaultColor());
        this.f2429z = new int[]{colorForState, colorForState, colorStateListM162K.getDefaultColor()};
        clockHandView.f2432c.add(this);
        int defaultColor = AbstractC0016e.m160I(context, R.color.resc).getDefaultColor();
        ColorStateList colorStateListM162K2 = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM162K2 != null ? colorStateListM162K2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0633b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2428y = new C0634c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2420F = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f2420F.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2420F.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.resc, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f2420F[i2]);
                textView.setTag(R.id.resc, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.resc, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                AbstractC0240S.m785p(textView, this.f2428y);
                textView.setTextColor(this.f2422H);
            }
        }
        ClockHandView clockHandView2 = this.f2423t;
        if (clockHandView2.f2431b && !z2) {
            clockHandView2.f2442m = 1;
        }
        clockHandView2.f2431b = z2;
        clockHandView2.invalidate();
        this.f2417C = resources.getDimensionPixelSize(R.dimen.resc);
        this.f2418D = resources.getDimensionPixelSize(R.dimen.resc);
        this.f2419E = resources.getDimensionPixelSize(R.dimen.resc);
    }

    @Override // com.google.android.material.timepicker.AbstractC0636e
    /* JADX INFO: renamed from: m */
    public final void mo1792m() {
        C1111n c1111n = new C1111n();
        c1111n.m2757b(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.resc && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.resc);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2449r * 0.66f) : this.f2449r;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c1111n.f4799c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1106i());
                }
                C1107j c1107j = ((C1106i) map2.get(Integer.valueOf(id))).f4695d;
                c1107j.f4765z = R.id.resc;
                c1107j.f4699A = iRound;
                c1107j.f4700B = size;
                size += 360.0f / list.size();
            }
        }
        c1111n.m2756a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2427x;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1793n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2423t.f2436g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f2427x;
            int size = sparseArray.size();
            rectF = this.f2425v;
            rect = this.f2424u;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2426w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2429z, this.f2415A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2420F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m1793n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f2419E / Math.max(Math.max(this.f2417C / displayMetrics.heightPixels, this.f2418D / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
