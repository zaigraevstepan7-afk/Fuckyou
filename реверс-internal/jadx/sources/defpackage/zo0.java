package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 {
    public final boolean a;
    public s50 b;
    public qo0 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final qs1 i;

    public zo0(xo0 xo0Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new s50();
        qo0 qo0Var = qo0.f;
        this.c = qo0Var;
        this.h = new ArrayList();
        this.d = new WeakReference(xo0Var);
        this.i = c2.g(qo0Var);
    }

    public final void a(wo0 wo0Var) {
        vo0 kwVar;
        yo0 yo0Var;
        xo0 xo0Var;
        wo0Var.getClass();
        c("addObserver");
        qo0 qo0Var = this.c;
        qo0 qo0Var2 = qo0.e;
        if (qo0Var != qo0Var2) {
            qo0Var2 = qo0.f;
        }
        yo0 yo0Var2 = new yo0();
        HashMap map = ep0.a;
        boolean z = wo0Var instanceof vo0;
        boolean z2 = wo0Var instanceof iw;
        int i = 2;
        if (z && z2) {
            kwVar = new kw((iw) wo0Var, (vo0) wo0Var);
        } else if (z2) {
            kwVar = new kw((iw) wo0Var, (vo0) null);
        } else if (z) {
            kwVar = (vo0) wo0Var;
        } else {
            Class<?> cls = wo0Var.getClass();
            if (ep0.b(cls) == 2) {
                Object obj = ep0.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    ep0.a((Constructor) list.get(0), wo0Var);
                    throw null;
                }
                int size = list.size();
                tb0[] tb0VarArr = new tb0[size];
                if (size > 0) {
                    ep0.a((Constructor) list.get(0), wo0Var);
                    throw null;
                }
                kwVar = new oc1(i, tb0VarArr);
            } else {
                kwVar = new kw(wo0Var);
            }
        }
        yo0Var2.b = kwVar;
        yo0Var2.a = qo0Var2;
        s50 s50Var = this.b;
        dh1 dh1Var = (dh1) s50Var.i.get(wo0Var);
        if (dh1Var != null) {
            yo0Var = dh1Var.f;
        } else {
            HashMap map2 = s50Var.i;
            dh1 dh1Var2 = new dh1(wo0Var, yo0Var2);
            s50Var.h++;
            dh1 dh1Var3 = s50Var.f;
            if (dh1Var3 == null) {
                s50Var.e = dh1Var2;
                s50Var.f = dh1Var2;
            } else {
                dh1Var3.g = dh1Var2;
                dh1Var2.h = dh1Var3;
                s50Var.f = dh1Var2;
            }
            map2.put(wo0Var, dh1Var2);
            yo0Var = null;
        }
        if (yo0Var == null && (xo0Var = (xo0) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            qo0 qo0VarB = b(wo0Var);
            this.e++;
            while (yo0Var2.a.compareTo(qo0VarB) < 0 && this.b.i.containsKey(wo0Var)) {
                qo0 qo0Var3 = yo0Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(qo0Var3);
                no0 no0Var = po0.Companion;
                qo0 qo0Var4 = yo0Var2.a;
                no0Var.getClass();
                qo0Var4.getClass();
                int iOrdinal = qo0Var4.ordinal();
                po0 po0Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : po0.ON_RESUME : po0.ON_START : po0.ON_CREATE;
                if (po0Var == null) {
                    yc.k(yo0Var2.a, "no event up from ");
                    return;
                } else {
                    yo0Var2.a(xo0Var, po0Var);
                    arrayList.remove(arrayList.size() - 1);
                    qo0VarB = b(wo0Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    public final qo0 b(wo0 wo0Var) {
        HashMap map = this.b.i;
        dh1 dh1Var = map.containsKey(wo0Var) ? ((dh1) map.get(wo0Var)).h : null;
        qo0 qo0Var = dh1Var != null ? dh1Var.f.a : null;
        ArrayList arrayList = this.h;
        qo0 qo0Var2 = arrayList.isEmpty() ? null : (qo0) arrayList.get(arrayList.size() - 1);
        qo0 qo0Var3 = this.c;
        qo0Var3.getClass();
        if (qo0Var == null || qo0Var.compareTo(qo0Var3) >= 0) {
            qo0Var = qo0Var3;
        }
        return (qo0Var2 == null || qo0Var2.compareTo(qo0Var) >= 0) ? qo0Var : qo0Var2;
    }

    public final void c(String str) {
        xc xcVar;
        if (this.a) {
            if (xc.b != null) {
                xcVar = xc.b;
            } else {
                synchronized (xc.class) {
                    try {
                        if (xc.b == null) {
                            xc.b = new xc(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                xcVar = xc.b;
            }
            ((xc) xcVar.a).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(s91.l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(po0 po0Var) {
        po0Var.getClass();
        c("handleLifecycleEvent");
        e(po0Var.a());
    }

    public final void e(qo0 qo0Var) {
        if (this.c == qo0Var) {
            return;
        }
        xo0 xo0Var = (xo0) this.d.get();
        qo0 qo0Var2 = this.c;
        qo0Var2.getClass();
        qo0 qo0Var3 = qo0.f;
        qo0 qo0Var4 = qo0.e;
        if (qo0Var2 == qo0Var3 && qo0Var == qo0Var4) {
            throw new IllegalStateException(("State must be at least '" + qo0.g + "' to be moved to '" + qo0Var + "' in component " + xo0Var).toString());
        }
        if (qo0Var2 == qo0Var4 && qo0Var2 != qo0Var) {
            throw new IllegalStateException(("State is '" + qo0Var4 + "' and cannot be moved to `" + qo0Var + "` in component " + xo0Var).toString());
        }
        this.c = qo0Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == qo0Var4) {
            this.b = new s50();
        }
    }

    public final void f(wo0 wo0Var) {
        wo0Var.getClass();
        c("removeObserver");
        s50 s50Var = this.b;
        WeakHashMap weakHashMap = s50Var.g;
        HashMap map = s50Var.i;
        dh1 dh1Var = (dh1) map.get(wo0Var);
        if (dh1Var != null) {
            s50Var.h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((fh1) it.next()).a(dh1Var);
                }
            }
            dh1 dh1Var2 = dh1Var.h;
            dh1 dh1Var3 = dh1Var.g;
            if (dh1Var2 != null) {
                dh1Var2.g = dh1Var3;
            } else {
                s50Var.e = dh1Var3;
            }
            dh1 dh1Var4 = dh1Var.g;
            if (dh1Var4 != null) {
                dh1Var4.h = dh1Var2;
            } else {
                s50Var.f = dh1Var2;
            }
            dh1Var.g = null;
            dh1Var.h = null;
        }
        map.remove(wo0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r11.g = false;
        r11.i.j(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        xo0 xo0Var = (xo0) this.d.get();
        if (xo0Var == null) {
            yc.l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            s50 s50Var = this.b;
            if (s50Var.h != 0) {
                dh1 dh1Var = s50Var.e;
                dh1Var.getClass();
                qo0 qo0Var = dh1Var.f.a;
                dh1 dh1Var2 = this.b.f;
                dh1Var2.getClass();
                qo0 qo0Var2 = dh1Var2.f.a;
                if (qo0Var == qo0Var2 && this.c == qo0Var2) {
                    break;
                }
                this.g = false;
                qo0 qo0Var3 = this.c;
                dh1 dh1Var3 = this.b.e;
                dh1Var3.getClass();
                int iCompareTo = qo0Var3.compareTo(dh1Var3.f.a);
                ArrayList arrayList = this.h;
                if (iCompareTo < 0) {
                    s50 s50Var2 = this.b;
                    ch1 ch1Var = new ch1(s50Var2.f, s50Var2.e, 1);
                    s50Var2.g.put(ch1Var, Boolean.FALSE);
                    while (ch1Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) ch1Var.next();
                        entry.getClass();
                        wo0 wo0Var = (wo0) entry.getKey();
                        yo0 yo0Var = (yo0) entry.getValue();
                        while (yo0Var.a.compareTo(this.c) > 0 && !this.g && this.b.i.containsKey(wo0Var)) {
                            no0 no0Var = po0.Companion;
                            qo0 qo0Var4 = yo0Var.a;
                            no0Var.getClass();
                            qo0Var4.getClass();
                            int iOrdinal = qo0Var4.ordinal();
                            po0 po0Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : po0.ON_PAUSE : po0.ON_STOP : po0.ON_DESTROY;
                            if (po0Var == null) {
                                yc.k(yo0Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(po0Var.a());
                                yo0Var.a(xo0Var, po0Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                dh1 dh1Var4 = this.b.f;
                if (!this.g && dh1Var4 != null && this.c.compareTo(dh1Var4.f.a) > 0) {
                    s50 s50Var3 = this.b;
                    s50Var3.getClass();
                    eh1 eh1Var = new eh1(s50Var3);
                    s50Var3.g.put(eh1Var, Boolean.FALSE);
                    while (eh1Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) eh1Var.next();
                        wo0 wo0Var2 = (wo0) entry2.getKey();
                        yo0 yo0Var2 = (yo0) entry2.getValue();
                        while (yo0Var2.a.compareTo(this.c) < 0 && !this.g && this.b.i.containsKey(wo0Var2)) {
                            arrayList.add(yo0Var2.a);
                            no0 no0Var2 = po0.Companion;
                            qo0 qo0Var5 = yo0Var2.a;
                            no0Var2.getClass();
                            qo0Var5.getClass();
                            int iOrdinal2 = qo0Var5.ordinal();
                            po0 po0Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : po0.ON_RESUME : po0.ON_START : po0.ON_CREATE;
                            if (po0Var2 == null) {
                                yc.k(yo0Var2.a, "no event up from ");
                                return;
                            } else {
                                yo0Var2.a(xo0Var, po0Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
