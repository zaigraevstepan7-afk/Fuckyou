package p074l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000A.C0001b;
import p072k.C0818o;
import p072k.MenuC0816m;

/* JADX INFO: renamed from: l.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0894P0 extends C0884K0 implements InterfaceC0886L0 {

    /* JADX INFO: renamed from: E */
    public static final Method f3595E;

    /* JADX INFO: renamed from: D */
    public C0001b f3596D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3595E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p074l.InterfaceC0886L0
    /* JADX INFO: renamed from: g */
    public final void mo42g(MenuC0816m menuC0816m, C0818o c0818o) {
        C0001b c0001b = this.f3596D;
        if (c0001b != null) {
            c0001b.mo42g(menuC0816m, c0818o);
        }
    }

    @Override // p074l.C0884K0
    /* JADX INFO: renamed from: p */
    public final C0980x0 mo2297p(Context context, boolean z2) {
        C0892O0 c0892o0 = new C0892O0(context, z2);
        c0892o0.setHoverListener(this);
        return c0892o0;
    }

    @Override // p074l.InterfaceC0886L0
    /* JADX INFO: renamed from: z */
    public final void mo61z(MenuC0816m menuC0816m, C0818o c0818o) {
        C0001b c0001b = this.f3596D;
        if (c0001b != null) {
            c0001b.mo61z(menuC0816m, c0818o);
        }
    }
}
