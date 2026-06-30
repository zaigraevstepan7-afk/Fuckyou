package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k8 extends zu1 implements sa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(tw1 tw1Var, Object obj, ks ksVar, int i) {
        super(1, ksVar);
        this.i = i;
        this.k = tw1Var;
        this.l = obj;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.l;
        ks ksVar = (ks) obj;
        switch (i) {
            case 0:
                return new k8((l8) this.k, (lw1) obj2, ksVar, 0).q(t32Var);
            case 1:
                return new k8((hf) this.k, (gf) obj2, ksVar, 1).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new k8((mv) obj2, ksVar, 2).q(t32Var);
            default:
                return new k8((a60) obj2, ksVar, 3).q(t32Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    @Override // defpackage.ye
    public final Object q(Object obj) throws Exception {
        h8 h8Var;
        Handler handler;
        Throwable th;
        ms1 yb1Var;
        Throwable th2;
        FileInputStream fileInputStream;
        int i = this.i;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        Object obj2 = this.l;
        int i2 = 2;
        boolean z = true;
        switch (i) {
            case 0:
                l8 l8Var = (l8) this.k;
                qq1 qq1Var = l8Var.e;
                View view = l8Var.a;
                int i3 = this.j;
                try {
                    if (i3 == 0) {
                        xc.G(obj);
                        i8 i8Var = new i8();
                        lw1 lw1Var = (lw1) obj2;
                        int i4 = 0;
                        h8 h8Var2 = new h8(i8Var, new e8(l8Var, lw1Var, 0), new e8(l8Var, lw1Var, 1), view);
                        sa0 sa0Var = l8Var.b;
                        if (sa0Var != null && (h8Var = (h8) sa0Var.i(h8Var2)) != null) {
                            h8Var2 = h8Var;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            j8 j8Var = l8Var.i;
                            if (j8Var == null) {
                                j8Var = new j8(l8Var, h8Var2, i8Var, i4);
                                l8Var.i = j8Var;
                            }
                            view.post(j8Var);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new e70(h8Var2), 1);
                            if (actionModeStartActionMode == null) {
                                return t32Var;
                            }
                            l8Var.h = actionModeStartActionMode;
                        }
                        this.j = 1;
                        rh rhVar = i8Var.a;
                        rhVar.getClass();
                        Object objD = rh.D(rhVar, this);
                        if (objD != wtVar) {
                            objD = t32Var;
                        }
                        if (objD == wtVar) {
                            return wtVar;
                        }
                    } else {
                        if (i3 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable pVar = l8Var.j;
                        if (pVar == null) {
                            pVar = new p(i2, l8Var);
                            l8Var.j = pVar;
                        }
                        view.post(pVar);
                    } else {
                        ActionMode actionMode = l8Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    j8 j8Var2 = l8Var.i;
                    if (j8Var2 != null) {
                        view.removeCallbacks(j8Var2);
                    }
                    l8Var.h = null;
                    return t32Var;
                } finally {
                    qq1Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable pVar2 = l8Var.j;
                        if (pVar2 == null) {
                            pVar2 = new p(i2, l8Var);
                            l8Var.j = pVar2;
                        }
                        view.post(pVar2);
                    } else {
                        ActionMode actionMode2 = l8Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    j8 j8Var3 = l8Var.i;
                    if (j8Var3 != null) {
                        view.removeCallbacks(j8Var3);
                    }
                    l8Var.h = null;
                }
            case 1:
                gf gfVar = (gf) obj2;
                v41 v41Var = ((hf) this.k).c;
                int i5 = this.j;
                try {
                    if (i5 == 0) {
                        xc.G(obj);
                        v41Var.setValue(gfVar);
                        this.j = 1;
                        rh rhVar2 = gfVar.b;
                        rhVar2.getClass();
                        Object objD2 = rh.D(rhVar2, this);
                        if (objD2 != wtVar) {
                            objD2 = t32Var;
                        }
                        if (objD2 == wtVar) {
                            return wtVar;
                        }
                    } else {
                        if (i5 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    return t32Var;
                } finally {
                    v41Var.setValue(null);
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                mv mvVar = (mv) obj2;
                int i6 = this.j;
                try {
                } catch (Throwable th3) {
                    fo1 fo1VarI = mvVar.i();
                    this.k = th3;
                    this.j = 2;
                    Integer numA = fo1VarI.a();
                    if (numA == wtVar) {
                        return wtVar;
                    }
                    obj = numA;
                    th = th3;
                }
                if (i6 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    obj = mv.f(mvVar, true, this);
                    if (obj == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.k;
                        xc.G(obj);
                        yb1Var = new yb1(th, ((Number) obj).intValue());
                        return new j41(yb1Var, Boolean.TRUE);
                    }
                    xc.G(obj);
                }
                yb1Var = (ms1) obj;
                return new j41(yb1Var, Boolean.TRUE);
            default:
                a60 a60Var = (a60) obj2;
                ?? r0 = this.j;
                try {
                    try {
                        try {
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (!a60Var.a.exists()) {
                            return new wx0(z);
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(a60Var.a);
                        try {
                            this.k = fileInputStream2;
                            this.j = 2;
                            wx0 wx0VarU = l91.u(fileInputStream2);
                            if (wx0VarU == wtVar) {
                                return wtVar;
                            }
                            obj = wx0VarU;
                            fileInputStream = fileInputStream2;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = fileInputStream2;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                el.p(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    if (r0 == 0) {
                        xc.G(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(a60Var.a);
                        this.k = fileInputStream3;
                        this.j = 1;
                        obj = l91.u(fileInputStream3);
                        r0 = fileInputStream3;
                        if (obj == wtVar) {
                            return wtVar;
                        }
                    } else {
                        if (r0 != 1) {
                            if (r0 != 2) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.k;
                            try {
                                xc.G(obj);
                                el.p(fileInputStream, null);
                                return obj;
                            } catch (Throwable th6) {
                                th2 = th6;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.k;
                        xc.G(obj);
                        r0 = fileInputStream4;
                    }
                    el.p(r0, null);
                    return obj;
                } catch (Exception e) {
                    if (e instanceof FileNotFoundException) {
                        throw lk.s0(a60Var.a.getParent(), (FileNotFoundException) e);
                    }
                    throw e;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(Object obj, ks ksVar, int i) {
        super(1, ksVar);
        this.i = i;
        this.l = obj;
    }
}
