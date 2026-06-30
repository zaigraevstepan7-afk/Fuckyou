package p072k;

import android.view.MenuItem;

/* JADX INFO: renamed from: k.r */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0821r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f3379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0823t f3380b;

    public MenuItemOnActionExpandListenerC0821r(MenuItemC0823t menuItemC0823t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3380b = menuItemC0823t;
        this.f3379a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3379a.onMenuItemActionCollapse(this.f3380b.m1430g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3379a.onMenuItemActionExpand(this.f3380b.m1430g(menuItem));
    }
}
