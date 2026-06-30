package p072k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.C0001b;
import p023M0.ViewOnAttachStateChangeListenerC0210p;
import p074l.AbstractC0888M0;
import p074l.AbstractC0890N0;
import p074l.C0867C;
import p074l.C0894P0;
import p074l.C0980x0;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0810g extends AbstractC0824u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final Context f3279b;

    /* JADX INFO: renamed from: c */
    public final int f3280c;

    /* JADX INFO: renamed from: d */
    public final int f3281d;

    /* JADX INFO: renamed from: e */
    public final boolean f3282e;

    /* JADX INFO: renamed from: f */
    public final Handler f3283f;

    /* JADX INFO: renamed from: n */
    public View f3291n;

    /* JADX INFO: renamed from: o */
    public View f3292o;

    /* JADX INFO: renamed from: p */
    public int f3293p;

    /* JADX INFO: renamed from: q */
    public boolean f3294q;

    /* JADX INFO: renamed from: r */
    public boolean f3295r;

    /* JADX INFO: renamed from: s */
    public int f3296s;

    /* JADX INFO: renamed from: t */
    public int f3297t;

    /* JADX INFO: renamed from: v */
    public boolean f3299v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0827x f3300w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f3301x;

    /* JADX INFO: renamed from: y */
    public C0825v f3302y;

    /* JADX INFO: renamed from: z */
    public boolean f3303z;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3284g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f3285h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0807d f3286i = new ViewTreeObserverOnGlobalLayoutListenerC0807d(0, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0210p f3287j = new ViewOnAttachStateChangeListenerC0210p(2, this);

    /* JADX INFO: renamed from: k */
    public final C0001b f3288k = new C0001b(23, this);

    /* JADX INFO: renamed from: l */
    public int f3289l = 0;

    /* JADX INFO: renamed from: m */
    public int f3290m = 0;

    /* JADX INFO: renamed from: u */
    public boolean f3298u = false;

    public ViewOnKeyListenerC0810g(Context context, View view, int i2, boolean z2) {
        this.f3279b = context;
        this.f3291n = view;
        this.f3281d = i2;
        this.f3282e = z2;
        this.f3293p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3280c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.resc));
        this.f3283f = new Handler();
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: a */
    public final boolean mo2148a() {
        ArrayList arrayList = this.f3285h;
        return arrayList.size() > 0 && ((C0809f) arrayList.get(0)).f3276a.f3577z.isShowing();
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: b */
    public final void mo2151b(MenuC0816m menuC0816m, boolean z2) {
        ArrayList arrayList = this.f3285h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0816m == ((C0809f) arrayList.get(i2)).f3277b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0809f) arrayList.get(i3)).f3277b.m2186c(false);
        }
        C0809f c0809f = (C0809f) arrayList.remove(i2);
        c0809f.f3277b.m2193r(this);
        boolean z3 = this.f3303z;
        C0894P0 c0894p0 = c0809f.f3276a;
        if (z3) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0888M0.m2312b(c0894p0.f3577z, null);
            }
            c0894p0.f3577z.setAnimationStyle(0);
        }
        c0894p0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3293p = ((C0809f) arrayList.get(size2 - 1)).f3278c;
        } else {
            this.f3293p = this.f3291n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0809f) arrayList.get(0)).f3277b.m2186c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0827x interfaceC0827x = this.f3300w;
        if (interfaceC0827x != null) {
            interfaceC0827x.mo37b(menuC0816m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3301x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3301x.removeGlobalOnLayoutListener(this.f3286i);
            }
            this.f3301x = null;
        }
        this.f3292o.removeOnAttachStateChangeListener(this.f3287j);
        this.f3302y.onDismiss();
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: c */
    public final void mo2152c() {
        Iterator it = this.f3285h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0809f) it.next()).f3276a.f3554c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0813j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p072k.InterfaceC0801C
    public final void dismiss() {
        ArrayList arrayList = this.f3285h;
        int size = arrayList.size();
        if (size > 0) {
            C0809f[] c0809fArr = (C0809f[]) arrayList.toArray(new C0809f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0809f c0809f = c0809fArr[i2];
                if (c0809f.f3276a.f3577z.isShowing()) {
                    c0809f.f3276a.dismiss();
                }
            }
        }
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: e */
    public final C0980x0 mo2149e() {
        ArrayList arrayList = this.f3285h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0809f) arrayList.get(arrayList.size() - 1)).f3276a.f3554c;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: f */
    public final boolean mo2153f(SubMenuC0803E subMenuC0803E) {
        for (C0809f c0809f : this.f3285h) {
            if (subMenuC0803E == c0809f.f3277b) {
                c0809f.f3276a.f3554c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0803E.hasVisibleItems()) {
            return false;
        }
        mo2156l(subMenuC0803E);
        InterfaceC0827x interfaceC0827x = this.f3300w;
        if (interfaceC0827x != null) {
            interfaceC0827x.mo43h(subMenuC0803E);
        }
        return true;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: g */
    public final void mo2154g(InterfaceC0827x interfaceC0827x) {
        this.f3300w = interfaceC0827x;
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: i */
    public final void mo2150i() {
        if (mo2148a()) {
            return;
        }
        ArrayList arrayList = this.f3284g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2176v((MenuC0816m) it.next());
        }
        arrayList.clear();
        View view = this.f3291n;
        this.f3292o = view;
        if (view != null) {
            boolean z2 = this.f3301x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3301x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3286i);
            }
            this.f3292o.addOnAttachStateChangeListener(this.f3287j);
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: k */
    public final boolean mo2155k() {
        return false;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: l */
    public final void mo2156l(MenuC0816m menuC0816m) {
        menuC0816m.m2185b(this, this.f3279b);
        if (mo2148a()) {
            m2176v(menuC0816m);
        } else {
            this.f3284g.add(menuC0816m);
        }
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: n */
    public final void mo2157n(View view) {
        if (this.f3291n != view) {
            this.f3291n = view;
            this.f3290m = Gravity.getAbsoluteGravity(this.f3289l, view.getLayoutDirection());
        }
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: o */
    public final void mo2158o(boolean z2) {
        this.f3298u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0809f c0809f;
        ArrayList arrayList = this.f3285h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0809f = null;
                break;
            }
            c0809f = (C0809f) arrayList.get(i2);
            if (!c0809f.f3276a.f3577z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0809f != null) {
            c0809f.f3277b.m2186c(false);
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
        if (this.f3289l != i2) {
            this.f3289l = i2;
            this.f3290m = Gravity.getAbsoluteGravity(i2, this.f3291n.getLayoutDirection());
        }
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: q */
    public final void mo2160q(int i2) {
        this.f3294q = true;
        this.f3296s = i2;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: r */
    public final void mo2161r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3302y = (C0825v) onDismissListener;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: s */
    public final void mo2162s(boolean z2) {
        this.f3299v = z2;
    }

    @Override // p072k.AbstractC0824u
    /* JADX INFO: renamed from: t */
    public final void mo2163t(int i2) {
        this.f3295r = true;
        this.f3297t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2176v(MenuC0816m menuC0816m) {
        char c2;
        View childAt;
        C0809f c0809f;
        int i2;
        int i3;
        int i4;
        MenuItem item;
        C0813j c0813j;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f3279b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0813j c0813j2 = new C0813j(menuC0816m, layoutInflaterFrom, this.f3282e, R.layout.resc);
        if (!mo2148a() && this.f3298u) {
            c0813j2.f3314c = true;
        } else if (mo2148a()) {
            c0813j2.f3314c = AbstractC0824u.m2204u(menuC0816m);
        }
        int iM2203m = AbstractC0824u.m2203m(c0813j2, context, this.f3280c);
        C0894P0 c0894p0 = new C0894P0(context, null, this.f3281d);
        C0867C c0867c = c0894p0.f3577z;
        c0894p0.f3596D = this.f3288k;
        c0894p0.f3567p = this;
        c0867c.setOnDismissListener(this);
        c0894p0.f3566o = this.f3291n;
        c0894p0.f3563l = this.f3290m;
        c0894p0.f3576y = true;
        c0867c.setFocusable(true);
        c0867c.setInputMethodMode(2);
        c0894p0.mo2296n(c0813j2);
        c0894p0.m2298q(iM2203m);
        c0894p0.f3563l = this.f3290m;
        ArrayList arrayList = this.f3285h;
        if (arrayList.size() > 0) {
            c0809f = (C0809f) arrayList.get(arrayList.size() - 1);
            MenuC0816m menuC0816m2 = c0809f.f3277b;
            int size = menuC0816m2.f3324f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    item = null;
                    break;
                }
                item = menuC0816m2.getItem(i5);
                if (item.hasSubMenu() && menuC0816m == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                childAt = null;
                c2 = 0;
            } else {
                C0980x0 c0980x0 = c0809f.f3276a.f3554c;
                ListAdapter adapter = c0980x0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0813j = (C0813j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0813j = (C0813j) adapter;
                    headersCount = 0;
                }
                int count = c0813j.getCount();
                int i6 = 0;
                c2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c0813j.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c0980x0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0980x0.getChildCount()) ? c0980x0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c2 = 0;
            childAt = null;
            c0809f = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0894P0.f3595E;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c2] = Boolean.FALSE;
                        method.invoke(c0867c, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC0890N0.m2313a(c0867c, false);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                AbstractC0888M0.m2311a(c0867c, null);
            }
            C0980x0 c0980x02 = ((C0809f) arrayList.get(arrayList.size() - 1)).f3276a.f3554c;
            int[] iArr = new int[2];
            c0980x02.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f3292o.getWindowVisibleDisplayFrame(rect);
            if (this.f3293p == 1) {
                i2 = (c0980x02.getWidth() + iArr[0]) + iM2203m > rect.right ? 0 : 1;
            } else if (iArr[0] - iM2203m < 0) {
            }
            boolean z2 = i2 == 1;
            this.f3293p = i2;
            if (i7 >= 26) {
                c0894p0.f3566o = childAt;
                i3 = 0;
                i4 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f3291n.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f3290m & 7) == 5) {
                    iArr2[0] = this.f3291n.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i8 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
                i4 = i8;
            }
            c0894p0.f3557f = (this.f3290m & 5) == 5 ? z2 ? i4 + iM2203m : i4 - childAt.getWidth() : z2 ? i4 + childAt.getWidth() : i4 - iM2203m;
            c0894p0.f3562k = true;
            c0894p0.f3561j = true;
            c0894p0.m2294l(i3);
        } else {
            if (this.f3294q) {
                c0894p0.f3557f = this.f3296s;
            }
            if (this.f3295r) {
                c0894p0.m2294l(this.f3297t);
            }
            Rect rect2 = this.f3385a;
            c0894p0.f3575x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C0809f(c0894p0, menuC0816m, this.f3293p));
        c0894p0.mo2150i();
        C0980x0 c0980x03 = c0894p0.f3554c;
        c0980x03.setOnKeyListener(this);
        if (c0809f == null && this.f3299v && menuC0816m.f3331m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.resc, (ViewGroup) c0980x03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0816m.f3331m);
            c0980x03.addHeaderView(frameLayout, null, false);
            c0894p0.mo2150i();
        }
    }
}
