package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s30 implements q30 {
    public final /* synthetic */ int e;
    public final String f;

    public /* synthetic */ s30(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.q30
    public boolean b(CharSequence charSequence, int i, int i2, a32 a32Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f)) {
            return true;
        }
        a32Var.c = (a32Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "<" + this.f + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.q30
    public Object a() {
        return this;
    }
}
