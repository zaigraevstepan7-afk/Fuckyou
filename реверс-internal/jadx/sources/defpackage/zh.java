package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zh implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mq1 f;

    public /* synthetic */ zh(mq1 mq1Var, int i) {
        this.e = i;
        this.f = mq1Var;
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        int i = this.e;
        t32 t32Var = t32.a;
        mq1 mq1Var = this.f;
        switch (i) {
            case 0:
                yh0 yh0Var = (yh0) obj;
                if (yh0Var instanceof ce0) {
                    mq1Var.add(yh0Var);
                } else if (yh0Var instanceof de0) {
                    mq1Var.remove(((de0) yh0Var).a);
                } else if (yh0Var instanceof c80) {
                    mq1Var.add(yh0Var);
                } else if (yh0Var instanceof d80) {
                    mq1Var.remove(((d80) yh0Var).a);
                } else if (yh0Var instanceof oa1) {
                    mq1Var.add(yh0Var);
                } else if (yh0Var instanceof pa1) {
                    mq1Var.remove(((pa1) yh0Var).a);
                } else if (yh0Var instanceof na1) {
                    mq1Var.remove(((na1) yh0Var).a);
                }
                break;
            default:
                yh0 yh0Var2 = (yh0) obj;
                if (yh0Var2 instanceof c80) {
                    mq1Var.add(yh0Var2);
                } else if (yh0Var2 instanceof d80) {
                    mq1Var.remove(((d80) yh0Var2).a);
                } else if (yh0Var2 instanceof oa1) {
                    mq1Var.add(yh0Var2);
                } else if (yh0Var2 instanceof pa1) {
                    mq1Var.remove(((pa1) yh0Var2).a);
                } else if (yh0Var2 instanceof na1) {
                    mq1Var.remove(((na1) yh0Var2).a);
                } else if (yh0Var2 instanceof b10) {
                    mq1Var.add(yh0Var2);
                } else if (yh0Var2 instanceof c10) {
                    mq1Var.remove(((c10) yh0Var2).a);
                } else if (yh0Var2 instanceof a10) {
                    mq1Var.remove(((a10) yh0Var2).a);
                }
                break;
        }
        return t32Var;
    }
}
