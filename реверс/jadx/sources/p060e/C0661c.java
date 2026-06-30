package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0661c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final C0665g f2637a;

    /* JADX INFO: renamed from: b */
    public final C0662d f2638b;

    static {
        ZLoader.registerNativesForClass(100, C0661c.class);
        Hidden0.special_clinit_100_00(C0661c.class);
    }

    public C0661c(C0662d c0662d, C0665g c0665g) {
        this.f2638b = c0662d;
        this.f2637a = c0665g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final native void onItemClick(AdapterView adapterView, View view, int i2, long j2);
}
