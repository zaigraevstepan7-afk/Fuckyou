package p066g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: g0.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0744d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f2958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0756j f2959c;

    public /* synthetic */ RunnableC0744d(C0756j c0756j, ArrayList arrayList, int i2) {
        this.f2957a = i2;
        this.f2959c = c0756j;
        this.f2958b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2957a) {
            case 0:
                ArrayList arrayList = this.f2958b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C0756j c0756j = this.f2959c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0756j.f3020m.remove(arrayList);
                    } else {
                        C0754i c0754i = (C0754i) it.next();
                        AbstractC0741b0 abstractC0741b0 = c0754i.f2998a;
                        c0756j.getClass();
                        View view = abstractC0741b0.f2931a;
                        int i2 = c0754i.f3001d - c0754i.f2999b;
                        int i3 = c0754i.f3002e - c0754i.f3000c;
                        if (i2 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i3 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0756j.f3023p.add(abstractC0741b0);
                        viewPropertyAnimatorAnimate.setDuration(c0756j.f2853e).setListener(new C0748f(c0756j, abstractC0741b0, i2, view, i3, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f2958b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0756j c0756j2 = this.f2959c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0756j2.f3021n.remove(arrayList2);
                        break;
                    } else {
                        C0752h c0752h = (C0752h) it2.next();
                        c0756j2.getClass();
                        AbstractC0741b0 abstractC0741b02 = c0752h.f2988a;
                        View view2 = abstractC0741b02 == null ? null : abstractC0741b02.f2931a;
                        AbstractC0741b0 abstractC0741b03 = c0752h.f2989b;
                        View view3 = abstractC0741b03 != null ? abstractC0741b03.f2931a : null;
                        ArrayList arrayList3 = c0756j2.f3025r;
                        long j2 = c0756j2.f2854f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0752h.f2988a);
                            duration.translationX(c0752h.f2992e - c0752h.f2990c);
                            duration.translationY(c0752h.f2993f - c0752h.f2991d);
                            duration.alpha(0.0f).setListener(new C0750g(c0756j2, c0752h, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0752h.f2989b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0750g(c0756j2, c0752h, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f2958b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C0756j c0756j3 = this.f2959c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0756j3.f3019l.remove(arrayList4);
                    } else {
                        AbstractC0741b0 abstractC0741b04 = (AbstractC0741b0) it3.next();
                        c0756j3.getClass();
                        View view4 = abstractC0741b04.f2931a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0756j3.f3022o.add(abstractC0741b04);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0756j3.f2851c).setListener(new C0746e(c0756j3, abstractC0741b04, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
