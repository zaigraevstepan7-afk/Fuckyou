package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p005C0.AbstractC0046l;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0632a extends AbstractC0046l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f2445a;

    public C0632a(ChipTextInputComboView chipTextInputComboView) {
        this.f2445a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2445a;
        if (zIsEmpty) {
            chipTextInputComboView.f2413a.setText(ChipTextInputComboView.m1791a(chipTextInputComboView, "00"));
            return;
        }
        String strM1791a = ChipTextInputComboView.m1791a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2413a;
        if (TextUtils.isEmpty(strM1791a)) {
            strM1791a = ChipTextInputComboView.m1791a(chipTextInputComboView, "00");
        }
        chip.setText(strM1791a);
    }
}
