package p046Y;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0496j;

/* JADX INFO: renamed from: Y.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0419j implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f1133a;

    public C0419j(TransformationMethod transformationMethod) {
        this.f1133a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1133a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0496j.m1303a().m1304b() != 1) {
            return charSequence;
        }
        C0496j c0496jM1303a = C0496j.m1303a();
        c0496jM1303a.getClass();
        return c0496jM1303a.m1307e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f1133a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
