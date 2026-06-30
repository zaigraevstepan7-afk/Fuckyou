package p024N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: N.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0272m {
    /* JADX INFO: renamed from: a */
    public static int m854a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m855b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m856c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m857d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m858e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m859f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m860g(MenuItem menuItem, char c2, int i2) {
        return menuItem.setAlphabeticShortcut(c2, i2);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m861h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m862i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m863j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m864k(MenuItem menuItem, char c2, int i2) {
        return menuItem.setNumericShortcut(c2, i2);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m865l(MenuItem menuItem, char c2, char c3, int i2, int i3) {
        return menuItem.setShortcut(c2, c3, i2, i3);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m866m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
