package p024N;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000A.C0001b;
import p026O.C0306f;
import p026O.C0311k;
import p026O.InterfaceC0321u;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public class C0250b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f793c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f794a;

    /* JADX INFO: renamed from: b */
    public final C0248a f795b;

    public C0250b() {
        this(f793c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo810a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f794a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0001b mo811b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f794a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0001b(7, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo250c(View view, AccessibilityEvent accessibilityEvent) {
        this.f794a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo251d(View view, C0311k c0311k) {
        this.f794a.onInitializeAccessibilityNodeInfo(view, c0311k.f911a);
    }

    /* JADX INFO: renamed from: e */
    public void mo631e(View view, AccessibilityEvent accessibilityEvent) {
        this.f794a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo812f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f794a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo813g(View view, int i2, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.resc);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            C0306f c0306f = (C0306f) list.get(i3);
            if (c0306f.m940a() == i2) {
                InterfaceC0321u interfaceC0321u = c0306f.f908d;
                if (interfaceC0321u != null) {
                    Class cls = c0306f.f907c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC0321u.mo48m(view);
                }
            } else {
                i3++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f794a.performAccessibilityAction(view, i2, bundle);
        }
        if (zPerformAccessibilityAction || i2 != R.id.resc || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.resc);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public void mo814h(View view, int i2) {
        this.f794a.sendAccessibilityEvent(view, i2);
    }

    /* JADX INFO: renamed from: i */
    public void mo815i(View view, AccessibilityEvent accessibilityEvent) {
        this.f794a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0250b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f794a = accessibilityDelegate;
        this.f795b = new C0248a(this);
    }
}
