package p026O;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: O.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0306f {

    /* JADX INFO: renamed from: e */
    public static final C0306f f894e;

    /* JADX INFO: renamed from: f */
    public static final C0306f f895f;

    /* JADX INFO: renamed from: g */
    public static final C0306f f896g;

    /* JADX INFO: renamed from: h */
    public static final C0306f f897h;

    /* JADX INFO: renamed from: i */
    public static final C0306f f898i;

    /* JADX INFO: renamed from: j */
    public static final C0306f f899j;

    /* JADX INFO: renamed from: k */
    public static final C0306f f900k;

    /* JADX INFO: renamed from: l */
    public static final C0306f f901l;

    /* JADX INFO: renamed from: m */
    public static final C0306f f902m;

    /* JADX INFO: renamed from: n */
    public static final C0306f f903n;

    /* JADX INFO: renamed from: o */
    public static final C0306f f904o;

    /* JADX INFO: renamed from: a */
    public final Object f905a;

    /* JADX INFO: renamed from: b */
    public final int f906b;

    /* JADX INFO: renamed from: c */
    public final Class f907c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0321u f908d;

    static {
        new C0306f(1);
        new C0306f(2);
        new C0306f(4);
        new C0306f(8);
        f894e = new C0306f(16);
        new C0306f(32);
        new C0306f(64);
        new C0306f(128);
        new C0306f(256, AbstractC0314n.class);
        new C0306f(512, AbstractC0314n.class);
        new C0306f(1024, AbstractC0315o.class);
        new C0306f(2048, AbstractC0315o.class);
        f895f = new C0306f(4096);
        f896g = new C0306f(8192);
        new C0306f(16384);
        new C0306f(32768);
        new C0306f(65536);
        new C0306f(131072, AbstractC0319s.class);
        f897h = new C0306f(262144);
        f898i = new C0306f(524288);
        f899j = new C0306f(1048576);
        new C0306f(2097152, AbstractC0320t.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        f900k = new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0317q.class);
        f901l = new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f902m = new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C0306f(i2 >= 29 ? AbstractC0000a.m13j() : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0306f(i2 >= 29 ? AbstractC0000a.m24u() : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0306f(i2 >= 29 ? AbstractC0000a.m28y() : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0306f(i2 >= 29 ? AbstractC0000a.m1B() : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0306f(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        f903n = new C0306f(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC0318r.class);
        new C0306f(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC0316p.class);
        new C0306f(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0306f(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0306f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0306f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0306f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0306f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0306f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0306f(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f904o = new C0306f(i2 >= 34 ? AbstractC0309i.m954a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0306f(int i2) {
        this(null, i2, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m940a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f905a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0306f)) {
            return false;
        }
        Object obj2 = ((C0306f) obj).f905a;
        Object obj3 = this.f905a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f905a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM967d = C0311k.m967d(this.f906b);
        if (strM967d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f905a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM967d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM967d);
        return sb.toString();
    }

    public C0306f(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public C0306f(Object obj, int i2, String str, InterfaceC0321u interfaceC0321u, Class cls) {
        this.f906b = i2;
        this.f908d = interfaceC0321u;
        if (obj == null) {
            this.f905a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f905a = obj;
        }
        this.f907c = cls;
    }
}
