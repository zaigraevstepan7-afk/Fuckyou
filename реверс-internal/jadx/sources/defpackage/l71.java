package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l71 extends CancellationException {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l71(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 0:
                setStackTrace(s22.g0);
                break;
            case 1:
                setStackTrace(pv.v);
                break;
            default:
                setStackTrace(c2.u);
                break;
        }
        return this;
    }
}
