package p074l;

import androidx.appcompat.widget.ActionBarContextView;
import p024N.InterfaceC0251b0;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0914a implements InterfaceC0251b0 {

    /* JADX INFO: renamed from: a */
    public boolean f3683a = false;

    /* JADX INFO: renamed from: b */
    public int f3684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActionBarContextView f3685c;

    public C0914a(ActionBarContextView actionBarContextView) {
        this.f3685c = actionBarContextView;
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: a */
    public final void mo816a() {
        if (this.f3683a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3685c;
        actionBarContextView.f1299f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3684b);
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: b */
    public final void mo215b() {
        this.f3683a = true;
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: c */
    public final void mo216c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3683a = false;
    }
}
