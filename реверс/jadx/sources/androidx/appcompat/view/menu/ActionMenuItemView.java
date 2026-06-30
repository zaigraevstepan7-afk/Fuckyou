package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p072k.AbstractC0806c;
import p072k.C0805b;
import p072k.C0818o;
import p072k.InterfaceC0815l;
import p072k.InterfaceC0829z;
import p072k.MenuC0816m;
import p074l.C0927e0;
import p074l.InterfaceC0947l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0927e0 implements InterfaceC0829z, View.OnClickListener, InterfaceC0947l {

    /* JADX INFO: renamed from: h */
    public C0818o f1255h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1256i;

    /* JADX INFO: renamed from: j */
    public Drawable f1257j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0815l f1258k;

    /* JADX INFO: renamed from: l */
    public C0805b f1259l;

    /* JADX INFO: renamed from: m */
    public AbstractC0806c f1260m;

    /* JADX INFO: renamed from: n */
    public boolean f1261n;

    /* JADX INFO: renamed from: o */
    public boolean f1262o;

    /* JADX INFO: renamed from: p */
    public final int f1263p;

    /* JADX INFO: renamed from: q */
    public int f1264q;

    /* JADX INFO: renamed from: r */
    public final int f1265r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1261n = m1193h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2482c, 0, 0);
        this.f1263p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1265r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1264q = -1;
        setSaveEnabled(false);
    }

    @Override // p072k.InterfaceC0829z
    /* JADX INFO: renamed from: a */
    public final void mo1190a(C0818o c0818o) {
        this.f1255h = c0818o;
        setIcon(c0818o.getIcon());
        setTitle(c0818o.getTitleCondensed());
        setId(c0818o.f3349a);
        setVisibility(c0818o.isVisible() ? 0 : 8);
        setEnabled(c0818o.isEnabled());
        if (c0818o.hasSubMenu() && this.f1259l == null) {
            this.f1259l = new C0805b(this);
        }
    }

    @Override // p074l.InterfaceC0947l
    /* JADX INFO: renamed from: b */
    public final boolean mo1191b() {
        return !TextUtils.isEmpty(getText()) && this.f1255h.getIcon() == null;
    }

    @Override // p074l.InterfaceC0947l
    /* JADX INFO: renamed from: c */
    public final boolean mo1192c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p072k.InterfaceC0829z
    public C0818o getItemData() {
        return this.f1255h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1193h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m1194i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1256i);
        if (this.f1257j != null && ((this.f1255h.f3373y & 4) != 4 || (!this.f1261n && !this.f1262o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1256i : null);
        CharSequence charSequence = this.f1255h.f3365q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1255h.f3353e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1255h.f3366r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0383m.m1043g0(this, z4 ? null : this.f1255h.f3353e);
        } else {
            AbstractC0383m.m1043g0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0815l interfaceC0815l = this.f1258k;
        if (interfaceC0815l != null) {
            interfaceC0815l.mo1195b(this.f1255h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1261n = m1193h();
        m1194i();
    }

    @Override // p074l.C0927e0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f1264q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1263p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f1257j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1257j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0805b c0805b;
        if (this.f1255h.hasSubMenu() && (c0805b = this.f1259l) != null && c0805b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1262o != z2) {
            this.f1262o = z2;
            C0818o c0818o = this.f1255h;
            if (c0818o != null) {
                MenuC0816m menuC0816m = c0818o.f3362n;
                menuC0816m.f3329k = true;
                menuC0816m.m2191p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1257j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1265r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1194i();
    }

    public void setItemInvoker(InterfaceC0815l interfaceC0815l) {
        this.f1258k = interfaceC0815l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1264q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0806c abstractC0806c) {
        this.f1260m = abstractC0806c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1256i = charSequence;
        m1194i();
    }
}
