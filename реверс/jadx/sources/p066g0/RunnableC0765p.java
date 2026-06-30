package p066g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p000A.C0009j;
import p016J.AbstractC0139k;

/* JADX INFO: renamed from: g0.p */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0765p implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f3084e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final C0009j f3085f = new C0009j(2);

    /* JADX INFO: renamed from: b */
    public long f3087b;

    /* JADX INFO: renamed from: c */
    public long f3088c;

    /* JADX INFO: renamed from: a */
    public final ArrayList f3086a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f3089d = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static AbstractC0741b0 m2100c(RecyclerView recyclerView, int i2, long j2) {
        int iM2070h = recyclerView.f1968f.m2070h();
        for (int i3 = 0; i3 < iM2070h; i3++) {
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(recyclerView.f1968f.m2069g(i3));
            if (abstractC0741b0M1586M.f2933c == i2 && !abstractC0741b0M1586M.m2052f()) {
                return null;
            }
        }
        C0729Q c0729q = recyclerView.f1962c;
        if (j2 == Long.MAX_VALUE) {
            try {
                if (AbstractC0139k.m545a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.m1613U(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.m1612T();
        AbstractC0741b0 abstractC0741b0M2030k = c0729q.m2030k(i2, j2);
        if (abstractC0741b0M2030k != null) {
            if (!abstractC0741b0M2030k.m2051e() || abstractC0741b0M2030k.m2052f()) {
                c0729q.m2020a(abstractC0741b0M2030k, false);
            } else {
                c0729q.m2027h(abstractC0741b0M2030k.f2931a);
            }
        }
        recyclerView.m1613U(false);
        Trace.endSection();
        return abstractC0741b0M2030k;
    }

    /* JADX INFO: renamed from: a */
    public final void m2101a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1992r) {
            if (RecyclerView.f1934z0 && !this.f3086a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3087b == 0) {
                this.f3087b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0763n c0763n = recyclerView.f1965d0;
        c0763n.f3075a = i2;
        c0763n.f3076b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2102b(long j2) {
        C0764o c0764o;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0764o c0764o2;
        ArrayList arrayList = this.f3086a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0763n c0763n = recyclerView3.f1965d0;
                c0763n.m2099b(recyclerView3, false);
                i2 += c0763n.f3078d;
            }
        }
        ArrayList arrayList2 = this.f3089d;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0763n c0763n2 = recyclerView4.f1965d0;
                int iAbs = Math.abs(c0763n2.f3076b) + Math.abs(c0763n2.f3075a);
                for (int i6 = 0; i6 < c0763n2.f3078d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c0764o2 = new C0764o();
                        arrayList2.add(c0764o2);
                    } else {
                        c0764o2 = (C0764o) arrayList2.get(i4);
                    }
                    int[] iArr = c0763n2.f3077c;
                    int i7 = iArr[i6 + 1];
                    c0764o2.f3079a = i7 <= iAbs;
                    c0764o2.f3080b = iAbs;
                    c0764o2.f3081c = i7;
                    c0764o2.f3082d = recyclerView4;
                    c0764o2.f3083e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, f3085f);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (c0764o = (C0764o) arrayList2.get(i8)).f3082d) != null; i8++) {
            AbstractC0741b0 abstractC0741b0M2100c = m2100c(recyclerView, c0764o.f3083e, c0764o.f3079a ? Long.MAX_VALUE : j2);
            if (abstractC0741b0M2100c != null && abstractC0741b0M2100c.f2932b != null && abstractC0741b0M2100c.m2051e() && !abstractC0741b0M2100c.m2052f() && (recyclerView2 = (RecyclerView) abstractC0741b0M2100c.f2932b.get()) != null) {
                if (recyclerView2.f1935A && recyclerView2.f1968f.m2070h() != 0) {
                    AbstractC0719G abstractC0719G = recyclerView2.f1944J;
                    if (abstractC0719G != null) {
                        abstractC0719G.mo1981e();
                    }
                    AbstractC0723K abstractC0723K = recyclerView2.f1982m;
                    C0729Q c0729q = recyclerView2.f1962c;
                    if (abstractC0723K != null) {
                        abstractC0723K.m2005j0(c0729q);
                        recyclerView2.f1982m.m2006k0(c0729q);
                    }
                    c0729q.f2887a.clear();
                    c0729q.m2025f();
                }
                C0763n c0763n3 = recyclerView2.f1965d0;
                c0763n3.m2099b(recyclerView2, true);
                if (c0763n3.f3078d != 0) {
                    try {
                        Trace.beginSection(j2 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C0735X c0735x = recyclerView2.f1967e0;
                        AbstractC0714B abstractC0714B = recyclerView2.f1980l;
                        c0735x.f2907d = 1;
                        c0735x.f2908e = abstractC0714B.mo985a();
                        c0735x.f2910g = false;
                        c0735x.f2911h = false;
                        c0735x.f2912i = false;
                        for (int i9 = 0; i9 < c0763n3.f3078d * 2; i9 += 2) {
                            m2100c(recyclerView2, c0763n3.f3077c[i9], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0764o.f3079a = false;
            c0764o.f3080b = 0;
            c0764o.f3081c = 0;
            c0764o.f3082d = null;
            c0764o.f3083e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3086a;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m2102b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3088c);
                }
            }
        } finally {
            this.f3087b = 0L;
            Trace.endSection();
        }
    }
}
