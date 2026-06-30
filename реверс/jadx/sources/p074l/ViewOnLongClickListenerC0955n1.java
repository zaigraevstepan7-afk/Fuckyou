package p074l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.reddit.frontpage.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p024N.AbstractC0240S;
import p024N.AbstractC0242U;
import p024N.AbstractC0244W;

/* JADX INFO: renamed from: l.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC0955n1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k */
    public static ViewOnLongClickListenerC0955n1 f3795k;

    /* JADX INFO: renamed from: l */
    public static ViewOnLongClickListenerC0955n1 f3796l;

    /* JADX INFO: renamed from: a */
    public final View f3797a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f3798b;

    /* JADX INFO: renamed from: c */
    public final int f3799c;

    /* JADX INFO: renamed from: d */
    public final RunnableC0952m1 f3800d;

    /* JADX INFO: renamed from: e */
    public final RunnableC0952m1 f3801e;

    /* JADX INFO: renamed from: f */
    public int f3802f;

    /* JADX INFO: renamed from: g */
    public int f3803g;

    /* JADX INFO: renamed from: h */
    public C0958o1 f3804h;

    /* JADX INFO: renamed from: i */
    public boolean f3805i;

    /* JADX INFO: renamed from: j */
    public boolean f3806j;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.m1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.m1] */
    public ViewOnLongClickListenerC0955n1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f3800d = new Runnable(this) { // from class: l.m1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC0955n1 f3794b;

            {
                this.f3794b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f3794b.m2402c(false);
                        break;
                    default:
                        this.f3794b.m2401a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f3801e = new Runnable(this) { // from class: l.m1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC0955n1 f3794b;

            {
                this.f3794b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f3794b.m2402c(false);
                        break;
                    default:
                        this.f3794b.m2401a();
                        break;
                }
            }
        };
        this.f3797a = view;
        this.f3798b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0244W.f784a;
        this.f3799c = Build.VERSION.SDK_INT >= 28 ? AbstractC0242U.m791a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3806j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m2400b(ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n1) {
        ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n12 = f3795k;
        if (viewOnLongClickListenerC0955n12 != null) {
            viewOnLongClickListenerC0955n12.f3797a.removeCallbacks(viewOnLongClickListenerC0955n12.f3800d);
        }
        f3795k = viewOnLongClickListenerC0955n1;
        if (viewOnLongClickListenerC0955n1 != null) {
            viewOnLongClickListenerC0955n1.f3797a.postDelayed(viewOnLongClickListenerC0955n1.f3800d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2401a() {
        ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n1 = f3796l;
        View view = this.f3797a;
        if (viewOnLongClickListenerC0955n1 == this) {
            f3796l = null;
            C0958o1 c0958o1 = this.f3804h;
            if (c0958o1 != null) {
                View view2 = c0958o1.f3812b;
                if (view2.getParent() != null) {
                    ((WindowManager) c0958o1.f3811a.getSystemService("window")).removeView(view2);
                }
                this.f3804h = null;
                this.f3806j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3795k == this) {
            m2400b(null);
        }
        view.removeCallbacks(this.f3801e);
    }

    /* JADX INFO: renamed from: c */
    public final void m2402c(boolean z2) {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        long longPressTimeout;
        long j2;
        long j3;
        View view = this.f3797a;
        if (view.isAttachedToWindow()) {
            m2400b(null);
            ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n1 = f3796l;
            if (viewOnLongClickListenerC0955n1 != null) {
                viewOnLongClickListenerC0955n1.m2401a();
            }
            f3796l = this;
            this.f3805i = z2;
            C0958o1 c0958o1 = new C0958o1(view.getContext());
            this.f3804h = c0958o1;
            int width = this.f3802f;
            int i6 = this.f3803g;
            boolean z3 = this.f3805i;
            View view2 = c0958o1.f3812b;
            ViewParent parent = view2.getParent();
            Context context = c0958o1.f3811a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c0958o1.f3813c.setText(this.f3798b);
            WindowManager.LayoutParams layoutParams = c0958o1.f3814d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.resc);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.resc);
                height = i6 + dimensionPixelOffset2;
                i2 = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.resc : R.dimen.resc);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = c0958o1.f3815e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = width;
                    i4 = i2;
                    i5 = 0;
                    c2 = 1;
                } else {
                    Resources resources = context.getResources();
                    c2 = 1;
                    i3 = width;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c0958o1.f3817g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c0958o1.f3816f;
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i7;
                iArr2[c2] = iArr2[c2] - iArr[c2];
                layoutParams.x = (i7 + i3) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[c2];
                int i9 = ((i8 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i9 >= 0) {
                        layoutParams.y = i9;
                    } else {
                        layoutParams.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i9;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f3805i) {
                j3 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC0952m1 runnableC0952m1 = this.f3801e;
            view.removeCallbacks(runnableC0952m1);
            view.postDelayed(runnableC0952m1, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3804h == null || !this.f3805i) {
            View view2 = this.f3797a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f3806j = true;
                        m2401a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f3804h == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (!this.f3806j) {
                        int iAbs = Math.abs(x2 - this.f3802f);
                        int i2 = this.f3799c;
                        if (iAbs > i2 || Math.abs(y2 - this.f3803g) > i2) {
                            this.f3802f = x2;
                            this.f3803g = y2;
                            this.f3806j = false;
                            m2400b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f3802f = view.getWidth() / 2;
        this.f3803g = view.getHeight() / 2;
        m2402c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m2401a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
