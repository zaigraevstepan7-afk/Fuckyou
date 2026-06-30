package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.gj;
import defpackage.s91;
import defpackage.tb1;
import defpackage.uc1;
import defpackage.yc;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends uc1 {
    public gj a;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tb1.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            G(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void G(int i) {
        gj gjVar;
        if (i != 0 && i != 1) {
            yc.p(s91.i("invalid orientation:", i));
            return;
        }
        gj gjVar2 = this.a;
        if (gjVar2 == null || i != gjVar2.a) {
            if (i == 0) {
                gjVar = new gj(0);
            } else {
                if (i != 1) {
                    yc.p("invalid orientation");
                    return;
                }
                gjVar = new gj(1);
            }
            this.a = gjVar;
        }
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        G(0);
    }
}
