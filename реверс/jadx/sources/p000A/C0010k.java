package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0504r;
import androidx.emoji2.text.C0507u;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0523M;
import androidx.fragment.app.C0528S;
import androidx.fragment.app.C0536f;
import androidx.lifecycle.C1147;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p004C.C1122;
import p015I0.C1125;
import p016J.InterfaceC0129a;
import p022M.C0186c;
import p024N.C1128;
import p029P0.C1133;
import p038U.C1137;
import p044X.C0406a;
import p044X.C0407b;
import p045X0.C1141;
import p071j.AbstractC0786a;
import p071j.C0790e;
import p072k.C1165;
import p072k.MenuC0816m;
import p075l0.C1168;
import p077m0.C1169;
import p084q.C1027f;
import p084q.C1029h;
import p084q.C1031j;
import p096w0.C1177;

/* JADX INFO: renamed from: A.k */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0010k implements InterfaceC0129a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4824short = null;

    /* JADX INFO: renamed from: a */
    public final Object f22a;

    /* JADX INFO: renamed from: b */
    public final Object f23b;

    /* JADX INFO: renamed from: c */
    public final Object f24c;

    /* JADX INFO: renamed from: d */
    public Object f25d;

    static {
        ZLoader.registerNativesForClass(10, C0010k.class);
        Hidden0.special_clinit_10_00(C0010k.class);
    }

    public C0010k(int i2) {
        if (i2 == 3) {
            this.f24c = new ArrayList();
            this.f22a = new HashMap();
            this.f23b = new HashMap();
        } else {
            if (i2 != 5) {
                this.f22a = new C0186c(10);
                this.f23b = new C1031j(0);
                this.f24c = new ArrayList();
                this.f25d = new HashSet();
                return;
            }
            this.f22a = new C1027f(0);
            this.f23b = new SparseArray();
            this.f24c = new C1029h();
            this.f25d = new C1027f(0);
        }
    }

    public C0010k(Context context, ActionMode.Callback callback) {
        this.f25d = context;
        this.f22a = callback;
        this.f24c = new ArrayList();
        this.f23b = new C1031j(0);
    }

    public C0010k(Typeface typeface, C0407b c0407b) {
        int iM2839;
        int iM28392;
        int iM28393;
        int iM28394;
        this.f25d = typeface;
        this.f22a = c0407b;
        this.f24c = new C0504r(1024);
        int iM3455 = C1137.m3455(c0407b, 6);
        if (iM3455 != 0) {
            int iM2927 = iM3455 + C1125.m2927(c0407b);
            iM2839 = C1122.m2839((ByteBuffer) C1141.m3604(c0407b), C1122.m2839((ByteBuffer) C1141.m3604(c0407b), iM2927) + iM2927);
        } else {
            iM2839 = 0;
        }
        this.f23b = new char[iM2839 * 2];
        int iM34552 = C1137.m3455(c0407b, 6);
        if (iM34552 != 0) {
            int iM29272 = iM34552 + C1125.m2927(c0407b);
            iM28392 = C1122.m2839((ByteBuffer) C1141.m3604(c0407b), C1122.m2839((ByteBuffer) C1141.m3604(c0407b), iM29272) + iM29272);
        } else {
            iM28392 = 0;
        }
        for (int i2 = 0; i2 < iM28392; i2++) {
            C0507u c0507u = new C0507u(this, i2);
            C0406a c0406aM5124 = C1177.m5124(c0507u);
            int iM34553 = C1137.m3455(c0406aM5124, 4);
            C1168.m4772(iM34553 != 0 ? C1122.m2839((ByteBuffer) C1141.m3604(c0406aM5124), iM34553 + C1125.m2927(c0406aM5124)) : 0, (char[]) C1128.m3069(this), i2 * 2);
            C0406a c0406aM51242 = C1177.m5124(c0507u);
            int iM34554 = C1137.m3455(c0406aM51242, 16);
            if (iM34554 != 0) {
                int iM29273 = iM34554 + C1125.m2927(c0406aM51242);
                iM28393 = C1122.m2839((ByteBuffer) C1141.m3604(c0406aM51242), C1122.m2839((ByteBuffer) C1141.m3604(c0406aM51242), iM29273) + iM29273);
            } else {
                iM28393 = 0;
            }
            C1147.m3889(iM28393 > 0, C1169.m4801(m2762(), 0, 33, 1383));
            C0406a c0406aM51243 = C1177.m5124(c0507u);
            int iM34555 = C1137.m3455(c0406aM51243, 16);
            if (iM34555 != 0) {
                int iM29274 = iM34555 + C1125.m2927(c0406aM51243);
                iM28394 = C1122.m2839((ByteBuffer) C1141.m3604(c0406aM51243), C1122.m2839((ByteBuffer) C1141.m3604(c0406aM51243), iM29274) + iM29274);
            } else {
                iM28394 = 0;
            }
            C1165.m4670((C0504r) C1133.m3254(this), c0507u, 0, iM28394 - 1);
        }
    }

    public C0010k(View view, ViewGroup viewGroup, C0536f c0536f, C0528S c0528s) {
        this.f22a = view;
        this.f23b = viewGroup;
        this.f24c = c0536f;
        this.f25d = c0528s;
    }

    /* JADX INFO: renamed from: ۦۡۧۡ, reason: contains not printable characters */
    public static native short[] m2762();

    /* JADX INFO: renamed from: a */
    public native void m80a(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r);

    /* JADX INFO: renamed from: b */
    public native void m81b(Object obj, ArrayList arrayList, HashSet hashSet);

    /* JADX INFO: renamed from: c */
    public native AbstractComponentCallbacksC0548r m82c(String str);

    /* JADX INFO: renamed from: d */
    public native AbstractComponentCallbacksC0548r m83d(String str);

    /* JADX INFO: renamed from: e */
    public native C0790e m84e(AbstractC0786a abstractC0786a);

    /* JADX INFO: renamed from: f */
    public native ArrayList m85f();

    /* JADX INFO: renamed from: g */
    public native ArrayList m86g();

    /* JADX INFO: renamed from: h */
    public native List m87h();

    /* JADX INFO: renamed from: i */
    public native void m88i(C0523M c0523m);

    /* JADX INFO: renamed from: j */
    public native void m89j(C0523M c0523m);

    /* JADX INFO: renamed from: k */
    public native boolean m90k(AbstractC0786a abstractC0786a, MenuItem menuItem);

    /* JADX INFO: renamed from: l */
    public native boolean m91l(AbstractC0786a abstractC0786a, MenuC0816m menuC0816m);

    @Override // p016J.InterfaceC0129a
    /* JADX INFO: renamed from: r */
    public native void mo53r();
}
