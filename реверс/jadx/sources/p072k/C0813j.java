package p072k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0813j extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC0816m f3312a;

    /* JADX INFO: renamed from: b */
    public int f3313b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f3314c;

    /* JADX INFO: renamed from: d */
    public final boolean f3315d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f3316e;

    /* JADX INFO: renamed from: f */
    public final int f3317f;

    public C0813j(MenuC0816m menuC0816m, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f3315d = z2;
        this.f3316e = layoutInflater;
        this.f3312a = menuC0816m;
        this.f3317f = i2;
        m2182a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2182a() {
        MenuC0816m menuC0816m = this.f3312a;
        C0818o c0818o = menuC0816m.f3340v;
        if (c0818o != null) {
            menuC0816m.m2189i();
            ArrayList arrayList = menuC0816m.f3328j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0818o) arrayList.get(i2)) == c0818o) {
                    this.f3313b = i2;
                    return;
                }
            }
        }
        this.f3313b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0818o getItem(int i2) {
        ArrayList arrayListM2190l;
        MenuC0816m menuC0816m = this.f3312a;
        if (this.f3315d) {
            menuC0816m.m2189i();
            arrayListM2190l = menuC0816m.f3328j;
        } else {
            arrayListM2190l = menuC0816m.m2190l();
        }
        int i3 = this.f3313b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0818o) arrayListM2190l.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM2190l;
        MenuC0816m menuC0816m = this.f3312a;
        if (this.f3315d) {
            menuC0816m.m2189i();
            arrayListM2190l = menuC0816m.f3328j;
        } else {
            arrayListM2190l = menuC0816m.m2190l();
        }
        return this.f3313b < 0 ? arrayListM2190l.size() : arrayListM2190l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3316e.inflate(this.f3317f, viewGroup, false);
        }
        int i3 = getItem(i2).f3350b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f3350b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3312a.mo2169m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0829z interfaceC0829z = (InterfaceC0829z) view;
        if (this.f3314c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0829z.mo1190a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2182a();
        super.notifyDataSetChanged();
    }
}
