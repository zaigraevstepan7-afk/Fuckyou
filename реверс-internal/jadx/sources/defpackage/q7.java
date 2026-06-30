package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends sv0 implements vp, o10, xk0 {
    public yh0 D;
    public t61 G;
    public gf1 H;
    public hf1 I;
    public final jx0 s;
    public final boolean t;
    public final float u;
    public final bx v;
    public final ax w;
    public float x;
    public boolean z;
    public long y = 0;
    public final sx0 A = new sx0();
    public final h9 B = xi0.a(0.0f);
    public final ArrayList C = new ArrayList();
    public final h9 E = xi0.a(0.0f);
    public final v41 F = xc.B(Boolean.FALSE);

    public q7(jx0 jx0Var, boolean z, float f, bx bxVar, ax axVar) {
        this.s = jx0Var;
        this.t = z;
        this.u = f;
        this.v = bxVar;
        this.w = axVar;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        nu0.A(z0(), null, null, new e(this, null, 28), 3);
    }

    @Override // defpackage.sv0
    public final void E0() {
        gf1 gf1Var = this.H;
        if (gf1Var != null) {
            this.I = null;
            al.C(this);
            n81 n81Var = gf1Var.h;
            hf1 hf1Var = (hf1) ((LinkedHashMap) n81Var.b).get(this);
            if (hf1Var != null) {
                hf1Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) n81Var.b;
                hf1 hf1Var2 = (hf1) linkedHashMap.get(this);
                if (hf1Var2 != null) {
                }
                linkedHashMap.remove(this);
                gf1Var.g.add(hf1Var);
            }
        }
    }

    public final void L0(qa1 qa1Var) {
        hf1 hf1Var;
        if (!(qa1Var instanceof oa1)) {
            if (qa1Var instanceof pa1) {
                hf1 hf1Var2 = this.I;
                if (hf1Var2 != null) {
                    hf1Var2.d();
                    return;
                }
                return;
            }
            if (!(qa1Var instanceof na1) || (hf1Var = this.I) == null) {
                return;
            }
            hf1Var.d();
            return;
        }
        oa1 oa1Var = (oa1) qa1Var;
        long j = this.y;
        float f = this.x;
        gf1 gf1Var = this.H;
        int i = 0;
        if (gf1Var == null) {
            Object obj = (View) hk.o(this, w4.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    yc.f(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    gf1 gf1Var2 = new gf1(viewGroup.getContext());
                    viewGroup.addView(gf1Var2);
                    gf1Var = gf1Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof gf1) {
                        gf1Var = (gf1) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.H = gf1Var;
        }
        ArrayList arrayList = gf1Var.f;
        n81 n81Var = gf1Var.h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) n81Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) n81Var.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) n81Var.c;
        hf1 hf1Var3 = (hf1) linkedHashMap.get(this);
        if (hf1Var3 == null) {
            ArrayList arrayList2 = gf1Var.g;
            arrayList2.getClass();
            hf1Var3 = (hf1) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (hf1Var3 == null) {
                if (gf1Var.i > hk.B(arrayList)) {
                    hf1Var3 = new hf1(gf1Var.getContext());
                    gf1Var.addView(hf1Var3);
                    arrayList.add(hf1Var3);
                } else {
                    hf1Var3 = (hf1) arrayList.get(gf1Var.i);
                    q7 q7Var = (q7) linkedHashMap3.get(hf1Var3);
                    if (q7Var != null) {
                        q7Var.I = null;
                        al.C(q7Var);
                        hf1 hf1Var4 = (hf1) linkedHashMap2.get(q7Var);
                        if (hf1Var4 != null) {
                        }
                        linkedHashMap2.remove(q7Var);
                        hf1Var3.c();
                    }
                }
                int i3 = gf1Var.i;
                if (i3 < gf1Var.e - 1) {
                    gf1Var.i = i3 + 1;
                } else {
                    gf1Var.i = 0;
                }
            }
            linkedHashMap2.put(this, hf1Var3);
            linkedHashMap3.put(hf1Var3, this);
        }
        hf1 hf1Var5 = hf1Var3;
        hf1Var5.b(oa1Var, this.t, j, nu0.I(f), this.v.d(), ((uf1) this.w.a()).a instanceof tf1 ? 0.1f : 0.0f, new p7(i, this));
        this.I = hf1Var5;
        al.C(this);
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        sl0Var.a();
        ej ejVar = sl0Var.e;
        cj cjVarI = ejVar.f.i();
        hf1 hf1Var = this.I;
        if (hf1Var != null) {
            hf1Var.e(this.y, nu0.I(this.x), this.v.d(), ((uf1) this.w.a()).a instanceof tf1 ? 0.1f : 0.0f);
            hf1Var.draw(o3.a(cjVarI));
        }
        float fFloatValue = ((Number) this.B.d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = vl.b(fFloatValue, this.v.d());
            if (this.t) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ejVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ejVar.d() & 4294967295L));
                oc ocVar = ejVar.f;
                long jQ = ocVar.q();
                ocVar.i().l();
                try {
                    ((oc) ((qt0) ocVar.a).f).i().e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    p10.c0(sl0Var, jB, this.x, 0L, 124);
                } finally {
                    s91.r(ocVar, jQ);
                }
            } else {
                p10.c0(sl0Var, jB, this.x, 0L, 124);
            }
        }
        if (((Number) this.E.d()).floatValue() > 0.0f) {
            t61 t61Var = this.G;
            if (t61Var == null) {
                t61Var = new t61(14);
            }
            this.G = t61Var;
            this.w.a();
        }
    }

    @Override // defpackage.xk0, defpackage.av0
    public final void c(long j) {
        float fY;
        this.z = true;
        hx hxVar = bl.P(this).B;
        this.y = xk.P(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.y;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fY = w01.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                fY += hxVar.y(10.0f);
            }
        } else {
            fY = hxVar.y(f);
        }
        this.x = fY;
        sx0 sx0Var = this.A;
        Object[] objArr = sx0Var.a;
        int i = sx0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            L0((qa1) objArr[i2]);
        }
        sx0Var.d();
    }
}
