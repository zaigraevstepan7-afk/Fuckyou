package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(fy fyVar, int i) {
        super(1);
        this.f = i;
        this.g = fyVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        fy fyVar = this.g;
        switch (i) {
            case 0:
                fyVar.show();
                return new j2(1, fyVar);
            default:
                if (fyVar.j.a) {
                    fyVar.i.a();
                }
                return t32.a;
        }
    }
}
