package p004C;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.activity.C0462g;
import androidx.activity.result.C0478e;
import androidx.activity.result.InterfaceC0475b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p021L0.C0183f;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0021b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f54b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f56d;

    public /* synthetic */ RunnableC0021b(C0462g c0462g, int i2, Object obj, int i3) {
        this.f53a = i3;
        this.f56d = c0462g;
        this.f54b = i2;
        this.f55c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53a) {
            case 0:
                String[] strArr = (String[]) this.f55c;
                int[] iArr = new int[strArr.length];
                AbstractActivityC0669k abstractActivityC0669k = (AbstractActivityC0669k) this.f56d;
                PackageManager packageManager = abstractActivityC0669k.getPackageManager();
                String packageName = abstractActivityC0669k.getPackageName();
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                }
                abstractActivityC0669k.onRequestPermissionsResult(this.f54b, strArr, iArr);
                break;
            case 1:
                Object obj = ((C0183f) this.f55c).f612a;
                C0462g c0462g = (C0462g) this.f56d;
                String str = (String) c0462g.f1227a.get(Integer.valueOf(this.f54b));
                if (str != null) {
                    C0478e c0478e = (C0478e) c0462g.f1231e.get(str);
                    if (c0478e != null) {
                        InterfaceC0475b interfaceC0475b = c0478e.f1223a;
                        if (c0462g.f1230d.remove(str)) {
                            interfaceC0475b.mo645a(obj);
                        }
                    } else {
                        c0462g.f1233g.remove(str);
                        c0462g.f1232f.put(str, obj);
                    }
                    break;
                }
                break;
            case 2:
                ((C0462g) this.f56d).m1179a(this.f54b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f55c));
                break;
            case 3:
                ((TextView) this.f55c).setTypeface((Typeface) this.f56d, this.f54b);
                break;
            default:
                ((BottomSheetBehavior) this.f56d).m1695E((View) this.f55c, this.f54b, false);
                break;
        }
    }

    public /* synthetic */ RunnableC0021b(Object obj, Object obj2, int i2, int i3) {
        this.f53a = i3;
        this.f55c = obj;
        this.f56d = obj2;
        this.f54b = i2;
    }

    public RunnableC0021b(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f53a = 4;
        this.f56d = bottomSheetBehavior;
        this.f55c = view;
        this.f54b = i2;
    }
}
