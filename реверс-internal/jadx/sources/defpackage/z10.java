package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z10 implements Comparable {
    public static final wr e = new wr(5);
    public static final long f = el.t(4611686018427387903L);
    public static final long g = el.t(-4611686018427387903L);

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jH = el.h(j, j3);
        if (-4611686018426L > jH || jH >= 4611686018427L) {
            return el.t(jH);
        }
        long j4 = ((jH * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = b20.a;
        return j4;
    }

    public static final long b(long j) {
        int i = ((int) j) & 1;
        long j2 = g;
        long j3 = f;
        if (i == 1 && j != j3 && j != j2) {
            return j >> 1;
        }
        if (j == j3) {
            return Long.MAX_VALUE;
        }
        if (j == j2) {
            return Long.MIN_VALUE;
        }
        return TimeUnit.MILLISECONDS.convert(j >> 1, (i == 0 ? c20.NANOSECONDS : c20.MILLISECONDS).e);
    }

    public static final long c(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return el.t(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = b20.a;
            return j4;
        }
        long jH = el.h(j >> 1, j2 >> 1);
        if (jH == 9223372036854759646L) {
            yc.p("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jH == 4611686018427387903L || jH == -4611686018427387903L) {
            return el.t(jH);
        }
        if (-4611686018426L > jH || jH >= 4611686018427L) {
            return el.t(lk.B(jH));
        }
        long j5 = (jH * 1000000) << 1;
        int i3 = b20.a;
        return j5;
    }
}
