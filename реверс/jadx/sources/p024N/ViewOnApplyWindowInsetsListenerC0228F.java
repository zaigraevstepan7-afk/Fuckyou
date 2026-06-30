package p024N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: N.F */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0228F implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0295x0 f769a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0282r f771c;

    public ViewOnApplyWindowInsetsListenerC0228F(View view, InterfaceC0282r interfaceC0282r) {
        this.f770b = view;
        this.f771c = interfaceC0282r;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0295x0 c0295x0M920g = C0295x0.m920g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0282r interfaceC0282r = this.f771c;
        if (i2 < 30) {
            AbstractC0229G.m699a(windowInsets, this.f770b);
            if (c0295x0M920g.equals(this.f769a)) {
                return interfaceC0282r.mo51p(view, c0295x0M920g).m925f();
            }
        }
        this.f769a = c0295x0M920g;
        C0295x0 c0295x0Mo51p = interfaceC0282r.mo51p(view, c0295x0M920g);
        if (i2 >= 30) {
            return c0295x0Mo51p.m925f();
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(view);
        return c0295x0Mo51p.m925f();
    }
}
