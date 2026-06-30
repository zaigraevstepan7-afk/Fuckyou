package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p015I0.C0111g;
import p015I0.C0117m;
import p038U.C1137;

/* JADX INFO: renamed from: M0.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0201g extends C0111g {

    /* JADX INFO: renamed from: r */
    public final RectF f655r;

    static {
        ZLoader.registerNativesForClass(34, C0201g.class);
        Hidden0.special_clinit_34_00(C0201g.class);
    }

    public C0201g(C0117m c0117m, RectF rectF) {
        super(c0117m);
        this.f655r = rectF;
    }

    public C0201g(C0201g c0201g) {
        super(c0201g);
        this.f655r = C1137.m3447(c0201g);
    }

    @Override // p015I0.C0111g, android.graphics.drawable.Drawable.ConstantState
    public final native Drawable newDrawable();
}
