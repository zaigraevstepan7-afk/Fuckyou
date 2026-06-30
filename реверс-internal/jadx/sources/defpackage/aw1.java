package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class aw1 extends zv1 {
    public final Runnable g;

    public aw1(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(pv.n(runnable));
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
