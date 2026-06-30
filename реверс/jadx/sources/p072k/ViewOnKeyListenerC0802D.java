package p072k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.reddit.frontpage.R;
import p023M0.ViewOnAttachStateChangeListenerC0210p;
import p074l.C0894P0;
import p074l.C0980x0;

/* JADX INFO: renamed from: k.D */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0802D extends AbstractC0824u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f3231b;

    /* JADX INFO: renamed from: c */
    public final MenuC0816m f3232c;

    /* JADX INFO: renamed from: d */
    public final C0813j f3233d;

    /* JADX INFO: renamed from: e */
    public final boolean f3234e;

    /* JADX INFO: renamed from: f */
    public final int f3235f;

    /* JADX INFO: renamed from: g */
    public final int f3236g;

    /* JADX INFO: renamed from: h */
    public final C0894P0 f3237h;

    /* JADX INFO: renamed from: k */
    public C0825v f3240k;

    /* JADX INFO: renamed from: l */
    public View f3241l;

    /* JADX INFO: renamed from: m */
    public View f3242m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0827x f3243n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f3244o;

    /* JADX INFO: renamed from: p */
    public boolean f3245p;

    /* JADX INFO: renamed from: q */
    public boolean f3246q;

    /* JADX INFO: renamed from: r */
    public int f3247r;

    /* JADX INFO: renamed from: t */
    public boolean f3249t;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0807d f3238i = new ViewTreeObserverOnGlobalLayoutListenerC0807d(1, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0210p f3239j = new ViewOnAttachStateChangeListenerC0210p(3, this);

    /* JADX INFO: renamed from: s */
    public int f3248s = 0;

    public ViewOnKeyListenerC0802D(int i2, Context context, View view, MenuC0816m menuC0816m, boolean z2) {
        this.f3231b = context;
        this.f3232c = menuC0816m;
        this.f3234e = z2;
        this.f3233d = new C0813j(menuC0816m, LayoutInflater.from(context), z2, R.layout.resc);
        this.f3236g = i2;
        Resources resources = context.getResources();
        this.f3235f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.resc));
        this.f3241l = view;
        this.f3237h = new C0894P0(context, null, i2);
        menuC0816m.m2185b(this, context);
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: a */
    public final boolean mo2148a() {
        return !this.f3245p && this.f3237h.f3577z.isShowing();
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: b */
    public final void mo2151b(MenuC0816m menuC0816m, boolean z2) {
        if (menuC0816m != this.f3232c) {
            return;
        }
        dismiss();
        InterfaceC0827x interfaceC0827x = this.f3243n;
        if (interfaceC0827x != null) {
            interfaceC0827x.mo37b(menuC0816m, z2);
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: c */
    public final void mo2152c() {
        this.f3246q = false;
        C0813j c0813j = this.f3233d;
        if (c0813j != null) {
            c0813j.notifyDataSetChanged();
        }
    }

    @Override // p072k.InterfaceC0801C
    public final void dismiss() {
        if (mo2148a()) {
            this.f3237h.dismiss();
        }
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: e */
    public final C0980x0 mo2149e() {
        return this.f3237h.f3554c;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: f */
    public final boolean mo2153f(SubMenuC0803E subMenuC0803E) {
        if (subMenuC0803E.hasVisibleItems()) {
            View view = this.f3242m;
            C0826w c0826w = new C0826w(this.f3236g, this.f3231b, view, subMenuC0803E, this.f3234e);
            InterfaceC0827x interfaceC0827x = this.f3243n;
            c0826w.f3394h = interfaceC0827x;
            AbstractC0824u abstractC0824u = c0826w.f3395i;
            if (abstractC0824u != null) {
                abstractC0824u.mo2154g(interfaceC0827x);
            }
            boolean zM2204u = AbstractC0824u.m2204u(subMenuC0803E);
            c0826w.f3393g = zM2204u;
            AbstractC0824u abstractC0824u2 = c0826w.f3395i;
            if (abstractC0824u2 != null) {
                abstractC0824u2.mo2158o(zM2204u);
            }
            c0826w.f3396j = this.f3240k;
            this.f3240k = null;
            this.f3232c.m2186c(false);
            C0894P0 c0894p0 = this.f3237h;
            int width = c0894p0.f3557f;
            int iM2292j = c0894p0.m2292j();
            if ((Gravity.getAbsoluteGravity(this.f3248s, this.f3241l.getLayoutDirection()) & 7) == 5) {
                width += this.f3241l.getWidth();
            }
            if (!c0826w.m2206b()) {
                if (c0826w.f3391e != null) {
                    c0826w.m2208d(width, iM2292j, true, true);
                }
            }
            InterfaceC0827x interfaceC0827x2 = this.f3243n;
            if (interfaceC0827x2 != null) {
                interfaceC0827x2.mo43h(subMenuC0803E);
            }
            return true;
        }
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: g */
    public final void mo2154g(InterfaceC0827x interfaceC0827x) {
        this.f3243n = interfaceC0827x;
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: i */
    public final void mo2150i() {
        View view;
        if (mo2148a()) {
            return;
        }
        if (this.f3245p || (view = this.f3241l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3242m = view;
        C0894P0 c0894p0 = this.f3237h;
        c0894p0.f3577z.setOnDismissListener(this);
        c0894p0.f3567p = this;
        c0894p0.f3576y = true;
        c0894p0.f3577z.setFocusable(true);
        View view2 = this.f3242m;
        boolean z2 = this.f3244o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3244o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3238i);
        }
        view2.addOnAttachStateChangeListener(this.f3239j);
        c0894p0.f3566o = view2;
        c0894p0.f3563l = this.f3248s;
        boolean z3 = this.f3246q;
        Context context = this.f3231b;
        C0813j c0813j = this.f3233d;
        if (!z3) {
            this.f3247r = AbstractC0824u.m2203m(c0813j, context, this.f3235f);
            this.f3246q = true;
        }
        c0894p0.m2298q(this.f3247r);
        c0894p0.f3577z.setInputMethodMode(2);
        Rect rect = this.f3385a;
        c0894p0.f3575x = rect != null ? new Rect(rect) : null;
        c0894p0.mo2150i();
        C0980x0 c0980x0 = c0894p0.f3554c;
        c0980x0.setOnKeyListener(this);
        if (this.f3249t) {
            MenuC0816m menuC0816m = this.f3232c;
            if (menuC0816m.f3331m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.resc, (ViewGroup) c0980x0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0816m.f3331m);
                }
                frameLayout.setEnabled(false);
                c0980x0.addHeaderView(frameLayout, null, false);
            }
        }
        c0894p0.mo2296n(c0813j);
        c0894p0.mo2150i();
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: k */
    public final boolean mo2155k() {
        return false;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: n */
    public final void mo2157n(View view) {
        this.f3241l = view;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: o */
    public final void mo2158o(boolean z2) {
        this.f3233d.f3314c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3245p = true;
        this.f3232c.m2186c(true);
        ViewTreeObserver viewTreeObserver = this.f3244o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3244o = this.f3242m.getViewTreeObserver();
            }
            this.f3244o.removeGlobalOnLayoutListener(this.f3238i);
            this.f3244o = null;
        }
        this.f3242m.removeOnAttachStateChangeListener(this.f3239j);
        C0825v c0825v = this.f3240k;
        if (c0825v != null) {
            c0825v.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: p */
    public final void mo2159p(int i2) {
        this.f3248s = i2;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: q */
    public final void mo2160q(int i2) {
        this.f3237h.f3557f = i2;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: r */
    public final void mo2161r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3240k = (C0825v) onDismissListener;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: s */
    public final void mo2162s(boolean z2) {
        this.f3249t = z2;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: t */
    public final void mo2163t(int i2) {
        this.f3237h.m2294l(i2);
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: l */
    public final void mo2156l(MenuC0816m menuC0816m) {
    }
}
