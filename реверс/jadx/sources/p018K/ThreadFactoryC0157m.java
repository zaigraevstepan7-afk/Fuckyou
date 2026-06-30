package p018K;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: K.m */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0157m implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0156l(runnable);
    }
}
