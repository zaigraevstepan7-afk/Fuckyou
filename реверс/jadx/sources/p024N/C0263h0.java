package p024N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p001A0.AbstractC0014c;
import p009F.C0076c;

/* JADX INFO: renamed from: N.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263h0 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: a */
    public final C0254d f824a;

    /* JADX INFO: renamed from: b */
    public List f825b;

    /* JADX INFO: renamed from: c */
    public ArrayList f826c;

    /* JADX INFO: renamed from: d */
    public final HashMap f827d;

    public C0263h0(C0254d c0254d) {
        super(0);
        this.f827d = new HashMap();
        this.f824a = c0254d;
    }

    /* JADX INFO: renamed from: a */
    public final C0269k0 m826a(WindowInsetsAnimation windowInsetsAnimation) {
        C0269k0 c0269k0 = (C0269k0) this.f827d.get(windowInsetsAnimation);
        if (c0269k0 == null) {
            c0269k0 = new C0269k0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0269k0.f834a = new C0265i0(windowInsetsAnimation);
            }
            this.f827d.put(windowInsetsAnimation, c0269k0);
        }
        return c0269k0;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0254d c0254d = this.f824a;
        m826a(windowInsetsAnimation);
        ((View) c0254d.f800e).setTranslationY(0.0f);
        this.f827d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0254d c0254d = this.f824a;
        m826a(windowInsetsAnimation);
        View view = (View) c0254d.f800e;
        int[] iArr = (int[]) c0254d.f801f;
        view.getLocationOnScreen(iArr);
        c0254d.f798c = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f826c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f826c = arrayList2;
            this.f825b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM134j = AbstractC0014c.m134j(list.get(size));
            C0269k0 c0269k0M826a = m826a(windowInsetsAnimationM134j);
            c0269k0M826a.f834a.mo836d(windowInsetsAnimationM134j.getFraction());
            this.f826c.add(c0269k0M826a);
        }
        C0254d c0254d = this.f824a;
        C0295x0 c0295x0M920g = C0295x0.m920g(null, windowInsets);
        c0254d.m818b(c0295x0M920g, this.f825b);
        return c0295x0M920g.m925f();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0254d c0254d = this.f824a;
        m826a(windowInsetsAnimation);
        C0076c c0076cM360c = C0076c.m360c(bounds.getLowerBound());
        C0076c c0076cM360c2 = C0076c.m360c(bounds.getUpperBound());
        View view = (View) c0254d.f800e;
        int[] iArr = (int[]) c0254d.f801f;
        view.getLocationOnScreen(iArr);
        int i2 = c0254d.f798c - iArr[1];
        c0254d.f799d = i2;
        view.setTranslationY(i2);
        AbstractC0014c.m136l();
        return AbstractC0014c.m132h(c0076cM360c.m361d(), c0076cM360c2.m361d());
    }
}
