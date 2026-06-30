package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001A0.AbstractC0016e;
import p007E.C0061g;
import p007E.C0062h;
import p018K.C0155k;

/* JADX INFO: renamed from: F.h */
/* JADX INFO: loaded from: classes.dex */
public class C0081h extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public static Class f247k;

    /* JADX INFO: renamed from: l */
    public static Constructor f248l;

    /* JADX INFO: renamed from: m */
    public static Method f249m;

    /* JADX INFO: renamed from: n */
    public static Method f250n;

    /* JADX INFO: renamed from: o */
    public static boolean f251o;

    /* JADX INFO: renamed from: C0 */
    public static boolean m367C0(Object obj, String str, int i2, boolean z2) {
        m368D0();
        try {
            try {
                return ((Boolean) f249m.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m368D0() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f251o) {
            return;
        }
        f251o = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e = e2;
        }
        try {
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f248l = constructor;
        f247k = cls;
        f249m = method2;
        f250n = method;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u */
    public Typeface mo225u(Context context, C0061g c0061g, Resources resources, int i2) {
        m368D0();
        try {
            Object objNewInstance = f248l.newInstance(new Object[0]);
            for (C0062h c0062h : c0061g.f197a) {
                File fileM169Z = AbstractC0016e.m169Z(context);
                if (fileM169Z == null) {
                    return null;
                }
                try {
                    if (!AbstractC0016e.m194r(fileM169Z, resources, c0062h.f203f)) {
                        return null;
                    }
                    if (!m367C0(objNewInstance, fileM169Z.getPath(), c0062h.f199b, c0062h.f200c)) {
                        return null;
                    }
                    fileM169Z.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM169Z.delete();
                }
            }
            m368D0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f247k, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f250n.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: v */
    public Typeface mo227v(Context context, C0155k[] c0155kArr, int i2) {
        String str;
        if (c0155kArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo206E(i2, c0155kArr).f486a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo228w = mo228w(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo228w;
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
        return null;
    }
}
