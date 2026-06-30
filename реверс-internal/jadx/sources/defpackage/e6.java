package defpackage;

import android.content.Context;
import android.os.Build;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e6 implements mc0 {
    public static boolean g = true;
    public final h4 a;
    public final Object b = new Object();
    public n62 c;
    public boolean d;
    public xg0 e;
    public final c6 f;

    public e6(h4 h4Var) {
        this.a = h4Var;
        c6 c6Var = new c6(this);
        this.f = c6Var;
        if (h4Var.isAttachedToWindow()) {
            Context context = h4Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(c6Var);
                this.d = true;
            }
        }
        h4Var.addOnAttachStateChangeListener(new d6(0, this));
    }

    public static final void d(e6 e6Var) {
        xg0 xg0Var = e6Var.e;
        if (xg0Var != null) {
            synchronized (xg0Var) {
                try {
                    zx0 zx0Var = (zx0) xg0Var.f;
                    if (zx0Var != null) {
                        zx0Var.a();
                    }
                    xg0Var.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e6Var.e = null;
    }

    @Override // defpackage.mc0
    public final void a(nc0 nc0Var) {
        synchronized (this.b) {
            if (!nc0Var.s) {
                nc0Var.s = true;
                nc0Var.b();
            }
        }
    }

    @Override // defpackage.mc0
    public final xg0 b() {
        xg0 xg0Var = this.e;
        if (xg0Var != null) {
            return xg0Var;
        }
        xg0 xg0Var2 = new xg0(3, false);
        this.e = xg0Var2;
        return xg0Var2;
    }

    @Override // defpackage.mc0
    public final nc0 c() {
        pc0 wc0Var;
        pc0 uc0Var;
        nc0 nc0Var;
        synchronized (this.b) {
            try {
                h4 h4Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    h4Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    uc0Var = new uc0();
                } else {
                    if (g) {
                        try {
                            wc0Var = new sc0(this.a, new fj(), new ej());
                        } catch (Throwable unused) {
                            g = false;
                            wc0Var = new wc0(e(this.a));
                        }
                    } else {
                        wc0Var = new wc0(e(this.a));
                    }
                    uc0Var = wc0Var;
                }
                nc0Var = new nc0(uc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return nc0Var;
    }

    public final m10 e(h4 h4Var) {
        n62 n62Var = this.c;
        if (n62Var != null) {
            return n62Var;
        }
        n62 n62Var2 = new n62(h4Var.getContext());
        n62Var2.setClipChildren(false);
        n62Var2.setClipToPadding(false);
        n62Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        h4Var.addView(n62Var2, -1);
        this.c = n62Var2;
        return n62Var2;
    }
}
