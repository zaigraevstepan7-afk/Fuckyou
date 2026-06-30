package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jv extends zu1 implements sa0 {
    public final /* synthetic */ int i = 2;
    public int j;
    public final /* synthetic */ Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(zc1 zc1Var, mv mvVar, xc1 xc1Var, ks ksVar) {
        super(1, ksVar);
        this.m = zc1Var;
        this.k = mvVar;
        this.n = xc1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.n;
        Object obj3 = this.k;
        ks ksVar = (ks) obj;
        switch (i) {
            case 0:
                return new jv((zc1) this.m, (mv) obj3, (xc1) obj2, ksVar).q(t32Var);
            case 1:
                return new jv((mv) obj3, (lt) this.m, (wa0) obj2, ksVar).q(t32Var);
            default:
                return new jv((g60) obj3, obj2, ksVar).q(t32Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x014e, code lost:
    
        if (r12 != r6) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Exception {
        zc1 zc1Var;
        xc1 xc1Var;
        lu luVar;
        Object obj2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj3 = this.n;
        wt wtVar = wt.e;
        Object obj4 = this.k;
        ks ksVar = null;
        switch (i) {
            case 0:
                xc1 xc1Var2 = (xc1) obj3;
                zc1 zc1Var2 = (zc1) this.m;
                mv mvVar = (mv) obj4;
                int i2 = this.j;
                try {
                } catch (au unused) {
                    Object obj5 = zc1Var2.e;
                    this.l = xc1Var2;
                    this.j = 3;
                    obj = mvVar.k(obj5, true, this);
                    break;
                }
                if (i2 == 0) {
                    xc.G(obj);
                    this.l = zc1Var2;
                    this.j = 1;
                    obj = mvVar.j(this);
                    if (obj == wtVar) {
                        return wtVar;
                    }
                    zc1Var = zc1Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            xc1Var = (xc1) ((Serializable) this.l);
                            xc.G(obj);
                            xc1Var.e = ((Number) obj).intValue();
                            return t32Var;
                        }
                        if (i2 != 3) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc1Var2 = (xc1) ((Serializable) this.l);
                        xc.G(obj);
                        xc1Var2.e = ((Number) obj).intValue();
                        return t32Var;
                    }
                    zc1Var = (zc1) ((Serializable) this.l);
                    xc.G(obj);
                }
                zc1Var.e = obj;
                fo1 fo1VarI = mvVar.i();
                this.l = xc1Var2;
                this.j = 2;
                obj = fo1VarI.a();
                if (obj == wtVar) {
                    return wtVar;
                }
                xc1Var = xc1Var2;
                xc1Var.e = ((Number) obj).intValue();
                return t32Var;
            case 1:
                mv mvVar2 = (mv) obj4;
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    obj = mv.f(mvVar2, true, this);
                    if (obj == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.l;
                            xc.G(obj);
                            return obj6;
                        }
                        luVar = (lu) this.l;
                        xc.G(obj);
                        obj2 = luVar.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == luVar.c) {
                            yc.l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!xi0.o(luVar.b, obj)) {
                            this.l = obj;
                            this.j = 3;
                            if (mvVar2.k(obj, true, this) == wtVar) {
                                return wtVar;
                            }
                        }
                        return obj;
                    }
                    xc.G(obj);
                }
                luVar = (lu) obj;
                lt ltVar = (lt) this.m;
                e eVar = new e((wa0) obj3, luVar, ksVar, 16);
                this.l = luVar;
                this.j = 2;
                obj = nu0.P(ltVar, eVar, this);
                if (obj == wtVar) {
                    return wtVar;
                }
                obj2 = luVar.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == luVar.c) {
                }
                break;
            default:
                File file = ((g60) obj4).a;
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            n32 n32Var = new n32(fileOutputStream);
                            this.l = fileOutputStream;
                            this.m = fileOutputStream;
                            this.j = 1;
                            l91.y(obj3, n32Var);
                            if (t32Var == wtVar) {
                                return wtVar;
                            }
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw lk.s0(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream = (FileOutputStream) this.m;
                    fileOutputStream2 = (FileOutputStream) this.l;
                    try {
                        xc.G(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            el.p(fileOutputStream2, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                el.p(fileOutputStream2, null);
                return t32Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(g60 g60Var, Object obj, ks ksVar) {
        super(1, ksVar);
        this.k = g60Var;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(mv mvVar, lt ltVar, wa0 wa0Var, ks ksVar) {
        super(1, ksVar);
        this.k = mvVar;
        this.m = ltVar;
        this.n = wa0Var;
    }
}
