package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p024N.AbstractC0240S;
import p079n0.AbstractC1013a;
import p081o0.AbstractC1015a;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f2430a;

    /* JADX INFO: renamed from: b */
    public boolean f2431b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2432c;

    /* JADX INFO: renamed from: d */
    public final int f2433d;

    /* JADX INFO: renamed from: e */
    public final float f2434e;

    /* JADX INFO: renamed from: f */
    public final Paint f2435f;

    /* JADX INFO: renamed from: g */
    public final RectF f2436g;

    /* JADX INFO: renamed from: h */
    public final int f2437h;

    /* JADX INFO: renamed from: i */
    public float f2438i;

    /* JADX INFO: renamed from: j */
    public boolean f2439j;

    /* JADX INFO: renamed from: k */
    public double f2440k;

    /* JADX INFO: renamed from: l */
    public int f2441l;

    /* JADX INFO: renamed from: m */
    public int f2442m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        this.f2430a = new ValueAnimator();
        this.f2432c = new ArrayList();
        Paint paint = new Paint();
        this.f2435f = paint;
        this.f2436g = new RectF();
        this.f2442m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4024f, R.attr.resc, R.style.resc);
        AbstractC0016e.m193q0(context, R.attr.resc, 200);
        AbstractC0016e.m195r0(context, R.attr.resc, AbstractC1015a.f4047b);
        this.f2441l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2433d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2437h = getResources().getDimensionPixelSize(R.dimen.resc);
        this.f2434e = r4.getDimensionPixelSize(R.dimen.resc);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m1795b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m1794a(int i2) {
        return i2 == 2 ? Math.round(this.f2441l * 0.66f) : this.f2441l;
    }

    /* JADX INFO: renamed from: b */
    public final void m1795b(float f) {
        ValueAnimator valueAnimator = this.f2430a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f2438i = f2;
        this.f2440k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM1794a = m1794a(this.f2442m);
        float fCos = (((float) Math.cos(this.f2440k)) * fM1794a) + width;
        float fSin = (fM1794a * ((float) Math.sin(this.f2440k))) + height;
        float f3 = this.f2433d;
        this.f2436g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f2432c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0635d) it.next());
            if (Math.abs(clockFaceView.f2421G - f2) > 0.001f) {
                clockFaceView.f2421G = f2;
                clockFaceView.m1793n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM1794a = m1794a(this.f2442m);
        float fCos = (((float) Math.cos(this.f2440k)) * fM1794a) + f;
        float f2 = height;
        float fSin = (fM1794a * ((float) Math.sin(this.f2440k))) + f2;
        Paint paint = this.f2435f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f2433d, paint);
        double dSin = Math.sin(this.f2440k);
        paint.setStrokeWidth(this.f2437h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f2440k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f2434e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f2430a.isRunning()) {
            return;
        }
        m1795b(this.f2438i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z2 = this.f2439j;
                if (this.f2431b) {
                    this.f2442m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m1794a(2)) + AbstractC0047m.m275d(getContext(), 12) ? 2 : 1;
                }
            } else {
                z2 = false;
            }
            z3 = false;
        } else {
            this.f2439j = false;
            z2 = false;
            z3 = true;
        }
        boolean z5 = this.f2439j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        boolean z6 = this.f2438i != f;
        if (z3 && z6) {
            z4 = true;
        } else if (z6 || z2) {
            m1795b(f);
            z4 = true;
        }
        this.f2439j = z5 | z4;
        return true;
    }
}
