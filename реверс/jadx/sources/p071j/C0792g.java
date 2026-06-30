package p071j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p013H.InterfaceMenuItemC0103a;
import p024N.AbstractC0272m;
import p072k.ActionProviderVisibilityListenerC0819p;
import p072k.C0818o;
import p072k.MenuItemC0823t;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0792g {

    /* JADX INFO: renamed from: A */
    public CharSequence f3183A;

    /* JADX INFO: renamed from: B */
    public CharSequence f3184B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0793h f3187E;

    /* JADX INFO: renamed from: a */
    public final Menu f3188a;

    /* JADX INFO: renamed from: h */
    public boolean f3195h;

    /* JADX INFO: renamed from: i */
    public int f3196i;

    /* JADX INFO: renamed from: j */
    public int f3197j;

    /* JADX INFO: renamed from: k */
    public CharSequence f3198k;

    /* JADX INFO: renamed from: l */
    public CharSequence f3199l;

    /* JADX INFO: renamed from: m */
    public int f3200m;

    /* JADX INFO: renamed from: n */
    public char f3201n;

    /* JADX INFO: renamed from: o */
    public int f3202o;

    /* JADX INFO: renamed from: p */
    public char f3203p;

    /* JADX INFO: renamed from: q */
    public int f3204q;

    /* JADX INFO: renamed from: r */
    public int f3205r;

    /* JADX INFO: renamed from: s */
    public boolean f3206s;

    /* JADX INFO: renamed from: t */
    public boolean f3207t;

    /* JADX INFO: renamed from: u */
    public boolean f3208u;

    /* JADX INFO: renamed from: v */
    public int f3209v;

    /* JADX INFO: renamed from: w */
    public int f3210w;

    /* JADX INFO: renamed from: x */
    public String f3211x;

    /* JADX INFO: renamed from: y */
    public String f3212y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC0819p f3213z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f3185C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f3186D = null;

    /* JADX INFO: renamed from: b */
    public int f3189b = 0;

    /* JADX INFO: renamed from: c */
    public int f3190c = 0;

    /* JADX INFO: renamed from: d */
    public int f3191d = 0;

    /* JADX INFO: renamed from: e */
    public int f3192e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f3193f = true;

    /* JADX INFO: renamed from: g */
    public boolean f3194g = true;

    public C0792g(C0793h c0793h, Menu menu) {
        this.f3187E = c0793h;
        this.f3188a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2138a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3187E.f3218c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2139b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3206s).setVisible(this.f3207t).setEnabled(this.f3208u).setCheckable(this.f3205r >= 1).setTitleCondensed(this.f3199l).setIcon(this.f3200m);
        int i2 = this.f3209v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f3212y;
        C0793h c0793h = this.f3187E;
        if (str != null) {
            if (c0793h.f3218c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0793h.f3219d == null) {
                c0793h.f3219d = C0793h.m2140a(c0793h.f3218c);
            }
            Object obj = c0793h.f3219d;
            String str2 = this.f3212y;
            MenuItemOnMenuItemClickListenerC0791f menuItemOnMenuItemClickListenerC0791f = new MenuItemOnMenuItemClickListenerC0791f();
            menuItemOnMenuItemClickListenerC0791f.f3181a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0791f.f3182b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0791f.f3180c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0791f);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f3205r >= 2) {
            if (menuItem instanceof C0818o) {
                C0818o c0818o = (C0818o) menuItem;
                c0818o.f3372x = (c0818o.f3372x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0823t) {
                MenuItemC0823t menuItemC0823t = (MenuItemC0823t) menuItem;
                try {
                    Method method = menuItemC0823t.f3384d;
                    InterfaceMenuItemC0103a interfaceMenuItemC0103a = menuItemC0823t.f3383c;
                    if (method == null) {
                        menuItemC0823t.f3384d = interfaceMenuItemC0103a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0823t.f3384d.invoke(interfaceMenuItemC0103a, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f3211x;
        if (str3 != null) {
            menuItem.setActionView((View) m2138a(str3, C0793h.f3214e, c0793h.f3216a));
            z2 = true;
        }
        int i3 = this.f3210w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = this.f3213z;
        if (actionProviderVisibilityListenerC0819p != null) {
            if (menuItem instanceof InterfaceMenuItemC0103a) {
                ((InterfaceMenuItemC0103a) menuItem).mo451b(actionProviderVisibilityListenerC0819p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3183A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0103a;
        if (z3) {
            ((InterfaceMenuItemC0103a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0272m.m861h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3184B;
        if (z3) {
            ((InterfaceMenuItemC0103a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0272m.m866m(menuItem, charSequence2);
        }
        char c2 = this.f3201n;
        int i4 = this.f3202o;
        if (z3) {
            ((InterfaceMenuItemC0103a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0272m.m860g(menuItem, c2, i4);
        }
        char c3 = this.f3203p;
        int i5 = this.f3204q;
        if (z3) {
            ((InterfaceMenuItemC0103a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0272m.m864k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f3186D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0103a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0272m.m863j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3185C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0103a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0272m.m862i(menuItem, colorStateList);
            }
        }
    }
}
