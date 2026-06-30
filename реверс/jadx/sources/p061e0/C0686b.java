package p061e0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0686b {

    /* JADX INFO: renamed from: a */
    public final Executor f2735a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0689e f2736b;

    /* JADX INFO: renamed from: c */
    public final byte[] f2737c;

    /* JADX INFO: renamed from: d */
    public final File f2738d;

    /* JADX INFO: renamed from: e */
    public final String f2739e;

    /* JADX INFO: renamed from: f */
    public boolean f2740f = false;

    /* JADX INFO: renamed from: g */
    public C0687c[] f2741g;

    /* JADX INFO: renamed from: h */
    public byte[] f2742h;

    public C0686b(AssetManager assetManager, Executor executor, InterfaceC0689e interfaceC0689e, String str, File file) {
        this.f2735a = executor;
        this.f2736b = interfaceC0689e;
        this.f2739e = str;
        this.f2738d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 >= 24) {
            if (i2 < 31) {
                switch (i2) {
                    case 24:
                    case 25:
                        bArr = AbstractC0690f.f2759h;
                        break;
                    case 26:
                        bArr = AbstractC0690f.f2758g;
                        break;
                    case 27:
                        bArr = AbstractC0690f.f2757f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = AbstractC0690f.f2756e;
                        break;
                }
            } else {
                bArr = AbstractC0690f.f2755d;
            }
        }
        this.f2737c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m1920a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2736b.mo56u();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1921b(final int i2, final Serializable serializable) {
        this.f2735a.execute(new Runnable() { // from class: e0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2732a.f2736b.mo50o(i2, serializable);
            }
        });
    }
}
