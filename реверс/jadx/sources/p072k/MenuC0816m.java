package p072k;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006D.AbstractC0051a;
import p024N.AbstractC0242U;
import p024N.AbstractC0244W;

/* JADX INFO: renamed from: k.m */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0816m implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f3318y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f3319a;

    /* JADX INFO: renamed from: b */
    public final Resources f3320b;

    /* JADX INFO: renamed from: c */
    public boolean f3321c;

    /* JADX INFO: renamed from: d */
    public final boolean f3322d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0814k f3323e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3324f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3325g;

    /* JADX INFO: renamed from: h */
    public boolean f3326h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3327i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3328j;

    /* JADX INFO: renamed from: k */
    public boolean f3329k;

    /* JADX INFO: renamed from: m */
    public CharSequence f3331m;

    /* JADX INFO: renamed from: n */
    public Drawable f3332n;

    /* JADX INFO: renamed from: o */
    public View f3333o;

    /* JADX INFO: renamed from: v */
    public C0818o f3340v;

    /* JADX INFO: renamed from: x */
    public boolean f3342x;

    /* JADX INFO: renamed from: l */
    public int f3330l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f3334p = false;

    /* JADX INFO: renamed from: q */
    public boolean f3335q = false;

    /* JADX INFO: renamed from: r */
    public boolean f3336r = false;

    /* JADX INFO: renamed from: s */
    public boolean f3337s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f3338t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f3339u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f3341w = false;

    public MenuC0816m(Context context) {
        boolean zM792b;
        boolean z2 = false;
        this.f3319a = context;
        Resources resources = context.getResources();
        this.f3320b = resources;
        this.f3324f = new ArrayList();
        this.f3325g = new ArrayList();
        this.f3326h = true;
        this.f3327i = new ArrayList();
        this.f3328j = new ArrayList();
        this.f3329k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0244W.f784a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM792b = AbstractC0242U.m792b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM792b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM792b) {
                z2 = true;
            }
        }
        this.f3322d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final C0818o m2184a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f3318y[i6] << 16) | (65535 & i4);
        C0818o c0818o = new C0818o(this, i2, i3, i4, i7, charSequence, this.f3330l);
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((C0818o) arrayList.get(size)).f3352d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, c0818o);
        m2191p(true);
        return c0818o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2184a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f3319a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0818o c0818oM2184a = m2184a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            c0818oM2184a.setIcon(resolveInfo.loadIcon(packageManager));
            c0818oM2184a.f3355g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = c0818oM2184a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m2185b(InterfaceC0828y interfaceC0828y, Context context) {
        this.f3339u.add(new WeakReference(interfaceC0828y));
        interfaceC0828y.mo2181j(context, this);
        this.f3329k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2186c(boolean z2) {
        if (this.f3337s) {
            return;
        }
        this.f3337s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0828y interfaceC0828y = (InterfaceC0828y) weakReference.get();
            if (interfaceC0828y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0828y.mo2151b(this, z2);
            }
        }
        this.f3337s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0818o c0818o = this.f3340v;
        if (c0818o != null) {
            mo2164d(c0818o);
        }
        this.f3324f.clear();
        m2191p(true);
    }

    public final void clearHeader() {
        this.f3332n = null;
        this.f3331m = null;
        this.f3333o = null;
        m2191p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2186c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2164d(C0818o c0818o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
        boolean zMo2180h = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3340v == c0818o) {
            m2198w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0828y interfaceC0828y = (InterfaceC0828y) weakReference.get();
                if (interfaceC0828y != null) {
                    zMo2180h = interfaceC0828y.mo2180h(c0818o);
                    if (zMo2180h) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m2197v();
            if (zMo2180h) {
                this.f3340v = null;
            }
        }
        return zMo2180h;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2165e(MenuC0816m menuC0816m, MenuItem menuItem) {
        InterfaceC0814k interfaceC0814k = this.f3323e;
        return interfaceC0814k != null && interfaceC0814k.mo58w(menuC0816m, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2166f(C0818o c0818o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
        boolean zMo2179d = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2198w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0828y interfaceC0828y = (InterfaceC0828y) weakReference.get();
            if (interfaceC0828y != null) {
                zMo2179d = interfaceC0828y.mo2179d(c0818o);
                if (zMo2179d) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m2197v();
        if (zMo2179d) {
            this.f3340v = c0818o;
        }
        return zMo2179d;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0818o c0818o = (C0818o) arrayList.get(i3);
            if (c0818o.f3349a == i2) {
                return c0818o;
            }
            if (c0818o.hasSubMenu() && (menuItemFindItem = c0818o.f3363o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C0818o m2187g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3338t;
        arrayList.clear();
        m2188h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0818o) arrayList.get(0);
        }
        boolean zMo2170n = mo2170n();
        for (int i3 = 0; i3 < size; i3++) {
            C0818o c0818o = (C0818o) arrayList.get(i3);
            char c2 = zMo2170n ? c0818o.f3358j : c0818o.f3356h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo2170n && c2 == '\b' && i2 == 67))) {
                return c0818o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f3324f.get(i2);
    }

    /* JADX INFO: renamed from: h */
    public final void m2188h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zMo2170n = mo2170n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f3324f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0818o c0818o = (C0818o) arrayList2.get(i3);
                if (c0818o.hasSubMenu()) {
                    c0818o.f3363o.m2188h(arrayList, i2, keyEvent);
                }
                char c2 = zMo2170n ? c0818o.f3358j : c0818o.f3356h;
                if ((modifiers & 69647) == ((zMo2170n ? c0818o.f3359k : c0818o.f3357i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo2170n && c2 == '\b' && i2 == 67)) && c0818o.isEnabled()) {
                        arrayList.add(c0818o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3342x) {
            return true;
        }
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0818o) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2189i() {
        ArrayList arrayListM2190l = m2190l();
        if (this.f3329k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
            boolean zMo2155k = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0828y interfaceC0828y = (InterfaceC0828y) weakReference.get();
                if (interfaceC0828y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo2155k |= interfaceC0828y.mo2155k();
                }
            }
            ArrayList arrayList = this.f3327i;
            ArrayList arrayList2 = this.f3328j;
            if (zMo2155k) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2190l.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0818o c0818o = (C0818o) arrayListM2190l.get(i2);
                    if ((c0818o.f3372x & 32) == 32) {
                        arrayList.add(c0818o);
                    } else {
                        arrayList2.add(c0818o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2190l());
            }
            this.f3329k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m2187g(i2, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo2167j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m2190l() {
        boolean z2 = this.f3326h;
        ArrayList arrayList = this.f3325g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3324f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0818o c0818o = (C0818o) arrayList2.get(i2);
            if (c0818o.isVisible()) {
                arrayList.add(c0818o);
            }
        }
        this.f3326h = false;
        this.f3329k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2169m() {
        return this.f3341w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2170n() {
        return this.f3321c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo2171o() {
        return this.f3322d;
    }

    /* JADX INFO: renamed from: p */
    public final void m2191p(boolean z2) {
        if (this.f3334p) {
            this.f3335q = true;
            if (z2) {
                this.f3336r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f3326h = true;
            this.f3329k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2198w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0828y interfaceC0828y = (InterfaceC0828y) weakReference.get();
            if (interfaceC0828y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0828y.mo2152c();
            }
        }
        m2197v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return m2192q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C0818o c0818oM2187g = m2187g(i2, keyEvent);
        boolean zM2192q = c0818oM2187g != null ? m2192q(c0818oM2187g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m2186c(true);
        }
        return zM2192q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2192q(MenuItem menuItem, InterfaceC0828y interfaceC0828y, int i2) {
        boolean zExpandActionView;
        C0818o c0818o = (C0818o) menuItem;
        if (c0818o == null || !c0818o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0818o.f3364p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0818o)) {
            MenuC0816m menuC0816m = c0818o.f3362n;
            if (!menuC0816m.mo2165e(menuC0816m, c0818o)) {
                Intent intent = c0818o.f3355g;
                if (intent != null) {
                    try {
                        menuC0816m.f3319a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = c0818o.f3346A;
                        if (actionProviderVisibilityListenerC0819p == null) {
                        }
                        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p2 = c0818o.f3346A;
                        if (actionProviderVisibilityListenerC0819p2 == null) {
                        }
                        if (!c0818o.m2201e()) {
                        }
                        return zExpandActionView;
                    }
                } else {
                    ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p3 = c0818o.f3346A;
                    zExpandActionView = actionProviderVisibilityListenerC0819p3 == null && actionProviderVisibilityListenerC0819p3.f3376b.onPerformDefaultAction();
                }
            }
        }
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p22 = c0818o.f3346A;
        boolean z2 = actionProviderVisibilityListenerC0819p22 == null && actionProviderVisibilityListenerC0819p22.f3376b.hasSubMenu();
        if (!c0818o.m2201e()) {
            zExpandActionView |= c0818o.expandActionView();
            if (zExpandActionView) {
                m2186c(true);
            }
        } else if (c0818o.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                m2186c(false);
            }
            if (!c0818o.hasSubMenu()) {
                SubMenuC0803E subMenuC0803E = new SubMenuC0803E(this.f3319a, this, c0818o);
                c0818o.f3363o = subMenuC0803E;
                subMenuC0803E.setHeaderTitle(c0818o.f3353e);
            }
            SubMenuC0803E subMenuC0803E2 = c0818o.f3363o;
            if (z2) {
                MenuItemC0823t menuItemC0823t = actionProviderVisibilityListenerC0819p22.f3377c;
                actionProviderVisibilityListenerC0819p22.f3376b.onPrepareSubMenu(subMenuC0803E2);
            }
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo2153f = interfaceC0828y != null ? interfaceC0828y.mo2153f(subMenuC0803E2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0828y interfaceC0828y2 = (InterfaceC0828y) weakReference.get();
                    if (interfaceC0828y2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo2153f) {
                        zMo2153f = interfaceC0828y2.mo2153f(subMenuC0803E2);
                    }
                }
            }
            zExpandActionView |= zMo2153f;
            if (!zExpandActionView) {
                m2186c(true);
            }
        } else if ((i2 & 1) == 0) {
            m2186c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m2193r(InterfaceC0828y interfaceC0828y) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3339u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0828y interfaceC0828y2 = (InterfaceC0828y) weakReference.get();
            if (interfaceC0828y2 == null || interfaceC0828y2 == interfaceC0828y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0818o) arrayList.get(i4)).f3350b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C0818o) arrayList.get(i4)).f3350b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f3324f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            m2191p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0818o) arrayList.get(i3)).f3349a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f3324f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            m2191p(true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2194s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2167j());
        int size = this.f3324f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0803E) item.getSubMenu()).m2194s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0818o c0818o = (C0818o) arrayList.get(i3);
            if (c0818o.f3350b == i2) {
                c0818o.f3372x = (c0818o.f3372x & (-5)) | (z3 ? 4 : 0);
                c0818o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3341w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0818o c0818o = (C0818o) arrayList.get(i3);
            if (c0818o.f3350b == i2) {
                c0818o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f3324f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0818o c0818o = (C0818o) arrayList.get(i3);
            if (c0818o.f3350b == i2) {
                int i4 = c0818o.f3372x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                c0818o.f3372x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m2191p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f3321c = z2;
        m2191p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3324f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m2195t(Bundle bundle) {
        int size = this.f3324f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0803E) item.getSubMenu()).m2195t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2167j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2196u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f3333o = view;
            this.f3331m = null;
            this.f3332n = null;
        } else {
            if (i2 > 0) {
                this.f3331m = this.f3320b.getText(i2);
            } else if (charSequence != null) {
                this.f3331m = charSequence;
            }
            if (i3 > 0) {
                this.f3332n = AbstractC0051a.m315b(this.f3319a, i3);
            } else if (drawable != null) {
                this.f3332n = drawable;
            }
            this.f3333o = null;
        }
        m2191p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m2197v() {
        this.f3334p = false;
        if (this.f3335q) {
            this.f3335q = false;
            m2191p(this.f3336r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2198w() {
        if (this.f3334p) {
            return;
        }
        this.f3334p = true;
        this.f3335q = false;
        this.f3336r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m2184a(0, 0, 0, this.f3320b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f3320b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m2184a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0818o c0818oM2184a = m2184a(i2, i3, i4, charSequence);
        SubMenuC0803E subMenuC0803E = new SubMenuC0803E(this.f3319a, this, c0818oM2184a);
        c0818oM2184a.f3363o = subMenuC0803E;
        subMenuC0803E.setHeaderTitle(c0818oM2184a.f3353e);
        return subMenuC0803E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m2184a(i2, i3, i4, this.f3320b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f3320b.getString(i5));
    }

    /* JADX INFO: renamed from: k */
    public MenuC0816m mo2168k() {
        return this;
    }
}
