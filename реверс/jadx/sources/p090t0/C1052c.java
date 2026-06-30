package p090t0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p011G.AbstractC0092a;
import p012G0.AbstractC0102d;
import p012G0.C0099a;
import p012G0.C0100b;
import p015I0.C0112h;
import p015I0.C0117m;
import p015I0.InterfaceC0128x;
import p024N.AbstractC0240S;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: t0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1052c {

    /* JADX INFO: renamed from: u */
    public static final boolean f4187u;

    /* JADX INFO: renamed from: v */
    public static final boolean f4188v;

    /* JADX INFO: renamed from: a */
    public final MaterialButton f4189a;

    /* JADX INFO: renamed from: b */
    public C0117m f4190b;

    /* JADX INFO: renamed from: c */
    public int f4191c;

    /* JADX INFO: renamed from: d */
    public int f4192d;

    /* JADX INFO: renamed from: e */
    public int f4193e;

    /* JADX INFO: renamed from: f */
    public int f4194f;

    /* JADX INFO: renamed from: g */
    public int f4195g;

    /* JADX INFO: renamed from: h */
    public int f4196h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f4197i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f4198j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f4199k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f4200l;

    /* JADX INFO: renamed from: m */
    public Drawable f4201m;

    /* JADX INFO: renamed from: q */
    public boolean f4205q;

    /* JADX INFO: renamed from: s */
    public LayerDrawable f4207s;

    /* JADX INFO: renamed from: t */
    public int f4208t;

    /* JADX INFO: renamed from: n */
    public boolean f4202n = false;

    /* JADX INFO: renamed from: o */
    public boolean f4203o = false;

    /* JADX INFO: renamed from: p */
    public boolean f4204p = false;

    /* JADX INFO: renamed from: r */
    public boolean f4206r = true;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4187u = true;
        f4188v = i2 <= 22;
    }

    public C1052c(MaterialButton materialButton, C0117m c0117m) {
        this.f4189a = materialButton;
        this.f4190b = c0117m;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0128x m2551a() {
        LayerDrawable layerDrawable = this.f4207s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4207s.getNumberOfLayers() > 2 ? (InterfaceC0128x) this.f4207s.getDrawable(2) : (InterfaceC0128x) this.f4207s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C0112h m2552b(boolean z2) {
        LayerDrawable layerDrawable = this.f4207s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f4187u ? (C0112h) ((LayerDrawable) ((InsetDrawable) this.f4207s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0) : (C0112h) this.f4207s.getDrawable(!z2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m2553c(C0117m c0117m) {
        this.f4190b = c0117m;
        if (!f4188v || this.f4203o) {
            if (m2552b(false) != null) {
                m2552b(false).setShapeAppearanceModel(c0117m);
            }
            if (m2552b(true) != null) {
                m2552b(true).setShapeAppearanceModel(c0117m);
            }
            if (m2551a() != null) {
                m2551a().setShapeAppearanceModel(c0117m);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        MaterialButton materialButton = this.f4189a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        m2555e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: d */
    public final void m2554d(int i2, int i3) {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        MaterialButton materialButton = this.f4189a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f4193e;
        int i5 = this.f4194f;
        this.f4194f = i3;
        this.f4193e = i2;
        if (!this.f4203o) {
            m2555e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final void m2555e() {
        Drawable insetDrawable;
        C0112h c0112h = new C0112h(this.f4190b);
        MaterialButton materialButton = this.f4189a;
        c0112h.m478j(materialButton.getContext());
        AbstractC0092a.m429h(c0112h, this.f4198j);
        PorterDuff.Mode mode = this.f4197i;
        if (mode != null) {
            AbstractC0092a.m430i(c0112h, mode);
        }
        float f = this.f4196h;
        ColorStateList colorStateList = this.f4199k;
        c0112h.f346a.f337j = f;
        c0112h.invalidateSelf();
        c0112h.m484p(colorStateList);
        C0112h c0112h2 = new C0112h(this.f4190b);
        c0112h2.setTint(0);
        float f2 = this.f4196h;
        int iM1056v = this.f4202n ? AbstractC0383m.m1056v(materialButton, R.attr.resc) : 0;
        c0112h2.f346a.f337j = f2;
        c0112h2.invalidateSelf();
        c0112h2.m484p(ColorStateList.valueOf(iM1056v));
        if (f4187u) {
            C0112h c0112h3 = new C0112h(this.f4190b);
            this.f4201m = c0112h3;
            AbstractC0092a.m428g(c0112h3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0102d.m448a(this.f4200l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0112h2, c0112h}), this.f4191c, this.f4193e, this.f4192d, this.f4194f), this.f4201m);
            this.f4207s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C0112h c0112h4 = new C0112h(this.f4190b);
            C0099a c0099a = new C0099a();
            c0099a.f298a = c0112h4;
            c0099a.f299b = false;
            C0100b c0100b = new C0100b(c0099a);
            this.f4201m = c0100b;
            AbstractC0092a.m429h(c0100b, AbstractC0102d.m448a(this.f4200l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c0112h2, c0112h, this.f4201m});
            this.f4207s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f4191c, this.f4193e, this.f4192d, this.f4194f);
        }
        materialButton.setInternalBackground(insetDrawable);
        C0112h c0112hM2552b = m2552b(false);
        if (c0112hM2552b != null) {
            c0112hM2552b.m479k(this.f4208t);
            c0112hM2552b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2556f() {
        C0112h c0112hM2552b = m2552b(false);
        C0112h c0112hM2552b2 = m2552b(true);
        if (c0112hM2552b != null) {
            float f = this.f4196h;
            ColorStateList colorStateList = this.f4199k;
            c0112hM2552b.f346a.f337j = f;
            c0112hM2552b.invalidateSelf();
            c0112hM2552b.m484p(colorStateList);
            if (c0112hM2552b2 != null) {
                float f2 = this.f4196h;
                int iM1056v = this.f4202n ? AbstractC0383m.m1056v(this.f4189a, R.attr.resc) : 0;
                c0112hM2552b2.f346a.f337j = f2;
                c0112hM2552b2.invalidateSelf();
                c0112hM2552b2.m484p(ColorStateList.valueOf(iM1056v));
            }
        }
    }
}
