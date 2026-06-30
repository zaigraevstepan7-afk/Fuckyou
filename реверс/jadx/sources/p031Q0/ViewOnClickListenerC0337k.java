package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;

/* JADX INFO: renamed from: Q0.k */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0337k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f959a;

    /* JADX INFO: renamed from: b */
    public final C0339m f960b;

    /* JADX INFO: renamed from: c */
    public final C0340n f961c;

    static {
        ZLoader.registerNativesForClass(64, ViewOnClickListenerC0337k.class);
        Hidden0.special_clinit_64_00(ViewOnClickListenerC0337k.class);
    }

    public /* synthetic */ ViewOnClickListenerC0337k(C0339m c0339m, C0340n c0340n, int i2) {
        this.f959a = i2;
        this.f960b = c0339m;
        this.f961c = c0340n;
    }

    /* JADX INFO: renamed from: ۡۦۣ۟, reason: not valid java name and contains not printable characters */
    public static native int m3279(Object obj);

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
