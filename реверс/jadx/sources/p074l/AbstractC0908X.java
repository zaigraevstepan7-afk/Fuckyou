package p074l;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: l.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0908X {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2334a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m2335b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
