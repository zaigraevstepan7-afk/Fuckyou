package p015I0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p014H0.C0104a;

/* JADX INFO: renamed from: I0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0120p extends AbstractC0126v {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f408c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f409d;

    public C0120p(ArrayList arrayList, Matrix matrix) {
        this.f408c = arrayList;
        this.f409d = matrix;
    }

    @Override // p015I0.AbstractC0126v
    /* JADX INFO: renamed from: a */
    public final void mo498a(Matrix matrix, C0104a c0104a, int i2, Canvas canvas) {
        Iterator it = this.f408c.iterator();
        while (it.hasNext()) {
            ((AbstractC0126v) it.next()).mo498a(this.f409d, c0104a, i2, canvas);
        }
    }
}
