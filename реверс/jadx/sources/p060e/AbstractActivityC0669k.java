package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractActivityC0466k;
import androidx.activity.C0460e;
import androidx.activity.C0461f;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0550t;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.C1147;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000A.C0001b;
import p004C.InterfaceC0023d;
import p022M.InterfaceC0184a;
import p024N.C1128;
import p051a1.C1144;
import p052b0.C1152;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;
import p068h0.C1162;
import p072k.C1165;
import p084q.C1172;
import p086r.C1174;
import p097x.C1178;

/* JADX INFO: renamed from: e.k */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC0669k extends AbstractActivityC0466k implements InterfaceC0670l, InterfaceC0023d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4896short = null;

    /* JADX INFO: renamed from: u */
    public boolean f2699u;

    /* JADX INFO: renamed from: v */
    public boolean f2700v;

    /* JADX INFO: renamed from: x */
    public LayoutInflaterFactory2C0648D f2702x;

    /* JADX INFO: renamed from: s */
    public final C0001b f2697s = new C0001b(16, new C0550t(this));

    /* JADX INFO: renamed from: t */
    public final C0588t f2698t = new C0588t(this);

    /* JADX INFO: renamed from: w */
    public boolean f2701w = true;

    static {
        ZLoader.registerNativesForClass(80, AbstractActivityC0669k.class);
        Hidden0.special_clinit_80_00(AbstractActivityC0669k.class);
    }

    public AbstractActivityC0669k() {
        final int i2 = 1;
        final int i3 = 0;
        C1162.m4530((C0781d) C1172.m4941(C1147.m3874(this)), C1174.m5039(m4380(), 0, 25, 1769), new C0460e(i2, this));
        C1128.m3057(this, new InterfaceC0184a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0669k f1804b;

            {
                this.f1804b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i3) {
                    case 0:
                        this.f1804b.f2697s.m34E();
                        break;
                    default:
                        this.f1804b.f2697s.m34E();
                        break;
                }
            }
        });
        C1152.m4030(C1178.m5198(this), new InterfaceC0184a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0669k f1804b;

            {
                this.f1804b = this;
            }

            @Override // p022M.InterfaceC0184a
            /* JADX INFO: renamed from: a */
            public final void mo567a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1804b.f2697s.m34E();
                        break;
                    default:
                        this.f1804b.f2697s.m34E();
                        break;
                }
            }
        });
        C1144.m3754(this, new C0461f(this, i2));
        C1162.m4530((C0781d) C1172.m4941(C1147.m3874(this)), C1165.m4658(m4380(), 25, 18, 597), new C0667i(this));
        C1144.m3754(this, new C0668j(this));
    }

    /* JADX INFO: renamed from: l */
    public static native boolean m1893l(C0518H c0518h);

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static native short[] m4380();

    @Override // android.app.Activity
    public final native void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final native void attachBaseContext(Context context);

    @Override // android.app.Activity
    public final native void closeOptionsMenu();

    @Override // p004C.AbstractActivityC0030k, android.app.Activity, android.view.Window.Callback
    public final native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // android.app.Activity
    public final native void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Override // android.app.Activity
    public final native View findViewById(int i2);

    @Override // android.app.Activity
    public final native MenuInflater getMenuInflater();

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final native Resources getResources();

    @Override // android.app.Activity
    public final native void invalidateOptionsMenu();

    /* JADX INFO: renamed from: k */
    public final native AbstractC0676r m1894k();

    /* JADX INFO: renamed from: m */
    public final native void m1895m();

    /* JADX INFO: renamed from: n */
    public final native boolean m1896n(int i2, MenuItem menuItem);

    /* JADX INFO: renamed from: o */
    public final native void m1897o();

    @Override // androidx.activity.AbstractActivityC0466k, android.app.Activity
    public final native void onActivityResult(int i2, int i3, Intent intent);

    @Override // androidx.activity.AbstractActivityC0466k, android.app.Activity, android.content.ComponentCallbacks
    public final native void onConfigurationChanged(Configuration configuration);

    @Override // android.app.Activity, android.view.Window.Callback
    public final native void onContentChanged();

    @Override // androidx.activity.AbstractActivityC0466k, p004C.AbstractActivityC0030k, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final native View onCreateView(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final native View onCreateView(String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity
    public final native void onDestroy();

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final native boolean onKeyDown(int i2, KeyEvent keyEvent);

    @Override // androidx.activity.AbstractActivityC0466k, android.app.Activity, android.view.Window.Callback
    public final native boolean onMenuItemSelected(int i2, MenuItem menuItem);

    @Override // android.app.Activity
    public final native void onPause();

    @Override // android.app.Activity
    public final native void onPostCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native void onPostResume();

    @Override // androidx.activity.AbstractActivityC0466k, android.app.Activity
    public final native void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);

    @Override // android.app.Activity
    public native void onResume();

    @Override // android.app.Activity
    public final native void onStart();

    @Override // android.app.Activity
    public final native void onStateNotSaved();

    @Override // android.app.Activity
    public final native void onStop();

    @Override // android.app.Activity
    public final native void onTitleChanged(CharSequence charSequence, int i2);

    @Override // android.app.Activity
    public final native void openOptionsMenu();

    /* JADX INFO: renamed from: p */
    public final native void m1898p();

    /* JADX INFO: renamed from: q */
    public final native void m1899q();

    @Override // android.app.Activity
    public final native void setContentView(int i2);

    @Override // androidx.activity.AbstractActivityC0466k, android.app.Activity
    public native void setContentView(View view);

    @Override // android.app.Activity
    public final native void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final native void setTheme(int i2);
}
