package p074l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p001A0.AbstractC0012a;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p071j.C0788c;
import p072k.ViewTreeObserverOnGlobalLayoutListenerC0807d;

/* JADX INFO: renamed from: l.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0900T extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f3609i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C0959p f3610a;

    /* JADX INFO: renamed from: b */
    public final Context f3611b;

    /* JADX INFO: renamed from: c */
    public final C0883K f3612c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f3613d;

    /* JADX INFO: renamed from: e */
    public final boolean f3614e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0898S f3615f;

    /* JADX INFO: renamed from: g */
    public int f3616g;

    /* JADX INFO: renamed from: h */
    public final Rect f3617h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0900T(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f3617h = new Rect();
        AbstractC0911Y0.m2344a(this, getContext());
        int[] iArr = AbstractC0641a.f2500u;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, com.reddit.frontpage.R.attr.resc);
        this.f3610a = new C0959p(this);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3611b = new C0788c(context, resourceId);
        } else {
            this.f3611b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3609i, com.reddit.frontpage.R.attr.resc, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c0270lM838m.m851o();
                    this.f3614e = true;
                    spinnerAdapter = this.f3613d;
                    if (spinnerAdapter != null) {
                    }
                    this.f3610a.m2406d(attributeSet, com.reddit.frontpage.R.attr.resc);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC0887M dialogInterfaceOnClickListenerC0887M = new DialogInterfaceOnClickListenerC0887M(this);
            this.f3615f = dialogInterfaceOnClickListenerC0887M;
            dialogInterfaceOnClickListenerC0887M.f3580c = typedArray.getString(2);
        } else if (i2 == 1) {
            C0893P c0893p = new C0893P(this, this.f3611b, attributeSet);
            C0270l c0270lM838m2 = C0270l.m838m(this.f3611b, attributeSet, iArr, com.reddit.frontpage.R.attr.resc);
            this.f3616g = ((TypedArray) c0270lM838m2.f837b).getLayoutDimension(3, -2);
            c0893p.m2293k(c0270lM838m2.m845h(1));
            c0893p.f3590D = typedArray.getString(2);
            c0270lM838m2.m851o();
            this.f3615f = c0893p;
            this.f3612c = new C0883K(this, this, c0893p);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.reddit.frontpage.R.layout.resc);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0270lM838m.m851o();
        this.f3614e = true;
        spinnerAdapter = this.f3613d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f3613d = null;
        }
        this.f3610a.m2406d(attributeSet, com.reddit.frontpage.R.attr.resc);
    }

    /* JADX INFO: renamed from: a */
    public final int m2330a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f3617h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        return interfaceC0898S != null ? interfaceC0898S.mo2303d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        return interfaceC0898S != null ? interfaceC0898S.mo2306j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3615f != null ? this.f3616g : super.getDropDownWidth();
    }

    public final InterfaceC0898S getInternalPopup() {
        return this.f3615f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        return interfaceC0898S != null ? interfaceC0898S.mo2309m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3611b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        return interfaceC0898S != null ? interfaceC0898S.mo2301b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S == null || !interfaceC0898S.mo2300a()) {
            return;
        }
        interfaceC0898S.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3615f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2330a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0895Q c0895q = (C0895Q) parcelable;
        super.onRestoreInstanceState(c0895q.getSuperState());
        if (!c0895q.f3597a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0807d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0895Q c0895q = new C0895Q(super.onSaveInstanceState());
        InterfaceC0898S interfaceC0898S = this.f3615f;
        c0895q.f3597a = interfaceC0898S != null && interfaceC0898S.mo2300a();
        return c0895q;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0883K c0883k = this.f3612c;
        if (c0883k == null || !c0883k.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S == null) {
            return super.performClick();
        }
        if (interfaceC0898S.mo2300a()) {
            return true;
        }
        this.f3615f.mo2304f(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0898S.mo2310o(i2);
            interfaceC0898S.mo2302c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S != null) {
            interfaceC0898S.mo2308l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3615f != null) {
            this.f3616g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S != null) {
            interfaceC0898S.mo2307k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0383m.m1057w(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S != null) {
            interfaceC0898S.mo2305h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3610a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3614e) {
            this.f3613d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0898S interfaceC0898S = this.f3615f;
        if (interfaceC0898S != null) {
            Context context = this.f3611b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0889N c0889n = new C0889N();
            c0889n.f3582a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0889n.f3583b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC0012a.m115u(spinnerAdapter)) {
                AbstractC0885L.m2299a(AbstractC0012a.m100f(spinnerAdapter), theme);
            }
            interfaceC0898S.mo2296n(c0889n);
        }
    }
}
