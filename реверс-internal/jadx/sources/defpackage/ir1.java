package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir1 {
    public static final /* synthetic */ int a = 0;

    static {
        Object oe1Var;
        Object oe1Var2;
        Exception exc = new Exception();
        String simpleName = c2.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            oe1Var = ye.class.getCanonicalName();
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        if (pe1.a(oe1Var) != null) {
            oe1Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            oe1Var2 = ir1.class.getCanonicalName();
        } catch (Throwable th2) {
            oe1Var2 = new oe1(th2);
        }
        if (pe1.a(oe1Var2) != null) {
            oe1Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
