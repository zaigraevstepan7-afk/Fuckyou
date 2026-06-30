package p073k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.C0010k;
import p015I0.C0109e;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0837a extends AbstractC0849m {

    /* JADX INFO: renamed from: A */
    public ArrayList f3417A;

    /* JADX INFO: renamed from: B */
    public boolean f3418B;

    /* JADX INFO: renamed from: C */
    public int f3419C;

    /* JADX INFO: renamed from: D */
    public boolean f3420D;

    /* JADX INFO: renamed from: E */
    public int f3421E;

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: A */
    public final void mo2219A(long j2) {
        ArrayList arrayList;
        this.f3459c = j2;
        if (j2 < 0 || (arrayList = this.f3417A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2219A(j2);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: B */
    public final void mo2220B(AbstractC0383m abstractC0383m) {
        this.f3421E |= 8;
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2220B(abstractC0383m);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: C */
    public final void mo2221C(TimeInterpolator timeInterpolator) {
        this.f3421E |= 1;
        ArrayList arrayList = this.f3417A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0849m) this.f3417A.get(i2)).mo2221C(timeInterpolator);
            }
        }
        this.f3460d = timeInterpolator;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: D */
    public final void mo2222D(C0109e c0109e) {
        super.mo2222D(c0109e);
        this.f3421E |= 4;
        if (this.f3417A != null) {
            for (int i2 = 0; i2 < this.f3417A.size(); i2++) {
                ((AbstractC0849m) this.f3417A.get(i2)).mo2222D(c0109e);
            }
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: E */
    public final void mo2223E() {
        this.f3421E |= 2;
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2223E();
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: F */
    public final void mo2224F(long j2) {
        this.f3458b = j2;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: H */
    public final String mo2225H(String str) {
        String strMo2225H = super.mo2225H(str);
        for (int i2 = 0; i2 < this.f3417A.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo2225H);
            sb.append("\n");
            sb.append(((AbstractC0849m) this.f3417A.get(i2)).mo2225H(str + "  "));
            strMo2225H = sb.toString();
        }
        return strMo2225H;
    }

    /* JADX INFO: renamed from: I */
    public final void m2226I(AbstractC0849m abstractC0849m) {
        this.f3417A.add(abstractC0849m);
        abstractC0849m.f3465i = this;
        long j2 = this.f3459c;
        if (j2 >= 0) {
            abstractC0849m.mo2219A(j2);
        }
        if ((this.f3421E & 1) != 0) {
            abstractC0849m.mo2221C(this.f3460d);
        }
        if ((this.f3421E & 2) != 0) {
            abstractC0849m.mo2223E();
        }
        if ((this.f3421E & 4) != 0) {
            abstractC0849m.mo2222D(this.f3478v);
        }
        if ((this.f3421E & 8) != 0) {
            abstractC0849m.mo2220B(null);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: c */
    public final void mo2227c() {
        super.mo2227c();
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2227c();
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: d */
    public final void mo2228d(C0857u c0857u) {
        if (m2258t(c0857u.f3490b)) {
            for (AbstractC0849m abstractC0849m : this.f3417A) {
                if (abstractC0849m.m2258t(c0857u.f3490b)) {
                    abstractC0849m.mo2228d(c0857u);
                    c0857u.f3491c.add(abstractC0849m);
                }
            }
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: f */
    public final void mo2229f(C0857u c0857u) {
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2229f(c0857u);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: g */
    public final void mo2230g(C0857u c0857u) {
        if (m2258t(c0857u.f3490b)) {
            for (AbstractC0849m abstractC0849m : this.f3417A) {
                if (abstractC0849m.m2258t(c0857u.f3490b)) {
                    abstractC0849m.mo2230g(c0857u);
                    c0857u.f3491c.add(abstractC0849m);
                }
            }
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0849m clone() {
        C0837a c0837a = (C0837a) super.clone();
        c0837a.f3417A = new ArrayList();
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0849m abstractC0849mClone = ((AbstractC0849m) this.f3417A.get(i2)).clone();
            c0837a.f3417A.add(abstractC0849mClone);
            abstractC0849mClone.f3465i = c0837a;
        }
        return c0837a;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: l */
    public final void mo2232l(FrameLayout frameLayout, C0010k c0010k, C0010k c0010k2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3458b;
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0849m abstractC0849m = (AbstractC0849m) this.f3417A.get(i2);
            if (j2 > 0 && (this.f3418B || i2 == 0)) {
                long j3 = abstractC0849m.f3458b;
                if (j3 > 0) {
                    abstractC0849m.mo2224F(j3 + j2);
                } else {
                    abstractC0849m.mo2224F(j2);
                }
            }
            abstractC0849m.mo2232l(frameLayout, c0010k, c0010k2, arrayList, arrayList2);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: w */
    public final void mo2233w(ViewGroup viewGroup) {
        super.mo2233w(viewGroup);
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2233w(viewGroup);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: x */
    public final AbstractC0849m mo2234x(InterfaceC0847k interfaceC0847k) {
        super.mo2234x(interfaceC0847k);
        return this;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: y */
    public final void mo2235y(FrameLayout frameLayout) {
        super.mo2235y(frameLayout);
        int size = this.f3417A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0849m) this.f3417A.get(i2)).mo2235y(frameLayout);
        }
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: z */
    public final void mo2236z() {
        if (this.f3417A.isEmpty()) {
            m2249G();
            m2254m();
            return;
        }
        C0854r c0854r = new C0854r();
        c0854r.f3487b = this;
        Iterator it = this.f3417A.iterator();
        while (it.hasNext()) {
            ((AbstractC0849m) it.next()).m2250a(c0854r);
        }
        this.f3419C = this.f3417A.size();
        if (this.f3418B) {
            Iterator it2 = this.f3417A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0849m) it2.next()).mo2236z();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f3417A.size(); i2++) {
            ((AbstractC0849m) this.f3417A.get(i2 - 1)).m2250a(new C0854r((AbstractC0849m) this.f3417A.get(i2)));
        }
        AbstractC0849m abstractC0849m = (AbstractC0849m) this.f3417A.get(0);
        if (abstractC0849m != null) {
            abstractC0849m.mo2236z();
        }
    }
}
