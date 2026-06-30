package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.reddit.secondpage.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t82 {
    public static final WeakHashMap v = new WeakHashMap();
    public final d9 a;
    public final d9 b;
    public final d9 c;
    public final d9 d;
    public final d9 e;
    public final d9 f;
    public final d9 g;
    public final d9 h;
    public final d9 i;
    public final t42 j;
    public final v41 k;
    public final t42 l;
    public final t42 m;
    public final t42 n;
    public final t42 o;
    public final t42 p;
    public final t42 q;
    public final t42 r;
    public final boolean s;
    public int t;
    public final gh0 u;

    public t82(View view) {
        d9 d9VarC = i32.c("captionBar", 4);
        this.a = d9VarC;
        d9 d9VarC2 = i32.c("displayCutout", 128);
        this.b = d9VarC2;
        d9 d9VarC3 = i32.c("ime", 8);
        this.c = d9VarC3;
        d9 d9VarC4 = i32.c("mandatorySystemGestures", 32);
        this.d = d9VarC4;
        d9 d9VarC5 = i32.c("navigationBars", 2);
        this.e = d9VarC5;
        d9 d9VarC6 = i32.c("statusBars", 1);
        this.f = d9VarC6;
        d9 d9VarC7 = i32.c("systemBars", 519);
        this.g = d9VarC7;
        d9 d9VarC8 = i32.c("systemGestures", 16);
        this.h = d9VarC8;
        d9 d9VarC9 = i32.c("tappableElement", 64);
        this.i = d9VarC9;
        t42 t42Var = new t42(new ih0(0, 0, 0, 0), "waterfall");
        this.j = t42Var;
        this.k = xc.B(null);
        new s32(new s32(d9VarC7, d9VarC3), d9VarC2);
        new s32(new s32(new s32(d9VarC9, d9VarC4), d9VarC8), t42Var);
        this.l = i32.d("captionBarIgnoringVisibility", 4);
        this.m = i32.d("navigationBarsIgnoringVisibility", 2);
        this.n = i32.d("statusBarsIgnoringVisibility", 1);
        this.o = i32.d("systemBarsIgnoringVisibility", 519);
        this.p = i32.d("tappableElementIgnoringVisibility", 64);
        this.q = new t42(new ih0(0, 0, 0, 0), "imeAnimationTarget");
        this.r = new t42(new ih0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new gh0(this);
        Field field = h62.a;
        p82 p82VarA = c62.a(view);
        if (p82VarA != null) {
            m82 m82Var = p82VarA.a;
            d9VarC.f(m82Var.t(4));
            d9VarC2.f(m82Var.t(128));
            d9VarC3.f(m82Var.t(8));
            d9VarC4.f(m82Var.t(32));
            d9VarC5.f(m82Var.t(2));
            d9VarC6.f(m82Var.t(1));
            d9VarC7.f(m82Var.t(519));
            d9VarC8.f(m82Var.t(16));
            d9VarC9.f(m82Var.t(64));
        }
    }

    public static void a(t82 t82Var, p82 p82Var) {
        boolean z = false;
        t82Var.a.g(p82Var, 0);
        t82Var.c.g(p82Var, 0);
        t82Var.b.g(p82Var, 0);
        t82Var.e.g(p82Var, 0);
        t82Var.f.g(p82Var, 0);
        t82Var.g.g(p82Var, 0);
        t82Var.h.g(p82Var, 0);
        t82Var.i.g(p82Var, 0);
        t82Var.d.g(p82Var, 0);
        t82Var.l.f(ef1.r(p82Var.a.i(4)));
        t82Var.m.f(ef1.r(p82Var.a.i(2)));
        t82Var.n.f(ef1.r(p82Var.a.i(1)));
        t82Var.o.f(ef1.r(p82Var.a.i(519)));
        t82Var.p.f(ef1.r(p82Var.a.i(64)));
        sy syVarG = p82Var.a.g();
        t82Var.j.f(ef1.r(syVarG != null ? syVarG.a() : eh0.e));
        w6 w6Var = null;
        if (syVarG != null) {
            Path pathB = Build.VERSION.SDK_INT >= 31 ? pb.b(syVarG.a) : null;
            if (pathB != null) {
                w6Var = new w6(pathB);
            }
        }
        t82Var.k.setValue(w6Var);
        synchronized (aq1.c) {
            ay0 ay0Var = aq1.j.h;
            if (ay0Var != null) {
                if (ay0Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            aq1.a();
        }
    }
}
