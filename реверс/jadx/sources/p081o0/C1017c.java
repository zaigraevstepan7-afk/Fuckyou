package p081o0;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1017c {

    /* JADX INFO: renamed from: a */
    public long f4053a;

    /* JADX INFO: renamed from: b */
    public long f4054b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f4055c;

    /* JADX INFO: renamed from: d */
    public int f4056d;

    /* JADX INFO: renamed from: e */
    public int f4057e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m2466a() {
        TimeInterpolator timeInterpolator = this.f4055c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1015a.f4047b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017c)) {
            return false;
        }
        C1017c c1017c = (C1017c) obj;
        if (this.f4053a == c1017c.f4053a && this.f4054b == c1017c.f4054b && this.f4056d == c1017c.f4056d && this.f4057e == c1017c.f4057e) {
            return m2466a().getClass().equals(c1017c.m2466a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4053a;
        long j3 = this.f4054b;
        return ((((m2466a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f4056d) * 31) + this.f4057e;
    }

    public final String toString() {
        return "\n" + C1017c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4053a + " duration: " + this.f4054b + " interpolator: " + m2466a().getClass() + " repeatCount: " + this.f4056d + " repeatMode: " + this.f4057e + "}\n";
    }
}
