package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p015I0.C0109e;
import p018K.RunnableC0145a;
import p024N.C0270l;
import p084q.C1028g;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0496j {

    /* JADX INFO: renamed from: j */
    public static final Object f1519j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0496j f1520k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f1521a;

    /* JADX INFO: renamed from: b */
    public final C1028g f1522b;

    /* JADX INFO: renamed from: c */
    public volatile int f1523c;

    /* JADX INFO: renamed from: d */
    public final Handler f1524d;

    /* JADX INFO: renamed from: e */
    public final C0492f f1525e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0495i f1526f;

    /* JADX INFO: renamed from: g */
    public final C0109e f1527g;

    /* JADX INFO: renamed from: h */
    public final int f1528h;

    /* JADX INFO: renamed from: i */
    public final C0490d f1529i;

    public C0496j(C0503q c0503q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1521a = reentrantReadWriteLock;
        this.f1523c = 3;
        InterfaceC0495i interfaceC0495i = (InterfaceC0495i) c0503q.f1517b;
        this.f1526f = interfaceC0495i;
        int i2 = c0503q.f1516a;
        this.f1528h = i2;
        this.f1529i = (C0490d) c0503q.f1518c;
        this.f1524d = new Handler(Looper.getMainLooper());
        this.f1522b = new C1028g();
        this.f1527g = new C0109e(11);
        C0492f c0492f = new C0492f(this);
        this.f1525e = c0492f;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1523c = 0;
            } catch (Throwable th) {
                this.f1521a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1304b() == 0) {
            try {
                interfaceC0495i.mo45j(new C0491e(c0492f));
            } catch (Throwable th2) {
                m1306d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0496j m1303a() {
        C0496j c0496j;
        synchronized (f1519j) {
            try {
                c0496j = f1520k;
                if (!(c0496j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0496j;
    }

    /* JADX INFO: renamed from: b */
    public final int m1304b() {
        this.f1521a.readLock().lock();
        try {
            return this.f1523c;
        } finally {
            this.f1521a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1305c() {
        if (!(this.f1528h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1304b() == 1) {
            return;
        }
        this.f1521a.writeLock().lock();
        try {
            if (this.f1523c == 0) {
                return;
            }
            this.f1523c = 0;
            this.f1521a.writeLock().unlock();
            C0492f c0492f = this.f1525e;
            C0496j c0496j = c0492f.f1513a;
            try {
                c0496j.f1526f.mo45j(new C0491e(c0492f));
            } catch (Throwable th) {
                c0496j.m1306d(th);
            }
        } finally {
            this.f1521a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1306d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1521a.writeLock().lock();
        try {
            this.f1523c = 2;
            arrayList.addAll(this.f1522b);
            this.f1522b.clear();
            this.f1521a.writeLock().unlock();
            this.f1524d.post(new RunnableC0145a(arrayList, this.f1523c, th));
        } catch (Throwable th2) {
            this.f1521a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #2 {all -> 0x00f7, blocks: (B:59:0x00c1, B:62:0x00c9, B:65:0x00d0, B:44:0x0085), top: B:98:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m1307e(CharSequence charSequence, int i2, int i3) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        C0508v[] c0508vArr;
        if (!(m1304b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0016e.m177h(i2 <= i3, "start should be <= than end");
        C0510x c0510x = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC0016e.m177h(i2 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC0016e.m177h(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        C0270l c0270l = this.f1525e.f1514b;
        c0270l.getClass();
        boolean z2 = charSequence instanceof C0506t;
        if (z2) {
            ((C0506t) charSequence).m1316a();
        }
        if (z2) {
            c0510x = new C0510x((Spannable) charSequence);
            if (c0510x != null) {
            }
            i4 = i2;
            i5 = i3;
            if (i4 == i5) {
            }
            ((C0506t) charSequence2).m1317b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, C0508v.class) <= i3) {
                    c0510x = new C0510x();
                    c0510x.f1562a = false;
                    c0510x.f1563b = new SpannableString(charSequence);
                }
                if (c0510x != null) {
                    while (i < r5) {
                    }
                }
                i4 = i2;
                i5 = i3;
                if (i4 == i5) {
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
                ((C0506t) charSequence2).m1317b();
                return charSequence2;
            }
            try {
                c0510x = new C0510x((Spannable) charSequence);
                if (c0510x != null && (c0508vArr = (C0508v[]) c0510x.f1563b.getSpans(i2, i3, C0508v.class)) != null && c0508vArr.length > 0) {
                    for (C0508v c0508v : c0508vArr) {
                        int spanStart = c0510x.f1563b.getSpanStart(c0508v);
                        int spanEnd = c0510x.f1563b.getSpanEnd(c0508v);
                        if (spanStart != i3) {
                            c0510x.removeSpan(c0508v);
                        }
                        i2 = Math.min(spanStart, i2);
                        i3 = Math.max(spanEnd, i3);
                    }
                }
                i4 = i2;
                i5 = i3;
                if (i4 == i5 || i4 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z2) {
                        return charSequence2;
                    }
                } else {
                    try {
                        charSequence2 = charSequence;
                        try {
                            C0510x c0510x2 = (C0510x) c0270l.m850n(charSequence2, i4, i5, Integer.MAX_VALUE, false, new C0048n(c0510x, 5, (C0109e) c0270l.f836a));
                            if (c0510x2 != null) {
                                Spannable spannable = c0510x2.f1563b;
                                if (z2) {
                                    ((C0506t) charSequence2).m1317b();
                                }
                                return spannable;
                            }
                            if (!z2) {
                                return charSequence2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            if (!z2) {
                            }
                        }
                    } catch (Throwable th3) {
                        charSequence2 = charSequence;
                        th = th3;
                    }
                }
                ((C0506t) charSequence2).m1317b();
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
        ((C0506t) charSequence2).m1317b();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m1308f(AbstractC0494h abstractC0494h) {
        AbstractC0016e.m180j(abstractC0494h, "initCallback cannot be null");
        this.f1521a.writeLock().lock();
        try {
            if (this.f1523c == 1 || this.f1523c == 2) {
                this.f1524d.post(new RunnableC0145a(Arrays.asList(abstractC0494h), this.f1523c, (Throwable) null));
            } else {
                this.f1522b.add(abstractC0494h);
            }
            this.f1521a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1521a.writeLock().unlock();
            throw th;
        }
    }
}
