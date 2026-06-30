package p075l0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p084q.C1027f;

/* JADX INFO: renamed from: l0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0987c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C1001q f3905a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f3906b;

    /* JADX INFO: renamed from: c */
    public ArrayList f3907c;

    /* JADX INFO: renamed from: d */
    public C1027f f3908d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
