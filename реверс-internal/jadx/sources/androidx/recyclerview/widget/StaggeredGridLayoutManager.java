package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.bk;
import defpackage.t61;
import defpackage.tc1;
import defpackage.uc1;
import defpackage.yc;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends uc1 {
    public final int a;
    public final t61[] b;
    public final bk c;
    public final bk d;
    public final int e;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = -1;
        new Rect();
        tc1 tc1VarN = uc1.n(context, attributeSet, i, i2);
        int i3 = tc1VarN.a;
        if (i3 != 0 && i3 != 1) {
            yc.p("invalid orientation.");
            throw null;
        }
        if (i3 != this.e) {
            this.e = i3;
            bk bkVar = this.c;
            this.c = this.d;
            this.d = bkVar;
        }
        int i4 = tc1VarN.b;
        if (i4 != this.a) {
            this.a = i4;
            new BitSet(this.a);
            this.b = new t61[this.a];
            for (int i5 = 0; i5 < this.a; i5++) {
                t61[] t61VarArr = this.b;
                t61 t61Var = new t61(20);
                new ArrayList();
                t61VarArr[i5] = t61Var;
            }
        }
        this.c = bk.s(this, this.e);
        this.d = bk.s(this, 1 - this.e);
    }
}
