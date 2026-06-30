package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements aj1 {
    public final ScrollFeedbackProvider e;

    public zi1(NestedScrollView nestedScrollView) {
        this.e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.aj1
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.e.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.aj1
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.e.onScrollProgress(i, i2, i3, i4);
    }
}
