package p005C0;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p010F0.C0089d;

/* JADX INFO: renamed from: C0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0045k {

    /* JADX INFO: renamed from: c */
    public float f166c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f168e;

    /* JADX INFO: renamed from: f */
    public C0089d f169f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f164a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C0043i f165b = new C0043i(0, this);

    /* JADX INFO: renamed from: d */
    public boolean f167d = true;

    public C0045k(InterfaceC0044j interfaceC0044j) {
        this.f168e = new WeakReference(null);
        this.f168e = new WeakReference(interfaceC0044j);
    }

    /* JADX INFO: renamed from: a */
    public final float m270a(String str) {
        if (!this.f167d) {
            return this.f166c;
        }
        TextPaint textPaint = this.f164a;
        this.f166c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f167d = false;
        return this.f166c;
    }

    /* JADX INFO: renamed from: b */
    public final void m271b(C0089d c0089d, Context context) {
        if (this.f169f != c0089d) {
            this.f169f = c0089d;
            if (c0089d != null) {
                TextPaint textPaint = this.f164a;
                C0043i c0043i = this.f165b;
                c0089d.m385f(context, textPaint, c0043i);
                InterfaceC0044j interfaceC0044j = (InterfaceC0044j) this.f168e.get();
                if (interfaceC0044j != null) {
                    textPaint.drawableState = interfaceC0044j.getState();
                }
                c0089d.m384e(context, textPaint, c0043i);
                this.f167d = true;
            }
            InterfaceC0044j interfaceC0044j2 = (InterfaceC0044j) this.f168e.get();
            if (interfaceC0044j2 != null) {
                interfaceC0044j2.mo269a();
                interfaceC0044j2.onStateChange(interfaceC0044j2.getState());
            }
        }
    }
}
