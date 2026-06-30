package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o30 implements InputFilter {
    public final ic a;
    public n30 b;

    public o30(ic icVar) {
        this.a = icVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        ic icVar = this.a;
        if (!icVar.isInEditMode()) {
            int iC = g30.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != icVar.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return g30.a().g(charSequence, 0, charSequence.length(), 0);
                    }
                }
            }
            g30 g30VarA = g30.a();
            if (this.b == null) {
                this.b = new n30(icVar, this);
            }
            g30VarA.h(this.b);
            return charSequence;
        }
        return charSequence;
    }
}
