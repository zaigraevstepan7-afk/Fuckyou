package p005C0;

import android.view.View;
import java.util.WeakHashMap;
import p024N.AbstractC0227E;
import p024N.AbstractC0240S;

/* JADX INFO: renamed from: C0.o */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0049o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
