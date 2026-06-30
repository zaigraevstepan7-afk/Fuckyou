package p011G;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: renamed from: G.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094c {
    /* JADX INFO: renamed from: a */
    public static int m433a(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: b */
    public static String m434b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: c */
    public static int m435c(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: d */
    public static Uri m436d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
