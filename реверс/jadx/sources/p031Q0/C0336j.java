package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import p042W.C1139;

/* JADX INFO: renamed from: Q0.j */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0336j {

    /* JADX INFO: renamed from: a */
    public final int f957a;

    /* JADX INFO: renamed from: b */
    public final String f958b;

    static {
        ZLoader.registerNativesForClass(63, C0336j.class);
        Hidden0.special_clinit_63_00(C0336j.class);
    }

    public C0336j(int i2, String str, int i3) {
        this.f957a = i2;
        if (i3 != 1) {
            this.f958b = str == null ? C1139.m3539() : str;
        } else {
            this.f958b = str;
        }
    }
}
