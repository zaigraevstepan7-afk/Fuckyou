package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p060e.C0665g;
import p071j.AbstractC0786a;
import p072k.C0818o;
import p074l.C0931f1;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0615j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2211b;

    public /* synthetic */ ViewOnClickListenerC0615j(int i2, Object obj) {
        this.f2210a = i2;
        this.f2211b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f2210a) {
            case 0:
                C0616k c0616k = (C0616k) this.f2211b;
                int i2 = c0616k.f2215X;
                if (i2 == 2) {
                    c0616k.m1736G(1);
                } else if (i2 == 1) {
                    c0616k.m1736G(2);
                }
                break;
            case 1:
                C0665g c0665g = (C0665g) this.f2211b;
                Message messageObtain = (view != c0665g.f2673i || (message3 = c0665g.f2675k) == null) ? (view != c0665g.f2676l || (message2 = c0665g.f2678n) == null) ? (view != c0665g.f2679o || (message = c0665g.f2681q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0665g.f2663E.obtainMessage(1, c0665g.f2666b).sendToTarget();
                break;
            case 2:
                ((AbstractC0786a) this.f2211b).mo1864a();
                break;
            default:
                C0931f1 c0931f1 = ((Toolbar) this.f2211b).f1382L;
                C0818o c0818o = c0931f1 == null ? null : c0931f1.f3719b;
                if (c0818o != null) {
                    c0818o.collapseActionView();
                }
                break;
        }
    }
}
