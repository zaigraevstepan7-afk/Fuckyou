package p066g0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0733V {

    /* JADX INFO: renamed from: a */
    public int f2897a;

    /* JADX INFO: renamed from: b */
    public int f2898b;

    /* JADX INFO: renamed from: c */
    public int f2899c;

    /* JADX INFO: renamed from: d */
    public int f2900d;

    /* JADX INFO: renamed from: e */
    public Interpolator f2901e;

    /* JADX INFO: renamed from: f */
    public boolean f2902f;

    /* JADX INFO: renamed from: g */
    public int f2903g;

    /* JADX INFO: renamed from: a */
    public final void m2033a(RecyclerView recyclerView) {
        int i2 = this.f2900d;
        if (i2 >= 0) {
            this.f2900d = -1;
            recyclerView.m1609Q(i2);
            this.f2902f = false;
            return;
        }
        if (!this.f2902f) {
            this.f2903g = 0;
            return;
        }
        Interpolator interpolator = this.f2901e;
        if (interpolator != null && this.f2899c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i3 = this.f2899c;
        if (i3 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1961b0.m2038c(this.f2897a, this.f2898b, i3, interpolator);
        int i4 = this.f2903g + 1;
        this.f2903g = i4;
        if (i4 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2902f = false;
    }
}
