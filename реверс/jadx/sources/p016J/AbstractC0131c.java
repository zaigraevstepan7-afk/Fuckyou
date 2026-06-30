package p016J;

import java.util.Locale;
import p020L.AbstractC0171e;

/* JADX INFO: renamed from: J.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0131c {

    /* JADX INFO: renamed from: a */
    public static final Locale[] f437a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: a */
    public static Locale m506a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m507b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f437a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String strM610a = AbstractC0171e.m610a(locale);
            if (!strM610a.isEmpty()) {
                return strM610a.equals(AbstractC0171e.m610a(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}
