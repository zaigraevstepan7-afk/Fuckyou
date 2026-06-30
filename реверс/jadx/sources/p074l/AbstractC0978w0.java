package p074l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978w0 {

    /* JADX INFO: renamed from: a */
    public static final Field f3869a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f3869a = declaredField;
    }
}
