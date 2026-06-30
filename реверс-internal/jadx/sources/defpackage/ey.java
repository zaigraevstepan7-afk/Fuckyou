package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ey extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        m62 m62Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                if (!(view instanceof m62) || (outline2 = (m62Var = (m62) view).i) == null) {
                    return;
                }
                outline.set(outline2);
                float f = m62Var.o;
                if (f == 0.0f && m62Var.p == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) m62Var.p);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
