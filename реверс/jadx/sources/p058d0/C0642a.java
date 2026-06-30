package p058d0;

import androidx.lifecycle.AbstractC0565I;
import p084q.C1032k;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0642a extends AbstractC0565I {

    /* JADX INFO: renamed from: c */
    public final C1032k f2506c = new C1032k();

    @Override // androidx.lifecycle.AbstractC0565I
    /* JADX INFO: renamed from: a */
    public final void mo1384a() {
        C1032k c1032k = this.f2506c;
        int i2 = c1032k.f4107c;
        if (i2 > 0) {
            c1032k.f4106b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c1032k.f4106b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c1032k.f4107c = 0;
    }
}
