package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 {
    public final b4 a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public eg0(Context context, b4 b4Var) {
        this.a = b4Var;
        this.d = new GestureDetector(context, new dg0(this));
    }
}
