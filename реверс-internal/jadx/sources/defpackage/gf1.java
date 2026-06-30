package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.reddit.secondpage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gf1 extends ViewGroup {
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final n81 h;
    public int i;

    public gf1(Context context) {
        super(context);
        this.e = 5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        this.h = new n81(1);
        setClipChildren(false);
        hf1 hf1Var = new hf1(context);
        addView(hf1Var);
        arrayList.add(hf1Var);
        arrayList2.add(hf1Var);
        this.i = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
