package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k3 implements be {
    public final h4 a;
    public final ge b;
    public final AutofillId c;

    public k3(h4 h4Var, ge geVar) {
        this.a = h4Var;
        this.b = geVar;
        h4Var.setImportantForAutofill(1);
        AutofillId autofillId = h4Var.getAutofillId();
        if (autofillId == null) {
            throw s91.g("Required value was null.");
        }
        this.c = autofillId;
    }
}
