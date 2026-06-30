package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class dt0 {
    public final int a;
    public final et0 b;
    public final wr c;
    public int d;
    public int e;
    public int f;

    public dt0(int i) {
        this.a = i;
        if (i <= 0) {
            yc.p("maxSize <= 0");
            throw null;
        }
        this.b = new et0(0);
        this.c = new wr(20);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            et0 et0Var = this.b;
            et0Var.getClass();
            Object obj2 = et0Var.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            et0 et0Var = this.b;
            et0Var.getClass();
            objPut = et0Var.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = this.b.a.entrySet();
                    setEntrySet.getClass();
                    Set set = setEntrySet;
                    Object next = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    et0 et0Var2 = this.b;
                    et0Var2.getClass();
                    key.getClass();
                    et0Var2.a.remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
