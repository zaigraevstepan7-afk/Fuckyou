package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: androidx.activity.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0463h {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m1159a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
