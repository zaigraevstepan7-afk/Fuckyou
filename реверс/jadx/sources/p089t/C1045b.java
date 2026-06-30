package p089t;

import androidx.fragment.app.AbstractC0529T;
import java.util.ArrayList;
import p024N.C0270l;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public class C1045b {

    /* JADX INFO: renamed from: d */
    public final C1044a f4151d;

    /* JADX INFO: renamed from: a */
    public C1049f f4148a = null;

    /* JADX INFO: renamed from: b */
    public float f4149b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4150c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f4152e = false;

    public C1045b(C0270l c0270l) {
        this.f4151d = new C1044a(this, c0270l);
    }

    /* JADX INFO: renamed from: a */
    public final void m2514a(C1046c c1046c, int i2) {
        this.f4151d.m2512g(c1046c.m2533j(i2), 1.0f);
        this.f4151d.m2512g(c1046c.m2533j(i2), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2515b(C1049f c1049f, C1049f c1049f2, C1049f c1049f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f4149b = i2;
        }
        if (z2) {
            this.f4151d.m2512g(c1049f, 1.0f);
            this.f4151d.m2512g(c1049f2, -1.0f);
            this.f4151d.m2512g(c1049f3, -1.0f);
        } else {
            this.f4151d.m2512g(c1049f, -1.0f);
            this.f4151d.m2512g(c1049f2, 1.0f);
            this.f4151d.m2512g(c1049f3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2516c(C1049f c1049f, C1049f c1049f2, C1049f c1049f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f4149b = i2;
        }
        if (z2) {
            this.f4151d.m2512g(c1049f, 1.0f);
            this.f4151d.m2512g(c1049f2, -1.0f);
            this.f4151d.m2512g(c1049f3, 1.0f);
        } else {
            this.f4151d.m2512g(c1049f, -1.0f);
            this.f4151d.m2512g(c1049f2, 1.0f);
            this.f4151d.m2512g(c1049f3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public C1049f mo2517d(boolean[] zArr) {
        return m2519f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2518e() {
        return this.f4148a == null && this.f4149b == 0.0f && this.f4151d.m2509d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C1049f m2519f(boolean[] zArr, C1049f c1049f) {
        int i2;
        int iM2509d = this.f4151d.m2509d();
        C1049f c1049f2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < iM2509d; i3++) {
            float fM2511f = this.f4151d.m2511f(i3);
            if (fM2511f < 0.0f) {
                C1049f c1049fM2510e = this.f4151d.m2510e(i3);
                if ((zArr == null || !zArr[c1049fM2510e.f4175b]) && c1049fM2510e != c1049f && (((i2 = c1049fM2510e.f4185l) == 3 || i2 == 4) && fM2511f < f)) {
                    f = fM2511f;
                    c1049f2 = c1049fM2510e;
                }
            }
        }
        return c1049f2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2520g(C1049f c1049f) {
        C1049f c1049f2 = this.f4148a;
        if (c1049f2 != null) {
            this.f4151d.m2512g(c1049f2, -1.0f);
            this.f4148a.f4176c = -1;
            this.f4148a = null;
        }
        float fM2513h = this.f4151d.m2513h(c1049f, true) * (-1.0f);
        this.f4148a = c1049f;
        if (fM2513h == 1.0f) {
            return;
        }
        this.f4149b /= fM2513h;
        C1044a c1044a = this.f4151d;
        int i2 = c1044a.f4145h;
        for (int i3 = 0; i2 != -1 && i3 < c1044a.f4138a; i3++) {
            float[] fArr = c1044a.f4144g;
            fArr[i2] = fArr[i2] / fM2513h;
            i2 = c1044a.f4143f[i2];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2521h(C1046c c1046c, C1049f c1049f, boolean z2) {
        if (c1049f == null || !c1049f.f4179f) {
            return;
        }
        float fM2508c = this.f4151d.m2508c(c1049f);
        this.f4149b = (c1049f.f4178e * fM2508c) + this.f4149b;
        this.f4151d.m2513h(c1049f, z2);
        if (z2) {
            c1049f.m2547b(this);
        }
        if (this.f4151d.m2509d() == 0) {
            this.f4152e = true;
            c1046c.f4155b = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2522i(C1046c c1046c, C1045b c1045b, boolean z2) {
        C1044a c1044a = this.f4151d;
        c1044a.getClass();
        float fM2508c = c1044a.m2508c(c1045b.f4148a);
        c1044a.m2513h(c1045b.f4148a, z2);
        C1044a c1044a2 = c1045b.f4151d;
        int iM2509d = c1044a2.m2509d();
        for (int i2 = 0; i2 < iM2509d; i2++) {
            C1049f c1049fM2510e = c1044a2.m2510e(i2);
            c1044a.m2506a(c1049fM2510e, c1044a2.m2508c(c1049fM2510e) * fM2508c, z2);
        }
        this.f4149b = (c1045b.f4149b * fM2508c) + this.f4149b;
        if (z2) {
            c1045b.f4148a.m2547b(this);
        }
        if (this.f4148a == null || this.f4151d.m2509d() != 0) {
            return;
        }
        this.f4152e = true;
        c1046c.f4155b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String strM1417f = AbstractC0529T.m1417f(this.f4148a == null ? "0" : "" + this.f4148a, " = ");
        if (this.f4149b != 0.0f) {
            strM1417f = strM1417f + this.f4149b;
            z2 = true;
        } else {
            z2 = false;
        }
        int iM2509d = this.f4151d.m2509d();
        for (int i2 = 0; i2 < iM2509d; i2++) {
            C1049f c1049fM2510e = this.f4151d.m2510e(i2);
            if (c1049fM2510e != null) {
                float fM2511f = this.f4151d.m2511f(i2);
                if (fM2511f != 0.0f) {
                    String string = c1049fM2510e.toString();
                    if (!z2) {
                        if (fM2511f < 0.0f) {
                            strM1417f = AbstractC0529T.m1417f(strM1417f, "- ");
                            fM2511f *= -1.0f;
                        }
                        strM1417f = fM2511f == 1.0f ? AbstractC0529T.m1417f(strM1417f, string) : strM1417f + fM2511f + " " + string;
                        z2 = true;
                    } else if (fM2511f > 0.0f) {
                        strM1417f = AbstractC0529T.m1417f(strM1417f, " + ");
                        if (fM2511f == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        strM1417f = AbstractC0529T.m1417f(strM1417f, " - ");
                        fM2511f *= -1.0f;
                        if (fM2511f == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0529T.m1417f(strM1417f, "0.0") : strM1417f;
    }
}
