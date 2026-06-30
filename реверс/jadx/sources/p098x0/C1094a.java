package p098x0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1094a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f4517a;

    public C1094a(Chip chip) {
        this.f4517a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1097d c1097d = this.f4517a.f2166e;
        if (c1097d != null) {
            c1097d.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
