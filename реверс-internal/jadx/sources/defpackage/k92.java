package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k92 extends ContentObserver {
    public final /* synthetic */ rh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k92(rh rhVar, Handler handler) {
        super(handler);
        this.a = rhVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.t(t32.a);
    }
}
