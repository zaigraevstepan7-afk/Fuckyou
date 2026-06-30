package p024N;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p032R.AbstractC0352a;

/* JADX INFO: renamed from: N.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0234L {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m755a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static ContentCaptureSession m756b(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: c */
    public static List<Rect> m757c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: d */
    public static void m758d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    /* JADX INFO: renamed from: e */
    public static void m759e(View view, AbstractC0352a abstractC0352a) {
        view.setContentCaptureSession(null);
    }

    /* JADX INFO: renamed from: f */
    public static void m760f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
