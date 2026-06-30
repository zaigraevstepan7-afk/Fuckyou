package p072k;

import android.view.ActionProvider;
import p000A.C0001b;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0819p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C0001b f3375a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f3376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuItemC0823t f3377c;

    public ActionProviderVisibilityListenerC0819p(MenuItemC0823t menuItemC0823t, ActionProvider actionProvider) {
        this.f3377c = menuItemC0823t;
        this.f3376b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0001b c0001b = this.f3375a;
        if (c0001b != null) {
            MenuC0816m menuC0816m = ((C0818o) c0001b.f1b).f3362n;
            menuC0816m.f3326h = true;
            menuC0816m.m2191p(true);
        }
    }
}
