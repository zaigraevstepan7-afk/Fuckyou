package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0514D;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.EnumC0581m;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import com.reddit.frontpage.ConfigsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p023M0.C0206l;
import p036T.AbstractC0383m;
import p053b1.AbstractC0597a;

/* JADX INFO: renamed from: androidx.activity.result.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480g {

    /* JADX INFO: renamed from: a */
    public final HashMap f1227a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1228b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f1229c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList f1230d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient HashMap f1231e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f1232f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f1233g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m1179a(int i2, int i3, Intent intent) {
        String str = (String) this.f1227a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0478e c0478e = (C0478e) this.f1231e.get(str);
        if (c0478e != null) {
            InterfaceC0475b interfaceC0475b = c0478e.f1223a;
            if (this.f1230d.contains(str)) {
                interfaceC0475b.mo645a(c0478e.f1224b.mo1067U(i3, intent));
                this.f1230d.remove(str);
                return true;
            }
        }
        this.f1232f.remove(str);
        this.f1233g.putParcelable(str, new C0474a(i3, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1158b(int i2, AbstractC0383m abstractC0383m, Object obj);

    /* JADX INFO: renamed from: c */
    public final C0476c m1180c(final String str, ConfigsActivity configsActivity, final C0514D c0514d, final C0206l c0206l) {
        C0588t c0588t = configsActivity.f1180d;
        if (c0588t.f1877c.compareTo(EnumC0581m.f1869d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + configsActivity + " is attempting to register while current state is " + c0588t.f1877c + ". LifecycleOwners must call register before they are STARTED.");
        }
        m1182e(str);
        HashMap map = this.f1229c;
        C0479f c0479f = (C0479f) map.get(str);
        if (c0479f == null) {
            c0479f = new C0479f(c0588t);
        }
        InterfaceC0584p interfaceC0584p = new InterfaceC0584p() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                boolean zEquals = EnumC0580l.ON_START.equals(enumC0580l);
                String str2 = str;
                AbstractC0480g abstractC0480g = this.f1215d;
                if (!zEquals) {
                    if (EnumC0580l.ON_STOP.equals(enumC0580l)) {
                        abstractC0480g.f1231e.remove(str2);
                        return;
                    } else {
                        if (EnumC0580l.ON_DESTROY.equals(enumC0580l)) {
                            abstractC0480g.m1183f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = abstractC0480g.f1231e;
                C0206l c0206l2 = c0206l;
                C0514D c0514d2 = c0514d;
                map2.put(str2, new C0478e(c0206l2, c0514d2));
                HashMap map3 = abstractC0480g.f1232f;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    c0206l2.mo645a(obj);
                }
                Bundle bundle = abstractC0480g.f1233g;
                C0474a c0474a = (C0474a) bundle.getParcelable(str2);
                if (c0474a != null) {
                    bundle.remove(str2);
                    c0206l2.mo645a(c0514d2.mo1067U(c0474a.f1216a, c0474a.f1217b));
                }
            }
        };
        c0479f.f1225a.m1481a(interfaceC0584p);
        c0479f.f1226b.add(interfaceC0584p);
        map.put(str, c0479f);
        return new C0476c(this, str, c0514d);
    }

    /* JADX INFO: renamed from: d */
    public final C0477d m1181d(String str, AbstractC0383m abstractC0383m, InterfaceC0475b interfaceC0475b) {
        m1182e(str);
        this.f1231e.put(str, new C0478e(interfaceC0475b, abstractC0383m));
        HashMap map = this.f1232f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0475b.mo645a(obj);
        }
        Bundle bundle = this.f1233g;
        C0474a c0474a = (C0474a) bundle.getParcelable(str);
        if (c0474a != null) {
            bundle.remove(str);
            interfaceC0475b.mo645a(abstractC0383m.mo1067U(c0474a.f1216a, c0474a.f1217b));
        }
        return new C0477d(this, str, abstractC0383m);
    }

    /* JADX INFO: renamed from: e */
    public final void m1182e(String str) {
        HashMap map = this.f1228b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iM1684b = AbstractC0597a.f2038a.m1684b();
        while (true) {
            int i2 = iM1684b + 65536;
            HashMap map2 = this.f1227a;
            if (!map2.containsKey(Integer.valueOf(i2))) {
                map2.put(Integer.valueOf(i2), str);
                map.put(str, Integer.valueOf(i2));
                return;
            }
            iM1684b = AbstractC0597a.f2038a.m1684b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1183f(String str) {
        Integer num;
        if (!this.f1230d.contains(str) && (num = (Integer) this.f1228b.remove(str)) != null) {
            this.f1227a.remove(num);
        }
        this.f1231e.remove(str);
        HashMap map = this.f1232f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f1233g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f1229c;
        C0479f c0479f = (C0479f) map2.get(str);
        if (c0479f != null) {
            ArrayList arrayList = c0479f.f1226b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0479f.f1225a.m1486f((InterfaceC0584p) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
