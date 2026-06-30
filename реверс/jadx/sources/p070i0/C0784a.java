package p070i0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.C0547q;
import com.reddit.frontpage.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0784a {

    /* JADX INFO: renamed from: d */
    public static volatile C0784a f3159d;

    /* JADX INFO: renamed from: e */
    public static final Object f3160e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f3163c;

    /* JADX INFO: renamed from: b */
    public final HashSet f3162b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f3161a = new HashMap();

    public C0784a(Context context) {
        this.f3163c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C0784a m2133c(Context context) {
        if (f3159d == null) {
            synchronized (f3160e) {
                try {
                    if (f3159d == null) {
                        f3159d = new C0784a(context);
                    }
                } finally {
                }
            }
        }
        return f3159d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2134a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3163c.getString(R.string.resc);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f3162b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0785b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m2135b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0547q(e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2135b(Class cls, HashSet hashSet) {
        Object objMo1284b;
        if (AbstractC0383m.m1029H()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f3161a;
        if (map.containsKey(cls)) {
            objMo1284b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0785b interfaceC0785b = (InterfaceC0785b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listMo1283a = interfaceC0785b.mo1283a();
                if (!listMo1283a.isEmpty()) {
                    for (Class cls2 : listMo1283a) {
                        if (!map.containsKey(cls2)) {
                            m2135b(cls2, hashSet);
                        }
                    }
                }
                objMo1284b = interfaceC0785b.mo1284b(this.f3163c);
                hashSet.remove(cls);
                map.put(cls, objMo1284b);
            } catch (Throwable th2) {
                throw new C0547q(th2);
            }
        }
        Trace.endSection();
        return objMo1284b;
    }
}
