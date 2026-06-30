package p074l;

/* JADX INFO: renamed from: l.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903U0 {

    /* JADX INFO: renamed from: a */
    public int f3618a;

    /* JADX INFO: renamed from: b */
    public int f3619b;

    /* JADX INFO: renamed from: c */
    public int f3620c;

    /* JADX INFO: renamed from: d */
    public int f3621d;

    /* JADX INFO: renamed from: e */
    public int f3622e;

    /* JADX INFO: renamed from: f */
    public int f3623f;

    /* JADX INFO: renamed from: g */
    public boolean f3624g;

    /* JADX INFO: renamed from: h */
    public boolean f3625h;

    /* JADX INFO: renamed from: a */
    public final void m2332a(int i2, int i3) {
        this.f3620c = i2;
        this.f3621d = i3;
        this.f3625h = true;
        if (this.f3624g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3618a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f3619b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3618a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3619b = i3;
        }
    }
}
