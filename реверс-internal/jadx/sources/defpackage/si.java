package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class si implements n01 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ si(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((sa0) obj).getClass().getSimpleName() + '@' + pv.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((az) obj) + ']';
        }
    }
}
