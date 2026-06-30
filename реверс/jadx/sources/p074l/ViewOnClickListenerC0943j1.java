package p074l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p072k.C0804a;

/* JADX INFO: renamed from: l.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0943j1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final C0804a f3731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0946k1 f3732b;

    public ViewOnClickListenerC0943j1(C0946k1 c0946k1) {
        this.f3732b = c0946k1;
        Context context = c0946k1.f3769a.getContext();
        CharSequence charSequence = c0946k1.f3776h;
        C0804a c0804a = new C0804a();
        c0804a.f3256e = 4096;
        c0804a.f3258g = 4096;
        c0804a.f3263l = null;
        c0804a.f3264m = null;
        c0804a.f3265n = false;
        c0804a.f3266o = false;
        c0804a.f3267p = 16;
        c0804a.f3260i = context;
        c0804a.f3252a = charSequence;
        this.f3731a = c0804a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0946k1 c0946k1 = this.f3732b;
        Window.Callback callback = c0946k1.f3779k;
        if (callback == null || !c0946k1.f3780l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3731a);
    }
}
