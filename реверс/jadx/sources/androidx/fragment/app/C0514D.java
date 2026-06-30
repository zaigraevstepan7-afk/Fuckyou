package androidx.fragment.app;

import android.app.AppOpsManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.C0474a;
import androidx.activity.result.C0481h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p004C.AbstractC0032m;
import p004C.C0033n;
import p021L0.C0183f;
import p033R0.C0353a;
import p035S0.AbstractC0370g;
import p035S0.C0368e;
import p036T.AbstractC0383m;
import p051a1.AbstractC0451c;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: androidx.fragment.app.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0514D extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1568p;

    public /* synthetic */ C0514D(int i2) {
        this.f1568p = i2;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: A */
    public C0183f mo1060A(AbstractActivityC0669k abstractActivityC0669k, Object obj) {
        int iCheckPermission;
        boolean zM247a;
        Method method;
        Integer num;
        switch (this.f1568p) {
            case 1:
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new C0183f(C0368e.f1011a);
                }
                for (String str : strArr) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                        iCheckPermission = abstractActivityC0669k.checkPermission(str, Process.myPid(), Process.myUid());
                    } else {
                        C0033n c0033n = new C0033n(abstractActivityC0669k);
                        if (i2 >= 24) {
                            zM247a = AbstractC0032m.m247a(c0033n.f76a);
                        } else {
                            AppOpsManager appOpsManager = (AppOpsManager) abstractActivityC0669k.getSystemService("appops");
                            ApplicationInfo applicationInfo = abstractActivityC0669k.getApplicationInfo();
                            String packageName = abstractActivityC0669k.getApplicationContext().getPackageName();
                            int i3 = applicationInfo.uid;
                            try {
                                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                                Class<?> cls2 = Integer.TYPE;
                                method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                                num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                                num.getClass();
                                break;
                            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                            }
                            zM247a = ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() == 0;
                        }
                        iCheckPermission = zM247a ? 0 : -1;
                    }
                    if (iCheckPermission != 0) {
                        return null;
                    }
                }
                int iM1000C0 = AbstractC0370g.m1000C0(strArr.length);
                if (iM1000C0 < 16) {
                    iM1000C0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM1000C0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0183f(linkedHashMap);
            default:
                return super.mo1060A(abstractActivityC0669k, obj);
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: U */
    public final Object mo1067U(int i2, Intent intent) {
        switch (this.f1568p) {
            case 0:
                return new C0474a(i2, intent);
            case 1:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 2:
                C0368e c0368e = C0368e.f1011a;
                if (i2 != -1 || intent == null) {
                    return c0368e;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c0368e;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new C0353a(it.next(), it2.next()));
                }
                return AbstractC0370g.m1001D0(arrayList3);
            default:
                return new C0474a(i2, intent);
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: r */
    public final Intent mo1080r(AbstractActivityC0669k abstractActivityC0669k, Object obj) {
        Bundle bundleExtra;
        switch (this.f1568p) {
            case 0:
                C0481h c0481h = (C0481h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0481h.f1235b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0481h = new C0481h(c0481h.f1234a, null, c0481h.f1236c, c0481h.f1237d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0481h);
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
                AbstractC0451c.m1145d(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 2:
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                AbstractC0451c.m1145d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                return (Intent) obj;
        }
    }
}
