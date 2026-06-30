package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final Executor a;
    public final ab1 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public xx[] g;
    public byte[] h;

    public wx(AssetManager assetManager, Executor executor, ab1 ab1Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = ab1Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = c2.y;
                    break;
                case 27:
                    bArr = c2.x;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = c2.w;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = c2.v;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new yn(i, 1, this, serializable));
    }
}
