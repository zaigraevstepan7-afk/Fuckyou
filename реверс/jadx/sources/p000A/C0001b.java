package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.C0507u;
import androidx.emoji2.text.InterfaceC0495i;
import androidx.emoji2.text.InterfaceC0500n;
import androidx.versionedparcelable.C1150;
import java.io.Serializable;
import p005C0.C0048n;
import p016J.InterfaceC0129a;
import p024N.C0258f;
import p024N.C0270l;
import p024N.C0295x0;
import p024N.InterfaceC0252c;
import p024N.InterfaceC0256e;
import p024N.InterfaceC0262h;
import p024N.InterfaceC0282r;
import p026O.C0311k;
import p026O.C0312l;
import p026O.C0313m;
import p026O.C1132;
import p026O.InterfaceC0321u;
import p034S.C0362f;
import p036T.AbstractC0383m;
import p046Y.C0416g;
import p050a0.C1143;
import p051a1.C1145;
import p061e0.InterfaceC0689e;
import p072k.C0818o;
import p072k.InterfaceC0814k;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p073k0.C1166;
import p074l.InterfaceC0886L0;
import p074l.InterfaceC0918b0;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public class C0001b implements InterfaceC0282r, InterfaceC0252c, InterfaceC0256e, InterfaceC0262h, InterfaceC0495i, InterfaceC0500n, InterfaceC0129a, InterfaceC0689e, InterfaceC0886L0, InterfaceC0827x, InterfaceC0814k, InterfaceC0918b0, InterfaceC0321u {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4821short = null;

    /* JADX INFO: renamed from: a */
    public final int f0a;

    /* JADX INFO: renamed from: b */
    public Object f1b;

    static {
        ZLoader.registerNativesForClass(1, C0001b.class);
        Hidden0.special_clinit_1_00(C0001b.class);
    }

    public C0001b(int i2) {
        this.f0a = i2;
        if (i2 != 7) {
            return;
        }
        this.f1b = C1132.m3237() >= 26 ? new C0313m(this) : new C0312l(this);
    }

    public /* synthetic */ C0001b(int i2, Object obj) {
        this.f0a = i2;
        this.f1b = obj;
    }

    public C0001b(ClipData clipData, int i2) {
        this.f0a = 5;
        this.f1b = C1166.m4679(clipData, i2);
    }

    public C0001b(Context context) {
        this.f0a = 13;
        this.f1b = C1145.m3787(context);
    }

    public C0001b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f0a = 9;
        this.f1b = C1132.m3237() >= 25 ? new C0362f(uri, clipDescription, uri2) : new C0270l(uri, clipDescription, uri2);
    }

    public C0001b(ContentInfo contentInfo) {
        this.f0a = 6;
        C1150.m3951(contentInfo);
        this.f1b = C1143.m3687(contentInfo);
    }

    public C0001b(ViewGroup viewGroup) {
        this.f0a = 2;
        this.f1b = C1166.m4715(viewGroup);
    }

    public C0001b(EditText editText) {
        this.f0a = 11;
        this.f1b = new C0048n(editText);
    }

    public C0001b(TextView textView) {
        this.f0a = 12;
        this.f1b = new C0416g(textView);
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static native short[] m2759();

    @Override // p074l.InterfaceC0918b0
    /* JADX INFO: renamed from: A */
    public native void mo30A(int i2);

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: B */
    public native void mo31B(int i2);

    /* JADX INFO: renamed from: C */
    public native C0311k mo32C(int i2);

    /* JADX INFO: renamed from: D */
    public native C0311k mo33D(int i2);

    /* JADX INFO: renamed from: E */
    public native void m34E();

    /* JADX INFO: renamed from: F */
    public native boolean mo35F(int i2, int i3, Bundle bundle);

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: a */
    public native void mo36a(Bundle bundle);

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: b */
    public native void mo37b(MenuC0816m menuC0816m, boolean z2);

    @Override // androidx.emoji2.text.InterfaceC0500n
    /* JADX INFO: renamed from: c */
    public native boolean mo38c(CharSequence charSequence, int i2, int i3, C0507u c0507u);

    @Override // p074l.InterfaceC0918b0
    /* JADX INFO: renamed from: d */
    public native void mo39d(int i2);

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: e */
    public native void mo40e(Uri uri);

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: f */
    public native int mo41f();

    @Override // p074l.InterfaceC0886L0
    /* JADX INFO: renamed from: g */
    public native void mo42g(MenuC0816m menuC0816m, C0818o c0818o);

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: h */
    public native boolean mo43h(MenuC0816m menuC0816m);

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: i */
    public native boolean mo44i(float f);

    @Override // androidx.emoji2.text.InterfaceC0495i
    /* JADX INFO: renamed from: j */
    public native void mo45j(AbstractC0383m abstractC0383m);

    @Override // androidx.emoji2.text.InterfaceC0500n
    /* JADX INFO: renamed from: k */
    public native Object mo46k();

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: l */
    public native ClipData mo47l();

    @Override // p026O.InterfaceC0321u
    /* JADX INFO: renamed from: m */
    public native boolean mo48m(View view);

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: n */
    public native C0258f mo49n();

    @Override // p061e0.InterfaceC0689e
    /* JADX INFO: renamed from: o */
    public native void mo50o(int i2, Serializable serializable);

    @Override // p024N.InterfaceC0282r
    /* JADX INFO: renamed from: p */
    public native C0295x0 mo51p(View view, C0295x0 c0295x0);

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: q */
    public native float mo52q();

    @Override // p016J.InterfaceC0129a
    /* JADX INFO: renamed from: r */
    public native void mo53r();

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: s */
    public native int mo54s();

    @Override // p074l.InterfaceC0918b0
    /* JADX INFO: renamed from: t */
    public native void mo55t(int i2, float f);

    public native String toString();

    @Override // p061e0.InterfaceC0689e
    /* JADX INFO: renamed from: u */
    public native void mo56u();

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: v */
    public native void mo57v(MenuC0816m menuC0816m);

    @Override // p072k.InterfaceC0814k
    /* JADX INFO: renamed from: w */
    public native boolean mo58w(MenuC0816m menuC0816m, MenuItem menuItem);

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: x */
    public native void mo59x();

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: y */
    public native ContentInfo mo60y();

    @Override // p074l.InterfaceC0886L0
    /* JADX INFO: renamed from: z */
    public native void mo61z(MenuC0816m menuC0816m, C0818o c0818o);
}
