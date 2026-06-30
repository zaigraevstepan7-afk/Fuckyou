package p095w;

import java.util.ArrayList;

/* JADX INFO: renamed from: w.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1086l {

    /* JADX INFO: renamed from: a */
    public AbstractC1089o f4469a;

    /* JADX INFO: renamed from: b */
    public ArrayList f4470b;

    /* JADX INFO: renamed from: a */
    public static long m2681a(C1080f c1080f, long j2) {
        AbstractC1089o abstractC1089o = c1080f.f4457d;
        if (abstractC1089o instanceof C1084j) {
            return j2;
        }
        ArrayList arrayList = c1080f.f4464k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1078d interfaceC1078d = (InterfaceC1078d) arrayList.get(i2);
            if (interfaceC1078d instanceof C1080f) {
                C1080f c1080f2 = (C1080f) interfaceC1078d;
                if (c1080f2.f4457d != abstractC1089o) {
                    jMin = Math.min(jMin, m2681a(c1080f2, ((long) c1080f2.f4459f) + j2));
                }
            }
        }
        if (c1080f != abstractC1089o.f4487i) {
            return jMin;
        }
        long jMo2654j = abstractC1089o.mo2654j();
        C1080f c1080f3 = abstractC1089o.f4486h;
        long j3 = j2 - jMo2654j;
        return Math.min(Math.min(jMin, m2681a(c1080f3, j3)), j3 - ((long) c1080f3.f4459f));
    }

    /* JADX INFO: renamed from: b */
    public static long m2682b(C1080f c1080f, long j2) {
        AbstractC1089o abstractC1089o = c1080f.f4457d;
        if (abstractC1089o instanceof C1084j) {
            return j2;
        }
        ArrayList arrayList = c1080f.f4464k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1078d interfaceC1078d = (InterfaceC1078d) arrayList.get(i2);
            if (interfaceC1078d instanceof C1080f) {
                C1080f c1080f2 = (C1080f) interfaceC1078d;
                if (c1080f2.f4457d != abstractC1089o) {
                    jMax = Math.max(jMax, m2682b(c1080f2, ((long) c1080f2.f4459f) + j2));
                }
            }
        }
        if (c1080f != abstractC1089o.f4486h) {
            return jMax;
        }
        long jMo2654j = abstractC1089o.mo2654j();
        C1080f c1080f3 = abstractC1089o.f4487i;
        long j3 = j2 + jMo2654j;
        return Math.max(Math.max(jMax, m2682b(c1080f3, j3)), j3 - ((long) c1080f3.f4459f));
    }
}
