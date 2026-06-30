package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.ActionMode;
import com.reddit.secondpage.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements yy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yy
    public final void a() {
        Integer num;
        int i = this.a;
        boolean z = true;
        Object objB = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                g2 g2Var = ((d2) obj).a;
                if (g2Var == null) {
                    yc.l("Launcher has not been initialized");
                    break;
                } else {
                    zn znVar = g2Var.B0;
                    String str = g2Var.C0;
                    Bundle bundle = znVar.g;
                    LinkedHashMap linkedHashMap = znVar.f;
                    str.getClass();
                    if (!znVar.d.contains(str) && (num = (Integer) znVar.b.remove(str)) != null) {
                        znVar.a.remove(num);
                    }
                    znVar.e.remove(str);
                    if (linkedHashMap.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                        linkedHashMap.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            objB = i1.b(str, bundle);
                        } else {
                            Parcelable parcelable = bundle.getParcelable(str);
                            if (b2.class.isInstance(parcelable)) {
                                objB = parcelable;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((b2) objB));
                        bundle.remove(str);
                    }
                    if (znVar.c.get(str) != null) {
                        yc.d();
                        break;
                    }
                }
                break;
            case 1:
                fy fyVar = (fy) obj;
                fyVar.dismiss();
                fyVar.l.f();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                v81 v81Var = (v81) obj;
                v81Var.f();
                v81Var.setTag(R.id.view_tree_lifecycle_owner, null);
                v81Var.setTag(R.id.view_tree_navigation_event_dispatcher_owner, null);
                v81Var.t.removeViewImmediate(v81Var);
                wy0 navigationEventDispatcher = v81Var.getNavigationEventDispatcher();
                navigationEventDispatcher.d();
                navigationEventDispatcher.b = true;
                fd fdVar = new fd();
                fdVar.addLast(navigationEventDispatcher);
                while (!fdVar.isEmpty()) {
                    wy0 wy0Var = (wy0) fdVar.removeFirst();
                    wy0Var.b = z;
                    tx0 tx0Var = wy0Var.f;
                    tx0 tx0Var2 = wy0Var.g;
                    tx0 tx0Var3 = wy0Var.e;
                    Object[] objArr = tx0Var3.b;
                    long[] jArr = tx0Var3.c;
                    int i2 = tx0Var3.e;
                    while (i2 != Integer.MAX_VALUE) {
                        int i3 = (int) (2147483647L & (jArr[i2] >> 31));
                        fdVar.addLast((wy0) objArr[i2]);
                        i2 = i3;
                    }
                    tx0 tx0VarN = lk.n(tx0Var2);
                    Object[] objArr2 = tx0VarN.b;
                    long[] jArr2 = tx0VarN.c;
                    int i4 = tx0VarN.e;
                    while (i4 != Integer.MAX_VALUE) {
                        int i5 = (int) ((jArr2[i4] >> 31) & 2147483647L);
                        bz0 bz0Var = (bz0) objArr2[i4];
                        cz0 cz0Var = navigationEventDispatcher.d;
                        cz0Var.getClass();
                        bz0Var.getClass();
                        cz0Var.k.h(bz0Var);
                        cz0Var.j.h(bz0Var);
                        cz0Var.i.h(bz0Var);
                        bz0Var.a = null;
                        bz0Var.c();
                        i4 = i5;
                    }
                    tx0Var2.b();
                    tx0 tx0VarN2 = lk.n(tx0Var);
                    Object[] objArr3 = tx0VarN2.b;
                    long[] jArr3 = tx0VarN2.c;
                    int i6 = tx0VarN2.e;
                    while (i6 != Integer.MAX_VALUE) {
                        int i7 = (int) ((jArr3[i6] >> 31) & 2147483647L);
                        ((yy0) objArr3[i6]).f();
                        i6 = i7;
                    }
                    tx0Var.b();
                    tx0Var3.b();
                    z = true;
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                l8 l8Var = (l8) obj;
                qq1 qq1Var = l8Var.e;
                i2 i2Var = qq1Var.h;
                if (i2Var != null) {
                    i2Var.a();
                }
                qq1Var.a();
                ActionMode actionMode = l8Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                l8Var.h = null;
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                gf gfVar = (gf) ((hf) obj).c.getValue();
                if (gfVar != null) {
                    gfVar.close();
                }
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((bz) obj).f.a();
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ha0) obj).a();
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ry1) obj).o();
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((rm0) obj).d = null;
                break;
            case el.a /* 9 */:
                bn0 bn0Var = (bn0) obj;
                tk0 tk0Var = bn0Var.c;
                if (tk0Var != null) {
                    tk0Var.a = false;
                }
                bn0Var.c = null;
                break;
            case el.b /* 10 */:
                xm0 xm0Var = (xm0) obj;
                xm0Var.f = true;
                xm0Var.d = 0;
                xm0Var.c();
                break;
            default:
                ((d22) obj).i();
                break;
        }
    }
}
