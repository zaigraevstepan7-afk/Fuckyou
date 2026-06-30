package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 {
    public static final lb1 c = new lb1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final qt0 a = new qt0(0);

    public final si1 a(Class cls) {
        m50 m50Var;
        si1 si1VarW;
        Class cls2;
        ki0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        si1 si1Var = (si1) concurrentHashMap.get(cls);
        if (si1Var != null) {
            return si1Var;
        }
        qt0 qt0Var = this.a;
        qt0Var.getClass();
        Class cls3 = ti1.a;
        if (!xb0.class.isAssignableFrom(cls) && (cls2 = ti1.a) != null && !cls2.isAssignableFrom(cls)) {
            yc.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        xb1 xb1VarA = ((pt0) qt0Var.f).a(cls);
        if ((xb1VarA.d & 2) == 2) {
            if (xb0.class.isAssignableFrom(cls)) {
                si1VarW = new hv0(ti1.c, n50.a, xb1VarA.a);
            } else {
                v32 v32Var = ti1.b;
                m50 m50Var2 = n50.b;
                if (m50Var2 == null) {
                    yc.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                si1VarW = new hv0(v32Var, m50Var2, xb1VarA.a);
            }
        } else if (xb0.class.isAssignableFrom(cls)) {
            qz0 qz0Var = rz0.b;
            cq0 cq0Var = dq0.b;
            v32 v32Var2 = ti1.c;
            m50 m50Var3 = s91.w(xb1VarA.a()) != 1 ? n50.a : null;
            au0 au0Var = bu0.b;
            if (!(xb1VarA instanceof xb1)) {
                int[] iArr = gv0.n;
                yc.d();
                return null;
            }
            si1VarW = gv0.w(xb1VarA, qz0Var, cq0Var, v32Var2, m50Var3, au0Var);
        } else {
            qz0 qz0Var2 = rz0.a;
            cq0 cq0Var2 = dq0.a;
            v32 v32Var3 = ti1.b;
            if (s91.w(xb1VarA.a()) != 1) {
                m50 m50Var4 = n50.b;
                if (m50Var4 == null) {
                    yc.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                m50Var = m50Var4;
            } else {
                m50Var = null;
            }
            au0 au0Var2 = bu0.a;
            if (!(xb1VarA instanceof xb1)) {
                int[] iArr2 = gv0.n;
                yc.d();
                return null;
            }
            si1VarW = gv0.w(xb1VarA, qz0Var2, cq0Var2, v32Var3, m50Var, au0Var2);
        }
        si1 si1Var2 = (si1) concurrentHashMap.putIfAbsent(cls, si1VarW);
        return si1Var2 != null ? si1Var2 : si1VarW;
    }
}
