package p024N;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p033R0.C0354b;
import p033R0.C0356d;
import p037T0.EnumC0392a;
import p039U0.AbstractC0395b;
import p039U0.InterfaceC0394a;
import p051a1.AbstractC0451c;
import p051a1.AbstractC0454f;
import p062e1.C0696a;

/* JADX INFO: renamed from: N.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0246Y implements Serializable {

    /* JADX INFO: renamed from: a */
    public final C0696a f787a;

    /* JADX INFO: renamed from: b */
    public int f788b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0696a f789c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f790d;

    public C0246Y(View view, C0696a c0696a) {
        this.f790d = view;
        this.f787a = c0696a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m796a(Object obj) throws Throwable {
        Object obj2;
        EnumC0392a enumC0392a = EnumC0392a.f1063a;
        int i2 = this.f788b;
        View view = this.f790d;
        if (i2 == 0) {
            if (obj instanceof C0354b) {
                throw ((C0354b) obj).f994a;
            }
            C0696a c0696a = this.f789c;
            this.f789c = c0696a;
            this.f788b = 1;
            c0696a.f2775b = view;
            c0696a.f2774a = 3;
            c0696a.f2777d = this;
            return enumC0392a;
        }
        C0356d c0356d = C0356d.f999c;
        if (i2 == 1) {
            C0696a c0696a2 = this.f789c;
            if (obj instanceof C0354b) {
                throw ((C0354b) obj).f994a;
            }
            if (view instanceof ViewGroup) {
                this.f789c = null;
                this.f788b = 2;
                c0696a2.getClass();
                C0292w c0292w = new C0292w(new C0245X((ViewGroup) view));
                if (c0292w.f880b.hasNext()) {
                    c0696a2.f2776c = c0292w;
                    c0696a2.f2774a = 2;
                    c0696a2.f2777d = this;
                    obj2 = enumC0392a;
                } else {
                    obj2 = c0356d;
                }
                if (obj2 != enumC0392a) {
                    obj2 = c0356d;
                }
                if (obj2 == enumC0392a) {
                    return enumC0392a;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof C0354b) {
                throw ((C0354b) obj).f994a;
            }
        }
        return c0356d;
    }

    /* JADX INFO: renamed from: b */
    public final String m797b() {
        int iIntValue;
        String strM1098c;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0394a interfaceC0394a = (InterfaceC0394a) getClass().getAnnotation(InterfaceC0394a.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC0394a != null) {
            int iM1102v = interfaceC0394a.m1102v();
            if (iM1102v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM1102v + ". Please update the Kotlin standard library.").toString());
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
            int i2 = iIntValue >= 0 ? interfaceC0394a.m1100l()[iIntValue] : -1;
            C0270l c0270l = AbstractC0395b.f1067b;
            C0270l c0270l2 = AbstractC0395b.f1066a;
            if (c0270l == null) {
                try {
                    C0270l c0270l3 = new C0270l(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    AbstractC0395b.f1067b = c0270l3;
                    c0270l = c0270l3;
                } catch (Exception unused2) {
                    AbstractC0395b.f1067b = c0270l2;
                    c0270l = c0270l2;
                }
            }
            if (c0270l != c0270l2) {
                Method method = (Method) c0270l.f836a;
                Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (objInvoke != null) {
                    Method method2 = (Method) c0270l.f837b;
                    Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                    if (objInvoke2 != null) {
                        Method method3 = (Method) c0270l.f838c;
                        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                        if (objInvoke3 instanceof String) {
                            str = (String) objInvoke3;
                        }
                    }
                }
            }
            if (str == null) {
                strM1098c = interfaceC0394a.m1098c();
            } else {
                strM1098c = str + '/' + interfaceC0394a.m1098c();
            }
            name = new StackTraceElement(strM1098c, interfaceC0394a.m1101m(), interfaceC0394a.m1099f(), i2);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f787a != null) {
            return m797b();
        }
        AbstractC0454f.f1148a.getClass();
        String string = C0246Y.class.getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0451c.m1145d(string, "renderLambdaToString(this)");
        return string;
    }
}
