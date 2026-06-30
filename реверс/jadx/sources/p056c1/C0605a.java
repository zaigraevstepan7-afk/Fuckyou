package p056c1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p051a1.AbstractC0451c;
import p053b1.AbstractC0597a;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0605a extends AbstractC0597a {
    @Override // p053b1.AbstractC0597a
    /* JADX INFO: renamed from: a */
    public final Random mo1683a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0451c.m1145d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
