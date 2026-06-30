package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p000A.C0010k;
import p044X.C0406a;
import p044X.C0407b;

/* JADX INFO: renamed from: androidx.emoji2.text.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0507u {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1553d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f1554a;

    /* JADX INFO: renamed from: b */
    public final C0010k f1555b;

    /* JADX INFO: renamed from: c */
    public volatile int f1556c = 0;

    public C0507u(C0010k c0010k, int i2) {
        this.f1555b = c0010k;
        this.f1554a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m1321a(int i2) {
        C0406a c0406aM1322b = m1322b();
        int iM694a = c0406aM1322b.m694a(16);
        if (iM694a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0406aM1322b.f768d;
        int i3 = iM694a + c0406aM1322b.f765a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0406a m1322b() {
        ThreadLocal threadLocal = f1553d;
        C0406a c0406a = (C0406a) threadLocal.get();
        if (c0406a == null) {
            c0406a = new C0406a();
            threadLocal.set(c0406a);
        }
        C0407b c0407b = (C0407b) this.f1555b.f22a;
        int iM694a = c0407b.m694a(6);
        if (iM694a != 0) {
            int i2 = iM694a + c0407b.f765a;
            int i3 = (this.f1554a * 4) + ((ByteBuffer) c0407b.f768d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0407b.f768d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0407b.f768d;
            c0406a.f768d = byteBuffer;
            if (byteBuffer != null) {
                c0406a.f765a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0406a.f766b = i5;
                c0406a.f767c = ((ByteBuffer) c0406a.f768d).getShort(i5);
                return c0406a;
            }
            c0406a.f765a = 0;
            c0406a.f766b = 0;
            c0406a.f767c = 0;
        }
        return c0406a;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0406a c0406aM1322b = m1322b();
        int iM694a = c0406aM1322b.m694a(4);
        sb.append(Integer.toHexString(iM694a != 0 ? ((ByteBuffer) c0406aM1322b.f768d).getInt(iM694a + c0406aM1322b.f765a) : 0));
        sb.append(", codepoints:");
        C0406a c0406aM1322b2 = m1322b();
        int iM694a2 = c0406aM1322b2.m694a(16);
        if (iM694a2 != 0) {
            int i3 = iM694a2 + c0406aM1322b2.f765a;
            i2 = ((ByteBuffer) c0406aM1322b2.f768d).getInt(((ByteBuffer) c0406aM1322b2.f768d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(m1321a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
