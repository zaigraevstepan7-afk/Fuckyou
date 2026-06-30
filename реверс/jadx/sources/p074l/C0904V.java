package p074l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p004C.RunnableC0021b;
import p007E.AbstractC0056b;

/* JADX INFO: renamed from: l.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0904V extends AbstractC0056b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3626h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3627i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WeakReference f3628j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0915a0 f3629k;

    public C0904V(C0915a0 c0915a0, int i2, int i3, WeakReference weakReference) {
        this.f3629k = c0915a0;
        this.f3626h = i2;
        this.f3627i = i3;
        this.f3628j = weakReference;
    }

    @Override // p007E.AbstractC0056b
    /* JADX INFO: renamed from: i */
    public final void mo338i(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f3626h) != -1) {
            typeface = AbstractC0912Z.m2348a(typeface, i2, (this.f3627i & 2) != 0);
        }
        C0915a0 c0915a0 = this.f3629k;
        if (c0915a0.f3698m) {
            c0915a0.f3697l = typeface;
            TextView textView = (TextView) this.f3628j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0021b(textView, typeface, c0915a0.f3695j, 3));
                } else {
                    textView.setTypeface(typeface, c0915a0.f3695j);
                }
            }
        }
    }

    @Override // p007E.AbstractC0056b
    /* JADX INFO: renamed from: h */
    public final void mo337h(int i2) {
    }
}
