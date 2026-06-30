package p042W;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000A.C0001b;
import p015I0.C0109e;
import p024N.AbstractC0240S;
import p024N.C0250b;
import p026O.C0311k;
import p036T.AbstractC0383m;
import p084q.C1032k;

/* JADX INFO: renamed from: W.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0401b extends C0250b {

    /* JADX INFO: renamed from: n */
    public static final Rect f1072n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final C0109e f1073o = new C0109e(5);

    /* JADX INFO: renamed from: p */
    public static final C0109e f1074p = new C0109e(6);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f1079h;

    /* JADX INFO: renamed from: i */
    public final View f1080i;

    /* JADX INFO: renamed from: j */
    public C0400a f1081j;

    /* JADX INFO: renamed from: d */
    public final Rect f1075d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f1076e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f1077f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f1078g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f1082k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f1083l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f1084m = Integer.MIN_VALUE;

    public AbstractC0401b(View view) {
        this.f1080i = view;
        this.f1079h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: b */
    public final C0001b mo811b(View view) {
        if (this.f1081j == null) {
            this.f1081j = new C0400a(this);
        }
        return this.f1081j;
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        this.f794a.onInitializeAccessibilityNodeInfo(view, c0311k.f911a);
        mo1111t(c0311k);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1104j(int i2) {
        if (this.f1083l != i2) {
            return false;
        }
        this.f1083l = Integer.MIN_VALUE;
        mo1112v(i2, false);
        m1114x(i2, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final AccessibilityEvent m1105k(int i2, int i3) {
        View view = this.f1080i;
        if (i2 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i3);
        C0311k c0311kM1110r = m1110r(i2);
        accessibilityEventObtain2.getText().add(c0311kM1110r.m973g());
        AccessibilityNodeInfo accessibilityNodeInfo = c0311kM1110r.f911a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i2);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    /* JADX INFO: renamed from: l */
    public final C0311k m1106l(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0311k c0311k = new C0311k(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0311k.m975i("android.view.View");
        Rect rect = f1072n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f1080i;
        accessibilityNodeInfoObtain.setParent(view);
        mo573u(i2, c0311k);
        if (c0311k.m973g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1076e;
        c0311k.m972f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c0311k.f912b = i2;
        accessibilityNodeInfoObtain.setSource(view, i2);
        if (this.f1082k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0311k.m968a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0311k.m968a(64);
        }
        boolean z2 = this.f1083l == i2;
        if (z2) {
            c0311k.m968a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0311k.m968a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f1078g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f1075d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0311k.m972f(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f1077f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0311k;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1107m(MotionEvent motionEvent) {
        int i2;
        AccessibilityManager accessibilityManager = this.f1079h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo570n = mo570n(motionEvent.getX(), motionEvent.getY());
            int i3 = this.f1084m;
            if (i3 != iMo570n) {
                this.f1084m = iMo570n;
                m1114x(iMo570n, 128);
                m1114x(i3, 256);
            }
            if (iMo570n == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i2 = this.f1084m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1084m = Integer.MIN_VALUE;
                m1114x(i2, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo570n(float f, float f2);

    /* JADX INFO: renamed from: o */
    public abstract void mo571o(ArrayList arrayList);

    /* JADX INFO: renamed from: p */
    public final void m1108p(int i2) {
        View view;
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f1079h.isEnabled() || (parent = (view = this.f1080i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM1105k = m1105k(i2, 2048);
        accessibilityEventM1105k.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventM1105k);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1109q(int i2, Rect rect) {
        Object obj;
        Object obj2;
        C0311k c0311k;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        mo571o(arrayList);
        C1032k c1032k = new C1032k();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            c1032k.m2497d(((Integer) arrayList.get(i6)).intValue(), m1106l(((Integer) arrayList.get(i6)).intValue()));
        }
        int i7 = this.f1083l;
        int i8 = Integer.MIN_VALUE;
        C0311k c0311k2 = i7 == Integer.MIN_VALUE ? null : (C0311k) c1032k.m2496c(i7);
        C0109e c0109e = f1073o;
        C0109e c0109e2 = f1074p;
        View view = this.f1080i;
        if (i2 == 1 || i2 == 2) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            boolean z2 = view.getLayoutDirection() == 1;
            c0109e2.getClass();
            int i9 = c1032k.f4107c;
            ArrayList arrayList2 = new ArrayList(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                arrayList2.add((C0311k) c1032k.f4106b[i10]);
            }
            Collections.sort(arrayList2, new C0402c(z2, c0109e));
            if (i2 == 1) {
                int size = arrayList2.size();
                if (c0311k2 != null) {
                    size = arrayList2.indexOf(c0311k2);
                }
                int i11 = size - 1;
                if (i11 >= 0) {
                    obj = arrayList2.get(i11);
                    obj2 = obj;
                }
                obj2 = null;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0311k2 == null ? -1 : arrayList2.lastIndexOf(c0311k2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    obj2 = obj;
                }
                obj2 = null;
            }
            c0311k = (C0311k) obj2;
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f1083l;
            if (i12 != Integer.MIN_VALUE) {
                m1110r(i12).m972f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i2 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i2 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i2 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i2 != 17) {
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i2 == 33) {
                    rect3.offset(0, rect2.height() + 1);
                } else if (i2 == 66) {
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c0109e2.getClass();
                i4 = c1032k.f4107c;
                Rect rect4 = new Rect();
                c0311k = null;
                for (i5 = 0; i5 < i4; i5++) {
                    C0311k c0311k3 = (C0311k) c1032k.f4106b[i5];
                    if (c0311k3 != c0311k2) {
                        c0109e.getClass();
                        c0311k3.m972f(rect4);
                        if (AbstractC0383m.m1027E(i2, rect2, rect4)) {
                            if (AbstractC0383m.m1027E(i2, rect2, rect3) && !AbstractC0383m.m1038e(i2, rect2, rect4, rect3)) {
                                if (!AbstractC0383m.m1038e(i2, rect2, rect3, rect4)) {
                                    int iM1031J = AbstractC0383m.m1031J(i2, rect2, rect4);
                                    int iM1032K = AbstractC0383m.m1032K(i2, rect2, rect4);
                                    int i13 = (iM1032K * iM1032K) + (iM1031J * 13 * iM1031J);
                                    int iM1031J2 = AbstractC0383m.m1031J(i2, rect2, rect3);
                                    int iM1032K2 = AbstractC0383m.m1032K(i2, rect2, rect3);
                                    if (i13 < (iM1032K2 * iM1032K2) + (iM1031J2 * 13 * iM1031J2)) {
                                        rect3.set(rect4);
                                        c0311k = c0311k3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Rect rect32 = new Rect(rect2);
            if (i2 != 17) {
            }
            c0109e2.getClass();
            i4 = c1032k.f4107c;
            Rect rect42 = new Rect();
            c0311k = null;
            while (i5 < i4) {
            }
        }
        C0311k c0311k4 = c0311k;
        if (c0311k4 != null) {
            int i14 = c1032k.f4107c;
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    i3 = -1;
                    break;
                }
                if (c1032k.f4106b[i15] == c0311k4) {
                    i3 = i15;
                    break;
                }
                i15++;
            }
            i8 = c1032k.f4105a[i3];
        }
        return m1113w(i8);
    }

    /* JADX INFO: renamed from: r */
    public final C0311k m1110r(int i2) {
        if (i2 != -1) {
            return m1106l(i2);
        }
        View view = this.f1080i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C0311k c0311k = new C0311k(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo571o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0311k.f911a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
        }
        return c0311k;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo572s(int i2, int i3, Bundle bundle);

    /* JADX INFO: renamed from: u */
    public abstract void mo573u(int i2, C0311k c0311k);

    /* JADX INFO: renamed from: w */
    public final boolean m1113w(int i2) {
        int i3;
        View view = this.f1080i;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.f1083l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m1104j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1083l = i2;
        mo1112v(i2, true);
        m1114x(i2, 8);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m1114x(int i2, int i3) {
        View view;
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f1079h.isEnabled() || (parent = (view = this.f1080i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, m1105k(i2, i3));
    }

    /* JADX INFO: renamed from: t */
    public void mo1111t(C0311k c0311k) {
    }

    /* JADX INFO: renamed from: v */
    public void mo1112v(int i2, boolean z2) {
    }
}
