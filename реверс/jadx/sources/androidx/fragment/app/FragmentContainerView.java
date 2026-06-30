package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.reddit.frontpage.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p024N.AbstractC0227E;
import p024N.AbstractC0240S;
import p024N.C0295x0;
import p047Z.AbstractC0420a;
import p050a0.AbstractC0448d;
import p051a1.AbstractC0451c;
import p060e.AbstractActivityC0669k;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1572a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1573b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f1574c;

    /* JADX INFO: renamed from: d */
    public boolean f1575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC0451c.m1146e(context, "context");
        this.f1572a = new ArrayList();
        this.f1573b = new ArrayList();
        this.f1575d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0420a.f1135b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1329a(View view) {
        if (this.f1573b.contains(view)) {
            this.f1572a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        AbstractC0451c.m1146e(view, "child");
        Object tag = view.getTag(R.id.resc);
        if ((tag instanceof AbstractComponentCallbacksC0548r ? (AbstractComponentCallbacksC0548r) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0295x0 c0295x0M920g;
        AbstractC0451c.m1146e(windowInsets, "insets");
        C0295x0 c0295x0M920g2 = C0295x0.m920g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1574c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0451c.m1145d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0295x0M920g = C0295x0.m920g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            WindowInsets windowInsetsM925f = c0295x0M920g2.m925f();
            if (windowInsetsM925f != null) {
                WindowInsets windowInsetsM697b = AbstractC0227E.m697b(this, windowInsetsM925f);
                if (!windowInsetsM697b.equals(windowInsetsM925f)) {
                    c0295x0M920g2 = C0295x0.m920g(this, windowInsetsM697b);
                }
            }
            c0295x0M920g = c0295x0M920g2;
        }
        if (!c0295x0M920g.f882a.mo907m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
                WindowInsets windowInsetsM925f2 = c0295x0M920g.m925f();
                if (windowInsetsM925f2 != null) {
                    WindowInsets windowInsetsM696a = AbstractC0227E.m696a(childAt, windowInsetsM925f2);
                    if (!windowInsetsM696a.equals(windowInsetsM925f2)) {
                        C0295x0.m920g(childAt, windowInsetsM696a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0451c.m1146e(canvas, "canvas");
        if (this.f1575d) {
            Iterator it = this.f1572a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0451c.m1146e(canvas, "canvas");
        AbstractC0451c.m1146e(view, "child");
        if (this.f1575d) {
            ArrayList arrayList = this.f1572a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0451c.m1146e(view, "view");
        this.f1573b.remove(view);
        if (this.f1572a.remove(view)) {
            this.f1575d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0548r> F getFragment() {
        AbstractActivityC0669k abstractActivityC0669k;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r;
        C0518H c0518hM1458g;
        View view = this;
        while (true) {
            abstractActivityC0669k = null;
            if (view == null) {
                abstractComponentCallbacksC0548r = null;
                break;
            }
            Object tag = view.getTag(R.id.resc);
            abstractComponentCallbacksC0548r = tag instanceof AbstractComponentCallbacksC0548r ? (AbstractComponentCallbacksC0548r) tag : null;
            if (abstractComponentCallbacksC0548r != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0548r == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0669k) {
                    abstractActivityC0669k = (AbstractActivityC0669k) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0669k == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            c0518hM1458g = ((C0550t) abstractActivityC0669k.f2697s.f1b).f1808s;
        } else {
            if (abstractComponentCallbacksC0548r.f1795s == null || !abstractComponentCallbacksC0548r.f1787k) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0548r + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c0518hM1458g = abstractComponentCallbacksC0548r.m1458g();
        }
        return (F) c0518hM1458g.m1335A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0451c.m1146e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0451c.m1145d(childAt, "view");
                m1329a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0451c.m1146e(view, "view");
        m1329a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        AbstractC0451c.m1145d(childAt, "view");
        m1329a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0451c.m1146e(view, "view");
        m1329a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0451c.m1145d(childAt, "view");
            m1329a(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0451c.m1145d(childAt, "view");
            m1329a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1575d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0451c.m1146e(onApplyWindowInsetsListener, "listener");
        this.f1574c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0451c.m1146e(view, "view");
        if (view.getParent() == this) {
            this.f1573b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0518H c0518h) {
        View view;
        super(context, attributeSet);
        AbstractC0451c.m1146e(context, "context");
        AbstractC0451c.m1146e(attributeSet, "attrs");
        AbstractC0451c.m1146e(c0518h, "fm");
        this.f1572a = new ArrayList();
        this.f1573b = new ArrayList();
        this.f1575d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0420a.f1135b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM1335A = c0518h.m1335A(id);
        if (classAttribute != null && abstractComponentCallbacksC0548rM1335A == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C0512B c0512bM1337C = c0518h.m1337C();
            context.getClassLoader();
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM1326a = c0512bM1337C.m1326a(classAttribute);
            AbstractC0451c.m1145d(abstractComponentCallbacksC0548rM1326a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0548rM1326a.f1761C = true;
            C0550t c0550t = abstractComponentCallbacksC0548rM1326a.f1795s;
            if ((c0550t == null ? null : c0550t.f1805p) != null) {
                abstractComponentCallbacksC0548rM1326a.f1761C = true;
            }
            C0531a c0531a = new C0531a(c0518h);
            c0531a.f1689o = true;
            abstractComponentCallbacksC0548rM1326a.f1762D = this;
            int id2 = getId();
            String str = abstractComponentCallbacksC0548rM1326a.f1769K;
            if (str != null) {
                AbstractC0448d.m1140c(abstractComponentCallbacksC0548rM1326a, str);
            }
            Class<?> cls = abstractComponentCallbacksC0548rM1326a.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = abstractComponentCallbacksC0548rM1326a.f1800x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0548rM1326a + ": was " + abstractComponentCallbacksC0548rM1326a.f1800x + " now " + string);
                    }
                    abstractComponentCallbacksC0548rM1326a.f1800x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0548rM1326a + " with tag " + string + " to container view with no id");
                    }
                    int i2 = abstractComponentCallbacksC0548rM1326a.f1798v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0548rM1326a + ": was " + abstractComponentCallbacksC0548rM1326a.f1798v + " now " + id2);
                    }
                    abstractComponentCallbacksC0548rM1326a.f1798v = id2;
                    abstractComponentCallbacksC0548rM1326a.f1799w = id2;
                }
                c0531a.m1422b(new C0524N(1, abstractComponentCallbacksC0548rM1326a));
                C0518H c0518h2 = c0531a.f1690p;
                abstractComponentCallbacksC0548rM1326a.f1794r = c0518h2;
                if (!c0531a.f1681g) {
                    if (c0518h2.f1610t != null && !c0518h2.f1584G) {
                        c0518h2.m1381x(true);
                        c0531a.mo1328a(c0518h2.f1586I, c0518h2.f1587J);
                        c0518h2.f1592b = true;
                        try {
                            c0518h2.m1347Q(c0518h2.f1586I, c0518h2.f1587J);
                            c0518h2.m1361d();
                            c0518h2.m1359b0();
                            c0518h2.m1378u();
                            ((HashMap) c0518h2.f1593c.f22a).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            c0518h2.m1361d();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        for (C0523M c0523m : c0518h.f1593c.m85f()) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m.f1646c;
            if (abstractComponentCallbacksC0548r.f1799w == getId() && (view = abstractComponentCallbacksC0548r.f1763E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0548r.f1762D = this;
                c0523m.m1389b();
            }
        }
    }
}
