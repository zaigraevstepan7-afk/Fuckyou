package p092u0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p011G.AbstractC0092a;
import p012G0.AbstractC0102d;
import p015I0.C0108d;
import p015I0.C0112h;
import p015I0.C0115k;
import p015I0.C0116l;
import p015I0.C0117m;
import p023M0.C0203i;
import p024N.AbstractC0240S;
import p079n0.AbstractC1013a;
import p081o0.AbstractC1015a;
import p082p.AbstractC1018a;
import p082p.AbstractC1020c;
import p082p.C1019b;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1059c {

    /* JADX INFO: renamed from: y */
    public static final double f4217y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z */
    public static final ColorDrawable f4218z;

    /* JADX INFO: renamed from: a */
    public final MaterialCardView f4219a;

    /* JADX INFO: renamed from: c */
    public final C0112h f4221c;

    /* JADX INFO: renamed from: d */
    public final C0112h f4222d;

    /* JADX INFO: renamed from: e */
    public int f4223e;

    /* JADX INFO: renamed from: f */
    public int f4224f;

    /* JADX INFO: renamed from: g */
    public int f4225g;

    /* JADX INFO: renamed from: h */
    public int f4226h;

    /* JADX INFO: renamed from: i */
    public Drawable f4227i;

    /* JADX INFO: renamed from: j */
    public Drawable f4228j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f4229k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f4230l;

    /* JADX INFO: renamed from: m */
    public C0117m f4231m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f4232n;

    /* JADX INFO: renamed from: o */
    public RippleDrawable f4233o;

    /* JADX INFO: renamed from: p */
    public LayerDrawable f4234p;

    /* JADX INFO: renamed from: q */
    public C0112h f4235q;

    /* JADX INFO: renamed from: s */
    public boolean f4237s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f4238t;

    /* JADX INFO: renamed from: u */
    public final TimeInterpolator f4239u;

    /* JADX INFO: renamed from: v */
    public final int f4240v;

    /* JADX INFO: renamed from: w */
    public final int f4241w;

    /* JADX INFO: renamed from: b */
    public final Rect f4220b = new Rect();

    /* JADX INFO: renamed from: r */
    public boolean f4236r = false;

    /* JADX INFO: renamed from: x */
    public float f4242x = 0.0f;

    static {
        f4218z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C1059c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f4219a = materialCardView;
        C0112h c0112h = new C0112h(materialCardView.getContext(), attributeSet, R.attr.resc, R.style.resc);
        this.f4221c = c0112h;
        c0112h.m478j(materialCardView.getContext());
        c0112h.m482n();
        C0116l c0116lM495e = c0112h.f346a.f328a.m495e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC1013a.f4020b, R.attr.resc, R.style.resc);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            c0116lM495e.m490c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f4222d = new C0112h();
        m2564h(c0116lM495e.m489a());
        this.f4239u = AbstractC0016e.m195r0(materialCardView.getContext(), R.attr.resc, AbstractC1015a.f4046a);
        this.f4240v = AbstractC0016e.m193q0(materialCardView.getContext(), R.attr.resc, 300);
        this.f4241w = AbstractC0016e.m193q0(materialCardView.getContext(), R.attr.resc, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static float m2557b(AbstractC0016e abstractC0016e, float f) {
        if (abstractC0016e instanceof C0115k) {
            return (float) ((1.0d - f4217y) * ((double) f));
        }
        if (abstractC0016e instanceof C0108d) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m2558a() {
        AbstractC0016e abstractC0016e = this.f4231m.f383a;
        C0112h c0112h = this.f4221c;
        return Math.max(Math.max(m2557b(abstractC0016e, c0112h.m476h()), m2557b(this.f4231m.f384b, c0112h.f346a.f328a.f388f.mo453a(c0112h.m475g()))), Math.max(m2557b(this.f4231m.f385c, c0112h.f346a.f328a.f389g.mo453a(c0112h.m475g())), m2557b(this.f4231m.f386d, c0112h.f346a.f328a.f390h.mo453a(c0112h.m475g()))));
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m2559c() {
        if (this.f4233o == null) {
            int[] iArr = AbstractC0102d.f301a;
            this.f4235q = new C0112h(this.f4231m);
            this.f4233o = new RippleDrawable(this.f4229k, null, this.f4235q);
        }
        if (this.f4234p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f4233o, this.f4222d, this.f4228j});
            this.f4234p = layerDrawable;
            layerDrawable.setId(2, R.id.resc);
        }
        return this.f4234p;
    }

    /* JADX INFO: renamed from: d */
    public final C1058b m2560d(Drawable drawable) {
        int iCeil;
        int i2;
        if (this.f4219a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (m2565i() ? m2558a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (m2565i() ? m2558a() : 0.0f));
            i2 = iCeil2;
        } else {
            iCeil = 0;
            i2 = 0;
        }
        return new C1058b(drawable, iCeil, i2, iCeil, i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2561e(int i2, int i3) {
        int iCeil;
        int iCeil2;
        int i4;
        int i5;
        if (this.f4234p != null) {
            MaterialCardView materialCardView = this.f4219a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m2565i() ? m2558a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m2565i() ? m2558a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i6 = this.f4225g;
            int i7 = (i6 & 8388613) == 8388613 ? ((i2 - this.f4223e) - this.f4224f) - iCeil2 : this.f4223e;
            int i8 = (i6 & 80) == 80 ? this.f4223e : ((i3 - this.f4223e) - this.f4224f) - iCeil;
            int i9 = (i6 & 8388613) == 8388613 ? this.f4223e : ((i2 - this.f4223e) - this.f4224f) - iCeil2;
            int i10 = (i6 & 80) == 80 ? ((i3 - this.f4223e) - this.f4224f) - iCeil : this.f4223e;
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            if (materialCardView.getLayoutDirection() == 1) {
                i5 = i9;
                i4 = i7;
            } else {
                i4 = i9;
                i5 = i7;
            }
            this.f4234p.setLayerInset(2, i5, i10, i4, i8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2562f(boolean z2, boolean z3) {
        Drawable drawable = this.f4228j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.f4242x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.f4242x : this.f4242x;
            ValueAnimator valueAnimator = this.f4238t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f4238t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4242x, f);
            this.f4238t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C0203i(2, this));
            this.f4238t.setInterpolator(this.f4239u);
            this.f4238t.setDuration((long) ((z2 ? this.f4240v : this.f4241w) * f2));
            this.f4238t.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2563g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = AbstractC0016e.m154B0(drawable).mutate();
            this.f4228j = drawableMutate;
            AbstractC0092a.m429h(drawableMutate, this.f4230l);
            m2562f(this.f4219a.f2158j, false);
        } else {
            this.f4228j = f4218z;
        }
        LayerDrawable layerDrawable = this.f4234p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.resc, this.f4228j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2564h(C0117m c0117m) {
        this.f4231m = c0117m;
        C0112h c0112h = this.f4221c;
        c0112h.setShapeAppearanceModel(c0117m);
        c0112h.f367v = !c0112h.f346a.f328a.m494d(c0112h.m475g());
        C0112h c0112h2 = this.f4222d;
        if (c0112h2 != null) {
            c0112h2.setShapeAppearanceModel(c0117m);
        }
        C0112h c0112h3 = this.f4235q;
        if (c0112h3 != null) {
            c0112h3.setShapeAppearanceModel(c0117m);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2565i() {
        MaterialCardView materialCardView = this.f4219a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        C0112h c0112h = this.f4221c;
        return c0112h.f346a.f328a.m494d(c0112h.m475g()) && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2566j() {
        View view = this.f4219a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: k */
    public final void m2567k() {
        Drawable drawable = this.f4227i;
        Drawable drawableM2559c = m2566j() ? m2559c() : this.f4222d;
        this.f4227i = drawableM2559c;
        if (drawable != drawableM2559c) {
            int i2 = Build.VERSION.SDK_INT;
            MaterialCardView materialCardView = this.f4219a;
            if (i2 < 23 || !(materialCardView.getForeground() instanceof InsetDrawable)) {
                materialCardView.setForeground(m2560d(drawableM2559c));
            } else {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM2559c);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2568l() {
        boolean z2;
        MaterialCardView materialCardView = this.f4219a;
        if (materialCardView.getPreventCornerOverlap()) {
            C0112h c0112h = this.f4221c;
            z2 = !c0112h.f346a.f328a.m494d(c0112h.m475g());
        }
        float cardViewRadius = 0.0f;
        float fM2558a = (z2 || m2565i()) ? m2558a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f4217y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i2 = (int) (fM2558a - cardViewRadius);
        Rect rect = this.f4220b;
        materialCardView.f4062c.set(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
        C0048n c0048n = materialCardView.f4064e;
        if (!((AbstractC1018a) c0048n.f175c).getUseCompatPadding()) {
            c0048n.m293K(0, 0, 0, 0);
            return;
        }
        C1019b c1019b = (C1019b) ((Drawable) c0048n.f174b);
        float f = c1019b.f4069e;
        float f2 = c1019b.f4065a;
        AbstractC1018a abstractC1018a = (AbstractC1018a) c0048n.f175c;
        int iCeil = (int) Math.ceil(AbstractC1020c.m2470a(f, f2, abstractC1018a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC1020c.m2471b(f, f2, abstractC1018a.getPreventCornerOverlap()));
        c0048n.m293K(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: m */
    public final void m2569m() {
        boolean z2 = this.f4236r;
        MaterialCardView materialCardView = this.f4219a;
        if (!z2) {
            materialCardView.setBackgroundInternal(m2560d(this.f4221c));
        }
        materialCardView.setForeground(m2560d(this.f4227i));
    }
}
