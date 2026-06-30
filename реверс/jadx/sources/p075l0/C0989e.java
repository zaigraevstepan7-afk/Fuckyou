package p075l0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p007E.AbstractC0056b;
import p007E.AbstractC0064j;
import p007E.AbstractC0071q;
import p011G.AbstractC0092a;
import p019K0.C0161c;
import p065g.C0710f;
import p084q.C1027f;

/* JADX INFO: renamed from: l0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0989e extends AbstractC0992h implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f3910g = 0;

    /* JADX INFO: renamed from: c */
    public final Context f3912c;

    /* JADX INFO: renamed from: d */
    public C0161c f3913d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList f3914e = null;

    /* JADX INFO: renamed from: f */
    public final C0710f f3915f = new C0710f(this);

    /* JADX INFO: renamed from: b */
    public final C0987c f3911b = new C0987c();

    public C0989e(Context context) {
        this.f3912c = context;
    }

    @Override // p075l0.AbstractC0992h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m422a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return AbstractC0092a.m423b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0987c c0987c = this.f3911b;
        c0987c.f3905a.draw(canvas);
        if (c0987c.f3906b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getAlpha() : this.f3911b.f3905a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3911b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3918a;
        return drawable != null ? AbstractC0092a.m424c(drawable) : this.f3911b.f3905a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3918a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0988d(this.f3918a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3911b.f3905a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3911b.f3905a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getOpacity() : this.f3911b.f3905a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (r8.f3906b != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r8.f3906b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        r8.f3906b.playTogether(r8.f3907c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        XmlResourceParser animation;
        Animator animatorM2438a;
        C1001q c1001q;
        int next;
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m425d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            C0987c c0987c = this.f3911b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM330g = AbstractC0056b.m330g(resources, theme, attributeSet, AbstractC0985a.f3897e);
                    int resourceId = typedArrayM330g.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C1001q.f3973j;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c1001q = new C1001q();
                            ThreadLocal threadLocal = AbstractC0071q.f219a;
                            c1001q.f3918a = AbstractC0064j.m344a(resources, resourceId, theme);
                            new C1000p(c1001q.f3918a.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
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
                                c1001q = new C1001q();
                                c1001q.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                c1001q = null;
                            } catch (XmlPullParserException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                c1001q = null;
                            }
                        }
                        c1001q.f3978f = false;
                        c1001q.setCallback(this.f3915f);
                        C1001q c1001q2 = c0987c.f3905a;
                        if (c1001q2 != null) {
                            c1001q2.setCallback(null);
                        }
                        c0987c.f3905a = c1001q;
                    }
                    typedArrayM330g.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0985a.f3898f);
                        String string = typedArrayObtainAttributes.getString(0);
                        int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f3912c;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                animatorM2438a = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                } catch (XmlPullParserException e5) {
                                    e = e5;
                                }
                                try {
                                    animatorM2438a = AbstractC0985a.m2438a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e6) {
                                    e = e6;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e7) {
                                    e = e7;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            animatorM2438a.setTarget(c0987c.f3905a.f3974b.f3961b.f3959o.get(string));
                            if (c0987c.f3907c == null) {
                                c0987c.f3907c = new ArrayList();
                                c0987c.f3908d = new C1027f(0);
                            }
                            c0987c.f3907c.add(animatorM2438a);
                            c0987c.f3908d.put(animatorM2438a, string);
                        }
                        typedArrayObtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3911b.f3905a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3918a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3911b.f3906b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.isStateful() : this.f3911b.f3905a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3911b.f3905a.setBounds(rect);
        }
    }

    @Override // p075l0.AbstractC0992h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.setLevel(i2) : this.f3911b.f3905a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.setState(iArr) : this.f3911b.f3905a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f3911b.f3905a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3911b.f3905a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3911b.f3905a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0016e.m203y0(drawable, i2);
        } else {
            this.f3911b.f3905a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m429h(drawable, colorStateList);
        } else {
            this.f3911b.f3905a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m430i(drawable, mode);
        } else {
            this.f3911b.f3905a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3911b.f3905a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0987c c0987c = this.f3911b;
        if (c0987c.f3906b.isStarted()) {
            return;
        }
        c0987c.f3906b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3911b.f3906b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
