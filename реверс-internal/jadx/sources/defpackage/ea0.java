package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends ne1 implements wa0 {
    public final /* synthetic */ int g;
    public int h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea0(Object obj, Object obj2, ks ksVar, int i) {
        super(ksVar);
        this.g = i;
        this.j = obj;
        this.k = obj2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.g;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((ea0) o((ks) obj2, (ev1) obj)).q(t32Var);
            case 1:
                return ((ea0) o((ks) obj2, (ev1) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ea0) o((ks) obj2, (lm1) obj)).q(t32Var);
            default:
                return ((ea0) o((ks) obj2, (ev1) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.g;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                ea0 ea0Var = new ea0((lt) this.j, (wa0) obj2, ksVar, 0);
                ea0Var.i = obj;
                return ea0Var;
            case 1:
                ea0 ea0Var2 = new ea0((ex1) obj2, ksVar, 1);
                ea0Var2.i = obj;
                return ea0Var2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ea0 ea0Var3 = new ea0((ha0) obj2, ksVar, 2);
                ea0Var3.j = obj;
                return ea0Var3;
            default:
                ea0 ea0Var4 = new ea0((f81) this.j, (zc1) obj2, ksVar, 3);
                ea0Var4.i = obj;
                return ea0Var4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d5 A[Catch: CancellationException -> 0x01bb, TRY_ENTER, TryCatch #1 {CancellationException -> 0x01bb, blocks: (B:100:0x01d5, B:103:0x01e3, B:90:0x01b6, B:95:0x01c3), top: B:118:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [wa0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ev1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ev1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01ec -> B:98:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x01fe -> B:98:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:34:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x010c -> B:54:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0166 -> B:71:0x016a). Please report as a decompilation issue!!! */
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
    public final java.lang.Object q(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea0.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea0(Object obj, ks ksVar, int i) {
        super(ksVar);
        this.g = i;
        this.k = obj;
    }
}
