package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q62 extends s62 {
    public static q62 c;
    public static final i32 d = new i32();
    public final Application b;

    public q62(Application application) {
        this.b = application;
    }

    @Override // defpackage.s62, defpackage.r62
    public final o62 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.s62, defpackage.r62
    public final o62 b(Class cls, cx0 cx0Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) cx0Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!b9.class.isAssignableFrom(cls)) {
            return xk.l(cls);
        }
        yc.p("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final o62 d(Class cls, Application application) {
        if (!b9.class.isAssignableFrom(cls)) {
            return xk.l(cls);
        }
        try {
            o62 o62Var = (o62) cls.getConstructor(Application.class).newInstance(application);
            o62Var.getClass();
            return o62Var;
        } catch (IllegalAccessException e) {
            yc.i("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            yc.i("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            yc.i("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            yc.i("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
