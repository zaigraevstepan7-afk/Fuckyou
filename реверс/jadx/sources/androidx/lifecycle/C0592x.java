package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0543m;
import java.util.Map;
import p000A.C0001b;
import p076m.C1002a;
import p078n.C1009c;
import p078n.C1010d;
import p078n.C1012f;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public class C0592x {

    /* JADX INFO: renamed from: j */
    public static final Object f1889j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f1890a = new Object();

    /* JADX INFO: renamed from: b */
    public final C1012f f1891b = new C1012f();

    /* JADX INFO: renamed from: c */
    public int f1892c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f1893d;

    /* JADX INFO: renamed from: e */
    public volatile Object f1894e;

    /* JADX INFO: renamed from: f */
    public volatile Object f1895f;

    /* JADX INFO: renamed from: g */
    public int f1896g;

    /* JADX INFO: renamed from: h */
    public boolean f1897h;

    /* JADX INFO: renamed from: i */
    public boolean f1898i;

    public C0592x() {
        Object obj = f1889j;
        this.f1895f = obj;
        this.f1894e = obj;
        this.f1896g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m1493a(String str) {
        ((C1002a) C1002a.m2447q0().f3983p).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: renamed from: b */
    public final void m1494b(AbstractC0591w abstractC0591w) {
        if (abstractC0591w.f1886b) {
            if (!abstractC0591w.mo1475e()) {
                abstractC0591w.m1492c(false);
                return;
            }
            int i2 = abstractC0591w.f1887c;
            int i3 = this.f1896g;
            if (i2 >= i3) {
                return;
            }
            abstractC0591w.f1887c = i3;
            C0001b c0001b = abstractC0591w.f1885a;
            Object obj = this.f1894e;
            c0001b.getClass();
            if (((InterfaceC0586r) obj) != null) {
                DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m = (DialogInterfaceOnCancelListenerC0543m) c0001b.f1b;
                if (dialogInterfaceOnCancelListenerC0543m.f1737Y) {
                    View viewM1454C = dialogInterfaceOnCancelListenerC0543m.m1454C();
                    if (viewM1454C.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0543m.f1741c0 != null) {
                        if (C0518H.m1330F(3)) {
                            Log.d("FragmentManager", "DialogFragment " + c0001b + " setting the content view on " + dialogInterfaceOnCancelListenerC0543m.f1741c0);
                        }
                        dialogInterfaceOnCancelListenerC0543m.f1741c0.setContentView(viewM1454C);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1495c(AbstractC0591w abstractC0591w) {
        if (this.f1897h) {
            this.f1898i = true;
            return;
        }
        this.f1897h = true;
        do {
            this.f1898i = false;
            if (abstractC0591w != null) {
                m1494b(abstractC0591w);
                abstractC0591w = null;
            } else {
                C1012f c1012f = this.f1891b;
                c1012f.getClass();
                C1010d c1010d = new C1010d(c1012f);
                c1012f.f4009c.put(c1010d, Boolean.FALSE);
                while (c1010d.hasNext()) {
                    m1494b((AbstractC0591w) ((Map.Entry) c1010d.next()).getValue());
                    if (this.f1898i) {
                        break;
                    }
                }
            }
        } while (this.f1898i);
        this.f1897h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m1496d(C0001b c0001b) {
        Object obj;
        m1493a("observeForever");
        C0590v c0590v = new C0590v(this, c0001b);
        C1012f c1012f = this.f1891b;
        C1009c c1009cMo2457a = c1012f.mo2457a(c0001b);
        if (c1009cMo2457a != null) {
            obj = c1009cMo2457a.f4001b;
        } else {
            C1009c c1009c = new C1009c(c0001b, c0590v);
            c1012f.f4010d++;
            C1009c c1009c2 = c1012f.f4008b;
            if (c1009c2 == null) {
                c1012f.f4007a = c1009c;
                c1012f.f4008b = c1009c;
            } else {
                c1009c2.f4002c = c1009c;
                c1009c.f4003d = c1009c2;
                c1012f.f4008b = c1009c;
            }
            obj = null;
        }
        AbstractC0591w abstractC0591w = (AbstractC0591w) obj;
        if (abstractC0591w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0591w != null) {
            return;
        }
        c0590v.m1492c(true);
    }
}
