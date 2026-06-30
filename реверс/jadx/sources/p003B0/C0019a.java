package p003B0;

import android.content.Context;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0019a {

    /* JADX INFO: renamed from: f */
    public static final int f45f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f46a;

    /* JADX INFO: renamed from: b */
    public final int f47b;

    /* JADX INFO: renamed from: c */
    public final int f48c;

    /* JADX INFO: renamed from: d */
    public final int f49d;

    /* JADX INFO: renamed from: e */
    public final float f50e;

    public C0019a(Context context) {
        boolean zM191p0 = AbstractC0016e.m191p0(context, R.attr.resc, false);
        int iM1054t = AbstractC0383m.m1054t(context, R.attr.resc, 0);
        int iM1054t2 = AbstractC0383m.m1054t(context, R.attr.resc, 0);
        int iM1054t3 = AbstractC0383m.m1054t(context, R.attr.resc, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f46a = zM191p0;
        this.f47b = iM1054t;
        this.f48c = iM1054t2;
        this.f49d = iM1054t3;
        this.f50e = f;
    }
}
