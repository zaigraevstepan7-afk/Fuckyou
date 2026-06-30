package p015I0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p003B0.C0019a;

/* JADX INFO: renamed from: I0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0111g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C0117m f328a;

    /* JADX INFO: renamed from: b */
    public C0019a f329b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f330c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f331d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f332e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f333f;

    /* JADX INFO: renamed from: g */
    public Rect f334g;

    /* JADX INFO: renamed from: h */
    public final float f335h;

    /* JADX INFO: renamed from: i */
    public float f336i;

    /* JADX INFO: renamed from: j */
    public float f337j;

    /* JADX INFO: renamed from: k */
    public int f338k;

    /* JADX INFO: renamed from: l */
    public float f339l;

    /* JADX INFO: renamed from: m */
    public float f340m;

    /* JADX INFO: renamed from: n */
    public int f341n;

    /* JADX INFO: renamed from: o */
    public int f342o;

    /* JADX INFO: renamed from: p */
    public int f343p;

    /* JADX INFO: renamed from: q */
    public final Paint.Style f344q;

    public C0111g(C0117m c0117m) {
        this.f330c = null;
        this.f331d = null;
        this.f332e = null;
        this.f333f = PorterDuff.Mode.SRC_IN;
        this.f334g = null;
        this.f335h = 1.0f;
        this.f336i = 1.0f;
        this.f338k = 255;
        this.f339l = 0.0f;
        this.f340m = 0.0f;
        this.f341n = 0;
        this.f342o = 0;
        this.f343p = 0;
        this.f344q = Paint.Style.FILL_AND_STROKE;
        this.f328a = c0117m;
        this.f329b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0112h c0112h = new C0112h(this);
        c0112h.f350e = true;
        return c0112h;
    }

    public C0111g(C0111g c0111g) {
        this.f330c = null;
        this.f331d = null;
        this.f332e = null;
        this.f333f = PorterDuff.Mode.SRC_IN;
        this.f334g = null;
        this.f335h = 1.0f;
        this.f336i = 1.0f;
        this.f338k = 255;
        this.f339l = 0.0f;
        this.f340m = 0.0f;
        this.f341n = 0;
        this.f342o = 0;
        this.f343p = 0;
        this.f344q = Paint.Style.FILL_AND_STROKE;
        this.f328a = c0111g.f328a;
        this.f329b = c0111g.f329b;
        this.f337j = c0111g.f337j;
        this.f330c = c0111g.f330c;
        this.f331d = c0111g.f331d;
        this.f333f = c0111g.f333f;
        this.f332e = c0111g.f332e;
        this.f338k = c0111g.f338k;
        this.f335h = c0111g.f335h;
        this.f343p = c0111g.f343p;
        this.f341n = c0111g.f341n;
        this.f336i = c0111g.f336i;
        this.f339l = c0111g.f339l;
        this.f340m = c0111g.f340m;
        this.f342o = c0111g.f342o;
        this.f344q = c0111g.f344q;
        if (c0111g.f334g != null) {
            this.f334g = new Rect(c0111g.f334g);
        }
    }
}
