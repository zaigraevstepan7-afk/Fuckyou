package androidx.fragment.app;

import android.view.View;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.fragment.app.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0545o extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractComponentCallbacksC0548r f1746p;

    public C0545o(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        this.f1746p = abstractComponentCallbacksC0548r;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: N */
    public final View mo1063N(int i2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1746p;
        View view = abstractComponentCallbacksC0548r.f1763E;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0548r + " does not have a view");
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: O */
    public final boolean mo1064O() {
        return this.f1746p.f1763E != null;
    }
}
