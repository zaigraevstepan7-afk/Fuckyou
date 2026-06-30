package defpackage;

import android.os.Bundle;
import com.reddit.frontpage.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 implements vo0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ oc1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                vh1 vh1Var = (vh1) obj;
                if (po0Var != po0.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                xo0Var.g().f(this);
                Bundle bundleH = vh1Var.c().h("androidx.savedstate.Restarter");
                if (bundleH == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleH.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    yc.l("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, oc1.class.getClassLoader()).asSubclass(sh1.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(vh1Var instanceof t62)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + vh1Var).toString());
                                }
                                LinkedHashMap linkedHashMap = ((bo) ((t62) vh1Var)).e().a;
                                n81 n81VarC = vh1Var.c();
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    o62 o62Var = (o62) linkedHashMap.get(str3);
                                    if (o62Var != null) {
                                        bl.p(o62Var, n81VarC, vh1Var.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    n81VarC.o();
                                }
                            } catch (Exception e) {
                                yc.i("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(s91.l("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                if (mainActivity.i == null) {
                    wn wnVar = (wn) mainActivity.getLastNonConfigurationInstance();
                    if (wnVar != null) {
                        mainActivity.i = wnVar.a;
                    }
                    if (mainActivity.i == null) {
                        mainActivity.i = new et0(1);
                    }
                }
                mainActivity.e.f(this);
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                new HashMap();
                tb0[] tb0VarArr = (tb0[]) obj;
                if (tb0VarArr.length > 0) {
                    tb0 tb0Var = tb0VarArr[0];
                    throw null;
                }
                if (tb0VarArr.length <= 0) {
                    return;
                }
                tb0 tb0Var2 = tb0VarArr[0];
                throw null;
            default:
                if (po0Var != po0.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + po0Var).toString());
                }
                xo0Var.g().f(this);
                ((qh1) obj).b();
                return;
        }
    }
}
