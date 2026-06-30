package p074l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0511A;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p072k.InterfaceC0814k;
import p072k.MenuC0816m;

/* JADX INFO: renamed from: l.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0925d1 implements InterfaceC0953n, InterfaceC0814k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f3710a;

    public /* synthetic */ C0925d1(Toolbar toolbar) {
        this.f3710a = toolbar;
    }

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: v */
    public void mo57v(MenuC0816m menuC0816m) {
        Toolbar toolbar = this.f3710a;
        C0944k c0944k = toolbar.f1388a.f1349t;
        if (c0944k == null || !c0944k.m2383i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1377G.f837b).iterator();
            while (it.hasNext()) {
                ((C0511A) it.next()).f1564a.m1376s();
            }
        }
    }

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: w */
    public boolean mo58w(MenuC0816m menuC0816m, MenuItem menuItem) {
        this.f3710a.getClass();
        return false;
    }
}
