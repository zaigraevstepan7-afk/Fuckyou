package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mk implements kk {
    public static final Map b;
    public final Class a;

    static {
        Map mapSingletonMap;
        List listH = hk.H(ha0.class, sa0.class, wa0.class, xa0.class, ya0.class, za0.class, ab0.class, bb0.class, cb0.class, db0.class, ia0.class, ja0.class, ka0.class, la0.class, ma0.class, na0.class, oa0.class, pa0.class, qa0.class, ra0.class, ta0.class, ua0.class, va0.class);
        ArrayList arrayList = new ArrayList(ql.Y(listH, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : listH) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                hk.V();
                throw null;
            }
            arrayList.add(new j41((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = g40.e;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(bl.I(arrayList.size()));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                j41 j41Var = (j41) obj2;
                mapSingletonMap.put(j41Var.e, j41Var.f);
            }
        } else {
            j41 j41Var2 = (j41) arrayList.get(0);
            j41Var2.getClass();
            mapSingletonMap = Collections.singletonMap(j41Var2.e, j41Var2.f);
            mapSingletonMap.getClass();
        }
        b = mapSingletonMap;
    }

    public mk(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.kk
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String strX;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strX2 = lk.x(cls.getName());
            return strX2 == null ? cls.getCanonicalName() : strX2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strX = lk.x(componentType.getName())) != null) {
            strConcat = strX.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strI0;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strI02 = lk.i0(cls.getName());
                return strI02 == null ? cls.getSimpleName() : strI02;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strI0 = lk.i0(componentType.getName())) != null) {
                strConcat = strI0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ct1.T(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iO = ct1.O(simpleName, '$', 0, 6);
            return iO == -1 ? simpleName : simpleName.substring(iO + 1, simpleName.length());
        }
        return ct1.T(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mk) && lk.Q(this).equals(lk.Q((mk) obj));
    }

    public final int hashCode() {
        return lk.Q(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
