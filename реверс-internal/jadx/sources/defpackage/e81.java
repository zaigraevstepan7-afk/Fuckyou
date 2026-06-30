package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {
    public final List a;
    public final xg0 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e81(List list, xg0 xg0Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = xg0Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z = i >= 29 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case t91.STRING_FIELD_NUMBER /* 5 */:
                                if (!z) {
                                    i2 = !z2 ? 1 : 8;
                                }
                                i2 = 10;
                                break;
                            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (!z) {
                                    if (!z2) {
                                        i2 = 2;
                                        break;
                                    }
                                }
                                i2 = 12;
                                break;
                            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (z) {
                                    i2 = 11;
                                    break;
                                } else if (!z2) {
                                    i2 = 3;
                                    break;
                                }
                                break;
                            case t91.BYTES_FIELD_NUMBER /* 8 */:
                                i2 = 6;
                                break;
                            case el.a /* 9 */:
                                i2 = 4;
                                break;
                            case el.b /* 10 */:
                                i2 = 5;
                                break;
                        }
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                l81 l81Var = (l81) list.get(i2);
                if (lk.t(l81Var)) {
                    i2 = 2;
                } else if (!lk.r(l81Var)) {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        xg0 xg0Var = this.b;
        if (xg0Var != null) {
            return (MotionEvent) ((n81) xg0Var.g).c;
        }
        return null;
    }
}
