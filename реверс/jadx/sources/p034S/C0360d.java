package p034S;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000A.C0001b;
import p023M0.C0206l;

/* JADX INFO: renamed from: S.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0360d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0206l f1002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360d(InputConnection inputConnection, C0206l c0206l) {
        super(inputConnection, false);
        this.f1002a = c0206l;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        C0001b c0001b = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0001b = new C0001b(9, new C0362f(inputContentInfo));
        }
        if (this.f1002a.m646b(c0001b, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
