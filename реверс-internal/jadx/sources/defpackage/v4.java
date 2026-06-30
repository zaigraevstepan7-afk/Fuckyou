package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends sk0 implements ha0 {
    public static final v4 A;
    public static final v4 B;
    public static final v4 C;
    public static final v4 D;
    public static final v4 E;
    public static final v4 F;
    public static final v4 G;
    public static final v4 H;
    public static final v4 I;
    public static final v4 J;
    public static final v4 g;
    public static final v4 h;
    public static final v4 i;
    public static final v4 j;
    public static final v4 k;
    public static final v4 l;
    public static final v4 m;
    public static final v4 n;
    public static final v4 o;
    public static final v4 p;
    public static final v4 q;
    public static final v4 r;
    public static final v4 s;
    public static final v4 t;
    public static final v4 u;
    public static final v4 v;
    public static final v4 w;
    public static final v4 x;
    public static final v4 y;
    public static final v4 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new v4(i2, 0);
        h = new v4(i2, 1);
        i = new v4(i2, 2);
        j = new v4(i2, 3);
        k = new v4(i2, 4);
        l = new v4(i2, 5);
        m = new v4(i2, 6);
        n = new v4(i2, 7);
        o = new v4(i2, 8);
        p = new v4(i2, 9);
        q = new v4(i2, 10);
        r = new v4(i2, 11);
        s = new v4(i2, 12);
        t = new v4(i2, 13);
        u = new v4(i2, 14);
        v = new v4(i2, 15);
        w = new v4(i2, 16);
        x = new v4(i2, 17);
        y = new v4(i2, 18);
        z = new v4(i2, 19);
        A = new v4(i2, 20);
        B = new v4(i2, 21);
        C = new v4(i2, 22);
        D = new v4(i2, 23);
        E = new v4(i2, 24);
        F = new v4(i2, 25);
        G = new v4(i2, 26);
        H = new v4(i2, 27);
        I = new v4(i2, 28);
        J = new v4(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ha0
    public final Object a() throws Throwable {
        b50 b50VarA;
        lt ltVarJ;
        long jR;
        Choreographer choreographer;
        int i2 = 2;
        Object[] objArr = 0;
        switch (this.f) {
            case 0:
                w4.a("LocalConfiguration");
                throw null;
            case 1:
                w4.a("LocalContext");
                throw null;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                w4.a("LocalImageVectorCache");
                throw null;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                w4.a("LocalResourceIdCache");
                throw null;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                w4.a("LocalView");
                throw null;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return UUID.randomUUID();
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.FALSE;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return "DEFAULT_TEST_TAG";
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return UUID.randomUUID();
            case el.a /* 9 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    lw lwVar = qy.a;
                    ed0 ed0Var = kt0.a;
                    wa0 t8Var = new t8(i2, objArr == true ? 1 : 0, 0);
                    v20 v20Var = v20.z;
                    ot otVar = (ot) ed0Var.l(v20Var);
                    d40 d40Var = d40.e;
                    if (otVar == null) {
                        b50VarA = l02.a();
                        ltVarJ = lk.J(d40Var, hk.L(ed0Var, b50VarA), true);
                        lw lwVar2 = qy.a;
                        if (ltVarJ != lwVar2 && ltVarJ.l(v20Var) == null) {
                            ltVarJ = ltVarJ.j(lwVar2);
                        }
                    } else {
                        b50VarA = (b50) l02.a.get();
                        ltVarJ = lk.J(d40Var, ed0Var, true);
                        lw lwVar3 = qy.a;
                        if (ltVarJ != lwVar3 && ltVarJ.l(v20Var) == null) {
                            ltVarJ = ltVarJ.j(lwVar3);
                        }
                    }
                    zf zfVar = new zf(ltVarJ, Thread.currentThread(), b50VarA);
                    zfVar.o0(yt.e, zfVar, t8Var);
                    b50 b50Var = zfVar.k;
                    if (b50Var != null) {
                        int i3 = b50.j;
                        b50Var.n(false);
                    }
                    while (true) {
                        if (b50Var != null) {
                            try {
                                jR = b50Var.r();
                            } catch (Throwable th) {
                                if (b50Var != null) {
                                    int i4 = b50.j;
                                    b50Var.k(false);
                                }
                                throw th;
                            }
                        } else {
                            jR = Long.MAX_VALUE;
                        }
                        if (zfVar.P() instanceof if0) {
                            LockSupport.parkNanos(zfVar, jR);
                            if (Thread.interrupted()) {
                                zfVar.C(new InterruptedException());
                            }
                        } else {
                            if (b50Var != null) {
                                int i5 = b50.j;
                                b50Var.k(false);
                            }
                            Object objS = s22.S(zfVar.P());
                            on onVar = objS instanceof on ? (on) objS : null;
                            if (onVar != null) {
                                throw onVar.a;
                            }
                            choreographer = (Choreographer) objS;
                        }
                    }
                }
                w8 w8Var = new w8(choreographer, bl.s(Looper.getMainLooper()));
                return hk.L(w8Var, w8Var.p);
            case el.b /* 10 */:
                return new ql0(2);
            case 11:
            case el.c /* 12 */:
                return null;
            case 13:
                aq.b("LocalAutofillManager");
                throw null;
            case 14:
                aq.b("LocalAutofillTree");
                throw null;
            case 15:
                aq.b("LocalClipboard");
                throw null;
            case 16:
                aq.b("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                aq.b("LocalDensity");
                throw null;
            case 19:
                aq.b("LocalFocusManager");
                throw null;
            case 20:
                aq.b("LocalFontFamilyResolver");
                throw null;
            case 21:
                aq.b("LocalFontLoader");
                throw null;
            case 22:
                aq.b("LocalGraphicsContext");
                throw null;
            case 23:
                aq.b("LocalHapticFeedback");
                throw null;
            case 24:
                aq.b("LocalInputManager");
                throw null;
            case 25:
                aq.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                aq.b("LocalProvidableLocaleList");
                throw null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
