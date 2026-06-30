package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import p026O.C0311k;
import p042W.AbstractC0401b;

/* JADX INFO: renamed from: K0.d */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0162d extends AbstractC0401b {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4830short = null;

    /* JADX INFO: renamed from: q */
    public final Slider f501q;

    /* JADX INFO: renamed from: r */
    public final Rect f502r;

    static {
        ZLoader.registerNativesForClass(15, C0162d.class);
        Hidden0.special_clinit_15_00(C0162d.class);
    }

    public C0162d(Slider slider) {
        super(slider);
        this.f502r = new Rect();
        this.f501q = slider;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static native short[] m2957();

    /* JADX INFO: renamed from: ۦۡ۠ۦ, reason: contains not printable characters */
    public static native int m2958(Object obj);

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: n */
    public final native int mo570n(float f, float f2);

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: o */
    public final native void mo571o(ArrayList arrayList);

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: s */
    public final native boolean mo572s(int i2, int i3, Bundle bundle);

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: u */
    public final native void mo573u(int i2, C0311k c0311k);
}
