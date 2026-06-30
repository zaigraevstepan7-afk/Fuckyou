package p073k0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import p015I0.C0109e;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: k0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0842f extends AbstractC0849m {

    /* JADX INFO: renamed from: A */
    public static final String[] f3432A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: B */
    public static final C0838b f3433B = new C0838b(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: C */
    public static final C0838b f3434C = new C0838b(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: D */
    public static final C0838b f3435D = new C0838b(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: E */
    public static final C0838b f3436E = new C0838b(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: F */
    public static final C0838b f3437F = new C0838b(PointF.class, "position", 4);

    /* JADX INFO: renamed from: I */
    public static void m2237I(C0857u c0857u) {
        View view = c0857u.f3490b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c0857u.f3489a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c0857u.f3490b.getParent());
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: d */
    public final void mo2228d(C0857u c0857u) {
        m2237I(c0857u);
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: g */
    public final void mo2230g(C0857u c0857u) {
        m2237I(c0857u);
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: k */
    public final Animator mo2238k(FrameLayout frameLayout, C0857u c0857u, C0857u c0857u2) {
        int i2;
        C0842f c0842f;
        Animator animatorM2245a;
        if (c0857u != null && c0857u2 != null) {
            HashMap map = c0857u.f3489a;
            HashMap map2 = c0857u2.f3489a;
            ViewGroup viewGroup = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup2 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup != null && viewGroup2 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                    i2 = 0;
                } else {
                    i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                if (i2 > 0) {
                    View view = c0857u2.f3490b;
                    AbstractC0859w.m2265a(view, i3, i5, i7, i9);
                    if (i2 != 2) {
                        c0842f = this;
                        if (i3 == i4 && i5 == i6) {
                            c0842f.f3478v.getClass();
                            animatorM2245a = AbstractC0845i.m2245a(view, f3435D, C0109e.m455e(i7, i9, i8, i10));
                        } else {
                            c0842f.f3478v.getClass();
                            animatorM2245a = AbstractC0845i.m2245a(view, f3436E, C0109e.m455e(i3, i5, i4, i6));
                        }
                    } else if (i11 == i13 && i12 == i14) {
                        c0842f = this;
                        c0842f.f3478v.getClass();
                        animatorM2245a = AbstractC0845i.m2245a(view, f3437F, C0109e.m455e(i3, i5, i4, i6));
                    } else {
                        c0842f = this;
                        C0841e c0841e = new C0841e(view);
                        c0842f.f3478v.getClass();
                        ObjectAnimator objectAnimatorM2245a = AbstractC0845i.m2245a(c0841e, f3433B, C0109e.m455e(i3, i5, i4, i6));
                        c0842f.f3478v.getClass();
                        ObjectAnimator objectAnimatorM2245a2 = AbstractC0845i.m2245a(c0841e, f3434C, C0109e.m455e(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM2245a, objectAnimatorM2245a2);
                        animatorSet.addListener(new C0839c(c0841e));
                        animatorM2245a = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                        AbstractC0383m.m1045k0(viewGroup3, true);
                        c0842f.m2256o().m2250a(new C0840d(viewGroup3));
                    }
                    return animatorM2245a;
                }
            }
        }
        return null;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: q */
    public final String[] mo2239q() {
        return f3432A;
    }
}
