package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.reddit.frontpage.MainActivity;
import com.reddit.secondpage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bo extends ao implements t62, kd0, vh1, o11, xy0, k2 {
    public final bs f;
    public final qt0 g;
    public final n81 h;
    public et0 i;
    public final xn j;
    public final jv1 k;
    public final zn l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    public boolean u;
    public final jv1 v;
    public final jv1 w;
    public final jv1 x;

    public bo() {
        bs bsVar = new bs();
        this.f = bsVar;
        MainActivity mainActivity = (MainActivity) this;
        this.g = new qt0(28);
        uh1 uh1Var = new uh1(this, new p7(17, this));
        int i = 3;
        n81 n81Var = new n81(uh1Var, 3);
        this.h = n81Var;
        this.j = new xn(mainActivity);
        int i2 = 1;
        this.k = new jv1(new rn(mainActivity, 1));
        new AtomicInteger();
        this.l = new zn(mainActivity);
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.v = new jv1(new rn(mainActivity, 2));
        zo0 zo0Var = this.e;
        if (zo0Var == null) {
            yc.l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i3 = 0;
        zo0Var.a(new tn(i3, mainActivity));
        this.e.a(new tn(i2, mainActivity));
        this.e.a(new oc1(i2, mainActivity));
        uh1Var.a();
        qo0 qo0Var = this.e.c;
        if (qo0Var != qo0.f && qo0Var != qo0.g) {
            yc.p("Failed requirement.");
            throw null;
        }
        if (((n81) n81Var.c).i("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            qh1 qh1Var = new qh1((n81) n81Var.c, mainActivity);
            ((n81) n81Var.c).n("androidx.lifecycle.internal.SavedStateHandlesProvider", qh1Var);
            this.e.a(new oc1(i, qh1Var));
        }
        ((n81) n81Var.c).n("android:support:activity-result", new un(i3, mainActivity));
        vn vnVar = new vn(mainActivity);
        bo boVar = bsVar.b;
        if (boVar != null) {
            vnVar.a(boVar);
        }
        bsVar.a.add(vnVar);
        this.w = new jv1(new rn(mainActivity, 3));
        this.x = new jv1(new rn(mainActivity, 4));
    }

    public static void a(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!xi0.o(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!xi0.o(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.o11
    public final n11 b() {
        return (n11) this.x.getValue();
    }

    @Override // defpackage.vh1
    public final n81 c() {
        return (n81) this.h.c;
    }

    public final cx0 d() {
        cx0 cx0Var = new cx0(bu.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cx0Var.a;
        if (application != null) {
            linkedHashMap.put(q62.d, getApplication());
        }
        linkedHashMap.put(nu0.n, this);
        linkedHashMap.put(nu0.o, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(nu0.p, extras);
        }
        return cx0Var;
    }

    public final et0 e() {
        if (getApplication() == null) {
            yc.l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.i == null) {
            wn wnVar = (wn) getLastNonConfigurationInstance();
            if (wnVar != null) {
                this.i = wnVar.a;
            }
            if (this.i == null) {
                this.i = new et0(1);
            }
        }
        et0 et0Var = this.i;
        et0Var.getClass();
        return et0Var;
    }

    public final void f() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.xo0
    public final zo0 g() {
        return this.e;
    }

    @Override // defpackage.xy0
    public final wy0 getNavigationEventDispatcher() {
        return b().a();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.l.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((iy) this.v.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(configuration);
        }
    }

    @Override // defpackage.ao, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.k(bundle);
        bs bsVar = this.f;
        bsVar.getClass();
        bsVar.b = this;
        Iterator it = bsVar.a.iterator();
        while (it.hasNext()) {
            ((vn) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = vd1.f;
        td1.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        yc.d();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                yc.d();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.p.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((o90) it.next()).a(new wr(24));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            yc.d();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((o90) it.next()).a(new wr(29));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        t61 t61Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            t61Var = new t61(0);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            t61Var = new t61(0);
        } else {
            t61Var = new t61(0);
        }
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(t61Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        yc.d();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.l.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        wn wnVar;
        et0 et0Var = this.i;
        if (et0Var == null && (wnVar = (wn) getLastNonConfigurationInstance()) != null) {
            et0Var = wnVar.a;
        }
        if (et0Var == null) {
            return null;
        }
        wn wnVar2 = new wn();
        wnVar2.a = et0Var;
        return wnVar2;
    }

    @Override // defpackage.ao, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        zo0 zo0Var = this.e;
        if (zo0Var != null) {
            zo0Var.c("setCurrentState");
            zo0Var.e(qo0.g);
        }
        super.onSaveInstanceState(bundle);
        this.h.l(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (qc1.q()) {
                qc1.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ga0 ga0Var = (ga0) this.k.getValue();
            synchronized (ga0Var.a) {
                try {
                    ga0Var.b = true;
                    ArrayList arrayList = ga0Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ha0) obj).a();
                    }
                    ga0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        f();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        f();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(new wr(24));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((o90) it.next()).a(new wr(29));
        }
    }
}
