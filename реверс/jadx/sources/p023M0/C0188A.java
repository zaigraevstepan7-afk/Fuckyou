package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import com.google.android.material.bottomsheet.C1154;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.R;
import p001A0.C1121;
import p011G.C1123;
import p015I0.C1125;
import p024N.C0270l;
import p024N.C1128;
import p026O.C1132;
import p029P0.C1133;
import p032R.C1134;
import p037T0.C1136;
import p042W.C1139;
import p044X.C1140;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1152;
import p058d0.C1158;
import p065g.C1159;
import p066g0.C1160;
import p066g0.C1161;
import p070i0.C1163;
import p072k.C1165;
import p073k0.C1166;
import p074l.C0927e0;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p084q.C1173;
import p086r.C1174;
import p100z.C1180;

/* JADX INFO: renamed from: M0.A */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0188A extends LinearLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4834short = null;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f618a;

    /* JADX INFO: renamed from: b */
    public final C0927e0 f619b;

    /* JADX INFO: renamed from: c */
    public CharSequence f620c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f621d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f622e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f623f;

    /* JADX INFO: renamed from: g */
    public int f624g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f625h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f626i;

    /* JADX INFO: renamed from: j */
    public boolean f627j;

    static {
        ZLoader.registerNativesForClass(20, C0188A.class);
        Hidden0.special_clinit_20_00(C0188A.class);
    }

    public C0188A(TextInputLayout textInputLayout, C0270l c0270l) {
        CharSequence charSequenceM3906;
        super(C1146.m3855(textInputLayout));
        this.f618a = textInputLayout;
        C1149.m3947(this, 8);
        C1158.m4363(this, 0);
        C1149.m3938(this, new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) C1140.m3583(C1152.m4045(C1146.m3855(this)), R.layout.resc, this, false);
        this.f621d = checkableImageButton;
        if (C1132.m3237() <= 22) {
            Context contextM3855 = C1146.m3855(checkableImageButton);
            int iM2923 = (int) C1125.m2923(C1146.m3855(checkableImageButton), 4);
            C1160.m2123();
            C1180.m5244(checkableImageButton, C1136.m3409(contextM3855, iM2923));
        }
        C0927e0 c0927e0 = new C0927e0(C1146.m3855(this), null);
        this.f619b = c0927e0;
        if (C1140.m3567(C1146.m3855(this))) {
            C1165.m4667((ViewGroup.MarginLayoutParams) C1170.m4888(checkableImageButton), 0);
        }
        View.OnLongClickListener onLongClickListenerM4559 = C1163.m4559(this);
        C1136.m3382(checkableImageButton, null);
        C1154.m4135(checkableImageButton, onLongClickListenerM4559);
        this.f626i = null;
        C1133.m3252(checkableImageButton, null);
        C1154.m4135(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) C1123.m2846(c0270l);
        if (C1155.m4187(typedArray, 69)) {
            this.f622e = C1160.m4449(C1146.m3855(this), c0270l, 69);
        }
        if (C1155.m4187(typedArray, 70)) {
            this.f623f = C1145.m3794(C1123.m2853(typedArray, 70, -1), null);
        }
        if (C1155.m4187(typedArray, 66)) {
            C1170.m4896(this, C1149.m3934(c0270l, 66));
            if (C1155.m4187(typedArray, 65) && C1142.m3651(checkableImageButton) != (charSequenceM3906 = C1147.m3906(typedArray, 65))) {
                C1169.m4825(checkableImageButton, charSequenceM3906);
            }
            C1166.m4690(checkableImageButton, C1168.m4774(typedArray, 64, true));
        }
        int iM3068 = C1128.m3068(typedArray, 67, C1121.m2805(C1173.m4972(this), R.dimen.resc));
        if (iM3068 < 0) {
            throw new IllegalArgumentException(C1134.m3299(m3000(), 0, 35, 1384));
        }
        if (iM3068 != C1161.m4503(this)) {
            this.f624g = iM3068;
            C1155.m4184(checkableImageButton, iM3068);
            C1152.m4033(checkableImageButton, iM3068);
        }
        if (C1155.m4187(typedArray, 68)) {
            ImageView.ScaleType scaleTypeM4977 = C1173.m4977(C1123.m2853(typedArray, 68, -1));
            this.f625h = scaleTypeM4977;
            C1157.m4237(checkableImageButton, scaleTypeM4977);
        }
        C1149.m3947(c0927e0, 8);
        C1127.m3038(c0927e0, R.id.resc);
        C1149.m3938(c0927e0, new LinearLayout.LayoutParams(-2, -2));
        C1155.m4162();
        C1139.m3555(c0927e0, 1);
        C1168.m4759(c0927e0, C1174.m5032(typedArray, 60, 0));
        if (C1155.m4187(typedArray, 61)) {
            C1159.m4419(c0927e0, C1159.m4403(c0270l, 61));
        }
        CharSequence charSequenceM39062 = C1147.m3906(typedArray, 59);
        this.f620c = C1132.m3235(charSequenceM39062) ? null : charSequenceM39062;
        C1127.m3023(c0927e0, charSequenceM39062);
        C1143.m3694(this);
        C1163.m4595(this, checkableImageButton);
        C1163.m4595(this, c0927e0);
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static native short[] m3000();

    /* JADX INFO: renamed from: a */
    public final native int m625a();

    /* JADX INFO: renamed from: b */
    public final native void m626b(Drawable drawable);

    /* JADX INFO: renamed from: c */
    public final native void m627c(boolean z2);

    /* JADX INFO: renamed from: d */
    public final native void m628d();

    /* JADX INFO: renamed from: e */
    public final native void m629e();

    @Override // android.widget.LinearLayout, android.view.View
    public final native void onMeasure(int i2, int i3);
}
