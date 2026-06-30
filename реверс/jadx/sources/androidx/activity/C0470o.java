package androidx.activity;

import androidx.fragment.app.C0556z;
import androidx.lifecycle.AbstractC0565I;
import androidx.lifecycle.C0564H;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0576h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import p033R0.C0356d;
import p035S0.C0364a;
import p048Z0.InterfaceC0421a;
import p051a1.AbstractC0451c;
import p051a1.AbstractC0452d;
import p051a1.AbstractC0454f;
import p051a1.C0450b;
import p055c0.AbstractC0602b;
import p055c0.C0601a;
import p055c0.C0604d;

/* JADX INFO: renamed from: androidx.activity.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0470o extends AbstractC0452d implements InterfaceC0421a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0470o(int i2, Object obj) {
        super(0);
        this.f1203a = i2;
        this.f1204b = obj;
    }

    @Override // p048Z0.InterfaceC0421a
    /* JADX INFO: renamed from: a */
    public final Object mo1135a() {
        Object objPrevious;
        switch (this.f1203a) {
            case 0:
                ((C0485v) this.f1204b).m1187b();
                return C0356d.f999c;
            case 1:
                C0485v c0485v = (C0485v) this.f1204b;
                C0364a c0364a = c0485v.f1247b;
                ListIterator listIterator = c0364a.listIterator(c0364a.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0556z) objPrevious).f1822a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0485v.f1248c = null;
                return C0356d.f999c;
            case 2:
                ((C0485v) this.f1204b).m1187b();
                return C0356d.f999c;
            default:
                InterfaceC0568L interfaceC0568L = (InterfaceC0568L) this.f1204b;
                ArrayList arrayList = new ArrayList();
                AbstractC0454f.f1148a.getClass();
                Class clsMo1141a = new C0450b(C0564H.class).mo1141a();
                AbstractC0451c.m1144c(clsMo1141a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new C0604d(clsMo1141a));
                C0604d[] c0604dArr = (C0604d[]) arrayList.toArray(new C0604d[0]);
                C0604d[] c0604dArr2 = (C0604d[]) Arrays.copyOf(c0604dArr, c0604dArr.length);
                AbstractC0451c.m1146e(c0604dArr2, "initializers");
                C0567K c0567kMo1163c = interfaceC0568L.mo1163c();
                AbstractC0602b abstractC0602bMo1161a = interfaceC0568L instanceof InterfaceC0576h ? ((InterfaceC0576h) interfaceC0568L).mo1161a() : C0601a.f2040b;
                AbstractC0451c.m1146e(c0567kMo1163c, "store");
                AbstractC0451c.m1146e(abstractC0602bMo1161a, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = c0567kMo1163c.f1852a;
                AbstractC0565I c0564h = (AbstractC0565I) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (C0564H.class.isInstance(c0564h)) {
                    AbstractC0451c.m1144c(c0564h, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(abstractC0602bMo1161a.f2041a);
                    linkedHashMap2.put(C0566J.f1851b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        c0564h = null;
                        for (C0604d c0604d : c0604dArr2) {
                            if (c0604d.f2042a.equals(C0564H.class)) {
                                c0564h = new C0564H();
                            }
                        }
                        if (c0564h == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C0564H.class.getName()));
                        }
                        AbstractC0565I abstractC0565I = (AbstractC0565I) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", c0564h);
                        if (abstractC0565I != null) {
                            abstractC0565I.mo1384a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (C0564H) c0564h;
        }
    }
}
