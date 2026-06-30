package p009F;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001A0.AbstractC0016e;
import p007E.C0061g;
import p007E.C0062h;
import p018K.C0155k;

/* JADX INFO: renamed from: F.j */
/* JADX INFO: loaded from: classes.dex */
public class C0083j extends C0081h {

    /* JADX INFO: renamed from: p */
    public final Class f256p;

    /* JADX INFO: renamed from: q */
    public final Constructor f257q;

    /* JADX INFO: renamed from: r */
    public final Method f258r;

    /* JADX INFO: renamed from: s */
    public final Method f259s;

    /* JADX INFO: renamed from: t */
    public final Method f260t;

    /* JADX INFO: renamed from: u */
    public final Method f261u;

    /* JADX INFO: renamed from: v */
    public final Method f262v;

    public C0083j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM371J0;
        Method method2;
        Method method3;
        Method methodMo377K0;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM371J0 = m371J0(cls);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodMo377K0 = mo377K0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            cls = null;
            method = null;
            constructor = null;
            methodM371J0 = null;
            method2 = null;
            method3 = null;
            methodMo377K0 = null;
        }
        this.f256p = cls;
        this.f257q = constructor;
        this.f258r = methodM371J0;
        this.f259s = method2;
        this.f260t = method3;
        this.f261u = method;
        this.f262v = methodMo377K0;
    }

    /* JADX INFO: renamed from: J0 */
    public static Method m371J0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m372E0(Object obj) {
        try {
            this.f261u.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m373F0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f258r.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public Typeface mo374G0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f256p, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f262v.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m375H0(Object obj) {
        try {
            return ((Boolean) this.f260t.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final Object m376I0() {
        try {
            return this.f257q.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public Method mo377K0(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p009F.C0081h, p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u */
    public final Typeface mo225u(Context context, C0061g c0061g, Resources resources, int i2) {
        Method method = this.f258r;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo225u(context, c0061g, resources, i2);
        }
        Object objM376I0 = m376I0();
        if (objM376I0 != null) {
            C0062h[] c0062hArr = c0061g.f197a;
            int length = c0062hArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0062h c0062h = c0062hArr[i3];
                String str = c0062h.f198a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0062h.f201d);
                Context context2 = context;
                if (!m373F0(context2, objM376I0, str, c0062h.f202e, c0062h.f199b, c0062h.f200c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m372E0(objM376I0);
                    return null;
                }
                i3++;
                context = context2;
            }
            if (m375H0(objM376I0)) {
                return mo374G0(objM376I0);
            }
        }
        return null;
    }

    @Override // p009F.C0081h, p001A0.AbstractC0016e
    /* JADX INFO: renamed from: v */
    public final Typeface mo227v(Context context, C0155k[] c0155kArr, int i2) {
        Typeface typefaceMo374G0;
        boolean zBooleanValue;
        if (c0155kArr.length >= 1) {
            Method method = this.f258r;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (C0155k c0155k : c0155kArr) {
                    if (c0155k.f490e == 0) {
                        Uri uri = c0155k.f486a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC0016e.m181j0(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM376I0 = m376I0();
                if (objM376I0 != null) {
                    boolean z2 = false;
                    for (C0155k c0155k2 : c0155kArr) {
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0155k2.f486a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f259s.invoke(objM376I0, byteBuffer, Integer.valueOf(c0155k2.f487b), null, Integer.valueOf(c0155k2.f488c), Integer.valueOf(c0155k2.f489d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m372E0(objM376I0);
                                return null;
                            }
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        m372E0(objM376I0);
                        return null;
                    }
                    if (m375H0(objM376I0) && (typefaceMo374G0 = mo374G0(objM376I0)) != null) {
                        return Typeface.create(typefaceMo374G0, i2);
                    }
                }
            } else {
                C0155k c0155kMo206E = mo206E(i2, c0155kArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0155kMo206E.f486a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0155kMo206E.f488c).setItalic(c0155kMo206E.f489d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: x */
    public final Typeface mo229x(Context context, Resources resources, int i2, String str, int i3) {
        Method method = this.f258r;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo229x(context, resources, i2, str, i3);
        }
        Object objM376I0 = m376I0();
        if (objM376I0 != null) {
            if (!m373F0(context, objM376I0, str, 0, -1, -1, null)) {
                m372E0(objM376I0);
                return null;
            }
            if (m375H0(objM376I0)) {
                return mo374G0(objM376I0);
            }
        }
        return null;
    }
}
