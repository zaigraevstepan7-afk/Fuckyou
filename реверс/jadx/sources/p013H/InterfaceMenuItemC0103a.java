package p013H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p072k.ActionProviderVisibilityListenerC0819p;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0103a extends MenuItem {
    /* JADX INFO: renamed from: a */
    ActionProviderVisibilityListenerC0819p mo450a();

    /* JADX INFO: renamed from: b */
    InterfaceMenuItemC0103a mo451b(ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0103a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0103a setTooltipText(CharSequence charSequence);
}
