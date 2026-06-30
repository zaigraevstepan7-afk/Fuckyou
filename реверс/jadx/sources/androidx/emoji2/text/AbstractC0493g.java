package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p066g0.AbstractC0723K;
import p066g0.C0773x;

/* JADX INFO: renamed from: androidx.emoji2.text.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493g {

    /* JADX INFO: renamed from: a */
    public int f1516a;

    /* JADX INFO: renamed from: b */
    public final Object f1517b;

    /* JADX INFO: renamed from: c */
    public final Object f1518c;

    public AbstractC0493g(AbstractC0723K abstractC0723K) {
        this.f1516a = Integer.MIN_VALUE;
        this.f1518c = new Rect();
        this.f1517b = abstractC0723K;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0493g m1288a(AbstractC0723K abstractC0723K, int i2) {
        if (i2 == 0) {
            return new C0773x(abstractC0723K, 0);
        }
        if (i2 == 1) {
            return new C0773x(abstractC0723K, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1289b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo1290c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo1291d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo1292e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo1293f();

    /* JADX INFO: renamed from: g */
    public abstract int mo1294g();

    /* JADX INFO: renamed from: h */
    public abstract int mo1295h();

    /* JADX INFO: renamed from: i */
    public abstract int mo1296i();

    /* JADX INFO: renamed from: j */
    public abstract int mo1297j();

    /* JADX INFO: renamed from: k */
    public abstract int mo1298k();

    /* JADX INFO: renamed from: l */
    public abstract int mo1299l();

    /* JADX INFO: renamed from: m */
    public abstract int mo1300m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo1301n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo1302o(int i2);

    public AbstractC0493g(InterfaceC0495i interfaceC0495i) {
        this.f1516a = 0;
        this.f1518c = new C0490d();
        this.f1517b = interfaceC0495i;
    }
}
