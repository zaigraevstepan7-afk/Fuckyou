package p020L;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0168b {

    /* JADX INFO: renamed from: b */
    public static final String f583b;

    /* JADX INFO: renamed from: c */
    public static final String f584c;

    /* JADX INFO: renamed from: d */
    public static final C0168b f585d;

    /* JADX INFO: renamed from: e */
    public static final C0168b f586e;

    /* JADX INFO: renamed from: a */
    public final boolean f587a;

    static {
        C0176j c0176j = AbstractC0177k.f598c;
        f583b = Character.toString((char) 8206);
        f584c = Character.toString((char) 8207);
        f585d = new C0168b(false);
        f586e = new C0168b(true);
    }

    public C0168b(boolean z2) {
        C0176j c0176j = AbstractC0177k.f596a;
        this.f587a = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f581c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m602a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m603a(CharSequence charSequence) {
        byte directionality;
        C0167a c0167a = new C0167a(charSequence);
        c0167a.f581c = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = c0167a.f581c;
            if (i5 < c0167a.f580b && i2 == 0) {
                CharSequence charSequence2 = c0167a.f579a;
                char cCharAt = charSequence2.charAt(i5);
                c0167a.f582d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0167a.f581c);
                    c0167a.f581c = Character.charCount(iCodePointAt) + c0167a.f581c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0167a.f581c++;
                    char c2 = c0167a.f582d;
                    directionality = c2 < 1792 ? C0167a.f578e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i4 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                }
                i2 = i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m604b(CharSequence charSequence) {
        C0167a c0167a = new C0167a(charSequence);
        c0167a.f581c = c0167a.f580b;
        int i2 = 0;
        int i3 = 0;
        while (c0167a.f581c > 0) {
            byte bM602a = c0167a.m602a();
            if (bM602a == 0) {
                if (i2 == 0) {
                    return -1;
                }
                if (i3 == 0) {
                    i3 = i2;
                }
            } else if (bM602a == 1 || bM602a == 2) {
                if (i2 == 0) {
                    return 1;
                }
                if (i3 == 0) {
                    i3 = i2;
                }
            } else if (bM602a != 9) {
                switch (bM602a) {
                    case 14:
                    case 15:
                        if (i3 == i2) {
                            return -1;
                        }
                        i2--;
                        break;
                    case 16:
                    case 17:
                        if (i3 == i2) {
                            return 1;
                        }
                        i2--;
                        break;
                    case 18:
                        i2++;
                        break;
                    default:
                        if (i3 == 0) {
                            i3 = i2;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m605c(CharSequence charSequence) {
        C0176j c0176j = AbstractC0177k.f598c;
        if (charSequence == null) {
            return null;
        }
        boolean zM620b = c0176j.m620b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM620b2 = (zM620b ? AbstractC0177k.f597b : AbstractC0177k.f596a).m620b(charSequence, charSequence.length());
        String str = "";
        String str2 = f584c;
        String str3 = f583b;
        boolean z2 = this.f587a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(zM620b2 || m603a(charSequence) == 1)) ? (!z2 || (zM620b2 && m603a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM620b != z2) {
            spannableStringBuilder.append(zM620b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM620b3 = (zM620b ? AbstractC0177k.f597b : AbstractC0177k.f596a).m620b(charSequence, charSequence.length());
        if (!z2 && (zM620b3 || m604b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!zM620b3 || m604b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
