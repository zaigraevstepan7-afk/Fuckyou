package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ mt(int i, pn0 pn0Var) {
        this.e = 11;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) throws UnsupportedEncodingException {
        String str;
        int i = 0;
        Context context = null;
        zq1Var = null;
        zq1 zq1Var = null;
        switch (this.e) {
            case 0:
                jt jtVar = (jt) obj;
                if (jtVar instanceof ot) {
                    return (ot) jtVar;
                }
                return null;
            case 1:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{b}, 1));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.TRUE;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((h20) obj).getClass();
                return Double.valueOf(50.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                fu fuVar = (fu) obj;
                fuVar.getClass();
                return "[" + fuVar + ']';
            case t91.STRING_FIELD_NUMBER /* 5 */:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new fo1(absolutePath);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (aq1.c) {
                    List list = aq1.i;
                    int size = list.size();
                    while (i < size) {
                        ((sa0) list.get(i)).i(obj);
                        i++;
                    }
                }
                return t32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                j41 j41Var = (j41) obj;
                j41Var.getClass();
                return ((String) j41Var.e) + "=" + URLEncoder.encode((String) j41Var.f, "UTF-8");
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                yl1.b((am1) obj, 0);
                return t32.a;
            case el.a /* 9 */:
                return t32.a;
            case el.b /* 10 */:
                List list2 = (List) obj;
                return new un0(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 11:
                return t32.a;
            case el.c /* 12 */:
                return t32.a;
            case 13:
                return t32.a;
            case 14:
                return t32.a;
            case 15:
                float f = sq0.a;
                return t32.a;
            case 16:
                Context baseContext = (Context) ((up) obj).B(w4.b);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof Activity) {
                            context = baseContext;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            case 17:
                ((Long) obj).getClass();
                return t32.a;
            case 18:
                l41 l41Var = (l41) obj;
                return s91.k("[", l41Var.b, ", ", l41Var.c, ")");
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return "  " + ((i91) entry.getKey()).a + " = " + (value instanceof byte[] ? nd.W((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 20:
                a7 a7Var = ((sz0) obj).a;
                if (a7Var != null) {
                    a7Var.a();
                }
                return t32.a;
            case 21:
                up upVar = (up) obj;
                int i2 = o6.a;
                Context context2 = (Context) upVar.B(w4.b);
                hx hxVar = (hx) upVar.B(aq.h);
                q31 q31Var = (q31) upVar.B(r31.a);
                if (q31Var == null) {
                    return null;
                }
                return new w5(context2, hxVar, q31Var.a, q31Var.b);
            case 22:
                Context context3 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size2 = listQueryIntentActivities.size();
                while (i < size2) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context3.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context3.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i++;
                }
                return arrayList;
            case 23:
                pk0 pk0Var = (pk0) obj;
                pk0Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                pk0Var.a(fValueOf, 300).b = kw0.b;
                pk0Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                pk0Var.a(fValueOf2, 1800);
                pk0Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                pk0Var.a(fValueOf3, 3300);
                pk0Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                pk0Var.a(fValueOf4, 4800);
                pk0Var.a(fValueOf4, 6000);
                return t32.a;
            case 24:
                fb1 fb1Var = fb1.c;
                ck0[] ck0VarArr = yl1.a;
                zl1 zl1Var = vl1.c;
                ck0 ck0Var = yl1.a[1];
                ((am1) obj).a(zl1Var, fb1Var);
                return t32.a;
            case 25:
                return new ff1();
            case 26:
                return new ih1((Map) obj);
            case 27:
                return obj;
            case 28:
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                sa0 sa0Var = (sa0) ei1.h.c;
                Boolean bool = Boolean.FALSE;
                zq1 zq1Var2 = (xi0.o(obj2, bool) || obj2 == null) ? null : (zq1) sa0Var.i(obj2);
                Object obj3 = list3.get(1);
                zq1 zq1Var3 = (xi0.o(obj3, bool) || obj3 == null) ? null : (zq1) sa0Var.i(obj3);
                Object obj4 = list3.get(2);
                zq1 zq1Var4 = (xi0.o(obj4, bool) || obj4 == null) ? null : (zq1) sa0Var.i(obj4);
                Object obj5 = list3.get(3);
                if (!xi0.o(obj5, bool) && obj5 != null) {
                    zq1Var = (zq1) sa0Var.i(obj5);
                }
                return new sz1(zq1Var2, zq1Var3, zq1Var4, zq1Var);
            default:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                List list5 = (xi0.o(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((sa0) ei1.a.c).i(obj6);
                Object obj7 = list4.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new hb(list5, str2);
        }
    }

    public /* synthetic */ mt(int i) {
        this.e = i;
    }
}
