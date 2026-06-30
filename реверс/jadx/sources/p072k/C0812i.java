package p072k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p018K.C0154j;
import p060e.C0662d;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0812i implements InterfaceC0828y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f3306a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f3307b;

    /* JADX INFO: renamed from: c */
    public MenuC0816m f3308c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f3309d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0827x f3310e;

    /* JADX INFO: renamed from: f */
    public C0811h f3311f;

    public C0812i(ContextWrapper contextWrapper) {
        this.f3306a = contextWrapper;
        this.f3307b = LayoutInflater.from(contextWrapper);
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: b */
    public final void mo2151b(MenuC0816m menuC0816m, boolean z2) {
        InterfaceC0827x interfaceC0827x = this.f3310e;
        if (interfaceC0827x != null) {
            interfaceC0827x.mo37b(menuC0816m, z2);
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: c */
    public final void mo2152c() {
        C0811h c0811h = this.f3311f;
        if (c0811h != null) {
            c0811h.notifyDataSetChanged();
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: d */
    public final boolean mo2179d(C0818o c0818o) {
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: f */
    public final boolean mo2153f(SubMenuC0803E subMenuC0803E) {
        if (!subMenuC0803E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0817n dialogInterfaceOnKeyListenerC0817n = new DialogInterfaceOnKeyListenerC0817n();
        dialogInterfaceOnKeyListenerC0817n.f3343a = subMenuC0803E;
        Context context = subMenuC0803E.f3319a;
        C0154j c0154j = new C0154j(context);
        C0662d c0662d = (C0662d) c0154j.f485b;
        C0812i c0812i = new C0812i(c0662d.f2639a);
        dialogInterfaceOnKeyListenerC0817n.f3345c = c0812i;
        c0812i.f3310e = dialogInterfaceOnKeyListenerC0817n;
        subMenuC0803E.m2185b(c0812i, context);
        C0812i c0812i2 = dialogInterfaceOnKeyListenerC0817n.f3345c;
        if (c0812i2.f3311f == null) {
            c0812i2.f3311f = new C0811h(c0812i2);
        }
        c0662d.f2653o = c0812i2.f3311f;
        c0662d.f2654p = dialogInterfaceOnKeyListenerC0817n;
        View view = subMenuC0803E.f3333o;
        if (view != null) {
            c0662d.f2643e = view;
        } else {
            c0662d.f2641c = subMenuC0803E.f3332n;
            c0662d.f2642d = subMenuC0803E.f3331m;
        }
        c0662d.f2652n = dialogInterfaceOnKeyListenerC0817n;
        DialogInterfaceC0666h dialogInterfaceC0666hMo569a = c0154j.mo569a();
        dialogInterfaceOnKeyListenerC0817n.f3344b = dialogInterfaceC0666hMo569a;
        dialogInterfaceC0666hMo569a.setOnDismissListener(dialogInterfaceOnKeyListenerC0817n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0817n.f3344b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0817n.f3344b.show();
        InterfaceC0827x interfaceC0827x = this.f3310e;
        if (interfaceC0827x == null) {
            return true;
        }
        interfaceC0827x.mo43h(subMenuC0803E);
        return true;
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

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: j */
    public final void mo2181j(Context context, MenuC0816m menuC0816m) {
        if (this.f3306a != null) {
            this.f3306a = context;
            if (this.f3307b == null) {
                this.f3307b = LayoutInflater.from(context);
            }
        }
        this.f3308c = menuC0816m;
        C0811h c0811h = this.f3311f;
        if (c0811h != null) {
            c0811h.notifyDataSetChanged();
        }
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: k */
    public final boolean mo2155k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f3308c.m2192q(this.f3311f.getItem(i2), this, 0);
    }
}
