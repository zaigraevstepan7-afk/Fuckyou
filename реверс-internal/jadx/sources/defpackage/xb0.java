package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb0 extends a0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, xb0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected u32 unknownFields;

    public xb0() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = u32.f;
    }

    public static xb0 d(Class cls) {
        xb0 xb0Var = defaultInstanceMap.get(cls);
        if (xb0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xb0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (xb0Var != null) {
            return xb0Var;
        }
        xb0 xb0Var2 = (xb0) ((xb0) f42.d(cls)).c(6);
        if (xb0Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, xb0Var2);
        return xb0Var2;
    }

    public static Object e(Method method, xb0 xb0Var, Object... objArr) {
        try {
            return method.invoke(xb0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(xb0 xb0Var, boolean z) {
        byte bByteValue = ((Byte) xb0Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        lb1 lb1Var = lb1.c;
        lb1Var.getClass();
        boolean zE = lb1Var.a(xb0Var.getClass()).e(xb0Var);
        if (z) {
            xb0Var.c(2);
        }
        return zE;
    }

    public static void j(Class cls, xb0 xb0Var) {
        xb0Var.h();
        defaultInstanceMap.put(cls, xb0Var);
    }

    @Override // defpackage.a0
    public final int a(si1 si1Var) {
        int iD;
        int iD2;
        if (g()) {
            if (si1Var == null) {
                lb1 lb1Var = lb1.c;
                lb1Var.getClass();
                iD2 = lb1Var.a(getClass()).d(this);
            } else {
                iD2 = si1Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            yc.l(s91.i("serialized size must be non-negative, was ", iD2));
            return UNINITIALIZED_HASH_CODE;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (si1Var == null) {
            lb1 lb1Var2 = lb1.c;
            lb1Var2.getClass();
            iD = lb1Var2.a(getClass()).d(this);
        } else {
            iD = si1Var.d(this);
        }
        k(iD);
        return iD;
    }

    @Override // defpackage.a0
    public final void b(nl nlVar) {
        lb1 lb1Var = lb1.c;
        lb1Var.getClass();
        si1 si1VarA = lb1Var.a(getClass());
        qt0 qt0Var = nlVar.a;
        if (qt0Var == null) {
            qt0Var = new qt0(nlVar);
        }
        si1VarA.f(this, qt0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lb1 lb1Var = lb1.c;
        lb1Var.getClass();
        return lb1Var.a(getClass()).g(this, (xb0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            lb1 lb1Var = lb1.c;
            lb1Var.getClass();
            return lb1Var.a(getClass()).a(this);
        }
        if (this.memoizedHashCode == 0) {
            lb1 lb1Var2 = lb1.c;
            lb1Var2.getClass();
            this.memoizedHashCode = lb1Var2.a(getClass()).a(this);
        }
        return this.memoizedHashCode;
    }

    public final xb0 i() {
        return (xb0) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            yc.l(s91.i("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = fv0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        fv0.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
