package p065g;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0056b;
import p011G.InterfaceC0095d;
import p036T.AbstractC0383m;
import p067h.AbstractC0776a;
import p067h.AbstractC0777b;
import p074l.C0899S0;
import p075l0.C0989e;
import p075l0.C1001q;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0709e extends AbstractC0711g implements InterfaceC0095d {

    /* JADX INFO: renamed from: n */
    public C0706b f2822n;

    /* JADX INFO: renamed from: o */
    public boolean f2823o;

    /* JADX INFO: renamed from: p */
    public C0706b f2824p;

    /* JADX INFO: renamed from: q */
    public AbstractC0383m f2825q;

    /* JADX INFO: renamed from: r */
    public int f2826r;

    /* JADX INFO: renamed from: s */
    public int f2827s;

    /* JADX INFO: renamed from: t */
    public boolean f2828t;

    public C0709e(C0706b c0706b, Resources resources) {
        this.f2836e = 255;
        this.f2838g = -1;
        this.f2826r = -1;
        this.f2827s = -1;
        mo1959d(new C0706b(c0706b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0709e m1958e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C0709e c0709e = new C0709e(null, null);
        TypedArray typedArrayM330g = AbstractC0056b.m330g(resources2, theme, attributeSet, AbstractC0777b.f3148a);
        int i2 = 1;
        c0709e.setVisible(typedArrayM330g.getBoolean(1, true), true);
        C0706b c0706b = c0709e.f2824p;
        c0706b.f2794d |= AbstractC0776a.m2126b(typedArrayM330g);
        int i3 = 2;
        c0706b.f2799i = typedArrayM330g.getBoolean(2, c0706b.f2799i);
        int i4 = 3;
        c0706b.f2802l = typedArrayM330g.getBoolean(3, c0706b.f2802l);
        c0706b.f2815y = typedArrayM330g.getInt(4, c0706b.f2815y);
        c0706b.f2816z = typedArrayM330g.getInt(5, c0706b.f2816z);
        boolean z2 = false;
        c0709e.setDither(typedArrayM330g.getBoolean(0, c0706b.f2813w));
        C0706b c0706b2 = c0709e.f2832a;
        if (resources2 != null) {
            c0706b2.f2792b = resources2;
            int i5 = resources2.getDisplayMetrics().densityDpi;
            if (i5 == 0) {
                i5 = 160;
            }
            int i6 = c0706b2.f2793c;
            c0706b2.f2793c = i5;
            if (i6 != i5) {
                c0706b2.f2803m = false;
                c0706b2.f2800j = false;
            }
        } else {
            c0706b2.getClass();
        }
        typedArrayM330g.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i4)) {
                break;
            }
            if (next3 == i3 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayM330g2 = AbstractC0056b.m330g(resources2, theme, attributeSet, AbstractC0777b.f3149b);
                    int resourceId = typedArrayM330g2.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                    int resourceId2 = typedArrayM330g2.getResourceId(i2, -1);
                    Drawable drawableM2323f = resourceId2 > 0 ? C0899S0.m2316d().m2323f(context2, resourceId2) : null;
                    typedArrayM330g2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i9 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, z2)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i7);
                    if (drawableM2323f == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableM2323f = new C1001q();
                            drawableM2323f.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableM2323f = AbstractC0776a.m2125a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM2323f == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C0706b c0706b3 = c0709e.f2824p;
                    int iM1952a = c0706b3.m1952a(drawableM2323f);
                    c0706b3.f2788H[iM1952a] = iArrTrimStateSet;
                    c0706b3.f2790J.m2497d(iM1952a, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray typedArrayM330g3 = AbstractC0056b.m330g(resources2, theme, attributeSet, AbstractC0777b.f3150c);
                    int resourceId3 = typedArrayM330g3.getResourceId(2, -1);
                    int resourceId4 = typedArrayM330g3.getResourceId(1, -1);
                    int resourceId5 = typedArrayM330g3.getResourceId(z2 ? 1 : 0, -1);
                    Drawable drawableM2323f2 = resourceId5 > 0 ? C0899S0.m2316d().m2323f(context2, resourceId5) : null;
                    boolean z3 = typedArrayM330g3.getBoolean(3, z2);
                    typedArrayM330g3.recycle();
                    if (drawableM2323f2 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            drawableM2323f2 = new C0989e(context2);
                            drawableM2323f2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableM2323f2 = AbstractC0776a.m2125a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM2323f2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    C0706b c0706b4 = c0709e.f2824p;
                    int iM1952a2 = c0706b4.m1952a(drawableM2323f2);
                    long j2 = resourceId3;
                    long j3 = resourceId4;
                    long j4 = (j2 << 32) | j3;
                    long j5 = z3 ? 8589934592L : 0L;
                    long j6 = iM1952a2;
                    c0706b4.f2789I.m2475a(j4, Long.valueOf(j6 | j5));
                    if (z3) {
                        c0706b4.f2789I.m2475a((j3 << 32) | j2, Long.valueOf(j6 | 4294967296L | j5));
                    }
                    context2 = context;
                    resources2 = resources;
                    i2 = 1;
                    z2 = false;
                    i3 = 2;
                    i4 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i2 = 1;
                i3 = 2;
                i4 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // p065g.AbstractC0711g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p065g.AbstractC0711g
    /* JADX INFO: renamed from: d */
    public final void mo1959d(C0706b c0706b) {
        this.f2832a = c0706b;
        int i2 = this.f2838g;
        if (i2 >= 0) {
            Drawable drawableM1955d = c0706b.m1955d(i2);
            this.f2834c = drawableM1955d;
            if (drawableM1955d != null) {
                m1963b(drawableM1955d);
            }
        }
        this.f2835d = null;
        this.f2822n = c0706b;
        this.f2824p = c0706b;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m1960f() {
        if (!this.f2823o) {
            super.mutate();
            C0706b c0706b = this.f2822n;
            c0706b.f2789I = c0706b.f2789I.clone();
            c0706b.f2790J = c0706b.f2790J.clone();
            this.f2823o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p065g.AbstractC0711g, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0383m abstractC0383m = this.f2825q;
        if (abstractC0383m != null) {
            abstractC0383m.mo1077j0();
            this.f2825q = null;
            m1964c(this.f2826r);
            this.f2826r = -1;
            this.f2827s = -1;
        }
    }

    @Override // p065g.AbstractC0711g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f2828t) {
            m1960f();
            C0706b c0706b = this.f2824p;
            c0706b.f2789I = c0706b.f2789I.clone();
            c0706b.f2790J = c0706b.f2790J.clone();
            this.f2828t = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int iM1956e;
        AbstractC0383m c0705a;
        C0706b c0706b = this.f2824p;
        int iM1957f = c0706b.m1957f(iArr);
        if (iM1957f < 0) {
            iM1957f = c0706b.m1957f(StateSet.WILD_CARD);
        }
        int i2 = this.f2838g;
        if (iM1957f != i2) {
            AbstractC0383m abstractC0383m = this.f2825q;
            if (abstractC0383m == null) {
                this.f2825q = null;
                this.f2827s = -1;
                this.f2826r = -1;
                C0706b c0706b2 = this.f2824p;
                int iM1956e2 = c0706b2.m1956e(i2);
                iM1956e = c0706b2.m1956e(iM1957f);
                if (iM1956e == 0 && iM1956e2 != 0) {
                    long j2 = ((long) iM1956e) | (((long) iM1956e2) << 32);
                    int iLongValue = (int) ((Long) c0706b2.f2789I.m2479e(j2)).longValue();
                    if (iLongValue >= 0) {
                        boolean z2 = (((Long) c0706b2.f2789I.m2479e(j2)).longValue() & 8589934592L) != 0;
                        m1964c(iLongValue);
                        Object obj = this.f2834c;
                        if (obj instanceof AnimationDrawable) {
                            c0705a = new C0707c((AnimationDrawable) obj, (((Long) c0706b2.f2789I.m2479e(j2)).longValue() & 4294967296L) != 0, z2);
                        } else if (obj instanceof C0989e) {
                            c0705a = new C0705a((C0989e) obj, 1);
                        } else {
                            if (obj instanceof Animatable) {
                                c0705a = new C0705a((Animatable) obj, 0);
                            }
                            if (m1964c(iM1957f)) {
                            }
                        }
                        c0705a.mo1075i0();
                        this.f2825q = c0705a;
                        this.f2827s = i2;
                        this.f2826r = iM1957f;
                        z = true;
                    }
                } else if (m1964c(iM1957f)) {
                    z = true;
                }
            } else {
                if (iM1957f != this.f2826r) {
                    if (iM1957f == this.f2827s && abstractC0383m.mo1073h()) {
                        abstractC0383m.mo1070Y();
                        this.f2826r = this.f2827s;
                        this.f2827s = iM1957f;
                    } else {
                        i2 = this.f2826r;
                        abstractC0383m.mo1077j0();
                        this.f2825q = null;
                        this.f2827s = -1;
                        this.f2826r = -1;
                        C0706b c0706b22 = this.f2824p;
                        int iM1956e22 = c0706b22.m1956e(i2);
                        iM1956e = c0706b22.m1956e(iM1957f);
                        if (iM1956e == 0) {
                            if (m1964c(iM1957f)) {
                            }
                        }
                    }
                }
                z = true;
            }
        }
        Drawable drawable = this.f2834c;
        return drawable != null ? drawable.setState(iArr) | z : z;
    }

    @Override // p065g.AbstractC0711g, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        AbstractC0383m abstractC0383m = this.f2825q;
        if (abstractC0383m != null && (visible || z3)) {
            if (z2) {
                abstractC0383m.mo1075i0();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
