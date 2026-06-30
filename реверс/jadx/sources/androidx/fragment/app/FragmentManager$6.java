package androidx.fragment.app;

import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0584p {
    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        if (enumC0580l == EnumC0580l.ON_START || enumC0580l == EnumC0580l.ON_DESTROY) {
            throw null;
        }
    }
}
