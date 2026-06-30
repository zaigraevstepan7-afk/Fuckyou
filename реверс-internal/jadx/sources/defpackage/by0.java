package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class by0 extends ne1 implements wa0 {
    public yb0 g;
    public cy0 h;
    public long[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ cy0 q;
    public final /* synthetic */ yb0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(cy0 cy0Var, yb0 yb0Var, ks ksVar) {
        super(ksVar);
        this.q = cy0Var;
        this.r = yb0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((by0) o((ks) obj2, (lm1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        by0 by0Var = new by0(this.q, this.r, ksVar);
        by0Var.p = obj;
        return by0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        lm1 lm1Var;
        cy0 cy0Var;
        long[] jArr;
        int length;
        yb0 yb0Var;
        int i;
        long j;
        int i2 = this.o;
        if (i2 == 0) {
            xc.G(obj);
            lm1Var = (lm1) this.p;
            cy0Var = this.q;
            jArr = cy0Var.f.a;
            length = jArr.length - 2;
            if (length >= 0) {
                yb0Var = this.r;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.m;
        int i4 = this.l;
        long j2 = this.n;
        int i5 = this.k;
        int i6 = this.j;
        long[] jArr2 = this.i;
        cy0 cy0Var2 = this.h;
        yb0 yb0Var2 = this.g;
        lm1 lm1Var2 = (lm1) this.p;
        xc.G(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                cy0Var = cy0Var2;
                lm1Var = lm1Var2;
                i = i5;
                yb0Var = yb0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        lm1Var2 = lm1Var;
                        i3 = 0;
                        cy0Var2 = cy0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        yb0Var2 = yb0Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                yb0Var2.f = i7;
                                Object obj2 = cy0Var2.f.b[i7];
                                this.p = lm1Var2;
                                this.g = yb0Var2;
                                this.h = cy0Var2;
                                this.i = jArr2;
                                this.j = i6;
                                this.k = i5;
                                this.n = j2;
                                this.l = i4;
                                this.m = i3;
                                this.o = 1;
                                lm1Var2.b(obj2, this);
                                return wt.e;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return t32.a;
        }
    }
}
