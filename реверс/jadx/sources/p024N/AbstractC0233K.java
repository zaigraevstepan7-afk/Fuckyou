package p024N;

import android.view.View;
import com.reddit.frontpage.R;
import java.util.Objects;
import p030Q.AbstractC0326a;
import p084q.C1031j;

/* JADX INFO: renamed from: N.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233K {
    /* JADX INFO: renamed from: a */
    public static void m745a(View view, InterfaceC0238P interfaceC0238P) {
        C1031j c1031j = (C1031j) view.getTag(R.id.resc);
        if (c1031j == null) {
            c1031j = new C1031j(0);
            view.setTag(R.id.resc, c1031j);
        }
        Objects.requireNonNull(interfaceC0238P);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0232J = new ViewOnUnhandledKeyEventListenerC0232J();
        c1031j.put(interfaceC0238P, viewOnUnhandledKeyEventListenerC0232J);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0232J);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m746b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m747c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m748d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m749e(View view, InterfaceC0238P interfaceC0238P) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1031j c1031j = (C1031j) view.getTag(R.id.resc);
        if (c1031j == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1031j.get(interfaceC0238P)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m750f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m751g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* JADX INFO: renamed from: h */
    public static void m752h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m753i(View view, AbstractC0326a abstractC0326a) {
        view.setAutofillId(null);
    }

    /* JADX INFO: renamed from: j */
    public static void m754j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
