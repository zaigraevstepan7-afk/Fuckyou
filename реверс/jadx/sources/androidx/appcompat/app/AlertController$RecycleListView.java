package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p057d.AbstractC0641a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f1253a;

    /* JADX INFO: renamed from: b */
    public final int f1254b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2499t);
        this.f1254b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1253a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
