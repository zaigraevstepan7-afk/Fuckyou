package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bk;
import defpackage.s91;
import defpackage.tc1;
import defpackage.uc1;
import defpackage.yc;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends uc1 {
    public final int a;
    public final bk b;
    public final boolean c;
    public boolean d = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = 1;
        this.c = false;
        tc1 tc1VarN = uc1.n(context, attributeSet, i, i2);
        int i3 = tc1VarN.a;
        if (i3 != 0 && i3 != 1) {
            yc.p(s91.i("invalid orientation:", i3));
            throw null;
        }
        if (i3 != this.a || this.b == null) {
            this.b = bk.s(this, i3);
            this.a = i3;
        }
        boolean z = tc1VarN.c;
        if (z != this.c) {
            this.c = z;
        }
        G(tc1VarN.d);
    }

    public void G(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
    }
}
