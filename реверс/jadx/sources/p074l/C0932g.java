package p074l;

import android.content.Context;
import android.view.View;
import com.reddit.frontpage.R;
import p000A.C0001b;
import p072k.AbstractC0824u;
import p072k.C0826w;
import p072k.MenuC0816m;
import p072k.SubMenuC0803E;

/* JADX INFO: renamed from: l.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0932g extends C0826w {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3721l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0944k f3722m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0932g(C0944k c0944k, Context context, MenuC0816m menuC0816m, View view) {
        super(R.attr.resc, context, view, menuC0816m, true);
        this.f3722m = c0944k;
        this.f3392f = 8388613;
        C0001b c0001b = c0944k.f3755w;
        this.f3394h = c0001b;
        AbstractC0824u abstractC0824u = this.f3395i;
        if (abstractC0824u != null) {
            abstractC0824u.mo2154g(c0001b);
        }
    }

    @Override // p072k.C0826w
    /* JADX INFO: renamed from: c */
    public final void mo2207c() {
        switch (this.f3721l) {
            case 0:
                C0944k c0944k = this.f3722m;
                c0944k.f3752t = null;
                c0944k.getClass();
                super.mo2207c();
                break;
            default:
                C0944k c0944k2 = this.f3722m;
                MenuC0816m menuC0816m = c0944k2.f3735c;
                if (menuC0816m != null) {
                    menuC0816m.m2186c(true);
                }
                c0944k2.f3751s = null;
                super.mo2207c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0932g(C0944k c0944k, Context context, SubMenuC0803E subMenuC0803E, View view) {
        super(R.attr.resc, context, view, subMenuC0803E, false);
        this.f3722m = c0944k;
        if ((subMenuC0803E.f3250A.f3372x & 32) != 32) {
            View view2 = c0944k.f3741i;
            this.f3391e = view2 == null ? (View) c0944k.f3740h : view2;
        }
        C0001b c0001b = c0944k.f3755w;
        this.f3394h = c0001b;
        AbstractC0824u abstractC0824u = this.f3395i;
        if (abstractC0824u != null) {
            abstractC0824u.mo2154g(c0001b);
        }
    }
}
