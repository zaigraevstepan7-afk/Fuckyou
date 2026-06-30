package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends t implements pt {
    public final /* synthetic */ rp f;
    public final /* synthetic */ md1 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ld1(rp rpVar, md1 md1Var) {
        v20 v20Var = v20.A;
        this.f = rpVar;
        this.g = md1Var;
        super(v20Var);
    }

    @Override // defpackage.pt
    public final void o(lt ltVar, Throwable th) throws Throwable {
        rp rpVar = this.f;
        md1 md1Var = this.g;
        bl.U(th, new f8(5, rpVar, md1Var));
        pt ptVar = (pt) md1Var.e.l(v20.A);
        if (ptVar == null) {
            throw th;
        }
        ptVar.o(ltVar, th);
    }
}
