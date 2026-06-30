package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class fs0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(fs0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = yi.a.objectFieldOffset(fs0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new hs0(8, false);

    public final boolean a(Runnable runnable) {
        fs0 fs0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = b;
            hs0 hs0Var = (hs0) unsafe.getObjectVolatile(this, j);
            int iA = hs0Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                hs0 hs0VarD = hs0Var.d();
                while (true) {
                    Unsafe unsafe2 = yi.a;
                    fs0Var = this;
                    if (!unsafe2.compareAndSwapObject(fs0Var, b, hs0Var, hs0VarD) && unsafe2.getObjectVolatile(fs0Var, j) == hs0Var) {
                        this = fs0Var;
                    }
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                fs0Var = this;
            }
            this = fs0Var;
        }
    }

    public final void b() {
        fs0 fs0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = b;
            hs0 hs0Var = (hs0) unsafe.getObjectVolatile(this, j);
            if (hs0Var.c()) {
                return;
            }
            hs0 hs0VarD = hs0Var.d();
            while (true) {
                Unsafe unsafe2 = yi.a;
                fs0Var = this;
                if (!unsafe2.compareAndSwapObject(fs0Var, b, hs0Var, hs0VarD) && unsafe2.getObjectVolatile(fs0Var, j) == hs0Var) {
                    this = fs0Var;
                }
            }
            this = fs0Var;
        }
    }

    public final int c() {
        a.getClass();
        hs0 hs0Var = (hs0) yi.a.getObjectVolatile(this, b);
        hs0Var.getClass();
        long j = hs0.f.get(hs0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        fs0 fs0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = b;
            hs0 hs0Var = (hs0) unsafe.getObjectVolatile(this, j);
            Object objE = hs0Var.e();
            if (objE != hs0.g) {
                return objE;
            }
            hs0 hs0VarD = hs0Var.d();
            while (true) {
                Unsafe unsafe2 = yi.a;
                fs0Var = this;
                if (!unsafe2.compareAndSwapObject(fs0Var, b, hs0Var, hs0VarD) && unsafe2.getObjectVolatile(fs0Var, j) == hs0Var) {
                    this = fs0Var;
                }
            }
            this = fs0Var;
        }
    }
}
