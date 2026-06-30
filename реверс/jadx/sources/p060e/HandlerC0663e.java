package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: e.e */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0663e extends Handler {

    /* JADX INFO: renamed from: a */
    public WeakReference f2658a;

    static {
        ZLoader.registerNativesForClass(102, HandlerC0663e.class);
        Hidden0.special_clinit_102_00(HandlerC0663e.class);
    }

    @Override // android.os.Handler
    public final native void handleMessage(Message message);
}
