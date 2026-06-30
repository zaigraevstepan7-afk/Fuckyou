package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.text.Editable;
import p005C0.AbstractC0046l;

/* JADX INFO: renamed from: M0.n */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0208n extends AbstractC0046l {

    /* JADX INFO: renamed from: a */
    public final C0212r f677a;

    static {
        ZLoader.registerNativesForClass(41, C0208n.class);
        Hidden0.special_clinit_41_00(C0208n.class);
    }

    public C0208n(C0212r c0212r) {
        this.f677a = c0212r;
    }

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // p005C0.AbstractC0046l, android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4);
}
