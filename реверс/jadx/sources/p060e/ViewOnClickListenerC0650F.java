package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: e.F */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0650F implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4889short = null;

    /* JADX INFO: renamed from: a */
    public final View f2579a;

    /* JADX INFO: renamed from: b */
    public final String f2580b;

    /* JADX INFO: renamed from: c */
    public Method f2581c;

    /* JADX INFO: renamed from: d */
    public Context f2582d;

    static {
        ZLoader.registerNativesForClass(89, ViewOnClickListenerC0650F.class);
        Hidden0.special_clinit_89_00(ViewOnClickListenerC0650F.class);
    }

    public ViewOnClickListenerC0650F(View view, String str) {
        this.f2579a = view;
        this.f2580b = str;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static native short[] m4371();

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
