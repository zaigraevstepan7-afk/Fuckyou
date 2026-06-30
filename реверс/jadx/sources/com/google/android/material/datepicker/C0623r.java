package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p024N.AbstractC0240S;
import p024N.C0223B;
import p066g0.AbstractC0741b0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0623r extends AbstractC0741b0 {

    /* JADX INFO: renamed from: u */
    public final TextView f2266u;

    /* JADX INFO: renamed from: v */
    public final MaterialCalendarGridView f2267v;

    public C0623r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.resc);
        this.f2266u = textView;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        new C0223B(R.id.resc, Boolean.class, 0, 28, 3).m695d(textView, Boolean.TRUE);
        this.f2267v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.resc);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
