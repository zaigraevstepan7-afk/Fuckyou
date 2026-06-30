package p074l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import p000A.C0001b;
import p072k.AbstractC0824u;
import p072k.ActionProviderVisibilityListenerC0819p;
import p072k.C0818o;
import p072k.InterfaceC0799A;
import p072k.InterfaceC0827x;
import p072k.InterfaceC0828y;
import p072k.InterfaceC0829z;
import p072k.MenuC0816m;
import p072k.SubMenuC0803E;

/* JADX INFO: renamed from: l.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0944k implements InterfaceC0828y {

    /* JADX INFO: renamed from: a */
    public final Context f3733a;

    /* JADX INFO: renamed from: b */
    public Context f3734b;

    /* JADX INFO: renamed from: c */
    public MenuC0816m f3735c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f3736d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0827x f3737e;

    /* JADX INFO: renamed from: h */
    public InterfaceC0799A f3740h;

    /* JADX INFO: renamed from: i */
    public C0941j f3741i;

    /* JADX INFO: renamed from: j */
    public Drawable f3742j;

    /* JADX INFO: renamed from: k */
    public boolean f3743k;

    /* JADX INFO: renamed from: l */
    public boolean f3744l;

    /* JADX INFO: renamed from: m */
    public boolean f3745m;

    /* JADX INFO: renamed from: n */
    public int f3746n;

    /* JADX INFO: renamed from: o */
    public int f3747o;

    /* JADX INFO: renamed from: p */
    public int f3748p;

    /* JADX INFO: renamed from: q */
    public boolean f3749q;

    /* JADX INFO: renamed from: s */
    public C0932g f3751s;

    /* JADX INFO: renamed from: t */
    public C0932g f3752t;

    /* JADX INFO: renamed from: u */
    public RunnableC0938i f3753u;

    /* JADX INFO: renamed from: v */
    public C0935h f3754v;

    /* JADX INFO: renamed from: f */
    public final int f3738f = R.layout.resc;

    /* JADX INFO: renamed from: g */
    public final int f3739g = R.layout.resc;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f3750r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w */
    public final C0001b f3755w = new C0001b(25, this);

    public C0944k(Context context) {
        this.f3733a = context;
        this.f3736d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m2381a(C0818o c0818o, View view, ViewGroup viewGroup) {
        View actionView = c0818o.getActionView();
        if (actionView == null || c0818o.m2201e()) {
            InterfaceC0829z interfaceC0829z = view instanceof InterfaceC0829z ? (InterfaceC0829z) view : (InterfaceC0829z) this.f3736d.inflate(this.f3739g, viewGroup, false);
            interfaceC0829z.mo1190a(c0818o);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0829z;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f3740h);
            if (this.f3754v == null) {
                this.f3754v = new C0935h(this);
            }
            actionMenuItemView.setPopupCallback(this.f3754v);
            actionView = (View) interfaceC0829z;
        }
        actionView.setVisibility(c0818o.f3348C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0950m)) {
            actionView.setLayoutParams(ActionMenuView.m1213k(layoutParams));
        }
        return actionView;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: b */
    public final void mo2151b(MenuC0816m menuC0816m, boolean z2) {
        m2382e();
        C0932g c0932g = this.f3752t;
        if (c0932g != null && c0932g.m2206b()) {
            c0932g.f3395i.dismiss();
        }
        InterfaceC0827x interfaceC0827x = this.f3737e;
        if (interfaceC0827x != null) {
            interfaceC0827x.mo37b(menuC0816m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: c */
    public final void mo2152c() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f3740h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0816m menuC0816m = this.f3735c;
            if (menuC0816m != null) {
                menuC0816m.m2189i();
                ArrayList arrayListM2190l = this.f3735c.m2190l();
                int size = arrayListM2190l.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0818o c0818o = (C0818o) arrayListM2190l.get(i3);
                    if ((c0818o.f3372x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0818o itemData = childAt instanceof InterfaceC0829z ? ((InterfaceC0829z) childAt).getItemData() : null;
                        View viewM2381a = m2381a(c0818o, childAt, viewGroup);
                        if (c0818o != itemData) {
                            viewM2381a.setPressed(false);
                            viewM2381a.jumpDrawablesToCurrentState();
                        }
                        if (viewM2381a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2381a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2381a);
                            }
                            ((ViewGroup) this.f3740h).addView(viewM2381a, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f3741i) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f3740h).requestLayout();
        MenuC0816m menuC0816m2 = this.f3735c;
        if (menuC0816m2 != null) {
            menuC0816m2.m2189i();
            ArrayList arrayList2 = menuC0816m2.f3327i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = ((C0818o) arrayList2.get(i4)).f3346A;
            }
        }
        MenuC0816m menuC0816m3 = this.f3735c;
        if (menuC0816m3 != null) {
            menuC0816m3.m2189i();
            arrayList = menuC0816m3.f3328j;
        }
        if (this.f3744l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0818o) arrayList.get(0)).f3348C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3741i == null) {
                this.f3741i = new C0941j(this, this.f3733a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3741i.getParent();
            if (viewGroup3 != this.f3740h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3741i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3740h;
                C0941j c0941j = this.f3741i;
                actionMenuView.getClass();
                C0950m c0950mM1212j = ActionMenuView.m1212j();
                c0950mM1212j.f3787a = true;
                actionMenuView.addView(c0941j, c0950mM1212j);
            }
        } else {
            C0941j c0941j2 = this.f3741i;
            if (c0941j2 != null) {
                Object parent = c0941j2.getParent();
                Object obj = this.f3740h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3741i);
                }
            }
        }
        ((ActionMenuView) this.f3740h).setOverflowReserved(this.f3744l);
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: d */
    public final boolean mo2179d(C0818o c0818o) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2382e() {
        Object obj;
        RunnableC0938i runnableC0938i = this.f3753u;
        if (runnableC0938i != null && (obj = this.f3740h) != null) {
            ((View) obj).removeCallbacks(runnableC0938i);
            this.f3753u = null;
            return true;
        }
        C0932g c0932g = this.f3751s;
        if (c0932g == null) {
            return false;
        }
        if (c0932g.m2206b()) {
            c0932g.f3395i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: f */
    public final boolean mo2153f(SubMenuC0803E subMenuC0803E) {
        boolean z2;
        if (subMenuC0803E.hasVisibleItems()) {
            SubMenuC0803E subMenuC0803E2 = subMenuC0803E;
            while (true) {
                MenuC0816m menuC0816m = subMenuC0803E2.f3251z;
                if (menuC0816m == this.f3735c) {
                    break;
                }
                subMenuC0803E2 = (SubMenuC0803E) menuC0816m;
            }
            ViewGroup viewGroup = (ViewGroup) this.f3740h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof InterfaceC0829z) && ((InterfaceC0829z) childAt).getItemData() == subMenuC0803E2.f3250A) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                subMenuC0803E.f3250A.getClass();
                int size = subMenuC0803E.f3324f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC0803E.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C0932g c0932g = new C0932g(this, this.f3734b, subMenuC0803E, view);
                this.f3752t = c0932g;
                c0932g.f3393g = z2;
                AbstractC0824u abstractC0824u = c0932g.f3395i;
                if (abstractC0824u != null) {
                    abstractC0824u.mo2158o(z2);
                }
                C0932g c0932g2 = this.f3752t;
                if (!c0932g2.m2206b()) {
                    if (c0932g2.f3391e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0932g2.m2208d(0, 0, false, false);
                }
                InterfaceC0827x interfaceC0827x = this.f3737e;
                if (interfaceC0827x != null) {
                    interfaceC0827x.mo43h(subMenuC0803E);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: g */
    public final void mo2154g(InterfaceC0827x interfaceC0827x) {
        throw null;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: h */
    public final boolean mo2180h(C0818o c0818o) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2383i() {
        C0932g c0932g = this.f3751s;
        return c0932g != null && c0932g.m2206b();
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: j */
    public final void mo2181j(Context context, MenuC0816m menuC0816m) {
        this.f3734b = context;
        LayoutInflater.from(context);
        this.f3735c = menuC0816m;
        Resources resources = context.getResources();
        if (!this.f3745m) {
            this.f3744l = true;
        }
        int i2 = 2;
        this.f3746n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f3748p = i2;
        int measuredWidth = this.f3746n;
        if (this.f3744l) {
            if (this.f3741i == null) {
                C0941j c0941j = new C0941j(this, this.f3733a);
                this.f3741i = c0941j;
                if (this.f3743k) {
                    c0941j.setImageDrawable(this.f3742j);
                    this.f3742j = null;
                    this.f3743k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3741i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3741i.getMeasuredWidth();
        } else {
            this.f3741i = null;
        }
        this.f3747o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: k */
    public final boolean mo2155k() {
        ArrayList arrayListM2190l;
        int size;
        int i2;
        boolean z2;
        C0944k c0944k = this;
        MenuC0816m menuC0816m = c0944k.f3735c;
        if (menuC0816m != null) {
            arrayListM2190l = menuC0816m.m2190l();
            size = arrayListM2190l.size();
        } else {
            arrayListM2190l = null;
            size = 0;
        }
        int i3 = c0944k.f3748p;
        int i4 = c0944k.f3747o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0944k.f3740h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            C0818o c0818o = (C0818o) arrayListM2190l.get(i5);
            int i8 = c0818o.f3373y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (c0944k.f3749q && c0818o.f3348C) {
                i3 = 0;
            }
            i5++;
        }
        if (c0944k.f3744l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c0944k.f3750r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C0818o c0818o2 = (C0818o) arrayListM2190l.get(i10);
            int i12 = c0818o2.f3373y;
            boolean z4 = (i12 & 2) == i2;
            int i13 = c0818o2.f3350b;
            if (z4) {
                View viewM2381a = c0944k.m2381a(c0818o2, null, viewGroup);
                viewM2381a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2381a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0818o2.m2202f(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = (i9 > 0 || z5) && i4 > 0;
                if (z6) {
                    View viewM2381a2 = c0944k.m2381a(c0818o2, null, viewGroup);
                    viewM2381a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM2381a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C0818o c0818o3 = (C0818o) arrayListM2190l.get(i14);
                        if (c0818o3.f3350b == i13) {
                            if ((c0818o3.f3372x & 32) == 32) {
                                i9++;
                            }
                            c0818o3.m2202f(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0818o2.m2202f(z6);
            } else {
                c0818o2.m2202f(false);
                i10++;
                i2 = 2;
                c0944k = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            c0944k = this;
            z2 = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2384l() {
        MenuC0816m menuC0816m;
        if (!this.f3744l || m2383i() || (menuC0816m = this.f3735c) == null || this.f3740h == null || this.f3753u != null) {
            return false;
        }
        menuC0816m.m2189i();
        if (menuC0816m.f3328j.isEmpty()) {
            return false;
        }
        RunnableC0938i runnableC0938i = new RunnableC0938i(this, new C0932g(this, this.f3734b, this.f3735c, this.f3741i));
        this.f3753u = runnableC0938i;
        ((View) this.f3740h).post(runnableC0938i);
        return true;
    }
}
