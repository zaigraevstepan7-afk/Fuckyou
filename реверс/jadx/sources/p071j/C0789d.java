package p071j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000A.C0010k;
import p005C0.C0048n;
import p072k.InterfaceC0814k;
import p072k.MenuC0816m;
import p074l.C0944k;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0789d extends AbstractC0786a implements InterfaceC0814k {

    /* JADX INFO: renamed from: c */
    public Context f3172c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f3173d;

    /* JADX INFO: renamed from: e */
    public C0048n f3174e;

    /* JADX INFO: renamed from: f */
    public WeakReference f3175f;

    /* JADX INFO: renamed from: g */
    public boolean f3176g;

    /* JADX INFO: renamed from: h */
    public MenuC0816m f3177h;

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1864a() {
        if (this.f3176g) {
            return;
        }
        this.f3176g = true;
        this.f3174e.m286D(this);
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: b */
    public final View mo1865b() {
        WeakReference weakReference = this.f3175f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: c */
    public final MenuC0816m mo1866c() {
        return this.f3177h;
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo1867d() {
        return new C0793h(this.f3173d.getContext());
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: e */
    public final CharSequence mo1868e() {
        return this.f3173d.getSubtitle();
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: f */
    public final CharSequence mo1869f() {
        return this.f3173d.getTitle();
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: g */
    public final void mo1870g() {
        this.f3174e.m287E(this, this.f3177h);
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: h */
    public final boolean mo1871h() {
        return this.f3173d.f1312s;
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: i */
    public final void mo1872i(View view) {
        this.f3173d.setCustomView(view);
        this.f3175f = view != null ? new WeakReference(view) : null;
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: j */
    public final void mo1873j(int i2) {
        mo1874k(this.f3172c.getString(i2));
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: k */
    public final void mo1874k(CharSequence charSequence) {
        this.f3173d.setSubtitle(charSequence);
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: l */
    public final void mo1875l(int i2) {
        mo1876m(this.f3172c.getString(i2));
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: m */
    public final void mo1876m(CharSequence charSequence) {
        this.f3173d.setTitle(charSequence);
    }

    @Override // p071j.AbstractC0786a
    /* JADX INFO: renamed from: n */
    public final void mo1877n(boolean z2) {
        this.f3165b = z2;
        this.f3173d.setTitleOptional(z2);
    }

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: v */
    public final void mo57v(MenuC0816m menuC0816m) {
        mo1870g();
        C0944k c0944k = this.f3173d.f1297d;
        if (c0944k != null) {
            c0944k.m2384l();
        }
    }

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: w */
    public final boolean mo58w(MenuC0816m menuC0816m, MenuItem menuItem) {
        return ((C0010k) this.f3174e.f174b).m90k(this, menuItem);
    }
}
