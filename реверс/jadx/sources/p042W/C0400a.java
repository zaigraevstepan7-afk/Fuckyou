package p042W;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import p000A.C0001b;
import p024N.AbstractC0240S;
import p026O.C0311k;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0400a extends C0001b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0401b f1071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400a(AbstractC0401b abstractC0401b) {
        super(7);
        this.f1071c = abstractC0401b;
    }

    @Override // p000A.C0001b
    /* JADX INFO: renamed from: C */
    public final C0311k mo32C(int i2) {
        return new C0311k(AccessibilityNodeInfo.obtain(this.f1071c.m1110r(i2).f911a));
    }

    @Override // p000A.C0001b
    /* JADX INFO: renamed from: D */
    public final C0311k mo33D(int i2) {
        AbstractC0401b abstractC0401b = this.f1071c;
        int i3 = i2 == 2 ? abstractC0401b.f1082k : abstractC0401b.f1083l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return mo32C(i3);
    }

    @Override // p000A.C0001b
    /* JADX INFO: renamed from: F */
    public final boolean mo35F(int i2, int i3, Bundle bundle) {
        int i4;
        AbstractC0401b abstractC0401b = this.f1071c;
        View view = abstractC0401b.f1080i;
        if (i2 == -1) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            return view.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return abstractC0401b.m1113w(i2);
        }
        if (i3 == 2) {
            return abstractC0401b.m1104j(i2);
        }
        if (i3 != 64) {
            if (i3 != 128) {
                return abstractC0401b.mo572s(i2, i3, bundle);
            }
            if (abstractC0401b.f1082k != i2) {
                return false;
            }
            abstractC0401b.f1082k = Integer.MIN_VALUE;
            view.invalidate();
            abstractC0401b.m1114x(i2, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = abstractC0401b.f1079h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = abstractC0401b.f1082k) == i2) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            abstractC0401b.f1082k = Integer.MIN_VALUE;
            abstractC0401b.f1080i.invalidate();
            abstractC0401b.m1114x(i4, 65536);
        }
        abstractC0401b.f1082k = i2;
        view.invalidate();
        abstractC0401b.m1114x(i2, 32768);
        return true;
    }
}
