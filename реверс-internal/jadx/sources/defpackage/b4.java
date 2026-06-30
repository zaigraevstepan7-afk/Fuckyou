package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(h4 h4Var, int i) {
        super(1);
        this.f = i;
        this.g = h4Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        t32 t32Var = t32.a;
        h4 h4Var = this.g;
        switch (i) {
            case 0:
                ((m80) h4Var.getFocusOwner()).g(((a80) obj).a, false);
                return t32Var;
            case 1:
                ha0 ha0Var = (ha0) obj;
                h4Var.getUncaughtExceptionHandler$ui();
                Handler handler = h4Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ha0Var.a();
                } else {
                    Handler handler2 = h4Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new r3(ha0Var, 1));
                    }
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new c7(h4Var, h4Var.getTextInputService(), (vt) obj);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return h4Var.getInputModeManager();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return h4Var.getTextInputService();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return h4Var.getSoftwareKeyboardController();
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return h4Var.getTextToolbar();
            default:
                return h4Var.getPointerIconService();
        }
    }
}
