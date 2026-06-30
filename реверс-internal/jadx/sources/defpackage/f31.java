package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f31 extends bl {
    public int e;
    public int g;
    public int i;
    public d31[] d = new d31[16];
    public int[] f = new int[16];
    public Object[] h = new Object[16];

    public final void Y() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, (Object) null);
        this.i = 0;
    }

    public final void Z(vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) throws IllegalAccessException, InvocationTargetException {
        if (this.e != 0) {
            ll llVar = new ll(this);
            f31 f31Var = (f31) llVar.e;
            while (true) {
                d31 d31Var = f31Var.d[llVar.b];
                jb0 jb0VarB = d31Var.b(llVar);
                vc vcVar2 = vcVar;
                mp1 mp1Var2 = mp1Var;
                hd1 hd1Var2 = hd1Var;
                e31 e31Var2 = e31Var;
                try {
                    d31Var.a(llVar, vcVar2, mp1Var2, hd1Var2, e31Var2);
                    int i = llVar.b;
                    int i2 = f31Var.e;
                    if (i < i2) {
                        d31 d31Var2 = f31Var.d[i];
                        llVar.c += d31Var2.a;
                        llVar.d += d31Var2.b;
                        int i3 = i + 1;
                        llVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        vcVar = vcVar2;
                        mp1Var = mp1Var2;
                        hd1Var = hd1Var2;
                        e31Var = e31Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        Y();
    }

    public final boolean a0() {
        return this.e == 0;
    }

    public final void b0(d31 d31Var) {
        int i = this.e;
        d31[] d31VarArr = this.d;
        if (i == d31VarArr.length) {
            d31[] d31VarArr2 = new d31[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(d31VarArr, 0, d31VarArr2, 0, i);
            this.d = d31VarArr2;
        }
        int i2 = this.g;
        int i3 = d31Var.a;
        int i4 = d31Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.f;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            nd.K(0, 0, length, iArr, iArr2);
            this.f = iArr2;
        }
        int i7 = this.i + i4;
        Object[] objArr = this.h;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.h = objArr2;
        }
        d31[] d31VarArr3 = this.d;
        int i9 = this.e;
        this.e = i9 + 1;
        d31VarArr3[i9] = d31Var;
        this.g += d31Var.a;
        this.i += i4;
    }
}
