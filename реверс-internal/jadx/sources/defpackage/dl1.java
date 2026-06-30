package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends ne1 implements wa0 {
    public final /* synthetic */ int g = 0;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl1(long j, yc1 yc1Var, ks ksVar) {
        super(ksVar);
        this.h = j;
        this.k = yc1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.g;
        t32 t32Var = t32.a;
        ev1 ev1Var = (ev1) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((dl1) o(ksVar, ev1Var)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.g;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                dl1 dl1Var = new dl1(this.h, (yc1) obj2, ksVar);
                dl1Var.j = obj;
                return dl1Var;
            default:
                dl1 dl1Var2 = new dl1((l81) obj2, ksVar);
                dl1Var2.j = obj;
                return dl1Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.g
            java.lang.Object r1 = r9.k
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            wt r4 = defpackage.wt.e
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.i
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.h
            java.lang.Object r2 = r9.j
            ev1 r2 = (defpackage.ev1) r2
            defpackage.xc.G(r10)
            goto L47
        L1d:
            defpackage.yc.l(r3)
            goto L50
        L21:
            defpackage.xc.G(r10)
            java.lang.Object r10 = r9.j
            ev1 r10 = (defpackage.ev1) r10
            l81 r1 = (defpackage.l81) r1
            long r0 = r1.b
            j62 r2 = r10.f()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.j = r2
            r9.h = r0
            r9.i = r5
            r10 = 3
            java.lang.Object r10 = defpackage.xv1.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            l81 r10 = (defpackage.l81) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            yc1 r1 = (defpackage.yc1) r1
            int r0 = r9.i
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.j
            ev1 r9 = (defpackage.ev1) r9
            defpackage.xc.G(r10)
            goto L84
        L61:
            defpackage.yc.l(r3)
            goto Lb6
        L65:
            defpackage.xc.G(r10)
            java.lang.Object r10 = r9.j
            ev1 r10 = (defpackage.ev1) r10
            long r2 = r9.h
            ud r0 = new ud
            r6 = 16
            r0.<init>(r6, r1)
            r9.j = r10
            r9.i = r5
            java.lang.Object r9 = defpackage.s00.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            l81 r10 = (defpackage.l81) r10
            if (r10 == 0) goto L9c
            long r0 = r1.e
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            kz r2 = defpackage.kz.f
            goto Lb6
        L9c:
            fv1 r9 = r9.j
            e81 r9 = r9.w
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.pl.c0(r9)
            l81 r9 = (defpackage.l81) r9
            boolean r10 = defpackage.lk.t(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            kz r2 = defpackage.kz.e
            goto Lb6
        Lb4:
            kz r2 = defpackage.kz.h
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl1(l81 l81Var, ks ksVar) {
        super(ksVar);
        this.k = l81Var;
    }
}
