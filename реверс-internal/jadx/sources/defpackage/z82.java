package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z82 extends kl implements Runnable, c11, View.OnAttachStateChangeListener {
    public static final Integer[] m = {8, 64, 4, 1, 128, 16, 2, 32};
    public boolean g;
    public int h;
    public p82 i;
    public final v41 j;
    public final hx0 k;
    public final hx0 l;

    public z82() {
        super(1);
        this.j = xc.B(null);
        this.k = new hx0(8);
        this.l = new hx0(8);
    }

    public final p82 E() {
        return (p82) this.j.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final fy0 F(int i) {
        hx0 hx0Var = this.k;
        fy0 fy0Var = (fy0) hx0Var.b(i);
        if (fy0Var != null) {
            return fy0Var;
        }
        v41 v41VarB = xc.B(null);
        hx0Var.i(i, v41VarB);
        return v41VarB;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final fy0 G(int i) {
        hx0 hx0Var = this.l;
        fy0 fy0Var = (fy0) hx0Var.b(i);
        if (fy0Var != null) {
            return fy0Var;
        }
        v41 v41VarB = xc.B(null);
        hx0Var.i(i, v41VarB);
        return v41VarB;
    }

    public final void H(p82 p82Var) {
        boolean z = false;
        if (E() == null) {
            eh0 eh0Var = eh0.e;
            Integer[] numArr = m;
            for (int i = 0; i < 8; i++) {
                int iIntValue = numArr[i].intValue();
                if (xi0.o(iIntValue == 8 ? p82Var.a.h(iIntValue) : p82Var.a.i(iIntValue), eh0Var)) {
                }
            }
            return;
        }
        this.j.setValue(p82Var);
        synchronized (aq1.c) {
            ay0 ay0Var = aq1.j.h;
            if (ay0Var != null) {
                if (ay0Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            aq1.a();
        }
    }

    @Override // defpackage.c11
    public final p82 a(View view, p82 p82Var) {
        if (this.g) {
            this.i = p82Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return p82Var;
            }
        } else if (this.h == 0) {
            H(p82Var);
        }
        return p82Var;
    }

    @Override // defpackage.kl
    public final void e(t72 t72Var) {
        boolean z = false;
        this.g = false;
        int iC = t72Var.a.c();
        F(iC).setValue(null);
        G(iC).setValue(null);
        this.h = (~iC) & this.h;
        this.i = null;
        synchronized (aq1.c) {
            ay0 ay0Var = aq1.j.h;
            if (ay0Var != null) {
                if (ay0Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            aq1.a();
        }
    }

    @Override // defpackage.kl
    public final void f(t72 t72Var) {
        this.g = true;
    }

    @Override // defpackage.kl
    public final p82 g(p82 p82Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t72 t72Var = (t72) list.get(i);
            int iC = t72Var.a.c();
            if ((this.h & iC) != 0) {
                F(iC).setValue(t72Var);
            }
        }
        H(p82Var);
        return p82Var;
    }

    @Override // defpackage.kl
    public final n81 h(t72 t72Var, n81 n81Var) {
        p82 p82Var = this.i;
        boolean z = false;
        this.g = false;
        this.i = null;
        if (t72Var.a.a() > 0 && p82Var != null) {
            int iC = t72Var.a.c();
            p82 p82VarE = E();
            eh0 eh0VarH = p82VarE != null ? p82VarE.a.h(iC) : null;
            eh0 eh0VarH2 = p82Var.a.h(iC);
            if (!xi0.o(eh0VarH2, eh0VarH) && eh0VarH != null) {
                this.h |= iC;
                F(iC).setValue(t72Var);
                G(iC).setValue(new y82(eh0VarH, eh0VarH2));
                synchronized (aq1.c) {
                    ay0 ay0Var = aq1.j.h;
                    if (ay0Var != null) {
                        if (ay0Var.h()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    aq1.a();
                    return n81Var;
                }
            }
        }
        return n81Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = h62.a;
        b62.b(view, this);
        h62.c(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = h62.a;
        b62.b(view, null);
        h62.c(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            p82 p82Var = this.i;
            if (p82Var != null) {
                H(p82Var);
                this.i = null;
            }
        }
    }
}
