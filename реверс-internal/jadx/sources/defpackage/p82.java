package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p82 {
    public static final p82 b;
    public final m82 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = k82.w;
        } else if (i >= 30) {
            b = i82.v;
        } else {
            b = m82.b;
        }
    }

    public p82(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new l82(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new k82(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new j82(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new i82(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new g82(this, windowInsets);
        } else if (i >= 28) {
            this.a = new f82(this, windowInsets);
        } else {
            this.a = new e82(this, windowInsets);
        }
    }

    public static eh0 a(eh0 eh0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, eh0Var.a - i);
        int iMax2 = Math.max(0, eh0Var.b - i2);
        int iMax3 = Math.max(0, eh0Var.c - i3);
        int iMax4 = Math.max(0, eh0Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? eh0Var : eh0.b(iMax, iMax2, iMax3, iMax4);
    }

    public static p82 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        p82 p82Var = new p82(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = h62.a;
            p82 p82VarA = c62.a(view);
            m82 m82Var = p82Var.a;
            m82Var.w(p82VarA);
            View rootView = view.getRootView();
            m82Var.d(rootView);
            m82Var.o(rootView);
            m82Var.p();
            m82Var.y(view.getWindowSystemUiVisibility());
        }
        return p82Var;
    }

    public final WindowInsets b() {
        m82 m82Var = this.a;
        if (m82Var instanceof d82) {
            return ((d82) m82Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p82) {
            return Objects.equals(this.a, ((p82) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        m82 m82Var = this.a;
        if (m82Var == null) {
            return 0;
        }
        return m82Var.hashCode();
    }

    public p82() {
        this.a = new m82(this);
    }
}
