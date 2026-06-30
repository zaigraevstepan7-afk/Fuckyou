package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hp implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ ip e;

    public hp(ip ipVar) {
        this.e = ipVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.e.e(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ip ipVar = this.e;
        ipVar.g.a.clear();
        fe1 fe1Var = ipVar.h;
        synchronized (fe1Var) {
            fe1Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ip ipVar = this.e;
        ipVar.g.a.clear();
        fe1 fe1Var = ipVar.h;
        synchronized (fe1Var) {
            fe1Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.e.t.a.setValue(Boolean.valueOf(z));
    }
}
