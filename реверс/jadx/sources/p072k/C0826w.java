package p072k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: k.w */
/* JADX INFO: loaded from: classes.dex */
public class C0826w {

    /* JADX INFO: renamed from: a */
    public final Context f3387a;

    /* JADX INFO: renamed from: b */
    public final MenuC0816m f3388b;

    /* JADX INFO: renamed from: c */
    public final boolean f3389c;

    /* JADX INFO: renamed from: d */
    public final int f3390d;

    /* JADX INFO: renamed from: e */
    public View f3391e;

    /* JADX INFO: renamed from: g */
    public boolean f3393g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0827x f3394h;

    /* JADX INFO: renamed from: i */
    public AbstractC0824u f3395i;

    /* JADX INFO: renamed from: j */
    public C0825v f3396j;

    /* JADX INFO: renamed from: f */
    public int f3392f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C0825v f3397k = new C0825v(this);

    public C0826w(int i2, Context context, View view, MenuC0816m menuC0816m, boolean z2) {
        this.f3387a = context;
        this.f3388b = menuC0816m;
        this.f3391e = view;
        this.f3389c = z2;
        this.f3390d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0824u m2205a() {
        AbstractC0824u viewOnKeyListenerC0802D;
        if (this.f3395i == null) {
            Context context = this.f3387a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.resc)) {
                viewOnKeyListenerC0802D = new ViewOnKeyListenerC0810g(context, this.f3391e, this.f3390d, this.f3389c);
            } else {
                View view = this.f3391e;
                Context context2 = this.f3387a;
                boolean z2 = this.f3389c;
                viewOnKeyListenerC0802D = new ViewOnKeyListenerC0802D(this.f3390d, context2, view, this.f3388b, z2);
            }
            viewOnKeyListenerC0802D.mo2156l(this.f3388b);
            viewOnKeyListenerC0802D.mo2161r(this.f3397k);
            viewOnKeyListenerC0802D.mo2157n(this.f3391e);
            viewOnKeyListenerC0802D.mo2154g(this.f3394h);
            viewOnKeyListenerC0802D.mo2158o(this.f3393g);
            viewOnKeyListenerC0802D.mo2159p(this.f3392f);
            this.f3395i = viewOnKeyListenerC0802D;
        }
        return this.f3395i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2206b() {
        AbstractC0824u abstractC0824u = this.f3395i;
        return abstractC0824u != null && abstractC0824u.mo2148a();
    }

    /* JADX INFO: renamed from: c */
    public void mo2207c() {
        this.f3395i = null;
        C0825v c0825v = this.f3396j;
        if (c0825v != null) {
            c0825v.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2208d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC0824u abstractC0824uM2205a = m2205a();
        abstractC0824uM2205a.mo2162s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3392f, this.f3391e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3391e.getWidth();
            }
            abstractC0824uM2205a.mo2160q(i2);
            abstractC0824uM2205a.mo2163t(i3);
            int i4 = (int) ((this.f3387a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0824uM2205a.f3385a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        abstractC0824uM2205a.mo2150i();
    }
}
