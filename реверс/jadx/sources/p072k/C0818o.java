package p072k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p013H.InterfaceMenuItemC0103a;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: k.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0818o implements InterfaceMenuItemC0103a {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC0819p f3346A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f3347B;

    /* JADX INFO: renamed from: a */
    public final int f3349a;

    /* JADX INFO: renamed from: b */
    public final int f3350b;

    /* JADX INFO: renamed from: c */
    public final int f3351c;

    /* JADX INFO: renamed from: d */
    public final int f3352d;

    /* JADX INFO: renamed from: e */
    public CharSequence f3353e;

    /* JADX INFO: renamed from: f */
    public CharSequence f3354f;

    /* JADX INFO: renamed from: g */
    public Intent f3355g;

    /* JADX INFO: renamed from: h */
    public char f3356h;

    /* JADX INFO: renamed from: j */
    public char f3358j;

    /* JADX INFO: renamed from: l */
    public Drawable f3360l;

    /* JADX INFO: renamed from: n */
    public final MenuC0816m f3362n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0803E f3363o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f3364p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3365q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3366r;

    /* JADX INFO: renamed from: y */
    public int f3373y;

    /* JADX INFO: renamed from: z */
    public View f3374z;

    /* JADX INFO: renamed from: i */
    public int f3357i = 4096;

    /* JADX INFO: renamed from: k */
    public int f3359k = 4096;

    /* JADX INFO: renamed from: m */
    public int f3361m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f3367s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f3368t = null;

    /* JADX INFO: renamed from: u */
    public boolean f3369u = false;

    /* JADX INFO: renamed from: v */
    public boolean f3370v = false;

    /* JADX INFO: renamed from: w */
    public boolean f3371w = false;

    /* JADX INFO: renamed from: x */
    public int f3372x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f3348C = false;

    public C0818o(MenuC0816m menuC0816m, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f3362n = menuC0816m;
        this.f3349a = i3;
        this.f3350b = i2;
        this.f3351c = i4;
        this.f3352d = i5;
        this.f3353e = charSequence;
        this.f3373y = i6;
    }

    /* JADX INFO: renamed from: c */
    public static void m2199c(int i2, int i3, String str, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // p013H.InterfaceMenuItemC0103a
    /* JADX INFO: renamed from: a */
    public final ActionProviderVisibilityListenerC0819p mo450a() {
        return this.f3346A;
    }

    @Override // p013H.InterfaceMenuItemC0103a
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC0103a mo451b(ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p) {
        this.f3374z = null;
        this.f3346A = actionProviderVisibilityListenerC0819p;
        this.f3362n.m2191p(true);
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p2 = this.f3346A;
        if (actionProviderVisibilityListenerC0819p2 != null) {
            actionProviderVisibilityListenerC0819p2.f3375a = new C0001b(24, this);
            actionProviderVisibilityListenerC0819p2.f3376b.setVisibilityListener(actionProviderVisibilityListenerC0819p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3373y & 8) == 0) {
            return false;
        }
        if (this.f3374z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3347B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3362n.mo2164d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m2200d(Drawable drawable) {
        if (drawable != null && this.f3371w && (this.f3369u || this.f3370v)) {
            drawable = AbstractC0016e.m154B0(drawable).mutate();
            if (this.f3369u) {
                AbstractC0092a.m429h(drawable, this.f3367s);
            }
            if (this.f3370v) {
                AbstractC0092a.m430i(drawable, this.f3368t);
            }
            this.f3371w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2201e() {
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p;
        if ((this.f3373y & 8) != 0) {
            if (this.f3374z == null && (actionProviderVisibilityListenerC0819p = this.f3346A) != null) {
                this.f3374z = actionProviderVisibilityListenerC0819p.f3376b.onCreateActionView(this);
            }
            if (this.f3374z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2201e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3347B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3362n.mo2166f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2202f(boolean z2) {
        if (z2) {
            this.f3372x |= 32;
        } else {
            this.f3372x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3374z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = this.f3346A;
        if (actionProviderVisibilityListenerC0819p == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC0819p.f3376b.onCreateActionView(this);
        this.f3374z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3359k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3358j;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3365q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3350b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3360l;
        if (drawable != null) {
            return m2200d(drawable);
        }
        int i2 = this.f3361m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableM1057w = AbstractC0383m.m1057w(this.f3362n.f3319a, i2);
        this.f3361m = 0;
        this.f3360l = drawableM1057w;
        return m2200d(drawableM1057w);
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3367s;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3368t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3355g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3349a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3357i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3356h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3351c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3363o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3353e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3354f;
        return charSequence != null ? charSequence : this.f3353e;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3366r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3363o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3348C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3372x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3372x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3372x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = this.f3346A;
        return (actionProviderVisibilityListenerC0819p == null || !actionProviderVisibilityListenerC0819p.f3376b.overridesItemVisibility()) ? (this.f3372x & 8) == 0 : (this.f3372x & 8) == 0 && this.f3346A.f3376b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f3374z = view;
        this.f3346A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f3349a) > 0) {
            view.setId(i2);
        }
        MenuC0816m menuC0816m = this.f3362n;
        menuC0816m.f3329k = true;
        menuC0816m.m2191p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3358j == c2) {
            return this;
        }
        this.f3358j = Character.toLowerCase(c2);
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f3372x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f3372x = i3;
        if (i2 != i3) {
            this.f3362n.m2191p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f3372x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f3372x = i3;
            if (i2 != i3) {
                this.f3362n.m2191p(false);
            }
            return this;
        }
        MenuC0816m menuC0816m = this.f3362n;
        menuC0816m.getClass();
        ArrayList arrayList = menuC0816m.f3324f;
        int size = arrayList.size();
        menuC0816m.m2198w();
        for (int i4 = 0; i4 < size; i4++) {
            C0818o c0818o = (C0818o) arrayList.get(i4);
            if (c0818o.f3350b == this.f3350b && (c0818o.f3372x & 4) != 0 && c0818o.isCheckable()) {
                boolean z3 = c0818o == this;
                int i5 = c0818o.f3372x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                c0818o.f3372x = i6;
                if (i5 != i6) {
                    c0818o.f3362n.m2191p(false);
                }
            }
        }
        menuC0816m.m2197v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3372x |= 16;
        } else {
            this.f3372x &= -17;
        }
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3361m = 0;
        this.f3360l = drawable;
        this.f3371w = true;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3367s = colorStateList;
        this.f3369u = true;
        this.f3371w = true;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3368t = mode;
        this.f3370v = true;
        this.f3371w = true;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3355g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3356h == c2) {
            return this;
        }
        this.f3356h = c2;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3347B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3364p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3356h = c2;
        this.f3358j = Character.toLowerCase(c3);
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3373y = i2;
        MenuC0816m menuC0816m = this.f3362n;
        menuC0816m.f3329k = true;
        menuC0816m.m2191p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3353e = charSequence;
        this.f3362n.m2191p(false);
        SubMenuC0803E subMenuC0803E = this.f3363o;
        if (subMenuC0803E != null) {
            subMenuC0803E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3354f = charSequence;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f3372x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f3372x = i3;
        if (i2 != i3) {
            MenuC0816m menuC0816m = this.f3362n;
            menuC0816m.f3326h = true;
            menuC0816m.m2191p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3353e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final InterfaceMenuItemC0103a setContentDescription(CharSequence charSequence) {
        this.f3365q = charSequence;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final InterfaceMenuItemC0103a setTooltipText(CharSequence charSequence) {
        this.f3366r = charSequence;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f3358j == c2 && this.f3359k == i2) {
            return this;
        }
        this.f3358j = Character.toLowerCase(c2);
        this.f3359k = KeyEvent.normalizeMetaState(i2);
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3356h == c2 && this.f3357i == i2) {
            return this;
        }
        this.f3356h = c2;
        this.f3357i = KeyEvent.normalizeMetaState(i2);
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3356h = c2;
        this.f3357i = KeyEvent.normalizeMetaState(i2);
        this.f3358j = Character.toLowerCase(c3);
        this.f3359k = KeyEvent.normalizeMetaState(i3);
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3360l = null;
        this.f3361m = i2;
        this.f3371w = true;
        this.f3362n.m2191p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f3362n.f3319a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3362n.f3319a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f3374z = viewInflate;
        this.f3346A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f3349a) > 0) {
            viewInflate.setId(i3);
        }
        MenuC0816m menuC0816m = this.f3362n;
        menuC0816m.f3329k = true;
        menuC0816m.m2191p(true);
        return this;
    }
}
