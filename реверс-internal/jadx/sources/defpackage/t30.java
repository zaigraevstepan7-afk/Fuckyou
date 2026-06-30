package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t30 {
    public int a = 1;
    public final kv0 b;
    public kv0 c;
    public kv0 d;
    public int e;
    public int f;

    public t30(kv0 kv0Var) {
        this.b = kv0Var;
        this.c = kv0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        iv0 iv0VarB = this.c.b.b();
        int iA = iv0VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) iv0VarB.h).get(iA + iv0VarB.e) == 0) || this.e == 65039;
    }
}
