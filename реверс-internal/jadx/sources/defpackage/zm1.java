package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 {
    public final /* synthetic */ int a;
    public bk b;
    public bk c;
    public bk d;
    public bk e;
    public gt f;
    public gt g;
    public gt h;
    public gt i;
    public v20 j;
    public v20 k;
    public v20 l;
    public v20 m;

    public zm1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = new ng1();
                this.c = new ng1();
                this.d = new ng1();
                this.e = new ng1();
                this.f = new b(0.0f);
                this.g = new b(0.0f);
                this.h = new b(0.0f);
                this.i = new b(0.0f);
                int i2 = 0;
                this.j = new v20(i2);
                this.k = new v20(i2);
                this.l = new v20(i2);
                this.m = new v20(i2);
                break;
        }
    }

    public static zm1 b(Context context, AttributeSet attributeSet, int i, int i2) {
        b bVar = new b(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tb1.f, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return c(contextThemeWrapper.obtainStyledAttributes(tb1.h), bVar);
    }

    public static zm1 c(TypedArray typedArray, b bVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            gt gtVarD = d(typedArray, 5, bVar);
            gt gtVarD2 = d(typedArray, 8, gtVarD);
            gt gtVarD3 = d(typedArray, 9, gtVarD);
            gt gtVarD4 = d(typedArray, 7, gtVarD);
            gt gtVarD5 = d(typedArray, 6, gtVarD);
            zm1 zm1Var = new zm1(0);
            zm1Var.b = hk.m(i2);
            zm1Var.f = gtVarD2;
            zm1Var.c = hk.m(i3);
            zm1Var.g = gtVarD3;
            zm1Var.d = hk.m(i4);
            zm1Var.h = gtVarD4;
            zm1Var.e = hk.m(i5);
            zm1Var.i = gtVarD5;
            return zm1Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static gt d(TypedArray typedArray, int i, gt gtVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new b(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new dd1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return gtVar;
    }

    public zm1 a() {
        zm1 zm1Var = new zm1(1);
        zm1Var.b = this.b;
        zm1Var.c = this.c;
        zm1Var.d = this.d;
        zm1Var.e = this.e;
        zm1Var.f = this.f;
        zm1Var.g = this.g;
        zm1Var.h = this.h;
        zm1Var.i = this.i;
        zm1Var.j = this.j;
        zm1Var.k = this.k;
        zm1Var.l = this.l;
        zm1Var.m = this.m;
        return zm1Var;
    }

    public boolean e(RectF rectF) {
        boolean z = this.m.getClass().equals(v20.class) && this.k.getClass().equals(v20.class) && this.j.getClass().equals(v20.class) && this.l.getClass().equals(v20.class);
        float fA = this.f.a(rectF);
        return z && ((this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0 && (this.i.a(rectF) > fA ? 1 : (this.i.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0) && (this.c instanceof ng1) && (this.b instanceof ng1) && (this.d instanceof ng1) && (this.e instanceof ng1);
    }

    public zm1 f() {
        zm1 zm1Var = new zm1(false);
        zm1Var.b = this.b;
        zm1Var.c = this.c;
        zm1Var.d = this.d;
        zm1Var.e = this.e;
        zm1Var.f = this.f;
        zm1Var.g = this.g;
        zm1Var.h = this.h;
        zm1Var.i = this.i;
        zm1Var.j = this.j;
        zm1Var.k = this.k;
        zm1Var.l = this.l;
        zm1Var.m = this.m;
        return zm1Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + this.f + ", " + this.g + ", " + this.h + ", " + this.i + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zm1(boolean z) {
        this.a = 0;
    }
}
