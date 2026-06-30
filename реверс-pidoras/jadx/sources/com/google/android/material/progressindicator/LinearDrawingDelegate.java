package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    public LinearDrawingDelegate(LinearProgressIndicatorSpec spec) {
        super(spec);
        this.trackLength = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(Canvas canvas, float trackThicknessFraction) {
        Rect clipBounds = canvas.getClipBounds();
        this.trackLength = clipBounds.width();
        float trackSize = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.drawable.isShowing() && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.drawable.isShowing() || this.drawable.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (trackThicknessFraction - 1.0f)) / 2.0f);
        }
        canvas.clipRect((-this.trackLength) / 2.0f, (-trackSize) / 2.0f, this.trackLength / 2.0f, trackSize / 2.0f);
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) this.spec).trackThickness * trackThicknessFraction;
        this.displayedCornerRadius = ((LinearProgressIndicatorSpec) this.spec).trackCornerRadius * trackThicknessFraction;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(Canvas canvas, Paint paint, float startFraction, float endFraction, int color) {
        if (startFraction == endFraction) {
            return;
        }
        float adjustedStartX = ((-this.trackLength) / 2.0f) + ((this.trackLength - (this.displayedCornerRadius * 2.0f)) * startFraction);
        float adjustedEndX = ((-this.trackLength) / 2.0f) + ((this.trackLength - (this.displayedCornerRadius * 2.0f)) * endFraction) + (this.displayedCornerRadius * 2.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(color);
        RectF indicatorBound = new RectF(adjustedStartX, (-this.displayedTrackThickness) / 2.0f, adjustedEndX, this.displayedTrackThickness / 2.0f);
        canvas.drawRoundRect(indicatorBound, this.displayedCornerRadius, this.displayedCornerRadius, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(Canvas canvas, Paint paint) {
        int trackColor = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(trackColor);
        RectF trackBound = new RectF((-this.trackLength) / 2.0f, (-this.displayedTrackThickness) / 2.0f, this.trackLength / 2.0f, this.displayedTrackThickness / 2.0f);
        canvas.drawRoundRect(trackBound, this.displayedCornerRadius, this.displayedCornerRadius, paint);
    }
}
