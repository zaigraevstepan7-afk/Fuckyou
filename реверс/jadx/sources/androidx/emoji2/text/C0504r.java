package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: renamed from: androidx.emoji2.text.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0504r {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1547a;

    /* JADX INFO: renamed from: b */
    public C0507u f1548b;

    public C0504r(int i2) {
        this.f1547a = new SparseArray(i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1315a(C0507u c0507u, int i2, int i3) {
        int iM1321a = c0507u.m1321a(i2);
        SparseArray sparseArray = this.f1547a;
        C0504r c0504r = sparseArray == null ? null : (C0504r) sparseArray.get(iM1321a);
        if (c0504r == null) {
            c0504r = new C0504r(1);
            sparseArray.put(c0507u.m1321a(i2), c0504r);
        }
        if (i3 > i2) {
            c0504r.m1315a(c0507u, i2 + 1, i3);
        } else {
            c0504r.f1548b = c0507u;
        }
    }
}
