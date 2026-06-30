package p071j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.AbstractC0016e;
import p024N.C0249a0;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0795j {

    /* JADX INFO: renamed from: c */
    public Interpolator f3226c;

    /* JADX INFO: renamed from: d */
    public AbstractC0016e f3227d;

    /* JADX INFO: renamed from: e */
    public boolean f3228e;

    /* JADX INFO: renamed from: b */
    public long f3225b = -1;

    /* JADX INFO: renamed from: f */
    public final C0794i f3229f = new C0794i(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f3224a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m2142a() {
        if (this.f3228e) {
            Iterator it = this.f3224a.iterator();
            while (it.hasNext()) {
                ((C0249a0) it.next()).m806b();
            }
            this.f3228e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2143b() {
        View view;
        if (this.f3228e) {
            return;
        }
        for (C0249a0 c0249a0 : this.f3224a) {
            long j2 = this.f3225b;
            if (j2 >= 0) {
                c0249a0.m807c(j2);
            }
            Interpolator interpolator = this.f3226c;
            if (interpolator != null && (view = (View) c0249a0.f792a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f3227d != null) {
                c0249a0.m808d(this.f3229f);
            }
            View view2 = (View) c0249a0.f792a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3228e = true;
    }
}
