package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mo implements cb0 {
    @Override // defpackage.cb0
    public final Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ob0 ob0Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        cs csVar = (cs) obj2;
        xa0 xa0Var = (xa0) obj3;
        ha0 ha0Var = (ha0) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        qv0 qv0Var = qv0.a;
        if (i2 == 0) {
            i = (ob0Var.f(qv0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ob0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ob0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ob0Var.f(csVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ob0Var.h(xa0Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ob0Var.h(ha0Var) ? 131072 : 65536;
        }
        if (ob0Var.N(i & 1, (599187 & i) != 599186)) {
            is.c(str, zBooleanValue, csVar, qv0Var, xa0Var, ha0Var, ob0Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            ob0Var.Q();
        }
        return t32.a;
    }
}
