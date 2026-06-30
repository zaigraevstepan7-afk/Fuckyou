package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ rn(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                mainActivity.reportFullyDrawn();
                return t32.a;
            case 1:
                return new ga0(mainActivity.j, new rn(mainActivity, 0));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                iy iyVar = new iy();
                mainActivity.getNavigationEventDispatcher().b(iyVar);
                return iyVar;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new wh1(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                n11 n11Var = new n11(new p(3, mainActivity));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (xi0.o(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.e.a(new sn(n11Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new y4(1, mainActivity, n11Var));
                    }
                }
                return n11Var;
            default:
                return nu0.w(mainActivity);
        }
    }
}
