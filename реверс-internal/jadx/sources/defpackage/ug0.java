package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 {
    public final /* synthetic */ int a;
    public final xd0 b;
    public final xd0 c;
    public final xd0 d;
    public final xd0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public ug0(ug0[] ug0VarArr) {
        int i = 0;
        this.a = 0;
        this.f = ug0VarArr;
        int length = ug0VarArr.length;
        xd0[] xd0VarArr = new xd0[length];
        for (int i2 = 0; i2 < length; i2++) {
            xd0VarArr[i2] = ((ug0[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new xd0(1, new y52(xd0VarArr, i));
        int length2 = ((ug0[]) this.f).length;
        xd0[] xd0VarArr2 = new xd0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            xd0VarArr2[i4] = ((ug0[]) this.f)[i4].d();
        }
        this.c = new xd0(0, new wd0(xd0VarArr2, i));
        int length3 = ((ug0[]) this.f).length;
        xd0[] xd0VarArr3 = new xd0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            xd0VarArr3[i5] = ((ug0[]) this.f)[i5].c();
        }
        this.d = new xd0(1, new y52(xd0VarArr3, i3));
        int length4 = ((ug0[]) this.f).length;
        xd0[] xd0VarArr4 = new xd0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            xd0VarArr4[i6] = ((ug0[]) this.f)[i6].a();
        }
        this.e = new xd0(0, new wd0(xd0VarArr4, i3));
    }

    public final xd0 a() {
        int i = this.a;
        return this.e;
    }

    public final xd0 b() {
        int i = this.a;
        return this.b;
    }

    public final xd0 c() {
        int i = this.a;
        return this.d;
    }

    public final xd0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return nd.X((ug0[]) obj, null, 57);
            default:
                String str = (String) obj;
                return str != null ? s91.l("RectRulers(", str, ")") : super.toString();
        }
    }

    public ug0(String str) {
        this.a = 1;
        this.f = str;
        this.b = new xd0(1, null);
        this.c = new xd0(0, null);
        this.d = new xd0(1, null);
        this.e = new xd0(0, null);
    }
}
