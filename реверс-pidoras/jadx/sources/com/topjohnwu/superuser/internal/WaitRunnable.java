package com.topjohnwu.superuser.internal;

/* JADX INFO: loaded from: classes.dex */
public final class WaitRunnable implements Runnable {
    private Runnable r;

    public WaitRunnable(Runnable run) {
        this.r = run;
    }

    public synchronized void waitUntilDone() {
        while (this.r != null) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.r.run();
        this.r = null;
        notifyAll();
    }
}
