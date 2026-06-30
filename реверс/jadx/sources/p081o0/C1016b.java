package p081o0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p084q.C1031j;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1016b {

    /* JADX INFO: renamed from: a */
    public final C1031j f4051a = new C1031j(0);

    /* JADX INFO: renamed from: b */
    public final C1031j f4052b = new C1031j(0);

    /* JADX INFO: renamed from: a */
    public static C1016b m2464a(Context context, int i2) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2465b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2465b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1016b m2465b(ArrayList arrayList) {
        C1016b c1016b = new C1016b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1016b.f4052b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1015a.f4047b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1015a.f4048c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1015a.f4049d;
            }
            C1017c c1017c = new C1017c();
            c1017c.f4056d = 0;
            c1017c.f4057e = 1;
            c1017c.f4053a = startDelay;
            c1017c.f4054b = duration;
            c1017c.f4055c = interpolator;
            c1017c.f4056d = objectAnimator.getRepeatCount();
            c1017c.f4057e = objectAnimator.getRepeatMode();
            c1016b.f4051a.put(propertyName, c1017c);
        }
        return c1016b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1016b) {
            return this.f4051a.equals(((C1016b) obj).f4051a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4051a.hashCode();
    }

    public final String toString() {
        return "\n" + C1016b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4051a + "}\n";
    }
}
