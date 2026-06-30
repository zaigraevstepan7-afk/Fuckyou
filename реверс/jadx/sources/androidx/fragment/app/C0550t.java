package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0586r;
import p036T.AbstractC0383m;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;
import p068h0.InterfaceC0782e;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0550t extends AbstractC0383m implements InterfaceC0568L, InterfaceC0586r, InterfaceC0782e, InterfaceC0521K {

    /* JADX INFO: renamed from: p */
    public final AbstractActivityC0669k f1805p;

    /* JADX INFO: renamed from: q */
    public final AbstractActivityC0669k f1806q;

    /* JADX INFO: renamed from: r */
    public final Handler f1807r;

    /* JADX INFO: renamed from: s */
    public final C0518H f1808s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractActivityC0669k f1809t;

    public C0550t(AbstractActivityC0669k abstractActivityC0669k) {
        this.f1809t = abstractActivityC0669k;
        Handler handler = new Handler();
        this.f1808s = new C0518H();
        this.f1805p = abstractActivityC0669k;
        this.f1806q = abstractActivityC0669k;
        this.f1807r = handler;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: N */
    public final View mo1063N(int i2) {
        return this.f1809t.findViewById(i2);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: O */
    public final boolean mo1064O() {
        Window window = this.f1809t.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p068h0.InterfaceC0782e
    /* JADX INFO: renamed from: b */
    public final C0781d mo1162b() {
        return (C0781d) this.f1809t.f1181e.f1200c;
    }

    @Override // androidx.lifecycle.InterfaceC0568L
    /* JADX INFO: renamed from: c */
    public final C0567K mo1163c() {
        return this.f1809t.mo1163c();
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        return this.f1809t.f2698t;
    }

    @Override // androidx.fragment.app.InterfaceC0521K
    /* JADX INFO: renamed from: a */
    public final void mo1327a() {
    }
}
