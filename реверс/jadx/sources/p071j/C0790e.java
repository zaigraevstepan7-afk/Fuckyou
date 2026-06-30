package p071j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p072k.MenuC0800B;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0790e extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f3178a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0786a f3179b;

    public C0790e(Context context, AbstractC0786a abstractC0786a) {
        this.f3178a = context;
        this.f3179b = abstractC0786a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3179b.mo1864a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3179b.mo1865b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0800B(this.f3178a, this.f3179b.mo1866c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3179b.mo1867d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3179b.mo1868e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3179b.f3164a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3179b.mo1869f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3179b.f3165b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3179b.mo1870g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3179b.mo1871h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3179b.mo1872i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3179b.mo1874k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3179b.f3164a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3179b.mo1876m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3179b.mo1877n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f3179b.mo1873j(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f3179b.mo1875l(i2);
    }
}
