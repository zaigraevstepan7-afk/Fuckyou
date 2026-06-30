package p020L;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: L.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0176j {

    /* JADX INFO: renamed from: a */
    public final boolean f594a;

    /* JADX INFO: renamed from: b */
    public final Object f595b;

    public C0176j(C0175i c0175i, boolean z2) {
        this.f595b = c0175i;
        this.f594a = z2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m619a() {
        return this.f594a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m620b(CharSequence charSequence, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (((C0175i) this.f595b) == null) {
            return m619a();
        }
        char c2 = 2;
        for (int i3 = 0; i3 < i2 && c2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            C0176j c0176j = AbstractC0177k.f596a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        c2 = 2;
                        break;
                }
            } else {
                c2 = 0;
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return m619a();
        }
        return false;
    }

    public C0176j(boolean z2, String str) {
        this.f594a = z2;
        this.f595b = str;
    }

    public C0176j(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f595b = bottomSheetBehavior;
        this.f594a = z2;
    }
}
