package p075l0;

import p001A0.AbstractC0016e;
import p009F.C0079f;

/* JADX INFO: renamed from: l0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997m extends AbstractC0996l {

    /* JADX INFO: renamed from: a */
    public C0079f[] f3941a;

    /* JADX INFO: renamed from: b */
    public String f3942b;

    /* JADX INFO: renamed from: c */
    public int f3943c;

    public AbstractC0997m() {
        this.f3941a = null;
        this.f3943c = 0;
    }

    public C0079f[] getPathData() {
        return this.f3941a;
    }

    public String getPathName() {
        return this.f3942b;
    }

    public void setPathData(C0079f[] c0079fArr) {
        if (!AbstractC0016e.m176g(this.f3941a, c0079fArr)) {
            this.f3941a = AbstractC0016e.m153B(c0079fArr);
            return;
        }
        C0079f[] c0079fArr2 = this.f3941a;
        for (int i2 = 0; i2 < c0079fArr.length; i2++) {
            c0079fArr2[i2].f243a = c0079fArr[i2].f243a;
            int i3 = 0;
            while (true) {
                float[] fArr = c0079fArr[i2].f244b;
                if (i3 < fArr.length) {
                    c0079fArr2[i2].f244b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0997m(AbstractC0997m abstractC0997m) {
        this.f3941a = null;
        this.f3943c = 0;
        this.f3942b = abstractC0997m.f3942b;
        this.f3941a = AbstractC0016e.m153B(abstractC0997m.f3941a);
    }
}
