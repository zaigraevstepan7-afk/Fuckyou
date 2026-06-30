package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g30 {
    public static final Object j = new Object();
    public static volatile g30 k;
    public final ReentrantReadWriteLock a;
    public final md b;
    public volatile int c;
    public final Handler d;
    public final c30 e;
    public final f30 f;
    public final wr g;
    public final int h;
    public final cw i;

    public g30(m90 m90Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        f30 f30Var = m90Var.a;
        this.f = f30Var;
        int i = m90Var.b;
        this.h = i;
        this.i = m90Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new md();
        this.g = new wr(7);
        c30 c30Var = new c30(this);
        this.e = c30Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                f30Var.d(new b30(c30Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static g30 a() {
        g30 g30Var;
        synchronized (j) {
            try {
                g30Var = k;
                if (!(g30Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return g30Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            yc.l("Not initialized yet");
            return 0;
        }
        bk.n(charSequence, "charSequence cannot be null");
        oc ocVar = this.e.b;
        ocVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            b32[] b32VarArr = (b32[]) spanned.getSpans(i, i + 1, b32.class);
            if (b32VarArr.length > 0) {
                return spanned.getSpanStart(b32VarArr[0]);
            }
        }
        return ((r30) ocVar.u(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new r30(i))).f;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            yc.l("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            c30 c30Var = this.e;
            g30 g30Var = c30Var.a;
            try {
                g30Var.f.d(new b30(c30Var));
            } catch (Throwable th) {
                g30Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new e30(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:112:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:112:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #0 {all -> 0x00f4, blocks: (B:65:0x00be, B:68:0x00c6, B:71:0x00ce, B:50:0x0082), top: B:106:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        b32[] b32VarArr;
        y32 y32Var = null;
        if (!(c() == 1)) {
            yc.l("Not initialized yet");
            return null;
        }
        if (i < 0) {
            yc.p("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            yc.p("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            yc.p("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            yc.p("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            yc.p("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        oc ocVar = this.e.b;
        ocVar.getClass();
        boolean z2 = charSequence instanceof cr1;
        if (z2) {
            ((cr1) charSequence).a();
        }
        if (z2) {
            y32Var = new y32((Spannable) charSequence);
            if (y32Var != null) {
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
            }
            ((cr1) charSequence2).b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, b32.class) <= i2) {
                    y32Var = new y32();
                    y32Var.e = false;
                    y32Var.f = new SpannableString(charSequence);
                }
                if (y32Var != null) {
                    while (i < r0) {
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5) {
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
                ((cr1) charSequence2).b();
                return charSequence2;
            }
            try {
                y32Var = new y32((Spannable) charSequence);
                if (y32Var != null && (b32VarArr = (b32[]) y32Var.f.getSpans(i, i2, b32.class)) != null && b32VarArr.length > 0) {
                    for (b32 b32Var : b32VarArr) {
                        int spanStart = y32Var.f.getSpanStart(b32Var);
                        int spanEnd = y32Var.f.getSpanEnd(b32Var);
                        if (spanStart != i2) {
                            y32Var.removeSpan(b32Var);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5 || i4 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z2) {
                        return charSequence2;
                    }
                } else {
                    try {
                        charSequence2 = charSequence;
                    } catch (Throwable th2) {
                        charSequence2 = charSequence;
                        th = th2;
                    }
                    try {
                        y32 y32Var2 = (y32) ocVar.u(charSequence2, i4, i5, Integer.MAX_VALUE, z, new xg0(11, y32Var, (wr) ocVar.a));
                        if (y32Var2 != null) {
                            Spannable spannable = y32Var2.f;
                            if (z2) {
                                ((cr1) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z2) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z2) {
                        }
                    }
                }
                ((cr1) charSequence2).b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (!z2) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((cr1) charSequence2).b();
        throw th;
    }

    public final void h(d30 d30Var) {
        bk.n(d30Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new e30(Arrays.asList(d30Var), this.c, null));
            } else {
                this.b.add(d30Var);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        c30 c30Var = this.e;
        c30Var.getClass();
        Bundle bundle = editorInfo.extras;
        jv0 jv0Var = (jv0) c30Var.c.e;
        int iA = jv0Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) jv0Var.h).getInt(iA + jv0Var.e) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
