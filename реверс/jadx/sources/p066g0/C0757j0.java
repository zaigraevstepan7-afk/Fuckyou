package p066g0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p015I0.C0109e;
import p051a1.AbstractC0451c;
import p090t0.C1055f;

/* JADX INFO: renamed from: g0.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C0757j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3026a;

    /* JADX INFO: renamed from: b */
    public int f3027b;

    /* JADX INFO: renamed from: c */
    public int f3028c;

    /* JADX INFO: renamed from: d */
    public int f3029d;

    /* JADX INFO: renamed from: e */
    public int f3030e;

    /* JADX INFO: renamed from: f */
    public final Object f3031f;

    /* JADX INFO: renamed from: g */
    public final Object f3032g;

    public C0757j0(int i2) {
        this.f3026a = 1;
        this.f3027b = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3031f = new C1055f();
        this.f3032g = new C0109e(26);
    }

    /* JADX INFO: renamed from: a */
    public void m2080a() {
        View view = (View) ((ArrayList) this.f3031f).get(r0.size() - 1);
        C0751g0 c0751g0 = (C0751g0) view.getLayoutParams();
        this.f3028c = ((StaggeredGridLayoutManager) this.f3032g).f2022r.mo1289b(view);
        c0751g0.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m2081b() {
        ((ArrayList) this.f3031f).clear();
        this.f3027b = Integer.MIN_VALUE;
        this.f3028c = Integer.MIN_VALUE;
        this.f3029d = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m2082c() {
        return ((StaggeredGridLayoutManager) this.f3032g).f2027w ? m2084e(r1.size() - 1, -1) : m2084e(0, ((ArrayList) this.f3031f).size());
    }

    /* JADX INFO: renamed from: d */
    public int m2083d() {
        return ((StaggeredGridLayoutManager) this.f3032g).f2027w ? m2084e(0, ((ArrayList) this.f3031f).size()) : m2084e(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public int m2084e(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3032g;
        int iMo1298k = staggeredGridLayoutManager.f2022r.mo1298k();
        int iMo1294g = staggeredGridLayoutManager.f2022r.mo1294g();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) ((ArrayList) this.f3031f).get(i2);
            int iMo1292e = staggeredGridLayoutManager.f2022r.mo1292e(view);
            int iMo1289b = staggeredGridLayoutManager.f2022r.mo1289b(view);
            boolean z2 = iMo1292e <= iMo1294g;
            boolean z3 = iMo1289b >= iMo1298k;
            if (z2 && z3 && (iMo1292e < iMo1298k || iMo1289b > iMo1294g)) {
                return AbstractC0723K.m1989G(view);
            }
            i2 += i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public Object m2085f(Object obj) {
        AbstractC0451c.m1146e(obj, "key");
        synchronized (((C0109e) this.f3032g)) {
            C1055f c1055f = (C1055f) this.f3031f;
            c1055f.getClass();
            Object obj2 = ((LinkedHashMap) c1055f.f4215a).get(obj);
            if (obj2 != null) {
                this.f3029d++;
                return obj2;
            }
            this.f3030e++;
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m2086g(int i2) {
        int i3 = this.f3028c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f3031f).size() == 0) {
            return i2;
        }
        m2080a();
        return this.f3028c;
    }

    /* JADX INFO: renamed from: h */
    public View m2087h(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3032g;
        ArrayList arrayList = (ArrayList) this.f3031f;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2027w && AbstractC0723K.m1989G(view2) >= i2) || ((!staggeredGridLayoutManager.f2027w && AbstractC0723K.m1989G(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            if ((staggeredGridLayoutManager.f2027w && AbstractC0723K.m1989G(view3) <= i2) || ((!staggeredGridLayoutManager.f2027w && AbstractC0723K.m1989G(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: i */
    public int m2088i(int i2) {
        int i3 = this.f3027b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f3031f).size() == 0) {
            return i2;
        }
        View view = (View) ((ArrayList) this.f3031f).get(0);
        C0751g0 c0751g0 = (C0751g0) view.getLayoutParams();
        this.f3027b = ((StaggeredGridLayoutManager) this.f3032g).f2022r.mo1292e(view);
        c0751g0.getClass();
        return this.f3027b;
    }

    /* JADX INFO: renamed from: j */
    public Object m2089j(Object obj, Object obj2) {
        Object objPut;
        AbstractC0451c.m1146e(obj, "key");
        synchronized (((C0109e) this.f3032g)) {
            this.f3028c++;
            C1055f c1055f = (C1055f) this.f3031f;
            c1055f.getClass();
            objPut = ((LinkedHashMap) c1055f.f4215a).put(obj, obj2);
            if (objPut != null) {
                this.f3028c--;
            }
        }
        m2090k(this.f3027b);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2090k(int i2) {
        while (true) {
            synchronized (((C0109e) this.f3032g)) {
                try {
                    if (this.f3028c < 0 || (((LinkedHashMap) ((C1055f) this.f3031f).f4215a).isEmpty() && this.f3028c != 0)) {
                        break;
                    }
                    if (this.f3028c <= i2 || ((LinkedHashMap) ((C1055f) this.f3031f).f4215a).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) ((C1055f) this.f3031f).f4215a).entrySet();
                    AbstractC0451c.m1145d(setEntrySet, "map.entries");
                    Object next = null;
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C1055f c1055f = (C1055f) this.f3031f;
                    c1055f.getClass();
                    AbstractC0451c.m1146e(key, "key");
                    ((LinkedHashMap) c1055f.f4215a).remove(key);
                    int i3 = this.f3028c;
                    AbstractC0451c.m1146e(value, "value");
                    this.f3028c = i3 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f3026a) {
            case 1:
                synchronized (((C0109e) this.f3032g)) {
                    try {
                        int i2 = this.f3029d;
                        int i3 = this.f3030e + i2;
                        str = "LruCache[maxSize=" + this.f3027b + ",hits=" + this.f3029d + ",misses=" + this.f3030e + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0757j0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f3026a = 0;
        this.f3032g = staggeredGridLayoutManager;
        this.f3031f = new ArrayList();
        this.f3027b = Integer.MIN_VALUE;
        this.f3028c = Integer.MIN_VALUE;
        this.f3029d = 0;
        this.f3030e = i2;
    }
}
