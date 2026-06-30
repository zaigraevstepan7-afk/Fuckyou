package p078n;

import java.util.HashMap;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1007a extends C1012f {

    /* JADX INFO: renamed from: e */
    public final HashMap f3996e = new HashMap();

    @Override // p078n.C1012f
    /* JADX INFO: renamed from: a */
    public final C1009c mo2457a(Object obj) {
        return (C1009c) this.f3996e.get(obj);
    }

    @Override // p078n.C1012f
    /* JADX INFO: renamed from: b */
    public final Object mo2458b(Object obj) {
        Object objMo2458b = super.mo2458b(obj);
        this.f3996e.remove(obj);
        return objMo2458b;
    }
}
