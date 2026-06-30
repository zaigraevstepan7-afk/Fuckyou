package p072k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0537g;
import p013H.InterfaceMenuItemC0103a;
import p084q.C1031j;

/* JADX INFO: renamed from: k.B */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0800B extends AbstractC0537g implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC0816m f3230c;

    public MenuC0800B(Context context, MenuC0816m menuC0816m) {
        super(context);
        if (menuC0816m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f3230c = menuC0816m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1430g(this.f3230c.m2184a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f3230c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m1430g(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3230c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1031j c1031j = (C1031j) this.f1722b;
        if (c1031j != null) {
            c1031j.clear();
        }
        this.f3230c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f3230c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return m1430g(this.f3230c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return m1430g(this.f3230c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f3230c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f3230c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f3230c.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f3230c.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((C1031j) this.f1722b) != null) {
            int i3 = 0;
            while (true) {
                C1031j c1031j = (C1031j) this.f1722b;
                if (i3 >= c1031j.f4104c) {
                    break;
                }
                if (((InterfaceMenuItemC0103a) c1031j.m2490f(i3)).getGroupId() == i2) {
                    ((C1031j) this.f1722b).m2491g(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f3230c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((C1031j) this.f1722b) != null) {
            int i3 = 0;
            while (true) {
                C1031j c1031j = (C1031j) this.f1722b;
                if (i3 >= c1031j.f4104c) {
                    break;
                }
                if (((InterfaceMenuItemC0103a) c1031j.m2490f(i3)).getItemId() == i2) {
                    ((C1031j) this.f1722b).m2491g(i3);
                    break;
                }
                i3++;
            }
        }
        this.f3230c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f3230c.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        this.f3230c.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        this.f3230c.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3230c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3230c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f3230c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m1430g(this.f3230c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f3230c.addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m1430g(this.f3230c.m2184a(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f3230c.addSubMenu(i2, i3, i4, i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m1430g(this.f3230c.add(i2, i3, i4, i5));
    }
}
