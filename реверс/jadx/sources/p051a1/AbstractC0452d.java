package p051a1;

import java.io.Serializable;

/* JADX INFO: renamed from: a1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0452d implements Serializable {
    public AbstractC0452d(int i2) {
    }

    public final String toString() {
        AbstractC0454f.f1148a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0451c.m1145d(string, "renderLambdaToString(this)");
        return string;
    }
}
