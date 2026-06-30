package p072k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p074l.AbstractViewOnTouchListenerC0864A0;
import p074l.C0932g;
import p074l.C0935h;
import p074l.C0941j;
import p074l.C0944k;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0805b extends AbstractViewOnTouchListenerC0864A0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3268j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f3269k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3269k = actionMenuItemView;
    }

    @Override // p074l.AbstractViewOnTouchListenerC0864A0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0801C mo2173b() {
        C0932g c0932g;
        switch (this.f3268j) {
            case 0:
                AbstractC0806c abstractC0806c = ((ActionMenuItemView) this.f3269k).f1260m;
                if (abstractC0806c == null || (c0932g = ((C0935h) abstractC0806c).f3725a.f3752t) == null) {
                    return null;
                }
                return c0932g.m2205a();
            default:
                C0932g c0932g2 = ((C0941j) this.f3269k).f3730d.f3751s;
                if (c0932g2 == null) {
                    return null;
                }
                return c0932g2.m2205a();
        }
    }

    @Override // p074l.AbstractViewOnTouchListenerC0864A0
    /* JADX INFO: renamed from: c */
    public final boolean mo2174c() {
        InterfaceC0801C interfaceC0801CMo2173b;
        switch (this.f3268j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3269k;
                InterfaceC0815l interfaceC0815l = actionMenuItemView.f1258k;
                return interfaceC0815l != null && interfaceC0815l.mo1195b(actionMenuItemView.f1255h) && (interfaceC0801CMo2173b = mo2173b()) != null && interfaceC0801CMo2173b.mo2148a();
            default:
                ((C0941j) this.f3269k).f3730d.m2384l();
                return true;
        }
    }

    @Override // p074l.AbstractViewOnTouchListenerC0864A0
    /* JADX INFO: renamed from: d */
    public boolean mo2175d() {
        switch (this.f3268j) {
            case 1:
                C0944k c0944k = ((C0941j) this.f3269k).f3730d;
                if (c0944k.f3753u != null) {
                    return false;
                }
                c0944k.m2382e();
                return true;
            default:
                return super.mo2175d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805b(C0941j c0941j, C0941j c0941j2) {
        super(c0941j2);
        this.f3269k = c0941j;
    }
}
