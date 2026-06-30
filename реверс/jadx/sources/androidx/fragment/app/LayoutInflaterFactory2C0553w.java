package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000A.C0010k;
import p047Z.AbstractC0420a;
import p050a0.AbstractC0448d;
import p050a0.C0445a;
import p050a0.C0447c;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0553w implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final C0518H f1817a;

    public LayoutInflaterFactory2C0553w(C0518H c0518h) {
        this.f1817a = c0518h;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r;
        C0523M c0523mM1363f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        C0518H c0518h = this.f1817a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, c0518h);
        }
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0420a.f1134a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0548r.class.isAssignableFrom(C0512B.m1324b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM1335A = resourceId != -1 ? c0518h.m1335A(resourceId) : null;
                    if (abstractComponentCallbacksC0548rM1335A == null && string != null) {
                        C0010k c0010k = c0518h.f1593c;
                        ArrayList arrayList = (ArrayList) c0010k.f24c;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0548r = abstractComponentCallbacksC0548r2;
                                Iterator it = ((HashMap) c0010k.f22a).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractComponentCallbacksC0548rM1335A = abstractComponentCallbacksC0548r;
                                        break;
                                    }
                                    C0523M c0523m = (C0523M) it.next();
                                    if (c0523m != null) {
                                        abstractComponentCallbacksC0548rM1335A = c0523m.f1646c;
                                        if (string.equals(abstractComponentCallbacksC0548rM1335A.f1800x)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = (AbstractComponentCallbacksC0548r) arrayList.get(size);
                                abstractComponentCallbacksC0548r = abstractComponentCallbacksC0548r2;
                                if (abstractComponentCallbacksC0548r3 != null && string.equals(abstractComponentCallbacksC0548r3.f1800x)) {
                                    abstractComponentCallbacksC0548rM1335A = abstractComponentCallbacksC0548r3;
                                    break;
                                }
                                size--;
                                abstractComponentCallbacksC0548r2 = abstractComponentCallbacksC0548r;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0548r = null;
                    }
                    if (abstractComponentCallbacksC0548rM1335A == null && id != -1) {
                        abstractComponentCallbacksC0548rM1335A = c0518h.m1335A(id);
                    }
                    if (abstractComponentCallbacksC0548rM1335A == null) {
                        C0512B c0512bM1337C = c0518h.m1337C();
                        context.getClassLoader();
                        abstractComponentCallbacksC0548rM1335A = c0512bM1337C.m1326a(attributeValue);
                        abstractComponentCallbacksC0548rM1335A.f1789m = true;
                        abstractComponentCallbacksC0548rM1335A.f1798v = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0548rM1335A.f1799w = id;
                        abstractComponentCallbacksC0548rM1335A.f1800x = string;
                        abstractComponentCallbacksC0548rM1335A.f1790n = true;
                        abstractComponentCallbacksC0548rM1335A.f1794r = c0518h;
                        C0550t c0550t = c0518h.f1610t;
                        abstractComponentCallbacksC0548rM1335A.f1795s = c0550t;
                        AbstractActivityC0669k abstractActivityC0669k = c0550t.f1806q;
                        abstractComponentCallbacksC0548rM1335A.f1761C = true;
                        if ((c0550t == null ? abstractComponentCallbacksC0548r : c0550t.f1805p) != null) {
                            abstractComponentCallbacksC0548rM1335A.f1761C = true;
                        }
                        c0523mM1363f = c0518h.m1356a(abstractComponentCallbacksC0548rM1335A);
                        if (C0518H.m1330F(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0548rM1335A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0548rM1335A.f1790n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0548rM1335A.f1790n = true;
                        abstractComponentCallbacksC0548rM1335A.f1794r = c0518h;
                        C0550t c0550t2 = c0518h.f1610t;
                        abstractComponentCallbacksC0548rM1335A.f1795s = c0550t2;
                        AbstractActivityC0669k abstractActivityC0669k2 = c0550t2.f1806q;
                        abstractComponentCallbacksC0548rM1335A.f1761C = true;
                        if ((c0550t2 == null ? abstractComponentCallbacksC0548r : c0550t2.f1805p) != null) {
                            abstractComponentCallbacksC0548rM1335A.f1761C = true;
                        }
                        c0523mM1363f = c0518h.m1363f(abstractComponentCallbacksC0548rM1335A);
                        if (C0518H.m1330F(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0548rM1335A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0447c c0447c = AbstractC0448d.f1144a;
                    AbstractC0448d.m1139b(new C0445a(abstractComponentCallbacksC0548rM1335A, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0548rM1335A + " to container " + viewGroup));
                    AbstractC0448d.m1138a(abstractComponentCallbacksC0548rM1335A).getClass();
                    abstractComponentCallbacksC0548rM1335A.f1762D = viewGroup;
                    c0523mM1363f.m1398k();
                    c0523mM1363f.m1397j();
                    View view2 = abstractComponentCallbacksC0548rM1335A.f1763E;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0548rM1335A.f1763E.getTag() == null) {
                        abstractComponentCallbacksC0548rM1335A.f1763E.setTag(string);
                    }
                    abstractComponentCallbacksC0548rM1335A.f1763E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0552v(this, c0523mM1363f));
                    return abstractComponentCallbacksC0548rM1335A.f1763E;
                }
            }
        }
        return null;
    }
}
