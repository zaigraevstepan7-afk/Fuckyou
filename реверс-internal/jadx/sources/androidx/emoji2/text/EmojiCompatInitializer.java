package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.g30;
import defpackage.h30;
import defpackage.kg0;
import defpackage.m90;
import defpackage.oc;
import defpackage.qt0;
import defpackage.xo0;
import defpackage.zo0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements kg0 {
    @Override // defpackage.kg0
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.kg0
    public final Object b(Context context) {
        Object objG;
        m90 m90Var = new m90(new qt0(context));
        m90Var.b = 1;
        if (g30.k == null) {
            synchronized (g30.j) {
                try {
                    if (g30.k == null) {
                        g30.k = new g30(m90Var);
                    }
                } finally {
                }
            }
        }
        oc ocVarM = oc.m(context);
        ocVarM.getClass();
        synchronized (oc.e) {
            try {
                objG = ((HashMap) ocVarM.a).get(ProcessLifecycleInitializer.class);
                if (objG == null) {
                    objG = ocVarM.g(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        zo0 zo0VarG = ((xo0) objG).g();
        zo0VarG.a(new h30(this, zo0VarG));
        return Boolean.TRUE;
    }
}
