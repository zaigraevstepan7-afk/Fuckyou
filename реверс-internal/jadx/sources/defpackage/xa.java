package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xa implements ns1 {
    public final r22 e;
    public final v41 f;
    public cb g;
    public long h;
    public long i;
    public boolean j;

    public xa(r22 r22Var, Object obj, cb cbVar, long j, long j2, boolean z) {
        cb cbVarV;
        this.e = r22Var;
        this.f = xc.B(obj);
        if (cbVar != null) {
            cbVarV = xi0.v(cbVar);
        } else {
            cbVarV = (cb) r22Var.a.i(obj);
            cbVarV.d();
        }
        this.g = cbVarV;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return this.f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f.getValue() + ", velocity=" + this.e.b.i(this.g) + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ")";
    }

    public /* synthetic */ xa(r22 r22Var, Object obj, cb cbVar, int i) {
        this(r22Var, obj, (i & 4) != 0 ? null : cbVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
