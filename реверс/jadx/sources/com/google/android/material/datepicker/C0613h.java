package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p066g0.AbstractC0720H;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0613h extends AbstractC0720H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0616k f2206a;

    public C0613h(C0616k c0616k) {
        this.f2206a = c0616k;
        AbstractC0628w.m1751c(null);
        AbstractC0628w.m1751c(null);
    }

    @Override // p066g0.AbstractC0720H
    /* JADX INFO: renamed from: a */
    public final void mo1732a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0630y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2206a.getClass();
            throw null;
        }
    }
}
