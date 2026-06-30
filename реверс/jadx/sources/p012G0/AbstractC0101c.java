package p012G0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: G0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0101c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Drawable m447b(Context context, int i2) {
        ColorStateList colorStateListM160I;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i2, i2, i2, i2);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValueM189o0 = AbstractC0016e.m189o0(context, R.attr.resc);
        if (typedValueM189o0 != null) {
            int i3 = typedValueM189o0.resourceId;
            colorStateListM160I = i3 != 0 ? AbstractC0016e.m160I(context, i3) : ColorStateList.valueOf(typedValueM189o0.data);
        } else {
            colorStateListM160I = null;
        }
        if (colorStateListM160I != null) {
            colorStateListValueOf = colorStateListM160I;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}
