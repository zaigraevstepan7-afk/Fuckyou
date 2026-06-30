package p021L0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: L0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0183f {

    /* JADX INFO: renamed from: b */
    public static C0183f f611b;

    /* JADX INFO: renamed from: a */
    public final Object f612a;

    public C0183f() {
        this.f612a = new Object();
        new Handler(Looper.getMainLooper(), new C0182e(this));
    }

    /* JADX INFO: renamed from: a */
    public void m621a() {
        synchronized (this.f612a) {
        }
    }

    public C0183f(Object obj) {
        this.f612a = obj;
    }
}
