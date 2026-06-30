package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0517G implements InterfaceC0516F {

    /* JADX INFO: renamed from: a */
    public final int f1576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0518H f1577b;

    public C0517G(C0518H c0518h, int i2) {
        this.f1577b = c0518h;
        this.f1576a = i2;
    }

    @Override // androidx.fragment.app.InterfaceC0516F
    /* JADX INFO: renamed from: a */
    public final boolean mo1328a(ArrayList arrayList, ArrayList arrayList2) {
        C0518H c0518h = this.f1577b;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0518h.f1613w;
        int i2 = this.f1576a;
        if (abstractComponentCallbacksC0548r == null || i2 >= 0 || !abstractComponentCallbacksC0548r.m1458g().m1344N(-1, 0)) {
            return c0518h.m1345O(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
