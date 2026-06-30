package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 implements g70 {
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ List h;
    public final /* synthetic */ fy0 i;
    public final /* synthetic */ fy0 j;
    public final /* synthetic */ fy0 k;
    public final /* synthetic */ fy0 l;

    public qq0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, fy0 fy0Var, fy0 fy0Var2, fy0 fy0Var3, fy0 fy0Var4) {
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = arrayList4;
        this.i = fy0Var;
        this.j = fy0Var2;
        this.k = fy0Var3;
        this.l = fy0Var4;
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        yh0 yh0Var = (yh0) obj;
        boolean z = yh0Var instanceof oa1;
        List list = this.g;
        List list2 = this.f;
        List list3 = this.h;
        List list4 = this.e;
        if (z) {
            if (list4 != null) {
                list4.add(yh0Var);
            }
        } else if (yh0Var instanceof pa1) {
            if (list4 != null) {
                list4.remove(((pa1) yh0Var).a);
            }
        } else if (yh0Var instanceof na1) {
            if (list4 != null) {
                list4.remove(((na1) yh0Var).a);
            }
        } else if (yh0Var instanceof c80) {
            if (list2 != null) {
                list2.add(yh0Var);
            }
        } else if (yh0Var instanceof d80) {
            if (list2 != null) {
                list2.remove(((d80) yh0Var).a);
            }
        } else if (yh0Var instanceof ce0) {
            if (list != null) {
                list.add(yh0Var);
            }
        } else if (yh0Var instanceof de0) {
            if (list != null) {
                list.remove(((de0) yh0Var).a);
            }
        } else if (yh0Var instanceof b10) {
            if (list3 != null) {
                list3.add(yh0Var);
            }
        } else if (yh0Var instanceof c10) {
            if (list3 != null) {
                list3.remove(((c10) yh0Var).a);
            }
        } else if ((yh0Var instanceof a10) && list3 != null) {
            list3.remove(((a10) yh0Var).a);
        }
        fy0 fy0Var = this.i;
        if (fy0Var != null && list4 != null) {
            fy0Var.setValue(Boolean.valueOf(!list4.isEmpty()));
        }
        fy0 fy0Var2 = this.j;
        if (fy0Var2 != null && list2 != null) {
            fy0Var2.setValue(Boolean.valueOf(!list2.isEmpty()));
        }
        fy0 fy0Var3 = this.k;
        if (fy0Var3 != null && list != null) {
            fy0Var3.setValue(Boolean.valueOf(!list.isEmpty()));
        }
        fy0 fy0Var4 = this.l;
        if (fy0Var4 != null && list3 != null) {
            fy0Var4.setValue(Boolean.valueOf(!list3.isEmpty()));
        }
        return t32.a;
    }
}
