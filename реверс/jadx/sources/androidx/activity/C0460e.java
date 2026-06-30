package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0550t;
import androidx.lifecycle.EnumC0580l;
import java.util.ArrayList;
import java.util.HashMap;
import p060e.AbstractActivityC0669k;
import p068h0.InterfaceC0780c;

/* JADX INFO: renamed from: androidx.activity.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0460e implements InterfaceC0780c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1169b;

    public /* synthetic */ C0460e(int i2, Object obj) {
        this.f1168a = i2;
        this.f1169b = obj;
    }

    @Override // p068h0.InterfaceC0780c
    /* JADX INFO: renamed from: a */
    public final Bundle mo1157a() {
        switch (this.f1168a) {
            case 0:
                AbstractActivityC0669k abstractActivityC0669k = (AbstractActivityC0669k) this.f1169b;
                Bundle bundle = new Bundle();
                C0462g c0462g = abstractActivityC0669k.f1187k;
                c0462g.getClass();
                HashMap map = c0462g.f1228b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0462g.f1230d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0462g.f1233g.clone());
                return bundle;
            case 1:
                AbstractActivityC0669k abstractActivityC0669k2 = (AbstractActivityC0669k) this.f1169b;
                while (AbstractActivityC0669k.m1893l(((C0550t) abstractActivityC0669k2.f2697s.f1b).f1808s)) {
                }
                abstractActivityC0669k2.f2698t.m1484d(EnumC0580l.ON_STOP);
                return new Bundle();
            default:
                return ((C0518H) this.f1169b).m1349S();
        }
    }
}
