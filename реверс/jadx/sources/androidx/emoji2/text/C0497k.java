package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p000A.C0010k;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0497k extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC0383m f1530p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ThreadPoolExecutor f1531q;

    public C0497k(AbstractC0383m abstractC0383m, ThreadPoolExecutor threadPoolExecutor) {
        this.f1530p = abstractC0383m;
        this.f1531q = threadPoolExecutor;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: M */
    public final void mo1062M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1531q;
        try {
            this.f1530p.mo1062M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: P */
    public final void mo1065P(C0010k c0010k) {
        ThreadPoolExecutor threadPoolExecutor = this.f1531q;
        try {
            this.f1530p.mo1065P(c0010k);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
