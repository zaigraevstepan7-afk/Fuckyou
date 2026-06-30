package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.C0474a;
import androidx.activity.result.InterfaceC0475b;
import java.util.ArrayList;
import java.util.Map;
import p000A.C0010k;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0555y implements InterfaceC0475b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0518H f1821b;

    public /* synthetic */ C0555y(C0518H c0518h, int i2) {
        this.f1820a = i2;
        this.f1821b = c0518h;
    }

    @Override // androidx.activity.result.InterfaceC0475b
    /* JADX INFO: renamed from: a */
    public final void mo645a(Object obj) {
        switch (this.f1820a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                C0518H c0518h = this.f1821b;
                C0515E c0515e = (C0515E) c0518h.f1580C.pollFirst();
                if (c0515e == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    C0010k c0010k = c0518h.f1593c;
                    String str = c0515e.f1569a;
                    if (c0010k.m83d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                C0474a c0474a = (C0474a) obj;
                C0518H c0518h2 = this.f1821b;
                C0515E c0515e2 = (C0515E) c0518h2.f1580C.pollFirst();
                if (c0515e2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    C0010k c0010k2 = c0518h2.f1593c;
                    String str2 = c0515e2.f1569a;
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM83d = c0010k2.m83d(str2);
                    if (abstractComponentCallbacksC0548rM83d == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0548rM83d.m1466p(c0515e2.f1570b, c0474a.f1216a, c0474a.f1217b);
                    }
                }
                break;
            default:
                C0474a c0474a2 = (C0474a) obj;
                C0518H c0518h3 = this.f1821b;
                C0515E c0515e3 = (C0515E) c0518h3.f1580C.pollFirst();
                if (c0515e3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    C0010k c0010k3 = c0518h3.f1593c;
                    String str3 = c0515e3.f1569a;
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM83d2 = c0010k3.m83d(str3);
                    if (abstractComponentCallbacksC0548rM83d2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0548rM83d2.m1466p(c0515e3.f1570b, c0474a2.f1216a, c0474a2.f1217b);
                    }
                }
                break;
        }
    }
}
