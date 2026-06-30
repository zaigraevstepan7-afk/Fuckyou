package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v91 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ w91 f;

    public v91(w91 w91Var, List list) {
        this.f = w91Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            qg0.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
