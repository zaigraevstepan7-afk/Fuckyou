package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r71 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 0;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(long j, ks ksVar, s71 s71Var, CharSequence charSequence) {
        super(2, ksVar);
        this.q = charSequence;
        this.m = j;
        this.p = s71Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((r71) o((ks) obj2, (TextClassifier) obj)).q(t32Var);
            default:
                return ((r71) o((ks) obj2, (zj1) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                r71 r71Var = new r71(this.m, ksVar, (s71) obj3, (CharSequence) obj2);
                r71Var.l = obj;
                return r71Var;
            default:
                r71 r71Var2 = new r71((bk1) obj3, (yc1) obj2, this.m, ksVar);
                r71Var2.l = obj;
                return r71Var2;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        long j;
        hw1 hw1VarB;
        uy0 uy0Var;
        yc1 yc1Var;
        long j2;
        Object objP;
        bk1 bk1Var;
        bk1 bk1Var2;
        int i = this.i;
        long j3 = this.m;
        wt wtVar = wt.e;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                s71 s71Var = (s71) obj3;
                int i2 = this.k;
                if (i2 == 0) {
                    xc.G(obj);
                    TextClassifier textClassifier = (TextClassifier) this.l;
                    b1.y();
                    TextSelection.Request.Builder defaultLocales = b1.j(charSequence, wz1.f(j3), wz1.e(j3)).setDefaultLocales(s71Var.c());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        defaultLocales.setIncludeTextClassification(true);
                    }
                    TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                    long jG = af1.g(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                    if (i3 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                        this.j = jG;
                        this.k = 2;
                        if (s71.a((s71) obj3, (CharSequence) obj2, jG, textClassifier, this) == wtVar) {
                            return wtVar;
                        }
                        j = jG;
                    } else {
                        TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                        textClassification.getClass();
                        hw1VarB = s71Var.b(charSequence, jG, textClassification);
                        uy0Var = s71Var.e;
                        this.l = hw1VarB;
                        this.n = uy0Var;
                        this.o = s71Var;
                        this.j = jG;
                        this.k = 1;
                        if (uy0Var.e(this) == wtVar) {
                            return wtVar;
                        }
                        j = jG;
                        s71Var.g.setValue(hw1VarB);
                    }
                } else if (i2 == 1) {
                    j = this.j;
                    s71Var = (s71) this.o;
                    uy0Var = (uy0) this.n;
                    hw1VarB = (hw1) this.l;
                    xc.G(obj);
                    try {
                        s71Var.g.setValue(hw1VarB);
                    } finally {
                        uy0Var.h(null);
                    }
                } else {
                    if (i2 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.j;
                    xc.G(obj);
                }
                return new wz1(j);
            default:
                int i4 = this.k;
                k31 k31Var = k31.f;
                if (i4 == 0) {
                    xc.G(obj);
                    bk1 bk1Var3 = (bk1) obj3;
                    yj1 yj1Var = new yj1(bk1Var3, (zj1) this.l);
                    yc1Var = (yc1) obj2;
                    aw awVar = bk1Var3.c;
                    j2 = yc1Var.e;
                    float fE = bk1Var3.e(bk1Var3.d == k31Var ? o52.b(j3) : o52.c(j3));
                    this.l = bk1Var3;
                    this.n = bk1Var3;
                    this.o = yc1Var;
                    this.j = j2;
                    this.k = 1;
                    awVar.getClass();
                    objP = nu0.P(awVar.b, new zv(fE, awVar, yj1Var, null), this);
                    if (objP == wtVar) {
                        return wtVar;
                    }
                    bk1Var = bk1Var3;
                    bk1Var2 = bk1Var;
                } else {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j4 = this.j;
                    yc1Var = (yc1) this.o;
                    bk1Var = (bk1) this.n;
                    bk1Var2 = (bk1) this.l;
                    xc.G(obj);
                    j2 = j4;
                    objP = obj;
                }
                float fE2 = bk1Var2.e(((Number) objP).floatValue());
                yc1Var.e = bk1Var.d == k31Var ? o52.a(j2, fE2, 0.0f, 2) : o52.a(j2, 0.0f, fE2, 1);
                return t32.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(bk1 bk1Var, yc1 yc1Var, long j, ks ksVar) {
        super(2, ksVar);
        this.p = bk1Var;
        this.q = yc1Var;
        this.m = j;
    }
}
