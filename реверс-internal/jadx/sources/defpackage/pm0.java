package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ pm0(g6 g6Var, int i) {
        this.a = i;
        this.b = g6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        g6 g6Var = this.b;
        switch (i) {
        }
        return el.s(Integer.valueOf(g6Var.b(((qn0) obj2).g)), Integer.valueOf(g6Var.b(((qn0) obj).g)));
    }
}
