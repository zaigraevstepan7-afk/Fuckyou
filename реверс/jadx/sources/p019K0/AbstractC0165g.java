package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.helper.widget.C1146;
import androidx.lifecycle.C1147;
import androidx.startup.C1149;
import androidx.versionedparcelable.C1150;
import com.google.android.material.appbar.C1153;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.internal.C1156;
import com.google.android.material.slider.Slider;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.List;
import p001A0.C1121;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p015I0.C0112h;
import p015I0.C1125;
import p018K.RunnableC0145a;
import p023M0.C1127;
import p024N.C1128;
import p025N0.C1129;
import p025N0.C1131;
import p026O.C1132;
import p029P0.C0325b;
import p029P0.C1133;
import p032R.C1134;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p041V0.C1138;
import p042W.C1139;
import p044X.C1140;
import p045X0.C1141;
import p050a0.C1142;
import p050a0.C1143;
import p051a1.C1145;
import p052b0.C1151;
import p052b0.C1152;
import p065g.C1159;
import p066g0.C1161;
import p070i0.C1163;
import p075l0.C1168;
import p077m0.C1169;
import p083p0.C1171;
import p086r.C1174;
import p089t.C1175;
import p092u0.C1176;
import p096w0.C1177;
import p097x.C1178;
import p098x0.C1179;

/* JADX INFO: renamed from: K0.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0165g extends View {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4832short = null;

    /* JADX INFO: renamed from: A */
    public int f509A;

    /* JADX INFO: renamed from: B */
    public int f510B;

    /* JADX INFO: renamed from: C */
    public int f511C;

    /* JADX INFO: renamed from: D */
    public int f512D;

    /* JADX INFO: renamed from: E */
    public int f513E;

    /* JADX INFO: renamed from: F */
    public int f514F;

    /* JADX INFO: renamed from: G */
    public int f515G;

    /* JADX INFO: renamed from: H */
    public int f516H;

    /* JADX INFO: renamed from: I */
    public int f517I;

    /* JADX INFO: renamed from: J */
    public int f518J;

    /* JADX INFO: renamed from: K */
    public int f519K;

    /* JADX INFO: renamed from: L */
    public int f520L;

    /* JADX INFO: renamed from: M */
    public final int f521M;

    /* JADX INFO: renamed from: N */
    public float f522N;

    /* JADX INFO: renamed from: O */
    public MotionEvent f523O;

    /* JADX INFO: renamed from: P */
    public boolean f524P;

    /* JADX INFO: renamed from: Q */
    public float f525Q;

    /* JADX INFO: renamed from: R */
    public float f526R;

    /* JADX INFO: renamed from: S */
    public ArrayList f527S;

    /* JADX INFO: renamed from: T */
    public int f528T;

    /* JADX INFO: renamed from: U */
    public int f529U;

    /* JADX INFO: renamed from: V */
    public float f530V;

    /* JADX INFO: renamed from: W */
    public float[] f531W;

    /* JADX INFO: renamed from: a */
    public final Paint f532a;

    /* JADX INFO: renamed from: a0 */
    public boolean f533a0;

    /* JADX INFO: renamed from: b */
    public final Paint f534b;

    /* JADX INFO: renamed from: b0 */
    public int f535b0;

    /* JADX INFO: renamed from: c */
    public final Paint f536c;

    /* JADX INFO: renamed from: c0 */
    public int f537c0;

    /* JADX INFO: renamed from: d */
    public final Paint f538d;

    /* JADX INFO: renamed from: d0 */
    public int f539d0;

    /* JADX INFO: renamed from: e */
    public final Paint f540e;

    /* JADX INFO: renamed from: e0 */
    public boolean f541e0;

    /* JADX INFO: renamed from: f */
    public final Paint f542f;

    /* JADX INFO: renamed from: f0 */
    public boolean f543f0;

    /* JADX INFO: renamed from: g */
    public final Paint f544g;

    /* JADX INFO: renamed from: g0 */
    public ColorStateList f545g0;

    /* JADX INFO: renamed from: h */
    public final C0162d f546h;

    /* JADX INFO: renamed from: h0 */
    public ColorStateList f547h0;

    /* JADX INFO: renamed from: i */
    public final AccessibilityManager f548i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f549i0;

    /* JADX INFO: renamed from: j */
    public RunnableC0145a f550j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f551j0;

    /* JADX INFO: renamed from: k */
    public final int f552k;

    /* JADX INFO: renamed from: k0 */
    public ColorStateList f553k0;

    /* JADX INFO: renamed from: l */
    public final ArrayList f554l;

    /* JADX INFO: renamed from: l0 */
    public final Path f555l0;

    /* JADX INFO: renamed from: m */
    public final ArrayList f556m;

    /* JADX INFO: renamed from: m0 */
    public final RectF f557m0;

    /* JADX INFO: renamed from: n */
    public final ArrayList f558n;

    /* JADX INFO: renamed from: n0 */
    public final RectF f559n0;

    /* JADX INFO: renamed from: o */
    public boolean f560o;

    /* JADX INFO: renamed from: o0 */
    public final C0112h f561o0;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f562p;

    /* JADX INFO: renamed from: p0 */
    public Drawable f563p0;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f564q;

    /* JADX INFO: renamed from: q0 */
    public List f565q0;

    /* JADX INFO: renamed from: r */
    public final int f566r;

    /* JADX INFO: renamed from: r0 */
    public float f567r0;

    /* JADX INFO: renamed from: s */
    public final int f568s;

    /* JADX INFO: renamed from: s0 */
    public int f569s0;

    /* JADX INFO: renamed from: t */
    public final int f570t;

    /* JADX INFO: renamed from: t0 */
    public final ViewTreeObserverOnScrollChangedListenerC0159a f571t0;

    /* JADX INFO: renamed from: u */
    public final int f572u;

    /* JADX INFO: renamed from: v */
    public final int f573v;

    /* JADX INFO: renamed from: w */
    public final int f574w;

    /* JADX INFO: renamed from: x */
    public final int f575x;

    /* JADX INFO: renamed from: y */
    public final int f576y;

    /* JADX INFO: renamed from: z */
    public final int f577z;

    static {
        ZLoader.registerNativesForClass(18, AbstractC0165g.class);
        Hidden0.special_clinit_18_00(AbstractC0165g.class);
    }

    public AbstractC0165g(Context context, AttributeSet attributeSet) {
        super(C1168.m4769(context, attributeSet, R.attr.resc, R.style.resc), attributeSet, R.attr.resc);
        this.f554l = new ArrayList();
        this.f556m = new ArrayList();
        this.f558n = new ArrayList();
        this.f560o = false;
        this.f517I = -1;
        this.f518J = -1;
        this.f524P = false;
        this.f527S = new ArrayList();
        this.f528T = -1;
        this.f529U = -1;
        this.f530V = 0.0f;
        this.f533a0 = true;
        this.f541e0 = false;
        this.f555l0 = new Path();
        this.f557m0 = new RectF();
        this.f559n0 = new RectF();
        C0112h c0112h = new C0112h();
        this.f561o0 = c0112h;
        this.f565q0 = C1152.m4025();
        this.f569s0 = 0;
        Slider slider = (Slider) this;
        this.f571t0 = new ViewTreeObserverOnScrollChangedListenerC0159a(slider);
        Context contextM3855 = C1146.m3855(this);
        this.f532a = new Paint();
        this.f534b = new Paint();
        Paint paint = new Paint(1);
        this.f536c = paint;
        Paint.Style styleM4398 = C1159.m4398();
        C1135.m3368(paint, styleM4398);
        C1178.m5165(paint, new PorterDuffXfermode(C1128.m3072()));
        Paint paint2 = new Paint(1);
        this.f538d = paint2;
        C1135.m3368(paint2, styleM4398);
        Paint paint3 = new Paint();
        this.f540e = paint3;
        Paint.Style styleM3862 = C1146.m3862();
        C1135.m3368(paint3, styleM3862);
        Paint.Cap capM3665 = C1142.m3665();
        C1149.m3932(paint3, capM3665);
        Paint paint4 = new Paint();
        this.f542f = paint4;
        C1135.m3368(paint4, styleM3862);
        C1149.m3932(paint4, capM3665);
        Paint paint5 = new Paint();
        this.f544g = paint5;
        C1135.m3368(paint5, styleM4398);
        C1149.m3932(paint5, capM3665);
        Resources resourcesM3012 = C1127.m3012(contextM3855);
        this.f577z = C1121.m2805(resourcesM3012, R.dimen.resc);
        int iM3101 = C1129.m3101(resourcesM3012, R.dimen.resc);
        this.f568s = iM3101;
        this.f512D = iM3101;
        this.f570t = C1121.m2805(resourcesM3012, R.dimen.resc);
        this.f572u = C1121.m2805(resourcesM3012, R.dimen.resc);
        this.f573v = C1121.m2805(resourcesM3012, R.dimen.resc);
        this.f574w = C1121.m2805(resourcesM3012, R.dimen.resc);
        this.f575x = C1121.m2805(resourcesM3012, R.dimen.resc);
        this.f521M = C1121.m2805(resourcesM3012, R.dimen.resc);
        int[] iArrM4216 = C1156.m4216();
        C1122.m2827(contextM3855, attributeSet, R.attr.resc, R.style.resc);
        C1153.m4086(contextM3855, attributeSet, iArrM4216, R.attr.resc, R.style.resc, new int[0]);
        TypedArray typedArrayM5055 = C1175.m5055(contextM3855, attributeSet, iArrM4216, R.attr.resc, R.style.resc);
        this.f552k = C1174.m5032(typedArrayM5055, 8, R.style.resc);
        this.f525Q = C1124.m2884(typedArrayM5055, 3, 0.0f);
        this.f526R = C1124.m2884(typedArrayM5055, 4, 1.0f);
        C1176.m5096(this, new Float[]{C1141.m3633(C1155.m4180(this))});
        this.f530V = C1124.m2884(typedArrayM5055, 2, 0.0f);
        this.f576y = (int) C1163.m4600(C1146.m3829(typedArrayM5055, 9, (float) C1163.m4600(C1125.m2923(C1146.m3855(this), 48))));
        boolean zM4187 = C1155.m4187(typedArrayM5055, 24);
        int i2 = zM4187 ? 24 : 26;
        int i3 = zM4187 ? 24 : 25;
        ColorStateList colorStateListM2831 = C1122.m2831(contextM3855, typedArrayM5055, i2);
        C1134.m3325(this, colorStateListM2831 == null ? C1143.m3689(contextM3855, R.color.resc) : colorStateListM2831);
        ColorStateList colorStateListM28312 = C1122.m2831(contextM3855, typedArrayM5055, i3);
        C1131.m3173(this, colorStateListM28312 == null ? C1143.m3689(contextM3855, R.color.resc) : colorStateListM28312);
        C1150.m3953(c0112h, C1122.m2831(contextM3855, typedArrayM5055, 10));
        if (C1155.m4187(typedArrayM5055, 14)) {
            C1150.m3965(this, C1122.m2831(contextM3855, typedArrayM5055, 14));
        }
        C1171.m4911(this, C1146.m3829(typedArrayM5055, 15, 0.0f));
        ColorStateList colorStateListM28313 = C1122.m2831(contextM3855, typedArrayM5055, 5);
        C1147.m3871(this, colorStateListM28313 == null ? C1143.m3689(contextM3855, R.color.resc) : colorStateListM28313);
        this.f533a0 = C1168.m4774(typedArrayM5055, 23, true);
        boolean zM41872 = C1155.m4187(typedArrayM5055, 18);
        int i4 = zM41872 ? 18 : 20;
        int i5 = zM41872 ? 18 : 19;
        ColorStateList colorStateListM28314 = C1122.m2831(contextM3855, typedArrayM5055, i4);
        C1131.m3192(this, colorStateListM28314 == null ? C1143.m3689(contextM3855, R.color.resc) : colorStateListM28314);
        ColorStateList colorStateListM28315 = C1122.m2831(contextM3855, typedArrayM5055, i5);
        C1128.m3091(this, colorStateListM28315 == null ? C1143.m3689(contextM3855, R.color.resc) : colorStateListM28315);
        C1169.m4810(this, C1128.m3068(typedArrayM5055, 16, 0));
        C1145.m3822(this, C1128.m3068(typedArrayM5055, 29, 0));
        C1140.m3569(this, C1128.m3068(typedArrayM5055, 28, 0));
        int iM3068 = C1128.m3068(typedArrayM5055, 13, 0) * 2;
        int iM30682 = C1128.m3068(typedArrayM5055, 17, iM3068);
        int iM30683 = C1128.m3068(typedArrayM5055, 12, iM3068);
        C1139.m3554(this, iM30682);
        C1133.m3242(this, iM30683);
        C1152.m4046(this, C1128.m3068(typedArrayM5055, 6, 0));
        C1136.m3375(this, C1146.m3829(typedArrayM5055, 11, 0.0f));
        C1138.m3482(this, C1128.m3068(typedArrayM5055, 27, 0));
        C1161.m4494(this, C1128.m3068(typedArrayM5055, 21, C1137.m3420(this) / 2));
        C1132.m3231(this, C1128.m3068(typedArrayM5055, 22, C1137.m3420(this) / 2));
        C1179.m5210(this, C1123.m2853(typedArrayM5055, 7, 0));
        if (!C1168.m4774(typedArrayM5055, 0, true)) {
            C1179.m5218(this, false);
        }
        C1151.m4006(typedArrayM5055);
        C1121.m2801(this, true);
        C1143.m3706(this, true);
        C1155.m4183(c0112h);
        this.f566r = C1124.m2892(C1177.m5135(contextM3855));
        C0162d c0162d = new C0162d(slider);
        this.f546h = c0162d;
        C1125.m2951(this, c0162d);
        this.f548i = (AccessibilityManager) C1137.m3427(C1146.m3855(this), C1142.m3684(m2961(), 0, 13, 2328));
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static native int m2960(Object obj);

    /* JADX INFO: renamed from: ۦۥۡۦ, reason: contains not printable characters */
    public static native short[] m2961();

    /* JADX INFO: renamed from: A */
    public final native boolean m574A(float f);

    /* JADX INFO: renamed from: B */
    public final native float m575B(float f);

    /* JADX INFO: renamed from: a */
    public final native void m576a(Drawable drawable);

    /* JADX INFO: renamed from: b */
    public final native int m577b();

    /* JADX INFO: renamed from: c */
    public final native ValueAnimator m578c(boolean z2);

    /* JADX INFO: renamed from: d */
    public final native void m579d(Canvas canvas, int i2, int i3, float f, Drawable drawable);

    @Override // android.view.View
    public final native boolean dispatchHoverEvent(MotionEvent motionEvent);

    @Override // android.view.View
    public final native void drawableStateChanged();

    /* JADX INFO: renamed from: e */
    public final native void m580e();

    /* JADX INFO: renamed from: f */
    public final native void m581f();

    /* JADX INFO: renamed from: g */
    public final native float[] m582g();

    public final native int getAccessibilityFocusedVirtualViewId();

    public native float getMinSeparation();

    public abstract int getThumbRadius();

    public native List<Float> getValues();

    /* JADX INFO: renamed from: h */
    public final native int m583h(ColorStateList colorStateList);

    /* JADX INFO: renamed from: i */
    public final native boolean m584i(double d2);

    /* JADX INFO: renamed from: j */
    public final native boolean m585j(MotionEvent motionEvent);

    /* JADX INFO: renamed from: k */
    public final native boolean m586k();

    /* JADX INFO: renamed from: l */
    public final native void m587l();

    /* JADX INFO: renamed from: m */
    public final native boolean m588m(int i2);

    /* JADX INFO: renamed from: n */
    public final native void m589n(int i2);

    /* JADX INFO: renamed from: o */
    public final native float m590o(float f);

    @Override // android.view.View
    public final native void onAttachedToWindow();

    @Override // android.view.View
    public final native void onDetachedFromWindow();

    @Override // android.view.View
    public final native void onDraw(Canvas canvas);

    @Override // android.view.View
    public final native void onFocusChanged(boolean z2, int i2, Rect rect);

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final native boolean onKeyDown(int i2, KeyEvent keyEvent);

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final native boolean onKeyUp(int i2, KeyEvent keyEvent);

    @Override // android.view.View
    public final native void onMeasure(int i2, int i3);

    @Override // android.view.View
    public final native void onRestoreInstanceState(Parcelable parcelable);

    @Override // android.view.View
    public final native Parcelable onSaveInstanceState();

    @Override // android.view.View
    public final native void onSizeChanged(int i2, int i3, int i4, int i5);

    @Override // android.view.View
    public final native boolean onTouchEvent(MotionEvent motionEvent);

    @Override // android.view.View
    public final native void onVisibilityChanged(View view, int i2);

    /* JADX INFO: renamed from: p */
    public final native void m591p();

    /* JADX INFO: renamed from: q */
    public final native void m592q(C0325b c0325b, float f);

    /* JADX INFO: renamed from: r */
    public final native void m593r(ArrayList arrayList);

    /* JADX INFO: renamed from: s */
    public final native boolean m594s(int i2, float f);

    public native void setActiveThumbIndex(int i2);

    public native void setCustomThumbDrawablesForValues(int... iArr);

    public native void setCustomThumbDrawablesForValues(Drawable... drawableArr);

    @Override // android.view.View
    public native void setEnabled(boolean z2);

    public abstract void setHaloRadius(int i2);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i2);

    public native void setSeparationUnit(int i2);

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i2);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i2);

    public abstract void setThumbWidth(int i2);

    public abstract void setTickActiveRadius(int i2);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i2);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i2);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i2);

    public abstract void setTrackStopIndicatorSize(int i2);

    public native void setValues(List<Float> list);

    public native void setValues(Float... fArr);

    /* JADX INFO: renamed from: t */
    public final native void m595t();

    /* JADX INFO: renamed from: u */
    public final native void m596u(int i2, Rect rect);

    /* JADX INFO: renamed from: v */
    public final native void m597v();

    /* JADX INFO: renamed from: w */
    public final native void m598w();

    /* JADX INFO: renamed from: x */
    public final native void m599x(Canvas canvas, Paint paint, RectF rectF, int i2);

    /* JADX INFO: renamed from: y */
    public final native void m600y();

    /* JADX INFO: renamed from: z */
    public final native void m601z();
}
