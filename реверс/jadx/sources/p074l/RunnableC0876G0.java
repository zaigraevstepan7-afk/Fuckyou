package p074l;

/* JADX INFO: renamed from: l.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0876G0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0884K0 f3536b;

    public /* synthetic */ RunnableC0876G0(C0884K0 c0884k0, int i2) {
        this.f3535a = i2;
        this.f3536b = c0884k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3535a) {
            case 0:
                C0980x0 c0980x0 = this.f3536b.f3554c;
                if (c0980x0 != null) {
                    c0980x0.setListSelectionHidden(true);
                    c0980x0.requestLayout();
                }
                break;
            default:
                C0884K0 c0884k0 = this.f3536b;
                C0980x0 c0980x02 = c0884k0.f3554c;
                if (c0980x02 != null && c0980x02.isAttachedToWindow() && c0884k0.f3554c.getCount() > c0884k0.f3554c.getChildCount() && c0884k0.f3554c.getChildCount() <= c0884k0.f3564m) {
                    c0884k0.f3577z.setInputMethodMode(2);
                    c0884k0.mo2150i();
                    break;
                }
                break;
        }
    }
}
