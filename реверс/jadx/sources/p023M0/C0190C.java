package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p041V0.C1138;

/* JADX INFO: renamed from: M0.C */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0190C implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f629a;

    /* JADX INFO: renamed from: b */
    public final EditText f630b;

    /* JADX INFO: renamed from: c */
    public final TextInputLayout f631c;

    static {
        ZLoader.registerNativesForClass(23, C0190C.class);
        Hidden0.special_clinit_23_00(C0190C.class);
    }

    public C0190C(TextInputLayout textInputLayout, EditText editText) {
        this.f631c = textInputLayout;
        this.f630b = editText;
        this.f629a = C1138.m3473(editText);
    }

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(CharSequence charSequence, int i2, int i3, int i4);
}
