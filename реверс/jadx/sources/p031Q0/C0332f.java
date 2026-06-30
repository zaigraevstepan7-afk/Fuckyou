package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: Q0.f */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0332f implements FileFilter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4849short = null;

    static {
        ZLoader.registerNativesForClass(59, C0332f.class);
        Hidden0.special_clinit_59_00(C0332f.class);
    }

    /* JADX INFO: renamed from: ۨۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static native short[] m3274();

    @Override // java.io.FileFilter
    public final native boolean accept(File file);
}
