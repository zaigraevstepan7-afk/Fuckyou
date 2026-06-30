package p033R0;

import androidx.activity.C0470o;
import java.io.Serializable;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: R0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0355c implements Serializable {

    /* JADX INFO: renamed from: a */
    public C0470o f995a;

    /* JADX INFO: renamed from: b */
    public volatile Object f996b = C0356d.f998b;

    /* JADX INFO: renamed from: c */
    public final Object f997c = this;

    public C0355c(C0470o c0470o) {
        this.f995a = c0470o;
    }

    /* JADX INFO: renamed from: a */
    public final Object m988a() {
        Object objMo1135a;
        Object obj = this.f996b;
        C0356d c0356d = C0356d.f998b;
        if (obj != c0356d) {
            return obj;
        }
        synchronized (this.f997c) {
            objMo1135a = this.f996b;
            if (objMo1135a == c0356d) {
                C0470o c0470o = this.f995a;
                AbstractC0451c.m1143b(c0470o);
                objMo1135a = c0470o.mo1135a();
                this.f996b = objMo1135a;
                this.f995a = null;
            }
        }
        return objMo1135a;
    }

    public final String toString() {
        return this.f996b != C0356d.f998b ? String.valueOf(m988a()) : "Lazy value not initialized yet.";
    }
}
