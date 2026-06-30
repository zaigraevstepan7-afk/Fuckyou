package p074l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.reddit.frontpage.R;
import p023M0.C0217w;
import p072k.ViewTreeObserverOnGlobalLayoutListenerC0807d;

/* JADX INFO: renamed from: l.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0893P extends C0884K0 implements InterfaceC0898S {

    /* JADX INFO: renamed from: D */
    public CharSequence f3590D;

    /* JADX INFO: renamed from: E */
    public C0889N f3591E;

    /* JADX INFO: renamed from: F */
    public final Rect f3592F;

    /* JADX INFO: renamed from: G */
    public int f3593G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0900T f3594H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893P(C0900T c0900t, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        this.f3594H = c0900t;
        this.f3592F = new Rect();
        this.f3566o = c0900t;
        this.f3576y = true;
        this.f3577z.setFocusable(true);
        this.f3567p = new C0217w(1, this);
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: b */
    public final CharSequence mo2301b() {
        return this.f3590D;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: f */
    public final void mo2304f(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C0867C c0867c = this.f3577z;
        boolean zIsShowing = c0867c.isShowing();
        m2314r();
        this.f3577z.setInputMethodMode(2);
        mo2150i();
        C0980x0 c0980x0 = this.f3554c;
        c0980x0.setChoiceMode(1);
        c0980x0.setTextDirection(i2);
        c0980x0.setTextAlignment(i3);
        C0900T c0900t = this.f3594H;
        int selectedItemPosition = c0900t.getSelectedItemPosition();
        C0980x0 c0980x02 = this.f3554c;
        if (c0867c.isShowing() && c0980x02 != null) {
            c0980x02.setListSelectionHidden(false);
            c0980x02.setSelection(selectedItemPosition);
            if (c0980x02.getChoiceMode() != 0) {
                c0980x02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0900t.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0807d viewTreeObserverOnGlobalLayoutListenerC0807d = new ViewTreeObserverOnGlobalLayoutListenerC0807d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0807d);
        this.f3577z.setOnDismissListener(new C0891O(this, viewTreeObserverOnGlobalLayoutListenerC0807d));
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: h */
    public final void mo2305h(CharSequence charSequence) {
        this.f3590D = charSequence;
    }

    @Override // p074l.C0884K0, p074l.InterfaceC0898S
    /* JADX INFO: renamed from: n */
    public final void mo2296n(ListAdapter listAdapter) {
        super.mo2296n(listAdapter);
        this.f3591E = (C0889N) listAdapter;
    }

    @Override // p074l.InterfaceC0898S
    /* JADX INFO: renamed from: o */
    public final void mo2310o(int i2) {
        this.f3593G = i2;
    }

    /* JADX INFO: renamed from: r */
    public final void m2314r() {
        int i2;
        C0867C c0867c = this.f3577z;
        Drawable background = c0867c.getBackground();
        C0900T c0900t = this.f3594H;
        if (background != null) {
            background.getPadding(c0900t.f3617h);
            boolean z2 = AbstractC0970s1.f3845a;
            int layoutDirection = c0900t.getLayoutDirection();
            Rect rect = c0900t.f3617h;
            i2 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0900t.f3617h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = c0900t.getPaddingLeft();
        int paddingRight = c0900t.getPaddingRight();
        int width = c0900t.getWidth();
        int i3 = c0900t.f3616g;
        if (i3 == -2) {
            int iM2330a = c0900t.m2330a(this.f3591E, c0867c.getBackground());
            int i4 = c0900t.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0900t.f3617h;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iM2330a > i5) {
                iM2330a = i5;
            }
            m2298q(Math.max(iM2330a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m2298q((width - paddingLeft) - paddingRight);
        } else {
            m2298q(i3);
        }
        boolean z3 = AbstractC0970s1.f3845a;
        this.f3557f = c0900t.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3556e) - this.f3593G) + i2 : paddingLeft + this.f3593G + i2;
    }
}
