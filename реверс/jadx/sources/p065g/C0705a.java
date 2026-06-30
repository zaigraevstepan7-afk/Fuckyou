package p065g;

import android.graphics.drawable.Animatable;
import p036T.AbstractC0383m;
import p075l0.C0989e;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0705a extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f2779p;

    /* JADX INFO: renamed from: q */
    public final Animatable f2780q;

    public /* synthetic */ C0705a(Animatable animatable, int i2) {
        this.f2779p = i2;
        this.f2780q = animatable;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: i0 */
    public final void mo1075i0() {
        switch (this.f2779p) {
            case 0:
                this.f2780q.start();
                break;
            default:
                ((C0989e) this.f2780q).start();
                break;
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: j0 */
    public final void mo1077j0() {
        switch (this.f2779p) {
            case 0:
                this.f2780q.stop();
                break;
            default:
                ((C0989e) this.f2780q).stop();
                break;
        }
    }
}
