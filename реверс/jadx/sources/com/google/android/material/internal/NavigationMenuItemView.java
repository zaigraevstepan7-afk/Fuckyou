package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0039e;
import p005C0.C0035a;
import p007E.AbstractC0064j;
import p007E.AbstractC0071q;
import p011G.AbstractC0092a;
import p024N.AbstractC0240S;
import p036T.AbstractC0383m;
import p072k.C0818o;
import p072k.InterfaceC0829z;
import p074l.C0866B0;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0039e implements InterfaceC0829z {

    /* JADX INFO: renamed from: G */
    public static final int[] f2280G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f2281A;

    /* JADX INFO: renamed from: B */
    public C0818o f2282B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f2283C;

    /* JADX INFO: renamed from: D */
    public boolean f2284D;

    /* JADX INFO: renamed from: E */
    public Drawable f2285E;

    /* JADX INFO: renamed from: F */
    public final C0035a f2286F;

    /* JADX INFO: renamed from: v */
    public int f2287v;

    /* JADX INFO: renamed from: w */
    public boolean f2288w;

    /* JADX INFO: renamed from: x */
    public boolean f2289x;

    /* JADX INFO: renamed from: y */
    public final boolean f2290y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f2291z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2290y = true;
        C0035a c0035a = new C0035a(1, this);
        this.f2286F = c0035a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.reddit.frontpage.R.layout.resc, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.reddit.frontpage.R.id.resc);
        this.f2291z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0240S.m785p(checkedTextView, c0035a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2281A == null) {
                this.f2281A = (FrameLayout) ((ViewStub) findViewById(com.reddit.frontpage.R.id.resc)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2281A.removeAllViews();
            this.f2281A.addView(view);
        }
    }

    @Override // p072k.InterfaceC0829z
    /* JADX INFO: renamed from: a */
    public final void mo1190a(C0818o c0818o) {
        StateListDrawable stateListDrawable;
        this.f2282B = c0818o;
        int i2 = c0818o.f3349a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(c0818o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.reddit.frontpage.R.attr.resc, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2280G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0818o.isCheckable());
        setChecked(c0818o.isChecked());
        setEnabled(c0818o.isEnabled());
        setTitle(c0818o.f3353e);
        setIcon(c0818o.getIcon());
        setActionView(c0818o.getActionView());
        setContentDescription(c0818o.f3365q);
        AbstractC0383m.m1043g0(this, c0818o.f3366r);
        C0818o c0818o2 = this.f2282B;
        CharSequence charSequence = c0818o2.f3353e;
        CheckedTextView checkedTextView = this.f2291z;
        if (charSequence == null && c0818o2.getIcon() == null && this.f2282B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2281A;
            if (frameLayout != null) {
                C0866B0 c0866b0 = (C0866B0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0866b0).width = -1;
                this.f2281A.setLayoutParams(c0866b0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2281A;
        if (frameLayout2 != null) {
            C0866B0 c0866b02 = (C0866B0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0866b02).width = -2;
            this.f2281A.setLayoutParams(c0866b02);
        }
    }

    @Override // p072k.InterfaceC0829z
    public C0818o getItemData() {
        return this.f2282B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0818o c0818o = this.f2282B;
        if (c0818o != null && c0818o.isCheckable() && this.f2282B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2280G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2289x != z2) {
            this.f2289x = z2;
            this.f2286F.mo814h(this.f2291z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2291z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2290y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2284D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC0016e.m154B0(drawable).mutate();
                AbstractC0092a.m429h(drawable, this.f2283C);
            }
            int i2 = this.f2287v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f2288w) {
            if (this.f2285E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0071q.f219a;
                Drawable drawableM344a = AbstractC0064j.m344a(resources, com.reddit.frontpage.R.drawable.resc, theme);
                this.f2285E = drawableM344a;
                if (drawableM344a != null) {
                    int i3 = this.f2287v;
                    drawableM344a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f2285E;
        }
        this.f2291z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f2291z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f2287v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2283C = colorStateList;
        this.f2284D = colorStateList != null;
        C0818o c0818o = this.f2282B;
        if (c0818o != null) {
            setIcon(c0818o.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f2291z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2288w = z2;
    }

    public void setTextAppearance(int i2) {
        AbstractC0383m.m1041f0(this.f2291z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2291z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2291z.setText(charSequence);
    }
}
