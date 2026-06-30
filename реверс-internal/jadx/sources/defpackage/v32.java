package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v32 {
    public static u32 a(Object obj) {
        xb0 xb0Var = (xb0) obj;
        u32 u32Var = xb0Var.unknownFields;
        if (u32Var != u32.f) {
            return u32Var;
        }
        u32 u32Var2 = new u32(0, new int[8], new Object[8], true);
        xb0Var.unknownFields = u32Var2;
        return u32Var2;
    }

    public static boolean b(int i, ll llVar, Object obj) throws fj0 {
        int i2 = llVar.b;
        kl klVar = (kl) llVar.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            llVar.A(0);
            ((u32) obj).c(i3 << 3, Long.valueOf(klVar.s()));
            return true;
        }
        if (i4 == 1) {
            llVar.A(1);
            ((u32) obj).c((i3 << 3) | 1, Long.valueOf(klVar.p()));
            return true;
        }
        if (i4 == 2) {
            ((u32) obj).c((i3 << 3) | 2, llVar.i());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw fj0.b();
            }
            llVar.A(5);
            ((u32) obj).c(5 | (i3 << 3), Integer.valueOf(klVar.o()));
            return true;
        }
        u32 u32Var = new u32(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new fj0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (llVar.c() != Integer.MAX_VALUE && b(i7, llVar, u32Var)) {
        }
        if (i6 != llVar.b) {
            throw new fj0("Protocol message end-group tag did not match expected tag.");
        }
        if (u32Var.e) {
            u32Var.e = false;
        }
        ((u32) obj).c(i5 | 3, u32Var);
        return true;
    }
}
