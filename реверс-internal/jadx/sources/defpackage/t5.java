package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends ne1 implements wa0 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, ks ksVar, int i) {
        super(ksVar);
        this.g = i;
        this.j = obj;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.g;
        t32 t32Var = t32.a;
        ev1 ev1Var = (ev1) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
            case 0:
                return ((t5) o(ksVar, ev1Var)).q(t32Var);
            case 1:
                return ((t5) o(ksVar, ev1Var)).q(t32Var);
            default:
                ((t5) o(ksVar, ev1Var)).q(t32Var);
                return wt.e;
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.g;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                t5 t5Var = new t5((v5) obj2, ksVar, 0);
                t5Var.i = obj;
                return t5Var;
            case 1:
                t5 t5Var2 = new t5((sa0) obj2, ksVar, 1);
                t5Var2.i = obj;
                return t5Var2;
            default:
                t5 t5Var3 = new t5((qs) obj2, ksVar, 2);
                t5Var3.i = obj;
                return t5Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:45:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5.q(java.lang.Object):java.lang.Object");
    }
}
