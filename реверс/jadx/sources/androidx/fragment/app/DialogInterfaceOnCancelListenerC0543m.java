package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0467l;
import androidx.lifecycle.AbstractC0591w;
import androidx.lifecycle.C0592x;
import com.reddit.frontpage.R;
import java.io.PrintWriter;
import p000A.C0001b;
import p023M0.RunnableC0191D;
import p036T.AbstractC0383m;
import p051a1.AbstractC0451c;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0543m extends AbstractComponentCallbacksC0548r implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: T */
    public final DialogInterfaceOnCancelListenerC0540j f1732T;

    /* JADX INFO: renamed from: U */
    public final DialogInterfaceOnDismissListenerC0541k f1733U;

    /* JADX INFO: renamed from: V */
    public int f1734V;

    /* JADX INFO: renamed from: W */
    public int f1735W;

    /* JADX INFO: renamed from: X */
    public boolean f1736X;

    /* JADX INFO: renamed from: Y */
    public boolean f1737Y;

    /* JADX INFO: renamed from: Z */
    public int f1738Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f1739a0;

    /* JADX INFO: renamed from: b0 */
    public final C0001b f1740b0;

    /* JADX INFO: renamed from: c0 */
    public Dialog f1741c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f1742d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f1743e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f1744f0;

    public DialogInterfaceOnCancelListenerC0543m() {
        new RunnableC0191D(5, this);
        this.f1732T = new DialogInterfaceOnCancelListenerC0540j(this);
        this.f1733U = new DialogInterfaceOnDismissListenerC0541k(this);
        this.f1734V = 0;
        this.f1735W = 0;
        this.f1736X = true;
        this.f1737Y = true;
        this.f1738Z = -1;
        this.f1740b0 = new C0001b(15, this);
        this.f1744f0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: A */
    public final void mo1440A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1440A(layoutInflater, viewGroup, bundle);
        if (this.f1763E != null || this.f1741c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1741c0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: F */
    public Dialog mo1441F() {
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0467l(m1453B(), this.f1735W);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: e */
    public final AbstractC0383m mo1442e() {
        return new C0542l(this, new C0545o(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: o */
    public final void mo1443o() {
        this.f1761C = true;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1742d0) {
            return;
        }
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1743e0) {
            return;
        }
        this.f1743e0 = true;
        Dialog dialog = this.f1741c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1741c0.dismiss();
        }
        this.f1742d0 = true;
        if (this.f1738Z >= 0) {
            C0518H c0518hM1461j = m1461j();
            int i2 = this.f1738Z;
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0529T.m1416e("Bad id: ", i2));
            }
            c0518hM1461j.m1380w(new C0517G(c0518hM1461j, i2), true);
            this.f1738Z = -1;
            return;
        }
        C0531a c0531a = new C0531a(m1461j());
        c0531a.f1689o = true;
        C0518H c0518h = this.f1794r;
        if (c0518h != null && c0518h != c0531a.f1690p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0531a.m1422b(new C0524N(3, this));
        if (c0531a.f1691q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Commit: " + c0531a);
            PrintWriter printWriter = new PrintWriter(new C0526P());
            c0531a.m1424d("  ", printWriter, true);
            printWriter.close();
        }
        c0531a.f1691q = true;
        boolean z2 = c0531a.f1681g;
        C0518H c0518h2 = c0531a.f1690p;
        if (z2) {
            c0531a.f1692r = c0518h2.f1599i.getAndIncrement();
        } else {
            c0531a.f1692r = -1;
        }
        c0518h2.m1380w(c0531a, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: q */
    public final void mo1444q(AbstractActivityC0669k abstractActivityC0669k) {
        super.mo1444q(abstractActivityC0669k);
        this.f1773O.m1496d(this.f1740b0);
        this.f1743e0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: r */
    public void mo1445r(Bundle bundle) {
        super.mo1445r(bundle);
        new Handler();
        this.f1737Y = this.f1799w == 0;
        if (bundle != null) {
            this.f1734V = bundle.getInt("android:style", 0);
            this.f1735W = bundle.getInt("android:theme", 0);
            this.f1736X = bundle.getBoolean("android:cancelable", true);
            this.f1737Y = bundle.getBoolean("android:showsDialog", this.f1737Y);
            this.f1738Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: t */
    public final void mo1446t() {
        this.f1761C = true;
        Dialog dialog = this.f1741c0;
        if (dialog != null) {
            this.f1742d0 = true;
            dialog.setOnDismissListener(null);
            this.f1741c0.dismiss();
            if (!this.f1743e0) {
                onDismiss(this.f1741c0);
            }
            this.f1741c0 = null;
            this.f1744f0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: u */
    public final void mo1447u() {
        this.f1761C = true;
        if (!this.f1743e0) {
            this.f1743e0 = true;
        }
        C0001b c0001b = this.f1740b0;
        C0592x c0592x = this.f1773O;
        c0592x.getClass();
        C0592x.m1493a("removeObserver");
        AbstractC0591w abstractC0591w = (AbstractC0591w) c0592x.f1891b.mo2458b(c0001b);
        if (abstractC0591w == null) {
            return;
        }
        abstractC0591w.mo1474d();
        abstractC0591w.m1492c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0048, B:29:0x0052, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x006a), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo1448v(Bundle bundle) {
        Context contextM1459h;
        LayoutInflater layoutInflaterMo1448v = super.mo1448v(bundle);
        boolean z2 = this.f1737Y;
        if (z2 && !this.f1739a0) {
            if (z2 && !this.f1744f0) {
                try {
                    this.f1739a0 = true;
                    Dialog dialogMo1441F = mo1441F();
                    this.f1741c0 = dialogMo1441F;
                    if (this.f1737Y) {
                        int i2 = this.f1734V;
                        if (i2 == 1 || i2 == 2) {
                            dialogMo1441F.requestWindowFeature(1);
                            contextM1459h = m1459h();
                            if (AbstractC0529T.m1418g(contextM1459h)) {
                                this.f1741c0.setOwnerActivity((Activity) contextM1459h);
                            }
                            this.f1741c0.setCancelable(this.f1736X);
                            this.f1741c0.setOnCancelListener(this.f1732T);
                            this.f1741c0.setOnDismissListener(this.f1733U);
                            this.f1744f0 = true;
                        } else if (i2 == 3) {
                            Window window = dialogMo1441F.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo1441F.requestWindowFeature(1);
                            contextM1459h = m1459h();
                            if (AbstractC0529T.m1418g(contextM1459h)) {
                            }
                            this.f1741c0.setCancelable(this.f1736X);
                            this.f1741c0.setOnCancelListener(this.f1732T);
                            this.f1741c0.setOnDismissListener(this.f1733U);
                            this.f1744f0 = true;
                        } else {
                            contextM1459h = m1459h();
                            if (AbstractC0529T.m1418g(contextM1459h)) {
                            }
                            this.f1741c0.setCancelable(this.f1736X);
                            this.f1741c0.setOnCancelListener(this.f1732T);
                            this.f1741c0.setOnDismissListener(this.f1733U);
                            this.f1744f0 = true;
                        }
                    } else {
                        this.f1741c0 = null;
                    }
                    this.f1739a0 = false;
                } catch (Throwable th) {
                    this.f1739a0 = false;
                    throw th;
                }
            }
            if (C0518H.m1330F(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f1741c0;
            if (dialog != null) {
                return layoutInflaterMo1448v.cloneInContext(dialog.getContext());
            }
        } else if (C0518H.m1330F(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f1737Y) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo1448v;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo1448v;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: w */
    public void mo1449w(Bundle bundle) {
        Dialog dialog = this.f1741c0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i2 = this.f1734V;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f1735W;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.f1736X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1737Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f1738Z;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: x */
    public void mo1450x() {
        this.f1761C = true;
        Dialog dialog = this.f1741c0;
        if (dialog != null) {
            this.f1742d0 = false;
            dialog.show();
            View decorView = this.f1741c0.getWindow().getDecorView();
            AbstractC0451c.m1146e(decorView, "<this>");
            decorView.setTag(R.id.resc, this);
            decorView.setTag(R.id.resc, this);
            decorView.setTag(R.id.resc, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: y */
    public void mo1451y() {
        this.f1761C = true;
        Dialog dialog = this.f1741c0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: z */
    public final void mo1452z(Bundle bundle) {
        Bundle bundle2;
        this.f1761C = true;
        if (this.f1741c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1741c0.onRestoreInstanceState(bundle2);
    }
}
