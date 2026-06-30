package p074l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: l.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C0933g0 extends C0942j0 {
    @Override // p074l.C0942j0
    /* JADX INFO: renamed from: a */
    public void mo2373a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0945k0.m2387e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
