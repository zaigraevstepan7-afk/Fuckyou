package p072k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p001A0.AbstractC0016e;
import p006D.AbstractC0051a;
import p011G.AbstractC0092a;
import p013H.InterfaceMenuItemC0103a;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0804a implements InterfaceMenuItemC0103a {

    /* JADX INFO: renamed from: a */
    public CharSequence f3252a;

    /* JADX INFO: renamed from: b */
    public CharSequence f3253b;

    /* JADX INFO: renamed from: c */
    public Intent f3254c;

    /* JADX INFO: renamed from: d */
    public char f3255d;

    /* JADX INFO: renamed from: e */
    public int f3256e;

    /* JADX INFO: renamed from: f */
    public char f3257f;

    /* JADX INFO: renamed from: g */
    public int f3258g;

    /* JADX INFO: renamed from: h */
    public Drawable f3259h;

    /* JADX INFO: renamed from: i */
    public Context f3260i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3261j;

    /* JADX INFO: renamed from: k */
    public CharSequence f3262k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3263l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f3264m;

    /* JADX INFO: renamed from: n */
    public boolean f3265n;

    /* JADX INFO: renamed from: o */
    public boolean f3266o;

    /* JADX INFO: renamed from: p */
    public int f3267p;

    @Override // p013H.InterfaceMenuItemC0103a
    /* JADX INFO: renamed from: a */
    public final ActionProviderVisibilityListenerC0819p mo450a() {
        return null;
    }

    @Override // p013H.InterfaceMenuItemC0103a
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC0103a mo451b(ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public final void m2172c() {
        Drawable drawable = this.f3259h;
        if (drawable != null) {
            if (this.f3265n || this.f3266o) {
                Drawable drawableM154B0 = AbstractC0016e.m154B0(drawable);
                this.f3259h = drawableM154B0;
                Drawable drawableMutate = drawableM154B0.mutate();
                this.f3259h = drawableMutate;
                if (this.f3265n) {
                    AbstractC0092a.m429h(drawableMutate, this.f3263l);
                }
                if (this.f3266o) {
                    AbstractC0092a.m430i(this.f3259h, this.f3264m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3258g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3257f;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3261j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3259h;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3263l;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3264m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3254c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3256e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3255d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3252a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3253b;
        return charSequence != null ? charSequence : this.f3252a;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3262k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3267p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3267p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3267p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3267p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3257f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3267p = (z2 ? 1 : 0) | (this.f3267p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3267p = (z2 ? 2 : 0) | (this.f3267p & (-3));
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final InterfaceMenuItemC0103a setContentDescription(CharSequence charSequence) {
        this.f3261j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3267p = (z2 ? 16 : 0) | (this.f3267p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3259h = drawable;
        m2172c();
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3263l = colorStateList;
        this.f3265n = true;
        m2172c();
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3264m = mode;
        this.f3266o = true;
        m2172c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3254c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f3255d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3255d = c2;
        this.f3257f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3252a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3253b = charSequence;
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final InterfaceMenuItemC0103a setTooltipText(CharSequence charSequence) {
        this.f3262k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f3267p = (this.f3267p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3257f = Character.toLowerCase(c2);
        this.f3258g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3261j = charSequence;
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f3255d = c2;
        this.f3256e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f3252a = this.f3260i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3262k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3259h = AbstractC0051a.m315b(this.f3260i, i2);
        m2172c();
        return this;
    }

    @Override // p013H.InterfaceMenuItemC0103a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3255d = c2;
        this.f3256e = KeyEvent.normalizeMetaState(i2);
        this.f3257f = Character.toLowerCase(c3);
        this.f3258g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
