package p015I0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: I0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0127w {

    /* JADX INFO: renamed from: a */
    public float f426a;

    /* JADX INFO: renamed from: b */
    public float f427b;

    /* JADX INFO: renamed from: c */
    public float f428c;

    /* JADX INFO: renamed from: d */
    public float f429d;

    /* JADX INFO: renamed from: e */
    public float f430e;

    /* JADX INFO: renamed from: f */
    public float f431f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f432g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f433h = new ArrayList();

    public C0127w() {
        m504d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m501a(float f) {
        float f2 = this.f430e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f428c;
        float f5 = this.f429d;
        C0123s c0123s = new C0123s(f4, f5, f4, f5);
        c0123s.f419f = this.f430e;
        c0123s.f420g = f3;
        this.f433h.add(new C0121q(c0123s));
        this.f430e = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m502b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f432g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0125u) arrayList.get(i2)).mo500a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m503c(float f, float f2) {
        C0124t c0124t = new C0124t();
        c0124t.f421b = f;
        c0124t.f422c = f2;
        this.f432g.add(c0124t);
        C0122r c0122r = new C0122r(c0124t, this.f428c, this.f429d);
        float fM499b = c0122r.m499b() + 270.0f;
        float fM499b2 = c0122r.m499b() + 270.0f;
        m501a(fM499b);
        this.f433h.add(c0122r);
        this.f430e = fM499b2;
        this.f428c = f;
        this.f429d = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m504d(float f, float f2, float f3, float f4) {
        this.f426a = f;
        this.f427b = f2;
        this.f428c = f;
        this.f429d = f2;
        this.f430e = f3;
        this.f431f = (f3 + f4) % 360.0f;
        this.f432g.clear();
        this.f433h.clear();
    }
}
