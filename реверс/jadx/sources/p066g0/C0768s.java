package p066g0;

import android.view.View;
import androidx.emoji2.text.AbstractC0493g;

/* JADX INFO: renamed from: g0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0768s {

    /* JADX INFO: renamed from: a */
    public AbstractC0493g f3101a;

    /* JADX INFO: renamed from: b */
    public int f3102b;

    /* JADX INFO: renamed from: c */
    public int f3103c;

    /* JADX INFO: renamed from: d */
    public boolean f3104d;

    /* JADX INFO: renamed from: e */
    public boolean f3105e;

    public C0768s() {
        m2106d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2103a() {
        this.f3103c = this.f3104d ? this.f3101a.mo1294g() : this.f3101a.mo1298k();
    }

    /* JADX INFO: renamed from: b */
    public final void m2104b(View view, int i2) {
        if (this.f3104d) {
            int iMo1289b = this.f3101a.mo1289b(view);
            AbstractC0493g abstractC0493g = this.f3101a;
            this.f3103c = (Integer.MIN_VALUE == abstractC0493g.f1516a ? 0 : abstractC0493g.mo1299l() - abstractC0493g.f1516a) + iMo1289b;
        } else {
            this.f3103c = this.f3101a.mo1292e(view);
        }
        this.f3102b = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m2105c(View view, int i2) {
        AbstractC0493g abstractC0493g = this.f3101a;
        int iMo1299l = Integer.MIN_VALUE == abstractC0493g.f1516a ? 0 : abstractC0493g.mo1299l() - abstractC0493g.f1516a;
        if (iMo1299l >= 0) {
            m2104b(view, i2);
            return;
        }
        this.f3102b = i2;
        if (!this.f3104d) {
            int iMo1292e = this.f3101a.mo1292e(view);
            int iMo1298k = iMo1292e - this.f3101a.mo1298k();
            this.f3103c = iMo1292e;
            if (iMo1298k > 0) {
                int iMo1294g = (this.f3101a.mo1294g() - Math.min(0, (this.f3101a.mo1294g() - iMo1299l) - this.f3101a.mo1289b(view))) - (this.f3101a.mo1290c(view) + iMo1292e);
                if (iMo1294g < 0) {
                    this.f3103c -= Math.min(iMo1298k, -iMo1294g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo1294g2 = (this.f3101a.mo1294g() - iMo1299l) - this.f3101a.mo1289b(view);
        this.f3103c = this.f3101a.mo1294g() - iMo1294g2;
        if (iMo1294g2 > 0) {
            int iMo1290c = this.f3103c - this.f3101a.mo1290c(view);
            int iMo1298k2 = this.f3101a.mo1298k();
            int iMin = iMo1290c - (Math.min(this.f3101a.mo1292e(view) - iMo1298k2, 0) + iMo1298k2);
            if (iMin < 0) {
                this.f3103c = Math.min(iMo1294g2, -iMin) + this.f3103c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2106d() {
        this.f3102b = -1;
        this.f3103c = Integer.MIN_VALUE;
        this.f3104d = false;
        this.f3105e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3102b + ", mCoordinate=" + this.f3103c + ", mLayoutFromEnd=" + this.f3104d + ", mValid=" + this.f3105e + '}';
    }
}
