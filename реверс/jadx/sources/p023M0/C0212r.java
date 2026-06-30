package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import com.google.android.material.appbar.C1153;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.R;
import java.util.LinkedHashSet;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p024N.C0270l;
import p024N.C1128;
import p025N0.C1130;
import p026O.C1132;
import p037T0.C1136;
import p038U.C1137;
import p042W.C1139;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C1158;
import p065g.C1159;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1163;
import p073k0.C1166;
import p073k0.C1167;
import p074l.C0927e0;
import p075l0.C1168;
import p077m0.C1169;
import p084q.C1173;
import p086r.C1174;
import p089t.C1175;

/* JADX INFO: renamed from: M0.r */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0212r extends LinearLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4840short = null;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f685a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f686b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f687c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f688d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f689e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f690f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f691g;

    /* JADX INFO: renamed from: h */
    public final C0211q f692h;

    /* JADX INFO: renamed from: i */
    public int f693i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f694j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f695k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f696l;

    /* JADX INFO: renamed from: m */
    public int f697m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f698n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f699o;

    /* JADX INFO: renamed from: p */
    public CharSequence f700p;

    /* JADX INFO: renamed from: q */
    public final C0927e0 f701q;

    /* JADX INFO: renamed from: r */
    public boolean f702r;

    /* JADX INFO: renamed from: s */
    public EditText f703s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f704t;

    /* JADX INFO: renamed from: u */
    public C0206l f705u;

    /* JADX INFO: renamed from: v */
    public final C0208n f706v;

    static {
        ZLoader.registerNativesForClass(45, C0212r.class);
        Hidden0.special_clinit_45_00(C0212r.class);
    }

    public C0212r(TextInputLayout textInputLayout, C0270l c0270l) {
        CharSequence charSequenceM3906;
        super(C1146.m3855(textInputLayout));
        this.f693i = 0;
        this.f694j = new LinkedHashSet();
        this.f706v = new C0208n(this);
        C0209o c0209o = new C0209o(this);
        this.f704t = (AccessibilityManager) C1137.m3427(C1146.m3855(this), C1136.m3404(m3007(), 0, 13, 3202));
        this.f685a = textInputLayout;
        C1149.m3947(this, 8);
        C1158.m4363(this, 0);
        C1149.m3938(this, new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(C1146.m3855(this));
        this.f686b = frameLayout;
        C1149.m3947(frameLayout, 8);
        C1149.m3938(frameLayout, new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterM4045 = C1152.m4045(C1146.m3855(this));
        CheckableImageButton checkableImageButtonM3169 = C1130.m3169(this, this, layoutInflaterM4045, R.id.resc);
        this.f687c = checkableImageButtonM3169;
        CheckableImageButton checkableImageButtonM31692 = C1130.m3169(this, frameLayout, layoutInflaterM4045, R.id.resc);
        this.f691g = checkableImageButtonM31692;
        this.f692h = new C0211q(this, c0270l);
        C0927e0 c0927e0 = new C0927e0(C1146.m3855(this), null);
        this.f701q = c0927e0;
        TypedArray typedArray = (TypedArray) C1123.m2846(c0270l);
        if (C1155.m4187(typedArray, 38)) {
            this.f688d = C1160.m4449(C1146.m3855(this), c0270l, 38);
        }
        if (C1155.m4187(typedArray, 39)) {
            this.f689e = C1145.m3794(C1123.m2853(typedArray, 39, -1), null);
        }
        if (C1155.m4187(typedArray, 37)) {
            C1141.m3610(this, C1149.m3934(c0270l, 37));
        }
        C1169.m4825(checkableImageButtonM3169, C1161.m4504(C1173.m4972(this), R.string.resc));
        C1155.m4162();
        C1175.m5071(checkableImageButtonM3169, 2);
        C1143.m3706(checkableImageButtonM3169, false);
        C1136.m3374(checkableImageButtonM3169, false);
        C1121.m2801(checkableImageButtonM3169, false);
        if (!C1155.m4187(typedArray, 53)) {
            if (C1155.m4187(typedArray, 32)) {
                this.f695k = C1160.m4449(C1146.m3855(this), c0270l, 32);
            }
            if (C1155.m4187(typedArray, 33)) {
                this.f696l = C1145.m3794(C1123.m2853(typedArray, 33, -1), null);
            }
        }
        if (C1155.m4187(typedArray, 30)) {
            C1168.m4767(this, C1123.m2853(typedArray, 30, 0));
            if (C1155.m4187(typedArray, 27) && C1142.m3651(checkableImageButtonM31692) != (charSequenceM3906 = C1147.m3906(typedArray, 27))) {
                C1169.m4825(checkableImageButtonM31692, charSequenceM3906);
            }
            C1166.m4690(checkableImageButtonM31692, C1168.m4774(typedArray, 26, true));
        } else if (C1155.m4187(typedArray, 53)) {
            if (C1155.m4187(typedArray, 54)) {
                this.f695k = C1160.m4449(C1146.m3855(this), c0270l, 54);
            }
            if (C1155.m4187(typedArray, 55)) {
                this.f696l = C1145.m3794(C1123.m2853(typedArray, 55, -1), null);
            }
            C1168.m4767(this, C1168.m4774(typedArray, 53, false) ? 1 : 0);
            CharSequence charSequenceM39062 = C1147.m3906(typedArray, 51);
            if (C1142.m3651(checkableImageButtonM31692) != charSequenceM39062) {
                C1169.m4825(checkableImageButtonM31692, charSequenceM39062);
            }
        }
        int iM3068 = C1128.m3068(typedArray, 29, C1121.m2805(C1173.m4972(this), R.dimen.resc));
        if (iM3068 < 0) {
            throw new IllegalArgumentException(C1167.m4743(m3007(), 13, 33, 1786));
        }
        if (iM3068 != C1153.m4096(this)) {
            this.f697m = iM3068;
            C1155.m4184(checkableImageButtonM31692, iM3068);
            C1152.m4033(checkableImageButtonM31692, iM3068);
            C1155.m4184(checkableImageButtonM3169, iM3068);
            C1152.m4033(checkableImageButtonM3169, iM3068);
        }
        if (C1155.m4187(typedArray, 31)) {
            ImageView.ScaleType scaleTypeM4977 = C1173.m4977(C1123.m2853(typedArray, 31, -1));
            this.f698n = scaleTypeM4977;
            C1157.m4237(checkableImageButtonM31692, scaleTypeM4977);
            C1157.m4237(checkableImageButtonM3169, scaleTypeM4977);
        }
        C1149.m3947(c0927e0, 8);
        C1127.m3038(c0927e0, R.id.resc);
        C1149.m3938(c0927e0, new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C1139.m3555(c0927e0, 1);
        C1168.m4759(c0927e0, C1174.m5032(typedArray, 72, 0));
        if (C1155.m4187(typedArray, 73)) {
            C1159.m4419(c0927e0, C1159.m4403(c0270l, 73));
        }
        CharSequence charSequenceM39063 = C1147.m3906(typedArray, 71);
        this.f700p = C1132.m3235(charSequenceM39063) ? null : charSequenceM39063;
        C1127.m3023(c0927e0, charSequenceM39063);
        C1163.m4583(this);
        C1163.m4595(frameLayout, checkableImageButtonM31692);
        C1163.m4595(this, c0927e0);
        C1163.m4595(this, frameLayout);
        C1163.m4595(this, checkableImageButtonM3169);
        C1159.m4391(C1155.m4144(textInputLayout), c0209o);
        if (C1122.m2836(textInputLayout) != null) {
            C1132.m3220(c0209o, textInputLayout);
        }
        C1124.m2887(this, new ViewOnAttachStateChangeListenerC0210p(0, this));
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static native int m3006(Object obj);

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static native short[] m3007();

    /* JADX INFO: renamed from: a */
    public final native CheckableImageButton m659a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2);

    /* JADX INFO: renamed from: b */
    public final native AbstractC0213s m660b();

    /* JADX INFO: renamed from: c */
    public final native int m661c();

    /* JADX INFO: renamed from: d */
    public final native boolean m662d();

    /* JADX INFO: renamed from: e */
    public final native boolean m663e();

    /* JADX INFO: renamed from: f */
    public final native void m664f(boolean z2);

    /* JADX INFO: renamed from: g */
    public final native void m665g(int i2);

    /* JADX INFO: renamed from: h */
    public final native void m666h(boolean z2);

    /* JADX INFO: renamed from: i */
    public final native void m667i(Drawable drawable);

    /* JADX INFO: renamed from: j */
    public final native void m668j(AbstractC0213s abstractC0213s);

    /* JADX INFO: renamed from: k */
    public final native void m669k();

    /* JADX INFO: renamed from: l */
    public final native void m670l();

    /* JADX INFO: renamed from: m */
    public final native void m671m();

    /* JADX INFO: renamed from: n */
    public final native void m672n();
}
