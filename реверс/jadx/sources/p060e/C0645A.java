package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractC0537g;

/* JADX INFO: renamed from: e.A */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0645A extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final AbstractC0537g f2507a;

    static {
        ZLoader.registerNativesForClass(83, C0645A.class);
        Hidden0.special_clinit_83_00(C0645A.class);
    }

    public C0645A(AbstractC0537g abstractC0537g) {
        this.f2507a = abstractC0537g;
    }

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
