package p046Y;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.C0496j;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: Y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0416g extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final C0415f f1127p;

    public C0416g(TextView textView) {
        this.f1127p = new C0415f(textView);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: G */
    public final boolean mo1061G() {
        return this.f1127p.f1126r;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: Z */
    public final void mo1071Z(boolean z2) {
        if (C0496j.f1520k != null) {
            this.f1127p.mo1071Z(z2);
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: a0 */
    public final void mo1072a0(boolean z2) {
        boolean z3 = C0496j.f1520k != null;
        C0415f c0415f = this.f1127p;
        if (z3) {
            c0415f.mo1072a0(z2);
        } else {
            c0415f.f1126r = z2;
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: p0 */
    public final TransformationMethod mo1079p0(TransformationMethod transformationMethod) {
        return !(C0496j.f1520k != null) ? transformationMethod : this.f1127p.mo1079p0(transformationMethod);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: y */
    public final InputFilter[] mo1081y(InputFilter[] inputFilterArr) {
        return !(C0496j.f1520k != null) ? inputFilterArr : this.f1127p.mo1081y(inputFilterArr);
    }
}
