package p065g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p084q.AbstractC1030i;
import p084q.C1029h;
import p084q.C1032k;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0706b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A */
    public boolean f2781A;

    /* JADX INFO: renamed from: B */
    public ColorFilter f2782B;

    /* JADX INFO: renamed from: C */
    public boolean f2783C;

    /* JADX INFO: renamed from: D */
    public ColorStateList f2784D;

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f2785E;

    /* JADX INFO: renamed from: F */
    public boolean f2786F;

    /* JADX INFO: renamed from: G */
    public boolean f2787G;

    /* JADX INFO: renamed from: H */
    public int[][] f2788H;

    /* JADX INFO: renamed from: I */
    public C1029h f2789I;

    /* JADX INFO: renamed from: J */
    public C1032k f2790J;

    /* JADX INFO: renamed from: a */
    public final C0709e f2791a;

    /* JADX INFO: renamed from: b */
    public Resources f2792b;

    /* JADX INFO: renamed from: c */
    public int f2793c;

    /* JADX INFO: renamed from: d */
    public int f2794d;

    /* JADX INFO: renamed from: e */
    public int f2795e;

    /* JADX INFO: renamed from: f */
    public SparseArray f2796f;

    /* JADX INFO: renamed from: g */
    public Drawable[] f2797g;

    /* JADX INFO: renamed from: h */
    public int f2798h;

    /* JADX INFO: renamed from: i */
    public boolean f2799i;

    /* JADX INFO: renamed from: j */
    public boolean f2800j;

    /* JADX INFO: renamed from: k */
    public Rect f2801k;

    /* JADX INFO: renamed from: l */
    public boolean f2802l;

    /* JADX INFO: renamed from: m */
    public boolean f2803m;

    /* JADX INFO: renamed from: n */
    public int f2804n;

    /* JADX INFO: renamed from: o */
    public int f2805o;

    /* JADX INFO: renamed from: p */
    public int f2806p;

    /* JADX INFO: renamed from: q */
    public int f2807q;

    /* JADX INFO: renamed from: r */
    public boolean f2808r;

    /* JADX INFO: renamed from: s */
    public int f2809s;

    /* JADX INFO: renamed from: t */
    public boolean f2810t;

    /* JADX INFO: renamed from: u */
    public boolean f2811u;

    /* JADX INFO: renamed from: v */
    public boolean f2812v;

    /* JADX INFO: renamed from: w */
    public boolean f2813w;

    /* JADX INFO: renamed from: x */
    public int f2814x;

    /* JADX INFO: renamed from: y */
    public int f2815y;

    /* JADX INFO: renamed from: z */
    public int f2816z;

    public C0706b(C0706b c0706b, C0709e c0709e, Resources resources) {
        this.f2799i = false;
        this.f2802l = false;
        this.f2813w = true;
        this.f2815y = 0;
        this.f2816z = 0;
        this.f2791a = c0709e;
        this.f2792b = resources != null ? resources : c0706b != null ? c0706b.f2792b : null;
        int i2 = c0706b != null ? c0706b.f2793c : 0;
        int i3 = AbstractC0711g.f2831m;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        i2 = i2 == 0 ? 160 : i2;
        this.f2793c = i2;
        if (c0706b != null) {
            this.f2794d = c0706b.f2794d;
            this.f2795e = c0706b.f2795e;
            this.f2811u = true;
            this.f2812v = true;
            this.f2799i = c0706b.f2799i;
            this.f2802l = c0706b.f2802l;
            this.f2813w = c0706b.f2813w;
            this.f2814x = c0706b.f2814x;
            this.f2815y = c0706b.f2815y;
            this.f2816z = c0706b.f2816z;
            this.f2781A = c0706b.f2781A;
            this.f2782B = c0706b.f2782B;
            this.f2783C = c0706b.f2783C;
            this.f2784D = c0706b.f2784D;
            this.f2785E = c0706b.f2785E;
            this.f2786F = c0706b.f2786F;
            this.f2787G = c0706b.f2787G;
            if (c0706b.f2793c == i2) {
                if (c0706b.f2800j) {
                    this.f2801k = c0706b.f2801k != null ? new Rect(c0706b.f2801k) : null;
                    this.f2800j = true;
                }
                if (c0706b.f2803m) {
                    this.f2804n = c0706b.f2804n;
                    this.f2805o = c0706b.f2805o;
                    this.f2806p = c0706b.f2806p;
                    this.f2807q = c0706b.f2807q;
                    this.f2803m = true;
                }
            }
            if (c0706b.f2808r) {
                this.f2809s = c0706b.f2809s;
                this.f2808r = true;
            }
            if (c0706b.f2810t) {
                this.f2810t = true;
            }
            Drawable[] drawableArr = c0706b.f2797g;
            this.f2797g = new Drawable[drawableArr.length];
            this.f2798h = c0706b.f2798h;
            SparseArray sparseArray = c0706b.f2796f;
            if (sparseArray != null) {
                this.f2796f = sparseArray.clone();
            } else {
                this.f2796f = new SparseArray(this.f2798h);
            }
            int i4 = this.f2798h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f2796f.put(i5, constantState);
                    } else {
                        this.f2797g[i5] = drawableArr[i5];
                    }
                }
            }
        } else {
            this.f2797g = new Drawable[10];
            this.f2798h = 0;
        }
        if (c0706b != null) {
            this.f2788H = c0706b.f2788H;
        } else {
            this.f2788H = new int[this.f2797g.length][];
        }
        if (c0706b != null) {
            this.f2789I = c0706b.f2789I;
            this.f2790J = c0706b.f2790J;
        } else {
            this.f2789I = new C1029h();
            this.f2790J = new C1032k();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1952a(Drawable drawable) {
        int i2 = this.f2798h;
        if (i2 >= this.f2797g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f2797g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f2797g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f2788H, 0, iArr, 0, i2);
            this.f2788H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f2791a);
        this.f2797g[i2] = drawable;
        this.f2798h++;
        this.f2795e = drawable.getChangingConfigurations() | this.f2795e;
        this.f2808r = false;
        this.f2810t = false;
        this.f2801k = null;
        this.f2800j = false;
        this.f2803m = false;
        this.f2811u = false;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1953b() {
        this.f2803m = true;
        m1954c();
        int i2 = this.f2798h;
        Drawable[] drawableArr = this.f2797g;
        this.f2805o = -1;
        this.f2804n = -1;
        this.f2807q = 0;
        this.f2806p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f2804n) {
                this.f2804n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f2805o) {
                this.f2805o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f2806p) {
                this.f2806p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f2807q) {
                this.f2807q = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1954c() {
        SparseArray sparseArray = this.f2796f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f2796f.keyAt(i2);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2796f.valueAt(i2);
                Drawable[] drawableArr = this.f2797g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f2792b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC0016e.m200w0(drawableNewDrawable, this.f2814x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f2791a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f2796f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i2 = this.f2798h;
        Drawable[] drawableArr = this.f2797g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2796f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC0092a.m423b(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m1955d(int i2) {
        int iIndexOfKey;
        Drawable drawable = this.f2797g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f2796f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2796f.valueAt(iIndexOfKey)).newDrawable(this.f2792b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0016e.m200w0(drawableNewDrawable, this.f2814x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f2791a);
        this.f2797g[i2] = drawableMutate;
        this.f2796f.removeAt(iIndexOfKey);
        if (this.f2796f.size() == 0) {
            this.f2796f = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: e */
    public final int m1956e(int i2) {
        Object obj;
        if (i2 < 0) {
            return 0;
        }
        C1032k c1032k = this.f2790J;
        Object obj2 = 0;
        int iM2499a = AbstractC1034a.m2499a(c1032k.f4107c, i2, c1032k.f4105a);
        if (iM2499a >= 0 && (obj = c1032k.f4106b[iM2499a]) != AbstractC1030i.f4101b) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m1957f(int[] iArr) {
        int[][] iArr2 = this.f2788H;
        int i2 = this.f2798h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2794d | this.f2795e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0709e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0709e(this, resources);
    }
}
