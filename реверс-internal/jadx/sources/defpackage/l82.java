package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l82 extends k82 {
    public l82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var, windowInsets);
    }

    @Override // defpackage.d82, defpackage.m82
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(o82.a(i));
    }

    @Override // defpackage.d82, defpackage.m82
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(o82.a(i));
    }

    @Override // defpackage.d82, defpackage.m82
    public void p() {
    }
}
