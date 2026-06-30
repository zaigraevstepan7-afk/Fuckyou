package p095w;

/* JADX INFO: renamed from: w.g */
/* JADX INFO: loaded from: classes.dex */
public class C1081g extends C1080f {

    /* JADX INFO: renamed from: m */
    public int f4466m;

    public C1081g(AbstractC1089o abstractC1089o) {
        super(abstractC1089o);
        if (abstractC1089o instanceof C1085k) {
            this.f4458e = 2;
        } else {
            this.f4458e = 3;
        }
    }

    @Override // p095w.C1080f
    /* JADX INFO: renamed from: d */
    public final void mo2667d(int i2) {
        if (this.f4463j) {
            return;
        }
        this.f4463j = true;
        this.f4460g = i2;
        for (InterfaceC1078d interfaceC1078d : this.f4464k) {
            interfaceC1078d.mo2650a(interfaceC1078d);
        }
    }
}
