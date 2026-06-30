package p066g0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: g0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0721I {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0723K f2856b;

    public /* synthetic */ C0721I(AbstractC0723K abstractC0723K, int i2) {
        this.f2855a = i2;
        this.f2856b = abstractC0723K;
    }

    /* JADX INFO: renamed from: a */
    public final int m1984a(View view) {
        switch (this.f2855a) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                this.f2856b.getClass();
                return view.getRight() + ((C0724L) view.getLayoutParams()).f2877b.right + ((ViewGroup.MarginLayoutParams) c0724l).rightMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                this.f2856b.getClass();
                return view.getBottom() + ((C0724L) view.getLayoutParams()).f2877b.bottom + ((ViewGroup.MarginLayoutParams) c0724l2).bottomMargin;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1985b(View view) {
        switch (this.f2855a) {
            case 0:
                C0724L c0724l = (C0724L) view.getLayoutParams();
                this.f2856b.getClass();
                return (view.getLeft() - ((C0724L) view.getLayoutParams()).f2877b.left) - ((ViewGroup.MarginLayoutParams) c0724l).leftMargin;
            default:
                C0724L c0724l2 = (C0724L) view.getLayoutParams();
                this.f2856b.getClass();
                return (view.getTop() - ((C0724L) view.getLayoutParams()).f2877b.top) - ((ViewGroup.MarginLayoutParams) c0724l2).topMargin;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1986c() {
        switch (this.f2855a) {
            case 0:
                AbstractC0723K abstractC0723K = this.f2856b;
                return abstractC0723K.f2874n - abstractC0723K.m2000E();
            default:
                AbstractC0723K abstractC0723K2 = this.f2856b;
                return abstractC0723K2.f2875o - abstractC0723K2.m1998C();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1987d() {
        switch (this.f2855a) {
            case 0:
                return this.f2856b.m1999D();
            default:
                return this.f2856b.m2001F();
        }
    }
}
