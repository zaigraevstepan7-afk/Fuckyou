package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l72 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ t72 a;
    public final /* synthetic */ p82 b;
    public final /* synthetic */ p82 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public l72(t72 t72Var, p82 p82Var, p82 p82Var2, int i, View view) {
        this.a = t72Var;
        this.b = p82Var;
        this.c = p82Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        t72 t72Var = this.a;
        s72 s72Var = t72Var.a;
        s72Var.d(animatedFraction);
        float fB = s72Var.b();
        PathInterpolator pathInterpolator = p72.e;
        int i = Build.VERSION.SDK_INT;
        p82 p82Var = this.b;
        c82 b82Var = i >= 36 ? new b82(p82Var) : i >= 35 ? new a82(p82Var) : i >= 34 ? new z72(p82Var) : i >= 31 ? new y72(p82Var) : i >= 30 ? new x72(p82Var) : i >= 29 ? new w72(p82Var) : new u72(p82Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            m82 m82Var = p82Var.a;
            if (i3 == 0) {
                b82Var.d(i2, m82Var.h(i2));
            } else {
                eh0 eh0VarH = m82Var.h(i2);
                eh0 eh0VarH2 = this.c.a.h(i2);
                float f = 1.0f - fB;
                b82Var.d(i2, p82.a(eh0VarH, (int) (((double) ((eh0VarH.a - eh0VarH2.a) * f)) + 0.5d), (int) (((double) ((eh0VarH.b - eh0VarH2.b) * f)) + 0.5d), (int) (((double) ((eh0VarH.c - eh0VarH2.c) * f)) + 0.5d), (int) (((double) ((eh0VarH.d - eh0VarH2.d) * f)) + 0.5d)));
            }
        }
        p72.g(this.e, b82Var.b(), Collections.singletonList(t72Var));
    }
}
