package defpackage;

import android.view.View;
import android.view.Window;
import com.reddit.frontpage.MainActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn implements vo0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tn(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        Window window;
        View viewPeekDecorView;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj;
                if (po0Var == po0.ON_STOP && (window = mainActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                MainActivity mainActivity2 = (MainActivity) obj;
                if (po0Var == po0.ON_DESTROY) {
                    mainActivity2.f.b = null;
                    if (!mainActivity2.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = mainActivity2.e().a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((o62) it.next()).b();
                        }
                        linkedHashMap.clear();
                    }
                    xn xnVar = mainActivity2.j;
                    MainActivity mainActivity3 = xnVar.h;
                    mainActivity3.getWindow().getDecorView().removeCallbacks(xnVar);
                    mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xnVar);
                }
                break;
            default:
                uh1 uh1Var = (uh1) obj;
                if (po0Var == po0.ON_START) {
                    uh1Var.h = true;
                } else if (po0Var == po0.ON_STOP) {
                    uh1Var.h = false;
                }
                break;
        }
    }
}
