package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0565I;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.C0577i;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p051a1.AbstractC0451c;
import p060e.C0667i;
import p068h0.C0781d;
import p068h0.InterfaceC0779b;
import p068h0.InterfaceC0782e;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0584p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0782e f2031a;

    public Recreator(InterfaceC0782e interfaceC0782e) {
        this.f2031a = interfaceC0782e;
    }

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        Object obj;
        boolean z2;
        if (enumC0580l != EnumC0580l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0586r.mo1164d().m1486f(this);
        Bundle bundleM2130c = this.f2031a.mo1162b().m2130c("androidx.savedstate.Restarter");
        if (bundleM2130c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM2130c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0779b.class);
                AbstractC0451c.m1145d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        AbstractC0451c.m1145d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC0782e interfaceC0782e = this.f2031a;
                        if (!(interfaceC0782e instanceof InterfaceC0568L)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0567K c0567kMo1163c = ((InterfaceC0568L) interfaceC0782e).mo1163c();
                        C0781d c0781dMo1162b = interfaceC0782e.mo1162b();
                        c0567kMo1163c.getClass();
                        for (String str2 : new HashSet(c0567kMo1163c.f1852a.keySet())) {
                            AbstractC0451c.m1146e(str2, "key");
                            AbstractC0565I abstractC0565I = (AbstractC0565I) c0567kMo1163c.f1852a.get(str2);
                            AbstractC0451c.m1143b(abstractC0565I);
                            C0588t c0588tMo1164d = interfaceC0782e.mo1164d();
                            AbstractC0451c.m1146e(c0781dMo1162b, "registry");
                            AbstractC0451c.m1146e(c0588tMo1164d, "lifecycle");
                            HashMap map = abstractC0565I.f1848a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = abstractC0565I.f1848a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f1856a)) {
                                if (z2) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f1856a = true;
                                c0588tMo1164d.m1481a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(c0567kMo1163c.f1852a.keySet()).isEmpty()) {
                            if (!c0781dMo1162b.f3154c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0667i c0667i = (C0667i) c0781dMo1162b.f3157f;
                            if (c0667i == null) {
                                c0667i = new C0667i(c0781dMo1162b);
                            }
                            c0781dMo1162b.f3157f = c0667i;
                            try {
                                C0577i.class.getDeclaredConstructor(new Class[0]);
                                C0667i c0667i2 = (C0667i) c0781dMo1162b.f3157f;
                                if (c0667i2 != null) {
                                    ((LinkedHashSet) c0667i2.f2695b).add(C0577i.class.getName());
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalArgumentException("Class " + C0577i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException("Failed to instantiate " + str, e3);
                    }
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("Class " + str + " wasn't found", e5);
            }
        }
    }
}
