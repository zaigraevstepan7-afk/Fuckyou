package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p015I0.C0109e;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0489c extends C0109e {
    @Override // p015I0.C0109e
    /* JADX INFO: renamed from: f */
    public final Signature[] mo461f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
