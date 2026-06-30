package p029P0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import p005C0.C0045k;
import p005C0.InterfaceC0044j;
import p010F0.C0089d;
import p015I0.C0110f;
import p015I0.C0112h;
import p015I0.C0113i;
import p015I0.C0116l;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0325b extends C0112h implements InterfaceC0044j {

    /* JADX INFO: renamed from: A */
    public final C0045k f918A;

    /* JADX INFO: renamed from: B */
    public final ViewOnLayoutChangeListenerC0324a f919B;

    /* JADX INFO: renamed from: C */
    public final Rect f920C;

    /* JADX INFO: renamed from: D */
    public int f921D;

    /* JADX INFO: renamed from: E */
    public int f922E;

    /* JADX INFO: renamed from: F */
    public int f923F;

    /* JADX INFO: renamed from: G */
    public int f924G;

    /* JADX INFO: renamed from: H */
    public boolean f925H;

    /* JADX INFO: renamed from: I */
    public int f926I;

    /* JADX INFO: renamed from: J */
    public int f927J;

    /* JADX INFO: renamed from: K */
    public float f928K;

    /* JADX INFO: renamed from: L */
    public float f929L;

    /* JADX INFO: renamed from: M */
    public float f930M;

    /* JADX INFO: renamed from: N */
    public float f931N;

    /* JADX INFO: renamed from: x */
    public CharSequence f932x;

    /* JADX INFO: renamed from: y */
    public final Context f933y;

    /* JADX INFO: renamed from: z */
    public final Paint.FontMetrics f934z;

    public C0325b(Context context, int i2) {
        super(context, null, 0, i2);
        this.f934z = new Paint.FontMetrics();
        C0045k c0045k = new C0045k(this);
        this.f918A = c0045k;
        this.f919B = new ViewOnLayoutChangeListenerC0324a(0, this);
        this.f920C = new Rect();
        this.f928K = 1.0f;
        this.f929L = 1.0f;
        this.f930M = 0.5f;
        this.f931N = 1.0f;
        this.f933y = context;
        TextPaint textPaint = c0045k.f164a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // p015I0.C0112h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fM983t = m983t();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f926I)) - ((double) this.f926I)));
        canvas.scale(this.f928K, this.f929L, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f930M) + getBounds().top);
        canvas.translate(fM983t, f);
        super.draw(canvas);
        if (this.f932x == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            C0045k c0045k = this.f918A;
            TextPaint textPaint = c0045k.f164a;
            Paint.FontMetrics fontMetrics = this.f934z;
            textPaint.getFontMetrics(fontMetrics);
            int i2 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            C0089d c0089d = c0045k.f169f;
            TextPaint textPaint2 = c0045k.f164a;
            if (c0089d != null) {
                textPaint2.drawableState = getState();
                c0045k.f169f.m384e(this.f933y, textPaint2, c0045k.f165b);
                textPaint2.setAlpha((int) (this.f931N * 255.0f));
            }
            CharSequence charSequence = this.f932x;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i2, textPaint2);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f918A.f164a.getTextSize(), this.f923F);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f921D * 2;
        CharSequence charSequence = this.f932x;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f918A.m270a(charSequence.toString())), this.f922E);
    }

    @Override // p015I0.C0112h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f925H) {
            C0116l c0116lM495e = this.f346a.f328a.m495e();
            c0116lM495e.f381k = m984u();
            setShapeAppearanceModel(c0116lM495e.m489a());
        }
    }

    /* JADX INFO: renamed from: t */
    public final float m983t() {
        int i2;
        Rect rect = this.f920C;
        if (((rect.right - getBounds().right) - this.f927J) - this.f924G < 0) {
            i2 = ((rect.right - getBounds().right) - this.f927J) - this.f924G;
        } else {
            if (((rect.left - getBounds().left) - this.f927J) + this.f924G <= 0) {
                return 0.0f;
            }
            i2 = ((rect.left - getBounds().left) - this.f927J) + this.f924G;
        }
        return i2;
    }

    /* JADX INFO: renamed from: u */
    public final C0113i m984u() {
        float f = -m983t();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f926I)))) / 2.0f;
        return new C0113i(new C0110f(this.f926I), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
