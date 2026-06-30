package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.reddit.frontpage.ConfigsActivity;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: renamed from: Q0.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0333g implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4850short = null;

    /* JADX INFO: renamed from: a */
    public final ConfigsActivity f947a;

    /* JADX INFO: renamed from: b */
    public final TextInputEditText f948b;

    /* JADX INFO: renamed from: c */
    public final C0340n f949c;

    /* JADX INFO: renamed from: d */
    public final DialogInterfaceC0666h f950d;

    static {
        ZLoader.registerNativesForClass(60, ViewOnClickListenerC0333g.class);
        Hidden0.special_clinit_60_00(ViewOnClickListenerC0333g.class);
    }

    public /* synthetic */ ViewOnClickListenerC0333g(C0340n c0340n, TextInputEditText textInputEditText, ConfigsActivity configsActivity, DialogInterfaceC0666h dialogInterfaceC0666h) {
        this.f947a = configsActivity;
        this.f948b = textInputEditText;
        this.f949c = c0340n;
        this.f950d = dialogInterfaceC0666h;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static native int m3275(Object obj);

    /* JADX INFO: renamed from: ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static native short[] m3276();

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
