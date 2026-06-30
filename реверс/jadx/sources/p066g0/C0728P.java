package p066g0;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: g0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0728P {

    /* JADX INFO: renamed from: a */
    public SparseArray f2884a;

    /* JADX INFO: renamed from: b */
    public int f2885b;

    /* JADX INFO: renamed from: c */
    public Set f2886c;

    /* JADX INFO: renamed from: a */
    public final C0727O m2019a(int i2) {
        SparseArray sparseArray = this.f2884a;
        C0727O c0727o = (C0727O) sparseArray.get(i2);
        if (c0727o != null) {
            return c0727o;
        }
        C0727O c0727o2 = new C0727O();
        sparseArray.put(i2, c0727o2);
        return c0727o2;
    }
}
