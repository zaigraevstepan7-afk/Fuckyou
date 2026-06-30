package p074l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p071j.InterfaceC0787b;
import p072k.C0818o;
import p072k.C0820q;
import p072k.InterfaceC0828y;
import p072k.MenuC0816m;
import p072k.SubMenuC0803E;

/* JADX INFO: renamed from: l.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931f1 implements InterfaceC0828y {

    /* JADX INFO: renamed from: a */
    public MenuC0816m f3718a;

    /* JADX INFO: renamed from: b */
    public C0818o f3719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f3720c;

    public C0931f1(Toolbar toolbar) {
        this.f3720c = toolbar;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: c */
    public final void mo2152c() {
        if (this.f3719b != null) {
            MenuC0816m menuC0816m = this.f3718a;
            if (menuC0816m != null) {
                int size = menuC0816m.f3324f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f3718a.getItem(i2) == this.f3719b) {
                        return;
                    }
                }
            }
            mo2180h(this.f3719b);
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: d */
    public final boolean mo2179d(C0818o c0818o) {
        Toolbar toolbar = this.f3720c;
        toolbar.m1225c();
        ViewParent parent = toolbar.f1395h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1395h);
            }
            toolbar.addView(toolbar.f1395h);
        }
        View actionView = c0818o.getActionView();
        toolbar.f1396i = actionView;
        this.f3719b = c0818o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1396i);
            }
            C0934g1 c0934g1M1219h = Toolbar.m1219h();
            c0934g1M1219h.f3723a = (toolbar.f1401n & 112) | 8388611;
            c0934g1M1219h.f3724b = 2;
            toolbar.f1396i.setLayoutParams(c0934g1M1219h);
            toolbar.addView(toolbar.f1396i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0934g1) childAt.getLayoutParams()).f3724b != 2 && childAt != toolbar.f1388a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1375E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0818o.f3348C = true;
        c0818o.f3362n.m2191p(false);
        KeyEvent.Callback callback = toolbar.f1396i;
        if (callback instanceof InterfaceC0787b) {
            ((C0820q) ((InterfaceC0787b) callback)).f3378a.onActionViewExpanded();
        }
        toolbar.m1239u();
        return true;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: f */
    public final boolean mo2153f(SubMenuC0803E subMenuC0803E) {
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: h */
    public final boolean mo2180h(C0818o c0818o) {
        Toolbar toolbar = this.f3720c;
        KeyEvent.Callback callback = toolbar.f1396i;
        if (callback instanceof InterfaceC0787b) {
            ((C0820q) ((InterfaceC0787b) callback)).f3378a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1396i);
        toolbar.removeView(toolbar.f1395h);
        toolbar.f1396i = null;
        ArrayList arrayList = toolbar.f1375E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3719b = null;
        toolbar.requestLayout();
        c0818o.f3348C = false;
        c0818o.f3362n.m2191p(false);
        toolbar.m1239u();
        return true;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: j */
    public final void mo2181j(Context context, MenuC0816m menuC0816m) {
        C0818o c0818o;
        MenuC0816m menuC0816m2 = this.f3718a;
        if (menuC0816m2 != null && (c0818o = this.f3719b) != null) {
            menuC0816m2.mo2164d(c0818o);
        }
        this.f3718a = menuC0816m;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: k */
    public final boolean mo2155k() {
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: b */
    public final void mo2151b(MenuC0816m menuC0816m, boolean z2) {
    }
}
