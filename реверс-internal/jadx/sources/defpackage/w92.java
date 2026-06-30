package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w92 {
    public static final w92 a = new w92();

    public final long a(Paint paint) {
        int i = vl.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(nu0.K(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(s22.P(j));
    }
}
