package androidx.activity;

import androidx.fragment.app.C0556z;
import p035S0.C0364a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0483t implements InterfaceC0458c {

    /* JADX INFO: renamed from: a */
    public final C0556z f1239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0485v f1240b;

    public C0483t(C0485v c0485v, C0556z c0556z) {
        AbstractC0451c.m1146e(c0556z, "onBackPressedCallback");
        this.f1240b = c0485v;
        this.f1239a = c0556z;
    }

    @Override // androidx.activity.InterfaceC0458c
    public final void cancel() {
        C0485v c0485v = this.f1240b;
        C0364a c0364a = c0485v.f1247b;
        C0556z c0556z = this.f1239a;
        c0364a.remove(c0556z);
        if (AbstractC0451c.m1142a(c0485v.f1248c, c0556z)) {
            c0556z.getClass();
            c0485v.f1248c = null;
        }
        c0556z.f1823b.remove(this);
        C0484u c0484u = c0556z.f1824c;
        if (c0484u != null) {
            c0484u.mo1135a();
        }
        c0556z.f1824c = null;
    }
}
