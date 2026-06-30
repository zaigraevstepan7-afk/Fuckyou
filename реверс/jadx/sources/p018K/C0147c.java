package p018K;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: K.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0147c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f462a;

    /* JADX INFO: renamed from: b */
    public final ContentProviderClient f463b;

    public C0147c(Context context, Uri uri, int i2) {
        this.f462a = i2;
        switch (i2) {
            case 1:
                this.f463b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f463b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m555a() {
        switch (this.f462a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f463b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f463b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                }
                break;
        }
    }
}
