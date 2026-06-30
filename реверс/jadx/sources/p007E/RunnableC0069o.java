package p007E;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: E.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0069o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f218c;

    public /* synthetic */ RunnableC0069o(Object obj, int i2, int i3) {
        this.f216a = i3;
        this.f218c = obj;
        this.f217b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f216a) {
            case 0:
                ((AbstractC0056b) this.f218c).mo337h(this.f217b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f218c;
                View view = (View) sideSheetBehavior.f2322p.get();
                if (view != null) {
                    sideSheetBehavior.m1759t(view, this.f217b, false);
                }
                break;
        }
    }
}
