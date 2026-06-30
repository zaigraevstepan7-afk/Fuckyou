package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u52 {
    public final ld a;
    public final ld b;
    public final ld c;

    public u52(ld ldVar, ld ldVar2, ld ldVar3) {
        this.a = ldVar;
        this.b = ldVar2;
        this.c = ldVar3;
    }

    public abstract v52 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        ld ldVar = this.c;
        Class cls2 = (Class) ldVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        ldVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        ld ldVar = this.a;
        Method method = (Method) ldVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, u52.class.getClassLoader()).getDeclaredMethod("read", u52.class);
        ldVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ld ldVar = this.b;
        Method method = (Method) ldVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, u52.class);
        ldVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((v52) this).e.readParcelable(v52.class.getClassLoader());
    }

    public final w52 g() {
        String string = ((v52) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (w52) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(w52 w52Var) {
        if (w52Var == null) {
            ((v52) this).e.writeString(null);
            return;
        }
        try {
            ((v52) this).e.writeString(b(w52Var.getClass()).getName());
            v52 v52VarA = a();
            try {
                d(w52Var.getClass()).invoke(null, w52Var, v52VarA);
                Parcel parcel = v52VarA.e;
                int i = v52VarA.i;
                if (i >= 0) {
                    int i2 = v52VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(w52Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
