package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye implements ks, xt, Serializable {
    public final ks e;

    public ye(ks ksVar) {
        this.e = ksVar;
    }

    @Override // defpackage.xt
    public xt d() {
        ks ksVar = this.e;
        if (ksVar instanceof xt) {
            return (xt) ksVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ks
    public final void g(Object obj) {
        ?? r2 = this;
        while (true) {
            ye yeVar = (ye) r2;
            ks ksVar = yeVar.e;
            ksVar.getClass();
            try {
                obj = yeVar.q(obj);
                if (obj == wt.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new oe1(th);
            }
            yeVar.r();
            if (!(ksVar instanceof ye)) {
                ksVar.g(obj);
                return;
            }
            r2 = ksVar;
        }
    }

    public ks o(ks ksVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement p() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        ov ovVar = (ov) getClass().getAnnotation(ov.class);
        String str = null;
        if (ovVar == null || ovVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? ovVar.l()[iIntValue] : -1;
        oc ocVar = nu0.k;
        oc ocVar2 = nu0.l;
        if (ocVar2 == null) {
            try {
                oc ocVar3 = new oc(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                nu0.l = ocVar3;
                ocVar2 = ocVar3;
            } catch (Exception unused2) {
                nu0.l = ocVar;
                ocVar2 = ocVar;
            }
        }
        if (ocVar2 != ocVar && (method = (Method) ocVar2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) ocVar2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) ocVar2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = ovVar.c();
        } else {
            strC = str + '/' + ovVar.c();
        }
        return new StackTraceElement(strC, ovVar.m(), ovVar.f(), i);
    }

    public abstract Object q(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objP = p();
        if (objP == null) {
            objP = getClass().getName();
        }
        sb.append(objP);
        return sb.toString();
    }

    public void r() {
    }
}
