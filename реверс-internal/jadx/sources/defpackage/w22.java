package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class w22 extends qc1 {
    public static Class j;
    public static Constructor k;
    public static Method l;
    public static Method m;
    public static boolean n;
    public final Class c;
    public final Constructor d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public w22() throws NoSuchMethodException {
        Method methodF;
        Constructor<?> constructor;
        Method methodE;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodE = E(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodF = F(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodF = null;
            constructor = null;
            methodE = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.e = methodE;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = methodF;
    }

    public static boolean A(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        D();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void D() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static Method E(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Typeface B(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean C(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method F(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.qc1
    public final Typeface h(Context context, s90 s90Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        t90[] t90VarArr = s90Var.a;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            D();
            try {
                Object objNewInstance2 = k.newInstance(null);
                for (t90 t90Var : t90VarArr) {
                    File fileQ = uc1.q(context);
                    if (fileQ != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(t90Var.f);
                                try {
                                    boolean zI = uc1.i(fileQ, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zI) {
                                        fileQ.delete();
                                        return null;
                                    }
                                    if (!A(objNewInstance2, fileQ.getPath(), t90Var.b, t90Var.c)) {
                                        fileQ.delete();
                                        return null;
                                    }
                                    fileQ.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileQ.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileQ.delete();
                            throw th4;
                        }
                    }
                }
                D();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) j, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) m.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = t90VarArr.length;
            while (true) {
                if (i2 < length) {
                    t90 t90Var2 = t90VarArr[i2];
                    w22 w22Var = this;
                    Context context2 = context;
                    if (w22Var.z(context2, objNewInstance, t90Var2.a, t90Var2.e, t90Var2.b, t90Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(t90Var2.d))) {
                        i2++;
                        this = w22Var;
                        context = context2;
                    } else {
                        try {
                            w22Var.h.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    w22 w22Var2 = this;
                    if (w22Var2.C(objNewInstance)) {
                        return w22Var2.B(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.qc1
    public final Typeface i(Context context, ca0[] ca0VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceB;
        boolean zBooleanValue;
        if (ca0VarArr.length >= 1) {
            Method method = this.e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (ca0 ca0Var : ca0VarArr) {
                        if (ca0Var.f == 0) {
                            Uri uri = ca0Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, uc1.v(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = ca0VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.h;
                            if (i2 < length) {
                                ca0 ca0Var2 = ca0VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(ca0Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f.invoke(objNewInstance, byteBuffer, Integer.valueOf(ca0Var2.b), null, Integer.valueOf(ca0Var2.c), Integer.valueOf(ca0Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (C(objNewInstance) && (typefaceB = B(objNewInstance)) != null) {
                                return Typeface.create(typefaceB, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    ca0 ca0Var3 = null;
                    for (ca0 ca0Var4 : ca0VarArr) {
                        int iAbs = (Math.abs(ca0Var4.c - i3) * 2) + (ca0Var4.d == z2 ? 0 : 1);
                        if (ca0Var3 == null || i4 > iAbs) {
                            ca0Var3 = ca0Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(ca0Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(ca0Var3.c).setItalic(ca0Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.qc1
    public final Typeface k(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!z(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (C(objNewInstance)) {
                    return B(objNewInstance);
                }
            }
        } else {
            File fileQ = uc1.q(context);
            try {
                if (fileQ != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zI = uc1.i(fileQ, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zI) {
                                fileQ.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileQ.getPath());
                            fileQ.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                fileQ.delete();
                return null;
            } catch (Throwable th4) {
                fileQ.delete();
                throw th4;
            }
        }
        return null;
    }

    public final boolean z(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
