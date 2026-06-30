package p066g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: g0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0749f0 {

    /* JADX INFO: renamed from: a */
    public int f2975a;

    /* JADX INFO: renamed from: b */
    public int f2976b;

    /* JADX INFO: renamed from: c */
    public boolean f2977c;

    /* JADX INFO: renamed from: d */
    public boolean f2978d;

    /* JADX INFO: renamed from: e */
    public boolean f2979e;

    /* JADX INFO: renamed from: f */
    public int[] f2980f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f2981g;

    public C0749f0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2981g = staggeredGridLayoutManager;
        m2073a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2073a() {
        this.f2975a = -1;
        this.f2976b = Integer.MIN_VALUE;
        this.f2977c = false;
        this.f2978d = false;
        this.f2979e = false;
        int[] iArr = this.f2980f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
