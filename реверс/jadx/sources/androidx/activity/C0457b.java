package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0457b {

    /* JADX INFO: renamed from: a */
    public final float f1163a;

    /* JADX INFO: renamed from: b */
    public final float f1164b;

    /* JADX INFO: renamed from: c */
    public final float f1165c;

    /* JADX INFO: renamed from: d */
    public final int f1166d;

    public C0457b(BackEvent backEvent) {
        C0456a c0456a = C0456a.f1162a;
        float fM1155d = c0456a.m1155d(backEvent);
        float fM1156e = c0456a.m1156e(backEvent);
        float fM1153b = c0456a.m1153b(backEvent);
        int iM1154c = c0456a.m1154c(backEvent);
        this.f1163a = fM1155d;
        this.f1164b = fM1156e;
        this.f1165c = fM1153b;
        this.f1166d = iM1154c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1163a + ", touchY=" + this.f1164b + ", progress=" + this.f1165c + ", swipeEdge=" + this.f1166d + '}';
    }
}
