package p096w0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.reddit.frontpage.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p007E.AbstractC0064j;
import p007E.AbstractC0071q;
import p011G.AbstractC0092a;
import p019K0.C0161c;
import p024N.C0270l;
import p027O0.AbstractC0322a;
import p036T.AbstractC0372b;
import p036T.AbstractC0383m;
import p074l.C0965r;
import p075l0.C0986b;
import p075l0.C0987c;
import p075l0.C0988d;
import p075l0.C0989e;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: w0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1092c extends C0965r {

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f4496e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f4497f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4498g;

    /* JADX INFO: renamed from: h */
    public boolean f4499h;

    /* JADX INFO: renamed from: i */
    public boolean f4500i;

    /* JADX INFO: renamed from: j */
    public boolean f4501j;

    /* JADX INFO: renamed from: k */
    public CharSequence f4502k;

    /* JADX INFO: renamed from: l */
    public Drawable f4503l;

    /* JADX INFO: renamed from: m */
    public Drawable f4504m;

    /* JADX INFO: renamed from: n */
    public boolean f4505n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f4506o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f4507p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f4508q;

    /* JADX INFO: renamed from: r */
    public int f4509r;

    /* JADX INFO: renamed from: s */
    public int[] f4510s;

    /* JADX INFO: renamed from: t */
    public boolean f4511t;

    /* JADX INFO: renamed from: u */
    public CharSequence f4512u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f4513v;

    /* JADX INFO: renamed from: w */
    public final C0989e f4514w;

    /* JADX INFO: renamed from: x */
    public final C1090a f4515x;

    /* JADX INFO: renamed from: y */
    public static final int[] f4494y = {R.attr.resc};

    /* JADX INFO: renamed from: z */
    public static final int[] f4495z = {R.attr.resc};

    /* JADX INFO: renamed from: A */
    public static final int[][] f4492A = {new int[]{android.R.attr.state_enabled, R.attr.resc}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: B */
    public static final int f4493B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C1092c(Context context, AttributeSet attributeSet) throws Throwable {
        C0989e c0989e;
        int next;
        super(AbstractC0322a.m979a(context, attributeSet, R.attr.resc, R.style.resc), attributeSet, R.attr.resc);
        this.f4496e = new LinkedHashSet();
        this.f4497f = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c0989e = new C0989e(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = AbstractC0071q.f219a;
            Drawable drawableM344a = AbstractC0064j.m344a(resources, R.drawable.resc, theme);
            c0989e.f3918a = drawableM344a;
            drawableM344a.setCallback(c0989e.f3915f);
            new C0988d(c0989e.f3918a.getConstantState());
        } else {
            int i2 = C0989e.f3910g;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.resc);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                C0989e c0989e2 = new C0989e(context2);
                c0989e2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                c0989e = c0989e2;
            } catch (IOException e2) {
                Log.e("AnimatedVDCompat", "parser error", e2);
                c0989e = null;
            } catch (XmlPullParserException e3) {
                Log.e("AnimatedVDCompat", "parser error", e3);
                c0989e = null;
            }
        }
        this.f4514w = c0989e;
        this.f4515x = new C1090a(this);
        Context context3 = getContext();
        this.f4503l = AbstractC0016e.m157F(this);
        this.f4506o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC1013a.f4035q;
        AbstractC0047m.m272a(context3, attributeSet, R.attr.resc, R.style.resc);
        AbstractC0047m.m273b(context3, attributeSet, iArr, R.attr.resc, R.style.resc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.resc, R.style.resc);
        C0270l c0270l = new C0270l(context3, typedArrayObtainStyledAttributes);
        this.f4504m = c0270l.m845h(2);
        if (this.f4503l != null && AbstractC0016e.m191p0(context3, R.attr.resc, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4493B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4503l = AbstractC0383m.m1057w(context3, R.drawable.resc);
                this.f4505n = true;
                if (this.f4504m == null) {
                    this.f4504m = AbstractC0383m.m1057w(context3, R.drawable.resc);
                }
            }
        }
        this.f4507p = AbstractC0016e.m161J(context3, c0270l, 3);
        this.f4508q = AbstractC0047m.m280i(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f4499h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f4500i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f4501j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f4502k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0270l.m851o();
        m2693a();
    }

    private String getButtonStateDescription() {
        int i2 = this.f4509r;
        return i2 == 1 ? getResources().getString(R.string.resc) : i2 == 0 ? getResources().getString(R.string.resc) : getResources().getString(R.string.resc);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4498g == null) {
            int iM1056v = AbstractC0383m.m1056v(this, R.attr.resc);
            int iM1056v2 = AbstractC0383m.m1056v(this, R.attr.resc);
            int iM1056v3 = AbstractC0383m.m1056v(this, R.attr.resc);
            int iM1056v4 = AbstractC0383m.m1056v(this, R.attr.resc);
            this.f4498g = new ColorStateList(f4492A, new int[]{AbstractC0383m.m1030I(iM1056v3, iM1056v2, 1.0f), AbstractC0383m.m1030I(iM1056v3, iM1056v, 1.0f), AbstractC0383m.m1030I(iM1056v3, iM1056v4, 0.54f), AbstractC0383m.m1030I(iM1056v3, iM1056v4, 0.38f), AbstractC0383m.m1030I(iM1056v3, iM1056v4, 0.38f)});
        }
        return this.f4498g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4506o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m2693a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0161c c0161c;
        Drawable drawable = this.f4503l;
        ColorStateList colorStateList3 = this.f4506o;
        PorterDuff.Mode modeM1004b = AbstractC0372b.m1004b(this);
        int i2 = Build.VERSION.SDK_INT;
        this.f4503l = AbstractC0016e.m152A(drawable, colorStateList3, modeM1004b, i2 < 23);
        this.f4504m = AbstractC0016e.m152A(this.f4504m, this.f4507p, this.f4508q, i2 < 23);
        if (this.f4505n) {
            C0989e c0989e = this.f4514w;
            if (c0989e != null) {
                Drawable drawable2 = c0989e.f3918a;
                C1090a c1090a = this.f4515x;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable2;
                    if (c1090a.f4489a == null) {
                        c1090a.f4489a = new C0986b(c1090a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1090a.f4489a);
                }
                ArrayList arrayList = c0989e.f3914e;
                C0987c c0987c = c0989e.f3911b;
                if (arrayList != null && c1090a != null) {
                    arrayList.remove(c1090a);
                    if (c0989e.f3914e.size() == 0 && (c0161c = c0989e.f3913d) != null) {
                        c0987c.f3906b.removeListener(c0161c);
                        c0989e.f3913d = null;
                    }
                }
                Drawable drawable3 = c0989e.f3918a;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable3;
                    if (c1090a.f4489a == null) {
                        c1090a.f4489a = new C0986b(c1090a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1090a.f4489a);
                } else if (c1090a != null) {
                    if (c0989e.f3914e == null) {
                        c0989e.f3914e = new ArrayList();
                    }
                    if (!c0989e.f3914e.contains(c1090a)) {
                        c0989e.f3914e.add(c1090a);
                        if (c0989e.f3913d == null) {
                            c0989e.f3913d = new C0161c(5, c0989e);
                        }
                        c0987c.f3906b.addListener(c0989e.f3913d);
                    }
                }
            }
            if (i2 >= 24) {
                Drawable drawable4 = this.f4503l;
                if ((drawable4 instanceof AnimatedStateListDrawable) && c0989e != null) {
                    ((AnimatedStateListDrawable) drawable4).addTransition(R.id.resc, R.id.resc, c0989e, false);
                    ((AnimatedStateListDrawable) this.f4503l).addTransition(R.id.resc, R.id.resc, c0989e, false);
                }
            }
        }
        Drawable drawable5 = this.f4503l;
        if (drawable5 != null && (colorStateList2 = this.f4506o) != null) {
            AbstractC0092a.m429h(drawable5, colorStateList2);
        }
        Drawable drawable6 = this.f4504m;
        if (drawable6 != null && (colorStateList = this.f4507p) != null) {
            AbstractC0092a.m429h(drawable6, colorStateList);
        }
        super.setButtonDrawable(AbstractC0016e.m188o(this.f4503l, this.f4504m, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f4503l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4504m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4507p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4508q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4506o;
    }

    public int getCheckedState() {
        return this.f4509r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4502k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4509r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4499h && this.f4506o == null && this.f4507p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4494y);
        }
        if (this.f4501j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4495z);
        }
        this.f4510s = AbstractC0016e.m158G(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM157F;
        if (!this.f4500i || !TextUtils.isEmpty(getText()) || (drawableM157F = AbstractC0016e.m157F(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM157F.getIntrinsicWidth()) / 2) * (AbstractC0047m.m278g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM157F.getBounds();
            AbstractC0092a.m427f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4501j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4502k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1091b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1091b c1091b = (C1091b) parcelable;
        super.onRestoreInstanceState(c1091b.getSuperState());
        setCheckedState(c1091b.f4491a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1091b c1091b = new C1091b(super.onSaveInstanceState());
        c1091b.f4491a = getCheckedState();
        return c1091b;
    }

    @Override // p074l.C0965r, android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4504m = drawable;
        m2693a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4507p == colorStateList) {
            return;
        }
        this.f4507p = colorStateList;
        m2693a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4508q == mode) {
            return;
        }
        this.f4508q = mode;
        m2693a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4506o == colorStateList) {
            return;
        }
        this.f4506o = colorStateList;
        m2693a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m2693a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f4500i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4509r != i2) {
            this.f4509r = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && this.f4512u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4511t) {
                return;
            }
            this.f4511t = true;
            LinkedHashSet linkedHashSet = this.f4497f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4509r != 2 && (onCheckedChangeListener = this.f4513v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i3 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4511t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4502k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4501j == z2) {
            return;
        }
        this.f4501j = z2;
        refreshDrawableState();
        Iterator it = this.f4496e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4513v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4512u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f4499h = z2;
        if (z2) {
            AbstractC0372b.m1005c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0372b.m1005c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p074l.C0965r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4503l = drawable;
        this.f4505n = false;
        m2693a();
    }
}
