package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ro {
    public final pe a = new pe(this);
    public final oe b;
    public ha0 c;

    public ro(re reVar) {
        this.b = new oe(this, reVar);
    }

    public final void a(boolean z) {
        pe peVar = this.a;
        peVar.b = z;
        ArrayList arrayList = peVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i11 i11Var = (i11) obj;
            i11Var.g(i11Var.e && z);
        }
        this.b.g(z);
    }
}
