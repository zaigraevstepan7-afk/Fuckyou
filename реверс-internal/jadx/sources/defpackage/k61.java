package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k61 extends o0 implements gf0 {
    public final /* synthetic */ int e;
    public final c61 f;

    public /* synthetic */ k61(c61 c61Var, int i) {
        this.e = i;
        this.f = c61Var;
    }

    @Override // defpackage.o
    public final int a() {
        int i = this.e;
        c61 c61Var = this.f;
        switch (i) {
            case 0:
                c61Var.getClass();
                break;
            default:
                c61Var.getClass();
                break;
        }
        return c61Var.f;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.e;
        c61 c61Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = c61Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c61Var.containsKey(entry.getKey());
            default:
                return c61Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                m22 m22Var = this.f.e;
                n22[] n22VarArr = new n22[8];
                for (int i = 0; i < 8; i++) {
                    n22VarArr[i] = new o22(0);
                }
                return new l61(m22Var, n22VarArr);
            default:
                m22 m22Var2 = this.f.e;
                n22[] n22VarArr2 = new n22[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    n22VarArr2[i2] = new o22(1);
                }
                return new l61(m22Var2, n22VarArr2);
        }
    }
}
