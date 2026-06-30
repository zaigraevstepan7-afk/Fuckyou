package p074l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p072k.C0813j;
import p072k.C0818o;
import p072k.MenuC0816m;

/* JADX INFO: renamed from: l.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0892O0 extends C0980x0 {

    /* JADX INFO: renamed from: m */
    public final int f3586m;

    /* JADX INFO: renamed from: n */
    public final int f3587n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0886L0 f3588o;

    /* JADX INFO: renamed from: p */
    public C0818o f3589p;

    public C0892O0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3586m = 21;
            this.f3587n = 22;
        } else {
            this.f3586m = 22;
            this.f3587n = 21;
        }
    }

    @Override // p074l.C0980x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0813j c0813j;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f3588o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0813j = (C0813j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0813j = (C0813j) adapter;
                headersCount = 0;
            }
            C0818o c0818oM2183b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= c0813j.getCount()) ? null : c0813j.getItem(i2);
            C0818o c0818o = this.f3589p;
            if (c0818o != c0818oM2183b) {
                MenuC0816m menuC0816m = c0813j.f3312a;
                if (c0818o != null) {
                    this.f3588o.mo61z(menuC0816m, c0818o);
                }
                this.f3589p = c0818oM2183b;
                if (c0818oM2183b != null) {
                    this.f3588o.mo42g(menuC0816m, c0818oM2183b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3586m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f3587n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0813j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0813j) adapter).f3312a.m2186c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0886L0 interfaceC0886L0) {
        this.f3588o = interfaceC0886L0;
    }

    @Override // p074l.C0980x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
