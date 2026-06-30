package p018K;

import java.util.ArrayList;
import p005C0.C0048n;
import p022M.InterfaceC0184a;
import p084q.C1031j;

/* JADX INFO: renamed from: K.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0151g implements InterfaceC0184a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f477b;

    public /* synthetic */ C0151g(int i2, Object obj) {
        this.f476a = i2;
        this.f477b = obj;
    }

    @Override // p022M.InterfaceC0184a
    /* JADX INFO: renamed from: a */
    public final void mo567a(Object obj) {
        switch (this.f476a) {
            case 0:
                C0152h c0152h = (C0152h) obj;
                if (c0152h == null) {
                    c0152h = new C0152h(-3);
                }
                ((C0048n) this.f477b).m288F(c0152h);
                return;
            default:
                C0152h c0152h2 = (C0152h) obj;
                synchronized (AbstractC0153i.f482c) {
                    try {
                        C1031j c1031j = AbstractC0153i.f483d;
                        ArrayList arrayList = (ArrayList) c1031j.get((String) this.f477b);
                        if (arrayList == null) {
                            return;
                        }
                        c1031j.remove((String) this.f477b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0184a) arrayList.get(i2)).mo567a(c0152h2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
