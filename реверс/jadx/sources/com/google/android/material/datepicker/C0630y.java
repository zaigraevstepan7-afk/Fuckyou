package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.Locale;
import p015I0.C0109e;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0741b0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0630y extends AbstractC0714B {

    /* JADX INFO: renamed from: d */
    public final C0616k f2274d;

    public C0630y(C0616k c0616k) {
        this.f2274d = c0616k;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: a */
    public final int mo985a() {
        return this.f2274d.f2213V.f2192f;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: c */
    public final void mo986c(AbstractC0741b0 abstractC0741b0, int i2) {
        C0616k c0616k = this.f2274d;
        int i3 = c0616k.f2213V.f2187a.f2254c + i2;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
        TextView textView = ((C0629x) abstractC0741b0).f2273u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0628w.m1750b().get(1) == i3 ? String.format(context.getString(R.string.resc), Integer.valueOf(i3)) : String.format(context.getString(R.string.resc), Integer.valueOf(i3)));
        C0608c c0608c = c0616k.f2216Y;
        if (AbstractC0628w.m1750b().get(1) == i3) {
            C0109e c0109e = c0608c.f2195b;
        } else {
            C0109e c0109e2 = c0608c.f2194a;
        }
        throw null;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: d */
    public final AbstractC0741b0 mo987d(ViewGroup viewGroup) {
        return new C0629x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resc, viewGroup, false));
    }
}
