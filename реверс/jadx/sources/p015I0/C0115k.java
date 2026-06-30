package p015I0;

import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: I0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0115k extends AbstractC0016e {
    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: M */
    public final void mo207M(C0127w c0127w, float f, float f2) {
        c0127w.m504d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0123s c0123s = new C0123s(0.0f, 0.0f, f3, f3);
        c0123s.f419f = 180.0f;
        c0123s.f420g = 90.0f;
        c0127w.f432g.add(c0123s);
        C0121q c0121q = new C0121q(c0123s);
        c0127w.m501a(180.0f);
        c0127w.f433h.add(c0121q);
        c0127w.f430e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        c0127w.f428c = (((float) Math.cos(Math.toRadians(d2))) * f5) + f4;
        c0127w.f429d = (f5 * ((float) Math.sin(Math.toRadians(d2)))) + f4;
    }
}
