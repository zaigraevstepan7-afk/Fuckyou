package p085q0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p004C.RunnableC0024e;
import p024N.AbstractC0240S;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1033a extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public int f4108p;

    /* JADX INFO: renamed from: q */
    public int f4109q = -1;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ SwipeDismissBehavior f4110r;

    public C1033a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4110r = swipeDismissBehavior;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: C */
    public final int mo546C(View view) {
        return view.getWidth();
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: Q */
    public final void mo1066Q(View view, int i2) {
        this.f4109q = i2;
        this.f4108p = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4110r;
            swipeDismissBehavior.f2065c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2065c = false;
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: S */
    public final void mo549S(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4110r;
        float f = width * swipeDismissBehavior.f2067e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2068f;
        float fAbs = Math.abs(i2 - this.f4108p);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo550T(View view, float f, float f2) {
        int i2;
        this.f4109q = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4110r;
        boolean z2 = true;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f2066d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                i2 = this.f4108p;
                z2 = false;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i4 = this.f4108p;
                i2 = left < i4 ? this.f4108p - width : i4 + width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f4108p) >= Math.round(view.getWidth() * 0.5f)) {
            }
        }
        if (swipeDismissBehavior.f2063a.m1129o(i2, view.getTop())) {
            RunnableC0024e runnableC0024e = new RunnableC0024e(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            view.postOnAnimation(runnableC0024e);
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: l */
    public final int mo551l(View view, int i2) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i3 = this.f4110r.f2066d;
        if (i3 == 0) {
            if (z2) {
                width = this.f4108p - view.getWidth();
                width2 = this.f4108p;
            } else {
                width = this.f4108p;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f4108p - view.getWidth();
            width2 = view.getWidth() + this.f4108p;
        } else if (z2) {
            width = this.f4108p;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4108p - view.getWidth();
            width2 = this.f4108p;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: m */
    public final int mo552m(View view, int i2) {
        return view.getTop();
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: m0 */
    public final boolean mo553m0(View view, int i2) {
        int i3 = this.f4109q;
        return (i3 == -1 || i3 == i2) && this.f4110r.mo1688r(view);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: R */
    public final void mo548R(int i2) {
    }
}
