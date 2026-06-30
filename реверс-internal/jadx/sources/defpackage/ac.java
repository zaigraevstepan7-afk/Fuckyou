package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ac implements Runnable {
    public final /* synthetic */ TextView e;
    public final /* synthetic */ Typeface f;
    public final /* synthetic */ int g;

    public ac(TextView textView, Typeface typeface, int i) {
        this.e = textView;
        this.f = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.setTypeface(this.f, this.g);
    }
}
