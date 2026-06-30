package p025N0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p074l.C0927e0;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: N0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0300a extends C0927e0 {
    /* JADX INFO: renamed from: h */
    public static int m927h(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i2 = 0; i2 < iArr.length && dimensionPixelSize < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p074l.C0927e0, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (AbstractC0016e.m191p0(context, R.attr.resc, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, AbstractC1013a.f4039u);
            int iM927h = m927h(getContext(), typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM927h >= 0) {
                setLineHeight(iM927h);
            }
        }
    }
}
