package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ et f;

    public /* synthetic */ dt(et etVar, am1 am1Var) {
        this.e = 3;
        this.f = etVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        StringBuilder sb = null;
        boolean z = true;
        et etVar = this.f;
        switch (i) {
            case 0:
                v41 v41Var = etVar.w.t;
                Boolean bool = Boolean.TRUE;
                v41Var.setValue(bool);
                etVar.w.s.setValue(bool);
                jo0 jo0Var = etVar.w;
                AutofillValue autofillValue = ((y5) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                et.O0(jo0Var, (String) textValue, etVar.x);
                return bool;
            case 1:
                List list = (List) obj;
                if (etVar.w.d() != null) {
                    qz1 qz1VarD = etVar.w.d();
                    qz1VarD.getClass();
                    list.add(qz1VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                et.O0(etVar.w, ((hb) obj).f, etVar.x);
                return Boolean.TRUE;
            default:
                hb hbVar = (hb) obj;
                if (etVar.x) {
                    kz1 kz1Var = etVar.w.e;
                    if (kz1Var != null) {
                        List listH = hk.H(new o60(), new in(hbVar, 1));
                        jo0 jo0Var2 = etVar.w;
                        xg0 xg0Var = jo0Var2.d;
                        qs qsVar = jo0Var2.v;
                        az1 az1VarQ = xg0Var.q(listH);
                        kz1Var.a(null, az1VarQ);
                        qsVar.i(az1VarQ);
                    } else {
                        az1 az1Var = etVar.v;
                        String str = az1Var.a.f;
                        long j = az1Var.b;
                        int i2 = wz1.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        hbVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) hbVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            yc.o(s91.k("End index (", i4, ") is less than start index (", i3, ")."));
                        }
                        String string = sb.toString();
                        int length = hbVar.f.length() + ((int) (etVar.v.b >> 32));
                        etVar.w.v.i(new az1(string, af1.g(length, length), 4));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ dt(et etVar, int i) {
        this.e = i;
        this.f = etVar;
    }
}
