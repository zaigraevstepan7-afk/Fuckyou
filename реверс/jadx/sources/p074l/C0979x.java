package p074l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p000A.C0001b;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0979x {

    /* JADX INFO: renamed from: a */
    public final TextView f3870a;

    /* JADX INFO: renamed from: b */
    public final C0001b f3871b;

    public C0979x(TextView textView) {
        this.f3870a = textView;
        this.f3871b = new C0001b(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m2430a(InputFilter[] inputFilterArr) {
        return ((AbstractC0383m) this.f3871b.f1b).mo1081y(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m2431b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f3870a.getContext().obtainStyledAttributes(attributeSet, AbstractC0641a.f2488i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2433d(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2432c(boolean z2) {
        ((AbstractC0383m) this.f3871b.f1b).mo1071Z(z2);
    }

    /* JADX INFO: renamed from: d */
    public final void m2433d(boolean z2) {
        ((AbstractC0383m) this.f3871b.f1b).mo1072a0(z2);
    }
}
