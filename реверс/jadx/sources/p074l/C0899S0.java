package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p006D.AbstractC0051a;
import p011G.AbstractC0092a;
import p075l0.C1001q;
import p084q.AbstractC1030i;
import p084q.C1029h;
import p084q.C1031j;
import p084q.C1032k;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: l.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0899S0 {

    /* JADX INFO: renamed from: i */
    public static C0899S0 f3600i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f3602a;

    /* JADX INFO: renamed from: b */
    public C1031j f3603b;

    /* JADX INFO: renamed from: c */
    public C1032k f3604c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f3605d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f3606e;

    /* JADX INFO: renamed from: f */
    public boolean f3607f;

    /* JADX INFO: renamed from: g */
    public C0971t f3608g;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f3599h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final C0896Q0 f3601j = new C0896Q0(6);

    /* JADX INFO: renamed from: d */
    public static synchronized C0899S0 m2316d() {
        try {
            if (f3600i == null) {
                C0899S0 c0899s0 = new C0899S0();
                f3600i = c0899s0;
                m2318j(c0899s0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3600i;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized PorterDuffColorFilter m2317h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0896Q0 c0896q0 = f3601j;
        c0896q0.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0896q0.m2085f(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: j */
    public static void m2318j(C0899S0 c0899s0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0899s0.m2319a("vector", new C0897R0(3));
            c0899s0.m2319a("animated-vector", new C0897R0(2));
            c0899s0.m2319a("animated-selector", new C0897R0(1));
            c0899s0.m2319a("drawable", new C0897R0(0));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2319a(String str, C0897R0 c0897r0) {
        if (this.f3603b == null) {
            this.f3603b = new C1031j(0);
        }
        this.f3603b.put(str, c0897r0);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2320b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1029h c1029h = (C1029h) this.f3605d.get(context);
                if (c1029h == null) {
                    c1029h = new C1029h();
                    this.f3605d.put(context, c1029h);
                }
                c1029h.m2481g(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m2321c(Context context, int i2) {
        if (this.f3606e == null) {
            this.f3606e = new TypedValue();
        }
        TypedValue typedValue = this.f3606e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM2322e = m2322e(context, j2);
        if (drawableM2322e != null) {
            return drawableM2322e;
        }
        LayerDrawable layerDrawableM2420c = null;
        if (this.f3608g != null) {
            if (i2 == R.drawable.resc) {
                layerDrawableM2420c = new LayerDrawable(new Drawable[]{m2323f(context, R.drawable.resc), m2323f(context, R.drawable.resc)});
            } else if (i2 == R.drawable.resc) {
                layerDrawableM2420c = C0971t.m2420c(this, context, R.dimen.resc);
            } else if (i2 == R.drawable.resc) {
                layerDrawableM2420c = C0971t.m2420c(this, context, R.dimen.resc);
            } else if (i2 == R.drawable.resc) {
                layerDrawableM2420c = C0971t.m2420c(this, context, R.dimen.resc);
            }
        }
        if (layerDrawableM2420c != null) {
            layerDrawableM2420c.setChangingConfigurations(typedValue.changingConfigurations);
            m2320b(context, j2, layerDrawableM2420c);
        }
        return layerDrawableM2420c;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m2322e(Context context, long j2) {
        C1029h c1029h = (C1029h) this.f3605d.get(context);
        if (c1029h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1029h.m2478d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM2500b = AbstractC1034a.m2500b(c1029h.f4097b, c1029h.f4099d, j2);
            if (iM2500b >= 0) {
                Object[] objArr = c1029h.f4098c;
                Object obj = objArr[iM2500b];
                Object obj2 = AbstractC1030i.f4100a;
                if (obj != obj2) {
                    objArr[iM2500b] = obj2;
                    c1029h.f4096a = true;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Drawable m2323f(Context context, int i2) {
        return m2324g(context, i2, false);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Drawable m2324g(Context context, int i2, boolean z2) {
        Drawable drawableM2326k;
        try {
            if (!this.f3607f) {
                this.f3607f = true;
                Drawable drawableM2323f = m2323f(context, R.drawable.resc);
                if (drawableM2323f == null || (!(drawableM2323f instanceof C1001q) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2323f.getClass().getName()))) {
                    this.f3607f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM2326k = m2326k(context, i2);
            if (drawableM2326k == null) {
                drawableM2326k = m2321c(context, i2);
            }
            if (drawableM2326k == null) {
                drawableM2326k = AbstractC0051a.m315b(context, i2);
            }
            if (drawableM2326k != null) {
                drawableM2326k = m2329n(context, i2, z2, drawableM2326k);
            }
            if (drawableM2326k != null) {
                AbstractC0966r0.m2413a(drawableM2326k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM2326k;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized ColorStateList m2325i(Context context, int i2) {
        ColorStateList colorStateList;
        C1032k c1032k;
        WeakHashMap weakHashMap = this.f3602a;
        ColorStateList colorStateListM2422d = null;
        colorStateList = (weakHashMap == null || (c1032k = (C1032k) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1032k.m2496c(i2);
        if (colorStateList == null) {
            C0971t c0971t = this.f3608g;
            if (c0971t != null) {
                colorStateListM2422d = c0971t.m2422d(context, i2);
            }
            if (colorStateListM2422d != null) {
                if (this.f3602a == null) {
                    this.f3602a = new WeakHashMap();
                }
                C1032k c1032k2 = (C1032k) this.f3602a.get(context);
                if (c1032k2 == null) {
                    c1032k2 = new C1032k();
                    this.f3602a.put(context, c1032k2);
                }
                c1032k2.m2494a(i2, colorStateListM2422d);
            }
            colorStateList = colorStateListM2422d;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m2326k(Context context, int i2) {
        int next;
        C1031j c1031j = this.f3603b;
        if (c1031j == null || c1031j.isEmpty()) {
            return null;
        }
        C1032k c1032k = this.f3604c;
        if (c1032k != null) {
            String str = (String) c1032k.m2496c(i2);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f3603b.get(str) == null) {
                return null;
            }
        } else {
            this.f3604c = new C1032k();
        }
        if (this.f3606e == null) {
            this.f3606e = new TypedValue();
        }
        TypedValue typedValue = this.f3606e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM2322e = m2322e(context, j2);
        if (drawableM2322e != null) {
            return drawableM2322e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                String name = xml.getName();
                this.f3604c.m2494a(i2, name);
                C0897R0 c0897r0 = (C0897R0) this.f3603b.get(name);
                if (c0897r0 != null) {
                    drawableM2322e = c0897r0.m2315a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM2322e != null) {
                    drawableM2322e.setChangingConfigurations(typedValue.changingConfigurations);
                    m2320b(context, j2, drawableM2322e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableM2322e == null) {
            this.f3604c.m2494a(i2, "appcompat_skip_skip");
        }
        return drawableM2322e;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m2327l(Context context) {
        C1029h c1029h = (C1029h) this.f3605d.get(context);
        if (c1029h != null) {
            c1029h.m2476b();
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m2328m(C0971t c0971t) {
        this.f3608g = c0971t;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m2329n(Context context, int i2, boolean z2, Drawable drawable) {
        int i3;
        int iRound;
        boolean z3;
        ColorStateList colorStateListM2325i = m2325i(context, i2);
        PorterDuff.Mode mode = null;
        if (colorStateListM2325i != null) {
            Drawable drawableM154B0 = AbstractC0016e.m154B0(drawable.mutate());
            AbstractC0092a.m429h(drawableM154B0, colorStateListM2325i);
            if (this.f3608g != null && i2 == R.drawable.resc) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0092a.m430i(drawableM154B0, mode);
            }
            return drawableM154B0;
        }
        if (this.f3608g != null) {
            if (i2 == R.drawable.resc) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM2346c = AbstractC0911Y0.m2346c(context, R.attr.resc);
                PorterDuff.Mode mode2 = C0973u.f3858b;
                C0971t.m2421e(drawableFindDrawableByLayerId, iM2346c, mode2);
                C0971t.m2421e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC0911Y0.m2346c(context, R.attr.resc), mode2);
                C0971t.m2421e(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC0911Y0.m2346c(context, R.attr.resc), mode2);
                return drawable;
            }
            if (i2 == R.drawable.resc || i2 == R.drawable.resc || i2 == R.drawable.resc) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM2345b = AbstractC0911Y0.m2345b(context, R.attr.resc);
                PorterDuff.Mode mode3 = C0973u.f3858b;
                C0971t.m2421e(drawableFindDrawableByLayerId2, iM2345b, mode3);
                C0971t.m2421e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC0911Y0.m2346c(context, R.attr.resc), mode3);
                C0971t.m2421e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC0911Y0.m2346c(context, R.attr.resc), mode3);
                return drawable;
            }
        }
        C0971t c0971t = this.f3608g;
        boolean z4 = false;
        if (c0971t != null) {
            PorterDuff.Mode mode4 = C0973u.f3858b;
            if (C0971t.m2418a(c0971t.f3848a, i2)) {
                i3 = R.attr.resc;
            } else if (C0971t.m2418a(c0971t.f3850c, i2)) {
                i3 = R.attr.resc;
            } else {
                if (C0971t.m2418a(c0971t.f3851d, i2)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i2 == R.drawable.resc) {
                    iRound = Math.round(40.8f);
                    i3 = android.R.attr.colorForeground;
                    z3 = true;
                    if (z3) {
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C0973u.m2424c(AbstractC0911Y0.m2346c(context, i3), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z4 = true;
                    }
                } else if (i2 != R.drawable.resc) {
                    i3 = 0;
                    iRound = -1;
                    z3 = false;
                    if (z3) {
                    }
                }
                i3 = android.R.attr.colorBackground;
            }
            iRound = -1;
            z3 = true;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
