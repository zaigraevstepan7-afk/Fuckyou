package androidx.activity;

import android.window.BackEvent;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0456a {

    /* JADX INFO: renamed from: a */
    public static final C0456a f1162a = new C0456a();

    /* JADX INFO: renamed from: a */
    public final BackEvent m1152a(float f, float f2, float f3, int i2) {
        return new BackEvent(f, f2, f3, i2);
    }

    /* JADX INFO: renamed from: b */
    public final float m1153b(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m1154c(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m1155d(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m1156e(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
