package p074l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: l.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0920c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f3705b;

    public /* synthetic */ RunnableC0920c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f3704a = i2;
        this.f3705b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3704a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3705b;
                actionBarOverlayLayout.m1207h();
                actionBarOverlayLayout.f1341w = actionBarOverlayLayout.f1322d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1342x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3705b;
                actionBarOverlayLayout2.m1207h();
                actionBarOverlayLayout2.f1341w = actionBarOverlayLayout2.f1322d.animate().translationY(-actionBarOverlayLayout2.f1322d.getHeight()).setListener(actionBarOverlayLayout2.f1342x);
                break;
        }
    }
}
