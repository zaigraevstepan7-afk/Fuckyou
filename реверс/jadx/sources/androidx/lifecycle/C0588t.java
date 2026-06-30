package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p051a1.AbstractC0451c;
import p076m.C1002a;
import p078n.C1007a;
import p078n.C1008b;
import p078n.C1009c;
import p078n.C1010d;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0588t {

    /* JADX INFO: renamed from: a */
    public final boolean f1875a;

    /* JADX INFO: renamed from: b */
    public C1007a f1876b;

    /* JADX INFO: renamed from: c */
    public EnumC0581m f1877c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f1878d;

    /* JADX INFO: renamed from: e */
    public int f1879e;

    /* JADX INFO: renamed from: f */
    public boolean f1880f;

    /* JADX INFO: renamed from: g */
    public boolean f1881g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1882h;

    public C0588t(InterfaceC0586r interfaceC0586r) {
        new AtomicReference();
        this.f1875a = true;
        this.f1876b = new C1007a();
        this.f1877c = EnumC0581m.f1867b;
        this.f1882h = new ArrayList();
        this.f1878d = new WeakReference(interfaceC0586r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1481a(InterfaceC0585q interfaceC0585q) {
        InterfaceC0584p reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0586r interfaceC0586r;
        ArrayList arrayList = this.f1882h;
        m1483c("addObserver");
        EnumC0581m enumC0581m = this.f1877c;
        EnumC0581m enumC0581m2 = EnumC0581m.f1866a;
        if (enumC0581m != enumC0581m2) {
            enumC0581m2 = EnumC0581m.f1867b;
        }
        C0587s c0587s = new C0587s();
        HashMap map = AbstractC0589u.f1883a;
        boolean z2 = interfaceC0585q instanceof InterfaceC0584p;
        boolean z3 = interfaceC0585q instanceof InterfaceC0572d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0572d) interfaceC0585q, (InterfaceC0584p) interfaceC0585q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0572d) interfaceC0585q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0584p) interfaceC0585q;
        } else {
            Class<?> cls = interfaceC0585q.getClass();
            if (AbstractC0589u.m1491c(cls) == 2) {
                Object obj2 = AbstractC0589u.f1884b.get(cls);
                AbstractC0451c.m1143b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0589u.m1489a((Constructor) list.get(0), interfaceC0585q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0575g[] interfaceC0575gArr = new InterfaceC0575g[size];
                if (size > 0) {
                    AbstractC0589u.m1489a((Constructor) list.get(0), interfaceC0585q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0575gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0585q);
            }
        }
        c0587s.f1874b = reflectiveGenericLifecycleObserver;
        c0587s.f1873a = enumC0581m2;
        C1007a c1007a = this.f1876b;
        C1009c c1009cMo2457a = c1007a.mo2457a(interfaceC0585q);
        if (c1009cMo2457a != null) {
            obj = c1009cMo2457a.f4001b;
        } else {
            HashMap map2 = c1007a.f3996e;
            C1009c c1009c = new C1009c(interfaceC0585q, c0587s);
            c1007a.f4010d++;
            C1009c c1009c2 = c1007a.f4008b;
            if (c1009c2 == null) {
                c1007a.f4007a = c1009c;
                c1007a.f4008b = c1009c;
            } else {
                c1009c2.f4002c = c1009c;
                c1009c.f4003d = c1009c2;
                c1007a.f4008b = c1009c;
            }
            map2.put(interfaceC0585q, c1009c);
            obj = null;
        }
        if (((C0587s) obj) == null && (interfaceC0586r = (InterfaceC0586r) this.f1878d.get()) != null) {
            boolean z4 = this.f1879e != 0 || this.f1880f;
            EnumC0581m enumC0581mM1482b = m1482b(interfaceC0585q);
            this.f1879e++;
            while (c0587s.f1873a.compareTo(enumC0581mM1482b) < 0 && this.f1876b.f3996e.containsKey(interfaceC0585q)) {
                arrayList.add(c0587s.f1873a);
                C0578j c0578j = EnumC0580l.Companion;
                EnumC0581m enumC0581m3 = c0587s.f1873a;
                c0578j.getClass();
                AbstractC0451c.m1146e(enumC0581m3, "state");
                int iOrdinal = enumC0581m3.ordinal();
                EnumC0580l enumC0580l = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0580l.ON_RESUME : EnumC0580l.ON_START : EnumC0580l.ON_CREATE;
                if (enumC0580l == null) {
                    throw new IllegalStateException("no event up from " + c0587s.f1873a);
                }
                c0587s.m1480a(interfaceC0586r, enumC0580l);
                arrayList.remove(arrayList.size() - 1);
                enumC0581mM1482b = m1482b(interfaceC0585q);
            }
            if (!z4) {
                m1488h();
            }
            this.f1879e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0581m m1482b(InterfaceC0585q interfaceC0585q) {
        HashMap map = this.f1876b.f3996e;
        C1009c c1009c = map.containsKey(interfaceC0585q) ? ((C1009c) map.get(interfaceC0585q)).f4003d : null;
        EnumC0581m enumC0581m = c1009c != null ? ((C0587s) c1009c.f4001b).f1873a : null;
        ArrayList arrayList = this.f1882h;
        EnumC0581m enumC0581m2 = arrayList.isEmpty() ? null : (EnumC0581m) arrayList.get(arrayList.size() - 1);
        EnumC0581m enumC0581m3 = this.f1877c;
        AbstractC0451c.m1146e(enumC0581m3, "state1");
        if (enumC0581m == null || enumC0581m.compareTo(enumC0581m3) >= 0) {
            enumC0581m = enumC0581m3;
        }
        return (enumC0581m2 == null || enumC0581m2.compareTo(enumC0581m) >= 0) ? enumC0581m : enumC0581m2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1483c(String str) {
        if (this.f1875a) {
            ((C1002a) C1002a.m2447q0().f3983p).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1484d(EnumC0580l enumC0580l) {
        AbstractC0451c.m1146e(enumC0580l, "event");
        m1483c("handleLifecycleEvent");
        m1485e(enumC0580l.m1479a());
    }

    /* JADX INFO: renamed from: e */
    public final void m1485e(EnumC0581m enumC0581m) {
        EnumC0581m enumC0581m2 = this.f1877c;
        if (enumC0581m2 == enumC0581m) {
            return;
        }
        EnumC0581m enumC0581m3 = EnumC0581m.f1867b;
        EnumC0581m enumC0581m4 = EnumC0581m.f1866a;
        if (enumC0581m2 == enumC0581m3 && enumC0581m == enumC0581m4) {
            throw new IllegalStateException(("no event down from " + this.f1877c + " in component " + this.f1878d.get()).toString());
        }
        this.f1877c = enumC0581m;
        if (this.f1880f || this.f1879e != 0) {
            this.f1881g = true;
            return;
        }
        this.f1880f = true;
        m1488h();
        this.f1880f = false;
        if (this.f1877c == enumC0581m4) {
            this.f1876b = new C1007a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1486f(InterfaceC0585q interfaceC0585q) {
        AbstractC0451c.m1146e(interfaceC0585q, "observer");
        m1483c("removeObserver");
        this.f1876b.mo2458b(interfaceC0585q);
    }

    /* JADX INFO: renamed from: g */
    public final void m1487g() {
        EnumC0581m enumC0581m = EnumC0581m.f1868c;
        m1483c("setCurrentState");
        m1485e(enumC0581m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f1881g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1488h() {
        InterfaceC0586r interfaceC0586r = (InterfaceC0586r) this.f1878d.get();
        if (interfaceC0586r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1007a c1007a = this.f1876b;
            if (c1007a.f4010d != 0) {
                C1009c c1009c = c1007a.f4007a;
                AbstractC0451c.m1143b(c1009c);
                EnumC0581m enumC0581m = ((C0587s) c1009c.f4001b).f1873a;
                C1009c c1009c2 = this.f1876b.f4008b;
                AbstractC0451c.m1143b(c1009c2);
                EnumC0581m enumC0581m2 = ((C0587s) c1009c2.f4001b).f1873a;
                if (enumC0581m == enumC0581m2 && this.f1877c == enumC0581m2) {
                    break;
                }
                this.f1881g = false;
                EnumC0581m enumC0581m3 = this.f1877c;
                C1009c c1009c3 = this.f1876b.f4007a;
                AbstractC0451c.m1143b(c1009c3);
                if (enumC0581m3.compareTo(((C0587s) c1009c3.f4001b).f1873a) < 0) {
                    C1007a c1007a2 = this.f1876b;
                    C1008b c1008b = new C1008b(c1007a2.f4008b, c1007a2.f4007a, 1);
                    c1007a2.f4009c.put(c1008b, Boolean.FALSE);
                    while (c1008b.hasNext() && !this.f1881g) {
                        Map.Entry entry = (Map.Entry) c1008b.next();
                        AbstractC0451c.m1145d(entry, "next()");
                        InterfaceC0585q interfaceC0585q = (InterfaceC0585q) entry.getKey();
                        C0587s c0587s = (C0587s) entry.getValue();
                        while (c0587s.f1873a.compareTo(this.f1877c) > 0 && !this.f1881g && this.f1876b.f3996e.containsKey(interfaceC0585q)) {
                            C0578j c0578j = EnumC0580l.Companion;
                            EnumC0581m enumC0581m4 = c0587s.f1873a;
                            c0578j.getClass();
                            AbstractC0451c.m1146e(enumC0581m4, "state");
                            int iOrdinal = enumC0581m4.ordinal();
                            EnumC0580l enumC0580l = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0580l.ON_PAUSE : EnumC0580l.ON_STOP : EnumC0580l.ON_DESTROY;
                            if (enumC0580l == null) {
                                throw new IllegalStateException("no event down from " + c0587s.f1873a);
                            }
                            this.f1882h.add(enumC0580l.m1479a());
                            c0587s.m1480a(interfaceC0586r, enumC0580l);
                            ArrayList arrayList = this.f1882h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1009c c1009c4 = this.f1876b.f4008b;
                if (!this.f1881g && c1009c4 != null && this.f1877c.compareTo(((C0587s) c1009c4.f4001b).f1873a) > 0) {
                    C1007a c1007a3 = this.f1876b;
                    c1007a3.getClass();
                    C1010d c1010d = new C1010d(c1007a3);
                    c1007a3.f4009c.put(c1010d, Boolean.FALSE);
                    while (c1010d.hasNext() && !this.f1881g) {
                        Map.Entry entry2 = (Map.Entry) c1010d.next();
                        InterfaceC0585q interfaceC0585q2 = (InterfaceC0585q) entry2.getKey();
                        C0587s c0587s2 = (C0587s) entry2.getValue();
                        while (c0587s2.f1873a.compareTo(this.f1877c) < 0 && !this.f1881g && this.f1876b.f3996e.containsKey(interfaceC0585q2)) {
                            this.f1882h.add(c0587s2.f1873a);
                            C0578j c0578j2 = EnumC0580l.Companion;
                            EnumC0581m enumC0581m5 = c0587s2.f1873a;
                            c0578j2.getClass();
                            AbstractC0451c.m1146e(enumC0581m5, "state");
                            int iOrdinal2 = enumC0581m5.ordinal();
                            EnumC0580l enumC0580l2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0580l.ON_RESUME : EnumC0580l.ON_START : EnumC0580l.ON_CREATE;
                            if (enumC0580l2 == null) {
                                throw new IllegalStateException("no event up from " + c0587s2.f1873a);
                            }
                            c0587s2.m1480a(interfaceC0586r, enumC0580l2);
                            ArrayList arrayList2 = this.f1882h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
