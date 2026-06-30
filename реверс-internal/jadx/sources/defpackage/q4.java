package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q4 {
    public static /* synthetic */ Font.Builder e(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession i(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget j(h4 h4Var, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(h4Var, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder o(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse q(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void s() {
    }
}
