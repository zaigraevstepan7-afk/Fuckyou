package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Bundle;
import java.util.LinkedHashSet;
import p068h0.C0781d;
import p068h0.C1162;
import p068h0.InterfaceC0780c;
import p077m0.C1169;
import p084q.C1172;
import p098x0.C1179;

/* JADX INFO: renamed from: e.i */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0667i implements InterfaceC0780c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4894short = null;

    /* JADX INFO: renamed from: a */
    public final int f2694a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f2695b;

    static {
        ZLoader.registerNativesForClass(106, C0667i.class);
        Hidden0.special_clinit_106_00(C0667i.class);
    }

    public C0667i(AbstractActivityC0669k abstractActivityC0669k) {
        this.f2695b = abstractActivityC0669k;
    }

    public C0667i(C0781d c0781d) {
        C1169.m4802(c0781d, C1179.m5228(m4378(), 0, 8, 2128));
        this.f2695b = new LinkedHashSet();
        C1162.m4530(c0781d, C1172.m4963(m4378(), 8, 29, 3169), this);
    }

    /* JADX INFO: renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static native short[] m4378();

    @Override // p068h0.InterfaceC0780c
    /* JADX INFO: renamed from: a */
    public final native Bundle mo1157a();
}
