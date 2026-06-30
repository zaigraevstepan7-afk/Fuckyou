package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ej1 implements x31 {
    public final int e;
    public final List f;
    public Float g = null;
    public Float h = null;
    public wi1 i = null;
    public wi1 j = null;

    public ej1(int i, ArrayList arrayList) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.x31
    public final boolean z() {
        return this.f.contains(this);
    }
}
