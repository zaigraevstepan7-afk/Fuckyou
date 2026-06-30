package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 {
    public Set a;
    public rp b;
    public final iy0 c;
    public ay0 d;
    public iy0 e;
    public final iy0 f;
    public final iy0 g;
    public ay0 h;
    public zx0 i;
    public ArrayList j;
    public ay0 k;

    public hd1() {
        iy0 iy0Var = new iy0(new sb0[16]);
        this.c = iy0Var;
        ay0 ay0Var = qi1.a;
        this.d = new ay0();
        this.e = iy0Var;
        this.f = new iy0(new Object[16]);
        this.g = new iy0(new ha0[16]);
    }

    public static final boolean f(sb0 sb0Var, iy0 iy0Var) {
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            id1 id1Var = ((sb0) objArr[i2]).a;
            if (id1Var instanceof w51) {
                iy0 iy0Var2 = ((w51) id1Var).f;
                if (iy0Var2.j(sb0Var) || f(sb0Var, iy0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        iy0 iy0Var = this.c;
        iy0Var.g();
        this.d.b();
        this.e = iy0Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                id1 id1Var = (id1) it.next();
                it.remove();
                id1Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        iy0 iy0Var = this.f;
        int i = 5;
        if (iy0Var.g != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                ay0 ay0Var = this.h;
                int i2 = iy0Var.g;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = iy0Var.e[i2];
                    try {
                        if (obj instanceof sb0) {
                            id1 id1Var = ((sb0) obj).a;
                            set.remove(id1Var);
                            id1Var.e();
                        }
                        if (obj instanceof to) {
                            if (ay0Var == null || !ay0Var.c(obj)) {
                                ((to) obj).b();
                            } else {
                                ((to) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        rp rpVar = this.b;
                        if (rpVar != null) {
                            bl.U(th, new f8(i, rpVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        iy0 iy0Var2 = this.c;
        if (iy0Var2.g != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = iy0Var2.e;
                    int i3 = iy0Var2.g;
                    for (int i4 = 0; i4 < i3; i4++) {
                        sb0 sb0Var = (sb0) objArr[i4];
                        id1 id1Var2 = sb0Var.a;
                        set2.remove(id1Var2);
                        try {
                            id1Var2.c();
                        } catch (Throwable th2) {
                            rp rpVar2 = this.b;
                            if (rpVar2 != null) {
                                bl.U(th2, new f8(i, rpVar2, sb0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        iy0 iy0Var = this.g;
        if (iy0Var.g != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = iy0Var.e;
                int i = iy0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ha0) objArr[i2]).a();
                }
                iy0Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(sb0 sb0Var) {
        if (!this.d.c(sb0Var)) {
            ay0 ay0Var = this.k;
            if (ay0Var == null || !ay0Var.c(sb0Var)) {
                this.f.b(sb0Var);
                return;
            }
            return;
        }
        this.d.l(sb0Var);
        if (!this.e.j(sb0Var)) {
            iy0 iy0Var = this.c;
            if (!iy0Var.j(sb0Var)) {
                f(sb0Var, iy0Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(sb0Var.a);
    }

    public final void g(Set set, rp rpVar) {
        a();
        this.a = set;
        this.b = rpVar;
    }
}
