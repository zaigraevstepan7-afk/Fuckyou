package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o62 {
    public final p62 a = new p62();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        p62 p62Var = this.a;
        if (p62Var != null) {
            if (p62Var.d) {
                p62.a(autoCloseable);
                return;
            }
            synchronized (p62Var.a) {
                autoCloseable2 = (AutoCloseable) p62Var.b.put(str, autoCloseable);
            }
            p62.a(autoCloseable2);
        }
    }

    public final void b() {
        p62 p62Var = this.a;
        if (p62Var != null && !p62Var.d) {
            p62Var.d = true;
            synchronized (p62Var.a) {
                try {
                    Iterator it = p62Var.b.values().iterator();
                    while (it.hasNext()) {
                        p62.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = p62Var.c.iterator();
                    while (it2.hasNext()) {
                        p62.a((AutoCloseable) it2.next());
                    }
                    p62Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        p62 p62Var = this.a;
        if (p62Var == null) {
            return null;
        }
        synchronized (p62Var.a) {
            autoCloseable = (AutoCloseable) p62Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
