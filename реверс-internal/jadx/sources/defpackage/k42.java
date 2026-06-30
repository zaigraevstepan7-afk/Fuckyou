package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k42 {
    public static final ya f = new ya(0.0f);
    public final e52 a;
    public long b = Long.MIN_VALUE;
    public ya c = f;
    public boolean d;
    public float e;

    public k42(wa waVar) {
        this.a = waVar.a(c2.P);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (defpackage.al.z(r0).c(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
      0x007e: PHI (r0v16 sa0) = (r0v9 sa0), (r0v17 sa0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r2v5 ha0) = (r2v3 ha0), (r2v6 ha0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r3v4 j42) = (r3v2 j42), (r3v5 j42) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r3
      0x00b0: PHI (r0v12 sa0) = (r0v16 sa0), (r0v17 sa0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r2v4 ha0) = (r2v5 ha0), (r2v6 ha0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r3v3 j42) = (r3v4 j42), (r3v5 j42) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d8, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kf kfVar, ke keVar, ls lsVar) {
        j42 j42Var;
        float f2;
        j42 j42Var2;
        sa0 sa0Var;
        ha0 ha0Var;
        if (lsVar instanceof j42) {
            j42Var = (j42) lsVar;
            int i = j42Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j42Var.m = i - Integer.MIN_VALUE;
            } else {
                j42Var = new j42(this, lsVar);
            }
        }
        Object obj = j42Var.k;
        int i2 = j42Var.m;
        ya yaVar = f;
        wt wtVar = wt.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ha0Var = (ha0) j42Var.h;
                    xc.G(obj);
                    ha0Var.a();
                    this.b = Long.MIN_VALUE;
                    this.c = yaVar;
                    this.d = false;
                    return t32.a;
                }
                float f3 = j42Var.j;
                ha0 ha0Var2 = j42Var.i;
                sa0 sa0Var2 = (sa0) j42Var.h;
                xc.G(obj);
                j42Var2 = j42Var;
                ha0Var = ha0Var2;
                f2 = f3;
                sa0Var = sa0Var2;
                ha0Var.a();
                if (f2 != 0.0f) {
                    if (Math.abs(this.e) == 0.0f) {
                        d dVar = new d(27, this, sa0Var);
                        j42Var2.h = ha0Var;
                        j42Var2.i = null;
                        j42Var2.m = 2;
                        lt ltVar = j42Var2.f;
                        ltVar.getClass();
                    }
                } else if (Math.abs(this.e) < 0.01f) {
                    h5 h5Var = new h5(this, f2, sa0Var);
                    j42Var2.h = sa0Var;
                    j42Var2.i = ha0Var;
                    j42Var2.j = f2;
                    j42Var2.m = 1;
                    lt ltVar2 = j42Var2.f;
                    ltVar2.getClass();
                    if (al.z(ltVar2).c(h5Var, j42Var2) == wtVar) {
                        return wtVar;
                    }
                    ha0Var.a();
                    if (f2 != 0.0f) {
                    }
                } else if (Math.abs(this.e) == 0.0f) {
                }
                this.b = Long.MIN_VALUE;
                this.c = yaVar;
                this.d = false;
                return t32.a;
            }
            xc.G(obj);
            if (this.d) {
                qg0.c("animateToZero called while previous animation is running");
            }
            lt ltVar3 = j42Var.f;
            ltVar3.getClass();
            aw0 aw0Var = (aw0) ltVar3.l(v20.Q);
            float fV = aw0Var != null ? aw0Var.v() : 1.0f;
            this.d = true;
            f2 = fV;
            j42Var2 = j42Var;
            sa0Var = kfVar;
            ha0Var = keVar;
            if (Math.abs(this.e) < 0.01f) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = yaVar;
            this.d = false;
            throw th;
        }
    }
}
