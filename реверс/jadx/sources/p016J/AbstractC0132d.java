package p016J;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: J.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0132d {
    /* JADX INFO: renamed from: a */
    public static LocaleList m508a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    public static LocaleList m509b() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: c */
    public static LocaleList m510c() {
        return LocaleList.getDefault();
    }
}
