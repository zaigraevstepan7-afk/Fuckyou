package p014H0;

import android.graphics.Paint;
import android.graphics.Path;
import p009F.AbstractC0074a;

/* JADX INFO: renamed from: H0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0104a {

    /* JADX INFO: renamed from: i */
    public static final int[] f303i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f304j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f305k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f306l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f307a;

    /* JADX INFO: renamed from: b */
    public final Paint f308b;

    /* JADX INFO: renamed from: c */
    public final Paint f309c;

    /* JADX INFO: renamed from: d */
    public int f310d;

    /* JADX INFO: renamed from: e */
    public int f311e;

    /* JADX INFO: renamed from: f */
    public int f312f;

    /* JADX INFO: renamed from: g */
    public final Path f313g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f314h;

    public C0104a() {
        Paint paint = new Paint();
        this.f314h = paint;
        this.f307a = new Paint();
        m452a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f308b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f309c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m452a(int i2) {
        this.f310d = AbstractC0074a.m356e(i2, 68);
        this.f311e = AbstractC0074a.m356e(i2, 20);
        this.f312f = AbstractC0074a.m356e(i2, 0);
        this.f307a.setColor(this.f310d);
    }
}
