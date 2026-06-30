package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class up0 implements km1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ up0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.km1
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new tp0(this);
            case 1:
                return (Iterator) obj;
            default:
                return new sp0((String) obj);
        }
    }
}
