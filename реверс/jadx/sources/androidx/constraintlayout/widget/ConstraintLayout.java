package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.C0617l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p005C0.C0048n;
import p024N.C0270l;
import p089t.C1046c;
import p093v.AbstractC1068i;
import p093v.AbstractC1069j;
import p093v.C1060a;
import p093v.C1063d;
import p093v.C1064e;
import p093v.C1066g;
import p093v.C1067h;
import p095w.AbstractC1089o;
import p095w.C1077c;
import p095w.C1079e;
import p095w.C1083i;
import p095w.C1085k;
import p095w.C1087m;
import p099y.AbstractC1100c;
import p099y.AbstractC1101d;
import p099y.AbstractC1112o;
import p099y.AbstractC1115r;
import p099y.C1102e;
import p099y.C1103f;
import p099y.C1104g;
import p099y.C1111n;
import p099y.C1113p;
import p099y.C1116s;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: p */
    public static C1116s f1419p;

    /* JADX INFO: renamed from: a */
    public final SparseArray f1420a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1421b;

    /* JADX INFO: renamed from: c */
    public final C1064e f1422c;

    /* JADX INFO: renamed from: d */
    public int f1423d;

    /* JADX INFO: renamed from: e */
    public int f1424e;

    /* JADX INFO: renamed from: f */
    public int f1425f;

    /* JADX INFO: renamed from: g */
    public int f1426g;

    /* JADX INFO: renamed from: h */
    public boolean f1427h;

    /* JADX INFO: renamed from: i */
    public int f1428i;

    /* JADX INFO: renamed from: j */
    public C1111n f1429j;

    /* JADX INFO: renamed from: k */
    public C0048n f1430k;

    /* JADX INFO: renamed from: l */
    public int f1431l;

    /* JADX INFO: renamed from: m */
    public HashMap f1432m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f1433n;

    /* JADX INFO: renamed from: o */
    public final C1103f f1434o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1420a = new SparseArray();
        this.f1421b = new ArrayList(4);
        this.f1422c = new C1064e();
        this.f1423d = 0;
        this.f1424e = 0;
        this.f1425f = Integer.MAX_VALUE;
        this.f1426g = Integer.MAX_VALUE;
        this.f1427h = true;
        this.f1428i = 257;
        this.f1429j = null;
        this.f1430k = null;
        this.f1431l = -1;
        this.f1432m = new HashMap();
        this.f1433n = new SparseArray();
        this.f1434o = new C1103f(this, this);
        m1245i(attributeSet, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C1102e m1243g() {
        C1102e c1102e = new C1102e(-2, -2);
        c1102e.f4625a = -1;
        c1102e.f4627b = -1;
        c1102e.f4629c = -1.0f;
        c1102e.f4631d = true;
        c1102e.f4633e = -1;
        c1102e.f4635f = -1;
        c1102e.f4637g = -1;
        c1102e.f4639h = -1;
        c1102e.f4641i = -1;
        c1102e.f4643j = -1;
        c1102e.f4645k = -1;
        c1102e.f4647l = -1;
        c1102e.f4649m = -1;
        c1102e.f4651n = -1;
        c1102e.f4653o = -1;
        c1102e.f4655p = -1;
        c1102e.f4657q = 0;
        c1102e.f4658r = 0.0f;
        c1102e.f4659s = -1;
        c1102e.f4660t = -1;
        c1102e.f4661u = -1;
        c1102e.f4662v = -1;
        c1102e.f4663w = Integer.MIN_VALUE;
        c1102e.f4664x = Integer.MIN_VALUE;
        c1102e.f4665y = Integer.MIN_VALUE;
        c1102e.f4666z = Integer.MIN_VALUE;
        c1102e.f4599A = Integer.MIN_VALUE;
        c1102e.f4600B = Integer.MIN_VALUE;
        c1102e.f4601C = Integer.MIN_VALUE;
        c1102e.f4602D = 0;
        c1102e.f4603E = 0.5f;
        c1102e.f4604F = 0.5f;
        c1102e.f4605G = null;
        c1102e.f4606H = -1.0f;
        c1102e.f4607I = -1.0f;
        c1102e.f4608J = 0;
        c1102e.f4609K = 0;
        c1102e.f4610L = 0;
        c1102e.f4611M = 0;
        c1102e.f4612N = 0;
        c1102e.f4613O = 0;
        c1102e.f4614P = 0;
        c1102e.f4615Q = 0;
        c1102e.f4616R = 1.0f;
        c1102e.f4617S = 1.0f;
        c1102e.f4618T = -1;
        c1102e.f4619U = -1;
        c1102e.f4620V = -1;
        c1102e.f4621W = false;
        c1102e.f4622X = false;
        c1102e.f4623Y = null;
        c1102e.f4624Z = 0;
        c1102e.f4626a0 = true;
        c1102e.f4628b0 = true;
        c1102e.f4630c0 = false;
        c1102e.f4632d0 = false;
        c1102e.f4634e0 = false;
        c1102e.f4636f0 = -1;
        c1102e.f4638g0 = -1;
        c1102e.f4640h0 = -1;
        c1102e.f4642i0 = -1;
        c1102e.f4644j0 = Integer.MIN_VALUE;
        c1102e.f4646k0 = Integer.MIN_VALUE;
        c1102e.f4648l0 = 0.5f;
        c1102e.f4656p0 = new C1063d();
        return c1102e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C1116s getSharedValues() {
        if (f1419p == null) {
            C1116s c1116s = new C1116s();
            new SparseIntArray();
            new HashMap();
            f1419p = c1116s;
        }
        return f1419p;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1102e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1421b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1100c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i7;
                        float f2 = i8;
                        float f3 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1427h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1243g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1102e c1102e = new C1102e(context, attributeSet);
        c1102e.f4625a = -1;
        c1102e.f4627b = -1;
        c1102e.f4629c = -1.0f;
        c1102e.f4631d = true;
        c1102e.f4633e = -1;
        c1102e.f4635f = -1;
        c1102e.f4637g = -1;
        c1102e.f4639h = -1;
        c1102e.f4641i = -1;
        c1102e.f4643j = -1;
        c1102e.f4645k = -1;
        c1102e.f4647l = -1;
        c1102e.f4649m = -1;
        c1102e.f4651n = -1;
        c1102e.f4653o = -1;
        c1102e.f4655p = -1;
        c1102e.f4657q = 0;
        c1102e.f4658r = 0.0f;
        c1102e.f4659s = -1;
        c1102e.f4660t = -1;
        c1102e.f4661u = -1;
        c1102e.f4662v = -1;
        c1102e.f4663w = Integer.MIN_VALUE;
        c1102e.f4664x = Integer.MIN_VALUE;
        c1102e.f4665y = Integer.MIN_VALUE;
        c1102e.f4666z = Integer.MIN_VALUE;
        c1102e.f4599A = Integer.MIN_VALUE;
        c1102e.f4600B = Integer.MIN_VALUE;
        c1102e.f4601C = Integer.MIN_VALUE;
        c1102e.f4602D = 0;
        c1102e.f4603E = 0.5f;
        c1102e.f4604F = 0.5f;
        c1102e.f4605G = null;
        c1102e.f4606H = -1.0f;
        c1102e.f4607I = -1.0f;
        c1102e.f4608J = 0;
        c1102e.f4609K = 0;
        c1102e.f4610L = 0;
        c1102e.f4611M = 0;
        c1102e.f4612N = 0;
        c1102e.f4613O = 0;
        c1102e.f4614P = 0;
        c1102e.f4615Q = 0;
        c1102e.f4616R = 1.0f;
        c1102e.f4617S = 1.0f;
        c1102e.f4618T = -1;
        c1102e.f4619U = -1;
        c1102e.f4620V = -1;
        c1102e.f4621W = false;
        c1102e.f4622X = false;
        c1102e.f4623Y = null;
        c1102e.f4624Z = 0;
        c1102e.f4626a0 = true;
        c1102e.f4628b0 = true;
        c1102e.f4630c0 = false;
        c1102e.f4632d0 = false;
        c1102e.f4634e0 = false;
        c1102e.f4636f0 = -1;
        c1102e.f4638g0 = -1;
        c1102e.f4640h0 = -1;
        c1102e.f4642i0 = -1;
        c1102e.f4644j0 = Integer.MIN_VALUE;
        c1102e.f4646k0 = Integer.MIN_VALUE;
        c1102e.f4648l0 = 0.5f;
        c1102e.f4656p0 = new C1063d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1115r.f4802b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC1101d.f4598a.get(index);
            switch (i3) {
                case 1:
                    c1102e.f4620V = typedArrayObtainStyledAttributes.getInt(index, c1102e.f4620V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4655p);
                    c1102e.f4655p = resourceId;
                    if (resourceId == -1) {
                        c1102e.f4655p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1102e.f4657q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4657q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4658r) % 360.0f;
                    c1102e.f4658r = f;
                    if (f < 0.0f) {
                        c1102e.f4658r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c1102e.f4625a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1102e.f4625a);
                    break;
                case 6:
                    c1102e.f4627b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1102e.f4627b);
                    break;
                case 7:
                    c1102e.f4629c = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4629c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4633e);
                    c1102e.f4633e = resourceId2;
                    if (resourceId2 == -1) {
                        c1102e.f4633e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4635f);
                    c1102e.f4635f = resourceId3;
                    if (resourceId3 == -1) {
                        c1102e.f4635f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4637g);
                    c1102e.f4637g = resourceId4;
                    if (resourceId4 == -1) {
                        c1102e.f4637g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4639h);
                    c1102e.f4639h = resourceId5;
                    if (resourceId5 == -1) {
                        c1102e.f4639h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4641i);
                    c1102e.f4641i = resourceId6;
                    if (resourceId6 == -1) {
                        c1102e.f4641i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4643j);
                    c1102e.f4643j = resourceId7;
                    if (resourceId7 == -1) {
                        c1102e.f4643j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4645k);
                    c1102e.f4645k = resourceId8;
                    if (resourceId8 == -1) {
                        c1102e.f4645k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4647l);
                    c1102e.f4647l = resourceId9;
                    if (resourceId9 == -1) {
                        c1102e.f4647l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4649m);
                    c1102e.f4649m = resourceId10;
                    if (resourceId10 == -1) {
                        c1102e.f4649m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4659s);
                    c1102e.f4659s = resourceId11;
                    if (resourceId11 == -1) {
                        c1102e.f4659s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4660t);
                    c1102e.f4660t = resourceId12;
                    if (resourceId12 == -1) {
                        c1102e.f4660t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4661u);
                    c1102e.f4661u = resourceId13;
                    if (resourceId13 == -1) {
                        c1102e.f4661u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4662v);
                    c1102e.f4662v = resourceId14;
                    if (resourceId14 == -1) {
                        c1102e.f4662v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1102e.f4663w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4663w);
                    break;
                case 22:
                    c1102e.f4664x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4664x);
                    break;
                case 23:
                    c1102e.f4665y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4665y);
                    break;
                case 24:
                    c1102e.f4666z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4666z);
                    break;
                case 25:
                    c1102e.f4599A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4599A);
                    break;
                case 26:
                    c1102e.f4600B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4600B);
                    break;
                case 27:
                    c1102e.f4621W = typedArrayObtainStyledAttributes.getBoolean(index, c1102e.f4621W);
                    break;
                case 28:
                    c1102e.f4622X = typedArrayObtainStyledAttributes.getBoolean(index, c1102e.f4622X);
                    break;
                case 29:
                    c1102e.f4603E = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4603E);
                    break;
                case 30:
                    c1102e.f4604F = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4604F);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1102e.f4610L = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1102e.f4611M = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c1102e.f4612N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4612N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1102e.f4612N) == -2) {
                            c1102e.f4612N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1102e.f4614P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4614P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1102e.f4614P) == -2) {
                            c1102e.f4614P = -2;
                        }
                    }
                    break;
                case 35:
                    c1102e.f4616R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4616R));
                    c1102e.f4610L = 2;
                    break;
                case 36:
                    try {
                        c1102e.f4613O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4613O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1102e.f4613O) == -2) {
                            c1102e.f4613O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1102e.f4615Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4615Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1102e.f4615Q) == -2) {
                            c1102e.f4615Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1102e.f4617S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4617S));
                    c1102e.f4611M = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            C1111n.m2755h(c1102e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1102e.f4606H = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4606H);
                            break;
                        case 46:
                            c1102e.f4607I = typedArrayObtainStyledAttributes.getFloat(index, c1102e.f4607I);
                            break;
                        case 47:
                            c1102e.f4608J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1102e.f4609K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1102e.f4618T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1102e.f4618T);
                            break;
                        case 50:
                            c1102e.f4619U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1102e.f4619U);
                            break;
                        case 51:
                            c1102e.f4623Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4651n);
                            c1102e.f4651n = resourceId15;
                            if (resourceId15 == -1) {
                                c1102e.f4651n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1102e.f4653o);
                            c1102e.f4653o = resourceId16;
                            if (resourceId16 == -1) {
                                c1102e.f4653o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1102e.f4602D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4602D);
                            break;
                        case 55:
                            c1102e.f4601C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1102e.f4601C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    C1111n.m2754g(c1102e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1111n.m2754g(c1102e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1102e.f4624Z = typedArrayObtainStyledAttributes.getInt(index, c1102e.f4624Z);
                                    break;
                                case 67:
                                    c1102e.f4631d = typedArrayObtainStyledAttributes.getBoolean(index, c1102e.f4631d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1102e.m2739a();
        return c1102e;
    }

    public int getMaxHeight() {
        return this.f1426g;
    }

    public int getMaxWidth() {
        return this.f1425f;
    }

    public int getMinHeight() {
        return this.f1424e;
    }

    public int getMinWidth() {
        return this.f1423d;
    }

    public int getOptimizationLevel() {
        return this.f1422c.f4344D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1064e c1064e = this.f1422c;
        if (c1064e.f4317j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1064e.f4317j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1064e.f4317j = "parent";
            }
        }
        if (c1064e.f4314h0 == null) {
            c1064e.f4314h0 = c1064e.f4317j;
            Log.v("ConstraintLayout", " setDebugName " + c1064e.f4314h0);
        }
        for (C1063d c1063d : c1064e.f4353q0) {
            View view = c1063d.f4310f0;
            if (view != null) {
                if (c1063d.f4317j == null && (id = view.getId()) != -1) {
                    c1063d.f4317j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1063d.f4314h0 == null) {
                    c1063d.f4314h0 = c1063d.f4317j;
                    Log.v("ConstraintLayout", " setDebugName " + c1063d.f4314h0);
                }
            }
        }
        c1064e.mo2616n(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final C1063d m1244h(View view) {
        if (view == this) {
            return this.f1422c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1102e) {
            return ((C1102e) view.getLayoutParams()).f4656p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1102e) {
            return ((C1102e) view.getLayoutParams()).f4656p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1245i(AttributeSet attributeSet, int i2) {
        C1064e c1064e = this.f1422c;
        c1064e.f4310f0 = this;
        C1103f c1103f = this.f1434o;
        c1064e.f4357u0 = c1103f;
        c1064e.f4355s0.f4451f = c1103f;
        this.f1420a.put(getId(), this);
        this.f1429j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1115r.f4802b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f1423d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1423d);
                } else if (index == 17) {
                    this.f1424e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1424e);
                } else if (index == 14) {
                    this.f1425f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1425f);
                } else if (index == 15) {
                    this.f1426g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1426g);
                } else if (index == 113) {
                    this.f1428i = typedArrayObtainStyledAttributes.getInt(index, this.f1428i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1246j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1430k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1111n c1111n = new C1111n();
                        this.f1429j = c1111n;
                        c1111n.m2758e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1429j = null;
                    }
                    this.f1431l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c1064e.f4344D0 = this.f1428i;
        C1046c.f4153q = c1064e.m2632W(512);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1246j(int i2) {
        int eventType;
        C0617l c0617l;
        Context context = getContext();
        C0048n c0048n = new C0048n(18, false);
        c0048n.f174b = new SparseArray();
        c0048n.f175c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            eventType = xml.getEventType();
            c0617l = null;
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e3);
        }
        while (true) {
            byte b = 1;
            if (eventType != 1) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 4;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b == 2) {
                        C0617l c0617l2 = new C0617l(context, xml);
                        ((SparseArray) c0048n.f174b).put(c0617l2.f2224b, c0617l2);
                        c0617l = c0617l2;
                    } else if (b == 3) {
                        C1104g c1104g = new C1104g(context, xml);
                        if (c0617l != null) {
                            ((ArrayList) c0617l.f2223a).add(c1104g);
                        }
                    } else if (b == 4) {
                        c0048n.m289G(context, xml);
                    }
                }
                eventType = xml.next();
            }
            this.f1430k = c0048n;
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb A[PHI: r2 r10
      0x01cb: PHI (r2v3 boolean) = (r2v2 boolean), (r2v43 boolean) binds: [B:63:0x0162, B:390:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r10v9 int) = (r10v8 int), (r10v27 int) binds: [B:63:0x0162, B:390:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1247k(C1064e c1064e, int i2, int i3, int i4) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i5;
        int iM2617q;
        C1079e c1079e;
        int i6;
        int i7;
        int i8;
        C0270l c0270l;
        boolean z2;
        boolean z3;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        int i11;
        boolean zM2630T;
        int size;
        ArrayList arrayList;
        int i12;
        boolean z6;
        boolean z7;
        C1085k c1085k;
        C1087m c1087m;
        int i13;
        int i14;
        int i15;
        ArrayList<AbstractC1089o> arrayList2;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z8;
        boolean z9;
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size3 = View.MeasureSpec.getSize(i4);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i19 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C1103f c1103f = this.f1434o;
        c1103f.f4668b = iMax3;
        c1103f.f4669c = iMax4;
        c1103f.f4670d = paddingWidth;
        c1103f.f4671e = i19;
        c1103f.f4672f = i3;
        c1103f.f4673g = i4;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i21 = size2 - paddingWidth;
        int i22 = size3 - i19;
        int i23 = c1103f.f4671e;
        int i24 = c1103f.f4670d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    iMin = Math.min(this.f1425f - i24, i21);
                    i20 = 1;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    if (mode2 != 0) {
                        if (mode2 == 1073741824) {
                            iMin2 = Math.min(this.f1426g - i23, i22);
                            i5 = 1;
                            iM2617q = c1064e.m2617q();
                            c1079e = c1064e.f4355s0;
                            i6 = iMin;
                            if (i6 != iM2617q || iMin2 != c1064e.m2613k()) {
                                c1079e.f4448c = true;
                            }
                            c1064e.f4297Y = 0;
                            c1064e.f4298Z = 0;
                            int i25 = this.f1425f - i24;
                            int[] iArr2 = c1064e.f4275C;
                            iArr2[0] = i25;
                            iArr2[1] = this.f1426g - i23;
                            c1064e.f4302b0 = 0;
                            c1064e.f4304c0 = 0;
                            c1064e.m2600M(i20);
                            c1064e.m2602O(i6);
                            c1064e.m2601N(i5);
                            c1064e.m2599L(iMin2);
                            i7 = this.f1423d - i24;
                            if (i7 < 0) {
                                c1064e.f4302b0 = 0;
                            } else {
                                c1064e.f4302b0 = i7;
                            }
                            i8 = this.f1424e - i23;
                            if (i8 < 0) {
                                c1064e.f4304c0 = 0;
                            } else {
                                c1064e.f4304c0 = i8;
                            }
                            c1064e.f4360x0 = iMax5;
                            c1064e.f4361y0 = iMax3;
                            c0270l = c1064e.f4354r0;
                            c0270l.getClass();
                            C1103f c1103f2 = c1064e.f4357u0;
                            int size4 = c1064e.f4353q0.size();
                            int iM2617q2 = c1064e.m2617q();
                            int iM2613k = c1064e.m2613k();
                            boolean zM2648c = AbstractC1069j.m2648c(i2, 128);
                            z2 = zM2648c || AbstractC1069j.m2648c(i2, 64);
                            if (z2) {
                                int i26 = 0;
                                while (i26 < size4) {
                                    C1063d c1063d = (C1063d) c1064e.f4353q0.get(i26);
                                    boolean z10 = z2;
                                    int[] iArr3 = c1063d.f4330p0;
                                    i9 = size4;
                                    boolean z11 = (iArr3[0] == 3) && (iArr3[1] == 3) && c1063d.f4295W > 0.0f;
                                    if ((c1063d.m2624x() && z11) || ((c1063d.m2625y() && z11) || (c1063d instanceof C1066g) || c1063d.m2624x() || c1063d.m2625y())) {
                                        i10 = 1073741824;
                                        z3 = false;
                                        break;
                                    } else {
                                        i26++;
                                        z2 = z10;
                                        size4 = i9;
                                    }
                                }
                                z3 = z2;
                                i9 = size4;
                                i10 = 1073741824;
                            } else {
                                z3 = z2;
                                i9 = size4;
                                i10 = 1073741824;
                            }
                            z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c);
                            if (z4) {
                                int iMin3 = Math.min(iArr2[0], i21);
                                int iMin4 = Math.min(iArr2[1], i22);
                                if (mode == 1073741824 && c1064e.m2617q() != iMin3) {
                                    c1064e.m2602O(iMin3);
                                    c1064e.f4355s0.f4447b = true;
                                }
                                if (mode2 == 1073741824 && c1064e.m2613k() != iMin4) {
                                    c1064e.m2599L(iMin4);
                                    c1064e.f4355s0.f4447b = true;
                                }
                                if (mode == 1073741824 && mode2 == 1073741824) {
                                    boolean z12 = c1079e.f4447b;
                                    C1064e c1064e2 = c1079e.f4446a;
                                    if (z12 || c1079e.f4448c) {
                                        for (C1063d c1063d2 : c1064e2.f4353q0) {
                                            c1063d2.m2610h();
                                            c1063d2.f4299a = false;
                                            c1063d2.f4305d.m2680n();
                                            c1063d2.f4307e.m2683m();
                                        }
                                        i15 = 0;
                                        c1064e2.m2610h();
                                        c1064e2.f4299a = false;
                                        c1064e2.f4305d.m2680n();
                                        c1064e2.f4307e.m2683m();
                                        c1079e.f4448c = false;
                                    } else {
                                        i15 = 0;
                                    }
                                    c1079e.m2659b(c1079e.f4449d);
                                    c1064e2.f4297Y = i15;
                                    c1064e2.f4298Z = i15;
                                    int iM2612j = c1064e2.m2612j(i15);
                                    int iM2612j2 = c1064e2.m2612j(1);
                                    if (c1079e.f4447b) {
                                        c1079e.m2660c();
                                    }
                                    int iM2618r = c1064e2.m2618r();
                                    int iM2619s = c1064e2.m2619s();
                                    c1064e2.f4305d.f4486h.mo2667d(iM2618r);
                                    c1064e2.f4307e.f4486h.mo2667d(iM2619s);
                                    c1079e.m2664g();
                                    ArrayList arrayList3 = c1079e.f4450e;
                                    z5 = z4;
                                    if (iM2612j == 2 || iM2612j2 == 2) {
                                        if (zM2648c) {
                                            Iterator it = arrayList3.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (!((AbstractC1089o) it.next()).mo2655k()) {
                                                        zM2648c = false;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (zM2648c && iM2612j == 2) {
                                            c1064e2.m2600M(1);
                                            arrayList2 = arrayList3;
                                            c1064e2.m2602O(c1079e.m2661d(c1064e2, 0));
                                            c1064e2.f4305d.f4483e.mo2667d(c1064e2.m2617q());
                                        } else {
                                            arrayList2 = arrayList3;
                                        }
                                        if (zM2648c && iM2612j2 == 2) {
                                            i16 = 1;
                                            c1064e2.m2601N(1);
                                            c1064e2.m2599L(c1079e.m2661d(c1064e2, 1));
                                            c1064e2.f4307e.f4483e.mo2667d(c1064e2.m2613k());
                                        }
                                        iArr = c1064e2.f4330p0;
                                        i17 = iArr[0];
                                        if (i17 != i16 || i17 == 4) {
                                            int iM2617q3 = c1064e2.m2617q() + iM2618r;
                                            c1064e2.f4305d.f4487i.mo2667d(iM2617q3);
                                            c1064e2.f4305d.f4483e.mo2667d(iM2617q3 - iM2618r);
                                            c1079e.m2664g();
                                            i18 = iArr[1];
                                            if (i18 != 1 || i18 == 4) {
                                                int iM2613k2 = c1064e2.m2613k() + iM2619s;
                                                c1064e2.f4307e.f4487i.mo2667d(iM2613k2);
                                                c1064e2.f4307e.f4483e.mo2667d(iM2613k2 - iM2619s);
                                            }
                                            c1079e.m2664g();
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        for (AbstractC1089o abstractC1089o : arrayList2) {
                                            if (abstractC1089o.f4480b != c1064e2 || abstractC1089o.f4485g) {
                                                abstractC1089o.mo2652e();
                                            }
                                        }
                                        for (AbstractC1089o abstractC1089o2 : arrayList2) {
                                            if (z8 || abstractC1089o2.f4480b != c1064e2) {
                                                if (!abstractC1089o2.f4486h.f4463j || ((!abstractC1089o2.f4487i.f4463j && !(abstractC1089o2 instanceof C1083i)) || (!abstractC1089o2.f4483e.f4463j && !(abstractC1089o2 instanceof C1077c) && !(abstractC1089o2 instanceof C1083i)))) {
                                                    z9 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z9 = true;
                                        c1064e2.m2600M(iM2612j);
                                        c1064e2.m2601N(iM2612j2);
                                        zM2630T = z9;
                                        i14 = 1073741824;
                                        i11 = 2;
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    i16 = 1;
                                    iArr = c1064e2.f4330p0;
                                    i17 = iArr[0];
                                    if (i17 != i16) {
                                        int iM2617q32 = c1064e2.m2617q() + iM2618r;
                                        c1064e2.f4305d.f4487i.mo2667d(iM2617q32);
                                        c1064e2.f4305d.f4483e.mo2667d(iM2617q32 - iM2618r);
                                        c1079e.m2664g();
                                        i18 = iArr[1];
                                        if (i18 != 1) {
                                            int iM2613k22 = c1064e2.m2613k() + iM2619s;
                                            c1064e2.f4307e.f4487i.mo2667d(iM2613k22);
                                            c1064e2.f4307e.f4483e.mo2667d(iM2613k22 - iM2619s);
                                            c1079e.m2664g();
                                            z8 = true;
                                            while (r2.hasNext()) {
                                            }
                                            while (r2.hasNext()) {
                                            }
                                            z9 = true;
                                            c1064e2.m2600M(iM2612j);
                                            c1064e2.m2601N(iM2612j2);
                                            zM2630T = z9;
                                            i14 = 1073741824;
                                            i11 = 2;
                                        }
                                    }
                                } else {
                                    z5 = z4;
                                    boolean z13 = c1079e.f4447b;
                                    C1064e c1064e3 = c1079e.f4446a;
                                    if (z13) {
                                        for (C1063d c1063d3 : c1064e3.f4353q0) {
                                            c1063d3.m2610h();
                                            c1063d3.f4299a = false;
                                            C1085k c1085k2 = c1063d3.f4305d;
                                            c1085k2.f4483e.f4463j = false;
                                            c1085k2.f4485g = false;
                                            c1085k2.m2680n();
                                            C1087m c1087m2 = c1063d3.f4307e;
                                            c1087m2.f4483e.f4463j = false;
                                            c1087m2.f4485g = false;
                                            c1087m2.m2683m();
                                        }
                                        i13 = 0;
                                        c1064e3.m2610h();
                                        c1064e3.f4299a = false;
                                        C1085k c1085k3 = c1064e3.f4305d;
                                        c1085k3.f4483e.f4463j = false;
                                        c1085k3.f4485g = false;
                                        c1085k3.m2680n();
                                        C1087m c1087m3 = c1064e3.f4307e;
                                        c1087m3.f4483e.f4463j = false;
                                        c1087m3.f4485g = false;
                                        c1087m3.m2683m();
                                        c1079e.m2660c();
                                    } else {
                                        i13 = 0;
                                    }
                                    c1079e.m2659b(c1079e.f4449d);
                                    c1064e3.f4297Y = i13;
                                    c1064e3.f4298Z = i13;
                                    c1064e3.f4305d.f4486h.mo2667d(i13);
                                    c1064e3.f4307e.f4486h.mo2667d(i13);
                                    i14 = 1073741824;
                                    if (mode == 1073741824) {
                                        zM2630T = c1064e.m2630T(i13, zM2648c);
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                        zM2630T = true;
                                    }
                                    if (mode2 == 1073741824) {
                                        zM2630T &= c1064e.m2630T(1, zM2648c);
                                        i11++;
                                    }
                                }
                                if (zM2630T) {
                                    c1064e.mo2603P(mode == i14, mode2 == i14);
                                }
                            } else {
                                z5 = z4;
                                i11 = 0;
                                zM2630T = false;
                            }
                            if (zM2630T || i11 != 2) {
                                int i27 = c1064e.f4344D0;
                                if (i9 > 0) {
                                    int size5 = c1064e.f4353q0.size();
                                    boolean zM2632W = c1064e.m2632W(64);
                                    C1103f c1103f3 = c1064e.f4357u0;
                                    for (int i28 = 0; i28 < size5; i28++) {
                                        C1063d c1063d4 = (C1063d) c1064e.f4353q0.get(i28);
                                        if (!(c1063d4 instanceof C1067h) && !(c1063d4 instanceof C1060a) && !c1063d4.f4278F && (!zM2632W || (c1085k = c1063d4.f4305d) == null || (c1087m = c1063d4.f4307e) == null || !c1085k.f4483e.f4463j || !c1087m.f4483e.f4463j)) {
                                            int iM2612j3 = c1063d4.m2612j(0);
                                            int iM2612j4 = c1063d4.m2612j(1);
                                            boolean z14 = iM2612j3 == 3 && c1063d4.f4332r != 1 && iM2612j4 == 3 && c1063d4.f4333s != 1;
                                            if (!z14 && c1064e.m2632W(1) && !(c1063d4 instanceof C1066g)) {
                                                if (iM2612j3 == 3 && c1063d4.f4332r == 0 && iM2612j4 != 3 && !c1063d4.m2624x()) {
                                                    z14 = true;
                                                }
                                                if (iM2612j4 == 3 && c1063d4.f4333s == 0 && iM2612j3 != 3 && !c1063d4.m2624x()) {
                                                    z14 = true;
                                                }
                                                if ((iM2612j3 == 3 || iM2612j4 == 3) && c1063d4.f4295W > 0.0f) {
                                                    z14 = true;
                                                }
                                            }
                                            if (!z14) {
                                                c0270l.m849l(0, c1063d4, c1103f3);
                                            }
                                        }
                                    }
                                    ConstraintLayout constraintLayout = c1103f3.f4667a;
                                    int childCount2 = constraintLayout.getChildCount();
                                    for (int i29 = 0; i29 < childCount2; i29++) {
                                        constraintLayout.getChildAt(i29);
                                    }
                                    ArrayList arrayList4 = constraintLayout.f1421b;
                                    int size6 = arrayList4.size();
                                    if (size6 > 0) {
                                        for (int i30 = 0; i30 < size6; i30++) {
                                            ((AbstractC1100c) arrayList4.get(i30)).getClass();
                                        }
                                    }
                                }
                                c0270l.m853q(c1064e);
                                ArrayList arrayList5 = (ArrayList) c0270l.f836a;
                                size = arrayList5.size();
                                if (i9 > 0) {
                                    c0270l.m852p(c1064e, 0, iM2617q2, iM2613k);
                                }
                                if (size > 0) {
                                    int[] iArr4 = c1064e.f4330p0;
                                    boolean z15 = iArr4[0] == 2;
                                    boolean z16 = iArr4[1] == 2;
                                    int iM2617q4 = c1064e.m2617q();
                                    C1064e c1064e4 = (C1064e) c0270l.f838c;
                                    int iMax7 = Math.max(iM2617q4, c1064e4.f4302b0);
                                    int iMax8 = Math.max(c1064e.m2613k(), c1064e4.f4304c0);
                                    int i31 = 0;
                                    boolean z17 = false;
                                    while (i31 < size) {
                                        C1063d c1063d5 = (C1063d) arrayList5.get(i31);
                                        if (c1063d5 instanceof C1066g) {
                                            int iM2617q5 = c1063d5.m2617q();
                                            z6 = z16;
                                            int iM2613k3 = c1063d5.m2613k();
                                            z7 = z15;
                                            boolean zM849l = z17 | c0270l.m849l(1, c1063d5, c1103f2);
                                            int iM2617q6 = c1063d5.m2617q();
                                            boolean z18 = zM849l;
                                            int iM2613k4 = c1063d5.m2613k();
                                            if (iM2617q6 != iM2617q5) {
                                                c1063d5.m2602O(iM2617q6);
                                                if (z7 && c1063d5.m2618r() + c1063d5.f4293U > iMax7) {
                                                    iMax7 = Math.max(iMax7, c1063d5.mo2611i(4).m2580e() + c1063d5.m2618r() + c1063d5.f4293U);
                                                }
                                                z18 = true;
                                            }
                                            if (iM2613k4 != iM2613k3) {
                                                c1063d5.m2599L(iM2613k4);
                                                if (z6 && c1063d5.m2619s() + c1063d5.f4294V > iMax8) {
                                                    iMax8 = Math.max(iMax8, c1063d5.mo2611i(5).m2580e() + c1063d5.m2619s() + c1063d5.f4294V);
                                                }
                                                z18 = true;
                                            }
                                            z17 = z18 | ((C1066g) c1063d5).f4415y0;
                                        } else {
                                            z6 = z16;
                                            z7 = z15;
                                        }
                                        i31++;
                                        z16 = z6;
                                        z15 = z7;
                                    }
                                    boolean z19 = z16;
                                    boolean z20 = z15;
                                    int i32 = 0;
                                    while (i32 < 2) {
                                        int i33 = 0;
                                        while (i33 < size) {
                                            C1063d c1063d6 = (C1063d) arrayList5.get(i33);
                                            if (((c1063d6 instanceof AbstractC1068i) && !(c1063d6 instanceof C1066g)) || (c1063d6 instanceof C1067h) || c1063d6.f4312g0 == 8 || ((z5 && c1063d6.f4305d.f4483e.f4463j && c1063d6.f4307e.f4483e.f4463j) || (c1063d6 instanceof C1066g))) {
                                                arrayList = arrayList5;
                                                i12 = size;
                                            } else {
                                                int iM2617q7 = c1063d6.m2617q();
                                                int iM2613k5 = c1063d6.m2613k();
                                                arrayList = arrayList5;
                                                int i34 = c1063d6.f4300a0;
                                                i12 = size;
                                                boolean zM849l2 = c0270l.m849l(i32 == 1 ? 2 : 1, c1063d6, c1103f2) | z17;
                                                int iM2617q8 = c1063d6.m2617q();
                                                boolean z21 = zM849l2;
                                                int iM2613k6 = c1063d6.m2613k();
                                                if (iM2617q8 != iM2617q7) {
                                                    c1063d6.m2602O(iM2617q8);
                                                    if (z20 && c1063d6.m2618r() + c1063d6.f4293U > iMax7) {
                                                        iMax7 = Math.max(iMax7, c1063d6.mo2611i(4).m2580e() + c1063d6.m2618r() + c1063d6.f4293U);
                                                    }
                                                    z21 = true;
                                                }
                                                if (iM2613k6 != iM2613k5) {
                                                    c1063d6.m2599L(iM2613k6);
                                                    if (z19 && c1063d6.m2619s() + c1063d6.f4294V > iMax8) {
                                                        iMax8 = Math.max(iMax8, c1063d6.mo2611i(5).m2580e() + c1063d6.m2619s() + c1063d6.f4294V);
                                                    }
                                                    z21 = true;
                                                }
                                                z17 = (!c1063d6.f4277E || i34 == c1063d6.f4300a0) ? z21 : true;
                                            }
                                            i33++;
                                            arrayList5 = arrayList;
                                            size = i12;
                                        }
                                        ArrayList arrayList6 = arrayList5;
                                        int i35 = size;
                                        if (!z17) {
                                            break;
                                        }
                                        i32++;
                                        c0270l.m852p(c1064e, i32, iM2617q2, iM2613k);
                                        arrayList5 = arrayList6;
                                        size = i35;
                                        z17 = false;
                                    }
                                }
                                c1064e.f4344D0 = i27;
                                C1046c.f4153q = c1064e.m2632W(512);
                            }
                            return;
                        }
                        i5 = 1;
                    } else if (childCount == 0) {
                        iMax2 = Math.max(0, this.f1424e);
                    } else {
                        i5 = 2;
                    }
                    iMin2 = 0;
                    iM2617q = c1064e.m2617q();
                    c1079e = c1064e.f4355s0;
                    i6 = iMin;
                    if (i6 != iM2617q) {
                        c1079e.f4448c = true;
                    }
                    c1064e.f4297Y = 0;
                    c1064e.f4298Z = 0;
                    int i252 = this.f1425f - i24;
                    int[] iArr22 = c1064e.f4275C;
                    iArr22[0] = i252;
                    iArr22[1] = this.f1426g - i23;
                    c1064e.f4302b0 = 0;
                    c1064e.f4304c0 = 0;
                    c1064e.m2600M(i20);
                    c1064e.m2602O(i6);
                    c1064e.m2601N(i5);
                    c1064e.m2599L(iMin2);
                    i7 = this.f1423d - i24;
                    if (i7 < 0) {
                    }
                    i8 = this.f1424e - i23;
                    if (i8 < 0) {
                    }
                    c1064e.f4360x0 = iMax5;
                    c1064e.f4361y0 = iMax3;
                    c0270l = c1064e.f4354r0;
                    c0270l.getClass();
                    C1103f c1103f22 = c1064e.f4357u0;
                    int size42 = c1064e.f4353q0.size();
                    int iM2617q22 = c1064e.m2617q();
                    int iM2613k7 = c1064e.m2613k();
                    boolean zM2648c2 = AbstractC1069j.m2648c(i2, 128);
                    if (zM2648c2) {
                    }
                    if (z2) {
                    }
                    z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c2);
                    if (z4) {
                    }
                    if (zM2630T) {
                    }
                    int i272 = c1064e.f4344D0;
                    if (i9 > 0) {
                    }
                    c0270l.m853q(c1064e);
                    ArrayList arrayList52 = (ArrayList) c0270l.f836a;
                    size = arrayList52.size();
                    if (i9 > 0) {
                    }
                    if (size > 0) {
                    }
                    c1064e.f4344D0 = i272;
                    C1046c.f4153q = c1064e.m2632W(512);
                }
                if (childCount != 0) {
                    iMin2 = i22;
                    i5 = 2;
                    iM2617q = c1064e.m2617q();
                    c1079e = c1064e.f4355s0;
                    i6 = iMin;
                    if (i6 != iM2617q) {
                    }
                    c1064e.f4297Y = 0;
                    c1064e.f4298Z = 0;
                    int i2522 = this.f1425f - i24;
                    int[] iArr222 = c1064e.f4275C;
                    iArr222[0] = i2522;
                    iArr222[1] = this.f1426g - i23;
                    c1064e.f4302b0 = 0;
                    c1064e.f4304c0 = 0;
                    c1064e.m2600M(i20);
                    c1064e.m2602O(i6);
                    c1064e.m2601N(i5);
                    c1064e.m2599L(iMin2);
                    i7 = this.f1423d - i24;
                    if (i7 < 0) {
                    }
                    i8 = this.f1424e - i23;
                    if (i8 < 0) {
                    }
                    c1064e.f4360x0 = iMax5;
                    c1064e.f4361y0 = iMax3;
                    c0270l = c1064e.f4354r0;
                    c0270l.getClass();
                    C1103f c1103f222 = c1064e.f4357u0;
                    int size422 = c1064e.f4353q0.size();
                    int iM2617q222 = c1064e.m2617q();
                    int iM2613k72 = c1064e.m2613k();
                    boolean zM2648c22 = AbstractC1069j.m2648c(i2, 128);
                    if (zM2648c22) {
                    }
                    if (z2) {
                    }
                    z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c22);
                    if (z4) {
                    }
                    if (zM2630T) {
                    }
                    int i2722 = c1064e.f4344D0;
                    if (i9 > 0) {
                    }
                    c0270l.m853q(c1064e);
                    ArrayList arrayList522 = (ArrayList) c0270l.f836a;
                    size = arrayList522.size();
                    if (i9 > 0) {
                    }
                    if (size > 0) {
                    }
                    c1064e.f4344D0 = i2722;
                    C1046c.f4153q = c1064e.m2632W(512);
                }
                iMax2 = Math.max(0, this.f1424e);
                iMin2 = iMax2;
                i5 = 2;
                iM2617q = c1064e.m2617q();
                c1079e = c1064e.f4355s0;
                i6 = iMin;
                if (i6 != iM2617q) {
                }
                c1064e.f4297Y = 0;
                c1064e.f4298Z = 0;
                int i25222 = this.f1425f - i24;
                int[] iArr2222 = c1064e.f4275C;
                iArr2222[0] = i25222;
                iArr2222[1] = this.f1426g - i23;
                c1064e.f4302b0 = 0;
                c1064e.f4304c0 = 0;
                c1064e.m2600M(i20);
                c1064e.m2602O(i6);
                c1064e.m2601N(i5);
                c1064e.m2599L(iMin2);
                i7 = this.f1423d - i24;
                if (i7 < 0) {
                }
                i8 = this.f1424e - i23;
                if (i8 < 0) {
                }
                c1064e.f4360x0 = iMax5;
                c1064e.f4361y0 = iMax3;
                c0270l = c1064e.f4354r0;
                c0270l.getClass();
                C1103f c1103f2222 = c1064e.f4357u0;
                int size4222 = c1064e.f4353q0.size();
                int iM2617q2222 = c1064e.m2617q();
                int iM2613k722 = c1064e.m2613k();
                boolean zM2648c222 = AbstractC1069j.m2648c(i2, 128);
                if (zM2648c222) {
                }
                if (z2) {
                }
                z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c222);
                if (z4) {
                }
                if (zM2630T) {
                }
                int i27222 = c1064e.f4344D0;
                if (i9 > 0) {
                }
                c0270l.m853q(c1064e);
                ArrayList arrayList5222 = (ArrayList) c0270l.f836a;
                size = arrayList5222.size();
                if (i9 > 0) {
                }
                if (size > 0) {
                }
                c1064e.f4344D0 = i27222;
                C1046c.f4153q = c1064e.m2632W(512);
            }
            if (childCount == 0) {
                iMax = Math.max(0, this.f1423d);
            } else {
                i20 = 2;
            }
            iMin = 0;
            if (mode2 == Integer.MIN_VALUE) {
            }
            iMin2 = iMax2;
            i5 = 2;
            iM2617q = c1064e.m2617q();
            c1079e = c1064e.f4355s0;
            i6 = iMin;
            if (i6 != iM2617q) {
            }
            c1064e.f4297Y = 0;
            c1064e.f4298Z = 0;
            int i252222 = this.f1425f - i24;
            int[] iArr22222 = c1064e.f4275C;
            iArr22222[0] = i252222;
            iArr22222[1] = this.f1426g - i23;
            c1064e.f4302b0 = 0;
            c1064e.f4304c0 = 0;
            c1064e.m2600M(i20);
            c1064e.m2602O(i6);
            c1064e.m2601N(i5);
            c1064e.m2599L(iMin2);
            i7 = this.f1423d - i24;
            if (i7 < 0) {
            }
            i8 = this.f1424e - i23;
            if (i8 < 0) {
            }
            c1064e.f4360x0 = iMax5;
            c1064e.f4361y0 = iMax3;
            c0270l = c1064e.f4354r0;
            c0270l.getClass();
            C1103f c1103f22222 = c1064e.f4357u0;
            int size42222 = c1064e.f4353q0.size();
            int iM2617q22222 = c1064e.m2617q();
            int iM2613k7222 = c1064e.m2613k();
            boolean zM2648c2222 = AbstractC1069j.m2648c(i2, 128);
            if (zM2648c2222) {
            }
            if (z2) {
            }
            z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c2222);
            if (z4) {
            }
            if (zM2630T) {
            }
            int i272222 = c1064e.f4344D0;
            if (i9 > 0) {
            }
            c0270l.m853q(c1064e);
            ArrayList arrayList52222 = (ArrayList) c0270l.f836a;
            size = arrayList52222.size();
            if (i9 > 0) {
            }
            if (size > 0) {
            }
            c1064e.f4344D0 = i272222;
            C1046c.f4153q = c1064e.m2632W(512);
        }
        if (childCount != 0) {
            iMin = i21;
            i20 = 2;
            if (mode2 == Integer.MIN_VALUE) {
            }
            iMin2 = iMax2;
            i5 = 2;
            iM2617q = c1064e.m2617q();
            c1079e = c1064e.f4355s0;
            i6 = iMin;
            if (i6 != iM2617q) {
            }
            c1064e.f4297Y = 0;
            c1064e.f4298Z = 0;
            int i2522222 = this.f1425f - i24;
            int[] iArr222222 = c1064e.f4275C;
            iArr222222[0] = i2522222;
            iArr222222[1] = this.f1426g - i23;
            c1064e.f4302b0 = 0;
            c1064e.f4304c0 = 0;
            c1064e.m2600M(i20);
            c1064e.m2602O(i6);
            c1064e.m2601N(i5);
            c1064e.m2599L(iMin2);
            i7 = this.f1423d - i24;
            if (i7 < 0) {
            }
            i8 = this.f1424e - i23;
            if (i8 < 0) {
            }
            c1064e.f4360x0 = iMax5;
            c1064e.f4361y0 = iMax3;
            c0270l = c1064e.f4354r0;
            c0270l.getClass();
            C1103f c1103f222222 = c1064e.f4357u0;
            int size422222 = c1064e.f4353q0.size();
            int iM2617q222222 = c1064e.m2617q();
            int iM2613k72222 = c1064e.m2613k();
            boolean zM2648c22222 = AbstractC1069j.m2648c(i2, 128);
            if (zM2648c22222) {
            }
            if (z2) {
            }
            z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c22222);
            if (z4) {
            }
            if (zM2630T) {
            }
            int i2722222 = c1064e.f4344D0;
            if (i9 > 0) {
            }
            c0270l.m853q(c1064e);
            ArrayList arrayList522222 = (ArrayList) c0270l.f836a;
            size = arrayList522222.size();
            if (i9 > 0) {
            }
            if (size > 0) {
            }
            c1064e.f4344D0 = i2722222;
            C1046c.f4153q = c1064e.m2632W(512);
        }
        iMax = Math.max(0, this.f1423d);
        iMin = iMax;
        i20 = 2;
        if (mode2 == Integer.MIN_VALUE) {
        }
        iMin2 = iMax2;
        i5 = 2;
        iM2617q = c1064e.m2617q();
        c1079e = c1064e.f4355s0;
        i6 = iMin;
        if (i6 != iM2617q) {
        }
        c1064e.f4297Y = 0;
        c1064e.f4298Z = 0;
        int i25222222 = this.f1425f - i24;
        int[] iArr2222222 = c1064e.f4275C;
        iArr2222222[0] = i25222222;
        iArr2222222[1] = this.f1426g - i23;
        c1064e.f4302b0 = 0;
        c1064e.f4304c0 = 0;
        c1064e.m2600M(i20);
        c1064e.m2602O(i6);
        c1064e.m2601N(i5);
        c1064e.m2599L(iMin2);
        i7 = this.f1423d - i24;
        if (i7 < 0) {
        }
        i8 = this.f1424e - i23;
        if (i8 < 0) {
        }
        c1064e.f4360x0 = iMax5;
        c1064e.f4361y0 = iMax3;
        c0270l = c1064e.f4354r0;
        c0270l.getClass();
        C1103f c1103f2222222 = c1064e.f4357u0;
        int size4222222 = c1064e.f4353q0.size();
        int iM2617q2222222 = c1064e.m2617q();
        int iM2613k722222 = c1064e.m2613k();
        boolean zM2648c222222 = AbstractC1069j.m2648c(i2, 128);
        if (zM2648c222222) {
        }
        if (z2) {
        }
        z4 = z3 & ((mode == i10 && mode2 == i10) || zM2648c222222);
        if (z4) {
        }
        if (zM2630T) {
        }
        int i27222222 = c1064e.f4344D0;
        if (i9 > 0) {
        }
        c0270l.m853q(c1064e);
        ArrayList arrayList5222222 = (ArrayList) c0270l.f836a;
        size = arrayList5222222.size();
        if (i9 > 0) {
        }
        if (size > 0) {
        }
        c1064e.f4344D0 = i27222222;
        C1046c.f4153q = c1064e.m2632W(512);
    }

    /* JADX INFO: renamed from: l */
    public final void m1248l(C1063d c1063d, C1102e c1102e, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f1420a.get(i2);
        C1063d c1063d2 = (C1063d) sparseArray.get(i2);
        if (c1063d2 == null || view == null || !(view.getLayoutParams() instanceof C1102e)) {
            return;
        }
        c1102e.f4630c0 = true;
        if (i3 == 6) {
            C1102e c1102e2 = (C1102e) view.getLayoutParams();
            c1102e2.f4630c0 = true;
            c1102e2.f4656p0.f4277E = true;
        }
        c1063d.mo2611i(6).m2577b(c1063d2.mo2611i(i3), c1102e.f4602D, c1102e.f4601C, true);
        c1063d.f4277E = true;
        c1063d.mo2611i(3).m2585j();
        c1063d.mo2611i(5).m2585j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C1102e c1102e = (C1102e) childAt.getLayoutParams();
            C1063d c1063d = c1102e.f4656p0;
            if (childAt.getVisibility() != 8 || c1102e.f4632d0 || c1102e.f4634e0 || zIsInEditMode) {
                int iM2618r = c1063d.m2618r();
                int iM2619s = c1063d.m2619s();
                childAt.layout(iM2618r, iM2619s, c1063d.m2617q() + iM2618r, c1063d.m2613k() + iM2619s);
            }
        }
        ArrayList arrayList = this.f1421b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1100c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0527  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        C1063d c1063d;
        C1063d c1063d2;
        int i5;
        C1063d c1063d3;
        int i6;
        int i7;
        C1063d c1063d4;
        C1063d c1063d5;
        C1102e c1102e;
        C1063d c1063d6;
        float f;
        int i8;
        int i9;
        float fAbs;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        C1063d c1063d7;
        ConstraintLayout constraintLayout = this;
        boolean z4 = constraintLayout.f1427h;
        constraintLayout.f1427h = z4;
        int i11 = 0;
        if (!z4) {
            int childCount = constraintLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i12).isLayoutRequested()) {
                    constraintLayout.f1427h = true;
                    break;
                }
                i12++;
            }
        }
        boolean z5 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C1064e c1064e = constraintLayout.f1422c;
        c1064e.f4358v0 = z5;
        if (constraintLayout.f1427h) {
            constraintLayout.f1427h = false;
            int childCount2 = constraintLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    C1063d c1063dM1244h = constraintLayout.m1244h(constraintLayout.getChildAt(i14));
                    if (c1063dM1244h != null) {
                        c1063dM1244h.mo2592C();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt = constraintLayout.getChildAt(i15);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f1432m == null) {
                                    constraintLayout.f1432m = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                try {
                                    constraintLayout.f1432m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.f1420a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c1063d7 = c1064e;
                                    c1063d7.f4314h0 = resourceName;
                                } else {
                                    c1063d7 = viewFindViewById == null ? null : ((C1102e) viewFindViewById.getLayoutParams()).f4656p0;
                                    c1063d7.f4314h0 = resourceName;
                                }
                            } else {
                                c1063d7 = c1064e;
                                c1063d7.f4314h0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused2) {
                        }
                    }
                }
                if (constraintLayout.f1431l != -1) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        constraintLayout.getChildAt(i16).getId();
                    }
                }
                C1111n c1111n = constraintLayout.f1429j;
                if (c1111n != null) {
                    c1111n.m2756a(constraintLayout);
                }
                c1064e.f4353q0.clear();
                ArrayList arrayList3 = constraintLayout.f1421b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i17 = 0;
                    while (i17 < size) {
                        AbstractC1100c abstractC1100c = (AbstractC1100c) arrayList3.get(i17);
                        if (abstractC1100c.isInEditMode()) {
                            abstractC1100c.setIds(abstractC1100c.f4595e);
                        }
                        AbstractC1068i abstractC1068i = abstractC1100c.f4594d;
                        if (abstractC1068i == null) {
                            arrayList = arrayList3;
                        } else {
                            abstractC1068i.f4424r0 = i11;
                            Arrays.fill(abstractC1068i.f4423q0, obj);
                            int i18 = 0;
                            while (i18 < abstractC1100c.f4592b) {
                                int i19 = abstractC1100c.f4591a[i18];
                                View view = (View) constraintLayout.f1420a.get(i19);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i19);
                                    HashMap map = abstractC1100c.f4597g;
                                    String str = (String) map.get(numValueOf2);
                                    int iM2736f = abstractC1100c.m2736f(constraintLayout, str);
                                    if (iM2736f != 0) {
                                        abstractC1100c.f4591a[i18] = iM2736f;
                                        map.put(Integer.valueOf(iM2736f), str);
                                        view = (View) constraintLayout.f1420a.get(iM2736f);
                                    }
                                }
                                if (view != null) {
                                    AbstractC1068i abstractC1068i2 = abstractC1100c.f4594d;
                                    C1063d c1063dM1244h2 = constraintLayout.m1244h(view);
                                    abstractC1068i2.getClass();
                                    if (c1063dM1244h2 == abstractC1068i2 || c1063dM1244h2 == null) {
                                        arrayList2 = arrayList3;
                                    } else {
                                        int i20 = abstractC1068i2.f4424r0 + 1;
                                        C1063d[] c1063dArr = abstractC1068i2.f4423q0;
                                        arrayList2 = arrayList3;
                                        if (i20 > c1063dArr.length) {
                                            abstractC1068i2.f4423q0 = (C1063d[]) Arrays.copyOf(c1063dArr, c1063dArr.length * 2);
                                        }
                                        C1063d[] c1063dArr2 = abstractC1068i2.f4423q0;
                                        int i21 = abstractC1068i2.f4424r0;
                                        c1063dArr2[i21] = c1063dM1244h2;
                                        abstractC1068i2.f4424r0 = i21 + 1;
                                    }
                                }
                                i18++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC1100c.f4594d.mo2639S();
                        }
                        i17++;
                        arrayList3 = arrayList;
                        obj = null;
                        i11 = 0;
                    }
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    constraintLayout.getChildAt(i22);
                }
                SparseArray sparseArray = constraintLayout.f1433n;
                sparseArray.clear();
                sparseArray.put(0, c1064e);
                sparseArray.put(constraintLayout.getId(), c1064e);
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt2 = constraintLayout.getChildAt(i23);
                    sparseArray.put(childAt2.getId(), constraintLayout.m1244h(childAt2));
                }
                int i24 = 0;
                while (i24 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i24);
                    C1063d c1063dM1244h3 = constraintLayout.m1244h(childAt3);
                    if (c1063dM1244h3 == null) {
                        i4 = i24;
                        z3 = z2;
                    } else {
                        C1102e c1102e2 = (C1102e) childAt3.getLayoutParams();
                        c1064e.f4353q0.add(c1063dM1244h3);
                        C1063d c1063d8 = c1063dM1244h3.f4292T;
                        if (c1063d8 != null) {
                            ((C1064e) c1063d8).f4353q0.remove(c1063dM1244h3);
                            c1063dM1244h3.mo2592C();
                        }
                        c1063dM1244h3.f4292T = c1064e;
                        c1102e2.m2739a();
                        c1063dM1244h3.f4312g0 = childAt3.getVisibility();
                        c1063dM1244h3.f4310f0 = childAt3;
                        if (childAt3 instanceof AbstractC1100c) {
                            ((AbstractC1100c) childAt3).mo1241h(c1063dM1244h3, c1064e.f4358v0);
                        }
                        if (c1102e2.f4632d0) {
                            C1067h c1067h = (C1067h) c1063dM1244h3;
                            int i25 = c1102e2.f4650m0;
                            int i26 = c1102e2.f4652n0;
                            float f2 = c1102e2.f4654o0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    c1067h.f4417q0 = f2;
                                    c1067h.f4418r0 = -1;
                                    c1067h.f4419s0 = -1;
                                }
                            } else if (i25 != -1) {
                                if (i25 > -1) {
                                    c1067h.f4417q0 = -1.0f;
                                    c1067h.f4418r0 = i25;
                                    c1067h.f4419s0 = -1;
                                }
                            } else if (i26 != -1 && i26 > -1) {
                                c1067h.f4417q0 = -1.0f;
                                c1067h.f4418r0 = -1;
                                c1067h.f4419s0 = i26;
                            }
                            i4 = i24;
                            z3 = z2;
                        } else {
                            int i27 = c1102e2.f4636f0;
                            int i28 = c1102e2.f4638g0;
                            int i29 = c1102e2.f4640h0;
                            int i30 = c1102e2.f4642i0;
                            int i31 = c1102e2.f4644j0;
                            int i32 = c1102e2.f4646k0;
                            i4 = i24;
                            float f3 = c1102e2.f4648l0;
                            int i33 = c1102e2.f4655p;
                            z3 = z2;
                            if (i33 != -1) {
                                C1063d c1063d9 = (C1063d) sparseArray.get(i33);
                                if (c1063d9 != null) {
                                    float f4 = c1102e2.f4658r;
                                    c1063dM1244h3.m2622v(7, 7, c1102e2.f4657q, 0, c1063d9);
                                    c1063dM1244h3.f4276D = f4;
                                }
                                constraintLayout = this;
                                c1063d6 = c1063dM1244h3;
                                c1102e = c1102e2;
                                i5 = 2;
                                i6 = 4;
                            } else {
                                if (i27 != -1) {
                                    C1063d c1063d10 = (C1063d) sparseArray.get(i27);
                                    if (c1063d10 != null) {
                                        c1063d = c1063dM1244h3;
                                        c1063d.m2622v(2, 2, ((ViewGroup.MarginLayoutParams) c1102e2).leftMargin, i31, c1063d10);
                                    } else {
                                        c1063d = c1063dM1244h3;
                                    }
                                } else {
                                    c1063d = c1063dM1244h3;
                                    if (i28 != -1 && (c1063d2 = (C1063d) sparseArray.get(i28)) != null) {
                                        c1063d.m2622v(2, 4, ((ViewGroup.MarginLayoutParams) c1102e2).leftMargin, i31, c1063d2);
                                    }
                                }
                                if (i29 != -1) {
                                    C1063d c1063d11 = (C1063d) sparseArray.get(i29);
                                    if (c1063d11 != null) {
                                        c1063d.m2622v(4, 2, ((ViewGroup.MarginLayoutParams) c1102e2).rightMargin, i32, c1063d11);
                                    }
                                    i5 = 2;
                                } else {
                                    i5 = 2;
                                    if (i30 != -1 && (c1063d3 = (C1063d) sparseArray.get(i30)) != null) {
                                        c1063d.m2622v(4, 4, ((ViewGroup.MarginLayoutParams) c1102e2).rightMargin, i32, c1063d3);
                                    }
                                }
                                i6 = 4;
                                int i34 = c1102e2.f4641i;
                                if (i34 != -1) {
                                    C1063d c1063d12 = (C1063d) sparseArray.get(i34);
                                    if (c1063d12 != null) {
                                        c1063d.m2622v(3, 3, ((ViewGroup.MarginLayoutParams) c1102e2).topMargin, c1102e2.f4664x, c1063d12);
                                    }
                                    i7 = -1;
                                } else {
                                    int i35 = c1102e2.f4643j;
                                    i7 = -1;
                                    if (i35 != -1 && (c1063d4 = (C1063d) sparseArray.get(i35)) != null) {
                                        c1063d.m2622v(3, 5, ((ViewGroup.MarginLayoutParams) c1102e2).topMargin, c1102e2.f4664x, c1063d4);
                                    }
                                }
                                int i36 = c1102e2.f4645k;
                                if (i36 != i7) {
                                    C1063d c1063d13 = (C1063d) sparseArray.get(i36);
                                    if (c1063d13 != null) {
                                        c1063d.m2622v(5, 3, ((ViewGroup.MarginLayoutParams) c1102e2).bottomMargin, c1102e2.f4666z, c1063d13);
                                    }
                                } else {
                                    int i37 = c1102e2.f4647l;
                                    if (i37 != i7 && (c1063d5 = (C1063d) sparseArray.get(i37)) != null) {
                                        c1063d.m2622v(5, 5, ((ViewGroup.MarginLayoutParams) c1102e2).bottomMargin, c1102e2.f4666z, c1063d5);
                                    }
                                }
                                c1102e = c1102e2;
                                int i38 = c1102e.f4649m;
                                if (i38 != -1) {
                                    constraintLayout = this;
                                    c1063d6 = c1063d;
                                    constraintLayout.m1248l(c1063d6, c1102e, sparseArray, i38, 6);
                                } else {
                                    int i39 = c1102e.f4651n;
                                    if (i39 != -1) {
                                        constraintLayout = this;
                                        c1063d6 = c1063d;
                                        constraintLayout.m1248l(c1063d6, c1102e, sparseArray, i39, 3);
                                    } else {
                                        int i40 = c1102e.f4653o;
                                        constraintLayout = this;
                                        c1063d6 = c1063d;
                                        if (i40 != -1) {
                                            constraintLayout.m1248l(c1063d6, c1102e, sparseArray, i40, 5);
                                        }
                                        if (f3 >= 0.0f) {
                                            c1063d6.f4306d0 = f3;
                                        }
                                        f = c1102e.f4604F;
                                        if (f >= 0.0f) {
                                            c1063d6.f4308e0 = f;
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                }
                                f = c1102e.f4604F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i10 = c1102e.f4618T) != -1 || c1102e.f4619U != -1)) {
                                int i41 = c1102e.f4619U;
                                c1063d6.f4297Y = i10;
                                c1063d6.f4298Z = i41;
                            }
                            if (c1102e.f4626a0) {
                                c1063d6.m2600M(1);
                                c1063d6.m2602O(((ViewGroup.MarginLayoutParams) c1102e).width);
                                if (((ViewGroup.MarginLayoutParams) c1102e).width == -2) {
                                    c1063d6.m2600M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1102e).width == -1) {
                                if (c1102e.f4621W) {
                                    c1063d6.m2600M(3);
                                } else {
                                    c1063d6.m2600M(4);
                                }
                                c1063d6.mo2611i(i5).f4270g = ((ViewGroup.MarginLayoutParams) c1102e).leftMargin;
                                c1063d6.mo2611i(i6).f4270g = ((ViewGroup.MarginLayoutParams) c1102e).rightMargin;
                            } else {
                                c1063d6.m2600M(3);
                                c1063d6.m2602O(0);
                            }
                            if (c1102e.f4628b0) {
                                c1063d6.m2601N(1);
                                c1063d6.m2599L(((ViewGroup.MarginLayoutParams) c1102e).height);
                                if (((ViewGroup.MarginLayoutParams) c1102e).height == -2) {
                                    c1063d6.m2601N(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1102e).height == -1) {
                                if (c1102e.f4622X) {
                                    c1063d6.m2601N(3);
                                } else {
                                    c1063d6.m2601N(4);
                                }
                                c1063d6.mo2611i(3).f4270g = ((ViewGroup.MarginLayoutParams) c1102e).topMargin;
                                c1063d6.mo2611i(5).f4270g = ((ViewGroup.MarginLayoutParams) c1102e).bottomMargin;
                            } else {
                                c1063d6.m2601N(3);
                                c1063d6.m2599L(0);
                            }
                            String str2 = c1102e.f4605G;
                            if (str2 == null || str2.length() == 0) {
                                c1063d6.f4295W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i8 = 0;
                                    i9 = -1;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i9 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i8 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i8);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c1063d6.f4295W = fAbs;
                                        c1063d6.f4296X = i9;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i8, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 > 0.0f && f6 > 0.0f) {
                                                fAbs = i9 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f7 = c1102e.f4606H;
                            float[] fArr = c1063d6.f4320k0;
                            fArr[0] = f7;
                            fArr[1] = c1102e.f4607I;
                            c1063d6.f4316i0 = c1102e.f4608J;
                            c1063d6.f4318j0 = c1102e.f4609K;
                            int i42 = c1102e.f4624Z;
                            if (i42 >= 0 && i42 <= 3) {
                                c1063d6.f4331q = i42;
                            }
                            int i43 = c1102e.f4610L;
                            int i44 = c1102e.f4612N;
                            int i45 = c1102e.f4614P;
                            float f8 = c1102e.f4616R;
                            c1063d6.f4332r = i43;
                            c1063d6.f4335u = i44;
                            if (i45 == Integer.MAX_VALUE) {
                                i45 = 0;
                            }
                            c1063d6.f4336v = i45;
                            c1063d6.f4337w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i43 == 0) {
                                c1063d6.f4332r = 2;
                            }
                            int i46 = c1102e.f4611M;
                            int i47 = c1102e.f4613O;
                            int i48 = c1102e.f4615Q;
                            float f9 = c1102e.f4617S;
                            c1063d6.f4333s = i46;
                            c1063d6.f4338x = i47;
                            if (i48 == Integer.MAX_VALUE) {
                                i48 = 0;
                            }
                            c1063d6.f4339y = i48;
                            c1063d6.f4340z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i46 == 0) {
                                c1063d6.f4333s = 2;
                            }
                        }
                    }
                    i24 = i4 + 1;
                    z2 = z3;
                }
            }
            if (z2) {
                c1064e.f4354r0.m853q(c1064e);
            }
        }
        c1064e.f4359w0.getClass();
        constraintLayout.m1247k(c1064e, constraintLayout.f1428i, i2, i3);
        int iM2617q = c1064e.m2617q();
        int iM2613k = c1064e.m2613k();
        boolean z6 = c1064e.f4345E0;
        boolean z7 = c1064e.f4346F0;
        C1103f c1103f = constraintLayout.f1434o;
        int i49 = c1103f.f4671e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM2617q + c1103f.f4670d, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM2613k + i49, i3, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f1425f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f1426g, iResolveSizeAndState2);
        if (z6) {
            iMin |= 16777216;
        }
        if (z7) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1063d c1063dM1244h = m1244h(view);
        if ((view instanceof C1113p) && !(c1063dM1244h instanceof C1067h)) {
            C1102e c1102e = (C1102e) view.getLayoutParams();
            C1067h c1067h = new C1067h();
            c1102e.f4656p0 = c1067h;
            c1102e.f4632d0 = true;
            c1067h.m2644S(c1102e.f4620V);
        }
        if (view instanceof AbstractC1100c) {
            AbstractC1100c abstractC1100c = (AbstractC1100c) view;
            abstractC1100c.m2738i();
            ((C1102e) view.getLayoutParams()).f4634e0 = true;
            ArrayList arrayList = this.f1421b;
            if (!arrayList.contains(abstractC1100c)) {
                arrayList.add(abstractC1100c);
            }
        }
        this.f1420a.put(view.getId(), view);
        this.f1427h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1420a.remove(view.getId());
        C1063d c1063dM1244h = m1244h(view);
        this.f1422c.f4353q0.remove(c1063dM1244h);
        c1063dM1244h.mo2592C();
        this.f1421b.remove(view);
        this.f1427h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1427h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1111n c1111n) {
        this.f1429j = c1111n;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f1420a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1426g) {
            return;
        }
        this.f1426g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1425f) {
            return;
        }
        this.f1425f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1424e) {
            return;
        }
        this.f1424e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f1423d) {
            return;
        }
        this.f1423d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1112o abstractC1112o) {
        C0048n c0048n = this.f1430k;
        if (c0048n != null) {
            c0048n.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1428i = i2;
        C1064e c1064e = this.f1422c;
        c1064e.f4344D0 = i2;
        C1046c.f4153q = c1064e.m2632W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1420a = new SparseArray();
        this.f1421b = new ArrayList(4);
        this.f1422c = new C1064e();
        this.f1423d = 0;
        this.f1424e = 0;
        this.f1425f = Integer.MAX_VALUE;
        this.f1426g = Integer.MAX_VALUE;
        this.f1427h = true;
        this.f1428i = 257;
        this.f1429j = null;
        this.f1430k = null;
        this.f1431l = -1;
        this.f1432m = new HashMap();
        this.f1433n = new SparseArray();
        this.f1434o = new C1103f(this, this);
        m1245i(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1102e c1102e = new C1102e(layoutParams);
        c1102e.f4625a = -1;
        c1102e.f4627b = -1;
        c1102e.f4629c = -1.0f;
        c1102e.f4631d = true;
        c1102e.f4633e = -1;
        c1102e.f4635f = -1;
        c1102e.f4637g = -1;
        c1102e.f4639h = -1;
        c1102e.f4641i = -1;
        c1102e.f4643j = -1;
        c1102e.f4645k = -1;
        c1102e.f4647l = -1;
        c1102e.f4649m = -1;
        c1102e.f4651n = -1;
        c1102e.f4653o = -1;
        c1102e.f4655p = -1;
        c1102e.f4657q = 0;
        c1102e.f4658r = 0.0f;
        c1102e.f4659s = -1;
        c1102e.f4660t = -1;
        c1102e.f4661u = -1;
        c1102e.f4662v = -1;
        c1102e.f4663w = Integer.MIN_VALUE;
        c1102e.f4664x = Integer.MIN_VALUE;
        c1102e.f4665y = Integer.MIN_VALUE;
        c1102e.f4666z = Integer.MIN_VALUE;
        c1102e.f4599A = Integer.MIN_VALUE;
        c1102e.f4600B = Integer.MIN_VALUE;
        c1102e.f4601C = Integer.MIN_VALUE;
        c1102e.f4602D = 0;
        c1102e.f4603E = 0.5f;
        c1102e.f4604F = 0.5f;
        c1102e.f4605G = null;
        c1102e.f4606H = -1.0f;
        c1102e.f4607I = -1.0f;
        c1102e.f4608J = 0;
        c1102e.f4609K = 0;
        c1102e.f4610L = 0;
        c1102e.f4611M = 0;
        c1102e.f4612N = 0;
        c1102e.f4613O = 0;
        c1102e.f4614P = 0;
        c1102e.f4615Q = 0;
        c1102e.f4616R = 1.0f;
        c1102e.f4617S = 1.0f;
        c1102e.f4618T = -1;
        c1102e.f4619U = -1;
        c1102e.f4620V = -1;
        c1102e.f4621W = false;
        c1102e.f4622X = false;
        c1102e.f4623Y = null;
        c1102e.f4624Z = 0;
        c1102e.f4626a0 = true;
        c1102e.f4628b0 = true;
        c1102e.f4630c0 = false;
        c1102e.f4632d0 = false;
        c1102e.f4634e0 = false;
        c1102e.f4636f0 = -1;
        c1102e.f4638g0 = -1;
        c1102e.f4640h0 = -1;
        c1102e.f4642i0 = -1;
        c1102e.f4644j0 = Integer.MIN_VALUE;
        c1102e.f4646k0 = Integer.MIN_VALUE;
        c1102e.f4648l0 = 0.5f;
        c1102e.f4656p0 = new C1063d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1102e).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1102e).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1102e).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1102e).bottomMargin = marginLayoutParams.bottomMargin;
            c1102e.setMarginStart(marginLayoutParams.getMarginStart());
            c1102e.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C1102e)) {
            return c1102e;
        }
        C1102e c1102e2 = (C1102e) layoutParams;
        c1102e.f4625a = c1102e2.f4625a;
        c1102e.f4627b = c1102e2.f4627b;
        c1102e.f4629c = c1102e2.f4629c;
        c1102e.f4631d = c1102e2.f4631d;
        c1102e.f4633e = c1102e2.f4633e;
        c1102e.f4635f = c1102e2.f4635f;
        c1102e.f4637g = c1102e2.f4637g;
        c1102e.f4639h = c1102e2.f4639h;
        c1102e.f4641i = c1102e2.f4641i;
        c1102e.f4643j = c1102e2.f4643j;
        c1102e.f4645k = c1102e2.f4645k;
        c1102e.f4647l = c1102e2.f4647l;
        c1102e.f4649m = c1102e2.f4649m;
        c1102e.f4651n = c1102e2.f4651n;
        c1102e.f4653o = c1102e2.f4653o;
        c1102e.f4655p = c1102e2.f4655p;
        c1102e.f4657q = c1102e2.f4657q;
        c1102e.f4658r = c1102e2.f4658r;
        c1102e.f4659s = c1102e2.f4659s;
        c1102e.f4660t = c1102e2.f4660t;
        c1102e.f4661u = c1102e2.f4661u;
        c1102e.f4662v = c1102e2.f4662v;
        c1102e.f4663w = c1102e2.f4663w;
        c1102e.f4664x = c1102e2.f4664x;
        c1102e.f4665y = c1102e2.f4665y;
        c1102e.f4666z = c1102e2.f4666z;
        c1102e.f4599A = c1102e2.f4599A;
        c1102e.f4600B = c1102e2.f4600B;
        c1102e.f4601C = c1102e2.f4601C;
        c1102e.f4602D = c1102e2.f4602D;
        c1102e.f4603E = c1102e2.f4603E;
        c1102e.f4604F = c1102e2.f4604F;
        c1102e.f4605G = c1102e2.f4605G;
        c1102e.f4606H = c1102e2.f4606H;
        c1102e.f4607I = c1102e2.f4607I;
        c1102e.f4608J = c1102e2.f4608J;
        c1102e.f4609K = c1102e2.f4609K;
        c1102e.f4621W = c1102e2.f4621W;
        c1102e.f4622X = c1102e2.f4622X;
        c1102e.f4610L = c1102e2.f4610L;
        c1102e.f4611M = c1102e2.f4611M;
        c1102e.f4612N = c1102e2.f4612N;
        c1102e.f4614P = c1102e2.f4614P;
        c1102e.f4613O = c1102e2.f4613O;
        c1102e.f4615Q = c1102e2.f4615Q;
        c1102e.f4616R = c1102e2.f4616R;
        c1102e.f4617S = c1102e2.f4617S;
        c1102e.f4618T = c1102e2.f4618T;
        c1102e.f4619U = c1102e2.f4619U;
        c1102e.f4620V = c1102e2.f4620V;
        c1102e.f4626a0 = c1102e2.f4626a0;
        c1102e.f4628b0 = c1102e2.f4628b0;
        c1102e.f4630c0 = c1102e2.f4630c0;
        c1102e.f4632d0 = c1102e2.f4632d0;
        c1102e.f4636f0 = c1102e2.f4636f0;
        c1102e.f4638g0 = c1102e2.f4638g0;
        c1102e.f4640h0 = c1102e2.f4640h0;
        c1102e.f4642i0 = c1102e2.f4642i0;
        c1102e.f4644j0 = c1102e2.f4644j0;
        c1102e.f4646k0 = c1102e2.f4646k0;
        c1102e.f4648l0 = c1102e2.f4648l0;
        c1102e.f4623Y = c1102e2.f4623Y;
        c1102e.f4624Z = c1102e2.f4624Z;
        c1102e.f4656p0 = c1102e2.f4656p0;
        return c1102e;
    }
}
