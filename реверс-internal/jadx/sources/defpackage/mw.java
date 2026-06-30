package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mw implements fj1 {
    public final /* synthetic */ nw a;

    public mw(nw nwVar) {
        this.a = nwVar;
    }

    @Override // defpackage.fj1
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        nw nwVar = this.a;
        float fFloatValue = ((Number) nwVar.a.i(Float.valueOf(f))).floatValue();
        nwVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        nwVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
