package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g80 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final pc1 a(View view, h4 h4Var) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        h4Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + r1.left;
        return new pc1(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final a80 c(int i) {
        if (i == 1) {
            return new a80(2);
        }
        if (i == 2) {
            return new a80(1);
        }
        if (i == 17) {
            return new a80(3);
        }
        if (i == 33) {
            return new a80(5);
        }
        if (i == 66) {
            return new a80(4);
        }
        if (i != 130) {
            return null;
        }
        return new a80(6);
    }
}
