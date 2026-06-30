package p072k;

import android.view.MenuItem;

/* JADX INFO: renamed from: k.s */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0822s implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnMenuItemClickListener f3381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0823t f3382b;

    public MenuItemOnMenuItemClickListenerC0822s(MenuItemC0823t menuItemC0823t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3382b = menuItemC0823t;
        this.f3381a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3381a.onMenuItemClick(this.f3382b.m1430g(menuItem));
    }
}
