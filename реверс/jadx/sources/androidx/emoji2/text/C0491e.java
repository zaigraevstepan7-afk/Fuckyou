package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import p000A.C0001b;
import p000A.C0010k;
import p015I0.C0109e;
import p018K.RunnableC0145a;
import p024N.C0270l;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0491e extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0492f f1512p;

    public C0491e(C0492f c0492f) {
        this.f1512p = c0492f;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: M */
    public final void mo1062M(Throwable th) {
        this.f1512p.f1513a.m1306d(th);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: P */
    public final void mo1065P(C0010k c0010k) {
        C0492f c0492f = this.f1512p;
        c0492f.f1515c = c0010k;
        C0010k c0010k2 = c0492f.f1515c;
        C0496j c0496j = c0492f.f1513a;
        C0109e c0109e = c0496j.f1527g;
        C0490d c0490d = c0496j.f1529i;
        Set<int[]> setM1309a = Build.VERSION.SDK_INT >= 34 ? AbstractC0499m.m1309a() : AbstractC0383m.m1058x();
        C0270l c0270l = new C0270l();
        c0270l.f836a = c0109e;
        c0270l.f837b = c0010k2;
        c0270l.f838c = c0490d;
        if (!setM1309a.isEmpty()) {
            for (int[] iArr : setM1309a) {
                String str = new String(iArr, 0, iArr.length);
                c0270l.m850n(str, 0, str.length(), 1, true, new C0001b(14, str));
            }
        }
        c0492f.f1514b = c0270l;
        C0496j c0496j2 = c0492f.f1513a;
        c0496j2.getClass();
        ArrayList arrayList = new ArrayList();
        c0496j2.f1521a.writeLock().lock();
        try {
            c0496j2.f1523c = 1;
            arrayList.addAll(c0496j2.f1522b);
            c0496j2.f1522b.clear();
            c0496j2.f1521a.writeLock().unlock();
            c0496j2.f1524d.post(new RunnableC0145a(arrayList, c0496j2.f1523c, (Throwable) null));
        } catch (Throwable th) {
            c0496j2.f1521a.writeLock().unlock();
            throw th;
        }
    }
}
