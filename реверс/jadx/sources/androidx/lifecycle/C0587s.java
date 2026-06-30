package androidx.lifecycle;

import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0587s {

    /* JADX INFO: renamed from: a */
    public EnumC0581m f1873a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0584p f1874b;

    /* JADX INFO: renamed from: a */
    public final void m1480a(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        EnumC0581m enumC0581mM1479a = enumC0580l.m1479a();
        EnumC0581m enumC0581m = this.f1873a;
        AbstractC0451c.m1146e(enumC0581m, "state1");
        if (enumC0581mM1479a.compareTo(enumC0581m) < 0) {
            enumC0581m = enumC0581mM1479a;
        }
        this.f1873a = enumC0581m;
        this.f1874b.mo1151b(interfaceC0586r, enumC0580l);
        this.f1873a = enumC0581mM1479a;
    }
}
