package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends u4 {
    public final d2 B0;

    public nt0(d2 d2Var) {
        this.B0 = d2Var;
    }

    public final void w(Object obj) {
        g2 g2Var = this.B0.a;
        if (g2Var == null) {
            yc.l("Launcher has not been initialized");
            return;
        }
        zn znVar = g2Var.B0;
        LinkedHashMap linkedHashMap = znVar.b;
        ArrayList arrayList = znVar.d;
        String str = g2Var.C0;
        Object obj2 = linkedHashMap.get(str);
        c2 c2Var = g2Var.D0;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c2Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            znVar.b(iIntValue, c2Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
