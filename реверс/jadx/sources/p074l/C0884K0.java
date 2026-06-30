package p074l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p072k.InterfaceC0801C;

/* JADX INFO: renamed from: l.K0 */
/* JADX INFO: loaded from: classes.dex */
public class C0884K0 implements InterfaceC0801C {

    /* JADX INFO: renamed from: A */
    public static final Method f3549A;

    /* JADX INFO: renamed from: B */
    public static final Method f3550B;

    /* JADX INFO: renamed from: C */
    public static final Method f3551C;

    /* JADX INFO: renamed from: a */
    public final Context f3552a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f3553b;

    /* JADX INFO: renamed from: c */
    public C0980x0 f3554c;

    /* JADX INFO: renamed from: f */
    public int f3557f;

    /* JADX INFO: renamed from: g */
    public int f3558g;

    /* JADX INFO: renamed from: i */
    public boolean f3560i;

    /* JADX INFO: renamed from: j */
    public boolean f3561j;

    /* JADX INFO: renamed from: k */
    public boolean f3562k;

    /* JADX INFO: renamed from: n */
    public C0878H0 f3565n;

    /* JADX INFO: renamed from: o */
    public View f3566o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f3567p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f3568q;

    /* JADX INFO: renamed from: v */
    public final Handler f3573v;

    /* JADX INFO: renamed from: x */
    public Rect f3575x;

    /* JADX INFO: renamed from: y */
    public boolean f3576y;

    /* JADX INFO: renamed from: z */
    public final C0867C f3577z;

    /* JADX INFO: renamed from: d */
    public final int f3555d = -2;

    /* JADX INFO: renamed from: e */
    public int f3556e = -2;

    /* JADX INFO: renamed from: h */
    public final int f3559h = 1002;

    /* JADX INFO: renamed from: l */
    public int f3563l = 0;

    /* JADX INFO: renamed from: m */
    public final int f3564m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final RunnableC0876G0 f3569r = new RunnableC0876G0(this, 1);

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0882J0 f3570s = new ViewOnTouchListenerC0882J0(this);

    /* JADX INFO: renamed from: t */
    public final C0880I0 f3571t = new C0880I0(this);

    /* JADX INFO: renamed from: u */
    public final RunnableC0876G0 f3572u = new RunnableC0876G0(this, 0);

    /* JADX INFO: renamed from: w */
    public final Rect f3574w = new Rect();

    static {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i2 <= 28) {
            try {
                f3549A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3551C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f3550B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0884K0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f3552a = context;
        this.f3573v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2494o, i2, 0);
        this.f3557f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3558g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3560i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0867C c0867c = new C0867C(context, attributeSet, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2498s, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0383m.m1039e0(c0867c, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0867c.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0383m.m1057w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f3577z = c0867c;
        c0867c.setInputMethodMode(1);
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: a */
    public final boolean mo2148a() {
        return this.f3577z.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final void m2290c(int i2) {
        this.f3557f = i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m2291d() {
        return this.f3557f;
    }

    @Override // p072k.InterfaceC0801C
    public final void dismiss() {
        C0867C c0867c = this.f3577z;
        c0867c.dismiss();
        c0867c.setContentView(null);
        this.f3554c = null;
        this.f3573v.removeCallbacks(this.f3569r);
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: e */
    public final C0980x0 mo2149e() {
        return this.f3554c;
    }

    @Override // p072k.InterfaceC0801C
    /* JADX INFO: renamed from: i */
    public final void mo2150i() {
        int i2;
        int iM2283a;
        int paddingBottom;
        C0980x0 c0980x0;
        C0980x0 c0980x02 = this.f3554c;
        C0867C c0867c = this.f3577z;
        Context context = this.f3552a;
        if (c0980x02 == null) {
            C0980x0 c0980x0Mo2297p = mo2297p(context, !this.f3576y);
            this.f3554c = c0980x0Mo2297p;
            c0980x0Mo2297p.setAdapter(this.f3553b);
            this.f3554c.setOnItemClickListener(this.f3567p);
            this.f3554c.setFocusable(true);
            this.f3554c.setFocusableInTouchMode(true);
            this.f3554c.setOnItemSelectedListener(new C0870D0(this));
            this.f3554c.setOnScrollListener(this.f3571t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3568q;
            if (onItemSelectedListener != null) {
                this.f3554c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0867c.setContentView(this.f3554c);
        }
        Drawable background = c0867c.getBackground();
        Rect rect = this.f3574w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f3560i) {
                this.f3558g = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        boolean z2 = c0867c.getInputMethodMode() == 2;
        View view = this.f3566o;
        int i4 = this.f3558g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f3550B;
            if (method != null) {
                try {
                    iM2283a = ((Integer) method.invoke(c0867c, view, Integer.valueOf(i4), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iM2283a = c0867c.getMaxAvailableHeight(view, i4);
                }
            } else {
                iM2283a = c0867c.getMaxAvailableHeight(view, i4);
            }
        } else {
            iM2283a = AbstractC0872E0.m2283a(c0867c, view, i4, z2);
        }
        int i5 = this.f3555d;
        if (i5 == -1) {
            paddingBottom = iM2283a + i2;
        } else {
            int i6 = this.f3556e;
            int iM2434a = this.f3554c.m2434a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM2283a);
            paddingBottom = iM2434a + (iM2434a > 0 ? this.f3554c.getPaddingBottom() + this.f3554c.getPaddingTop() + i2 : 0);
        }
        boolean z3 = this.f3577z.getInputMethodMode() == 2;
        AbstractC0383m.m1044h0(c0867c, this.f3559h);
        if (c0867c.isShowing()) {
            if (this.f3566o.isAttachedToWindow()) {
                int width = this.f3556e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f3566o.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c0867c.setWidth(this.f3556e == -1 ? -1 : 0);
                        c0867c.setHeight(0);
                    } else {
                        c0867c.setWidth(this.f3556e == -1 ? -1 : 0);
                        c0867c.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c0867c.setOutsideTouchable(true);
                int i7 = width;
                View view2 = this.f3566o;
                int i8 = this.f3557f;
                int i9 = this.f3558g;
                if (i7 < 0) {
                    i7 = -1;
                }
                c0867c.update(view2, i8, i9, i7, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.f3556e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f3566o.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c0867c.setWidth(width2);
        c0867c.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3549A;
            if (method2 != null) {
                try {
                    method2.invoke(c0867c, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0874F0.m2285b(c0867c, true);
        }
        c0867c.setOutsideTouchable(true);
        c0867c.setTouchInterceptor(this.f3570s);
        if (this.f3562k) {
            AbstractC0383m.m1039e0(c0867c, this.f3561j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f3551C;
            if (method3 != null) {
                try {
                    method3.invoke(c0867c, this.f3575x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0874F0.m2284a(c0867c, this.f3575x);
        }
        c0867c.showAsDropDown(this.f3566o, this.f3557f, this.f3558g, this.f3563l);
        this.f3554c.setSelection(-1);
        if ((!this.f3576y || this.f3554c.isInTouchMode()) && (c0980x0 = this.f3554c) != null) {
            c0980x0.setListSelectionHidden(true);
            c0980x0.requestLayout();
        }
        if (this.f3576y) {
            return;
        }
        this.f3573v.post(this.f3572u);
    }

    /* JADX INFO: renamed from: j */
    public final int m2292j() {
        if (this.f3560i) {
            return this.f3558g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2293k(Drawable drawable) {
        this.f3577z.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: l */
    public final void m2294l(int i2) {
        this.f3558g = i2;
        this.f3560i = true;
    }

    /* JADX INFO: renamed from: m */
    public final Drawable m2295m() {
        return this.f3577z.getBackground();
    }

    /* JADX INFO: renamed from: n */
    public void mo2296n(ListAdapter listAdapter) {
        C0878H0 c0878h0 = this.f3565n;
        if (c0878h0 == null) {
            this.f3565n = new C0878H0(this);
        } else {
            ListAdapter listAdapter2 = this.f3553b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0878h0);
            }
        }
        this.f3553b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3565n);
        }
        C0980x0 c0980x0 = this.f3554c;
        if (c0980x0 != null) {
            c0980x0.setAdapter(this.f3553b);
        }
    }

    /* JADX INFO: renamed from: p */
    public C0980x0 mo2297p(Context context, boolean z2) {
        return new C0980x0(context, z2);
    }

    /* JADX INFO: renamed from: q */
    public final void m2298q(int i2) {
        Drawable background = this.f3577z.getBackground();
        if (background == null) {
            this.f3556e = i2;
            return;
        }
        Rect rect = this.f3574w;
        background.getPadding(rect);
        this.f3556e = rect.left + rect.right + i2;
    }
}
