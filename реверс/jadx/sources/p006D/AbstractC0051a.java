package p006D;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0051a {
    /* JADX INFO: renamed from: a */
    public static File m314a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m315b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    /* JADX INFO: renamed from: c */
    public static File m316c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
