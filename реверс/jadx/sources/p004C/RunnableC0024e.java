package p004C;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.C0001b;
import p007E.AbstractC0056b;
import p018K.C0151g;
import p024N.AbstractC0240S;
import p042W.C0404e;

/* JADX INFO: renamed from: C.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0024e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57a;

    /* JADX INFO: renamed from: b */
    public final Object f58b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59c;

    public /* synthetic */ RunnableC0024e(Object obj, int i2, Object obj2) {
        this.f57a = i2;
        this.f58b = obj;
        this.f59c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f58b;
        Object obj2 = this.f59c;
        switch (this.f57a) {
            case 0:
                ((C0025f) obj).f60a = obj2;
                return;
            case 1:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((C0025f) obj);
                return;
            case 2:
                try {
                    Method method = AbstractC0026g.f69d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0026g.f70e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                AbstractC0056b abstractC0056b = (AbstractC0056b) ((C0001b) obj).f1b;
                if (abstractC0056b != null) {
                    abstractC0056b.mo338i((Typeface) obj2);
                    return;
                }
                return;
            case 4:
                ((C0151g) obj).mo567a(obj2);
                return;
            default:
                C0404e c0404e = ((SwipeDismissBehavior) obj2).f2063a;
                if (c0404e == null || !c0404e.m1120f()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                ((View) obj).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ RunnableC0024e(Object obj, Object obj2, int i2, boolean z2) {
        this.f57a = i2;
        this.f59c = obj;
        this.f58b = obj2;
    }

    public RunnableC0024e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f57a = 5;
        this.f59c = swipeDismissBehavior;
        this.f58b = view;
    }
}
