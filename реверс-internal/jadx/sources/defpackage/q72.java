package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q72 extends WindowInsetsAnimation$Callback {
    public final kl a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public q72(kl klVar) {
        super(klVar.e);
        this.d = new HashMap();
        this.a = klVar;
    }

    public final t72 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        t72 t72Var = (t72) map.get(windowInsetsAnimation);
        if (t72Var != null) {
            return t72Var;
        }
        t72 t72Var2 = new t72(0, null, 0L);
        t72Var2.a = new r72(windowInsetsAnimation);
        map.put(windowInsetsAnimation, t72Var2);
        return t72Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.f(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = f1.j(list.get(size));
            t72 t72VarA = a(windowInsetsAnimationJ);
            t72VarA.a.d(windowInsetsAnimationJ.getFraction());
            this.c.add(t72VarA);
        }
        return this.a.g(p82.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        n81 n81VarH = this.a.h(a(windowInsetsAnimation), new n81(bounds));
        n81VarH.getClass();
        f1.n();
        return f1.h(((eh0) n81VarH.b).d(), ((eh0) n81VarH.c).d());
    }
}
