package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p001A0.AbstractC0016e;
import p007E.C0061g;
import p007E.C0062h;
import p018K.C0155k;
import p084q.C1031j;

/* JADX INFO: renamed from: F.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0082i extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public static final Class f252k;

    /* JADX INFO: renamed from: l */
    public static final Constructor f253l;

    /* JADX INFO: renamed from: m */
    public static final Method f254m;

    /* JADX INFO: renamed from: n */
    public static final Method f255n;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e = e2;
        }
        try {
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f253l = constructor;
        f252k = cls;
        f254m = method2;
        f255n = method;
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m369C0(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f254m.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static Typeface m370D0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f252k, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f255n.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[SYNTHETIC] */
    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface mo225u(Context context, C0061g c0061g, Resources resources, int i2) {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f253l.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C0062h c0062h : c0061g.f197a) {
                int i3 = c0062h.f203f;
                File fileM169Z = AbstractC0016e.m169Z(context);
                if (fileM169Z != null) {
                    try {
                        if (AbstractC0016e.m194r(fileM169Z, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(fileM169Z);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map == null) {
                                    if (m369C0(objNewInstance, map, c0062h.f202e, c0062h.f199b, c0062h.f200c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileM169Z.delete();
                    }
                }
                map = null;
                if (map == null) {
                }
            }
            return m370D0(objNewInstance);
        }
        return null;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: v */
    public final Typeface mo227v(Context context, C0155k[] c0155kArr, int i2) {
        Object objNewInstance;
        int i3 = 0;
        try {
            objNewInstance = f253l.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C1031j c1031j = new C1031j(0);
            int length = c0155kArr.length;
            while (true) {
                if (i3 >= length) {
                    Typeface typefaceM370D0 = m370D0(objNewInstance);
                    if (typefaceM370D0 != null) {
                        return Typeface.create(typefaceM370D0, i2);
                    }
                } else {
                    C0155k c0155k = c0155kArr[i3];
                    Uri uri = c0155k.f486a;
                    ByteBuffer byteBufferM181j0 = (ByteBuffer) c1031j.get(uri);
                    if (byteBufferM181j0 == null) {
                        byteBufferM181j0 = AbstractC0016e.m181j0(context, uri);
                        c1031j.put(uri, byteBufferM181j0);
                    }
                    if (byteBufferM181j0 == null) {
                        break;
                    }
                    if (!m369C0(objNewInstance, byteBufferM181j0, c0155k.f487b, c0155k.f488c, c0155k.f489d)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }
}
