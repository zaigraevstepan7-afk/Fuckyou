package p074l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000A.C0001b;
import p024N.AbstractC0240S;
import p024N.C0254d;
import p024N.InterfaceC0252c;

/* JADX INFO: renamed from: l.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0877H {
    /* JADX INFO: renamed from: a */
    public static boolean m2286a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0252c c0001b;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0001b = new C0001b(clipData, 3);
            } else {
                C0254d c0254d = new C0254d();
                c0254d.f797b = clipData;
                c0254d.f798c = 3;
                c0001b = c0254d;
            }
            AbstractC0240S.m781l(textView, c0001b.mo49n());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2287b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0252c c0001b;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0001b = new C0001b(clipData, 3);
        } else {
            C0254d c0254d = new C0254d();
            c0254d.f797b = clipData;
            c0254d.f798c = 3;
            c0001b = c0254d;
        }
        AbstractC0240S.m781l(view, c0001b.mo49n());
        return true;
    }
}
