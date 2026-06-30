package androidx.activity;

import java.io.Serializable;
import p033R0.C0356d;
import p048Z0.InterfaceC0421a;
import p051a1.AbstractC0451c;
import p051a1.AbstractC0454f;
import p051a1.C0450b;
import p051a1.C0453e;
import p051a1.InterfaceC0449a;

/* JADX INFO: renamed from: androidx.activity.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0484u implements InterfaceC0421a, Serializable {

    /* JADX INFO: renamed from: a */
    public transient C0484u f1241a;

    /* JADX INFO: renamed from: b */
    public final Object f1242b;

    /* JADX INFO: renamed from: c */
    public final boolean f1243c = false;

    /* JADX INFO: renamed from: d */
    public final int f1244d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1245e;

    public C0484u(int i2, Object obj) {
        this.f1245e = i2;
        this.f1242b = obj;
    }

    @Override // p048Z0.InterfaceC0421a
    /* JADX INFO: renamed from: a */
    public final Object mo1135a() {
        switch (this.f1245e) {
            case 0:
                ((C0485v) this.f1242b).m1189d();
                break;
            default:
                ((C0485v) this.f1242b).m1189d();
                break;
        }
        return C0356d.f999c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0449a m1185b() {
        if (this.f1243c) {
            AbstractC0454f.f1148a.getClass();
            return new C0453e();
        }
        AbstractC0454f.f1148a.getClass();
        return new C0450b(C0485v.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0484u) {
            C0484u c0484u = (C0484u) obj;
            c0484u.getClass();
            return this.f1244d == c0484u.f1244d && AbstractC0451c.m1142a(this.f1242b, c0484u.f1242b) && m1185b().equals(c0484u.m1185b());
        }
        if (!(obj instanceof C0484u)) {
            return false;
        }
        C0484u c0484u2 = this.f1241a;
        if (c0484u2 == null) {
            AbstractC0454f.f1148a.getClass();
            this.f1241a = this;
            c0484u2 = this;
        }
        return obj.equals(c0484u2);
    }

    public final int hashCode() {
        m1185b();
        return (((m1185b().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        C0484u c0484u = this.f1241a;
        if (c0484u == null) {
            AbstractC0454f.f1148a.getClass();
            this.f1241a = this;
            c0484u = this;
        }
        return c0484u != this ? c0484u.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
