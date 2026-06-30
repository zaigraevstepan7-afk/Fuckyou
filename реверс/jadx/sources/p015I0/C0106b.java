package p015I0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0106b implements InterfaceC0107c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0107c f316a;

    /* JADX INFO: renamed from: b */
    public final float f317b;

    public C0106b(float f, InterfaceC0107c interfaceC0107c) {
        while (interfaceC0107c instanceof C0106b) {
            interfaceC0107c = ((C0106b) interfaceC0107c).f316a;
            f += ((C0106b) interfaceC0107c).f317b;
        }
        this.f316a = interfaceC0107c;
        this.f317b = f;
    }

    @Override // p015I0.InterfaceC0107c
    /* JADX INFO: renamed from: a */
    public final float mo453a(RectF rectF) {
        return Math.max(0.0f, this.f316a.mo453a(rectF) + this.f317b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0106b)) {
            return false;
        }
        C0106b c0106b = (C0106b) obj;
        return this.f316a.equals(c0106b.f316a) && this.f317b == c0106b.f317b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f316a, Float.valueOf(this.f317b)});
    }
}
