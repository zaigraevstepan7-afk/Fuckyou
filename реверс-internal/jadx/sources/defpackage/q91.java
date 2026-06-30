package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q91 extends xb0 {
    private static final q91 DEFAULT_INSTANCE;
    private static volatile x41 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private ji0 strings_ = mb1.h;

    static {
        q91 q91Var = new q91();
        DEFAULT_INSTANCE = q91Var;
        xb0.j(q91.class, q91Var);
    }

    public static void l(q91 q91Var, Iterable iterable) {
        ji0 ji0Var = q91Var.strings_;
        if (!((mb1) ji0Var).e) {
            mb1 mb1Var = (mb1) ji0Var;
            int i = mb1Var.g;
            q91Var.strings_ = mb1Var.c(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = q91Var.strings_;
        Charset charset = ki0.a;
        if (iterable instanceof zn0) {
            List listD = ((zn0) iterable).d();
            if (randomAccess != null) {
                yc.d();
                return;
            }
            ((mb1) randomAccess).getClass();
            Iterator it = listD.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ji) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ji.c(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof ra1) {
            ((mb1) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((mb1) randomAccess).g);
        }
        mb1 mb1Var2 = (mb1) randomAccess;
        int i2 = mb1Var2.g;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (mb1Var2.g - i2) + " is null.";
                for (int i3 = mb1Var2.g - 1; i3 >= i2; i3--) {
                    mb1Var2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            mb1Var2.add(obj);
        }
    }

    public static q91 m() {
        return DEFAULT_INSTANCE;
    }

    public static p91 o() {
        return (p91) ((vb0) DEFAULT_INSTANCE.c(5));
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
                return new xb1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new q91();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new p91(DEFAULT_INSTANCE);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                x41 x41Var = PARSER;
                if (x41Var != null) {
                    return x41Var;
                }
                synchronized (q91.class) {
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

    public final ji0 n() {
        return this.strings_;
    }
}
