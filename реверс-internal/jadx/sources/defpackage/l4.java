package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ m4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(m4 m4Var, int i) {
        super(1);
        this.f = i;
        this.g = m4Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        m4 m4Var = this.g;
        switch (i) {
            case 0:
                View view = m4Var.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                ej1 ej1Var = (ej1) obj;
                if (ej1Var.f.contains(ej1Var)) {
                    y31 snapshotObserver = m4Var.h.getSnapshotObserver();
                    snapshotObserver.a.c(ej1Var, m4Var.S, new y3(1, ej1Var, m4Var));
                }
                return t32.a;
        }
    }
}
