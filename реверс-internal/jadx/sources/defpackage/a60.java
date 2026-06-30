package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class a60 implements cl {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public a60(File file) {
        this.a = file;
    }

    @Override // defpackage.cl
    public final void close() {
        this.b.set(true);
    }
}
