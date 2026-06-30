package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r10 extends CharacterStyle implements UpdateAppearance {
    public final q10 e;

    public r10(q10 q10Var) {
        this.e = q10Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            i60 i60Var = i60.a;
            q10 q10Var = this.e;
            if (xi0.o(q10Var, i60Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(q10Var instanceof kt1)) {
                ez1.a();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            kt1 kt1Var = (kt1) q10Var;
            textPaint.setStrokeWidth(kt1Var.a);
            textPaint.setStrokeMiter(kt1Var.b);
            int i = kt1Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = kt1Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
