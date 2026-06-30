package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ m7(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return xi0.t(((sa1) obj2).a, ((sa1) obj).a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return xi0.t(((hj0) obj).b, ((hj0) obj2).b);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                rh0 rh0Var = (rh0) obj;
                rh0 rh0Var2 = (rh0) obj2;
                return (rh0Var.f - rh0Var.e) - (rh0Var2.f - rh0Var2.e);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ql0 ql0Var = (ql0) obj;
                ql0 ql0Var2 = (ql0) obj2;
                float f = ql0Var.J.p.I;
                float f2 = ql0Var2.J.p.I;
                return f == f2 ? xi0.t(ql0Var.v(), ql0Var2.v()) : Float.compare(f, f2);
            default:
                return xi0.t(((qn0) obj).a, ((qn0) obj2).a);
        }
    }
}
