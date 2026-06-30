package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a30 {
    public final boolean a;
    public final int b;
    public final int c;

    static {
        Math.round(5.1000000000000005d);
    }

    public a30(Context context) {
        TypedValue typedValueM = el.M(context.getTheme(), R.attr.elevationOverlayEnabled);
        boolean z = false;
        if (typedValueM != null && typedValueM.type == 18 && typedValueM.data != 0) {
            z = true;
        }
        int iZ = bk.z(context, R.attr.elevationOverlayColor);
        bk.z(context, R.attr.elevationOverlayAccentColor);
        int iZ2 = bk.z(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iZ;
        this.c = iZ2;
    }
}
