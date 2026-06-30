package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 extends CharacterStyle implements UpdateAppearance {
    public final mh e;
    public final float f;
    public final v41 g = xc.B(new io1(9205357640488583168L));
    public final qx h = xc.s(new p7(20, this));

    public sm1(mh mhVar, float f) {
        this.e = mhVar;
        this.f = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        s22.K(textPaint, this.f);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
