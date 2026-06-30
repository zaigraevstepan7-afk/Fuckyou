package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements ev0 {
    public static final ub0 b = new ub0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ub0(int i) {
        this.a = i;
    }

    @Override // defpackage.ev0
    public final xb1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!xb0.class.isAssignableFrom(cls)) {
                    yc.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (xb1) xb0.d(cls.asSubclass(xb0.class)).c(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.ev0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return xb0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
