package p020L;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0167a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f578e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f579a;

    /* JADX INFO: renamed from: b */
    public final int f580b;

    /* JADX INFO: renamed from: c */
    public int f581c;

    /* JADX INFO: renamed from: d */
    public char f582d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f578e[i2] = Character.getDirectionality(i2);
        }
    }

    public C0167a(CharSequence charSequence) {
        this.f579a = charSequence;
        this.f580b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m602a() {
        int i2 = this.f581c - 1;
        CharSequence charSequence = this.f579a;
        char cCharAt = charSequence.charAt(i2);
        this.f582d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f581c);
            this.f581c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f581c--;
        char c2 = this.f582d;
        return c2 < 1792 ? f578e[c2] : Character.getDirectionality(c2);
    }
}
