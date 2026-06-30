package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0586r;
import com.reddit.frontpage.R;
import p004C.RunnableC0020a;
import p051a1.AbstractC0451c;
import p068h0.C0781d;
import p068h0.InterfaceC0782e;

/* JADX INFO: renamed from: androidx.activity.l */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0467l extends Dialog implements InterfaceC0586r, InterfaceC0782e {

    /* JADX INFO: renamed from: a */
    public C0588t f1195a;

    /* JADX INFO: renamed from: b */
    public final C0468m f1196b;

    /* JADX INFO: renamed from: c */
    public final C0485v f1197c;

    public DialogC0467l(Context context, int i2) {
        super(context, i2);
        this.f1196b = new C0468m(this);
        this.f1197c = new C0485v(new RunnableC0020a(8, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m1169a(DialogC0467l dialogC0467l) {
        AbstractC0451c.m1146e(dialogC0467l, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0451c.m1146e(view, "view");
        m1170c();
        super.addContentView(view, layoutParams);
    }

    @Override // p068h0.InterfaceC0782e
    /* JADX INFO: renamed from: b */
    public final C0781d mo1162b() {
        return (C0781d) this.f1196b.f1200c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1170c() {
        Window window = getWindow();
        AbstractC0451c.m1143b(window);
        View decorView = window.getDecorView();
        AbstractC0451c.m1145d(decorView, "window!!.decorView");
        decorView.setTag(R.id.resc, this);
        Window window2 = getWindow();
        AbstractC0451c.m1143b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0451c.m1145d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.resc, this);
        Window window3 = getWindow();
        AbstractC0451c.m1143b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0451c.m1145d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.resc, this);
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        C0588t c0588t = this.f1195a;
        if (c0588t != null) {
            return c0588t;
        }
        C0588t c0588t2 = new C0588t(this);
        this.f1195a = c0588t2;
        return c0588t2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1197c.m1187b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0451c.m1145d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0485v c0485v = this.f1197c;
            c0485v.getClass();
            c0485v.f1250e = onBackInvokedDispatcher;
            c0485v.m1188c(c0485v.f1252g);
        }
        this.f1196b.m1172b(bundle);
        C0588t c0588t = this.f1195a;
        if (c0588t == null) {
            c0588t = new C0588t(this);
            this.f1195a = c0588t;
        }
        c0588t.m1484d(EnumC0580l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0451c.m1145d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f1196b.m1173c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0588t c0588t = this.f1195a;
        if (c0588t == null) {
            c0588t = new C0588t(this);
            this.f1195a = c0588t;
        }
        c0588t.m1484d(EnumC0580l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0588t c0588t = this.f1195a;
        if (c0588t == null) {
            c0588t = new C0588t(this);
            this.f1195a = c0588t;
        }
        c0588t.m1484d(EnumC0580l.ON_DESTROY);
        this.f1195a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        m1170c();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0451c.m1146e(view, "view");
        m1170c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0451c.m1146e(view, "view");
        m1170c();
        super.setContentView(view, layoutParams);
    }
}
