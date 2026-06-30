package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.fragment.app.AbstractC0537g;
import p024N.C0270l;
import p038U.C1137;
import p051a1.C1145;
import p097x.C1178;

/* JADX INFO: renamed from: e.z */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0684z extends AbstractC0537g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4901short = null;

    /* JADX INFO: renamed from: c */
    public final int f2729c = 1;

    /* JADX INFO: renamed from: d */
    public final LayoutInflaterFactory2C0648D f2730d;

    /* JADX INFO: renamed from: e */
    public final Object f2731e;

    static {
        ZLoader.registerNativesForClass(120, C0684z.class);
        Hidden0.special_clinit_120_00(C0684z.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684z(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, C0270l c0270l) {
        super(layoutInflaterFactory2C0648D);
        this.f2730d = layoutInflaterFactory2C0648D;
        this.f2731e = c0270l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684z(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, Context context) {
        super(layoutInflaterFactory2C0648D);
        this.f2730d = layoutInflaterFactory2C0648D;
        this.f2731e = (PowerManager) C1137.m3427(C1145.m3787(context), C1178.m5202(m4386(), 0, 5, 1217));
    }

    /* JADX INFO: renamed from: ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static native short[] m4386();

    @Override // androidx.fragment.app.AbstractC0537g
    /* JADX INFO: renamed from: e */
    public final native IntentFilter mo1428e();

    @Override // androidx.fragment.app.AbstractC0537g
    /* JADX INFO: renamed from: f */
    public final native int mo1429f();

    @Override // androidx.fragment.app.AbstractC0537g
    /* JADX INFO: renamed from: h */
    public final native void mo1431h();
}
