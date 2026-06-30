package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p90 p90Var = (p90) obj;
                if (p90Var == null) {
                    p90Var = new p90(-3);
                }
                ((xg0) this.b).B(p90Var);
                return;
            default:
                p90 p90Var2 = (p90) obj;
                synchronized (q90.c) {
                    try {
                        zn1 zn1Var = q90.d;
                        ArrayList arrayList = (ArrayList) zn1Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        zn1Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((o90) arrayList.get(i)).a(p90Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
