package p066g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0493g;

/* JADX INFO: renamed from: g0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0773x extends AbstractC0493g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0773x(AbstractC0723K abstractC0723K, int i2) {
        super(abstractC0723K);
        this.f3141d = i2;
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: b */
    public final int mo1289b(View view) {
        switch (this.f3141d) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return view.getRight() + ((C0724L) view.getLayoutParams()).f2877b.right + ((ViewGroup.MarginLayoutParams) c0724l).rightMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return view.getBottom() + ((C0724L) view.getLayoutParams()).f2877b.bottom + ((ViewGroup.MarginLayoutParams) c0724l2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: c */
    public final int mo1290c(View view) {
        switch (this.f3141d) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return AbstractC0723K.m1988A(view) + ((ViewGroup.MarginLayoutParams) c0724l).leftMargin + ((ViewGroup.MarginLayoutParams) c0724l).rightMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return AbstractC0723K.m1995z(view) + ((ViewGroup.MarginLayoutParams) c0724l2).topMargin + ((ViewGroup.MarginLayoutParams) c0724l2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: d */
    public final int mo1291d(View view) {
        switch (this.f3141d) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return AbstractC0723K.m1995z(view) + ((ViewGroup.MarginLayoutParams) c0724l).topMargin + ((ViewGroup.MarginLayoutParams) c0724l).bottomMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return AbstractC0723K.m1988A(view) + ((ViewGroup.MarginLayoutParams) c0724l2).leftMargin + ((ViewGroup.MarginLayoutParams) c0724l2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: e */
    public final int mo1292e(View view) {
        switch (this.f3141d) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return (view.getLeft() - ((C0724L) view.getLayoutParams()).f2877b.left) - ((ViewGroup.MarginLayoutParams) c0724l).leftMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                ((AbstractC0723K) this.f1517b).getClass();
                return (view.getTop() - ((C0724L) view.getLayoutParams()).f2877b.top) - ((ViewGroup.MarginLayoutParams) c0724l2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: f */
    public final int mo1293f() {
        switch (this.f3141d) {
            case 0:
                return ((AbstractC0723K) this.f1517b).f2874n;
            default:
                return ((AbstractC0723K) this.f1517b).f2875o;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: g */
    public final int mo1294g() {
        switch (this.f3141d) {
            case 0:
                AbstractC0723K abstractC0723K = (AbstractC0723K) this.f1517b;
                return abstractC0723K.f2874n - abstractC0723K.m2000E();
            default:
                AbstractC0723K abstractC0723K2 = (AbstractC0723K) this.f1517b;
                return abstractC0723K2.f2875o - abstractC0723K2.m1998C();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: h */
    public final int mo1295h() {
        switch (this.f3141d) {
            case 0:
                return ((AbstractC0723K) this.f1517b).m2000E();
            default:
                return ((AbstractC0723K) this.f1517b).m1998C();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: i */
    public final int mo1296i() {
        switch (this.f3141d) {
            case 0:
                return ((AbstractC0723K) this.f1517b).f2872l;
            default:
                return ((AbstractC0723K) this.f1517b).f2873m;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: j */
    public final int mo1297j() {
        switch (this.f3141d) {
            case 0:
                return ((AbstractC0723K) this.f1517b).f2873m;
            default:
                return ((AbstractC0723K) this.f1517b).f2872l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: k */
    public final int mo1298k() {
        switch (this.f3141d) {
            case 0:
                return ((AbstractC0723K) this.f1517b).m1999D();
            default:
                return ((AbstractC0723K) this.f1517b).m2001F();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: l */
    public final int mo1299l() {
        switch (this.f3141d) {
            case 0:
                AbstractC0723K abstractC0723K = (AbstractC0723K) this.f1517b;
                return (abstractC0723K.f2874n - abstractC0723K.m1999D()) - abstractC0723K.m2000E();
            default:
                AbstractC0723K abstractC0723K2 = (AbstractC0723K) this.f1517b;
                return (abstractC0723K2.f2875o - abstractC0723K2.m2001F()) - abstractC0723K2.m1998C();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: m */
    public final int mo1300m(View view) {
        switch (this.f3141d) {
            case 0:
                AbstractC0723K abstractC0723K = (AbstractC0723K) this.f1517b;
                Rect rect = (Rect) this.f1518c;
                abstractC0723K.m2002J(view, rect);
                return rect.right;
            default:
                AbstractC0723K abstractC0723K2 = (AbstractC0723K) this.f1517b;
                Rect rect2 = (Rect) this.f1518c;
                abstractC0723K2.m2002J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: n */
    public final int mo1301n(View view) {
        switch (this.f3141d) {
            case 0:
                AbstractC0723K abstractC0723K = (AbstractC0723K) this.f1517b;
                Rect rect = (Rect) this.f1518c;
                abstractC0723K.m2002J(view, rect);
                return rect.left;
            default:
                AbstractC0723K abstractC0723K2 = (AbstractC0723K) this.f1517b;
                Rect rect2 = (Rect) this.f1518c;
                abstractC0723K2.m2002J(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0493g
    /* JADX INFO: renamed from: o */
    public final void mo1302o(int i2) {
        switch (this.f3141d) {
            case 0:
                ((AbstractC0723K) this.f1517b).mo1662O(i2);
                break;
            default:
                ((AbstractC0723K) this.f1517b).mo1664P(i2);
                break;
        }
    }
}
