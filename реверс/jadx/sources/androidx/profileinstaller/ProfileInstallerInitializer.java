package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p015I0.C0109e;
import p060e.RunnableC0671m;
import p070i0.InterfaceC0785b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0785b {
    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: a */
    public final List mo1283a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p070i0.InterfaceC0785b
    /* JADX INFO: renamed from: b */
    public final Object mo1284b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0109e(20);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: e0.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                this.f2762a.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0671m(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C0109e(20);
    }
}
