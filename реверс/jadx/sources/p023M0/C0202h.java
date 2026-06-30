package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p015I0.C0112h;

/* JADX INFO: renamed from: M0.h */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0202h extends C0112h {

    /* JADX INFO: renamed from: y */
    public static final int f656y = 0;

    /* JADX INFO: renamed from: x */
    public C0201g f657x;

    static {
        ZLoader.registerNativesForClass(35, C0202h.class);
        Hidden0.special_clinit_35_00(C0202h.class);
    }

    @Override // p015I0.C0112h
    /* JADX INFO: renamed from: f */
    public final native void mo474f(Canvas canvas);

    @Override // p015I0.C0112h, android.graphics.drawable.Drawable
    public final native Drawable mutate();

    /* JADX INFO: renamed from: t */
    public final native void m644t(float f, float f2, float f3, float f4);
}
