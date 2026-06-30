package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o20 extends View {
    public final /* synthetic */ of e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(of ofVar, Context context) {
        super(context);
        this.e = ofVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.e.run();
    }
}
