package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: y.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1110m {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f4780n;

    /* JADX INFO: renamed from: a */
    public float f4781a;

    /* JADX INFO: renamed from: b */
    public float f4782b;

    /* JADX INFO: renamed from: c */
    public float f4783c;

    /* JADX INFO: renamed from: d */
    public float f4784d;

    /* JADX INFO: renamed from: e */
    public float f4785e;

    /* JADX INFO: renamed from: f */
    public float f4786f;

    /* JADX INFO: renamed from: g */
    public float f4787g;

    /* JADX INFO: renamed from: h */
    public int f4788h;

    /* JADX INFO: renamed from: i */
    public float f4789i;

    /* JADX INFO: renamed from: j */
    public float f4790j;

    /* JADX INFO: renamed from: k */
    public float f4791k;

    /* JADX INFO: renamed from: l */
    public boolean f4792l;

    /* JADX INFO: renamed from: m */
    public float f4793m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4780n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m2750a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1115r.f4809i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f4780n.get(index)) {
                case 1:
                    this.f4781a = typedArrayObtainStyledAttributes.getFloat(index, this.f4781a);
                    break;
                case 2:
                    this.f4782b = typedArrayObtainStyledAttributes.getFloat(index, this.f4782b);
                    break;
                case 3:
                    this.f4783c = typedArrayObtainStyledAttributes.getFloat(index, this.f4783c);
                    break;
                case 4:
                    this.f4784d = typedArrayObtainStyledAttributes.getFloat(index, this.f4784d);
                    break;
                case 5:
                    this.f4785e = typedArrayObtainStyledAttributes.getFloat(index, this.f4785e);
                    break;
                case 6:
                    this.f4786f = typedArrayObtainStyledAttributes.getDimension(index, this.f4786f);
                    break;
                case 7:
                    this.f4787g = typedArrayObtainStyledAttributes.getDimension(index, this.f4787g);
                    break;
                case 8:
                    this.f4789i = typedArrayObtainStyledAttributes.getDimension(index, this.f4789i);
                    break;
                case 9:
                    this.f4790j = typedArrayObtainStyledAttributes.getDimension(index, this.f4790j);
                    break;
                case 10:
                    this.f4791k = typedArrayObtainStyledAttributes.getDimension(index, this.f4791k);
                    break;
                case 11:
                    this.f4792l = true;
                    this.f4793m = typedArrayObtainStyledAttributes.getDimension(index, this.f4793m);
                    break;
                case 12:
                    this.f4788h = C1111n.m2753f(typedArrayObtainStyledAttributes, index, this.f4788h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
