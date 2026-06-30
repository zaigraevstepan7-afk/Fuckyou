package p024N;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: N.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0271l0 {

    /* JADX INFO: renamed from: a */
    public static final Field f839a;

    /* JADX INFO: renamed from: b */
    public static final Field f840b;

    /* JADX INFO: renamed from: c */
    public static final Field f841c;

    /* JADX INFO: renamed from: d */
    public static final boolean f842d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f839a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f840b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f841c = declaredField3;
            declaredField3.setAccessible(true);
            f842d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
