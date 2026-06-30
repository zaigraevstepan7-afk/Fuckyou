package p073k0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0010k;
import p015I0.C0109e;
import p019K0.C0161c;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0257e0;
import p036T.AbstractC0383m;
import p084q.AbstractC1030i;
import p084q.C1027f;
import p084q.C1029h;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: k0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849m implements Cloneable {

    /* JADX INFO: renamed from: w */
    public static final Animator[] f3453w = new Animator[0];

    /* JADX INFO: renamed from: x */
    public static final int[] f3454x = {2, 1, 3, 4};

    /* JADX INFO: renamed from: y */
    public static final C0109e f3455y = new C0109e(22);

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal f3456z = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public ArrayList f3467k;

    /* JADX INFO: renamed from: l */
    public ArrayList f3468l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0847k[] f3469m;

    /* JADX INFO: renamed from: a */
    public final String f3457a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f3458b = -1;

    /* JADX INFO: renamed from: c */
    public long f3459c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f3460d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3461e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f3462f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C0010k f3463g = new C0010k(5);

    /* JADX INFO: renamed from: h */
    public C0010k f3464h = new C0010k(5);

    /* JADX INFO: renamed from: i */
    public C0837a f3465i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f3466j = f3454x;

    /* JADX INFO: renamed from: n */
    public final ArrayList f3470n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public Animator[] f3471o = f3453w;

    /* JADX INFO: renamed from: p */
    public int f3472p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f3473q = false;

    /* JADX INFO: renamed from: r */
    public boolean f3474r = false;

    /* JADX INFO: renamed from: s */
    public AbstractC0849m f3475s = null;

    /* JADX INFO: renamed from: t */
    public ArrayList f3476t = null;

    /* JADX INFO: renamed from: u */
    public ArrayList f3477u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public C0109e f3478v = f3455y;

    /* JADX INFO: renamed from: b */
    public static void m2246b(C0010k c0010k, View view, C0857u c0857u) {
        ((C1027f) c0010k.f22a).put(view, c0857u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0010k.f23b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        String strM709k = AbstractC0229G.m709k(view);
        if (strM709k != null) {
            C1027f c1027f = (C1027f) c0010k.f25d;
            if (c1027f.containsKey(strM709k)) {
                c1027f.put(strM709k, null);
            } else {
                c1027f.put(strM709k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1029h c1029h = (C1029h) c0010k.f24c;
                if (c1029h.f4096a) {
                    int i2 = c1029h.f4099d;
                    long[] jArr = c1029h.f4097b;
                    Object[] objArr = c1029h.f4098c;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj = objArr[i4];
                        if (obj != AbstractC1030i.f4100a) {
                            if (i4 != i3) {
                                jArr[i3] = jArr[i4];
                                objArr[i3] = obj;
                                objArr[i4] = null;
                            }
                            i3++;
                        }
                    }
                    c1029h.f4096a = false;
                    c1029h.f4099d = i3;
                }
                if (AbstractC1034a.m2500b(c1029h.f4097b, c1029h.f4099d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1029h.m2481g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1029h.m2478d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1029h.m2481g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C1027f m2247p() {
        ThreadLocal threadLocal = f3456z;
        C1027f c1027f = (C1027f) threadLocal.get();
        if (c1027f != null) {
            return c1027f;
        }
        C1027f c1027f2 = new C1027f(0);
        threadLocal.set(c1027f2);
        return c1027f2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2248u(C0857u c0857u, C0857u c0857u2, String str) {
        Object obj = c0857u.f3489a.get(str);
        Object obj2 = c0857u2.f3489a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo2219A(long j2) {
        this.f3459c = j2;
    }

    /* JADX INFO: renamed from: C */
    public void mo2221C(TimeInterpolator timeInterpolator) {
        this.f3460d = timeInterpolator;
    }

    /* JADX INFO: renamed from: D */
    public void mo2222D(C0109e c0109e) {
        if (c0109e == null) {
            this.f3478v = f3455y;
        } else {
            this.f3478v = c0109e;
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo2224F(long j2) {
        this.f3458b = j2;
    }

    /* JADX INFO: renamed from: G */
    public final void m2249G() {
        if (this.f3472p == 0) {
            m2259v(this, InterfaceC0848l.f3448a);
            this.f3474r = false;
        }
        this.f3472p++;
    }

    /* JADX INFO: renamed from: H */
    public String mo2225H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3459c != -1) {
            sb.append("dur(");
            sb.append(this.f3459c);
            sb.append(") ");
        }
        if (this.f3458b != -1) {
            sb.append("dly(");
            sb.append(this.f3458b);
            sb.append(") ");
        }
        if (this.f3460d != null) {
            sb.append("interp(");
            sb.append(this.f3460d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3461e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3462f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m2250a(InterfaceC0847k interfaceC0847k) {
        if (this.f3476t == null) {
            this.f3476t = new ArrayList();
        }
        this.f3476t.add(interfaceC0847k);
    }

    /* JADX INFO: renamed from: c */
    public void mo2227c() {
        ArrayList arrayList = this.f3470n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3471o);
        this.f3471o = f3453w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f3471o = animatorArr;
        m2259v(this, InterfaceC0848l.f3450c);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2228d(C0857u c0857u);

    /* JADX INFO: renamed from: e */
    public final void m2251e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0857u c0857u = new C0857u(view);
            if (z2) {
                mo2230g(c0857u);
            } else {
                mo2228d(c0857u);
            }
            c0857u.f3491c.add(this);
            mo2229f(c0857u);
            if (z2) {
                m2246b(this.f3463g, view, c0857u);
            } else {
                m2246b(this.f3464h, view, c0857u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m2251e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2230g(C0857u c0857u);

    /* JADX INFO: renamed from: h */
    public final void m2252h(FrameLayout frameLayout, boolean z2) {
        m2253i(z2);
        ArrayList arrayList = this.f3461e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3462f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2251e(frameLayout, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = frameLayout.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                C0857u c0857u = new C0857u(viewFindViewById);
                if (z2) {
                    mo2230g(c0857u);
                } else {
                    mo2228d(c0857u);
                }
                c0857u.f3491c.add(this);
                mo2229f(c0857u);
                if (z2) {
                    m2246b(this.f3463g, viewFindViewById, c0857u);
                } else {
                    m2246b(this.f3464h, viewFindViewById, c0857u);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            C0857u c0857u2 = new C0857u(view);
            if (z2) {
                mo2230g(c0857u2);
            } else {
                mo2228d(c0857u2);
            }
            c0857u2.f3491c.add(this);
            mo2229f(c0857u2);
            if (z2) {
                m2246b(this.f3463g, view, c0857u2);
            } else {
                m2246b(this.f3464h, view, c0857u2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2253i(boolean z2) {
        if (z2) {
            ((C1027f) this.f3463g.f22a).clear();
            ((SparseArray) this.f3463g.f23b).clear();
            ((C1029h) this.f3463g.f24c).m2476b();
        } else {
            ((C1027f) this.f3464h.f22a).clear();
            ((SparseArray) this.f3464h.f23b).clear();
            ((C1029h) this.f3464h.f24c).m2476b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC0849m clone() {
        try {
            AbstractC0849m abstractC0849m = (AbstractC0849m) super.clone();
            abstractC0849m.f3477u = new ArrayList();
            abstractC0849m.f3463g = new C0010k(5);
            abstractC0849m.f3464h = new C0010k(5);
            abstractC0849m.f3467k = null;
            abstractC0849m.f3468l = null;
            abstractC0849m.f3475s = this;
            abstractC0849m.f3476t = null;
            return abstractC0849m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo2238k(FrameLayout frameLayout, C0857u c0857u, C0857u c0857u2) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo2232l(FrameLayout frameLayout, C0010k c0010k, C0010k c0010k2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        C0857u c0857u;
        Animator animator;
        C0857u c0857u2;
        C1027f c1027fM2247p = m2247p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2256o().getClass();
        int i4 = 0;
        while (i4 < size) {
            C0857u c0857u3 = (C0857u) arrayList.get(i4);
            C0857u c0857u4 = (C0857u) arrayList2.get(i4);
            if (c0857u3 != null && !c0857u3.f3491c.contains(this)) {
                c0857u3 = null;
            }
            if (c0857u4 != null && !c0857u4.f3491c.contains(this)) {
                c0857u4 = null;
            }
            if ((c0857u3 != null || c0857u4 != null) && (c0857u3 == null || c0857u4 == null || mo2244s(c0857u3, c0857u4))) {
                Animator animatorMo2238k = mo2238k(frameLayout, c0857u3, c0857u4);
                if (animatorMo2238k != null) {
                    String str = this.f3457a;
                    if (c0857u4 != null) {
                        String[] strArrMo2239q = mo2239q();
                        view = c0857u4.f3490b;
                        if (strArrMo2239q != null && strArrMo2239q.length > 0) {
                            c0857u2 = new C0857u(view);
                            C0857u c0857u5 = (C0857u) ((C1027f) c0010k2.f22a).get(view);
                            i2 = size;
                            if (c0857u5 != null) {
                                int i5 = 0;
                                while (i5 < strArrMo2239q.length) {
                                    HashMap map = c0857u2.f3489a;
                                    int i6 = i4;
                                    String str2 = strArrMo2239q[i5];
                                    map.put(str2, c0857u5.f3489a.get(str2));
                                    i5++;
                                    i4 = i6;
                                }
                            }
                            i3 = i4;
                            int i7 = c1027fM2247p.f4104c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = animatorMo2238k;
                                    break;
                                }
                                C0846j c0846j = (C0846j) c1027fM2247p.get((Animator) c1027fM2247p.m2490f(i8));
                                if (c0846j.f3444c != null && c0846j.f3442a == view && c0846j.f3443b.equals(str) && c0846j.f3444c.equals(c0857u2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator = animatorMo2238k;
                            c0857u2 = null;
                        }
                        animatorMo2238k = animator;
                        c0857u = c0857u2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = c0857u3.f3490b;
                        c0857u = null;
                    }
                    if (animatorMo2238k != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0846j c0846j2 = new C0846j();
                        c0846j2.f3442a = view;
                        c0846j2.f3443b = str;
                        c0846j2.f3444c = c0857u;
                        c0846j2.f3445d = windowId;
                        c0846j2.f3446e = this;
                        c0846j2.f3447f = animatorMo2238k;
                        c1027fM2247p.put(animatorMo2238k, c0846j2);
                        this.f3477u.add(animatorMo2238k);
                    }
                }
                i4 = i3 + 1;
                size = i2;
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                C0846j c0846j3 = (C0846j) c1027fM2247p.get((Animator) this.f3477u.get(sparseIntArray.keyAt(i9)));
                c0846j3.f3447f.setStartDelay(c0846j3.f3447f.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2254m() {
        int i2 = this.f3472p - 1;
        this.f3472p = i2;
        if (i2 == 0) {
            m2259v(this, InterfaceC0848l.f3449b);
            for (int i3 = 0; i3 < ((C1029h) this.f3463g.f24c).m2482h(); i3++) {
                View view = (View) ((C1029h) this.f3463g.f24c).m2483i(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C1029h) this.f3464h.f24c).m2482h(); i4++) {
                View view2 = (View) ((C1029h) this.f3464h.f24c).m2483i(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3474r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f3468l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f3467k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p073k0.C0857u) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0857u m2255n(View view, boolean z2) {
        C0837a c0837a = this.f3465i;
        if (c0837a != null) {
            return c0837a.m2255n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3467k : this.f3468l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            C0857u c0857u = (C0857u) arrayList.get(i2);
            if (c0857u == null) {
                return null;
            }
            if (c0857u.f3490b == view) {
                break;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0849m m2256o() {
        C0837a c0837a = this.f3465i;
        return c0837a != null ? c0837a.m2256o() : this;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo2239q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0857u m2257r(View view, boolean z2) {
        C0837a c0837a = this.f3465i;
        if (c0837a != null) {
            return c0837a.m2257r(view, z2);
        }
        return (C0857u) ((C1027f) (z2 ? this.f3463g : this.f3464h).f22a).get(view);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo2244s(C0857u c0857u, C0857u c0857u2) {
        if (c0857u != null && c0857u2 != null) {
            String[] strArrMo2239q = mo2239q();
            if (strArrMo2239q != null) {
                for (String str : strArrMo2239q) {
                    if (m2248u(c0857u, c0857u2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c0857u.f3489a.keySet().iterator();
                while (it.hasNext()) {
                    if (m2248u(c0857u, c0857u2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2258t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3461e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3462f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2225H("");
    }

    /* JADX INFO: renamed from: v */
    public final void m2259v(AbstractC0849m abstractC0849m, InterfaceC0848l interfaceC0848l) {
        AbstractC0849m abstractC0849m2 = this.f3475s;
        if (abstractC0849m2 != null) {
            abstractC0849m2.m2259v(abstractC0849m, interfaceC0848l);
        }
        ArrayList arrayList = this.f3476t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3476t.size();
        InterfaceC0847k[] interfaceC0847kArr = this.f3469m;
        if (interfaceC0847kArr == null) {
            interfaceC0847kArr = new InterfaceC0847k[size];
        }
        this.f3469m = null;
        InterfaceC0847k[] interfaceC0847kArr2 = (InterfaceC0847k[]) this.f3476t.toArray(interfaceC0847kArr);
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC0848l.mo630a(interfaceC0847kArr2[i2], abstractC0849m);
            interfaceC0847kArr2[i2] = null;
        }
        this.f3469m = interfaceC0847kArr2;
    }

    /* JADX INFO: renamed from: w */
    public void mo2233w(ViewGroup viewGroup) {
        if (this.f3474r) {
            return;
        }
        ArrayList arrayList = this.f3470n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3471o);
        this.f3471o = f3453w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f3471o = animatorArr;
        m2259v(this, InterfaceC0848l.f3451d);
        this.f3473q = true;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0849m mo2234x(InterfaceC0847k interfaceC0847k) {
        AbstractC0849m abstractC0849m;
        ArrayList arrayList = this.f3476t;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC0847k) && (abstractC0849m = this.f3475s) != null) {
                abstractC0849m.mo2234x(interfaceC0847k);
            }
            if (this.f3476t.size() == 0) {
                this.f3476t = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void mo2235y(FrameLayout frameLayout) {
        if (this.f3473q) {
            if (!this.f3474r) {
                ArrayList arrayList = this.f3470n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3471o);
                this.f3471o = f3453w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f3471o = animatorArr;
                m2259v(this, InterfaceC0848l.f3452e);
            }
            this.f3473q = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo2236z() {
        m2249G();
        C1027f c1027fM2247p = m2247p();
        for (Animator animator : this.f3477u) {
            if (c1027fM2247p.containsKey(animator)) {
                m2249G();
                if (animator != null) {
                    animator.addListener(new C0257e0(this, c1027fM2247p));
                    long j2 = this.f3459c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3458b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f3460d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0161c(3, this));
                    animator.start();
                }
            }
        }
        this.f3477u.clear();
        m2254m();
    }

    /* JADX INFO: renamed from: B */
    public void mo2220B(AbstractC0383m abstractC0383m) {
    }

    /* JADX INFO: renamed from: f */
    public void mo2229f(C0857u c0857u) {
    }

    /* JADX INFO: renamed from: E */
    public void mo2223E() {
    }
}
