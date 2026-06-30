package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.datepicker.ViewOnClickListenerC0615j;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import p022M.C1126;
import p024N.C1128;
import p052b0.C1151;
import p075l0.C1168;
import p086r.C1174;
import p089t.C1175;
import p098x0.C1179;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0665g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4893short = null;

    /* JADX INFO: renamed from: A */
    public final int f2659A;

    /* JADX INFO: renamed from: B */
    public final int f2660B;

    /* JADX INFO: renamed from: C */
    public final int f2661C;

    /* JADX INFO: renamed from: D */
    public final boolean f2662D;

    /* JADX INFO: renamed from: E */
    public final HandlerC0663e f2663E;

    /* JADX INFO: renamed from: a */
    public final Context f2665a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0666h f2666b;

    /* JADX INFO: renamed from: c */
    public final Window f2667c;

    /* JADX INFO: renamed from: d */
    public CharSequence f2668d;

    /* JADX INFO: renamed from: e */
    public CharSequence f2669e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f2670f;

    /* JADX INFO: renamed from: g */
    public View f2671g;

    /* JADX INFO: renamed from: i */
    public Button f2673i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2674j;

    /* JADX INFO: renamed from: k */
    public Message f2675k;

    /* JADX INFO: renamed from: l */
    public Button f2676l;

    /* JADX INFO: renamed from: m */
    public CharSequence f2677m;

    /* JADX INFO: renamed from: n */
    public Message f2678n;

    /* JADX INFO: renamed from: o */
    public Button f2679o;

    /* JADX INFO: renamed from: p */
    public CharSequence f2680p;

    /* JADX INFO: renamed from: q */
    public Message f2681q;

    /* JADX INFO: renamed from: r */
    public NestedScrollView f2682r;

    /* JADX INFO: renamed from: s */
    public Drawable f2683s;

    /* JADX INFO: renamed from: t */
    public ImageView f2684t;

    /* JADX INFO: renamed from: u */
    public TextView f2685u;

    /* JADX INFO: renamed from: v */
    public TextView f2686v;

    /* JADX INFO: renamed from: w */
    public View f2687w;

    /* JADX INFO: renamed from: x */
    public ListAdapter f2688x;

    /* JADX INFO: renamed from: z */
    public final int f2690z;

    /* JADX INFO: renamed from: h */
    public boolean f2672h = false;

    /* JADX INFO: renamed from: y */
    public int f2689y = -1;

    /* JADX INFO: renamed from: F */
    public final ViewOnClickListenerC0615j f2664F = new ViewOnClickListenerC0615j(1, this);

    static {
        ZLoader.registerNativesForClass(104, C0665g.class);
        Hidden0.special_clinit_104_00(C0665g.class);
    }

    public C0665g(Context context, DialogInterfaceC0666h dialogInterfaceC0666h, Window window) {
        this.f2665a = context;
        this.f2666b = dialogInterfaceC0666h;
        this.f2667c = window;
        HandlerC0663e handlerC0663e = new HandlerC0663e();
        handlerC0663e.f2658a = new WeakReference(dialogInterfaceC0666h);
        this.f2663E = handlerC0663e;
        TypedArray typedArrayM5055 = C1175.m5055(context, null, C1179.m5235(), R.attr.resc, 0);
        this.f2690z = C1174.m5032(typedArrayM5055, 0, 0);
        C1174.m5032(typedArrayM5055, 2, 0);
        this.f2659A = C1174.m5032(typedArrayM5055, 4, 0);
        C1174.m5032(typedArrayM5055, 5, 0);
        this.f2660B = C1174.m5032(typedArrayM5055, 7, 0);
        this.f2661C = C1174.m5032(typedArrayM5055, 3, 0);
        this.f2662D = C1168.m4774(typedArrayM5055, 6, true);
        C1128.m3068(typedArrayM5055, 1, 0);
        C1151.m4006(typedArrayM5055);
        C1168.m4794(C1126.m2970(dialogInterfaceC0666h), 1);
    }

    /* JADX INFO: renamed from: a */
    public static native boolean m1884a(View view);

    /* JADX INFO: renamed from: b */
    public static native void m1885b(View view, View view2, View view3);

    /* JADX INFO: renamed from: c */
    public static native ViewGroup m1886c(View view, View view2);

    /* JADX INFO: renamed from: ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static native short[] m4376();

    /* JADX INFO: renamed from: d */
    public final native void m1887d(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener);
}
