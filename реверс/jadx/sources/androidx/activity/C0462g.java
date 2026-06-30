package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.AbstractC0480g;
import androidx.activity.result.C0481h;
import java.util.Arrays;
import java.util.HashSet;
import p004C.AbstractC0022c;
import p004C.RunnableC0021b;
import p021L0.C0183f;
import p036T.AbstractC0383m;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: androidx.activity.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0462g extends AbstractC0480g {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC0669k f1172h;

    public C0462g(AbstractActivityC0669k abstractActivityC0669k) {
        this.f1172h = abstractActivityC0669k;
    }

    @Override // androidx.activity.result.AbstractC0480g
    /* JADX INFO: renamed from: b */
    public final void mo1158b(int i2, AbstractC0383m abstractC0383m, Object obj) {
        Bundle bundleExtra;
        int i3;
        AbstractActivityC0669k abstractActivityC0669k = this.f1172h;
        C0183f c0183fMo1060A = abstractC0383m.mo1060A(abstractActivityC0669k, obj);
        if (c0183fMo1060A != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0021b(this, i2, c0183fMo1060A, 1));
            return;
        }
        Intent intentMo1080r = abstractC0383m.mo1080r(abstractActivityC0669k, obj);
        if (intentMo1080r.getExtras() != null && intentMo1080r.getExtras().getClassLoader() == null) {
            intentMo1080r.setExtrasClassLoader(abstractActivityC0669k.getClassLoader());
        }
        if (intentMo1080r.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo1080r.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo1080r.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo1080r.getAction())) {
            String[] stringArrayExtra = intentMo1080r.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i4));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i5 = 0;
                for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                    if (!hashSet.contains(Integer.valueOf(i6))) {
                        strArr[i5] = stringArrayExtra[i6];
                        i5++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0022c.m232b(abstractActivityC0669k, stringArrayExtra, i2);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC0021b(strArr, abstractActivityC0669k, i2, 0));
                return;
            }
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo1080r.getAction())) {
            abstractActivityC0669k.startActivityForResult(intentMo1080r, i2, bundle);
            return;
        }
        C0481h c0481h = (C0481h) intentMo1080r.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i3 = i2;
            try {
                abstractActivityC0669k.startIntentSenderForResult(c0481h.f1234a, i3, c0481h.f1235b, c0481h.f1236c, c0481h.f1237d, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new RunnableC0021b(this, i3, e, 2));
            }
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            i3 = i2;
        }
    }
}
