package p074l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import p067h.AbstractC0776a;
import p075l0.C0989e;
import p075l0.C1001q;

/* JADX INFO: renamed from: l.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0897R0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3598a;

    public /* synthetic */ C0897R0(int i2) {
        this.f3598a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m2315a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f3598a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) C0897R0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        AbstractC0776a.m2127c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    } catch (Exception e2) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                } catch (Exception e3) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                    return null;
                }
                break;
            case 2:
                try {
                    Resources resources = context.getResources();
                    C0989e c0989e = new C0989e(context);
                    c0989e.inflate(resources, xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                    return null;
                }
                break;
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1001q c1001q = new C1001q();
                    c1001q.inflate(resources2, xmlResourceParser, attributeSet, theme);
                } catch (Exception e5) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                    return null;
                }
                break;
        }
        return null;
    }
}
