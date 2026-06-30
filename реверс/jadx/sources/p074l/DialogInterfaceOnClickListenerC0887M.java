package p074l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p018K.C0154j;
import p060e.C0662d;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: renamed from: l.M */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0887M implements InterfaceC0898S, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0666h f3578a;

    /* JADX INFO: renamed from: b */
    public C0889N f3579b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3580c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0900T f3581d;

    public DialogInterfaceOnClickListenerC0887M(C0900T c0900t) {
        this.f3581d = c0900t;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: a */
    public final boolean mo2300a() {
        DialogInterfaceC0666h dialogInterfaceC0666h = this.f3578a;
        if (dialogInterfaceC0666h != null) {
            return dialogInterfaceC0666h.isShowing();
        }
        return false;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: b */
    public final CharSequence mo2301b() {
        return this.f3580c;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: c */
    public final void mo2302c(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: d */
    public final int mo2303d() {
        return 0;
    }

    @Override // p074l.InterfaceC0898S
    public final void dismiss() {
        DialogInterfaceC0666h dialogInterfaceC0666h = this.f3578a;
        if (dialogInterfaceC0666h != null) {
            dialogInterfaceC0666h.dismiss();
            this.f3578a = null;
        }
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: f */
    public final void mo2304f(int i2, int i3) {
        if (this.f3579b == null) {
            return;
        }
        C0900T c0900t = this.f3581d;
        C0154j c0154j = new C0154j(c0900t.getPopupContext());
        CharSequence charSequence = this.f3580c;
        C0662d c0662d = (C0662d) c0154j.f485b;
        if (charSequence != null) {
            c0662d.f2642d = charSequence;
        }
        C0889N c0889n = this.f3579b;
        int selectedItemPosition = c0900t.getSelectedItemPosition();
        c0662d.f2653o = c0889n;
        c0662d.f2654p = this;
        c0662d.f2657s = selectedItemPosition;
        c0662d.f2656r = true;
        DialogInterfaceC0666h dialogInterfaceC0666hMo569a = c0154j.mo569a();
        this.f3578a = dialogInterfaceC0666hMo569a;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0666hMo569a.f2693f.f2670f;
        alertController$RecycleListView.setTextDirection(i2);
        alertController$RecycleListView.setTextAlignment(i3);
        this.f3578a.show();
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: h */
    public final void mo2305h(CharSequence charSequence) {
        this.f3580c = charSequence;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: j */
    public final int mo2306j() {
        return 0;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: k */
    public final void mo2307k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: l */
    public final void mo2308l(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: m */
    public final Drawable mo2309m() {
        return null;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: n */
    public final void mo2296n(ListAdapter listAdapter) {
        this.f3579b = (C0889N) listAdapter;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: o */
    public final void mo2310o(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0900T c0900t = this.f3581d;
        c0900t.setSelection(i2);
        if (c0900t.getOnItemClickListener() != null) {
            c0900t.performItemClick(null, i2, this.f3579b.getItemId(i2));
        }
        dismiss();
    }
}
