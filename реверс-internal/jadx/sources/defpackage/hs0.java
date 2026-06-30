package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(hs0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = yi.a.objectFieldOffset(hs0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(hs0.class, "_state$volatile");
    public static final s30 g = new s30("REMOVE_FROZEN", 1);

    public hs0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            yc.l("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        yc.l("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                hs0 hs0Var = this;
                if (f.compareAndSet(hs0Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    hs0 hs0VarD = hs0Var;
                    while ((atomicLongFieldUpdater.get(hs0VarD) & 1152921504606846976L) != 0) {
                        hs0VarD = hs0VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = hs0VarD.d;
                        int i4 = hs0VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof gs0) && ((gs0) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            hs0VarD = null;
                        }
                        if (hs0VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = hs0Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final hs0 b(long j) {
        hs0 hs0Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = yi.a;
            long j2 = h;
            hs0 hs0Var2 = (hs0) unsafe.getObjectVolatile(this, j2);
            if (hs0Var2 != null) {
                return hs0Var2;
            }
            hs0 hs0Var3 = new hs0(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object gs0Var = this.d.get(i4);
                if (gs0Var == null) {
                    gs0Var = new gs0(i);
                }
                hs0Var3.d.set(hs0Var3.c & i, gs0Var);
                i++;
            }
            f.set(hs0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = yi.a;
                hs0Var = this;
                if (!unsafe2.compareAndSwapObject(hs0Var, h, (Object) null, hs0Var3) && unsafe2.getObjectVolatile(hs0Var, j2) == null) {
                    this = hs0Var;
                }
            }
            this = hs0Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            hs0 hs0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(hs0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = hs0Var;
        }
    }

    public final hs0 d() {
        long j;
        hs0 hs0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                hs0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            hs0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(hs0Var, j, j2)) {
                j = j2;
                break;
            }
            this = hs0Var;
        }
        return hs0Var.b(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e() {
        hs0 hs0VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(hs0VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = hs0VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = hs0VarD.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = hs0VarD.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof gs0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(hs0VarD, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                hs0VarD = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(hs0VarD);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            hs0VarD = hs0VarD.d();
                        } else {
                            hs0 hs0Var = hs0VarD;
                            if (f.compareAndSet(hs0Var, j3, (j3 & (-1073741824)) | j2)) {
                                hs0Var.d.set(i4 & hs0Var.c, null);
                                hs0VarD = null;
                            } else {
                                hs0VarD = hs0Var;
                            }
                        }
                        if (hs0VarD == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
