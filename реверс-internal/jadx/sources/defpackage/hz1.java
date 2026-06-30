package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz1 implements Executor {
    public final /* synthetic */ View e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.postOnAnimation(runnable);
    }
}
