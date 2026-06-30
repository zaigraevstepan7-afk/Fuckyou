package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qs1 extends p0 implements f70, ib0, os1, dy0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(qs1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long k = yi.a.objectFieldOffset(qs1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public qs1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.p0
    public final q0 b() {
        return new rs1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006d, code lost:
    
        if (r15 != r2) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:38:0x0089], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:36:0x0083], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:46:0x00a4], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:58:0x00e6, B:59:0x00e7], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b3 -> B:28:0x006d). Please report as a decompilation issue!!! */
    @Override // defpackage.f70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g70 g70Var, ks ksVar) {
        ps1 ps1Var;
        rs1 rs1Var;
        g70 g70Var2;
        oj0 oj0Var;
        Object obj;
        Object andSet;
        Object obj2;
        Object obj3;
        if (ksVar instanceof ps1) {
            ps1Var = (ps1) ksVar;
            int i = ps1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ps1Var.o = i - Integer.MIN_VALUE;
            } else {
                ps1Var = new ps1(this, ksVar);
            }
        }
        Object obj4 = ps1Var.m;
        int i2 = ps1Var.o;
        wt wtVar = wt.e;
        try {
            if (i2 == 0) {
                xc.G(obj4);
                rs1Var = (rs1) a();
            } else if (i2 == 1) {
                rs1Var = ps1Var.i;
                g70Var = ps1Var.h;
                xc.G(obj4);
            } else if (i2 == 2) {
                obj = ps1Var.l;
                oj0Var = ps1Var.j;
                rs1Var = ps1Var.i;
                g70Var2 = ps1Var.h;
                xc.G(obj4);
                AtomicReference atomicReference = rs1Var.a;
                s30 s30Var = c2.I;
                andSet = atomicReference.getAndSet(s30Var);
                andSet.getClass();
                if (andSet == c2.J) {
                }
                obj2 = j.get(this);
                if (oj0Var != null) {
                }
                if (obj != null) {
                }
                if (obj2 != c2.t) {
                }
                ps1Var.h = g70Var2;
                ps1Var.i = rs1Var;
                ps1Var.j = oj0Var;
                ps1Var.k = null;
                ps1Var.l = obj2;
                ps1Var.o = 2;
                if (g70Var2.l(obj3, ps1Var) != wtVar) {
                }
            } else {
                if (i2 != 3) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = ps1Var.k;
                oj0Var = ps1Var.j;
                rs1Var = ps1Var.i;
                g70Var2 = ps1Var.h;
                xc.G(obj4);
                obj2 = j.get(this);
                if (oj0Var != null && !oj0Var.b()) {
                    throw oj0Var.p();
                }
                if (obj != null || !obj.equals(obj2)) {
                    obj3 = obj2 != c2.t ? null : obj2;
                    ps1Var.h = g70Var2;
                    ps1Var.i = rs1Var;
                    ps1Var.j = oj0Var;
                    ps1Var.k = null;
                    ps1Var.l = obj2;
                    ps1Var.o = 2;
                    if (g70Var2.l(obj3, ps1Var) != wtVar) {
                        return wtVar;
                    }
                    obj = obj2;
                }
                AtomicReference atomicReference2 = rs1Var.a;
                s30 s30Var2 = c2.I;
                andSet = atomicReference2.getAndSet(s30Var2);
                andSet.getClass();
                if (andSet == c2.J) {
                    ps1Var.h = g70Var2;
                    ps1Var.i = rs1Var;
                    ps1Var.j = oj0Var;
                    ps1Var.k = obj;
                    ps1Var.l = null;
                    ps1Var.o = 3;
                    t32 t32Var = t32.a;
                    xi xiVar = new xi(1, bl.E(ps1Var));
                    xiVar.v();
                    AtomicReference atomicReference3 = rs1Var.a;
                    while (true) {
                        if (atomicReference3.compareAndSet(s30Var2, xiVar)) {
                            break;
                        }
                        if (atomicReference3.get() != s30Var2) {
                            xiVar.g(t32Var);
                            break;
                        }
                    }
                    Object objT = xiVar.t();
                    if (objT == wtVar) {
                    }
                    if (objT != wtVar) {
                    }
                    return wtVar;
                }
                obj2 = j.get(this);
                if (oj0Var != null) {
                    throw oj0Var.p();
                }
                if (obj != null) {
                }
                if (obj2 != c2.t) {
                }
                ps1Var.h = g70Var2;
                ps1Var.i = rs1Var;
                ps1Var.j = oj0Var;
                ps1Var.k = null;
                ps1Var.l = obj2;
                ps1Var.o = 2;
                if (g70Var2.l(obj3, ps1Var) != wtVar) {
                }
            }
            lt ltVar = ps1Var.f;
            ltVar.getClass();
            g70Var2 = g70Var;
            oj0Var = (oj0) ltVar.l(v20.O);
            obj = null;
            obj2 = j.get(this);
            if (oj0Var != null) {
            }
            if (obj != null) {
            }
            if (obj2 != c2.t) {
            }
            ps1Var.h = g70Var2;
            ps1Var.i = rs1Var;
            ps1Var.j = oj0Var;
            ps1Var.k = null;
            ps1Var.l = obj2;
            ps1Var.o = 2;
            if (g70Var2.l(obj3, ps1Var) != wtVar) {
            }
        } catch (Throwable th) {
            f(rs1Var);
            throw th;
        }
    }

    @Override // defpackage.p0
    public final q0[] d() {
        return new rs1[2];
    }

    @Override // defpackage.ib0
    public final f70 e(lt ltVar, int i, ph phVar) {
        return ((((i < 0 || i >= 2) && i != -2) || phVar != ph.f) && !((i == 0 || i == -3) && phVar == ph.e)) ? new rj(this, ltVar, i, phVar) : this;
    }

    @Override // defpackage.os1
    public final Object getValue() {
        s30 s30Var = c2.t;
        j.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, k);
        if (objectVolatile == s30Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean h(Object obj, Object obj2) {
        s30 s30Var = c2.t;
        if (obj == null) {
            obj = s30Var;
        }
        if (obj2 == null) {
            obj2 = s30Var;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = c2.t;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        q0[] q0VarArr;
        s30 s30Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !xi0.o(obj3, obj)) {
                return false;
            }
            if (xi0.o(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.i = i3;
            q0[] q0VarArr2 = this.e;
            while (true) {
                rs1[] rs1VarArr = (rs1[]) q0VarArr2;
                if (rs1VarArr != null) {
                    for (rs1 rs1Var : rs1VarArr) {
                        if (rs1Var != null) {
                            AtomicReference atomicReference = rs1Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (s30Var = c2.J)) {
                                    s30 s30Var2 = c2.I;
                                    if (obj4 != s30Var2) {
                                        while (!atomicReference.compareAndSet(obj4, s30Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((xi) obj4).g(t32.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, s30Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return true;
                    }
                    q0VarArr = this.e;
                }
                q0VarArr2 = q0VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        j(obj);
        return t32.a;
    }
}
