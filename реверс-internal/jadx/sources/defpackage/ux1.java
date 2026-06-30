package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux1 extends hb0 implements sa0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux1(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) throws Throwable {
        in inVar;
        fk0 fk0VarQ;
        Integer numValueOf;
        int i = this.l;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((gk0) obj).a;
                sx1 sx1Var = (sx1) obj2;
                vz1 vz1Var = sx1Var.f;
                boolean z = sx1Var.d;
                boolean z2 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    inVar = null;
                } else {
                    nv nvVar = sx1Var.i;
                    nvVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        nvVar.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = nvVar.a;
                        if (num != null) {
                            nvVar.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        inVar = new in(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (inVar != null) {
                    if (z) {
                        sx1Var.a(hk.G(inVar));
                        vz1Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (bl.D(keyEvent) == 2 && (fk0VarQ = sx1Var.j.q(keyEvent)) != null && (!fk0VarQ.e || z)) {
                    vc1 vc1Var = new vc1();
                    vc1Var.e = true;
                    kf kfVar = new kf(fk0VarQ, sx1Var, vc1Var, 16);
                    az1 az1Var = sx1Var.c;
                    ey1 ey1Var = new ey1(az1Var, sx1Var.g, sx1Var.a.d(), vz1Var);
                    kfVar.i(ey1Var);
                    boolean zB = wz1.b(ey1Var.f, az1Var.b);
                    hb hbVar = ey1Var.g;
                    if (!zB || !xi0.o(hbVar, az1Var.a)) {
                        sx1Var.k.i(az1.a(az1Var, hbVar, ey1Var.f, 4));
                    }
                    q32 q32Var = sx1Var.h;
                    if (q32Var != null) {
                        q32Var.e = true;
                    }
                    z2 = vc1Var.e;
                }
                return Boolean.valueOf(z2);
            default:
                ((iw1) obj2).b.a((sa0) obj);
                return t32.a;
        }
    }
}
