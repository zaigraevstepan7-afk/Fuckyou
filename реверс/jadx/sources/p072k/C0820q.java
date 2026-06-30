package p072k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p071j.InterfaceC0787b;

/* JADX INFO: renamed from: k.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0820q extends FrameLayout implements InterfaceC0787b {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f3378a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0820q(View view) {
        super(view.getContext());
        this.f3378a = (CollapsibleActionView) view;
        addView(view);
    }
}
