package p046Y;

import android.text.Editable;
import androidx.emoji2.text.C0506t;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0410a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f1113a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0410a f1114b;

    /* JADX INFO: renamed from: c */
    public static Class f1115c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1115c;
        return cls != null ? new C0506t(cls, charSequence) : super.newEditable(charSequence);
    }
}
