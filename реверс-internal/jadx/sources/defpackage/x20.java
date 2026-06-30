package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x20 {
    public final zb a;
    public int b;
    public int c;
    public int d;
    public int e;

    public x20(hb hbVar, long j) {
        String str = hbVar.f;
        zb zbVar = new zb();
        zbVar.d = str;
        zbVar.b = -1;
        zbVar.c = -1;
        this.a = zbVar;
        this.b = wz1.f(j);
        this.c = wz1.e(j);
        this.d = -1;
        this.e = -1;
        int iF = wz1.f(j);
        int iE = wz1.e(j);
        if (iF < 0 || iF > str.length()) {
            yc.o(s91.j("start (", iF, ") offset is outside of text region ", str.length()));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            yc.o(s91.j("end (", iE, ") offset is outside of text region ", str.length()));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        yc.p(s91.j("Do not set reversed range: ", iF, " > ", iE));
        throw null;
    }

    public final void a(int i, int i2) {
        long jG = af1.g(i, i2);
        this.a.m(i, i2, "");
        long jV = bl.V(af1.g(this.b, this.c), jG);
        h(wz1.f(jV));
        g(wz1.e(jV));
        int i3 = this.d;
        if (i3 != -1) {
            long jV2 = bl.V(af1.g(i3, this.e), jG);
            if (wz1.c(jV2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = wz1.f(jV2);
                this.e = wz1.e(jV2);
            }
        }
    }

    public final char b(int i) {
        zb zbVar = this.a;
        ll llVar = (ll) zbVar.e;
        if (llVar == null) {
            return ((String) zbVar.d).charAt(i);
        }
        if (i < zbVar.b) {
            return ((String) zbVar.d).charAt(i);
        }
        int iB = llVar.b - llVar.b();
        int i2 = zbVar.b;
        if (i >= iB + i2) {
            return ((String) zbVar.d).charAt(i - ((iB - zbVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = llVar.c;
        char[] cArr = (char[]) llVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + llVar.d];
    }

    public final wz1 c() {
        int i = this.d;
        if (i != -1) {
            return new wz1(af1.g(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        zb zbVar = this.a;
        if (i < 0 || i > zbVar.c()) {
            yc.o(s91.j("start (", i, ") offset is outside of text region ", zbVar.c()));
            return;
        }
        if (i2 < 0 || i2 > zbVar.c()) {
            yc.o(s91.j("end (", i2, ") offset is outside of text region ", zbVar.c()));
            return;
        }
        if (i > i2) {
            yc.p(s91.j("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        zbVar.m(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        zb zbVar = this.a;
        if (i < 0 || i > zbVar.c()) {
            yc.o(s91.j("start (", i, ") offset is outside of text region ", zbVar.c()));
            return;
        }
        if (i2 < 0 || i2 > zbVar.c()) {
            yc.o(s91.j("end (", i2, ") offset is outside of text region ", zbVar.c()));
        } else if (i >= i2) {
            yc.p(s91.j("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        zb zbVar = this.a;
        if (i < 0 || i > zbVar.c()) {
            yc.o(s91.j("start (", i, ") offset is outside of text region ", zbVar.c()));
            return;
        }
        if (i2 < 0 || i2 > zbVar.c()) {
            yc.o(s91.j("end (", i2, ") offset is outside of text region ", zbVar.c()));
        } else if (i > i2) {
            yc.p(s91.j("Do not set reversed range: ", i, " > ", i2));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            og0.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            og0.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
