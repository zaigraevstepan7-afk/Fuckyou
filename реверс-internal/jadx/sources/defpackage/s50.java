package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s50 implements Iterable {
    public dh1 e;
    public dh1 f;
    public final WeakHashMap g = new WeakHashMap();
    public int h = 0;
    public final HashMap i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.ch1) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj;
        if (this.h != s50Var.h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = s50Var.iterator();
        while (true) {
            ch1 ch1Var = (ch1) it;
            if (!ch1Var.hasNext()) {
                break;
            }
            ch1 ch1Var2 = (ch1) it2;
            if (!ch1Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ch1Var.next();
            Object next = ch1Var2.next();
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
            ch1 ch1Var = (ch1) it;
            if (!ch1Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) ch1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ch1 ch1Var = new ch1(this.e, this.f, 0);
        this.g.put(ch1Var, Boolean.FALSE);
        return ch1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ch1 ch1Var = (ch1) it;
            if (!ch1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ch1Var.next()).toString());
            if (ch1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
