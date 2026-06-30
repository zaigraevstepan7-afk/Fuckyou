package p084q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035S0.AbstractC0365b;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1027f extends C1031j implements Map {

    /* JADX INFO: renamed from: d */
    public C1022a f4090d;

    /* JADX INFO: renamed from: e */
    public C1024c f4091e;

    /* JADX INFO: renamed from: f */
    public C1026e f4092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027f(C1031j c1031j) {
        super(0);
        int i2 = c1031j.f4104c;
        m2486b(this.f4104c + i2);
        if (this.f4104c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c1031j.m2490f(i3), c1031j.m2493i(i3));
            }
        } else if (i2 > 0) {
            AbstractC0365b.m997C0(0, 0, i2, c1031j.f4102a, this.f4102a);
            AbstractC0365b.m998D0(c1031j.f4103b, this.f4103b, 0, 0, i2 << 1);
            this.f4104c = i2;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1022a c1022a = this.f4090d;
        if (c1022a != null) {
            return c1022a;
        }
        C1022a c1022a2 = new C1022a(this);
        this.f4090d = c1022a2;
        return c1022a2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2472j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2473k(Collection collection) {
        int i2 = this.f4104c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f4104c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1024c c1024c = this.f4091e;
        if (c1024c != null) {
            return c1024c;
        }
        C1024c c1024c2 = new C1024c(this);
        this.f4091e = c1024c2;
        return c1024c2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2486b(map.size() + this.f4104c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1026e c1026e = this.f4092f;
        if (c1026e != null) {
            return c1026e;
        }
        C1026e c1026e2 = new C1026e(this);
        this.f4092f = c1026e2;
        return c1026e2;
    }
}
