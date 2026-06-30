package p066g0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p024N.C0280q;

/* JADX INFO: renamed from: g0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0756j extends AbstractC0719G {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f3013s;

    /* JADX INFO: renamed from: g */
    public boolean f3014g;

    /* JADX INFO: renamed from: h */
    public ArrayList f3015h;

    /* JADX INFO: renamed from: i */
    public ArrayList f3016i;

    /* JADX INFO: renamed from: j */
    public ArrayList f3017j;

    /* JADX INFO: renamed from: k */
    public ArrayList f3018k;

    /* JADX INFO: renamed from: l */
    public ArrayList f3019l;

    /* JADX INFO: renamed from: m */
    public ArrayList f3020m;

    /* JADX INFO: renamed from: n */
    public ArrayList f3021n;

    /* JADX INFO: renamed from: o */
    public ArrayList f3022o;

    /* JADX INFO: renamed from: p */
    public ArrayList f3023p;

    /* JADX INFO: renamed from: q */
    public ArrayList f3024q;

    /* JADX INFO: renamed from: r */
    public ArrayList f3025r;

    /* JADX INFO: renamed from: h */
    public static void m2074h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0741b0) arrayList.get(size)).f2931a.animate().cancel();
        }
    }

    @Override // p066g0.AbstractC0719G
    /* JADX INFO: renamed from: a */
    public final boolean mo1978a(AbstractC0741b0 abstractC0741b0, AbstractC0741b0 abstractC0741b02, C0280q c0280q, C0280q c0280q2) {
        int i2;
        int i3;
        int i4 = c0280q.f857a;
        int i5 = c0280q.f858b;
        if (abstractC0741b02.m2061o()) {
            int i6 = c0280q.f857a;
            i3 = c0280q.f858b;
            i2 = i6;
        } else {
            i2 = c0280q2.f857a;
            i3 = c0280q2.f858b;
        }
        if (abstractC0741b0 == abstractC0741b02) {
            return m2075g(abstractC0741b0, i4, i5, i2, i3);
        }
        View view = abstractC0741b0.f2931a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2079l(abstractC0741b0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2079l(abstractC0741b02);
        float f = -((int) ((i2 - i4) - translationX));
        View view2 = abstractC0741b02.f2931a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i3 - i5) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3018k;
        C0752h c0752h = new C0752h();
        c0752h.f2988a = abstractC0741b0;
        c0752h.f2989b = abstractC0741b02;
        c0752h.f2990c = i4;
        c0752h.f2991d = i5;
        c0752h.f2992e = i2;
        c0752h.f2993f = i3;
        arrayList.add(c0752h);
        return true;
    }

    @Override // p066g0.AbstractC0719G
    /* JADX INFO: renamed from: d */
    public final void mo1980d(AbstractC0741b0 abstractC0741b0) {
        View view = abstractC0741b0.f2931a;
        view.animate().cancel();
        ArrayList arrayList = this.f3017j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0754i) arrayList.get(size)).f2998a == abstractC0741b0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m1979c(abstractC0741b0);
                arrayList.remove(size);
            }
        }
        m2077j(this.f3018k, abstractC0741b0);
        if (this.f3015h.remove(abstractC0741b0)) {
            view.setAlpha(1.0f);
            m1979c(abstractC0741b0);
        }
        if (this.f3016i.remove(abstractC0741b0)) {
            view.setAlpha(1.0f);
            m1979c(abstractC0741b0);
        }
        ArrayList arrayList2 = this.f3021n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2077j(arrayList3, abstractC0741b0);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3020m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0754i) arrayList5.get(size4)).f2998a == abstractC0741b0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m1979c(abstractC0741b0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3019l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0741b0)) {
                view.setAlpha(1.0f);
                m1979c(abstractC0741b0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3024q.remove(abstractC0741b0);
        this.f3022o.remove(abstractC0741b0);
        this.f3025r.remove(abstractC0741b0);
        this.f3023p.remove(abstractC0741b0);
        m2076i();
    }

    @Override // p066g0.AbstractC0719G
    /* JADX INFO: renamed from: e */
    public final void mo1981e() {
        ArrayList arrayList = this.f3017j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0754i c0754i = (C0754i) arrayList.get(size);
            View view = c0754i.f2998a.f2931a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m1979c(c0754i.f2998a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3015h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m1979c((AbstractC0741b0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3016i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList3.get(size3);
            abstractC0741b0.f2931a.setAlpha(1.0f);
            m1979c(abstractC0741b0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3018k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0752h c0752h = (C0752h) arrayList4.get(size4);
            AbstractC0741b0 abstractC0741b02 = c0752h.f2988a;
            if (abstractC0741b02 != null) {
                m2078k(c0752h, abstractC0741b02);
            }
            AbstractC0741b0 abstractC0741b03 = c0752h.f2989b;
            if (abstractC0741b03 != null) {
                m2078k(c0752h, abstractC0741b03);
            }
        }
        arrayList4.clear();
        if (mo1982f()) {
            ArrayList arrayList5 = this.f3020m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0754i c0754i2 = (C0754i) arrayList6.get(size6);
                    View view2 = c0754i2.f2998a.f2931a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m1979c(c0754i2.f2998a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3019l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0741b0 abstractC0741b04 = (AbstractC0741b0) arrayList8.get(size8);
                    abstractC0741b04.f2931a.setAlpha(1.0f);
                    m1979c(abstractC0741b04);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3021n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0752h c0752h2 = (C0752h) arrayList10.get(size10);
                    AbstractC0741b0 abstractC0741b05 = c0752h2.f2988a;
                    if (abstractC0741b05 != null) {
                        m2078k(c0752h2, abstractC0741b05);
                    }
                    AbstractC0741b0 abstractC0741b06 = c0752h2.f2989b;
                    if (abstractC0741b06 != null) {
                        m2078k(c0752h2, abstractC0741b06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2074h(this.f3024q);
            m2074h(this.f3023p);
            m2074h(this.f3022o);
            m2074h(this.f3025r);
            ArrayList arrayList11 = this.f2850b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p066g0.AbstractC0719G
    /* JADX INFO: renamed from: f */
    public final boolean mo1982f() {
        return (this.f3016i.isEmpty() && this.f3018k.isEmpty() && this.f3017j.isEmpty() && this.f3015h.isEmpty() && this.f3023p.isEmpty() && this.f3024q.isEmpty() && this.f3022o.isEmpty() && this.f3025r.isEmpty() && this.f3020m.isEmpty() && this.f3019l.isEmpty() && this.f3021n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2075g(AbstractC0741b0 abstractC0741b0, int i2, int i3, int i4, int i5) {
        View view = abstractC0741b0.f2931a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) abstractC0741b0.f2931a.getTranslationY());
        m2079l(abstractC0741b0);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m1979c(abstractC0741b0);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.f3017j;
        C0754i c0754i = new C0754i();
        c0754i.f2998a = abstractC0741b0;
        c0754i.f2999b = translationX;
        c0754i.f3000c = translationY;
        c0754i.f3001d = i4;
        c0754i.f3002e = i5;
        arrayList.add(c0754i);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2076i() {
        if (mo1982f()) {
            return;
        }
        ArrayList arrayList = this.f2850b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2077j(ArrayList arrayList, AbstractC0741b0 abstractC0741b0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0752h c0752h = (C0752h) arrayList.get(size);
            if (m2078k(c0752h, abstractC0741b0) && c0752h.f2988a == null && c0752h.f2989b == null) {
                arrayList.remove(c0752h);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2078k(C0752h c0752h, AbstractC0741b0 abstractC0741b0) {
        if (c0752h.f2989b == abstractC0741b0) {
            c0752h.f2989b = null;
        } else {
            if (c0752h.f2988a != abstractC0741b0) {
                return false;
            }
            c0752h.f2988a = null;
        }
        abstractC0741b0.f2931a.setAlpha(1.0f);
        View view = abstractC0741b0.f2931a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m1979c(abstractC0741b0);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m2079l(AbstractC0741b0 abstractC0741b0) {
        if (f3013s == null) {
            f3013s = new ValueAnimator().getInterpolator();
        }
        abstractC0741b0.f2931a.animate().setInterpolator(f3013s);
        mo1980d(abstractC0741b0);
    }
}
