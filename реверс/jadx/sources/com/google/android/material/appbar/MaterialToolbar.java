package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000A.C0009j;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p011G.AbstractC0092a;
import p015I0.C0112h;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p072k.MenuC0816m;
import p079n0.AbstractC1013a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: W */
    public static final ImageView.ScaleType[] f2049W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: R */
    public Integer f2050R;

    /* JADX INFO: renamed from: S */
    public boolean f2051S;

    /* JADX INFO: renamed from: T */
    public boolean f2052T;

    /* JADX INFO: renamed from: U */
    public ImageView.ScaleType f2053U;

    /* JADX INFO: renamed from: V */
    public Boolean f2054V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, R.attr.resc, R.style.resc), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM279h = AbstractC0047m.m279h(context2, attributeSet, AbstractC1013a.f4041w, R.attr.resc, R.style.resc, new int[0]);
        if (typedArrayM279h.hasValue(2)) {
            setNavigationIconTint(typedArrayM279h.getColor(2, -1));
        }
        this.f2051S = typedArrayM279h.getBoolean(4, false);
        this.f2052T = typedArrayM279h.getBoolean(3, false);
        int i2 = typedArrayM279h.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2049W;
            if (i2 < scaleTypeArr.length) {
                this.f2053U = scaleTypeArr[i2];
            }
        }
        if (typedArrayM279h.hasValue(0)) {
            this.f2054V = Boolean.valueOf(typedArrayM279h.getBoolean(0, false));
        }
        typedArrayM279h.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0016e.m163L(background);
        if (colorStateListValueOf != null) {
            C0112h c0112h = new C0112h();
            c0112h.m480l(colorStateListValueOf);
            c0112h.m478j(context2);
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            c0112h.m479k(AbstractC0229G.m707i(this));
            setBackground(c0112h);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2053U;
    }

    public Integer getNavigationIconTint() {
        return this.f2050R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo1231m(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC0816m;
        if (z2) {
            ((MenuC0816m) menu).m2198w();
        }
        super.mo1231m(i2);
        if (z2) {
            ((MenuC0816m) menu).m2197v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0112h) {
            AbstractC0016e.m201x0(this, (C0112h) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f2051S || this.f2052T) {
            ArrayList arrayListM277f = AbstractC0047m.m277f(this, getTitle());
            boolean zIsEmpty = arrayListM277f.isEmpty();
            C0009j c0009j = AbstractC0047m.f172c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM277f, c0009j);
            ArrayList arrayListM277f2 = AbstractC0047m.m277f(this, getSubtitle());
            TextView textView2 = arrayListM277f2.isEmpty() ? null : (TextView) Collections.max(arrayListM277f2, c0009j);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2051S && textView != null) {
                    m1687v(textView, pair);
                }
                if (this.f2052T && textView2 != null) {
                    m1687v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2054V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2053U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0112h) {
            ((C0112h) background).m479k(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2054V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2054V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2053U != scaleType) {
            this.f2053U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2050R != null) {
            drawable = AbstractC0016e.m154B0(drawable.mutate());
            AbstractC0092a.m428g(drawable, this.f2050R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f2050R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2052T != z2) {
            this.f2052T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2051S != z2) {
            this.f2051S = z2;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1687v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
