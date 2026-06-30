package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: y.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1109l {

    /* JADX INFO: renamed from: a */
    public int f4776a;

    /* JADX INFO: renamed from: b */
    public int f4777b;

    /* JADX INFO: renamed from: c */
    public float f4778c;

    /* JADX INFO: renamed from: d */
    public float f4779d;

    /* JADX INFO: renamed from: a */
    public final void m2749a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1115r.f4807g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f4778c = typedArrayObtainStyledAttributes.getFloat(index, this.f4778c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f4776a);
                this.f4776a = i3;
                this.f4776a = C1111n.f4794d[i3];
            } else if (index == 4) {
                this.f4777b = typedArrayObtainStyledAttributes.getInt(index, this.f4777b);
            } else if (index == 3) {
                this.f4779d = typedArrayObtainStyledAttributes.getFloat(index, this.f4779d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
