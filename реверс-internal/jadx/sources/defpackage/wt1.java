package defpackage;

import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wt1(wt1 wt1Var, ux1 ux1Var) {
        this.e = 4;
        this.f = wt1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        wl wlVar = null;
        t32 t32Var = t32.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ue1 ue1Var = (ue1) obj;
                yt1 yt1VarQ0 = xt1.Q0((xt1) obj2, 4);
                ue1Var.c(yt1VarQ0.u((byte) 21) ? yt1VarQ0.H : 1.0f);
                ue1Var.k(yt1VarQ0.u((byte) 22) ? yt1VarQ0.I : 1.0f);
                ue1Var.m(yt1VarQ0.u((byte) 23) ? yt1VarQ0.J : 1.0f);
                ue1Var.t(yt1VarQ0.u((byte) 24) ? yt1VarQ0.K : 0.0f);
                ue1Var.z(yt1VarQ0.u((byte) 25) ? yt1VarQ0.L : 0.0f);
                ue1Var.h(yt1VarQ0.u((byte) 26) ? yt1VarQ0.M : 0.0f);
                ue1Var.i(yt1VarQ0.u((byte) 27) ? yt1VarQ0.N : 0.0f);
                ue1Var.j(yt1VarQ0.u((byte) 28) ? yt1VarQ0.O : 0.0f);
                if (yt1VarQ0.v(54)) {
                    wlVar = yt1VarQ0.T;
                    wlVar.getClass();
                }
                ue1Var.g(wlVar);
                long jB = u12.b;
                if (yt1VarQ0.u((byte) 29) || yt1VarQ0.u((byte) 30)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
                    if (yt1VarQ0.u((byte) 29)) {
                        fIntBitsToFloat = yt1VarQ0.P;
                    }
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
                    if (yt1VarQ0.u((byte) 30)) {
                        fIntBitsToFloat2 = yt1VarQ0.Q;
                    }
                    jB = uc1.b(fIntBitsToFloat, fIntBitsToFloat2);
                }
                ue1Var.r(jB);
                ue1Var.f(yt1VarQ0.u((byte) 31) ? yt1VarQ0.D : false);
                ym1 ym1Var = pv.w;
                if (yt1VarQ0.v(53)) {
                    ym1Var = yt1VarQ0.E;
                }
                ue1Var.o(ym1Var);
                return t32Var;
            case 1:
                va vaVar = (va) obj;
                ((o8) obj2).h(vaVar.e.getValue(), c2.P.b.i(vaVar.f));
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Drawable drawable = (Drawable) obj2;
                p10 p10Var = (p10) obj;
                cj cjVarI = p10Var.E().i();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (p10Var.d() >> 32)), (int) Float.intBitsToFloat((int) (4294967295L & p10Var.d())));
                drawable.draw(o3.a(cjVarI));
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((sa0) obj).i((iw1) obj2);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                wt1 wt1Var = (wt1) obj2;
                i22 i22Var = (i22) obj;
                if (i22Var instanceof n2) {
                    wt1Var.i(((n2) i22Var).s);
                    return Boolean.TRUE;
                }
                yc.l("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ky1 ky1Var = (ky1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                r41 r41Var = ky1Var.a;
                float fG = r41Var.g() + fFloatValue;
                r41 r41Var2 = ky1Var.b;
                if (fG > r41Var2.g()) {
                    fFloatValue = r41Var2.g() - r41Var.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -r41Var.g();
                }
                r41Var.h(r41Var.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                am1 am1Var = (am1) obj2;
                AutofillValue autofillValue = ((y5) obj).a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    e12 e12Var = boolValueOf.booleanValue() ? e12.e : e12.f;
                    ck0[] ck0VarArr = yl1.a;
                    zl1 zl1Var = vl1.K;
                    ck0 ck0Var = yl1.a[26];
                    am1Var.a(zl1Var, e12Var);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return new j2(11, (d22) obj2);
        }
    }

    public /* synthetic */ wt1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
