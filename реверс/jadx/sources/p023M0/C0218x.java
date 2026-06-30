package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import p001A0.C1121;

/* JADX INFO: renamed from: M0.x */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0218x extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f747a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f748b;

    /* JADX INFO: renamed from: c */
    public final C0219y f749c;

    static {
        ZLoader.registerNativesForClass(50, C0218x.class);
        Hidden0.special_clinit_50_00(C0218x.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218x(C0219y c0219y, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.f749c = c0219y;
        C1121.m2793(this);
    }

    /* JADX INFO: renamed from: a */
    public final native void m685a();

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final native View getView(int i2, View view, ViewGroup viewGroup);
}
