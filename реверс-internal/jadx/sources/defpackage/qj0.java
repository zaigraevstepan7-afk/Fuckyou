package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class qj0 extends vj0 {
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(oj0 oj0Var) {
        super(true);
        boolean z = true;
        S(oj0Var);
        ek ekVarO = O();
        fk fkVar = ekVarO instanceof fk ? (fk) ekVarO : null;
        if (fkVar == null) {
            z = false;
            break;
        }
        vj0 vj0VarQ = fkVar.q();
        while (!vj0VarQ.L()) {
            ek ekVarO2 = vj0VarQ.O();
            fk fkVar2 = ekVarO2 instanceof fk ? (fk) ekVarO2 : null;
            if (fkVar2 == null) {
                z = false;
                break;
            }
            vj0VarQ = fkVar2.q();
        }
        this.i = z;
    }

    @Override // defpackage.vj0
    public final boolean L() {
        return this.i;
    }

    @Override // defpackage.vj0
    public final boolean M() {
        return true;
    }
}
