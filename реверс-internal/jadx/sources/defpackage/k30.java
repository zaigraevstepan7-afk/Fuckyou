package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k30 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile k30 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new cr1(cls, charSequence) : super.newEditable(charSequence);
    }
}
