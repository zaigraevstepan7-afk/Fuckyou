package defpackage;

import android.view.DisplayCutout;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b1 {
    public static /* bridge */ /* synthetic */ DisplayCutout c(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder f(CharSequence charSequence, int i, int i2) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ TextSelection.Request.Builder j(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* synthetic */ void y() {
    }
}
