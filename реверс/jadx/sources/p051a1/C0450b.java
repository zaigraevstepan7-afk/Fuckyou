package p051a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p024N.C0246Y;
import p033R0.C0353a;
import p035S0.AbstractC0370g;
import p036T.AbstractC0383m;
import p048Z0.InterfaceC0421a;
import p048Z0.InterfaceC0422b;
import p048Z0.InterfaceC0423c;
import p048Z0.InterfaceC0424d;
import p048Z0.InterfaceC0425e;
import p048Z0.InterfaceC0426f;
import p048Z0.InterfaceC0427g;
import p048Z0.InterfaceC0428h;
import p048Z0.InterfaceC0429i;
import p048Z0.InterfaceC0430j;
import p048Z0.InterfaceC0431k;
import p048Z0.InterfaceC0432l;
import p048Z0.InterfaceC0433m;
import p048Z0.InterfaceC0434n;
import p048Z0.InterfaceC0435o;
import p048Z0.InterfaceC0436p;
import p048Z0.InterfaceC0437q;
import p048Z0.InterfaceC0438r;
import p048Z0.InterfaceC0439s;
import p048Z0.InterfaceC0440t;
import p048Z0.InterfaceC0441u;
import p048Z0.InterfaceC0442v;
import p059d1.InterfaceC0644a;
import p064f1.AbstractC0704g;

/* JADX INFO: renamed from: a1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0450b implements InterfaceC0644a, InterfaceC0449a {

    /* JADX INFO: renamed from: b */
    public static final Map f1145b;

    /* JADX INFO: renamed from: a */
    public final Class f1146a;

    static {
        int i2 = 0;
        List listAsList = Arrays.asList(InterfaceC0421a.class, InterfaceC0432l.class, C0246Y.class, InterfaceC0436p.class, InterfaceC0437q.class, InterfaceC0438r.class, InterfaceC0439s.class, InterfaceC0440t.class, InterfaceC0441u.class, InterfaceC0442v.class, InterfaceC0422b.class, InterfaceC0423c.class, InterfaceC0424d.class, InterfaceC0425e.class, InterfaceC0426f.class, InterfaceC0427g.class, InterfaceC0428h.class, InterfaceC0429i.class, InterfaceC0430j.class, InterfaceC0431k.class, InterfaceC0433m.class, InterfaceC0434n.class, InterfaceC0435o.class);
        AbstractC0451c.m1145d(listAsList, "asList(this)");
        ArrayList arrayList = new ArrayList(listAsList.size());
        for (Object obj : listAsList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0353a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f1145b = AbstractC0370g.m1001D0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0451c.m1145d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0451c.m1145d(str, "kotlinName");
            sb.append(AbstractC0704g.m1951q0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1145b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0370g.m1000C0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0704g.m1951q0((String) entry2.getValue()));
        }
    }

    public C0450b(Class cls) {
        this.f1146a = cls;
    }

    @Override // p051a1.InterfaceC0449a
    /* JADX INFO: renamed from: a */
    public final Class mo1141a() {
        return this.f1146a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0450b) && AbstractC0383m.m1059z(this).equals(AbstractC0383m.m1059z((InterfaceC0644a) obj));
    }

    public final int hashCode() {
        return AbstractC0383m.m1059z(this).hashCode();
    }

    public final String toString() {
        return this.f1146a.toString() + " (Kotlin reflection is not available)";
    }
}
