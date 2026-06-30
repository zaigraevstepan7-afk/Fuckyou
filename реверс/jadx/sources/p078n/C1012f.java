package p078n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public class C1012f implements Iterable {

    /* JADX INFO: renamed from: a */
    public C1009c f4007a;

    /* JADX INFO: renamed from: b */
    public C1009c f4008b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f4009c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f4010d = 0;

    /* JADX INFO: renamed from: a */
    public C1009c mo2457a(Object obj) {
        C1009c c1009c = this.f4007a;
        while (c1009c != null && !c1009c.f4000a.equals(obj)) {
            c1009c = c1009c.f4002c;
        }
        return c1009c;
    }

    /* JADX INFO: renamed from: b */
    public Object mo2458b(Object obj) {
        C1009c c1009cMo2457a = mo2457a(obj);
        if (c1009cMo2457a == null) {
            return null;
        }
        this.f4010d--;
        WeakHashMap weakHashMap = this.f4009c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1011e) it.next()).mo2459a(c1009cMo2457a);
            }
        }
        C1009c c1009c = c1009cMo2457a.f4003d;
        if (c1009c != null) {
            c1009c.f4002c = c1009cMo2457a.f4002c;
        } else {
            this.f4007a = c1009cMo2457a.f4002c;
        }
        C1009c c1009c2 = c1009cMo2457a.f4002c;
        if (c1009c2 != null) {
            c1009c2.f4003d = c1009c;
        } else {
            this.f4008b = c1009c;
        }
        c1009cMo2457a.f4002c = null;
        c1009cMo2457a.f4003d = null;
        return c1009cMo2457a.f4001b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p078n.C1008b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1012f)) {
            return false;
        }
        C1012f c1012f = (C1012f) obj;
        if (this.f4010d != c1012f.f4010d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1012f.iterator();
        while (true) {
            C1008b c1008b = (C1008b) it;
            if (!c1008b.hasNext()) {
                break;
            }
            C1008b c1008b2 = (C1008b) it2;
            if (!c1008b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1008b.next();
            Object next = c1008b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1008b c1008b = (C1008b) it;
            if (!c1008b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1008b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1008b c1008b = new C1008b(this.f4007a, this.f4008b, 0);
        this.f4009c.put(c1008b, Boolean.FALSE);
        return c1008b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1008b c1008b = (C1008b) it;
            if (!c1008b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1008b.next()).toString());
            if (c1008b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
