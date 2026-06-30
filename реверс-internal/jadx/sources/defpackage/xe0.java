package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final we0 j;
    public boolean k;

    public xe0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? vl.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        we0 we0Var = new we0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = we0Var;
        arrayList.add(we0Var);
    }

    public static void a(xe0 xe0Var, ArrayList arrayList, uq1 uq1Var) {
        if (xe0Var.k) {
            ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((we0) xe0Var.i.get(r0.size() - 1)).j.add(new d52("", arrayList, 0, uq1Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final ye0 b() {
        if (this.k) {
            ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                we0 we0Var = this.j;
                ye0 ye0Var = new ye0(this.a, this.b, this.c, this.d, this.e, new z42(we0Var.a, we0Var.b, we0Var.c, we0Var.d, we0Var.e, we0Var.f, we0Var.g, we0Var.h, we0Var.i, we0Var.j), this.f, this.g, this.h);
                this.k = true;
                return ye0Var;
            }
            if (this.k) {
                ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            we0 we0Var2 = (we0) arrayList.remove(arrayList.size() - 1);
            ((we0) arrayList.get(arrayList.size() - 1)).j.add(new z42(we0Var2.a, we0Var2.b, we0Var2.c, we0Var2.d, we0Var2.e, we0Var2.f, we0Var2.g, we0Var2.h, we0Var2.i, we0Var2.j));
        }
    }
}
