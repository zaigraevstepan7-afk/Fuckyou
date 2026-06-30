package p010F0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0088c extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f268k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TextPaint f269l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC0016e f270m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0089d f271n;

    public C0088c(C0089d c0089d, Context context, TextPaint textPaint, AbstractC0016e abstractC0016e) {
        this.f271n = c0089d;
        this.f268k = context;
        this.f269l = textPaint;
        this.f270m = abstractC0016e;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: k0 */
    public final void mo222k0(int i2) {
        this.f270m.mo222k0(i2);
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: l0 */
    public final void mo223l0(Typeface typeface, boolean z2) {
        this.f271n.m386g(this.f268k, this.f269l, typeface);
        this.f270m.mo223l0(typeface, z2);
    }
}
