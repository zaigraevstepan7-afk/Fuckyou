package p022M;

/* JADX INFO: renamed from: M.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0187d extends C0186c {

    /* JADX INFO: renamed from: c */
    public final Object f617c;

    public C0187d() {
        super(12);
        this.f617c = new Object();
    }

    @Override // p022M.C0186c
    /* JADX INFO: renamed from: a */
    public final Object mo622a() {
        Object objMo622a;
        synchronized (this.f617c) {
            objMo622a = super.mo622a();
        }
        return objMo622a;
    }

    @Override // p022M.C0186c
    /* JADX INFO: renamed from: c */
    public final boolean mo624c(Object obj) {
        boolean zMo624c;
        synchronized (this.f617c) {
            zMo624c = super.mo624c(obj);
        }
        return zMo624c;
    }
}
