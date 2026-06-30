package p065g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0707c extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final ObjectAnimator f2817p;

    /* JADX INFO: renamed from: q */
    public final boolean f2818q;

    public C0707c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i2 = z2 ? numberOfFrames - 1 : 0;
        int i3 = z2 ? 0 : numberOfFrames - 1;
        C0708d c0708d = new C0708d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c0708d.f2820b = numberOfFrames2;
        int[] iArr = c0708d.f2819a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c0708d.f2819a = new int[numberOfFrames2];
        }
        int[] iArr2 = c0708d.f2819a;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
            iArr2[i5] = duration;
            i4 += duration;
        }
        c0708d.f2821c = i4;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c0708d.f2821c);
        objectAnimatorOfInt.setInterpolator(c0708d);
        this.f2818q = z3;
        this.f2817p = objectAnimatorOfInt;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: Y */
    public final void mo1070Y() {
        this.f2817p.reverse();
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: h */
    public final boolean mo1073h() {
        return this.f2818q;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: i0 */
    public final void mo1075i0() {
        this.f2817p.start();
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: j0 */
    public final void mo1077j0() {
        this.f2817p.cancel();
    }
}
