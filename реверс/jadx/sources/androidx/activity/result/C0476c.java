package androidx.activity.result;

import androidx.fragment.app.C0514D;
import java.util.HashMap;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.activity.result.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0476c extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f1218p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0514D f1219q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ AbstractC0480g f1220r;

    public C0476c(AbstractC0480g abstractC0480g, String str, C0514D c0514d) {
        this.f1220r = abstractC0480g;
        this.f1218p = str;
        this.f1219q = c0514d;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1177q0(Object obj) {
        AbstractC0480g abstractC0480g = this.f1220r;
        HashMap map = abstractC0480g.f1228b;
        String str = this.f1218p;
        Integer num = (Integer) map.get(str);
        C0514D c0514d = this.f1219q;
        if (num != null) {
            abstractC0480g.f1230d.add(str);
            try {
                abstractC0480g.mo1158b(num.intValue(), c0514d, obj);
                return;
            } catch (Exception e2) {
                abstractC0480g.f1230d.remove(str);
                throw e2;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0514d + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
