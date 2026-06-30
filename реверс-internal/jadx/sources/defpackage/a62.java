package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a62 implements View.OnApplyWindowInsetsListener {
    public p82 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ c11 c;

    public a62(View view, c11 c11Var) {
        this.b = view;
        this.c = c11Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        p82 p82VarC = p82.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        c11 c11Var = this.c;
        if (i < 30) {
            b62.a(windowInsets, this.b);
            if (p82VarC.equals(this.a)) {
                return c11Var.a(view, p82VarC).b();
            }
        }
        this.a = p82VarC;
        p82 p82VarA = c11Var.a(view, p82VarC);
        if (i >= 30) {
            return p82VarA.b();
        }
        Field field = h62.a;
        view.requestApplyInsets();
        return p82VarA.b();
    }
}
