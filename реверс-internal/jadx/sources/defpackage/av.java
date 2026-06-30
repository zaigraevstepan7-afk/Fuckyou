package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class av implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ g70 f;

    public /* synthetic */ av(g70 g70Var, int i) {
        this.e = i;
        this.f = g70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) throws Throwable {
        zu zuVar;
        ja1 ja1Var;
        int i = this.e;
        t32 t32Var = t32.a;
        g70 g70Var = this.f;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                if (ksVar instanceof zu) {
                    zuVar = (zu) ksVar;
                    int i2 = zuVar.i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zuVar.i = i2 - Integer.MIN_VALUE;
                    } else {
                        zuVar = new zu(this, ksVar);
                    }
                }
                Object obj2 = zuVar.h;
                int i3 = zuVar.i;
                if (i3 == 0) {
                    xc.G(obj2);
                    ms1 ms1Var = (ms1) obj;
                    if (ms1Var instanceof yb1) {
                        throw ((yb1) ms1Var).b;
                    }
                    if (ms1Var instanceof lu) {
                        Object obj3 = ((lu) ms1Var).b;
                        zuVar.i = 1;
                        return g70Var.l(obj3, zuVar) == wtVar ? wtVar : t32Var;
                    }
                    if ((ms1Var instanceof n60) || (ms1Var instanceof m32) || (ms1Var instanceof tz0)) {
                        yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        ez1.a();
                    }
                } else {
                    if (i3 == 1) {
                        xc.G(obj2);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                if (ksVar instanceof ja1) {
                    ja1Var = (ja1) ksVar;
                    int i4 = ja1Var.i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ja1Var.i = i4 - Integer.MIN_VALUE;
                    } else {
                        ja1Var = new ja1(this, ksVar);
                    }
                }
                Object obj4 = ja1Var.h;
                int i5 = ja1Var.i;
                if (i5 != 0) {
                    if (i5 == 1) {
                        xc.G(obj4);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj4);
                wx0 wx0Var = (wx0) obj;
                String str = (String) wx0Var.c(xg0.j);
                String str2 = str == null ? "" : str;
                Boolean bool = (Boolean) wx0Var.c(xg0.k);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = (Boolean) wx0Var.c(xg0.l);
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Float f = (Float) wx0Var.c(xg0.m);
                float fFloatValue = f != null ? f.floatValue() : 1.0f;
                String str3 = (String) wx0Var.c(xg0.n);
                String str4 = str3 == null ? "" : str3;
                String str5 = (String) wx0Var.c(xg0.o);
                if (str5 == null) {
                    str5 = "su";
                }
                ga2 ga2Var = new ga2(str2, zBooleanValue, zBooleanValue2, fFloatValue, str4, str5);
                ja1Var.i = 1;
                return g70Var.l(ga2Var, ja1Var) == wtVar ? wtVar : t32Var;
        }
    }
}
