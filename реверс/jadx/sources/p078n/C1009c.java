package p078n;

import java.util.Map;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1009c implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f4000a;

    /* JADX INFO: renamed from: b */
    public final Object f4001b;

    /* JADX INFO: renamed from: c */
    public C1009c f4002c;

    /* JADX INFO: renamed from: d */
    public C1009c f4003d;

    public C1009c(Object obj, Object obj2) {
        this.f4000a = obj;
        this.f4001b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1009c)) {
            return false;
        }
        C1009c c1009c = (C1009c) obj;
        return this.f4000a.equals(c1009c.f4000a) && this.f4001b.equals(c1009c.f4001b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4000a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4001b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4000a.hashCode() ^ this.f4001b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4000a + "=" + this.f4001b;
    }
}
