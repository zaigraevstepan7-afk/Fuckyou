package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 extends hb0 implements sa0 {
    public final /* synthetic */ eo0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(eo0 eo0Var) {
        super(1, wi0.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.l = eo0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        float[] fArr = ((ou0) obj).a;
        zk0 zk0Var = (zk0) this.l.v.getValue();
        if (zk0Var != null) {
            if (!zk0Var.B()) {
                zk0Var = null;
            }
            if (zk0Var != null) {
                zk0Var.C(fArr);
            }
        }
        return t32.a;
    }
}
