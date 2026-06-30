package p016J;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: J.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0134f implements InterfaceC0135g {

    /* JADX INFO: renamed from: c */
    public static final Locale[] f440c = new Locale[0];

    /* JADX INFO: renamed from: a */
    public final Locale[] f441a;

    /* JADX INFO: renamed from: b */
    public final String f442b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C0134f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f441a = f440c;
            this.f442b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i2 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f441a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f442b = sb.toString();
    }

    @Override // p016J.InterfaceC0135g
    /* JADX INFO: renamed from: a */
    public final Object mo513a() {
        return null;
    }

    @Override // p016J.InterfaceC0135g
    /* JADX INFO: renamed from: b */
    public final String mo514b() {
        return this.f442b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0134f)) {
            return false;
        }
        Locale[] localeArr = ((C0134f) obj).f441a;
        Locale[] localeArr2 = this.f441a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < localeArr2.length; i2++) {
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // p016J.InterfaceC0135g
    public final Locale get(int i2) {
        if (i2 < 0) {
            return null;
        }
        Locale[] localeArr = this.f441a;
        if (i2 < localeArr.length) {
            return localeArr[i2];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f441a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p016J.InterfaceC0135g
    public final boolean isEmpty() {
        return this.f441a.length == 0;
    }

    @Override // p016J.InterfaceC0135g
    public final int size() {
        return this.f441a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f441a;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < localeArr.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }
}
