package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u72 extends c82 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public eh0 f;

    public u72() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.c82
    public p82 b() {
        a();
        p82 p82VarC = p82.c(this.e, null);
        eh0[] eh0VarArr = this.b;
        m82 m82Var = p82VarC.a;
        m82Var.v(eh0VarArr);
        m82Var.x(this.f);
        m82Var.u(null);
        m82Var.z(this.c);
        m82Var.A(this.d);
        return p82VarC;
    }

    @Override // defpackage.c82
    public void f(eh0 eh0Var) {
        this.f = eh0Var;
    }

    @Override // defpackage.c82
    public void h(eh0 eh0Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(eh0Var.a, eh0Var.b, eh0Var.c, eh0Var.d);
        }
    }

    public u72(p82 p82Var) {
        super(p82Var);
        this.e = p82Var.b();
    }
}
