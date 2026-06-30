package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: e.f */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0664f extends ArrayAdapter {
    static {
        ZLoader.registerNativesForClass(103, C0664f.class);
        Hidden0.special_clinit_103_00(C0664f.class);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final native long getItemId(int i2);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final native boolean hasStableIds();
}
