package p012G0;

import android.graphics.drawable.Drawable;
import p015I0.C0112h;

/* JADX INFO: renamed from: G0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0099a extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C0112h f298a;

    /* JADX INFO: renamed from: b */
    public boolean f299b;

    public C0099a(C0099a c0099a) {
        this.f298a = (C0112h) c0099a.f298a.f346a.newDrawable();
        this.f299b = c0099a.f299b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0100b(new C0099a(this));
    }
}
