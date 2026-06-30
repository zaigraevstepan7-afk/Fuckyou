package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x42 implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ x42(int i) {
        this.e = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        switch (this.e) {
            case 0:
                za zaVar = (za) obj;
                return new io1((((long) Float.floatToRawIntBits(zaVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(zaVar.a)) << 32));
            case 1:
                w01 w01Var = (w01) obj;
                return new za(Float.intBitsToFloat((int) (w01Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & w01Var.a)));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                za zaVar2 = (za) obj;
                return new w01((((long) Float.floatToRawIntBits(zaVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(zaVar2.a)) << 32));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                long j = ((oh0) obj).a;
                return new za((int) (j >> 32), (int) (4294967295L & j));
            case t91.LONG_FIELD_NUMBER /* 4 */:
                za zaVar3 = (za) obj;
                return new oh0((((long) Math.round(zaVar3.b)) & 4294967295L) | (((long) Math.round(zaVar3.a)) << 32));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                long j2 = ((vh0) obj).a;
                return new za((int) (j2 >> 32), (int) (4294967295L & j2));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                za zaVar4 = (za) obj;
                int iRound = Math.round(zaVar4.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(zaVar4.b);
                return new vh0((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                pc1 pc1Var = (pc1) obj;
                return new bb(pc1Var.a, pc1Var.b, pc1Var.c, pc1Var.d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                bb bbVar = (bb) obj;
                return new pc1(bbVar.a, bbVar.b, bbVar.c, bbVar.d);
            case el.a /* 9 */:
                return Float.valueOf(((ya) obj).a);
            case el.b /* 10 */:
                float fFloatValue = ((Float) obj).floatValue();
                return Float.valueOf((fFloatValue <= 0.1f || fFloatValue >= 0.95f) ? 0.0f : 1.0f);
            default:
                c92 c92Var = (c92) obj;
                c92Var.getClass();
                return c92Var;
        }
    }
}
