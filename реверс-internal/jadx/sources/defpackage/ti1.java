package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ti1 {
    public static final Class a;
    public static final v32 b;
    public static final v32 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        lb1 lb1Var = lb1.c;
        v32 v32Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            lb1 lb1Var2 = lb1.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                v32Var = (v32) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = v32Var;
        c = new v32();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nl.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nl.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nl.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nl.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nl.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += nl.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += nl.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nl.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nl.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(v32 v32Var, Object obj, Object obj2) {
        v32Var.getClass();
        xb0 xb0Var = (xb0) obj;
        u32 u32Var = xb0Var.unknownFields;
        u32 u32Var2 = ((xb0) obj2).unknownFields;
        u32 u32Var3 = u32.f;
        if (!u32Var3.equals(u32Var2)) {
            if (u32Var3.equals(u32Var)) {
                int i = u32Var.a + u32Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(u32Var.b, i);
                System.arraycopy(u32Var2.b, 0, iArrCopyOf, u32Var.a, u32Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(u32Var.c, i);
                System.arraycopy(u32Var2.c, 0, objArrCopyOf, u32Var.a, u32Var2.a);
                u32Var = new u32(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                u32Var.getClass();
                if (!u32Var2.equals(u32Var3)) {
                    if (!u32Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = u32Var.a + u32Var2.a;
                    u32Var.a(i2);
                    System.arraycopy(u32Var2.b, 0, u32Var.b, u32Var.a, u32Var2.a);
                    System.arraycopy(u32Var2.c, 0, u32Var.c, u32Var.a, u32Var2.a);
                    u32Var.a = i2;
                }
            }
        }
        xb0Var.unknownFields = u32Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3++;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                nlVar.getClass();
                nlVar.t(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 8;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nl.j(((Integer) list.get(i3)).intValue());
        }
        nlVar.D(iJ);
        while (i2 < list.size()) {
            nlVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 4;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 8;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                nlVar.getClass();
                nlVar.r(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 4;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nl.j(((Integer) list.get(i3)).intValue());
        }
        nlVar.D(iJ);
        while (i2 < list.size()) {
            nlVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nl.j(((Long) list.get(i3)).longValue());
        }
        nlVar.D(iJ);
        while (i2 < list.size()) {
            nlVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 4;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = nl.f;
            i3 += 8;
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nlVar.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += nl.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            nlVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                nlVar.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += nl.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        nlVar.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            nlVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += nl.i(((Integer) list.get(i4)).intValue());
        }
        nlVar.D(i3);
        while (i2 < list.size()) {
            nlVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, qt0 qt0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nl nlVar = (nl) qt0Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nlVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nlVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nl.j(((Long) list.get(i3)).longValue());
        }
        nlVar.D(iJ);
        while (i2 < list.size()) {
            nlVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, ji0 ji0Var, Object obj2, v32 v32Var) {
        return obj2;
    }
}
