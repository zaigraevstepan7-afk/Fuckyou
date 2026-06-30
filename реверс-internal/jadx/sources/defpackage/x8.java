package defpackage;

import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x8 implements Choreographer.FrameCallback {
    public final /* synthetic */ xi e;
    public final /* synthetic */ sa0 f;

    public x8(xi xiVar, y8 y8Var, sa0 sa0Var) {
        this.e = xiVar;
        this.f = sa0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) throws IllegalAccessException, ly, InvocationTargetException {
        Object oe1Var;
        try {
            oe1Var = this.f.i(Long.valueOf(j));
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        this.e.g(oe1Var);
    }
}
