package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.ViewGroup;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p000A.C0001b;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0741b0;

/* JADX INFO: renamed from: Q0.m */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0339m extends AbstractC0714B {

    /* JADX INFO: renamed from: d */
    public final ArrayList f966d;

    /* JADX INFO: renamed from: e */
    public final SimpleDateFormat f967e;

    /* JADX INFO: renamed from: f */
    public final C0001b f968f;

    static {
        ZLoader.registerNativesForClass(66, C0339m.class);
        Hidden0.special_clinit_66_00(C0339m.class);
    }

    public C0339m(ArrayList arrayList, SimpleDateFormat simpleDateFormat, C0001b c0001b) {
        this.f966d = arrayList;
        this.f967e = simpleDateFormat;
        this.f968f = c0001b;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static native int m3281(Object obj);

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: a */
    public final native int mo985a();

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: c */
    public final native void mo986c(AbstractC0741b0 abstractC0741b0, int i2);

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: d */
    public final native AbstractC0741b0 mo987d(ViewGroup viewGroup);
}
