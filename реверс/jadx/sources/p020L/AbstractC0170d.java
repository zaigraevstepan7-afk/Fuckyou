package p020L;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0170d {
    /* JADX INFO: renamed from: a */
    public static ULocale m607a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m608b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m609c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
