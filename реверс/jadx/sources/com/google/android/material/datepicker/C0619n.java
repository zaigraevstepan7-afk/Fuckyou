package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0619n<S> extends AbstractC0625t {

    /* JADX INFO: renamed from: U */
    public int f2250U;

    /* JADX INFO: renamed from: V */
    public C0607b f2251V;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: r */
    public final void mo1445r(Bundle bundle) {
        super.mo1445r(bundle);
        if (bundle == null) {
            bundle = this.f1782f;
        }
        this.f2250U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2251V = (C0607b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: s */
    public final View mo1467s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1459h(), this.f2250U));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: w */
    public final void mo1449w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2250U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2251V);
    }
}
