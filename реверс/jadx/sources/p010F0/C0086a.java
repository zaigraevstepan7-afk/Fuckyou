package p010F0;

import android.graphics.Typeface;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p005C0.C0037c;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0086a extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final Typeface f263k;

    /* JADX INFO: renamed from: l */
    public final C0001b f264l;

    /* JADX INFO: renamed from: m */
    public boolean f265m;

    public C0086a(C0001b c0001b, Typeface typeface) {
        this.f263k = typeface;
        this.f264l = c0001b;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: k0 */
    public final void mo222k0(int i2) {
        if (this.f265m) {
            return;
        }
        C0037c c0037c = (C0037c) this.f264l.f1b;
        if (c0037c.m261j(this.f263k)) {
            c0037c.m259h(false);
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: l0 */
    public final void mo223l0(Typeface typeface, boolean z2) {
        if (this.f265m) {
            return;
        }
        C0037c c0037c = (C0037c) this.f264l.f1b;
        if (c0037c.m261j(typeface)) {
            c0037c.m259h(false);
        }
    }
}
