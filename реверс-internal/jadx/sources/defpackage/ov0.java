package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov0 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ ov0(int i, int i2, z61 z61Var) {
        this.e = 0;
        this.g = i;
        this.f = z61Var;
        this.h = i2;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.h;
        int i3 = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((y61) obj).g((z61) obj2, nu0.I((i3 - r8.e) / 2.0f), nu0.I((i2 - r8.f) / 2.0f), 0.0f);
                break;
            case 1:
                ((y61) obj).g((z61) obj2, i3, i2, 0.0f);
                break;
            default:
                w6 w6Var = (w6) obj2;
                l41 l41Var = (l41) obj;
                r6 r6Var = l41Var.a;
                int iD = l41Var.d(i3);
                int iD2 = l41Var.d(i2);
                CharSequence charSequence = r6Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbN = s91.n("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbN.append(length);
                    sbN.append("], or start > end!");
                    og0.a(sbN.toString());
                }
                Path path = new Path();
                nz1 nz1Var = r6Var.d;
                nz1Var.f.getSelectionPath(iD, iD2, path);
                int i4 = nz1Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                w6 w6Var2 = new w6(path);
                w6Var2.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(l41Var.f)) & 4294967295L));
                w6.a(w6Var, w6Var2);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ ov0(Object obj, int i, int i2, int i3) {
        this.e = i3;
        this.f = obj;
        this.g = i;
        this.h = i2;
    }
}
