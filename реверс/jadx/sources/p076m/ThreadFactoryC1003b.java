package p076m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1003b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f3984a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f3984a.getAndIncrement());
        return thread;
    }
}
