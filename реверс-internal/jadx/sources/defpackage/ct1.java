package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct1 extends jt1 {
    public static boolean L(CharSequence charSequence, char c) {
        charSequence.getClass();
        return O(charSequence, c, 0, 2) >= 0;
    }

    public static boolean M(String str, String str2) {
        str.getClass();
        return N(str, str2, 0, false) >= 0;
    }

    public static final int N(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        rh0 rh0Var = new rh0(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = rh0Var.f;
        if (z2) {
            if (i2 <= i3) {
                int i4 = i2;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i4, length3) : str.regionMatches(z, 0, str2, i4, length3))) {
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                    } else {
                        return i4;
                    }
                }
            }
        } else if (i2 <= i3) {
            int i5 = i2;
            while (!S(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i3) {
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int O(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(nd.Z(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!s22.p(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static boolean P(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!s22.x(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int Q(String str) {
        str.getClass();
        int length = str.length() - 1;
        str.getClass();
        return str.lastIndexOf(46, length);
    }

    public static final List R(String str) {
        sp0 sp0Var = new sp0(str);
        if (!sp0Var.hasNext()) {
            return f40.e;
        }
        Object next = sp0Var.next();
        if (!sp0Var.hasNext()) {
            return hk.G(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (sp0Var.hasNext()) {
            arrayList.add(sp0Var.next());
        }
        return arrayList;
    }

    public static final boolean S(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (s22.p(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String T(String str, String str2) {
        int iN = N(str, str2, 0, false);
        return iN == -1 ? str : str.substring(str2.length() + iN, str.length());
    }

    public static String U(String str) {
        str.getClass();
        int iQ = Q(str);
        return iQ == -1 ? "" : str.substring(iQ + 1, str.length());
    }

    public static String V(String str) {
        str.getClass();
        str.getClass();
        int iQ = Q(str);
        return iQ == -1 ? str : str.substring(0, iQ);
    }

    public static CharSequence W(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            yc.e(s91.h(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static CharSequence X(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zX = s22.x(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zX) {
                    break;
                }
                length--;
            } else if (zX) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
