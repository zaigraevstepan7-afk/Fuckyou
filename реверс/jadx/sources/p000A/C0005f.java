package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.versionedparcelable.C1150;
import com.google.android.material.appbar.C1153;
import com.google.android.material.datepicker.C1155;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p004C.C1122;
import p011G.C1123;
import p014H0.C1124;
import p023M0.C1127;
import p025N0.C1131;
import p026O.C1132;
import p032R.C1134;
import p037T0.C1135;
import p037T0.C1136;
import p038U.C1137;
import p044X.C1140;
import p051a1.C1144;
import p051a1.C1145;
import p052b0.C1151;
import p066g0.C1160;
import p073k0.C1167;
import p075l0.C1168;
import p077m0.C1169;
import p081o0.C1170;
import p086r.C1174;
import p097x.C1178;
import p098x0.C1179;
import p100z.C1180;

/* JADX INFO: renamed from: A.f */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0005f extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4822short = null;

    /* JADX INFO: renamed from: a */
    public AbstractC0002c f3a;

    /* JADX INFO: renamed from: b */
    public boolean f4b;

    /* JADX INFO: renamed from: c */
    public final int f5c;

    /* JADX INFO: renamed from: d */
    public final int f6d;

    /* JADX INFO: renamed from: e */
    public final int f7e;

    /* JADX INFO: renamed from: f */
    public final int f8f;

    /* JADX INFO: renamed from: g */
    public final int f9g;

    /* JADX INFO: renamed from: h */
    public int f10h;

    /* JADX INFO: renamed from: i */
    public int f11i;

    /* JADX INFO: renamed from: j */
    public int f12j;

    /* JADX INFO: renamed from: k */
    public View f13k;

    /* JADX INFO: renamed from: l */
    public View f14l;

    /* JADX INFO: renamed from: m */
    public boolean f15m;

    /* JADX INFO: renamed from: n */
    public boolean f16n;

    /* JADX INFO: renamed from: o */
    public final Rect f17o;

    static {
        ZLoader.registerNativesForClass(5, C0005f.class);
        Hidden0.special_clinit_5_00(C0005f.class);
    }

    public C0005f() {
        super(-2, -2);
        this.f4b = false;
        this.f5c = 0;
        this.f6d = 0;
        this.f7e = -1;
        this.f8f = -1;
        this.f9g = 0;
        this.f10h = 0;
        this.f17o = new Rect();
    }

    public C0005f(C0005f c0005f) {
        super((ViewGroup.MarginLayoutParams) c0005f);
        this.f4b = false;
        this.f5c = 0;
        this.f6d = 0;
        this.f7e = -1;
        this.f8f = -1;
        this.f9g = 0;
        this.f10h = 0;
        this.f17o = new Rect();
    }

    public C0005f(Context context, AttributeSet attributeSet) {
        AbstractC0002c abstractC0002c;
        super(context, attributeSet);
        this.f4b = false;
        this.f5c = 0;
        this.f6d = 0;
        this.f7e = -1;
        this.f8f = -1;
        this.f9g = 0;
        this.f10h = 0;
        this.f17o = new Rect();
        TypedArray typedArrayM3431 = C1137.m3431(context, attributeSet, C1150.m3958());
        this.f5c = C1144.m3760(typedArrayM3431, 0, 0);
        this.f8f = C1174.m5032(typedArrayM3431, 1, -1);
        this.f6d = C1144.m3760(typedArrayM3431, 2, 0);
        this.f7e = C1144.m3760(typedArrayM3431, 6, -1);
        this.f9g = C1123.m2853(typedArrayM3431, 5, 0);
        this.f10h = C1123.m2853(typedArrayM3431, 4, 0);
        boolean zM4187 = C1155.m4187(typedArrayM3431, 3);
        this.f4b = zM4187;
        if (zM4187) {
            String strM5042 = C1174.m5042(typedArrayM3431, 3);
            C1135.m3362();
            if (C1132.m3235(strM5042)) {
                abstractC0002c = null;
            } else {
                if (C1169.m4818(strM5042, C1178.m5202(m2760(), 0, 1, 2216))) {
                    StringBuilder sb = new StringBuilder();
                    C1180.m5245(sb, C1124.m2922(context));
                    C1180.m5245(sb, strM5042);
                    strM5042 = C1168.m4783(sb);
                } else if (C1167.m4719(strM5042, 46) < 0) {
                    String strM3362 = C1135.m3362();
                    if (!C1132.m3235(strM3362)) {
                        StringBuilder sb2 = new StringBuilder();
                        C1180.m5245(sb2, strM3362);
                        C1136.m3389(sb2, '.');
                        C1180.m5245(sb2, strM5042);
                        strM5042 = C1168.m4783(sb2);
                    }
                }
                try {
                    ThreadLocal threadLocalM3410 = C1136.m3410();
                    Object map = (Map) C1145.m3820(threadLocalM3410);
                    if (map == null) {
                        map = new HashMap();
                        C1122.m2823(threadLocalM3410, map);
                    }
                    Constructor constructorM3296 = (Constructor) C1160.m4468(map, strM5042);
                    if (constructorM3296 == null) {
                        constructorM3296 = C1134.m3296(C1137.m3433(strM5042, false, C1179.m5234(context)), C1127.m3027());
                        C1140.m3584(constructorM3296, true);
                        C1170.m4858(map, strM5042, constructorM3296);
                    }
                    abstractC0002c = (AbstractC0002c) C1179.m5237(constructorM3296, new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    StringBuilder sb3 = new StringBuilder(C1131.m3179(m2760(), 1, 36, 2165));
                    C1180.m5245(sb3, strM5042);
                    throw new RuntimeException(C1168.m4783(sb3), e2);
                }
            }
            this.f3a = abstractC0002c;
        }
        C1151.m4006(typedArrayM3431);
        AbstractC0002c abstractC0002cM4082 = C1153.m4082(this);
        if (abstractC0002cM4082 != null) {
            C1131.m3184(abstractC0002cM4082, this);
        }
    }

    public C0005f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4b = false;
        this.f5c = 0;
        this.f6d = 0;
        this.f7e = -1;
        this.f8f = -1;
        this.f9g = 0;
        this.f10h = 0;
        this.f17o = new Rect();
    }

    public C0005f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4b = false;
        this.f5c = 0;
        this.f6d = 0;
        this.f7e = -1;
        this.f8f = -1;
        this.f9g = 0;
        this.f10h = 0;
        this.f17o = new Rect();
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۣ, reason: not valid java name and contains not printable characters */
    public static native short[] m2760();

    /* JADX INFO: renamed from: a */
    public final native boolean m79a(int i2);
}
