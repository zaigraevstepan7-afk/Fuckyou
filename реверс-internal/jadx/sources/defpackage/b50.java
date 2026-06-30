package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b50 extends ot {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;
    public fd i;

    public final void k(boolean z) {
        long j2 = this.g - (z ? 4294967296L : 1L);
        this.g = j2;
        if (j2 <= 0 && this.h) {
            shutdown();
        }
    }

    public final void m(oy oyVar) {
        fd fdVar = this.i;
        if (fdVar == null) {
            fdVar = new fd();
            this.i = fdVar;
        }
        fdVar.addLast(oyVar);
    }

    public final void n(boolean z) {
        this.g = (z ? 4294967296L : 1L) + this.g;
        if (z) {
            return;
        }
        this.h = true;
    }

    public abstract long r();

    public abstract void shutdown();

    public final boolean t() throws IllegalAccessException, InvocationTargetException {
        fd fdVar = this.i;
        if (fdVar == null) {
            return false;
        }
        oy oyVar = (oy) (fdVar.isEmpty() ? null : fdVar.removeFirst());
        if (oyVar == null) {
            return false;
        }
        oyVar.run();
        return true;
    }
}
