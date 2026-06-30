package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: M0.w */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0217w implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final int f745a;

    /* JADX INFO: renamed from: b */
    public final Object f746b;

    static {
        ZLoader.registerNativesForClass(49, C0217w.class);
        Hidden0.special_clinit_49_00(C0217w.class);
    }

    public /* synthetic */ C0217w(int i2, Object obj) {
        this.f745a = i2;
        this.f746b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final native void onItemClick(AdapterView adapterView, View view, int i2, long j2);
}
