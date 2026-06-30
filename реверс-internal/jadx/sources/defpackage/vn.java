package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.reddit.frontpage.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ vn(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void a(Context context) {
        context.getClass();
        MainActivity mainActivity = this.a;
        Bundle bundleH = ((n81) mainActivity.h.c).h("android:support:activity-result");
        if (bundleH != null) {
            zn znVar = mainActivity.l;
            LinkedHashMap linkedHashMap = znVar.b;
            LinkedHashMap linkedHashMap2 = znVar.a;
            Bundle bundle = znVar.g;
            ArrayList<Integer> integerArrayList = bundleH.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                znVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleH.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        s22.h(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                znVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
