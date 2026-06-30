package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o91 extends xb0 {
    private static final o91 DEFAULT_INSTANCE;
    private static volatile x41 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private zt0 preferences_ = zt0.f;

    static {
        o91 o91Var = new o91();
        DEFAULT_INSTANCE = o91Var;
        xb0.j(o91.class, o91Var);
    }

    public static zt0 l(o91 o91Var) {
        zt0 zt0Var = o91Var.preferences_;
        if (!zt0Var.e) {
            o91Var.preferences_ = zt0Var.b();
        }
        return o91Var.preferences_;
    }

    public static m91 n() {
        return (m91) ((vb0) DEFAULT_INSTANCE.c(5));
    }

    public static o91 o(FileInputStream fileInputStream) {
        o91 o91Var = DEFAULT_INSTANCE;
        jl jlVar = new jl(fileInputStream);
        l50 l50VarA = l50.a();
        xb0 xb0VarI = o91Var.i();
        try {
            lb1 lb1Var = lb1.c;
            lb1Var.getClass();
            si1 si1VarA = lb1Var.a(xb0VarI.getClass());
            ll llVar = (ll) jlVar.f;
            if (llVar == null) {
                llVar = new ll(jlVar);
            }
            si1VarA.h(xb0VarI, llVar, l50VarA);
            si1VarA.c(xb0VarI);
            if (xb0.f(xb0VarI, true)) {
                return (o91) xb0VarI;
            }
            throw new fj0(new r32().getMessage());
        } catch (fj0 e) {
            if (e.e) {
                throw new fj0(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof fj0) {
                throw ((fj0) e2.getCause());
            }
            throw new fj0(e2.getMessage(), e2);
        } catch (r32 e3) {
            throw new fj0(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof fj0) {
                throw ((fj0) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.xb0
    public final Object c(int i) {
        x41 wb0Var;
        switch (s91.w(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new xb1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", n91.a});
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new o91();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new m91(DEFAULT_INSTANCE);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                x41 x41Var = PARSER;
                if (x41Var != null) {
                    return x41Var;
                }
                synchronized (o91.class) {
                    try {
                        wb0Var = PARSER;
                        if (wb0Var == null) {
                            wb0Var = new wb0();
                            PARSER = wb0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wb0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
