package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v30 extends lk {
    public final ic b;
    public final o30 c;
    public boolean d = true;

    public v30(ic icVar) {
        this.b = icVar;
        this.c = new o30(icVar);
    }

    @Override // defpackage.lk
    public final InputFilter[] O(InputFilter[] inputFilterArr) {
        if (!this.d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof o30) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            o30 o30Var = this.c;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = o30Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == o30Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.lk
    public final void g0(boolean z) {
        if (z) {
            t0();
        }
    }

    @Override // defpackage.lk
    public final void h0(boolean z) {
        this.d = z;
        t0();
        ic icVar = this.b;
        icVar.setFilters(O(icVar.getFilters()));
    }

    public final void t0() {
        ic icVar = this.b;
        TransformationMethod transformationMethod = icVar.getTransformationMethod();
        if (this.d) {
            if (!(transformationMethod instanceof z30) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new z30(transformationMethod);
            }
        } else if (transformationMethod instanceof z30) {
            transformationMethod = ((z30) transformationMethod).e;
        }
        icVar.setTransformationMethod(transformationMethod);
    }
}
