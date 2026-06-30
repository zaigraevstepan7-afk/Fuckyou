package p024N;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p009F.C0076c;

/* JADX INFO: renamed from: N.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0273m0 extends AbstractC0279p0 {

    /* JADX INFO: renamed from: e */
    public static Field f843e;

    /* JADX INFO: renamed from: f */
    public static boolean f844f;

    /* JADX INFO: renamed from: g */
    public static Constructor f845g;

    /* JADX INFO: renamed from: h */
    public static boolean f846h;

    /* JADX INFO: renamed from: c */
    public WindowInsets f847c;

    /* JADX INFO: renamed from: d */
    public C0076c f848d;

    public C0273m0() {
        this.f847c = m867i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m867i() {
        if (!f844f) {
            try {
                f843e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f844f = true;
        }
        Field field = f843e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f846h) {
            try {
                f845g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f846h = true;
        }
        Constructor constructor = f845g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: b */
    public C0295x0 mo868b() {
        m889a();
        C0295x0 c0295x0M920g = C0295x0.m920g(null, this.f847c);
        C0076c[] c0076cArr = this.f856b;
        C0291v0 c0291v0 = c0295x0M920g.f882a;
        c0291v0.mo900o(c0076cArr);
        c0291v0.mo908q(this.f848d);
        return c0295x0M920g;
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: e */
    public void mo869e(C0076c c0076c) {
        this.f848d = c0076c;
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: g */
    public void mo870g(C0076c c0076c) {
        WindowInsets windowInsets = this.f847c;
        if (windowInsets != null) {
            this.f847c = windowInsets.replaceSystemWindowInsets(c0076c.f238a, c0076c.f239b, c0076c.f240c, c0076c.f241d);
        }
    }

    public C0273m0(C0295x0 c0295x0) {
        super(c0295x0);
        this.f847c = c0295x0.m925f();
    }
}
