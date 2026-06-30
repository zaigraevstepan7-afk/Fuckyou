package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p066g0.C0735X;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0612g extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f2204E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C0616k f2205F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612g(C0616k c0616k, int i2, int i3) {
        super(i2);
        this.f2205F = c0616k;
        this.f2204E = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: A0 */
    public final void mo1542A0(RecyclerView recyclerView, int i2) {
        C0626u c0626u = new C0626u(recyclerView.getContext());
        c0626u.f3125a = i2;
        m1997B0(c0626u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: D0 */
    public final void mo1543D0(C0735X c0735x, int[] iArr) {
        int i2 = this.f2204E;
        C0616k c0616k = this.f2205F;
        if (i2 == 0) {
            iArr[0] = c0616k.f2218a0.getWidth();
            iArr[1] = c0616k.f2218a0.getWidth();
        } else {
            iArr[0] = c0616k.f2218a0.getHeight();
            iArr[1] = c0616k.f2218a0.getHeight();
        }
    }
}
