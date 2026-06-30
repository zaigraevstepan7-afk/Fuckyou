package p074l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0939i0 extends C0933g0 {
    @Override // p074l.C0933g0, p074l.C0942j0
    /* JADX INFO: renamed from: a */
    public void mo2373a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p074l.C0942j0
    /* JADX INFO: renamed from: b */
    public boolean mo2380b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
