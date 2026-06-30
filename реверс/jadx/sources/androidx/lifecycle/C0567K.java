package androidx.lifecycle;

import androidx.fragment.app.AbstractC0529T;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0567K {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f1852a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m1473a() {
        for (AbstractC0565I abstractC0565I : this.f1852a.values()) {
            HashMap map = abstractC0565I.f1848a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : abstractC0565I.f1848a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0565I.f1849b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0565I.f1849b) {
                            if (AbstractC0529T.m1418g(closeable)) {
                                try {
                                    closeable.close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            abstractC0565I.mo1384a();
        }
        this.f1852a.clear();
    }
}
