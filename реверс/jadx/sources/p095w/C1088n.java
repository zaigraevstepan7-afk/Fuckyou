package p095w;

import androidx.fragment.app.AbstractC0529T;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p015I0.C0109e;
import p089t.C1046c;
import p093v.AbstractC1069j;
import p093v.C1063d;
import p093v.C1064e;

/* JADX INFO: renamed from: w.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1088n {

    /* JADX INFO: renamed from: f */
    public static int f4473f;

    /* JADX INFO: renamed from: a */
    public ArrayList f4474a;

    /* JADX INFO: renamed from: b */
    public int f4475b;

    /* JADX INFO: renamed from: c */
    public int f4476c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4477d;

    /* JADX INFO: renamed from: e */
    public int f4478e;

    /* JADX INFO: renamed from: a */
    public final void m2684a(ArrayList arrayList) {
        int size = this.f4474a.size();
        if (this.f4478e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C1088n c1088n = (C1088n) arrayList.get(i2);
                if (this.f4478e == c1088n.f4475b) {
                    m2686c(this.f4476c, c1088n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2685b(C1046c c1046c, int i2) {
        int iM2523n;
        int iM2523n2;
        ArrayList arrayList = this.f4474a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1064e c1064e = (C1064e) ((C1063d) arrayList.get(0)).f4292T;
        c1046c.m2542t();
        c1064e.mo2574b(c1046c, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((C1063d) arrayList.get(i3)).mo2574b(c1046c, false);
        }
        if (i2 == 0 && c1064e.f4362z0 > 0) {
            AbstractC1069j.m2646a(c1064e, c1046c, arrayList, 0);
        }
        if (i2 == 1 && c1064e.f4341A0 > 0) {
            AbstractC1069j.m2646a(c1064e, c1046c, arrayList, 1);
        }
        try {
            c1046c.m2538p();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4477d = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C1063d c1063d = (C1063d) arrayList.get(i4);
            C0109e c0109e = new C0109e(27);
            new WeakReference(c1063d);
            C1046c.m2523n(c1063d.f4281I);
            C1046c.m2523n(c1063d.f4282J);
            C1046c.m2523n(c1063d.f4283K);
            C1046c.m2523n(c1063d.f4284L);
            C1046c.m2523n(c1063d.f4285M);
            this.f4477d.add(c0109e);
        }
        if (i2 == 0) {
            iM2523n = C1046c.m2523n(c1064e.f4281I);
            iM2523n2 = C1046c.m2523n(c1064e.f4283K);
            c1046c.m2542t();
        } else {
            iM2523n = C1046c.m2523n(c1064e.f4282J);
            iM2523n2 = C1046c.m2523n(c1064e.f4284L);
            c1046c.m2542t();
        }
        return iM2523n2 - iM2523n;
    }

    /* JADX INFO: renamed from: c */
    public final void m2686c(int i2, C1088n c1088n) {
        for (C1063d c1063d : this.f4474a) {
            ArrayList arrayList = c1088n.f4474a;
            if (!arrayList.contains(c1063d)) {
                arrayList.add(c1063d);
            }
            int i3 = c1088n.f4475b;
            if (i2 == 0) {
                c1063d.f4326n0 = i3;
            } else {
                c1063d.f4328o0 = i3;
            }
        }
        this.f4478e = c1088n.f4475b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f4476c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4475b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it = this.f4474a.iterator();
        while (it.hasNext()) {
            string = string + " " + ((C1063d) it.next()).f4314h0;
        }
        return AbstractC0529T.m1417f(string, " >");
    }
}
