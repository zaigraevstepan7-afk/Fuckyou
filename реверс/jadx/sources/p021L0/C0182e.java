package p021L0;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: L0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0182e implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0183f f610a;

    public C0182e(C0183f c0183f) {
        this.f610a = c0183f;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0183f c0183f = this.f610a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0183f.f612a) {
            throw null;
        }
    }
}
