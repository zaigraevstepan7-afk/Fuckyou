package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.reddit.frontpage.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ MainActivity h;

    public zn(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        f2 f2Var = (f2) this.e.get(str);
        if ((f2Var != null ? f2Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                ((sa0) ((fy0) f2Var.a.a).getValue()).i(f2Var.b.r(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new b2(intent, i2));
        return true;
    }

    public final void b(int i, c2 c2Var, Object obj) {
        Intent intentPutExtra;
        Bundle bundleExtra;
        int i2;
        switch (c2Var.a) {
            case 0:
                ((String) obj).getClass();
                break;
            default:
                ((String[]) obj).getClass();
                break;
        }
        switch (c2Var.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
                intentPutExtra.getClass();
                break;
            default:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                intentPutExtra = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                intentPutExtra.getClass();
                break;
        }
        Bundle extras = intentPutExtra.getExtras();
        MainActivity mainActivity = this.h;
        if (extras != null) {
            Bundle extras2 = intentPutExtra.getExtras();
            extras2.getClass();
            if (extras2.getClassLoader() == null) {
                intentPutExtra.setExtrasClassLoader(mainActivity.getClassLoader());
            }
        }
        if (intentPutExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentPutExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentPutExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentPutExtra.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentPutExtra.getAction())) {
                mainActivity.startActivityForResult(intentPutExtra, i, bundle);
                return;
            }
            xh0 xh0Var = (xh0) intentPutExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                xh0Var.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                mainActivity.startIntentSenderForResult(xh0Var.e, i2, xh0Var.f, xh0Var.g, xh0Var.h, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new yn(i2, 0, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentPutExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        mainActivity.requestPermissions(stringArrayExtra, i);
    }
}
