package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 extends ne1 implements wa0 {
    public long[] g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yp1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(yp1 yp1Var, ks ksVar) {
        super(ksVar);
        this.l = yp1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((xp1) o((ks) obj2, (lm1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        xp1 xp1Var = new xp1(this.l, ksVar);
        xp1Var.k = obj;
        return xp1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        lm1 lm1Var;
        long[] jArr;
        int length;
        int i;
        lm1 lm1Var2;
        int i2;
        lm1 lm1Var3;
        int i3;
        yp1 yp1Var = this.l;
        long j = yp1Var.e;
        long j2 = yp1Var.g;
        long j3 = yp1Var.f;
        int i4 = this.j;
        wt wtVar = wt.e;
        if (i4 == 0) {
            xc.G(obj);
            lm1Var = (lm1) this.k;
            jArr = yp1Var.h;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                lm1Var2 = lm1Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return t32.a;
        }
        if (i4 == 1) {
            length = this.i;
            int i5 = this.h;
            jArr = this.g;
            lm1Var = (lm1) this.k;
            xc.G(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.h;
                lm1Var3 = (lm1) this.k;
                xc.G(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + 64);
                        this.k = lm1Var3;
                        this.g = null;
                        this.h = i3;
                        this.j = 3;
                        lm1Var3.b(l, this);
                        return wtVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return t32.a;
            }
            i2 = this.h;
            lm1Var2 = (lm1) this.k;
            xc.G(obj);
            i2++;
            if (i2 >= 64) {
                lm1Var = lm1Var2;
                if (j != 0) {
                    lm1Var3 = lm1Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return t32.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.k = lm1Var2;
                this.g = null;
                this.h = i2;
                this.j = 2;
                lm1Var2.b(l2, this);
                return wtVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.k = lm1Var;
            this.g = jArr;
            this.h = i;
            this.i = length;
            this.j = 1;
            lm1Var.b(l3, this);
            return wtVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return t32.a;
    }
}
