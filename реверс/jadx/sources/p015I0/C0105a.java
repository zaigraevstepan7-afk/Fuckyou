package p015I0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0105a implements InterfaceC0107c {

    /* JADX INFO: renamed from: a */
    public final float f315a;

    public C0105a(float f) {
        this.f315a = f;
    }

    @Override // p015I0.InterfaceC0107c
    /* JADX INFO: renamed from: a */
    public final float mo453a(RectF rectF) {
        return this.f315a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0105a) && this.f315a == ((C0105a) obj).f315a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f315a)});
    }
}
