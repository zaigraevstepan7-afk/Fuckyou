package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p091u.AbstractC1056a;

/* JADX INFO: renamed from: y.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1108k {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f4766j;

    /* JADX INFO: renamed from: a */
    public int f4767a;

    /* JADX INFO: renamed from: b */
    public int f4768b;

    /* JADX INFO: renamed from: c */
    public int f4769c;

    /* JADX INFO: renamed from: d */
    public float f4770d;

    /* JADX INFO: renamed from: e */
    public float f4771e;

    /* JADX INFO: renamed from: f */
    public float f4772f;

    /* JADX INFO: renamed from: g */
    public int f4773g;

    /* JADX INFO: renamed from: h */
    public String f4774h;

    /* JADX INFO: renamed from: i */
    public int f4775i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4766j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m2748a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1115r.f4806f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f4766j.get(index)) {
                case 1:
                    this.f4771e = typedArrayObtainStyledAttributes.getFloat(index, this.f4771e);
                    break;
                case 2:
                    this.f4769c = typedArrayObtainStyledAttributes.getInt(index, this.f4769c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC1056a.f4216a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4767a = C1111n.m2753f(typedArrayObtainStyledAttributes, index, this.f4767a);
                    break;
                case 6:
                    this.f4768b = typedArrayObtainStyledAttributes.getInteger(index, this.f4768b);
                    break;
                case 7:
                    this.f4770d = typedArrayObtainStyledAttributes.getFloat(index, this.f4770d);
                    break;
                case 8:
                    this.f4773g = typedArrayObtainStyledAttributes.getInteger(index, this.f4773g);
                    break;
                case 9:
                    this.f4772f = typedArrayObtainStyledAttributes.getFloat(index, this.f4772f);
                    break;
                case 10:
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        this.f4775i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f4774h = string;
                        if (string.indexOf("/") > 0) {
                            this.f4775i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f4775i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
