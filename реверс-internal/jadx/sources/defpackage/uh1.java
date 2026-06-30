package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public final vh1 a;
    public final p7 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final t61 c = new t61(26);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public uh1(vh1 vh1Var, p7 p7Var) {
        this.a = vh1Var;
        this.b = p7Var;
    }

    public final void a() {
        vh1 vh1Var = this.a;
        if (vh1Var.g().c != qo0.f) {
            yc.l("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                yc.l("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            vh1Var.g().a(new tn(2, this));
            this.e = true;
        }
    }
}
