package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 implements if0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(uj0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(uj0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final e01 e;

    static {
        Unsafe unsafe = yi.a;
        j = unsafe.objectFieldOffset(uj0.class.getDeclaredField("_rootCause$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(uj0.class, Object.class, "_exceptionsHolder$volatile");
        i = unsafe.objectFieldOffset(uj0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public uj0(e01 e01Var, Throwable th) {
        this.e = e01Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thE = e();
        if (thE == null) {
            i(th);
            return;
        }
        if (th == thE) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            h(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                yc.g(objC, "State is ");
                return;
            }
        }
        if (th == objC) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objC);
        arrayList.add(th);
        h(arrayList);
    }

    @Override // defpackage.if0
    public final boolean b() {
        return e() == null;
    }

    public final Object c() {
        h.getClass();
        return yi.a.getObjectVolatile(this, i);
    }

    @Override // defpackage.if0
    public final e01 d() {
        return this.e;
    }

    public final Throwable e() {
        g.getClass();
        return (Throwable) yi.a.getObjectVolatile(this, j);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object objC = c();
        if (objC == null) {
            arrayList = new ArrayList(4);
        } else if (objC instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objC);
            arrayList = arrayList2;
        } else {
            if (!(objC instanceof ArrayList)) {
                yc.g(objC, "State is ");
                return null;
            }
            arrayList = (ArrayList) objC;
        }
        Throwable thE = e();
        if (thE != null) {
            arrayList.add(0, thE);
        }
        if (th != null && !th.equals(thE)) {
            arrayList.add(th);
        }
        h(s22.m);
        return arrayList;
    }

    public final void h(Object obj) {
        h.getClass();
        yi.a.putObjectVolatile(this, i, obj);
    }

    public final void i(Throwable th) {
        g.getClass();
        yi.a.putObjectVolatile(this, j, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(f.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }
}
