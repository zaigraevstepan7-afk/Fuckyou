package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: Q0.w */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0349w implements TextWatcher {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4858short = null;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f989a;

    static {
        ZLoader.registerNativesForClass(76, C0349w.class);
        Hidden0.special_clinit_76_00(C0349w.class);
    }

    public C0349w(SharedPreferences sharedPreferences) {
        this.f989a = sharedPreferences;
    }

    /* JADX INFO: renamed from: ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static native short[] m3288();

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(CharSequence charSequence, int i2, int i3, int i4);
}
