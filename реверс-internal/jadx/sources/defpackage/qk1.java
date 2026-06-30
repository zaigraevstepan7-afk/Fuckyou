package defpackage;

import android.view.View;
import com.reddit.secondpage.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk1(xt1 xt1Var, jx0 jx0Var, ks ksVar) {
        super(2, ksVar);
        this.i = 5;
        this.l = xt1Var;
        this.k = jx0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((qk1) o((ks) obj2, obj)).q(t32Var);
            default:
                return ((qk1) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new qk1((jx0) this.k, (s41) obj2, ksVar, 0);
            case 1:
                return new qk1((vu) obj2, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new qk1((hp1) this.k, (m6) obj2, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new qk1((f70) this.k, (xa1) obj2, ksVar, 3);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new qk1((n81) this.k, (nt1) obj2, ksVar, 4);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new qk1((xt1) obj2, (jx0) this.k, ksVar);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new qk1((oj0) this.k, (ma1) obj2, ksVar, 6);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                qk1 qk1Var = new qk1((g70) obj2, ksVar, 7);
                qk1Var.k = obj;
                return qk1Var;
            default:
                return new qk1((jc1) this.k, (View) obj2, ksVar, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0279, code lost:
    
        if (r6.h(r7, r12) != r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r2.e(r12) == r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271 A[PHI: r6 r7
      0x0271: PHI (r6v7 e) = (r6v13 e), (r6v20 e) binds: [B:123:0x026e, B:119:0x0236] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v0 java.lang.Object) = (r7v3 java.lang.Object), (r7v4 java.lang.Object) binds: [B:123:0x026e, B:119:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v6, types: [hp1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0279 -> B:128:0x027d). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        Object objD;
        e eVar;
        Object objB;
        int i = 2;
        int i2 = 1;
        ks ksVar = null;
        switch (this.i) {
            case 0:
                wt wtVar = wt.e;
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                tn1 tn1Var = ((jx0) this.k).a;
                j6 j6Var = new j6(4, (s41) this.l);
                this.j = 1;
                tn1Var.getClass();
                tn1.k(tn1Var, j6Var, this);
                return wtVar;
            case 1:
                vu vuVar = (vu) this.l;
                wt wtVar2 = wt.e;
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    if (((AtomicInteger) ((qt0) vuVar.h).f).get() <= 0) {
                        yc.l("Check failed.");
                        return null;
                    }
                    bk.t(((vt) vuVar.e).f());
                    eVar = (e) vuVar.f;
                    rh rhVar = (rh) vuVar.g;
                    this.k = eVar;
                    this.j = 1;
                    rhVar.getClass();
                    objD = rh.D(rhVar, this);
                    if (objD != wtVar2) {
                    }
                    return wtVar2;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    if (((AtomicInteger) ((qt0) vuVar.h).f).decrementAndGet() == 0) {
                        return t32.a;
                    }
                    bk.t(((vt) vuVar.e).f());
                    eVar = (e) vuVar.f;
                    rh rhVar2 = (rh) vuVar.g;
                    this.k = eVar;
                    this.j = 1;
                    rhVar2.getClass();
                    objD = rh.D(rhVar2, this);
                    if (objD != wtVar2) {
                        this.k = null;
                        this.j = 2;
                        break;
                    }
                    return wtVar2;
                }
                eVar = (e) this.k;
                xc.G(obj);
                objD = obj;
                this.k = null;
                this.j = 2;
                break;
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                hp1 hp1Var = (hp1) this.k;
                wt wtVar3 = wt.e;
                int i5 = this.j;
                try {
                    if (i5 == 0) {
                        xc.G(obj);
                        hp1Var.n.setValue(Boolean.TRUE);
                        qy0 qy0Var = hp1Var.s;
                        gp1 gp1Var = hp1Var.r;
                        ly0 ly0Var = ly0.f;
                        m6 m6Var = (m6) this.l;
                        this.j = 1;
                        qy0Var.getClass();
                        if (bl.r(new py0(ly0Var, qy0Var, m6Var, gp1Var, null), this) == wtVar3) {
                            return wtVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    v41 v41Var = hp1Var.n;
                    hp1Var = Boolean.FALSE;
                    v41Var.setValue(hp1Var);
                    return t32.a;
                } catch (Throwable th) {
                    hp1Var.n.setValue(Boolean.FALSE);
                    throw th;
                }
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                wt wtVar4 = wt.e;
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    f70 f70Var = (f70) this.k;
                    kq1 kq1Var = new kq1((xa1) this.l, 1);
                    this.j = 1;
                    if (f70Var.c(kq1Var, this) == wtVar4) {
                        return wtVar4;
                    }
                } else {
                    if (i6 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                wt wtVar5 = wt.e;
                int i7 = this.j;
                try {
                    if (i7 == 0) {
                        xc.G(obj);
                        Object obj2 = ((n81) this.k).b;
                        nt1 nt1Var = (nt1) this.l;
                        synchronized (obj2) {
                            if (nt1Var.c == ot1.i) {
                                nt1Var.c = ot1.f;
                            }
                            break;
                        }
                        h9 h9Var = ((nt1) this.l).b;
                        float fFloatValue = ((Number) h9Var.a.b.i(h9Var.c.g)).floatValue();
                        ((nt1) this.l).b = xi0.a(0.0f);
                        h9 h9Var2 = ((nt1) this.l).b;
                        Float f = new Float(1.0f);
                        wa waVar = ((nt1) this.l).a;
                        Float f2 = new Float(fFloatValue);
                        this.j = 1;
                        objB = h9.b(h9Var2, f, waVar, f2, null, this, 8);
                        if (objB == wtVar5) {
                            return wtVar5;
                        }
                    } else {
                        if (i7 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                        objB = obj;
                    }
                    n81.g((n81) this.k);
                    return t32.a;
                } catch (Throwable th2) {
                    n81.g((n81) this.k);
                    throw th2;
                }
            case t91.STRING_FIELD_NUMBER /* 5 */:
                wt wtVar6 = wt.e;
                int i8 = this.j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                hy0 hy0Var = ((xt1) this.l).C;
                jx0 jx0Var = (jx0) this.k;
                this.j = 1;
                l1 l1Var = new l1();
                l1 l1Var2 = new l1();
                l1 l1Var3 = new l1();
                hy0Var.c(false);
                hy0Var.b(false);
                hy0Var.a(false);
                tn1 tn1Var2 = jx0Var.a;
                uj ujVar = new uj(l1Var, hy0Var, l1Var2, l1Var3, 3);
                tn1Var2.getClass();
                tn1.k(tn1Var2, ujVar, this);
                return wtVar6;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                wt wtVar7 = wt.e;
                int i9 = this.j;
                if (i9 == 0) {
                    xc.G(obj);
                    oj0 oj0Var = (oj0) this.k;
                    this.j = 1;
                    if (oj0Var.w(this) != wtVar7) {
                    }
                    return wtVar7;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                ma1 ma1Var = (ma1) this.l;
                this.j = 2;
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                Object obj3 = this.k;
                wt wtVar8 = wt.e;
                int i10 = this.j;
                if (i10 == 0) {
                    xc.G(obj);
                    g70 g70Var = (g70) this.l;
                    this.k = null;
                    this.j = 1;
                    if (g70Var.l(obj3, this) == wtVar8) {
                        return wtVar8;
                    }
                } else {
                    if (i10 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            default:
                t32 t32Var = t32.a;
                jc1 jc1Var = (jc1) this.k;
                View view = (View) this.l;
                wt wtVar9 = wt.e;
                int i11 = this.j;
                try {
                    if (i11 == 0) {
                        xc.G(obj);
                        this.j = 1;
                        Object objR = xk.r(jc1Var.u, new xu(i, ksVar, i2), this);
                        if (objR != wtVar9) {
                            objR = t32Var;
                        }
                        if (objR == wtVar9) {
                            return wtVar9;
                        }
                    } else {
                        if (i11 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    if (l92.a(view) == jc1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return t32Var;
                } finally {
                    if (l92.a(view) == jc1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk1(Object obj, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk1(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
    }
}
