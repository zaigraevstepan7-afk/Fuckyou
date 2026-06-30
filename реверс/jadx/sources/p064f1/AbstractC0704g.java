package p064f1;

import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: f1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0704g extends AbstractC0703f {
    /* JADX INFO: renamed from: q0 */
    public static String m1951q0(String str) {
        AbstractC0451c.m1146e(str, "<this>");
        AbstractC0451c.m1146e(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0451c.m1145d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
