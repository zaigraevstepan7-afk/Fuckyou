package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo implements za0 {
    public final /* synthetic */ int e;

    public /* synthetic */ oo(int i) {
        this.e = i;
    }

    @Override // defpackage.za0
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ww1 ww1Var = (ww1) obj;
                lw1 lw1Var = (lw1) obj2;
                ha0 ha0Var = (ha0) obj3;
                ob0 ob0Var = (ob0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ob0Var.f(ww1Var) : ob0Var.h(ww1Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ob0Var.f(lw1Var) : ob0Var.h(lw1Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ob0Var.h(ha0Var) ? 256 : 128;
                }
                if (!ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
                    ob0Var.Q();
                } else {
                    qw.c(ww1Var, lw1Var, ha0Var, ob0Var, i2 & 1022);
                }
                break;
            case 1:
                ww1 ww1Var2 = (ww1) obj;
                lw1 lw1Var2 = (lw1) obj2;
                ha0 ha0Var2 = (ha0) obj3;
                ob0 ob0Var2 = (ob0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ob0Var2.f(ww1Var2) : ob0Var2.h(ww1Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ob0Var2.f(lw1Var2) : ob0Var2.h(lw1Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ob0Var2.h(ha0Var2) ? 256 : 128;
                }
                if (!ob0Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
                    ob0Var2.Q();
                } else {
                    qw.c(ww1Var2, lw1Var2, ha0Var2, ob0Var2, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((wz1) obj5).a;
                String string = ((CharSequence) obj4).subSequence(wz1.f(j), wz1.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return t32Var;
    }
}
