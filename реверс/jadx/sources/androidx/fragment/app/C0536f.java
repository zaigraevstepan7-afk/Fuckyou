package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.reddit.frontpage.R;
import p005C0.C0048n;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0536f extends AbstractC0537g {

    /* JADX INFO: renamed from: c */
    public boolean f1718c;

    /* JADX INFO: renamed from: d */
    public boolean f1719d;

    /* JADX INFO: renamed from: e */
    public C0048n f1720e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7 A[Catch: RuntimeException -> 0x00fd, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00fd, blocks: (B:78:0x00f1, B:80:0x00f7), top: B:91:0x00f1 }] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0048n m1425j(Context context) {
        int i2;
        Animation animationLoadAnimation;
        C0048n c0048n;
        Animator animatorLoadAnimator;
        int iM1046l0;
        if (this.f1719d) {
            return this.f1720e;
        }
        C0528S c0528s = (C0528S) this.f1721a;
        boolean z2 = c0528s.f1667a == 2;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0528s.f1669c;
        C0546p c0546p = abstractComponentCallbacksC0548r.f1766H;
        int i3 = c0546p == null ? 0 : c0546p.f1752f;
        if (this.f1718c) {
            if (z2) {
                i2 = c0546p == null ? 0 : c0546p.f1750d;
            } else if (c0546p != null) {
                i2 = c0546p.f1751e;
            }
        } else if (z2) {
            if (c0546p != null) {
                i2 = c0546p.f1748b;
            }
        } else if (c0546p != null) {
            i2 = c0546p.f1749c;
        }
        abstractComponentCallbacksC0548r.m1455D(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        C0048n c0048n2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.resc) != null) {
            abstractComponentCallbacksC0548r.f1762D.setTag(R.id.resc, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0548r.f1762D;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i2 == 0 && i3 != 0) {
                if (i3 == 4097) {
                    i2 = z2 ? R.animator.resc : R.animator.resc;
                } else if (i3 != 8194) {
                    if (i3 == 8197) {
                        iM1046l0 = z2 ? AbstractC0383m.m1046l0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0383m.m1046l0(context, android.R.attr.activityCloseExitAnimation);
                    } else if (i3 == 4099) {
                        i2 = z2 ? R.animator.resc : R.animator.resc;
                    } else if (i3 != 4100) {
                        i2 = -1;
                    } else {
                        iM1046l0 = z2 ? AbstractC0383m.m1046l0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0383m.m1046l0(context, android.R.attr.activityOpenExitAnimation);
                    }
                    i2 = iM1046l0;
                } else {
                    i2 = z2 ? R.animator.resc : R.animator.resc;
                }
            }
            if (i2 != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i2));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, i2);
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
                            if (animatorLoadAnimator != null) {
                            }
                        } catch (RuntimeException e3) {
                            if (zEquals) {
                                throw e3;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                            if (animationLoadAnimation2 != null) {
                                c0048n2 = new C0048n(animationLoadAnimation2);
                            }
                        }
                    }
                    if (animationLoadAnimation != null) {
                        c0048n = new C0048n(animationLoadAnimation);
                        c0048n2 = c0048n;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
                    if (animatorLoadAnimator != null) {
                        c0048n = new C0048n(animatorLoadAnimator);
                        c0048n2 = c0048n;
                    }
                }
            }
        }
        this.f1720e = c0048n2;
        this.f1719d = true;
        return c0048n2;
    }
}
