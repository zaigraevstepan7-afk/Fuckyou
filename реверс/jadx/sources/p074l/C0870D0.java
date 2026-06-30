package p074l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870D0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0884K0 f3525a;

    public C0870D0(C0884K0 c0884k0) {
        this.f3525a = c0884k0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0980x0 c0980x0;
        if (i2 == -1 || (c0980x0 = this.f3525a.f3554c) == null) {
            return;
        }
        c0980x0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
