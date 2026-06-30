package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s12 extends l01 {
    public final rh f;
    public jr1 g;

    public s12(bk1 bk1Var, io ioVar, hx hxVar) {
        super(bk1Var, ioVar, hxVar);
        this.f = nu0.d(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (r0.h(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(s12 s12Var, bk1 bk1Var, q12 q12Var, ls lsVar) {
        r12 r12Var;
        s12Var.getClass();
        xg0 xg0Var = s12Var.e;
        if (lsVar instanceof r12) {
            r12Var = (r12) lsVar;
            int i = r12Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                r12Var.j = i - Integer.MIN_VALUE;
            } else {
                r12Var = new r12(s12Var, lsVar);
            }
        }
        r12 r12Var2 = r12Var;
        Object obj = r12Var2.h;
        int i2 = r12Var2.j;
        Object obj2 = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            zc1 zc1Var = new zc1();
            zc1Var.e = q12Var;
            long j = q12Var.b;
            long j2 = q12Var.a;
            ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            q12 q12VarE = e(s12Var.f);
            if (q12VarE != null) {
                long j3 = q12VarE.b;
                long j4 = q12VarE.a;
                ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                zc1Var.e = ((q12) zc1Var.e).a(q12VarE);
            }
            wa0 l6Var = new l6(s12Var, bk1Var, zc1Var, null, 11);
            r12Var2.j = 1;
            if (s12Var.b(l6Var, r12Var2) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                xc.G(obj);
                return t32.a;
            }
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xc.G(obj);
        wa0 wa0Var = s12Var.b;
        o52 o52Var = new o52(kd1.c(((q52) xg0Var.f).c(Float.MAX_VALUE), ((q52) xg0Var.g).c(Float.MAX_VALUE)));
        r12Var2.j = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q12 e(rh rhVar) {
        q12 q12Var = null;
        lm1 lm1VarX = af1.x(new ea0(new lw0(rhVar, 1), 0 == true ? 1 : 0, 2));
        while (lm1VarX.hasNext()) {
            q12 q12VarA = (q12) lm1VarX.next();
            if (q12Var != null) {
                q12VarA = q12Var.a(q12VarA);
            }
            q12Var = q12VarA;
        }
        return q12Var;
    }

    public final boolean d(e81 e81Var) {
        boolean z;
        boolean z2;
        boolean z3;
        rh rhVar;
        bk1 bk1Var;
        l81 l81Var = (l81) pl.d0(e81Var.a);
        if (l81Var != null) {
            List listB = l81Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                rhVar = this.f;
                bk1Var = this.a;
                if (i >= size) {
                    break;
                }
                pd0 pd0Var = (pd0) listB.get(i);
                long j = pd0Var.d ^ (-9223372034707292160L);
                if (!(bk1Var.j(bk1Var.f(j)) == 0.0f)) {
                    z3 = !(rhVar.t(new q12(j, pd0Var.a, false)) instanceof xj) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = l81Var.l ^ (-9223372034707292160L);
            boolean z4 = e81Var.f == 12;
            if (!(bk1Var.j(bk1Var.f(j2)) == 0.0f) || z4) {
                if (!(rhVar.t(new q12(j2, l81Var.b, z4)) instanceof xj) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
