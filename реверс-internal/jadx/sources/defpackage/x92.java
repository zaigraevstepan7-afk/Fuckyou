package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x92 implements ap0, fb0 {
    public final /* synthetic */ op e;

    public x92(op opVar) {
        this.e = opVar;
    }

    @Override // defpackage.fb0
    public final eb0 b() {
        return new hb0(1, this.e, op.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ap0) && (obj instanceof fb0)) {
            return b().equals(((fb0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
