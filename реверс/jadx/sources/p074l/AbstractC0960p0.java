package p074l;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960p0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f3824a;

    /* JADX INFO: renamed from: b */
    public static final Method f3825b;

    /* JADX INFO: renamed from: c */
    public static final Field f3826c;

    /* JADX INFO: renamed from: d */
    public static final Field f3827d;

    /* JADX INFO: renamed from: e */
    public static final Field f3828e;

    /* JADX INFO: renamed from: f */
    public static final Field f3829f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z2;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z2 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z2 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z2) {
            f3825b = method;
            f3826c = field;
            f3827d = field2;
            f3828e = field3;
            f3829f = field4;
            f3824a = true;
            return;
        }
        f3825b = null;
        f3826c = null;
        f3827d = null;
        f3828e = null;
        f3829f = null;
        f3824a = false;
    }
}
