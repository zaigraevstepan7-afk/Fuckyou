package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 {
    public final LinkedHashMap a;
    public final qt0 b;

    public wx0(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new qt0(z);
    }

    public final Map a() {
        j41 j41Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int I = bl.I(ql.Y(setEntrySet, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                j41Var = new j41(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                j41Var = new j41(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(j41Var.e, j41Var.f);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.f).get()) {
            yc.l("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(i91 i91Var) {
        i91Var.getClass();
        Object obj = this.a.get(i91Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(i91 i91Var, Object obj) {
        i91Var.getClass();
        e(i91Var, obj);
    }

    public final void e(i91 i91Var, Object obj) {
        i91Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(i91Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(pl.p0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(i91Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(i91Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(i91Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof wx0) {
            LinkedHashMap linkedHashMap = ((wx0) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                boolean zO = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : xi0.o(value, obj2);
                                if (!zO) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return pl.h0(this.a.entrySet(), ",\n", "{\n", "\n}", new mt(19), 24);
    }

    public /* synthetic */ wx0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
