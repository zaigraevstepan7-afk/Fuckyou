package p046Y;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: Y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0415f extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final TextView f1124p;

    /* JADX INFO: renamed from: q */
    public final C0413d f1125q;

    /* JADX INFO: renamed from: r */
    public boolean f1126r = true;

    public C0415f(TextView textView) {
        this.f1124p = textView;
        this.f1125q = new C0413d(textView);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: G */
    public final boolean mo1061G() {
        return this.f1126r;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: Z */
    public final void mo1071Z(boolean z2) {
        if (z2) {
            TextView textView = this.f1124p;
            textView.setTransformationMethod(mo1079p0(textView.getTransformationMethod()));
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: a0 */
    public final void mo1072a0(boolean z2) {
        this.f1126r = z2;
        TextView textView = this.f1124p;
        textView.setTransformationMethod(mo1079p0(textView.getTransformationMethod()));
        textView.setFilters(mo1081y(textView.getFilters()));
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: p0 */
    public final TransformationMethod mo1079p0(TransformationMethod transformationMethod) {
        return this.f1126r ? ((transformationMethod instanceof C0419j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0419j(transformationMethod) : transformationMethod instanceof C0419j ? ((C0419j) transformationMethod).f1133a : transformationMethod;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: y */
    public final InputFilter[] mo1081y(InputFilter[] inputFilterArr) {
        if (!this.f1126r) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0413d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            C0413d c0413d = this.f1125q;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0413d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == c0413d) {
                return inputFilterArr;
            }
            i5++;
        }
    }
}
