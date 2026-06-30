package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.reddit.secondpage.R;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements View.OnApplyWindowInsetsListener {
    public final kl a;
    public p82 b;

    public o72(View view, kl klVar) {
        p82 p82VarB;
        this.a = klVar;
        Field field = h62.a;
        p82 p82VarA = c62.a(view);
        if (p82VarA != null) {
            int i = Build.VERSION.SDK_INT;
            p82VarB = (i >= 36 ? new b82(p82VarA) : i >= 35 ? new a82(p82VarA) : i >= 34 ? new z72(p82VarA) : i >= 31 ? new y72(p82VarA) : i >= 30 ? new x72(p82VarA) : i >= 29 ? new w72(p82VarA) : new u72(p82VarA)).b();
        } else {
            p82VarB = null;
        }
        this.b = p82VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = p82.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        p82 p82VarC = p82.c(windowInsets, view);
        m82 m82Var = p82VarC.a;
        if (this.b == null) {
            Field field = h62.a;
            this.b = c62.a(view);
        }
        if (this.b == null) {
            this.b = p82VarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            kl klVarI = p72.i(view);
            if (klVarI == null || !Objects.equals((p82) klVarI.f, p82VarC)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                p82 p82Var = this.b;
                int i = 1;
                while (i <= 512) {
                    eh0 eh0VarH = m82Var.h(i);
                    eh0 eh0VarH2 = p82Var.a.h(i);
                    int i2 = eh0VarH.a;
                    int i3 = eh0VarH.d;
                    int i4 = eh0VarH.c;
                    int i5 = eh0VarH.b;
                    int i6 = eh0VarH2.a;
                    int i7 = eh0VarH2.d;
                    int[] iArr4 = iArr2;
                    int i8 = eh0VarH2.c;
                    int i9 = eh0VarH2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = p82VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    p82 p82Var2 = this.b;
                    t72 t72Var = new t72(i12, (i10 & 8) != 0 ? p72.e : (i11 & 8) != 0 ? p72.f : (i10 & 519) != 0 ? p72.g : (i11 & 519) != 0 ? p72.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    t72Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(t72Var.a.a());
                    eh0 eh0VarH3 = m82Var.h(i12);
                    eh0 eh0VarH4 = p82Var2.a.h(i12);
                    int iMin = Math.min(eh0VarH3.a, eh0VarH4.a);
                    int i13 = eh0VarH3.b;
                    int i14 = eh0VarH4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = eh0VarH3.c;
                    int i16 = eh0VarH4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = eh0VarH3.d;
                    int i18 = eh0VarH4.d;
                    n81 n81Var = new n81(11, eh0.b(iMin, iMin2, iMin3, Math.min(i17, i18)), eh0.b(Math.max(eh0VarH3.a, eh0VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    p72.f(view, t72Var, p82VarC, false);
                    duration.addUpdateListener(new l72(t72Var, p82VarC, p82Var2, i12, view));
                    duration.addListener(new m72(t72Var, view));
                    v11 v11Var = new v11(view, new n72(view, t72Var, n81Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(v11Var);
                    view.addOnAttachStateChangeListener(v11Var);
                    this.b = p82VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
