package p015I0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0114j implements InterfaceC0107c {

    /* JADX INFO: renamed from: a */
    public final float f370a;

    public C0114j(float f) {
        this.f370a = f;
    }

    @Override // p015I0.InterfaceC0107c
    /* JADX INFO: renamed from: a */
    public final float mo453a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0114j) && this.f370a == ((C0114j) obj).f370a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f370a)});
    }
}
