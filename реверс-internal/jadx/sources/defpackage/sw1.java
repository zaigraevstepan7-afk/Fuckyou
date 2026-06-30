package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public enum sw1 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(c2.K, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(c2.L, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(c2.M, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(c2.N, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(c2.O, Build.VERSION.SDK_INT <= 26 ? com.reddit.secondpage.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object e;
    public final int f;
    public final int g;

    sw1(Object obj, int i2, int i3) {
        this.e = obj;
        this.f = i2;
        this.g = i3;
    }
}
