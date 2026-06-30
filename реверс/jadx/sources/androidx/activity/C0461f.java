package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0550t;
import java.util.ArrayList;
import java.util.HashMap;
import p049a.InterfaceC0444b;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;

/* JADX INFO: renamed from: androidx.activity.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0461f implements InterfaceC0444b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC0669k f1171b;

    public /* synthetic */ C0461f(AbstractActivityC0669k abstractActivityC0669k, int i2) {
        this.f1170a = i2;
        this.f1171b = abstractActivityC0669k;
    }

    @Override // p049a.InterfaceC0444b
    /* JADX INFO: renamed from: a */
    public final void mo1137a() {
        switch (this.f1170a) {
            case 0:
                AbstractActivityC0669k abstractActivityC0669k = this.f1171b;
                Bundle bundleM2130c = ((C0781d) abstractActivityC0669k.f1181e.f1200c).m2130c("android:support:activity-result");
                if (bundleM2130c != null) {
                    C0462g c0462g = abstractActivityC0669k.f1187k;
                    c0462g.getClass();
                    ArrayList<Integer> integerArrayList = bundleM2130c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM2130c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0462g.f1230d = bundleM2130c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = bundleM2130c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0462g.f1233g;
                        bundle2.putAll(bundle);
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            HashMap map = c0462g.f1228b;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = c0462g.f1227a;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            map2.put(num2, str2);
                            map.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                C0550t c0550t = (C0550t) this.f1171b.f2697s.f1b;
                c0550t.f1808s.m1358b(c0550t, c0550t, null);
                break;
        }
    }
}
