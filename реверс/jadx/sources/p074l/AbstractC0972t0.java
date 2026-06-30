package p074l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.t0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972t0 {

    /* JADX INFO: renamed from: a */
    public static final Method f3854a;

    /* JADX INFO: renamed from: b */
    public static final Method f3855b;

    /* JADX INFO: renamed from: c */
    public static final Method f3856c;

    /* JADX INFO: renamed from: d */
    public static final boolean f3857d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f3854a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f3855b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f3856c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f3857d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
