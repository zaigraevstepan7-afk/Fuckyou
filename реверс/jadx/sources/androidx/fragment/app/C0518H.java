package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0460e;
import androidx.activity.C0462g;
import androidx.activity.C0484u;
import androidx.activity.C0485v;
import androidx.activity.InterfaceC0458c;
import androidx.activity.result.C0477d;
import androidx.lifecycle.AbstractC0565I;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.EnumC0581m;
import com.reddit.frontpage.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0010k;
import p004C.C0031l;
import p004C.C0034o;
import p005C0.C0048n;
import p015I0.C0109e;
import p022M.InterfaceC0184a;
import p023M0.RunnableC0191D;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p050a0.AbstractC0448d;
import p051a1.AbstractC0451c;
import p055c0.C0601a;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;

/* JADX INFO: renamed from: androidx.fragment.app.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0518H {

    /* JADX INFO: renamed from: A */
    public C0477d f1578A;

    /* JADX INFO: renamed from: B */
    public C0477d f1579B;

    /* JADX INFO: renamed from: C */
    public ArrayDeque f1580C;

    /* JADX INFO: renamed from: D */
    public boolean f1581D;

    /* JADX INFO: renamed from: E */
    public boolean f1582E;

    /* JADX INFO: renamed from: F */
    public boolean f1583F;

    /* JADX INFO: renamed from: G */
    public boolean f1584G;

    /* JADX INFO: renamed from: H */
    public boolean f1585H;

    /* JADX INFO: renamed from: I */
    public ArrayList f1586I;

    /* JADX INFO: renamed from: J */
    public ArrayList f1587J;

    /* JADX INFO: renamed from: K */
    public ArrayList f1588K;

    /* JADX INFO: renamed from: L */
    public C0520J f1589L;

    /* JADX INFO: renamed from: M */
    public final RunnableC0191D f1590M;

    /* JADX INFO: renamed from: b */
    public boolean f1592b;

    /* JADX INFO: renamed from: d */
    public ArrayList f1594d;

    /* JADX INFO: renamed from: e */
    public ArrayList f1595e;

    /* JADX INFO: renamed from: g */
    public C0485v f1597g;

    /* JADX INFO: renamed from: l */
    public final C0048n f1602l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f1603m;

    /* JADX INFO: renamed from: n */
    public final C0554x f1604n;

    /* JADX INFO: renamed from: o */
    public final C0554x f1605o;

    /* JADX INFO: renamed from: p */
    public final C0554x f1606p;

    /* JADX INFO: renamed from: q */
    public final C0554x f1607q;

    /* JADX INFO: renamed from: r */
    public final C0511A f1608r;

    /* JADX INFO: renamed from: s */
    public int f1609s;

    /* JADX INFO: renamed from: t */
    public C0550t f1610t;

    /* JADX INFO: renamed from: u */
    public AbstractC0383m f1611u;

    /* JADX INFO: renamed from: v */
    public AbstractComponentCallbacksC0548r f1612v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC0548r f1613w;

    /* JADX INFO: renamed from: x */
    public final C0512B f1614x;

    /* JADX INFO: renamed from: y */
    public final C0109e f1615y;

    /* JADX INFO: renamed from: z */
    public C0477d f1616z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1591a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0010k f1593c = new C0010k(3);

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0553w f1596f = new LayoutInflaterFactory2C0553w(this);

    /* JADX INFO: renamed from: h */
    public final C0556z f1598h = new C0556z(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f1599i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f1600j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map f1601k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.x] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.x] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.x] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.x] */
    public C0518H() {
        Collections.synchronizedMap(new HashMap());
        this.f1602l = new C0048n(this);
        this.f1603m = new CopyOnWriteArrayList();
        final int i2 = 0;
        this.f1604n = new InterfaceC0184a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0518H f1819b;

            {
                this.f1819b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i2) {
                    case 0:
                        C0518H c0518h = this.f1819b;
                        if (c0518h.m1340H()) {
                            c0518h.m1365h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0518H c0518h2 = this.f1819b;
                        if (c0518h2.m1340H() && num.intValue() == 80) {
                            c0518h2.m1369l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0031l c0031l = (C0031l) obj;
                        C0518H c0518h3 = this.f1819b;
                        if (c0518h3.m1340H()) {
                            boolean z2 = c0031l.f75a;
                            c0518h3.m1370m(false);
                        }
                        break;
                    default:
                        C0034o c0034o = (C0034o) obj;
                        C0518H c0518h4 = this.f1819b;
                        if (c0518h4.m1340H()) {
                            boolean z3 = c0034o.f77a;
                            c0518h4.m1375r(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f1605o = new InterfaceC0184a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0518H f1819b;

            {
                this.f1819b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i3) {
                    case 0:
                        C0518H c0518h = this.f1819b;
                        if (c0518h.m1340H()) {
                            c0518h.m1365h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0518H c0518h2 = this.f1819b;
                        if (c0518h2.m1340H() && num.intValue() == 80) {
                            c0518h2.m1369l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0031l c0031l = (C0031l) obj;
                        C0518H c0518h3 = this.f1819b;
                        if (c0518h3.m1340H()) {
                            boolean z2 = c0031l.f75a;
                            c0518h3.m1370m(false);
                        }
                        break;
                    default:
                        C0034o c0034o = (C0034o) obj;
                        C0518H c0518h4 = this.f1819b;
                        if (c0518h4.m1340H()) {
                            boolean z3 = c0034o.f77a;
                            c0518h4.m1375r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 2;
        this.f1606p = new InterfaceC0184a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0518H f1819b;

            {
                this.f1819b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i4) {
                    case 0:
                        C0518H c0518h = this.f1819b;
                        if (c0518h.m1340H()) {
                            c0518h.m1365h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0518H c0518h2 = this.f1819b;
                        if (c0518h2.m1340H() && num.intValue() == 80) {
                            c0518h2.m1369l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0031l c0031l = (C0031l) obj;
                        C0518H c0518h3 = this.f1819b;
                        if (c0518h3.m1340H()) {
                            boolean z2 = c0031l.f75a;
                            c0518h3.m1370m(false);
                        }
                        break;
                    default:
                        C0034o c0034o = (C0034o) obj;
                        C0518H c0518h4 = this.f1819b;
                        if (c0518h4.m1340H()) {
                            boolean z3 = c0034o.f77a;
                            c0518h4.m1375r(false);
                        }
                        break;
                }
            }
        };
        final int i5 = 3;
        this.f1607q = new InterfaceC0184a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0518H f1819b;

            {
                this.f1819b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i5) {
                    case 0:
                        C0518H c0518h = this.f1819b;
                        if (c0518h.m1340H()) {
                            c0518h.m1365h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0518H c0518h2 = this.f1819b;
                        if (c0518h2.m1340H() && num.intValue() == 80) {
                            c0518h2.m1369l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0031l c0031l = (C0031l) obj;
                        C0518H c0518h3 = this.f1819b;
                        if (c0518h3.m1340H()) {
                            boolean z2 = c0031l.f75a;
                            c0518h3.m1370m(false);
                        }
                        break;
                    default:
                        C0034o c0034o = (C0034o) obj;
                        C0518H c0518h4 = this.f1819b;
                        if (c0518h4.m1340H()) {
                            boolean z3 = c0034o.f77a;
                            c0518h4.m1375r(false);
                        }
                        break;
                }
            }
        };
        this.f1608r = new C0511A(this);
        this.f1609s = -1;
        this.f1614x = new C0512B(this);
        this.f1615y = new C0109e(14);
        this.f1580C = new ArrayDeque();
        this.f1590M = new RunnableC0191D(6, this);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1330F(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m1331G(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        abstractComponentCallbacksC0548r.getClass();
        boolean zM1331G = false;
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 : abstractComponentCallbacksC0548r.f1796t.f1593c.m86g()) {
            if (abstractComponentCallbacksC0548r2 != null) {
                zM1331G = m1331G(abstractComponentCallbacksC0548r2);
            }
            if (zM1331G) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m1332I(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (abstractComponentCallbacksC0548r == null) {
            return true;
        }
        if (abstractComponentCallbacksC0548r.f1760B) {
            return abstractComponentCallbacksC0548r.f1794r == null || m1332I(abstractComponentCallbacksC0548r.f1797u);
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1333J(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (abstractComponentCallbacksC0548r == null) {
            return true;
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1794r;
        return abstractComponentCallbacksC0548r.equals(c0518h.f1613w) && m1333J(c0518h.f1612v);
    }

    /* JADX INFO: renamed from: Y */
    public static void m1334Y(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (m1330F(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0548r);
        }
        if (abstractComponentCallbacksC0548r.f1801y) {
            abstractComponentCallbacksC0548r.f1801y = false;
            abstractComponentCallbacksC0548r.f1767I = !abstractComponentCallbacksC0548r.f1767I;
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbstractComponentCallbacksC0548r m1335A(int i2) {
        C0010k c0010k = this.f1593c;
        ArrayList arrayList = (ArrayList) c0010k.f24c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = (AbstractComponentCallbacksC0548r) arrayList.get(size);
            if (abstractComponentCallbacksC0548r != null && abstractComponentCallbacksC0548r.f1798v == i2) {
                return abstractComponentCallbacksC0548r;
            }
        }
        for (C0523M c0523m : ((HashMap) c0010k.f22a).values()) {
            if (c0523m != null) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0523m.f1646c;
                if (abstractComponentCallbacksC0548r2.f1798v == i2) {
                    return abstractComponentCallbacksC0548r2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final ViewGroup m1336B(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0548r.f1799w <= 0 || !this.f1611u.mo1064O()) {
            return null;
        }
        View viewMo1063N = this.f1611u.mo1063N(abstractComponentCallbacksC0548r.f1799w);
        if (viewMo1063N instanceof ViewGroup) {
            return (ViewGroup) viewMo1063N;
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final C0512B m1337C() {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1612v;
        return abstractComponentCallbacksC0548r != null ? abstractComponentCallbacksC0548r.f1794r.m1337C() : this.f1614x;
    }

    /* JADX INFO: renamed from: D */
    public final C0109e m1338D() {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1612v;
        return abstractComponentCallbacksC0548r != null ? abstractComponentCallbacksC0548r.f1794r.m1338D() : this.f1615y;
    }

    /* JADX INFO: renamed from: E */
    public final void m1339E(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (m1330F(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0548r);
        }
        if (abstractComponentCallbacksC0548r.f1801y) {
            return;
        }
        abstractComponentCallbacksC0548r.f1801y = true;
        abstractComponentCallbacksC0548r.f1767I = true ^ abstractComponentCallbacksC0548r.f1767I;
        m1354X(abstractComponentCallbacksC0548r);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1340H() {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1612v;
        if (abstractComponentCallbacksC0548r == null) {
            return true;
        }
        return abstractComponentCallbacksC0548r.f1795s != null && abstractComponentCallbacksC0548r.f1787k && abstractComponentCallbacksC0548r.m1461j().m1340H();
    }

    /* JADX INFO: renamed from: K */
    public final void m1341K(int i2, boolean z2) {
        HashMap map;
        C0550t c0550t;
        if (this.f1610t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1609s) {
            this.f1609s = i2;
            C0010k c0010k = this.f1593c;
            Iterator it = ((ArrayList) c0010k.f24c).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c0010k.f22a;
                if (!zHasNext) {
                    break;
                }
                C0523M c0523m = (C0523M) map.get(((AbstractComponentCallbacksC0548r) it.next()).f1781e);
                if (c0523m != null) {
                    c0523m.m1398k();
                }
            }
            for (C0523M c0523m2 : map.values()) {
                if (c0523m2 != null) {
                    c0523m2.m1398k();
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m2.f1646c;
                    if (abstractComponentCallbacksC0548r.f1788l && !abstractComponentCallbacksC0548r.m1465n()) {
                        c0010k.m89j(c0523m2);
                    }
                }
            }
            m1355Z();
            if (this.f1581D && (c0550t = this.f1610t) != null && this.f1609s == 7) {
                c0550t.f1809t.invalidateOptionsMenu();
                this.f1581D = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1342L() {
        if (this.f1610t == null) {
            return;
        }
        this.f1582E = false;
        this.f1583F = false;
        this.f1589L.f1630h = false;
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null) {
                abstractComponentCallbacksC0548r.f1796t.m1342L();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m1343M() {
        return m1344N(-1, 0);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m1344N(int i2, int i3) {
        m1382y(false);
        m1381x(true);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1613w;
        if (abstractComponentCallbacksC0548r != null && i2 < 0 && abstractComponentCallbacksC0548r.m1458g().m1343M()) {
            return true;
        }
        boolean zM1345O = m1345O(this.f1586I, this.f1587J, i2, i3);
        if (zM1345O) {
            this.f1592b = true;
            try {
                m1347Q(this.f1586I, this.f1587J);
            } finally {
                m1361d();
            }
        }
        m1359b0();
        m1378u();
        ((HashMap) this.f1593c.f22a).values().removeAll(Collections.singleton(null));
        return zM1345O;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1345O(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2 = (i3 & 1) != 0;
        ArrayList arrayList3 = this.f1594d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i2 < 0) {
                size = z2 ? 0 : this.f1594d.size() - 1;
            } else {
                int size2 = this.f1594d.size() - 1;
                while (size2 >= 0) {
                    C0531a c0531a = (C0531a) this.f1594d.get(size2);
                    if (i2 >= 0 && i2 == c0531a.f1692r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z2) {
                    size = size2;
                    while (size > 0) {
                        C0531a c0531a2 = (C0531a) this.f1594d.get(size - 1);
                        if (i2 < 0 || i2 != c0531a2.f1692r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1594d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1594d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0531a) this.f1594d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final void m1346P(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (m1330F(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0548r + " nesting=" + abstractComponentCallbacksC0548r.f1793q);
        }
        boolean zM1465n = abstractComponentCallbacksC0548r.m1465n();
        if (abstractComponentCallbacksC0548r.f1802z && zM1465n) {
            return;
        }
        C0010k c0010k = this.f1593c;
        synchronized (((ArrayList) c0010k.f24c)) {
            ((ArrayList) c0010k.f24c).remove(abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.f1787k = false;
        if (m1331G(abstractComponentCallbacksC0548r)) {
            this.f1581D = true;
        }
        abstractComponentCallbacksC0548r.f1788l = true;
        m1354X(abstractComponentCallbacksC0548r);
    }

    /* JADX INFO: renamed from: Q */
    public final void m1347Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((C0531a) arrayList.get(i2)).f1689o) {
                if (i3 != i2) {
                    m1383z(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0531a) arrayList.get(i3)).f1689o) {
                        i3++;
                    }
                }
                m1383z(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1383z(arrayList, arrayList2, i3, size);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m1348R(Parcelable parcelable) {
        C0048n c0048n;
        C0523M c0523m;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1610t.f1806q.getClassLoader());
                this.f1601k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<C0522L> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1610t.f1806q.getClassLoader());
                arrayList.add((C0522L) bundle.getParcelable("state"));
            }
        }
        C0010k c0010k = this.f1593c;
        HashMap map = (HashMap) c0010k.f23b;
        map.clear();
        for (C0522L c0522l : arrayList) {
            map.put(c0522l.f1632b, c0522l);
        }
        C0519I c0519i = (C0519I) bundle3.getParcelable("state");
        if (c0519i == null) {
            return;
        }
        HashMap map2 = (HashMap) c0010k.f22a;
        map2.clear();
        Iterator it = c0519i.f1617a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0048n = this.f1602l;
            if (!zHasNext) {
                break;
            }
            C0522L c0522l2 = (C0522L) ((HashMap) c0010k.f23b).remove((String) it.next());
            if (c0522l2 != null) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = (AbstractComponentCallbacksC0548r) this.f1589L.f1625c.get(c0522l2.f1632b);
                if (abstractComponentCallbacksC0548r != null) {
                    if (m1330F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0548r);
                    }
                    c0523m = new C0523M(c0048n, c0010k, abstractComponentCallbacksC0548r, c0522l2);
                } else {
                    c0523m = new C0523M(this.f1602l, this.f1593c, this.f1610t.f1806q.getClassLoader(), m1337C(), c0522l2);
                }
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0523m.f1646c;
                abstractComponentCallbacksC0548r2.f1794r = this;
                if (m1330F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0548r2.f1781e + "): " + abstractComponentCallbacksC0548r2);
                }
                c0523m.m1400m(this.f1610t.f1806q.getClassLoader());
                c0010k.m88i(c0523m);
                c0523m.f1648e = this.f1609s;
            }
        }
        C0520J c0520j = this.f1589L;
        c0520j.getClass();
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 : new ArrayList(c0520j.f1625c.values())) {
            if (map2.get(abstractComponentCallbacksC0548r3.f1781e) == null) {
                if (m1330F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0548r3 + " that was not found in the set of active Fragments " + c0519i.f1617a);
                }
                this.f1589L.m1387d(abstractComponentCallbacksC0548r3);
                abstractComponentCallbacksC0548r3.f1794r = this;
                C0523M c0523m2 = new C0523M(c0048n, c0010k, abstractComponentCallbacksC0548r3);
                c0523m2.f1648e = 1;
                c0523m2.m1398k();
                abstractComponentCallbacksC0548r3.f1788l = true;
                c0523m2.m1398k();
            }
        }
        ArrayList<String> arrayList2 = c0519i.f1618b;
        ((ArrayList) c0010k.f24c).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM82c = c0010k.m82c(str3);
                if (abstractComponentCallbacksC0548rM82c == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (m1330F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0548rM82c);
                }
                c0010k.m80a(abstractComponentCallbacksC0548rM82c);
            }
        }
        if (c0519i.f1619c != null) {
            this.f1594d = new ArrayList(c0519i.f1619c.length);
            int i2 = 0;
            while (true) {
                C0532b[] c0532bArr = c0519i.f1619c;
                if (i2 >= c0532bArr.length) {
                    break;
                }
                C0532b c0532b = c0532bArr[i2];
                c0532b.getClass();
                C0531a c0531a = new C0531a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = c0532b.f1693a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    C0524N c0524n = new C0524N();
                    int i5 = i3 + 1;
                    c0524n.f1649a = iArr[i3];
                    if (m1330F(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0531a + " op #" + i4 + " base fragment #" + iArr[i5]);
                    }
                    c0524n.f1656h = EnumC0581m.values()[c0532b.f1695c[i4]];
                    c0524n.f1657i = EnumC0581m.values()[c0532b.f1696d[i4]];
                    int i6 = i3 + 2;
                    c0524n.f1651c = iArr[i5] != 0;
                    int i7 = iArr[i6];
                    c0524n.f1652d = i7;
                    int i8 = iArr[i3 + 3];
                    c0524n.f1653e = i8;
                    int i9 = i3 + 5;
                    int i10 = iArr[i3 + 4];
                    c0524n.f1654f = i10;
                    i3 += 6;
                    int i11 = iArr[i9];
                    c0524n.f1655g = i11;
                    c0531a.f1676b = i7;
                    c0531a.f1677c = i8;
                    c0531a.f1678d = i10;
                    c0531a.f1679e = i11;
                    c0531a.m1422b(c0524n);
                    i4++;
                }
                c0531a.f1680f = c0532b.f1697e;
                c0531a.f1682h = c0532b.f1698f;
                c0531a.f1681g = true;
                c0531a.f1683i = c0532b.f1700h;
                c0531a.f1684j = c0532b.f1701i;
                c0531a.f1685k = c0532b.f1702j;
                c0531a.f1686l = c0532b.f1703k;
                c0531a.f1687m = c0532b.f1704l;
                c0531a.f1688n = c0532b.f1705m;
                c0531a.f1689o = c0532b.f1706n;
                c0531a.f1692r = c0532b.f1699g;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = c0532b.f1694b;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i12);
                    if (str4 != null) {
                        ((C0524N) c0531a.f1675a.get(i12)).f1650b = c0010k.m82c(str4);
                    }
                    i12++;
                }
                c0531a.m1423c(1);
                if (m1330F(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c0531a.f1692r + "): " + c0531a);
                    PrintWriter printWriter = new PrintWriter(new C0526P());
                    c0531a.m1424d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1594d.add(c0531a);
                i2++;
            }
        } else {
            this.f1594d = null;
        }
        this.f1599i.set(c0519i.f1620d);
        String str5 = c0519i.f1621e;
        if (str5 != null) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM82c2 = c0010k.m82c(str5);
            this.f1613w = abstractComponentCallbacksC0548rM82c2;
            m1374q(abstractComponentCallbacksC0548rM82c2);
        }
        ArrayList arrayList4 = c0519i.f1622f;
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                this.f1600j.put((String) arrayList4.get(i13), (C0533c) c0519i.f1623g.get(i13));
            }
        }
        this.f1580C = new ArrayDeque(c0519i.f1624h);
    }

    /* JADX INFO: renamed from: S */
    public final Bundle m1349S() {
        int i2;
        ArrayList arrayList;
        C0532b[] c0532bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m1362e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0539i c0539i = (C0539i) it.next();
            if (c0539i.f1727e) {
                if (m1330F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0539i.f1727e = false;
                c0539i.m1436c();
            }
        }
        Iterator it2 = m1362e().iterator();
        while (it2.hasNext()) {
            ((C0539i) it2.next()).m1438e();
        }
        m1382y(true);
        this.f1582E = true;
        this.f1589L.f1630h = true;
        C0010k c0010k = this.f1593c;
        c0010k.getClass();
        HashMap map = (HashMap) c0010k.f22a;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0523M c0523m = (C0523M) it3.next();
            if (c0523m != null) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m.f1646c;
                C0522L c0522l = new C0522L(abstractComponentCallbacksC0548r);
                if (abstractComponentCallbacksC0548r.f1777a <= -1 || c0522l.f1643m != null) {
                    c0522l.f1643m = abstractComponentCallbacksC0548r.f1778b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0548r.mo1449w(bundle2);
                    abstractComponentCallbacksC0548r.f1774P.m1173c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0548r.f1796t.m1349S());
                    c0523m.f1644a.m305n(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0548r.f1763E != null) {
                        c0523m.m1402o();
                    }
                    if (abstractComponentCallbacksC0548r.f1779c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0548r.f1779c);
                    }
                    if (abstractComponentCallbacksC0548r.f1780d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0548r.f1780d);
                    }
                    if (!abstractComponentCallbacksC0548r.f1765G) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0548r.f1765G);
                    }
                    c0522l.f1643m = bundle3;
                    if (abstractComponentCallbacksC0548r.f1784h != null) {
                        if (bundle3 == null) {
                            c0522l.f1643m = new Bundle();
                        }
                        c0522l.f1643m.putString("android:target_state", abstractComponentCallbacksC0548r.f1784h);
                        int i3 = abstractComponentCallbacksC0548r.f1785i;
                        if (i3 != 0) {
                            c0522l.f1643m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0523m.f1646c;
                arrayList2.add(abstractComponentCallbacksC0548r2.f1781e);
                if (m1330F(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0548r2 + ": " + abstractComponentCallbacksC0548r2.f1778b);
                }
            }
        }
        C0010k c0010k2 = this.f1593c;
        c0010k2.getClass();
        ArrayList<C0522L> arrayList3 = new ArrayList(((HashMap) c0010k2.f23b).values());
        if (!arrayList3.isEmpty()) {
            C0010k c0010k3 = this.f1593c;
            synchronized (((ArrayList) c0010k3.f24c)) {
                try {
                    if (((ArrayList) c0010k3.f24c).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0010k3.f24c).size());
                        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 : (ArrayList) c0010k3.f24c) {
                            arrayList.add(abstractComponentCallbacksC0548r3.f1781e);
                            if (m1330F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0548r3.f1781e + "): " + abstractComponentCallbacksC0548r3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f1594d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0532bArr = null;
            } else {
                c0532bArr = new C0532b[size];
                for (i2 = 0; i2 < size; i2++) {
                    c0532bArr[i2] = new C0532b((C0531a) this.f1594d.get(i2));
                    if (m1330F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1594d.get(i2));
                    }
                }
            }
            C0519I c0519i = new C0519I();
            c0519i.f1621e = null;
            ArrayList arrayList5 = new ArrayList();
            c0519i.f1622f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            c0519i.f1623g = arrayList6;
            c0519i.f1617a = arrayList2;
            c0519i.f1618b = arrayList;
            c0519i.f1619c = c0532bArr;
            c0519i.f1620d = this.f1599i.get();
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r4 = this.f1613w;
            if (abstractComponentCallbacksC0548r4 != null) {
                c0519i.f1621e = abstractComponentCallbacksC0548r4.f1781e;
            }
            arrayList5.addAll(this.f1600j.keySet());
            arrayList6.addAll(this.f1600j.values());
            c0519i.f1624h = new ArrayList(this.f1580C);
            bundle.putParcelable("state", c0519i);
            for (String str : this.f1601k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1601k.get(str));
            }
            for (C0522L c0522l2 : arrayList3) {
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", c0522l2);
                bundle.putBundle("fragment_" + c0522l2.f1632b, bundle4);
            }
        } else if (m1330F(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: T */
    public final void m1350T() {
        synchronized (this.f1591a) {
            try {
                if (this.f1591a.size() == 1) {
                    this.f1610t.f1807r.removeCallbacks(this.f1590M);
                    this.f1610t.f1807r.post(this.f1590M);
                    m1359b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m1351U(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r, boolean z2) {
        ViewGroup viewGroupM1336B = m1336B(abstractComponentCallbacksC0548r);
        if (viewGroupM1336B == null || !(viewGroupM1336B instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM1336B).setDrawDisappearingViewsLast(!z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m1352V(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r, EnumC0581m enumC0581m) {
        if (abstractComponentCallbacksC0548r.equals(this.f1593c.m82c(abstractComponentCallbacksC0548r.f1781e)) && (abstractComponentCallbacksC0548r.f1795s == null || abstractComponentCallbacksC0548r.f1794r == this)) {
            abstractComponentCallbacksC0548r.f1770L = enumC0581m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0548r + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: W */
    public final void m1353W(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (abstractComponentCallbacksC0548r != null) {
            if (!abstractComponentCallbacksC0548r.equals(this.f1593c.m82c(abstractComponentCallbacksC0548r.f1781e)) || (abstractComponentCallbacksC0548r.f1795s != null && abstractComponentCallbacksC0548r.f1794r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0548r + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = this.f1613w;
        this.f1613w = abstractComponentCallbacksC0548r;
        m1374q(abstractComponentCallbacksC0548r2);
        m1374q(this.f1613w);
    }

    /* JADX INFO: renamed from: X */
    public final void m1354X(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        ViewGroup viewGroupM1336B = m1336B(abstractComponentCallbacksC0548r);
        if (viewGroupM1336B != null) {
            C0546p c0546p = abstractComponentCallbacksC0548r.f1766H;
            if ((c0546p == null ? 0 : c0546p.f1751e) + (c0546p == null ? 0 : c0546p.f1750d) + (c0546p == null ? 0 : c0546p.f1749c) + (c0546p == null ? 0 : c0546p.f1748b) > 0) {
                if (viewGroupM1336B.getTag(R.id.resc) == null) {
                    viewGroupM1336B.setTag(R.id.resc, abstractComponentCallbacksC0548r);
                }
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = (AbstractComponentCallbacksC0548r) viewGroupM1336B.getTag(R.id.resc);
                C0546p c0546p2 = abstractComponentCallbacksC0548r.f1766H;
                boolean z2 = c0546p2 != null ? c0546p2.f1747a : false;
                if (abstractComponentCallbacksC0548r2.f1766H == null) {
                    return;
                }
                abstractComponentCallbacksC0548r2.m1457f().f1747a = z2;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m1355Z() {
        for (C0523M c0523m : this.f1593c.m85f()) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m.f1646c;
            if (abstractComponentCallbacksC0548r.f1764F) {
                if (this.f1592b) {
                    this.f1585H = true;
                } else {
                    abstractComponentCallbacksC0548r.f1764F = false;
                    c0523m.m1398k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0523M m1356a(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        String str = abstractComponentCallbacksC0548r.f1769K;
        if (str != null) {
            AbstractC0448d.m1140c(abstractComponentCallbacksC0548r, str);
        }
        if (m1330F(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0548r);
        }
        C0523M c0523mM1363f = m1363f(abstractComponentCallbacksC0548r);
        abstractComponentCallbacksC0548r.f1794r = this;
        C0010k c0010k = this.f1593c;
        c0010k.m88i(c0523mM1363f);
        if (!abstractComponentCallbacksC0548r.f1802z) {
            c0010k.m80a(abstractComponentCallbacksC0548r);
            abstractComponentCallbacksC0548r.f1788l = false;
            if (abstractComponentCallbacksC0548r.f1763E == null) {
                abstractComponentCallbacksC0548r.f1767I = false;
            }
            if (m1331G(abstractComponentCallbacksC0548r)) {
                this.f1581D = true;
            }
        }
        return c0523mM1363f;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1357a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0526P());
        C0550t c0550t = this.f1610t;
        if (c0550t == null) {
            try {
                m1379v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0550t.f1809t.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1358b(C0550t c0550t, AbstractC0383m abstractC0383m, AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        C0520J c0520j;
        String str;
        if (this.f1610t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1610t = c0550t;
        this.f1611u = abstractC0383m;
        this.f1612v = abstractComponentCallbacksC0548r;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1603m;
        if (abstractComponentCallbacksC0548r != null) {
            copyOnWriteArrayList.add(new C0513C(abstractComponentCallbacksC0548r));
        } else if (c0550t != null) {
            copyOnWriteArrayList.add(c0550t);
        }
        if (this.f1612v != null) {
            m1359b0();
        }
        if (c0550t != null) {
            C0485v c0485vM1167i = c0550t.f1809t.m1167i();
            this.f1597g = c0485vM1167i;
            c0485vM1167i.m1186a(abstractComponentCallbacksC0548r != null ? abstractComponentCallbacksC0548r : c0550t, this.f1598h);
        }
        if (abstractComponentCallbacksC0548r != null) {
            C0520J c0520j2 = abstractComponentCallbacksC0548r.f1794r.f1589L;
            HashMap map = c0520j2.f1626d;
            C0520J c0520j3 = (C0520J) map.get(abstractComponentCallbacksC0548r.f1781e);
            if (c0520j3 == null) {
                c0520j3 = new C0520J(c0520j2.f1628f);
                map.put(abstractComponentCallbacksC0548r.f1781e, c0520j3);
            }
            this.f1589L = c0520j3;
        } else if (c0550t != null) {
            C0567K c0567kMo1163c = c0550t.f1809t.mo1163c();
            AbstractC0451c.m1146e(c0567kMo1163c, "store");
            C0601a c0601a = C0601a.f2040b;
            AbstractC0451c.m1146e(c0601a, "defaultCreationExtras");
            String canonicalName = C0520J.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0451c.m1146e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0567kMo1163c.f1852a;
            AbstractC0565I abstractC0565I = (AbstractC0565I) linkedHashMap.get(strConcat);
            if (C0520J.class.isInstance(abstractC0565I)) {
                AbstractC0451c.m1144c(abstractC0565I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0601a.f2041a);
                linkedHashMap2.put(C0566J.f1851b, strConcat);
                try {
                    c0520j = new C0520J(true);
                } catch (AbstractMethodError unused) {
                    c0520j = new C0520J(true);
                }
                abstractC0565I = c0520j;
                AbstractC0565I abstractC0565I2 = (AbstractC0565I) linkedHashMap.put(strConcat, abstractC0565I);
                if (abstractC0565I2 != null) {
                    abstractC0565I2.mo1384a();
                }
            }
            this.f1589L = (C0520J) abstractC0565I;
        } else {
            this.f1589L = new C0520J(false);
        }
        C0520J c0520j4 = this.f1589L;
        c0520j4.f1630h = this.f1582E || this.f1583F;
        this.f1593c.f25d = c0520j4;
        C0550t c0550t2 = this.f1610t;
        if (c0550t2 != null && abstractComponentCallbacksC0548r == null) {
            C0781d c0781dMo1162b = c0550t2.mo1162b();
            c0781dMo1162b.m2132e("android:support:fragments", new C0460e(2, this));
            Bundle bundleM2130c = c0781dMo1162b.m2130c("android:support:fragments");
            if (bundleM2130c != null) {
                m1348R(bundleM2130c);
            }
        }
        C0550t c0550t3 = this.f1610t;
        if (c0550t3 != null) {
            AbstractActivityC0669k abstractActivityC0669k = c0550t3.f1809t;
            if (abstractComponentCallbacksC0548r != null) {
                str = abstractComponentCallbacksC0548r.f1781e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String strM1417f = AbstractC0529T.m1417f(str2, "StartActivityForResult");
            C0514D c0514d = new C0514D(3);
            C0555y c0555y = new C0555y(this, 1);
            C0462g c0462g = abstractActivityC0669k.f1187k;
            this.f1616z = c0462g.m1181d(strM1417f, c0514d, c0555y);
            this.f1578A = c0462g.m1181d(AbstractC0529T.m1417f(str2, "StartIntentSenderForResult"), new C0514D(0), new C0555y(this, 2));
            this.f1579B = c0462g.m1181d(AbstractC0529T.m1417f(str2, "RequestPermissions"), new C0514D(2), new C0555y(this, 0));
        }
        C0550t c0550t4 = this.f1610t;
        if (c0550t4 != null) {
            c0550t4.f1809t.m1165g(this.f1604n);
        }
        C0550t c0550t5 = this.f1610t;
        if (c0550t5 != null) {
            c0550t5.f1809t.f1189m.add(this.f1605o);
        }
        C0550t c0550t6 = this.f1610t;
        if (c0550t6 != null) {
            c0550t6.f1809t.f1191o.add(this.f1606p);
        }
        C0550t c0550t7 = this.f1610t;
        if (c0550t7 != null) {
            c0550t7.f1809t.f1192p.add(this.f1607q);
        }
        C0550t c0550t8 = this.f1610t;
        if (c0550t8 == null || abstractComponentCallbacksC0548r != null) {
            return;
        }
        AbstractActivityC0669k abstractActivityC0669k2 = c0550t8.f1809t;
        C0511A c0511a = this.f1608r;
        C0270l c0270l = abstractActivityC0669k2.f1179c;
        ((CopyOnWriteArrayList) c0270l.f837b).add(c0511a);
        ((Runnable) c0270l.f836a).run();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1359b0() {
        synchronized (this.f1591a) {
            try {
                if (!this.f1591a.isEmpty()) {
                    C0556z c0556z = this.f1598h;
                    c0556z.f1822a = true;
                    C0484u c0484u = c0556z.f1824c;
                    if (c0484u != null) {
                        c0484u.mo1135a();
                    }
                    return;
                }
                C0556z c0556z2 = this.f1598h;
                ArrayList arrayList = this.f1594d;
                c0556z2.f1822a = (arrayList != null ? arrayList.size() : 0) > 0 && m1333J(this.f1612v);
                C0484u c0484u2 = c0556z2.f1824c;
                if (c0484u2 != null) {
                    c0484u2.mo1135a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1360c(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (m1330F(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0548r);
        }
        if (abstractComponentCallbacksC0548r.f1802z) {
            abstractComponentCallbacksC0548r.f1802z = false;
            if (abstractComponentCallbacksC0548r.f1787k) {
                return;
            }
            this.f1593c.m80a(abstractComponentCallbacksC0548r);
            if (m1330F(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0548r);
            }
            if (m1331G(abstractComponentCallbacksC0548r)) {
                this.f1581D = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1361d() {
        this.f1592b = false;
        this.f1587J.clear();
        this.f1586I.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m1362e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1593c.m85f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0523M) it.next()).f1646c.f1762D;
            if (viewGroup != null) {
                hashSet.add(C0539i.m1433f(viewGroup, m1338D()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0523M m1363f(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        String str = abstractComponentCallbacksC0548r.f1781e;
        C0010k c0010k = this.f1593c;
        C0523M c0523m = (C0523M) ((HashMap) c0010k.f22a).get(str);
        if (c0523m != null) {
            return c0523m;
        }
        C0523M c0523m2 = new C0523M(this.f1602l, c0010k, abstractComponentCallbacksC0548r);
        c0523m2.m1400m(this.f1610t.f1806q.getClassLoader());
        c0523m2.f1648e = this.f1609s;
        return c0523m2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1364g(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (m1330F(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0548r);
        }
        if (abstractComponentCallbacksC0548r.f1802z) {
            return;
        }
        abstractComponentCallbacksC0548r.f1802z = true;
        if (abstractComponentCallbacksC0548r.f1787k) {
            if (m1330F(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0548r);
            }
            C0010k c0010k = this.f1593c;
            synchronized (((ArrayList) c0010k.f24c)) {
                ((ArrayList) c0010k.f24c).remove(abstractComponentCallbacksC0548r);
            }
            abstractComponentCallbacksC0548r.f1787k = false;
            if (m1331G(abstractComponentCallbacksC0548r)) {
                this.f1581D = true;
            }
            m1354X(abstractComponentCallbacksC0548r);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1365h(boolean z2) {
        if (z2 && this.f1610t != null) {
            m1357a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null) {
                abstractComponentCallbacksC0548r.f1761C = true;
                if (z2) {
                    abstractComponentCallbacksC0548r.f1796t.m1365h(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1366i() {
        if (this.f1609s >= 1) {
            for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
                if (abstractComponentCallbacksC0548r != null) {
                    if (!abstractComponentCallbacksC0548r.f1801y ? abstractComponentCallbacksC0548r.f1796t.m1366i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1367j() {
        if (this.f1609s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null && m1332I(abstractComponentCallbacksC0548r)) {
                if (!abstractComponentCallbacksC0548r.f1801y ? abstractComponentCallbacksC0548r.f1796t.m1367j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0548r);
                    z2 = true;
                }
            }
        }
        if (this.f1595e != null) {
            for (int i2 = 0; i2 < this.f1595e.size(); i2++) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = (AbstractComponentCallbacksC0548r) this.f1595e.get(i2);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0548r2)) {
                    abstractComponentCallbacksC0548r2.getClass();
                }
            }
        }
        this.f1595e = arrayList;
        return z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m1368k() {
        boolean z2;
        this.f1584G = true;
        m1382y(true);
        Iterator it = m1362e().iterator();
        while (it.hasNext()) {
            ((C0539i) it.next()).m1438e();
        }
        C0550t c0550t = this.f1610t;
        boolean z3 = c0550t != null;
        C0010k c0010k = this.f1593c;
        if (z3) {
            z2 = ((C0520J) c0010k.f25d).f1629g;
        } else {
            z2 = AbstractC0529T.m1418g(c0550t.f1806q) ? !r1.isChangingConfigurations() : true;
        }
        if (z2) {
            Iterator it2 = this.f1600j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0533c) it2.next()).f1707a) {
                    C0520J c0520j = (C0520J) c0010k.f25d;
                    c0520j.getClass();
                    if (m1330F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0520j.m1386c(str);
                }
            }
        }
        m1377t(-1);
        C0550t c0550t2 = this.f1610t;
        if (c0550t2 != null) {
            c0550t2.f1809t.f1189m.remove(this.f1605o);
        }
        C0550t c0550t3 = this.f1610t;
        if (c0550t3 != null) {
            c0550t3.f1809t.f1188l.remove(this.f1604n);
        }
        C0550t c0550t4 = this.f1610t;
        if (c0550t4 != null) {
            c0550t4.f1809t.f1191o.remove(this.f1606p);
        }
        C0550t c0550t5 = this.f1610t;
        if (c0550t5 != null) {
            c0550t5.f1809t.f1192p.remove(this.f1607q);
        }
        C0550t c0550t6 = this.f1610t;
        if (c0550t6 != null) {
            AbstractActivityC0669k abstractActivityC0669k = c0550t6.f1809t;
            C0511A c0511a = this.f1608r;
            C0270l c0270l = abstractActivityC0669k.f1179c;
            ((CopyOnWriteArrayList) c0270l.f837b).remove(c0511a);
            if (((HashMap) c0270l.f838c).remove(c0511a) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0270l.f836a).run();
        }
        this.f1610t = null;
        this.f1611u = null;
        this.f1612v = null;
        if (this.f1597g != null) {
            Iterator it3 = this.f1598h.f1823b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0458c) it3.next()).cancel();
            }
            this.f1597g = null;
        }
        C0477d c0477d = this.f1616z;
        if (c0477d != null) {
            c0477d.m1178q0();
            this.f1578A.m1178q0();
            this.f1579B.m1178q0();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1369l(boolean z2) {
        if (z2 && this.f1610t != null) {
            m1357a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null) {
                abstractComponentCallbacksC0548r.f1761C = true;
                if (z2) {
                    abstractComponentCallbacksC0548r.f1796t.m1369l(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1370m(boolean z2) {
        if (z2 && this.f1610t != null) {
            m1357a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null && z2) {
                abstractComponentCallbacksC0548r.f1796t.m1370m(true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1371n() {
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m86g()) {
            if (abstractComponentCallbacksC0548r != null) {
                abstractComponentCallbacksC0548r.m1464m();
                abstractComponentCallbacksC0548r.f1796t.m1371n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1372o() {
        if (this.f1609s >= 1) {
            for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
                if (abstractComponentCallbacksC0548r != null) {
                    if (!abstractComponentCallbacksC0548r.f1801y ? abstractComponentCallbacksC0548r.f1796t.m1372o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1373p() {
        if (this.f1609s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null && !abstractComponentCallbacksC0548r.f1801y) {
                abstractComponentCallbacksC0548r.f1796t.m1373p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1374q(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (abstractComponentCallbacksC0548r != null) {
            if (abstractComponentCallbacksC0548r.equals(this.f1593c.m82c(abstractComponentCallbacksC0548r.f1781e))) {
                abstractComponentCallbacksC0548r.f1794r.getClass();
                boolean zM1333J = m1333J(abstractComponentCallbacksC0548r);
                Boolean bool = abstractComponentCallbacksC0548r.f1786j;
                if (bool == null || bool.booleanValue() != zM1333J) {
                    abstractComponentCallbacksC0548r.f1786j = Boolean.valueOf(zM1333J);
                    C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
                    c0518h.m1359b0();
                    c0518h.m1374q(c0518h.f1613w);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1375r(boolean z2) {
        if (z2 && this.f1610t != null) {
            m1357a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null && z2) {
                abstractComponentCallbacksC0548r.f1796t.m1375r(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1376s() {
        if (this.f1609s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r : this.f1593c.m87h()) {
            if (abstractComponentCallbacksC0548r != null && m1332I(abstractComponentCallbacksC0548r)) {
                if (!abstractComponentCallbacksC0548r.f1801y ? abstractComponentCallbacksC0548r.f1796t.m1376s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: t */
    public final void m1377t(int i2) {
        try {
            this.f1592b = true;
            for (C0523M c0523m : ((HashMap) this.f1593c.f22a).values()) {
                if (c0523m != null) {
                    c0523m.f1648e = i2;
                }
            }
            m1341K(i2, false);
            Iterator it = m1362e().iterator();
            while (it.hasNext()) {
                ((C0539i) it.next()).m1438e();
            }
            this.f1592b = false;
            m1382y(true);
        } catch (Throwable th) {
            this.f1592b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            sb.append(abstractComponentCallbacksC0548r.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1612v)));
            sb.append("}");
        } else {
            C0550t c0550t = this.f1610t;
            if (c0550t != null) {
                sb.append(c0550t.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1610t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m1378u() {
        if (this.f1585H) {
            this.f1585H = false;
            m1355Z();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1379v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM1417f = AbstractC0529T.m1417f(str, "    ");
        C0010k c0010k = this.f1593c;
        c0010k.getClass();
        String str3 = str + "    ";
        HashMap map = (HashMap) c0010k.f22a;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0523M c0523m : map.values()) {
                printWriter.print(str);
                if (c0523m != null) {
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m.f1646c;
                    printWriter.println(abstractComponentCallbacksC0548r);
                    abstractComponentCallbacksC0548r.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0548r.f1798v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0548r.f1799w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0548r.f1800x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1777a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1781e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0548r.f1793q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1787k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1788l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1789m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0548r.f1790n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1801y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1802z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1760B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0548r.f1759A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0548r.f1765G);
                    if (abstractComponentCallbacksC0548r.f1794r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1794r);
                    }
                    if (abstractComponentCallbacksC0548r.f1795s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1795s);
                    }
                    if (abstractComponentCallbacksC0548r.f1797u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1797u);
                    }
                    if (abstractComponentCallbacksC0548r.f1782f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1782f);
                    }
                    if (abstractComponentCallbacksC0548r.f1778b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1778b);
                    }
                    if (abstractComponentCallbacksC0548r.f1779c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1779c);
                    }
                    if (abstractComponentCallbacksC0548r.f1780d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1780d);
                    }
                    Object objM82c = abstractComponentCallbacksC0548r.f1783g;
                    if (objM82c == null) {
                        C0518H c0518h = abstractComponentCallbacksC0548r.f1794r;
                        objM82c = (c0518h == null || (str2 = abstractComponentCallbacksC0548r.f1784h) == null) ? null : c0518h.f1593c.m82c(str2);
                    }
                    if (objM82c != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objM82c);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1785i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0546p c0546p = abstractComponentCallbacksC0548r.f1766H;
                    printWriter.println(c0546p == null ? false : c0546p.f1747a);
                    C0546p c0546p2 = abstractComponentCallbacksC0548r.f1766H;
                    if ((c0546p2 == null ? 0 : c0546p2.f1748b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0546p c0546p3 = abstractComponentCallbacksC0548r.f1766H;
                        printWriter.println(c0546p3 == null ? 0 : c0546p3.f1748b);
                    }
                    C0546p c0546p4 = abstractComponentCallbacksC0548r.f1766H;
                    if ((c0546p4 == null ? 0 : c0546p4.f1749c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0546p c0546p5 = abstractComponentCallbacksC0548r.f1766H;
                        printWriter.println(c0546p5 == null ? 0 : c0546p5.f1749c);
                    }
                    C0546p c0546p6 = abstractComponentCallbacksC0548r.f1766H;
                    if ((c0546p6 == null ? 0 : c0546p6.f1750d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0546p c0546p7 = abstractComponentCallbacksC0548r.f1766H;
                        printWriter.println(c0546p7 == null ? 0 : c0546p7.f1750d);
                    }
                    C0546p c0546p8 = abstractComponentCallbacksC0548r.f1766H;
                    if ((c0546p8 == null ? 0 : c0546p8.f1751e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0546p c0546p9 = abstractComponentCallbacksC0548r.f1766H;
                        printWriter.println(c0546p9 == null ? 0 : c0546p9.f1751e);
                    }
                    if (abstractComponentCallbacksC0548r.f1762D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1762D);
                    }
                    if (abstractComponentCallbacksC0548r.f1763E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0548r.f1763E);
                    }
                    if (abstractComponentCallbacksC0548r.m1459h() != null) {
                        C0048n.m281x(abstractComponentCallbacksC0548r).m310u(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0548r.f1796t + ":");
                    abstractComponentCallbacksC0548r.f1796t.m1379v(AbstractC0529T.m1417f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0010k.f24c;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = (AbstractComponentCallbacksC0548r) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0548r2.toString());
            }
        }
        ArrayList arrayList2 = this.f1595e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = (AbstractComponentCallbacksC0548r) this.f1595e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0548r3.toString());
            }
        }
        ArrayList arrayList3 = this.f1594d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0531a c0531a = (C0531a) this.f1594d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0531a.toString());
                c0531a.m1424d(strM1417f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1599i.get());
        synchronized (this.f1591a) {
            try {
                int size4 = this.f1591a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (InterfaceC0516F) this.f1591a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1610t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1611u);
        if (this.f1612v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1612v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1609s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1582E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1583F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1584G);
        if (this.f1581D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1581D);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1380w(InterfaceC0516F interfaceC0516F, boolean z2) {
        if (!z2) {
            if (this.f1610t == null) {
                if (!this.f1584G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1582E || this.f1583F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1591a) {
            try {
                if (this.f1610t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1591a.add(interfaceC0516F);
                    m1350T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1381x(boolean z2) {
        if (this.f1592b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1610t == null) {
            if (!this.f1584G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1610t.f1807r.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1582E || this.f1583F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1586I == null) {
            this.f1586I = new ArrayList();
            this.f1587J = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1382y(boolean z2) {
        boolean zMo1328a;
        m1381x(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1586I;
            ArrayList arrayList2 = this.f1587J;
            synchronized (this.f1591a) {
                if (this.f1591a.isEmpty()) {
                    zMo1328a = false;
                } else {
                    try {
                        int size = this.f1591a.size();
                        zMo1328a = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zMo1328a |= ((InterfaceC0516F) this.f1591a.get(i2)).mo1328a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo1328a) {
                m1359b0();
                m1378u();
                ((HashMap) this.f1593c.f22a).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.f1592b = true;
            try {
                m1347Q(this.f1586I, this.f1587J);
            } finally {
                m1361d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1383z(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7 = ((C0531a) arrayList.get(i2)).f1689o;
        ArrayList arrayList3 = this.f1588K;
        if (arrayList3 == null) {
            this.f1588K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f1588K;
        C0010k c0010k = this.f1593c;
        arrayList4.addAll(c0010k.m87h());
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1613w;
        int i8 = i2;
        boolean z8 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i3) {
                boolean z9 = z7;
                this.f1588K.clear();
                if (!z9 && this.f1609s >= 1) {
                    for (int i10 = i2; i10 < i3; i10++) {
                        Iterator it = ((C0531a) arrayList.get(i10)).f1675a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = ((C0524N) it.next()).f1650b;
                            if (abstractComponentCallbacksC0548r2 != null && abstractComponentCallbacksC0548r2.f1794r != null) {
                                c0010k.m88i(m1363f(abstractComponentCallbacksC0548r2));
                            }
                        }
                    }
                }
                for (int i11 = i2; i11 < i3; i11++) {
                    C0531a c0531a = (C0531a) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        c0531a.m1423c(-1);
                        ArrayList arrayList5 = c0531a.f1675a;
                        boolean z10 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            C0524N c0524n = (C0524N) arrayList5.get(size);
                            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = c0524n.f1650b;
                            if (abstractComponentCallbacksC0548r3 != null) {
                                if (abstractComponentCallbacksC0548r3.f1766H != null) {
                                    abstractComponentCallbacksC0548r3.m1457f().f1747a = z10;
                                }
                                int i12 = c0531a.f1680f;
                                int i13 = 8194;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        if (i12 != 8197) {
                                            i13 = i12 != 4099 ? i12 != 4100 ? 0 : 8197 : 4099;
                                        }
                                    } else {
                                        i13 = 4097;
                                    }
                                }
                                if (abstractComponentCallbacksC0548r3.f1766H != null || i13 != 0) {
                                    abstractComponentCallbacksC0548r3.m1457f();
                                    abstractComponentCallbacksC0548r3.f1766H.f1752f = i13;
                                }
                                abstractComponentCallbacksC0548r3.m1457f();
                                abstractComponentCallbacksC0548r3.f1766H.getClass();
                            }
                            int i14 = c0524n.f1649a;
                            C0518H c0518h = c0531a.f1690p;
                            switch (i14) {
                                case 1:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    z10 = true;
                                    c0518h.m1351U(abstractComponentCallbacksC0548r3, true);
                                    c0518h.m1346P(abstractComponentCallbacksC0548r3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0524n.f1649a);
                                case 3:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    c0518h.m1356a(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    c0518h.getClass();
                                    m1334Y(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    c0518h.m1351U(abstractComponentCallbacksC0548r3, true);
                                    c0518h.m1339E(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    c0518h.m1360c(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0548r3.m1455D(c0524n.f1652d, c0524n.f1653e, c0524n.f1654f, c0524n.f1655g);
                                    c0518h.m1351U(abstractComponentCallbacksC0548r3, true);
                                    c0518h.m1364g(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 8:
                                    c0518h.m1353W(null);
                                    z10 = true;
                                    break;
                                case 9:
                                    c0518h.m1353W(abstractComponentCallbacksC0548r3);
                                    z10 = true;
                                    break;
                                case 10:
                                    c0518h.m1352V(abstractComponentCallbacksC0548r3, c0524n.f1656h);
                                    z10 = true;
                                    break;
                            }
                        }
                    } else {
                        c0531a.m1423c(1);
                        ArrayList arrayList6 = c0531a.f1675a;
                        int size2 = arrayList6.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            C0524N c0524n2 = (C0524N) arrayList6.get(i15);
                            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r4 = c0524n2.f1650b;
                            if (abstractComponentCallbacksC0548r4 != null) {
                                if (abstractComponentCallbacksC0548r4.f1766H != null) {
                                    abstractComponentCallbacksC0548r4.m1457f().f1747a = false;
                                }
                                int i16 = c0531a.f1680f;
                                if (abstractComponentCallbacksC0548r4.f1766H != null || i16 != 0) {
                                    abstractComponentCallbacksC0548r4.m1457f();
                                    abstractComponentCallbacksC0548r4.f1766H.f1752f = i16;
                                }
                                abstractComponentCallbacksC0548r4.m1457f();
                                abstractComponentCallbacksC0548r4.f1766H.getClass();
                            }
                            int i17 = c0524n2.f1649a;
                            C0518H c0518h2 = c0531a.f1690p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1351U(abstractComponentCallbacksC0548r4, false);
                                    c0518h2.m1356a(abstractComponentCallbacksC0548r4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0524n2.f1649a);
                                case 3:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1346P(abstractComponentCallbacksC0548r4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1339E(abstractComponentCallbacksC0548r4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1351U(abstractComponentCallbacksC0548r4, false);
                                    m1334Y(abstractComponentCallbacksC0548r4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1364g(abstractComponentCallbacksC0548r4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0548r4.m1455D(c0524n2.f1652d, c0524n2.f1653e, c0524n2.f1654f, c0524n2.f1655g);
                                    c0518h2.m1351U(abstractComponentCallbacksC0548r4, false);
                                    c0518h2.m1360c(abstractComponentCallbacksC0548r4);
                                    break;
                                case 8:
                                    c0518h2.m1353W(abstractComponentCallbacksC0548r4);
                                    break;
                                case 9:
                                    c0518h2.m1353W(null);
                                    break;
                                case 10:
                                    c0518h2.m1352V(abstractComponentCallbacksC0548r4, c0524n2.f1657i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i18 = i2; i18 < i3; i18++) {
                    C0531a c0531a2 = (C0531a) arrayList.get(i18);
                    if (zBooleanValue) {
                        for (int size3 = c0531a2.f1675a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r5 = ((C0524N) c0531a2.f1675a.get(size3)).f1650b;
                            if (abstractComponentCallbacksC0548r5 != null) {
                                m1363f(abstractComponentCallbacksC0548r5).m1398k();
                            }
                        }
                    } else {
                        Iterator it2 = c0531a2.f1675a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r6 = ((C0524N) it2.next()).f1650b;
                            if (abstractComponentCallbacksC0548r6 != null) {
                                m1363f(abstractComponentCallbacksC0548r6).m1398k();
                            }
                        }
                    }
                }
                m1341K(this.f1609s, true);
                HashSet<C0539i> hashSet = new HashSet();
                for (int i19 = i2; i19 < i3; i19++) {
                    Iterator it3 = ((C0531a) arrayList.get(i19)).f1675a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r7 = ((C0524N) it3.next()).f1650b;
                        if (abstractComponentCallbacksC0548r7 != null && (viewGroup = abstractComponentCallbacksC0548r7.f1762D) != null) {
                            hashSet.add(C0539i.m1433f(viewGroup, m1338D()));
                        }
                    }
                }
                for (C0539i c0539i : hashSet) {
                    c0539i.f1726d = zBooleanValue;
                    synchronized (c0539i.f1724b) {
                        try {
                            c0539i.m1439g();
                            c0539i.f1727e = false;
                            int size4 = c0539i.f1724b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    C0528S c0528s = (C0528S) c0539i.f1724b.get(size4);
                                    int iM1414c = AbstractC0529T.m1414c(c0528s.f1669c.f1763E);
                                    if (c0528s.f1667a != 2 || iM1414c == 2) {
                                        size4--;
                                    } else {
                                        C0546p c0546p = c0528s.f1669c.f1766H;
                                        c0539i.f1727e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0539i.m1436c();
                }
                for (int i20 = i2; i20 < i3; i20++) {
                    C0531a c0531a3 = (C0531a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && c0531a3.f1692r >= 0) {
                        c0531a3.f1692r = -1;
                    }
                    c0531a3.getClass();
                }
                return;
            }
            C0531a c0531a4 = (C0531a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                z2 = z7;
                i4 = i8;
                z3 = z8;
                int i21 = 1;
                ArrayList arrayList7 = this.f1588K;
                ArrayList arrayList8 = c0531a4.f1675a;
                int size5 = arrayList8.size() - 1;
                while (size5 >= 0) {
                    C0524N c0524n3 = (C0524N) arrayList8.get(size5);
                    int i22 = c0524n3.f1649a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 6:
                                    arrayList7.add(c0524n3.f1650b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0548r = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0548r = c0524n3.f1650b;
                                    break;
                                case 10:
                                    c0524n3.f1657i = c0524n3.f1656h;
                                    break;
                            }
                        }
                        size5--;
                        i21 = 1;
                    }
                    arrayList7.remove(c0524n3.f1650b);
                    size5--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f1588K;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList10 = c0531a4.f1675a;
                    if (i23 < arrayList10.size()) {
                        C0524N c0524n4 = (C0524N) arrayList10.get(i23);
                        int i24 = c0524n4.f1649a;
                        if (i24 != i9) {
                            z4 = z7;
                            if (i24 != 2) {
                                if (i24 == 3 || i24 == 6) {
                                    arrayList9.remove(c0524n4.f1650b);
                                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r8 = c0524n4.f1650b;
                                    if (abstractComponentCallbacksC0548r8 == abstractComponentCallbacksC0548r) {
                                        arrayList10.add(i23, new C0524N(9, abstractComponentCallbacksC0548r8));
                                        i23++;
                                        i5 = i8;
                                        z5 = z8;
                                        i6 = 1;
                                        abstractComponentCallbacksC0548r = null;
                                    }
                                } else if (i24 != 7) {
                                    if (i24 == 8) {
                                        arrayList10.add(i23, new C0524N(9, abstractComponentCallbacksC0548r, 0));
                                        c0524n4.f1651c = true;
                                        i23++;
                                        abstractComponentCallbacksC0548r = c0524n4.f1650b;
                                    }
                                }
                                i5 = i8;
                                z5 = z8;
                                i6 = 1;
                            } else {
                                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r9 = c0524n4.f1650b;
                                int i25 = abstractComponentCallbacksC0548r9.f1799w;
                                int size6 = arrayList9.size() - 1;
                                boolean z11 = false;
                                while (size6 >= 0) {
                                    int i26 = size6;
                                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r10 = (AbstractComponentCallbacksC0548r) arrayList9.get(size6);
                                    int i27 = i8;
                                    if (abstractComponentCallbacksC0548r10.f1799w != i25) {
                                        z6 = z8;
                                    } else if (abstractComponentCallbacksC0548r10 == abstractComponentCallbacksC0548r9) {
                                        z6 = z8;
                                        z11 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0548r10 == abstractComponentCallbacksC0548r) {
                                            z6 = z8;
                                            i7 = 0;
                                            arrayList10.add(i23, new C0524N(9, abstractComponentCallbacksC0548r10, 0));
                                            i23++;
                                            abstractComponentCallbacksC0548r = null;
                                        } else {
                                            z6 = z8;
                                            i7 = 0;
                                        }
                                        C0524N c0524n5 = new C0524N(3, abstractComponentCallbacksC0548r10, i7);
                                        c0524n5.f1652d = c0524n4.f1652d;
                                        c0524n5.f1654f = c0524n4.f1654f;
                                        c0524n5.f1653e = c0524n4.f1653e;
                                        c0524n5.f1655g = c0524n4.f1655g;
                                        arrayList10.add(i23, c0524n5);
                                        arrayList9.remove(abstractComponentCallbacksC0548r10);
                                        i23++;
                                        abstractComponentCallbacksC0548r = abstractComponentCallbacksC0548r;
                                    }
                                    size6 = i26 - 1;
                                    z8 = z6;
                                    i8 = i27;
                                }
                                i5 = i8;
                                z5 = z8;
                                i6 = 1;
                                if (z11) {
                                    arrayList10.remove(i23);
                                    i23--;
                                } else {
                                    c0524n4.f1649a = 1;
                                    c0524n4.f1651c = true;
                                    arrayList9.add(abstractComponentCallbacksC0548r9);
                                }
                            }
                            i23 += i6;
                            z7 = z4;
                            z8 = z5;
                            i8 = i5;
                            i9 = 1;
                        } else {
                            z4 = z7;
                        }
                        i5 = i8;
                        z5 = z8;
                        i6 = 1;
                        arrayList9.add(c0524n4.f1650b);
                        i23 += i6;
                        z7 = z4;
                        z8 = z5;
                        i8 = i5;
                        i9 = 1;
                    } else {
                        z2 = z7;
                        i4 = i8;
                        z3 = z8;
                    }
                }
            }
            z8 = z3 || c0531a4.f1681g;
            i8 = i4 + 1;
            z7 = z2;
        }
    }
}
