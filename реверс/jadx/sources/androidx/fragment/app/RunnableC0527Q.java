package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.Q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0527Q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0528S f1665b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0539i f1666c;

    public /* synthetic */ RunnableC0527Q(C0539i c0539i, C0528S c0528s, int i2) {
        this.f1664a = i2;
        this.f1666c = c0539i;
        this.f1665b = c0528s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1664a) {
            case 0:
                ArrayList arrayList = this.f1666c.f1724b;
                C0528S c0528s = this.f1665b;
                if (arrayList.contains(c0528s)) {
                    AbstractC0529T.m1412a(c0528s.f1669c.f1763E, c0528s.f1667a);
                }
                break;
            default:
                C0539i c0539i = this.f1666c;
                ArrayList arrayList2 = c0539i.f1724b;
                C0528S c0528s2 = this.f1665b;
                arrayList2.remove(c0528s2);
                c0539i.f1725c.remove(c0528s2);
                break;
        }
    }
}
