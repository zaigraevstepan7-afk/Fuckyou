package p026O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: O.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0301a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f890a;

    /* JADX INFO: renamed from: b */
    public final C0311k f891b;

    /* JADX INFO: renamed from: c */
    public final int f892c;

    public C0301a(int i2, C0311k c0311k, int i3) {
        this.f890a = i2;
        this.f891b = c0311k;
        this.f892c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f890a);
        this.f891b.f911a.performAction(this.f892c, bundle);
    }
}
