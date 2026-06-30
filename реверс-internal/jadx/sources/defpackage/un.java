package defpackage;

import android.os.Bundle;
import com.reddit.frontpage.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class un implements th1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ un(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.th1
    public final Bundle a() {
        Map mapSingletonMap;
        j41[] j41VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zn znVar = ((MainActivity) obj).l;
                znVar.getClass();
                LinkedHashMap linkedHashMap = znVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(znVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(znVar.g));
                return bundle;
            case 1:
                Map mapE = ((kh1) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                me meVar = (me) obj;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) meVar.d;
                linkedHashMap2.getClass();
                int size = linkedHashMap2.size();
                Map mapSingletonMap2 = g40.e;
                if (size == 0) {
                    mapSingletonMap = mapSingletonMap2;
                } else if (size != 1) {
                    mapSingletonMap = new LinkedHashMap(linkedHashMap2);
                } else {
                    Map.Entry entry2 = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    mapSingletonMap = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                    mapSingletonMap.getClass();
                }
                for (Map.Entry entry3 : mapSingletonMap.entrySet()) {
                    meVar.l(((qs1) entry3.getValue()).getValue(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) meVar.b;
                linkedHashMap3.getClass();
                int size2 = linkedHashMap3.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        mapSingletonMap2 = new LinkedHashMap(linkedHashMap3);
                    } else {
                        Map.Entry entry4 = (Map.Entry) linkedHashMap3.entrySet().iterator().next();
                        mapSingletonMap2 = Collections.singletonMap(entry4.getKey(), entry4.getValue());
                        mapSingletonMap2.getClass();
                    }
                }
                for (Map.Entry entry5 : mapSingletonMap2.entrySet()) {
                    meVar.l(((th1) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) meVar.a;
                if (linkedHashMap4.isEmpty()) {
                    j41VarArr = new j41[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                        arrayList.add(new j41((String) entry6.getKey(), entry6.getValue()));
                    }
                    j41VarArr = (j41[]) arrayList.toArray(new j41[0]);
                }
                return s22.j((j41[]) Arrays.copyOf(j41VarArr, j41VarArr.length));
        }
    }
}
