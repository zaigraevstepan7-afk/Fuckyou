package p016J;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: J.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0133e {

    /* JADX INFO: renamed from: b */
    public static final C0133e f438b = m511a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0135g f439a;

    public C0133e(InterfaceC0135g interfaceC0135g) {
        this.f439a = interfaceC0135g;
    }

    /* JADX INFO: renamed from: a */
    public static C0133e m511a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C0133e(new C0137i(AbstractC0132d.m508a(localeArr))) : new C0133e(new C0134f(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static C0133e m512b(String str) {
        if (str == null || str.isEmpty()) {
            return f438b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = AbstractC0131c.m506a(strArrSplit[i2]);
        }
        return m511a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0133e) {
            return this.f439a.equals(((C0133e) obj).f439a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f439a.hashCode();
    }

    public final String toString() {
        return this.f439a.toString();
    }
}
