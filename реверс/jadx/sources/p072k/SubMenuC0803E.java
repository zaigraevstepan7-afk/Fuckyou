package p072k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.AbstractC0529T;

/* JADX INFO: renamed from: k.E */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0803E extends MenuC0816m implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C0818o f3250A;

    /* JADX INFO: renamed from: z */
    public final MenuC0816m f3251z;

    public SubMenuC0803E(Context context, MenuC0816m menuC0816m, C0818o c0818o) {
        super(context);
        this.f3251z = menuC0816m;
        this.f3250A = c0818o;
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: d */
    public final boolean mo2164d(C0818o c0818o) {
        return this.f3251z.mo2164d(c0818o);
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: e */
    public final boolean mo2165e(MenuC0816m menuC0816m, MenuItem menuItem) {
        return super.mo2165e(menuC0816m, menuItem) || this.f3251z.mo2165e(menuC0816m, menuItem);
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: f */
    public final boolean mo2166f(C0818o c0818o) {
        return this.f3251z.mo2166f(c0818o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3250A;
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: j */
    public final String mo2167j() {
        C0818o c0818o = this.f3250A;
        int i2 = c0818o != null ? c0818o.f3349a : 0;
        if (i2 == 0) {
            return null;
        }
        return AbstractC0529T.m1416e("android:menu:actionviewstates:", i2);
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: k */
    public final MenuC0816m mo2168k() {
        return this.f3251z.mo2168k();
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: m */
    public final boolean mo2169m() {
        return this.f3251z.mo2169m();
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: n */
    public final boolean mo2170n() {
        return this.f3251z.mo2170n();
    }

    @Override // p072k.MenuC0816m
    /* JADX INFO: renamed from: o */
    public final boolean mo2171o() {
        return this.f3251z.mo2171o();
    }

    @Override // p072k.MenuC0816m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3251z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2196u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2196u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2196u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3250A.setIcon(drawable);
        return this;
    }

    @Override // p072k.MenuC0816m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3251z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        m2196u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        m2196u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f3250A.setIcon(i2);
        return this;
    }
}
