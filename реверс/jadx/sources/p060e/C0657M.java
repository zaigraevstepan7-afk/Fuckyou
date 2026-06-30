package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p005C0.C0048n;
import p071j.AbstractC0786a;
import p072k.InterfaceC0814k;
import p072k.MenuC0816m;

/* JADX INFO: renamed from: e.M */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0657M extends AbstractC0786a implements InterfaceC0814k {

    /* JADX INFO: renamed from: c */
    public final Context f2600c;

    /* JADX INFO: renamed from: d */
    public final MenuC0816m f2601d;

    /* JADX INFO: renamed from: e */
    public C0048n f2602e;

    /* JADX INFO: renamed from: f */
    public WeakReference f2603f;

    /* JADX INFO: renamed from: g */
    public final C0658N f2604g;

    static {
        ZLoader.registerNativesForClass(96, C0657M.class);
        Hidden0.special_clinit_96_00(C0657M.class);
    }

    public C0657M(C0658N c0658n, Context context, C0048n c0048n) {
        this.f2604g = c0658n;
        this.f2600c = context;
        this.f2602e = c0048n;
        MenuC0816m menuC0816m = new MenuC0816m(context);
        menuC0816m.f3330l = 1;
        this.f2601d = menuC0816m;
        menuC0816m.f3323e = this;
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: a */
    public final native void mo1864a();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: b */
    public final native View mo1865b();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: c */
    public final native MenuC0816m mo1866c();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: d */
    public final native MenuInflater mo1867d();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: e */
    public final native CharSequence mo1868e();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: f */
    public final native CharSequence mo1869f();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: g */
    public final native void mo1870g();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: h */
    public final native boolean mo1871h();

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: i */
    public final native void mo1872i(View view);

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: j */
    public final native void mo1873j(int i2);

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: k */
    public final native void mo1874k(CharSequence charSequence);

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: l */
    public final native void mo1875l(int i2);

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: m */
    public final native void mo1876m(CharSequence charSequence);

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: n */
    public final native void mo1877n(boolean z2);

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: v */
    public final native void mo57v(MenuC0816m menuC0816m);

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: w */
    public final native boolean mo58w(MenuC0816m menuC0816m, MenuItem menuItem);
}
