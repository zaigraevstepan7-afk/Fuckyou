package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public hw1(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw1)) {
            return false;
        }
        hw1 hw1Var = (hw1) obj;
        return xi0.o(this.a, hw1Var.a) && wz1.b(this.b, hw1Var.b) && xi0.o(this.c, hw1Var.c) && this.d.equals(hw1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = wz1.c;
        return this.d.hashCode() + ((this.c.hashCode() + s91.c(iHashCode, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + wz1.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
