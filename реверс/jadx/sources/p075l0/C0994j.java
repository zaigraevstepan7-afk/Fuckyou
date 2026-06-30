package p075l0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p007E.C0058d;

/* JADX INFO: renamed from: l0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0994j extends AbstractC0997m {

    /* JADX INFO: renamed from: d */
    public C0058d f3919d;

    /* JADX INFO: renamed from: e */
    public float f3920e;

    /* JADX INFO: renamed from: f */
    public C0058d f3921f;

    /* JADX INFO: renamed from: g */
    public float f3922g;

    /* JADX INFO: renamed from: h */
    public float f3923h;

    /* JADX INFO: renamed from: i */
    public float f3924i;

    /* JADX INFO: renamed from: j */
    public float f3925j;

    /* JADX INFO: renamed from: k */
    public float f3926k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f3927l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f3928m;

    /* JADX INFO: renamed from: n */
    public float f3929n;

    @Override // p075l0.AbstractC0996l
    /* JADX INFO: renamed from: a */
    public final boolean mo2442a() {
        return this.f3921f.m342b() || this.f3919d.m342b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // p075l0.AbstractC0996l
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2443b(int[] iArr) {
        boolean z2;
        C0058d c0058d = this.f3921f;
        boolean z3 = false;
        if (c0058d.m342b()) {
            ColorStateList colorStateList = c0058d.f195b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0058d.f196c) {
                c0058d.f196c = colorForState;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        C0058d c0058d2 = this.f3919d;
        if (c0058d2.m342b()) {
            ColorStateList colorStateList2 = c0058d2.f195b;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0058d2.f196c) {
                c0058d2.f196c = colorForState2;
                z3 = true;
            }
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f3923h;
    }

    public int getFillColor() {
        return this.f3921f.f196c;
    }

    public float getStrokeAlpha() {
        return this.f3922g;
    }

    public int getStrokeColor() {
        return this.f3919d.f196c;
    }

    public float getStrokeWidth() {
        return this.f3920e;
    }

    public float getTrimPathEnd() {
        return this.f3925j;
    }

    public float getTrimPathOffset() {
        return this.f3926k;
    }

    public float getTrimPathStart() {
        return this.f3924i;
    }

    public void setFillAlpha(float f) {
        this.f3923h = f;
    }

    public void setFillColor(int i2) {
        this.f3921f.f196c = i2;
    }

    public void setStrokeAlpha(float f) {
        this.f3922g = f;
    }

    public void setStrokeColor(int i2) {
        this.f3919d.f196c = i2;
    }

    public void setStrokeWidth(float f) {
        this.f3920e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f3925j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f3926k = f;
    }

    public void setTrimPathStart(float f) {
        this.f3924i = f;
    }
}
