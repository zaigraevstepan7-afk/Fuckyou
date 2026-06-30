package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w42 extends r42 {
    public final xc0 b;
    public String c;
    public boolean d;
    public final l10 e;
    public ha0 f;
    public final v41 g;
    public wf h;
    public final v41 i;
    public long j;
    public float k;
    public float l;
    public final v42 m;

    public w42(xc0 xc0Var) {
        this.b = xc0Var;
        xc0Var.i = new v42(this, 0);
        this.c = "";
        this.d = true;
        this.e = new l10();
        this.f = zp.s;
        this.g = xc.B(null);
        this.i = xc.B(new io1(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new v42(this, 1);
    }

    @Override // defpackage.r42
    public final void a(p10 p10Var) {
        e(p10Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(p10 p10Var, float f, wl wlVar) {
        int i;
        wf wfVar;
        char c;
        long j;
        wl wlVar2;
        int i2;
        int i3;
        xc0 xc0Var = this.b;
        boolean z = xc0Var.d;
        v41 v41Var = this.g;
        if (!z || xc0Var.e == 16) {
            i = 0;
        } else {
            wl wlVar3 = (wl) v41Var.getValue();
            int i4 = a52.a;
            if (!(wlVar3 instanceof wf) ? wlVar3 == null : !((i3 = ((wf) wlVar3).c) != 5 && i3 != 3)) {
                if (!(wlVar instanceof wf) ? wlVar == null : !((i2 = ((wf) wlVar).c) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.d;
        l10 l10Var = this.e;
        if (z2 || !io1.a(this.j, p10Var.d())) {
            if (i == 1) {
                long jB = xc0Var.e;
                int i5 = a52.a;
                if (vl.d(jB) != 1.0f) {
                    jB = vl.b(1.0f, jB);
                }
                wfVar = new wf(5, jB);
            } else {
                wfVar = null;
            }
            this.h = wfVar;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (p10Var.d() >> 32));
            v41 v41Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((io1) v41Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (p10Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((io1) v41Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (p10Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (p10Var.d() & 4294967295L))))) & 4294967295L);
            al0 layoutDirection = p10Var.getLayoutDirection();
            f6 f6VarB = l10Var.a;
            n3 n3VarD = l10Var.b;
            if (f6VarB == null || n3VarD == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = f6VarB.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || l10Var.d != i) {
                }
                l10Var.c = jCeil;
                ej ejVar = l10Var.e;
                long jP = xk.P(jCeil);
                dj djVar = ejVar.e;
                hx hxVar = djVar.a;
                al0 al0Var = djVar.b;
                cj cjVar = djVar.c;
                n3 n3Var = n3VarD;
                long j2 = djVar.d;
                djVar.a = p10Var;
                djVar.b = layoutDirection;
                djVar.c = n3Var;
                djVar.d = jP;
                n3Var.l();
                p10.e0(ejVar, vl.b, 0L, 0L, 62);
                this.m.i(ejVar);
                n3Var.i();
                dj djVar2 = ejVar.e;
                djVar2.a = hxVar;
                djVar2.b = al0Var;
                djVar2.c = cjVar;
                djVar2.d = j2;
                f6VarB.a.prepareToDraw();
                this.d = false;
                this.j = p10Var.d();
            }
            f6VarB = el.b((int) (jCeil >> c), (int) (jCeil & j), i);
            n3VarD = c2.d(f6VarB);
            l10Var.a = f6VarB;
            l10Var.b = n3VarD;
            l10Var.d = i;
            l10Var.c = jCeil;
            ej ejVar2 = l10Var.e;
            long jP2 = xk.P(jCeil);
            dj djVar3 = ejVar2.e;
            hx hxVar2 = djVar3.a;
            al0 al0Var2 = djVar3.b;
            cj cjVar2 = djVar3.c;
            n3 n3Var2 = n3VarD;
            long j22 = djVar3.d;
            djVar3.a = p10Var;
            djVar3.b = layoutDirection;
            djVar3.c = n3Var2;
            djVar3.d = jP2;
            n3Var2.l();
            p10.e0(ejVar2, vl.b, 0L, 0L, 62);
            this.m.i(ejVar2);
            n3Var2.i();
            dj djVar22 = ejVar2.e;
            djVar22.a = hxVar2;
            djVar22.b = al0Var2;
            djVar22.c = cjVar2;
            djVar22.d = j22;
            f6VarB.a.prepareToDraw();
            this.d = false;
            this.j = p10Var.d();
        } else {
            f6 f6Var = l10Var.a;
            if (i != (f6Var != null ? f6Var.a() : 0)) {
            }
        }
        if (wlVar != null) {
            wlVar2 = wlVar;
        } else {
            wlVar2 = ((wl) v41Var.getValue()) != null ? (wl) v41Var.getValue() : this.h;
        }
        f6 f6Var2 = l10Var.a;
        if (f6Var2 == null) {
            ng0.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        p10.Z(p10Var, f6Var2, l10Var.c, 0L, f, wlVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        v41 v41Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((io1) v41Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((io1) v41Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
