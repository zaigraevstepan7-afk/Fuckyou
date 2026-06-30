package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0584p {

    /* JADX INFO: renamed from: b */
    public static int f1153b;

    /* JADX INFO: renamed from: c */
    public static Field f1154c;

    /* JADX INFO: renamed from: d */
    public static Field f1155d;

    /* JADX INFO: renamed from: e */
    public static Field f1156e;

    /* JADX INFO: renamed from: a */
    public AbstractActivityC0466k f1157a;

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        if (enumC0580l != EnumC0580l.ON_DESTROY) {
            return;
        }
        if (f1153b == 0) {
            try {
                f1153b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f1155d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f1156e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f1154c = declaredField3;
                declaredField3.setAccessible(true);
                f1153b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1153b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1157a.getSystemService("input_method");
            try {
                Object obj = f1154c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) f1155d.get(inputMethodManager);
                        if (view != null) {
                            if (!view.isAttachedToWindow()) {
                                f1156e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            }
                        }
                    } catch (IllegalAccessException unused2) {
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    } finally {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
