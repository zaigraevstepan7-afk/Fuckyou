package p027O0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p071j.C0788c;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0322a {

    /* JADX INFO: renamed from: a */
    public static final int[] f914a = {R.attr.theme, com.reddit.frontpage.R.attr.resc};

    /* JADX INFO: renamed from: b */
    public static final int[] f915b = {com.reddit.frontpage.R.attr.resc};

    /* JADX INFO: renamed from: a */
    public static Context m979a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f915b, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0788c) && ((C0788c) context).f3167a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0788c c0788c = new C0788c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f914a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0788c.getTheme().applyStyle(resourceId2, true);
        }
        return c0788c;
    }
}
