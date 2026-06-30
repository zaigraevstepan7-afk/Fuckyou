package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0637f;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p005C0.AbstractC0047m;
import p005C0.C0035a;
import p015I0.C0105a;
import p015I0.C0116l;
import p015I0.C0117m;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p079n0.AbstractC1013a;
import p090t0.C1053d;
import p090t0.C1054e;
import p090t0.C1055f;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f2142k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2143a;

    /* JADX INFO: renamed from: b */
    public final C1055f f2144b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f2145c;

    /* JADX INFO: renamed from: d */
    public final C1053d f2146d;

    /* JADX INFO: renamed from: e */
    public Integer[] f2147e;

    /* JADX INFO: renamed from: f */
    public boolean f2148f;

    /* JADX INFO: renamed from: g */
    public boolean f2149g;

    /* JADX INFO: renamed from: h */
    public boolean f2150h;

    /* JADX INFO: renamed from: i */
    public final int f2151i;

    /* JADX INFO: renamed from: j */
    public HashSet f2152j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, R.attr.resc, R.style.resc), attributeSet, R.attr.resc);
        this.f2143a = new ArrayList();
        this.f2144b = new C1055f(this);
        this.f2145c = new LinkedHashSet();
        this.f2146d = new C1053d(this);
        this.f2148f = false;
        this.f2152j = new HashSet();
        TypedArray typedArrayM279h = AbstractC0047m.m279h(getContext(), attributeSet, AbstractC1013a.f4031m, R.attr.resc, R.style.resc, new int[0]);
        setSingleSelection(typedArrayM279h.getBoolean(3, false));
        this.f2151i = typedArrayM279h.getResourceId(1, -1);
        this.f2150h = typedArrayM279h.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM279h.getBoolean(0, true));
        typedArrayM279h.recycle();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m1713c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1713c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m1713c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2144b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1711a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m1712b(materialButton.getId(), materialButton.f2139o);
        C0117m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2143a.add(new C1054e(shapeAppearanceModel.f387e, shapeAppearanceModel.f390h, shapeAppearanceModel.f388f, shapeAppearanceModel.f389g));
        materialButton.setEnabled(isEnabled());
        AbstractC0240S.m785p(materialButton, new C0035a(3, this));
    }

    /* JADX INFO: renamed from: b */
    public final void m1712b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f2152j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f2149g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f2150h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        m1714d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1713c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m1714d(Set set) {
        HashSet hashSet = this.f2152j;
        this.f2152j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f2148f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f2148f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2145c.iterator();
                while (it.hasNext()) {
                    ((C0637f) it.next()).m1796a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2146d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f2147e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m1715e() {
        C1054e c1054e;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                C0116l c0116lM495e = materialButton.getShapeAppearanceModel().m495e();
                C1054e c1054e2 = (C1054e) this.f2143a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0105a c0105a = C1054e.f4210e;
                    if (i2 == firstVisibleChildIndex) {
                        c1054e = z2 ? AbstractC0047m.m278g(this) ? new C1054e(c0105a, c0105a, c1054e2.f4212b, c1054e2.f4213c) : new C1054e(c1054e2.f4211a, c1054e2.f4214d, c0105a, c0105a) : new C1054e(c1054e2.f4211a, c0105a, c1054e2.f4212b, c0105a);
                    } else if (i2 == lastVisibleChildIndex) {
                        c1054e = z2 ? AbstractC0047m.m278g(this) ? new C1054e(c1054e2.f4211a, c1054e2.f4214d, c0105a, c0105a) : new C1054e(c0105a, c0105a, c1054e2.f4212b, c1054e2.f4213c) : new C1054e(c0105a, c1054e2.f4214d, c0105a, c1054e2.f4213c);
                    } else {
                        c1054e2 = null;
                    }
                    c1054e2 = c1054e;
                }
                if (c1054e2 == null) {
                    c0116lM495e.m490c(0.0f);
                } else {
                    c0116lM495e.f375e = c1054e2.f4211a;
                    c0116lM495e.f378h = c1054e2.f4214d;
                    c0116lM495e.f376f = c1054e2.f4212b;
                    c0116lM495e.f377g = c1054e2.f4213c;
                }
                materialButton.setShapeAppearanceModel(c0116lM495e.m489a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2149g || this.f2152j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2152j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f2152j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f2147e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2151i;
        if (i2 != -1) {
            m1714d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2149g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        m1715e();
        m1711a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2143a.remove(iIndexOfChild);
        }
        m1715e();
        m1711a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2150h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2149g != z2) {
            this.f2149g = z2;
            m1714d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f2149g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
