package p066g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: g0.L */
/* JADX INFO: loaded from: classes.dex */
public class C0724L extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0741b0 f2876a;

    /* JADX INFO: renamed from: b */
    public final Rect f2877b;

    /* JADX INFO: renamed from: c */
    public boolean f2878c;

    /* JADX INFO: renamed from: d */
    public boolean f2879d;

    public C0724L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2877b = new Rect();
        this.f2878c = true;
        this.f2879d = false;
    }

    public C0724L(int i2, int i3) {
        super(i2, i3);
        this.f2877b = new Rect();
        this.f2878c = true;
        this.f2879d = false;
    }

    public C0724L(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2877b = new Rect();
        this.f2878c = true;
        this.f2879d = false;
    }

    public C0724L(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2877b = new Rect();
        this.f2878c = true;
        this.f2879d = false;
    }

    public C0724L(C0724L c0724l) {
        super((ViewGroup.LayoutParams) c0724l);
        this.f2877b = new Rect();
        this.f2878c = true;
        this.f2879d = false;
    }
}
