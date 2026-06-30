package p005C0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: C0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038d {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f139a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f140b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m265a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m265a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: b */
    public static void m266b(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f139a;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m265a(viewGroup, view, matrix);
        ThreadLocal threadLocal2 = f140b;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
