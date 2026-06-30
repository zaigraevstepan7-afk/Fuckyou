package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 implements id1 {
    public yh1 e;
    public jh1 f;
    public String g;
    public Object h;
    public Object[] i;
    public oc j;
    public final p7 k = new p7(15, this);

    public gh1(yh1 yh1Var, jh1 jh1Var, String str, Object obj, Object[] objArr) {
        this.e = yh1Var;
        this.f = jh1Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    public final void a() throws Throwable {
        String strK;
        jh1 jh1Var = this.f;
        oc ocVar = this.j;
        if (ocVar != null) {
            yc.f(ocVar, ") is not null", "entry(");
            return;
        }
        if (jh1Var != null) {
            p7 p7Var = this.k;
            Object objA = p7Var.a();
            if (objA == null || jh1Var.d(objA)) {
                this.j = jh1Var.a(this.g, p7Var);
                return;
            }
            if (objA instanceof fq1) {
                fq1 fq1Var = (fq1) objA;
                if (fq1Var.d() == v20.S || fq1Var.d() == l91.p || fq1Var.d() == l91.f) {
                    strK = "MutableState containing " + fq1Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strK = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strK = kd1.k(objA);
            }
            throw new IllegalArgumentException(strK);
        }
    }

    @Override // defpackage.id1
    public final void c() throws Throwable {
        a();
    }

    @Override // defpackage.id1
    public final void d() {
        oc ocVar = this.j;
        if (ocVar != null) {
            ocVar.C();
        }
    }

    @Override // defpackage.id1
    public final void e() {
        oc ocVar = this.j;
        if (ocVar != null) {
            ocVar.C();
        }
    }
}
