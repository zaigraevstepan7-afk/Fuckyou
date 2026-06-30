package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zb {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public zb(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            og0.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            og0.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new zj(charSequence, i));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new t3(this, i));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbN = s91.n("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        sbN.append(i3);
        sbN.append("]");
        og0.a(sbN.toString());
    }

    public int c() {
        ll llVar = (ll) this.e;
        String str = (String) this.d;
        if (llVar == null) {
            return str.length();
        }
        return (llVar.b - llVar.b()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!g30.d()) {
                    return false;
                }
                g30 g30VarA = g30.a();
                if (g30VarA.c() != 1 || g30VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return qc1.r(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (xi0.o(unicodeBlockOf, unicodeBlock) && xi0.o(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return xi0.o(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && xi0.o(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!g30.d()) {
                return false;
            }
            g30 g30VarA = g30.a();
            if (g30VarA.c() != 1 || g30VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return qc1.r(Character.codePointAt((CharSequence) this.d, i));
    }

    public int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = dc.a(typeface, i, (this.c & 2) != 0);
        }
        ec ecVar = (ec) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (ecVar.m) {
            ecVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = ecVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new ac(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int l(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? l(iPreceding) : iPreceding;
    }

    public void m(int i, int i2, String str) {
        if (i > i2) {
            og0.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            og0.a("start must be non-negative, but was " + i);
        }
        ll llVar = (ll) this.e;
        if (llVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            ll llVar2 = new ll();
            llVar2.b = iMax;
            llVar2.e = cArr;
            llVar2.c = length;
            llVar2.d = i4;
            this.e = llVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > llVar.b - llVar.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            m(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > llVar.b()) {
            int iB = length2 - llVar.b();
            int i9 = llVar.b;
            do {
                i9 *= 2;
            } while (i9 - llVar.b < iB);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) llVar.e, 0, cArr2, 0, llVar.c);
            int i10 = llVar.b;
            int i11 = llVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) llVar.e, i11, cArr2, i13, (i12 + i11) - i11);
            llVar.e = cArr2;
            llVar.b = i9;
            llVar.d = i13;
        }
        int i14 = llVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) llVar.e;
            System.arraycopy(cArr3, i8, cArr3, llVar.d - i15, i15);
            llVar.c = i7;
            llVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iB2 = llVar.b() + i7;
            int iB3 = llVar.b() + i8;
            int i16 = llVar.d;
            int i17 = iB2 - i16;
            char[] cArr4 = (char[]) llVar.e;
            System.arraycopy(cArr4, i16, cArr4, llVar.c, i17);
            llVar.c += i17;
            llVar.d = iB3;
        } else {
            llVar.d = llVar.b() + i8;
            llVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) llVar.e, llVar.c);
        llVar.c = str.length() + llVar.c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                ll llVar = (ll) this.e;
                String str = (String) this.d;
                if (llVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) llVar.e, 0, llVar.c);
                char[] cArr = (char[]) llVar.e;
                int i = llVar.d;
                sb.append(cArr, i, llVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zb() {
    }

    public zb(ec ecVar, int i, int i2, WeakReference weakReference) {
        this.e = ecVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
