package p024N;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p026O.C0306f;
import p026O.InterfaceC0321u;
import p036T.C0389s;
import p074l.C0977w;

/* JADX INFO: renamed from: N.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0240S {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f777a;

    /* JADX INFO: renamed from: b */
    public static Field f778b;

    /* JADX INFO: renamed from: c */
    public static boolean f779c;

    /* JADX INFO: renamed from: d */
    public static ThreadLocal f780d;

    /* JADX INFO: renamed from: e */
    public static final int[] f781e = {R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc, R.id.resc};

    /* JADX INFO: renamed from: f */
    public static final C0221A f782f = new C0221A();

    /* JADX INFO: renamed from: g */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0225C f783g = new ViewTreeObserverOnGlobalLayoutListenerC0225C();

    /* JADX INFO: renamed from: a */
    public static C0249a0 m770a(View view) {
        if (f777a == null) {
            f777a = new WeakHashMap();
        }
        C0249a0 c0249a0 = (C0249a0) f777a.get(view);
        if (c0249a0 != null) {
            return c0249a0;
        }
        C0249a0 c0249a02 = new C0249a0(view);
        f777a.put(view, c0249a02);
        return c0249a02;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m771b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0239Q.f773d;
        C0239Q c0239q = (C0239Q) view.getTag(R.id.resc);
        if (c0239q == null) {
            c0239q = new C0239Q();
            c0239q.f774a = null;
            c0239q.f775b = null;
            c0239q.f776c = null;
            view.setTag(R.id.resc, c0239q);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0239q.f774a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0239Q.f773d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0239q.f774a == null) {
                            c0239q.f774a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0239Q.f773d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0239q.f774a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0239q.f774a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM769a = c0239q.m769a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM769a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0239q.f775b == null) {
                    c0239q.f775b = new SparseArray();
                }
                c0239q.f775b.put(keyCode, new WeakReference(viewM769a));
            }
        }
        return viewM769a != null;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m772c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0234L.m755a(view);
        }
        if (f779c) {
            return null;
        }
        if (f778b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f778b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f779c = true;
                return null;
            }
        }
        try {
            Object obj = f778b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f779c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m773d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0233K.m746b(view);
        } else {
            tag = view.getTag(R.id.resc);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m774e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.resc);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.resc, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static Rect m775f() {
        if (f780d == null) {
            f780d = new ThreadLocal();
        }
        Rect rect = (Rect) f780d.get();
        if (rect == null) {
            rect = new Rect();
            f780d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m776g(C0977w c0977w) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0236N.m766a(c0977w) : (String[]) c0977w.getTag(R.id.resc);
    }

    /* JADX INFO: renamed from: h */
    public static C0295x0 m777h(View view) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC0230H.m725a(view) : AbstractC0229G.m708j(view);
    }

    /* JADX INFO: renamed from: i */
    public static void m778i(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m773d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(m773d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m773d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m779j(View view, int i2) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect rectM775f = m775f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM775f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectM775f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            m788s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m788s((View) parent2);
            }
        }
        if (z2 && rectM775f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM775f);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m780k(View view, int i2) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect rectM775f = m775f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM775f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectM775f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            m788s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m788s((View) parent2);
            }
        }
        if (z2 && rectM775f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM775f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static C0258f m781l(View view, C0258f c0258f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0258f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0236N.m767b(view, c0258f);
        }
        InterfaceC0284s interfaceC0284s = (InterfaceC0284s) view.getTag(R.id.resc);
        InterfaceC0286t interfaceC0286t = f782f;
        if (interfaceC0284s == null) {
            if (view instanceof InterfaceC0286t) {
                interfaceC0286t = (InterfaceC0286t) view;
            }
            return interfaceC0286t.mo690a(c0258f);
        }
        C0258f c0258fM1096a = ((C0389s) interfaceC0284s).m1096a(view, c0258f);
        if (c0258fM1096a == null) {
            return null;
        }
        if (view instanceof InterfaceC0286t) {
            interfaceC0286t = (InterfaceC0286t) view;
        }
        return interfaceC0286t.mo690a(c0258fM1096a);
    }

    /* JADX INFO: renamed from: m */
    public static void m782m(View view, int i2) {
        ArrayList arrayListM774e = m774e(view);
        for (int i3 = 0; i3 < arrayListM774e.size(); i3++) {
            if (((C0306f) arrayListM774e.get(i3)).m940a() == i2) {
                arrayListM774e.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m783n(View view, C0306f c0306f, InterfaceC0321u interfaceC0321u) {
        C0306f c0306f2 = new C0306f(null, c0306f.f906b, null, interfaceC0321u, c0306f.f907c);
        View.AccessibilityDelegate accessibilityDelegateM772c = m772c(view);
        C0250b c0250b = accessibilityDelegateM772c == null ? null : accessibilityDelegateM772c instanceof C0248a ? ((C0248a) accessibilityDelegateM772c).f791a : new C0250b(accessibilityDelegateM772c);
        if (c0250b == null) {
            c0250b = new C0250b();
        }
        m785p(view, c0250b);
        m782m(view, c0306f2.m940a());
        m774e(view).add(c0306f2);
        m778i(view, 0);
    }

    /* JADX INFO: renamed from: o */
    public static void m784o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0234L.m758d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m785p(View view, C0250b c0250b) {
        if (c0250b == null && (m772c(view) instanceof C0248a)) {
            c0250b = new C0250b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0250b == null ? null : c0250b.f795b);
    }

    /* JADX INFO: renamed from: q */
    public static void m786q(View view, CharSequence charSequence) {
        new C0223B(R.id.resc, CharSequence.class, 8, 28, 1).m695d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0225C viewTreeObserverOnGlobalLayoutListenerC0225C = f783g;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0225C.f764a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0225C);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0225C);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0225C.f764a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0225C);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0225C);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m787r(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0229G.m715q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (AbstractC0229G.m705g(view) == null && AbstractC0229G.m706h(view) == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m788s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
