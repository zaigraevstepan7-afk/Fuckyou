package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.res.TypedArray;
import android.util.SparseArray;
import p011G.C1123;
import p024N.C0270l;
import p086r.C1174;

/* JADX INFO: renamed from: M0.q */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0211q {

    /* JADX INFO: renamed from: a */
    public final SparseArray f681a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final C0212r f682b;

    /* JADX INFO: renamed from: c */
    public final int f683c;

    /* JADX INFO: renamed from: d */
    public final int f684d;

    static {
        ZLoader.registerNativesForClass(44, C0211q.class);
        Hidden0.special_clinit_44_00(C0211q.class);
    }

    public C0211q(C0212r c0212r, C0270l c0270l) {
        this.f682b = c0212r;
        TypedArray typedArray = (TypedArray) C1123.m2846(c0270l);
        this.f683c = C1174.m5032(typedArray, 28, 0);
        this.f684d = C1174.m5032(typedArray, 52, 0);
    }
}
