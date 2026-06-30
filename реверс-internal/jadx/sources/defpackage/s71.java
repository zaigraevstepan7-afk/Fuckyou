package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s71 {
    public final lt a;
    public final Context b;
    public final uk1 c;
    public final as0 d;
    public TextClassifier f;
    public final uy0 e = new uy0();
    public final v41 g = xc.B(null);
    public final Object h = new Object();

    public s71(lt ltVar, Context context, uk1 uk1Var, as0 as0Var) {
        this.a = ltVar;
        this.b = context;
        this.c = uk1Var;
        this.d = as0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s71 s71Var, CharSequence charSequence, long j, TextClassifier textClassifier, ls lsVar) throws Throwable {
        p71 p71Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        uy0 uy0Var;
        Object obj;
        hw1 hw1Var;
        wt wtVar;
        Object obj2;
        hw1 hw1VarB;
        Object obj3;
        sy0 sy0Var;
        uy0 uy0Var2 = s71Var.e;
        v41 v41Var = s71Var.g;
        if (lsVar instanceof p71) {
            p71Var = (p71) lsVar;
            int i = p71Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                p71Var.n = i - Integer.MIN_VALUE;
            } else {
                p71Var = new p71(s71Var, lsVar);
            }
        }
        Object obj4 = p71Var.l;
        int i2 = p71Var.n;
        t32 t32Var = t32.a;
        wt wtVar2 = wt.e;
        try {
            try {
                if (i2 == 0) {
                    xc.G(obj4);
                    p71Var.h = charSequence;
                    p71Var.i = textClassifier;
                    p71Var.j = uy0Var2;
                    j2 = j;
                    p71Var.k = j2;
                    p71Var.n = 1;
                    if (uy0Var2.e(p71Var) == wtVar2) {
                        return wtVar2;
                    }
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    uy0Var = uy0Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sy0 sy0Var2 = (sy0) p71Var.i;
                        hw1VarB = (hw1) p71Var.h;
                        xc.G(obj4);
                        obj3 = null;
                        sy0Var = sy0Var2;
                        v41Var.setValue(hw1VarB);
                        return t32Var;
                    }
                    j2 = p71Var.k;
                    uy0 uy0Var3 = p71Var.j;
                    textClassifier2 = (TextClassifier) p71Var.i;
                    charSequence2 = (CharSequence) p71Var.h;
                    xc.G(obj4);
                    uy0Var = uy0Var3;
                }
                if (hw1Var != null) {
                    try {
                        ys1 ys1Var = u71.a;
                        wtVar = wtVar2;
                        if (wz1.b(j2, hw1Var.b)) {
                            boolean z = xi0.o(charSequence2, hw1Var.a);
                            if (z) {
                                uy0Var.h(null);
                                return t32Var;
                            }
                            obj2 = null;
                        }
                        v41Var.setValue(hw1VarB);
                        return t32Var;
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                        uy0Var.h(obj);
                        throw th;
                    }
                }
                wtVar = wtVar2;
                obj2 = null;
                v41Var.setValue(hw1VarB);
                return t32Var;
            } finally {
                ((uy0) sy0Var).h(obj3);
            }
            hw1Var = (hw1) v41Var.getValue();
            uy0Var.h(obj2);
            b1.n();
            hw1VarB = s71Var.b(charSequence2, j2, textClassifier2.classifyText(b1.f(charSequence2, wz1.f(j2), wz1.e(j2)).setDefaultLocales(s71Var.c()).build()));
            p71Var.h = hw1VarB;
            p71Var.i = uy0Var2;
            obj3 = null;
            p71Var.j = null;
            p71Var.n = 2;
            Object objE = uy0Var2.e(p71Var);
            sy0Var = uy0Var2;
            if (objE == wtVar) {
                return wtVar;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final hw1 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteAction = (RemoteAction) obj;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteAction2 = (RemoteAction) obj;
            if (remoteAction2 != null && (icon = remoteAction2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new hw1(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        as0 as0Var = this.d;
        if (as0Var == null) {
            return new LocaleList(((zr0) f71.a.j().e.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(ql.Y(as0Var, 10));
        Iterator it = as0Var.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((zr0) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
