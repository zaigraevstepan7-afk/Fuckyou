package p072k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p074l.C0893P;
import p074l.C0894P0;
import p074l.C0900T;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0807d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3271b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0807d(int i2, Object obj) {
        this.f3270a = i2;
        this.f3271b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3270a) {
            case 0:
                ViewOnKeyListenerC0810g viewOnKeyListenerC0810g = (ViewOnKeyListenerC0810g) this.f3271b;
                if (viewOnKeyListenerC0810g.mo2148a()) {
                    ArrayList arrayList = viewOnKeyListenerC0810g.f3285h;
                    if (arrayList.size() > 0 && !((C0809f) arrayList.get(0)).f3276a.f3576y) {
                        View view = viewOnKeyListenerC0810g.f3292o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0809f) it.next()).f3276a.mo2150i();
                            }
                        } else {
                            viewOnKeyListenerC0810g.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0802D viewOnKeyListenerC0802D = (ViewOnKeyListenerC0802D) this.f3271b;
                if (viewOnKeyListenerC0802D.mo2148a()) {
                    C0894P0 c0894p0 = viewOnKeyListenerC0802D.f3237h;
                    if (!c0894p0.f3576y) {
                        View view2 = viewOnKeyListenerC0802D.f3242m;
                        if (view2 != null && view2.isShown()) {
                            c0894p0.mo2150i();
                        } else {
                            viewOnKeyListenerC0802D.dismiss();
                        }
                    }
                }
                break;
            case 2:
                C0900T c0900t = (C0900T) this.f3271b;
                if (!c0900t.getInternalPopup().mo2300a()) {
                    c0900t.f3615f.mo2304f(c0900t.getTextDirection(), c0900t.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0900t.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                C0893P c0893p = (C0893P) this.f3271b;
                C0900T c0900t2 = c0893p.f3594H;
                c0893p.getClass();
                if (c0900t2.isAttachedToWindow() && c0900t2.getGlobalVisibleRect(c0893p.f3592F)) {
                    c0893p.m2314r();
                    c0893p.mo2150i();
                } else {
                    c0893p.dismiss();
                }
                break;
        }
    }
}
