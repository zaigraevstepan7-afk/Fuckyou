package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a32 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final vu b;
    public volatile int c = 0;

    public a32(vu vuVar, int i) {
        this.b = vuVar;
        this.a = i;
    }

    public final int a(int i) {
        iv0 iv0VarB = b();
        int iA = iv0VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) iv0VarB.h;
        int i2 = iA + iv0VarB.e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final iv0 b() {
        ThreadLocal threadLocal = d;
        iv0 iv0Var = (iv0) threadLocal.get();
        if (iv0Var == null) {
            iv0Var = new iv0();
            threadLocal.set(iv0Var);
        }
        jv0 jv0Var = (jv0) this.b.e;
        int iA = jv0Var.a(6);
        if (iA != 0) {
            int i = iA + jv0Var.e;
            int i2 = (this.a * 4) + ((ByteBuffer) jv0Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) jv0Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) jv0Var.h;
            iv0Var.h = byteBuffer;
            if (byteBuffer != null) {
                iv0Var.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                iv0Var.f = i4;
                iv0Var.g = ((ByteBuffer) iv0Var.h).getShort(i4);
                return iv0Var;
            }
            iv0Var.e = 0;
            iv0Var.f = 0;
            iv0Var.g = 0;
        }
        return iv0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        iv0 iv0VarB = b();
        int iA = iv0VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) iv0VarB.h).getInt(iA + iv0VarB.e) : 0));
        sb.append(", codepoints:");
        iv0 iv0VarB2 = b();
        int iA2 = iv0VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + iv0VarB2.e;
            i = ((ByteBuffer) iv0VarB2.h).getInt(((ByteBuffer) iv0VarB2.h).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
