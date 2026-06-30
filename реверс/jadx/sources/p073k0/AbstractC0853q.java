package p073k0;

import android.widget.FrameLayout;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p084q.C1027f;

/* JADX INFO: renamed from: k0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853q {

    /* JADX INFO: renamed from: a */
    public static final C0837a f3483a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f3484b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f3485c;

    static {
        C0837a c0837a = new C0837a();
        c0837a.f3417A = new ArrayList();
        c0837a.f3420D = false;
        c0837a.f3421E = 0;
        c0837a.f3418B = false;
        c0837a.m2226I(new C0844h(2));
        c0837a.m2226I(new C0842f());
        c0837a.m2226I(new C0844h(1));
        f3483a = c0837a;
        f3484b = new ThreadLocal();
        f3485c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m2260a(FrameLayout frameLayout, AbstractC0849m abstractC0849m) {
        ArrayList arrayList = f3485c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0849m == null) {
            abstractC0849m = f3483a;
        }
        AbstractC0849m abstractC0849mClone = abstractC0849m.clone();
        ArrayList arrayList2 = (ArrayList) m2261b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0849m) it.next()).mo2233w(frameLayout);
            }
        }
        abstractC0849mClone.m2252h(frameLayout, true);
        if (frameLayout.getTag(R.id.resc) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.resc, null);
        ViewTreeObserverOnPreDrawListenerC0852p viewTreeObserverOnPreDrawListenerC0852p = new ViewTreeObserverOnPreDrawListenerC0852p();
        viewTreeObserverOnPreDrawListenerC0852p.f3481a = abstractC0849mClone;
        viewTreeObserverOnPreDrawListenerC0852p.f3482b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0852p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0852p);
    }

    /* JADX INFO: renamed from: b */
    public static C1027f m2261b() {
        C1027f c1027f;
        ThreadLocal threadLocal = f3484b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1027f = (C1027f) weakReference.get()) != null) {
            return c1027f;
        }
        C1027f c1027f2 = new C1027f(0);
        threadLocal.set(new WeakReference(c1027f2));
        return c1027f2;
    }
}
