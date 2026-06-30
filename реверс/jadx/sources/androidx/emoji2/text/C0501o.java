package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p044X.C0406a;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0501o {

    /* JADX INFO: renamed from: a */
    public int f1532a = 1;

    /* JADX INFO: renamed from: b */
    public final C0504r f1533b;

    /* JADX INFO: renamed from: c */
    public C0504r f1534c;

    /* JADX INFO: renamed from: d */
    public C0504r f1535d;

    /* JADX INFO: renamed from: e */
    public int f1536e;

    /* JADX INFO: renamed from: f */
    public int f1537f;

    public C0501o(C0504r c0504r) {
        this.f1533b = c0504r;
        this.f1534c = c0504r;
    }

    /* JADX INFO: renamed from: a */
    public final void m1310a() {
        this.f1532a = 1;
        this.f1534c = this.f1533b;
        this.f1537f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1311b() {
        C0406a c0406aM1322b = this.f1534c.f1548b.m1322b();
        int iM694a = c0406aM1322b.m694a(6);
        return !(iM694a == 0 || ((ByteBuffer) c0406aM1322b.f768d).get(iM694a + c0406aM1322b.f765a) == 0) || this.f1536e == 65039;
    }
}
