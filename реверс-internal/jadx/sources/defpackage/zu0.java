package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 extends y {
    public final wr e;
    public final ArrayList f;
    public final List g;

    public zu0(wr wrVar, aq0 aq0Var, ArrayList arrayList, ex0 ex0Var) {
        if (ex0Var.b != arrayList.size() + 1) {
            yc.p("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = ex0Var.b;
        if (i == 0) {
            yc.h("FloatList is empty.");
            throw null;
        }
        float[] fArr = ex0Var.a;
        int i2 = 0;
        float fB = 0.0f;
        if (fArr[0] != 0.0f) {
            yc.p("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            yc.h("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            yc.p("Last outline progress value is expected to be one");
            throw null;
        }
        this.e = wrVar;
        this.g = aq0Var;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (ex0Var.b(i3) - ex0Var.b(i2) > 1.0E-4f) {
                arrayList2.add(new yu0(this, (fu) arrayList.get(i2), fB, ex0Var.b(i3)));
                fB = ex0Var.b(i3);
            }
            i2 = i3;
        }
        yu0 yu0Var = (yu0) arrayList2.get(arrayList2.size() - 1);
        float f = yu0Var.c;
        if (1.0f < f) {
            yc.p("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        yu0Var.c = f;
        yu0Var.d = 1.0f;
        this.f = arrayList2;
    }

    @Override // defpackage.o
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof yu0) {
            return super.contains((yu0) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (yu0) this.f.get(i);
    }

    @Override // defpackage.y, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof yu0) {
            return super.indexOf((yu0) obj);
        }
        return -1;
    }

    @Override // defpackage.y, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof yu0) {
            return super.lastIndexOf((yu0) obj);
        }
        return -1;
    }
}
