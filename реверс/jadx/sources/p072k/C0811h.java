package p072k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.reddit.frontpage.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0811h extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f3304a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0812i f3305b;

    public C0811h(C0812i c0812i) {
        this.f3305b = c0812i;
        m2177a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2177a() {
        MenuC0816m menuC0816m = this.f3305b.f3308c;
        C0818o c0818o = menuC0816m.f3340v;
        if (c0818o != null) {
            menuC0816m.m2189i();
            ArrayList arrayList = menuC0816m.f3328j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0818o) arrayList.get(i2)) == c0818o) {
                    this.f3304a = i2;
                    return;
                }
            }
        }
        this.f3304a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0818o getItem(int i2) {
        C0812i c0812i = this.f3305b;
        MenuC0816m menuC0816m = c0812i.f3308c;
        menuC0816m.m2189i();
        ArrayList arrayList = menuC0816m.f3328j;
        c0812i.getClass();
        int i3 = this.f3304a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0818o) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0812i c0812i = this.f3305b;
        MenuC0816m menuC0816m = c0812i.f3308c;
        menuC0816m.m2189i();
        int size = menuC0816m.f3328j.size();
        c0812i.getClass();
        return this.f3304a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3305b.f3307b.inflate(R.layout.resc, viewGroup, false);
        }
        ((InterfaceC0829z) view).mo1190a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2177a();
        super.notifyDataSetChanged();
    }
}
