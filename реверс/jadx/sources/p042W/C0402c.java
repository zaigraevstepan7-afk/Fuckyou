package p042W;

import android.graphics.Rect;
import java.util.Comparator;
import p015I0.C0109e;
import p026O.C0311k;

/* JADX INFO: renamed from: W.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0402c implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f1085a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f1086b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f1087c;

    /* JADX INFO: renamed from: d */
    public final C0109e f1088d;

    public C0402c(boolean z2, C0109e c0109e) {
        this.f1087c = z2;
        this.f1088d = c0109e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1088d.getClass();
        Rect rect = this.f1085a;
        ((C0311k) obj).m972f(rect);
        Rect rect2 = this.f1086b;
        ((C0311k) obj2).m972f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f1087c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
