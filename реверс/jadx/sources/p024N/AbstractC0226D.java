package p024N;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p015I0.C0109e;

/* JADX INFO: renamed from: N.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0226D {

    /* JADX INFO: renamed from: a */
    public int f765a;

    /* JADX INFO: renamed from: b */
    public int f766b;

    /* JADX INFO: renamed from: c */
    public int f767c;

    /* JADX INFO: renamed from: d */
    public Object f768d;

    public AbstractC0226D() {
        if (C0109e.f318b == null) {
            C0109e.f318b = new C0109e(7);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m694a(int i2) {
        if (i2 < this.f767c) {
            return ((ByteBuffer) this.f768d).getShort(this.f766b + i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo691b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo692c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public void m695d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f766b) {
            mo692c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f766b) {
            tag = mo691b(view);
        } else {
            tag = view.getTag(this.f765a);
            if (!((Class) this.f768d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo693e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM772c = AbstractC0240S.m772c(view);
            C0250b c0250b = accessibilityDelegateM772c == null ? null : accessibilityDelegateM772c instanceof C0248a ? ((C0248a) accessibilityDelegateM772c).f791a : new C0250b(accessibilityDelegateM772c);
            if (c0250b == null) {
                c0250b = new C0250b();
            }
            AbstractC0240S.m785p(view, c0250b);
            view.setTag(this.f765a, obj);
            AbstractC0240S.m778i(view, this.f767c);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo693e(Object obj, Object obj2);
}
