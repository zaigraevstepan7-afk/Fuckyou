package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m;
import com.google.android.material.internal.CheckableImageButton;
import com.reddit.frontpage.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p009F.AbstractC0074a;
import p015I0.C0109e;
import p015I0.C0112h;
import p023M0.ViewOnClickListenerC0195a;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.AbstractC0253c0;
import p024N.C0222A0;
import p024N.C0224B0;
import p024N.C0297y0;
import p024N.C0299z0;
import p036T.AbstractC0383m;
import p079n0.AbstractC1013a;
import p101z0.ViewOnTouchListenerC1119a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0618m<S> extends DialogInterfaceOnCancelListenerC0543m {

    /* JADX INFO: renamed from: A0 */
    public C0112h f2226A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f2227B0;

    /* JADX INFO: renamed from: C0 */
    public CharSequence f2228C0;

    /* JADX INFO: renamed from: D0 */
    public CharSequence f2229D0;

    /* JADX INFO: renamed from: g0 */
    public final LinkedHashSet f2230g0;

    /* JADX INFO: renamed from: h0 */
    public final LinkedHashSet f2231h0;

    /* JADX INFO: renamed from: i0 */
    public int f2232i0;

    /* JADX INFO: renamed from: j0 */
    public AbstractC0625t f2233j0;

    /* JADX INFO: renamed from: k0 */
    public C0607b f2234k0;

    /* JADX INFO: renamed from: l0 */
    public C0616k f2235l0;

    /* JADX INFO: renamed from: m0 */
    public int f2236m0;

    /* JADX INFO: renamed from: n0 */
    public CharSequence f2237n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f2238o0;

    /* JADX INFO: renamed from: p0 */
    public int f2239p0;

    /* JADX INFO: renamed from: q0 */
    public int f2240q0;

    /* JADX INFO: renamed from: r0 */
    public CharSequence f2241r0;

    /* JADX INFO: renamed from: s0 */
    public int f2242s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f2243t0;

    /* JADX INFO: renamed from: u0 */
    public int f2244u0;

    /* JADX INFO: renamed from: v0 */
    public CharSequence f2245v0;

    /* JADX INFO: renamed from: w0 */
    public int f2246w0;

    /* JADX INFO: renamed from: x0 */
    public CharSequence f2247x0;

    /* JADX INFO: renamed from: y0 */
    public TextView f2248y0;

    /* JADX INFO: renamed from: z0 */
    public CheckableImageButton f2249z0;

    public C0618m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2230g0 = new LinkedHashSet();
        this.f2231h0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: H */
    public static int m1737H(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.resc);
        Calendar calendarM1750b = AbstractC0628w.m1750b();
        calendarM1750b.set(5, 1);
        Calendar calendarM1749a = AbstractC0628w.m1749a(calendarM1750b);
        calendarM1749a.get(2);
        calendarM1749a.get(1);
        int maximum = calendarM1749a.getMaximum(7);
        calendarM1749a.getActualMaximum(5);
        calendarM1749a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.resc) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.resc)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m1738I(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0016e.m197s0(context, R.attr.resc, C0616k.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m
    /* JADX INFO: renamed from: F */
    public final Dialog mo1441F() {
        Context contextM1453B = m1453B();
        m1453B();
        int i2 = this.f2232i0;
        if (i2 == 0) {
            m1739G();
            throw null;
        }
        Dialog dialog = new Dialog(contextM1453B, i2);
        Context context = dialog.getContext();
        this.f2238o0 = m1738I(context, android.R.attr.windowFullscreen);
        this.f2226A0 = new C0112h(context, null, R.attr.resc, R.style.resc);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1013a.f4032n, R.attr.resc, R.style.resc);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2226A0.m478j(context);
        this.f2226A0.m480l(ColorStateList.valueOf(color));
        C0112h c0112h = this.f2226A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        c0112h.m479k(AbstractC0229G.m707i(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: G */
    public final void m1739G() {
        if (this.f1782f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2230g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2231h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1763E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: r */
    public final void mo1445r(Bundle bundle) {
        super.mo1445r(bundle);
        if (bundle == null) {
            bundle = this.f1782f;
        }
        this.f2232i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2234k0 = (C0607b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2236m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2237n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2239p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2240q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2241r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2242s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2243t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2244u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2245v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2246w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2247x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f2237n0;
        if (text == null) {
            text = m1453B().getResources().getText(this.f2236m0);
        }
        this.f2228C0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f2229D0 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: s */
    public final View mo1467s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f2238o0 ? R.layout.resc : R.layout.resc, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f2238o0) {
            viewInflate.findViewById(R.id.resc).setLayoutParams(new LinearLayout.LayoutParams(m1737H(context), -2));
        } else {
            viewInflate.findViewById(R.id.resc).setLayoutParams(new LinearLayout.LayoutParams(m1737H(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.resc);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        textView.setAccessibilityLiveRegion(1);
        this.f2249z0 = (CheckableImageButton) viewInflate.findViewById(R.id.resc);
        this.f2248y0 = (TextView) viewInflate.findViewById(R.id.resc);
        this.f2249z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2249z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0383m.m1057w(context, R.drawable.resc));
        stateListDrawable.addState(new int[0], AbstractC0383m.m1057w(context, R.drawable.resc));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2249z0.setChecked(this.f2239p0 != 0);
        AbstractC0240S.m785p(this.f2249z0, null);
        CheckableImageButton checkableImageButton2 = this.f2249z0;
        this.f2249z0.setContentDescription(this.f2239p0 == 1 ? checkableImageButton2.getContext().getString(R.string.resc) : checkableImageButton2.getContext().getString(R.string.resc));
        this.f2249z0.setOnClickListener(new ViewOnClickListenerC0195a(3, this));
        m1739G();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: w */
    public final void mo1449w(Bundle bundle) {
        super.mo1449w(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2232i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0607b c0607b = this.f2234k0;
        C0606a c0606a = new C0606a();
        int i2 = C0606a.f2185b;
        int i3 = C0606a.f2185b;
        long j2 = c0607b.f2187a.f2257f;
        long j3 = c0607b.f2188b.f2257f;
        c0606a.f2186a = Long.valueOf(c0607b.f2190d.f2257f);
        C0616k c0616k = this.f2235l0;
        C0620o c0620o = c0616k == null ? null : c0616k.f2214W;
        if (c0620o != null) {
            c0606a.f2186a = Long.valueOf(c0620o.f2257f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0607b.f2189c);
        C0620o c0620oM1741b = C0620o.m1741b(j2);
        C0620o c0620oM1741b2 = C0620o.m1741b(j3);
        C0609d c0609d = (C0609d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0606a.f2186a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0607b(c0620oM1741b, c0620oM1741b2, c0609d, l2 == null ? null : C0620o.m1741b(l2.longValue()), c0607b.f2191e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2236m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2237n0);
        bundle.putInt("INPUT_MODE_KEY", this.f2239p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2240q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2241r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2242s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2243t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2244u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2245v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2246w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2247x0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: x */
    public final void mo1450x() {
        AbstractC0016e c0222a0;
        AbstractC0016e c0222a02;
        super.mo1450x();
        Dialog dialog = this.f1741c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2238o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2226A0);
            if (!this.f2227B0) {
                View viewFindViewById = m1454C().findViewById(R.id.resc);
                ColorStateList colorStateListM163L = AbstractC0016e.m163L(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM163L != null ? Integer.valueOf(colorStateListM163L.getDefaultColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iM1054t = AbstractC0383m.m1054t(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iM1054t);
                }
                if (i2 >= 30) {
                    AbstractC0253c0.m817a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                int iM356e = i2 < 23 ? AbstractC0074a.m356e(AbstractC0383m.m1054t(window.getContext(), android.R.attr.statusBarColor, -16777216), 128) : 0;
                int iM356e2 = i2 < 27 ? AbstractC0074a.m356e(AbstractC0383m.m1054t(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(iM356e);
                window.setNavigationBarColor(iM356e2);
                boolean z3 = AbstractC0383m.m1028F(iM356e) || (iM356e == 0 && AbstractC0383m.m1028F(numValueOf.intValue()));
                C0109e c0109e = new C0109e(window.getDecorView(), 4);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    C0224B0 c0224b0 = new C0224B0(window.getInsetsController(), c0109e);
                    c0224b0.f763l = window;
                    c0222a0 = c0224b0;
                } else {
                    c0222a0 = i3 >= 26 ? new C0222A0(window, c0109e) : i3 >= 23 ? new C0299z0(window, c0109e) : new C0297y0(window, c0109e);
                }
                c0222a0.mo226u0(z3);
                boolean z4 = AbstractC0383m.m1028F(iM356e2) || (iM356e2 == 0 && AbstractC0383m.m1028F(iM1054t));
                C0109e c0109e2 = new C0109e(window.getDecorView(), 4);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    C0224B0 c0224b02 = new C0224B0(window.getInsetsController(), c0109e2);
                    c0224b02.f763l = window;
                    c0222a02 = c0224b02;
                } else {
                    c0222a02 = i4 >= 26 ? new C0222A0(window, c0109e2) : i4 >= 23 ? new C0299z0(window, c0109e2) : new C0297y0(window, c0109e2);
                }
                c0222a02.mo224t0(z4);
                C0617l c0617l = new C0617l(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                AbstractC0229G.m719u(viewFindViewById, c0617l);
                this.f2227B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1453B().getResources().getDimensionPixelOffset(R.dimen.resc);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2226A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f1741c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC1119a(dialog2, rect));
        }
        m1453B();
        int i5 = this.f2232i0;
        if (i5 == 0) {
            m1739G();
            throw null;
        }
        m1739G();
        C0607b c0607b = this.f2234k0;
        C0616k c0616k = new C0616k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0607b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0607b.f2190d);
        c0616k.m1456E(bundle);
        this.f2235l0 = c0616k;
        AbstractC0625t abstractC0625t = c0616k;
        if (this.f2239p0 == 1) {
            m1739G();
            C0607b c0607b2 = this.f2234k0;
            C0619n c0619n = new C0619n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0607b2);
            c0619n.m1456E(bundle2);
            abstractC0625t = c0619n;
        }
        this.f2233j0 = abstractC0625t;
        this.f2248y0.setText((this.f2239p0 == 1 && m1453B().getResources().getConfiguration().orientation == 2) ? this.f2229D0 : this.f2228C0);
        m1739G();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m, androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: y */
    public final void mo1451y() {
        this.f2233j0.f2271T.clear();
        super.mo1451y();
    }
}
