package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class v20 implements og, kt, ix, an0, wh, se1, hq1, nu1 {
    public static final v20 s;
    public static final b5 y;
    public final /* synthetic */ int e;
    public static final uf f = new uf(-1.0f, -1.0f);
    public static final uf g = new uf(0.0f, -1.0f);
    public static final uf h = new uf(1.0f, -1.0f);
    public static final uf i = new uf(-1.0f, 0.0f);
    public static final uf j = new uf(0.0f, 0.0f);
    public static final uf k = new uf(1.0f, 0.0f);
    public static final uf l = new uf(-1.0f, 1.0f);
    public static final uf m = new uf(0.0f, 1.0f);
    public static final uf n = new uf(1.0f, 1.0f);
    public static final tf o = new tf(-1.0f);
    public static final tf p = new tf(0.0f);
    public static final sf q = new sf(-1.0f);
    public static final sf r = new sf(0.0f);
    public static final v20 t = new v20(3);
    public static final v20 u = new v20(4);
    public static final yc v = new yc(2);
    public static final b5 w = new b5(0);
    public static final b5 x = new b5(1);
    public static final /* synthetic */ v20 z = new v20(7);
    public static final /* synthetic */ v20 A = new v20(8);
    public static final v20 B = new v20(9);
    public static final v20 C = new v20(10);
    public static final v20 D = new v20(12);
    public static final v20 E = new v20(13);
    public static final v20 F = new v20(14);
    public static final al0 G = al0.e;
    public static final kx H = new kx(1.0f, 1.0f);
    public static final v20 I = new v20(15);
    public static final v20 J = new v20(16);
    public static final pc1 K = new pc1(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final v20 L = new v20(18);
    public static final /* synthetic */ v20 M = new v20(19);
    public static final /* synthetic */ v20 N = new v20(21);
    public static final /* synthetic */ v20 O = new v20(22);
    public static final /* synthetic */ v20 P = new v20(23);
    public static final /* synthetic */ v20 Q = new v20(24);
    public static final v20 R = new v20(25);
    public static final v20 S = new v20(26);
    public static final v20 T = new v20(27);
    public static final v20 U = new v20(28);
    public static final /* synthetic */ v20 V = new v20(29);

    static {
        int i2 = 2;
        s = new v20(i2);
        y = new b5(i2);
    }

    public /* synthetic */ v20(int i2) {
        this.e = i2;
    }

    public static final String i(String str) throws Exception {
        if (str.length() == 0) {
            return "Empty server response.";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("status", false)) {
                String strOptString = jSONObject.optString("message", "");
                return strOptString.length() == 0 ? "The latest version is already installed." : strOptString;
            }
            String strOptString2 = jSONObject.optString("error", "");
            if (strOptString2.length() == 0) {
                strOptString2 = jSONObject.optString("message", "");
            }
            if (strOptString2.length() == 0) {
                strOptString2 = str;
            }
            throw new Exception(strOptString2);
        } catch (JSONException e) {
            throw new Exception("Unexpected server response: ".concat(str), e);
        }
    }

    public static String k(File file) {
        Object oe1Var;
        if (!file.exists() || !file.isFile()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                bufferedInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest.getClass();
                oe1Var = nd.W(bArrDigest, "", new mt(1), 30);
            } finally {
            }
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        return (String) (oe1Var instanceof oe1 ? "" : oe1Var);
    }

    public static re0 l(ob0 ob0Var) {
        pn1 pn1Var = ((ju0) ob0Var.j(mu0.b)).c;
        re0 re0Var = pn1Var.j;
        if (re0Var != null) {
            return re0Var;
        }
        re0 re0Var2 = new re0(qn1.a(pn1Var, pv.x), qn1.a(pn1Var, pv.A));
        pn1Var.j = re0Var2;
        return re0Var2;
    }

    public static long m() {
        float f2 = pv.y;
        return bk.c(pv.z + f2 + f2, 40.0f);
    }

    @Override // defpackage.wh
    public hx b() {
        return H;
    }

    @Override // defpackage.hq1
    public boolean c(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.wh
    public long d() {
        return 9205357640488583168L;
    }

    @Override // defpackage.og
    public Rect e(Activity activity) throws Exception {
        int i2 = this.e;
        ng ngVar = og.a;
        DisplayCutout displayCutoutC = null;
        switch (i2) {
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        }
                    }
                }
                return rect;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    ngVar.getClass();
                    Log.w(ng.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i5 = rect2.bottom + dimensionPixelSize2;
                    if (i5 == point2.y) {
                        rect2.bottom = i5;
                    } else {
                        int i6 = rect2.right + dimensionPixelSize2;
                        if (i6 == point2.x) {
                            rect2.right = i6;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (b1.v(obj2)) {
                            displayCutoutC = b1.c(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        ngVar.getClass();
                        Log.w(ng.b, e2);
                    }
                    if (displayCutoutC != null) {
                        if (rect2.left == displayCutoutC.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutC.getSafeInsetRight()) {
                            rect2.right = displayCutoutC.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutC.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutC.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutC.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    ngVar.getClass();
                    Log.w(ng.b, e3);
                    return t.e(activity);
                }
        }
    }

    @Override // defpackage.nu1
    public void f(mu1 mu1Var) {
        mu1Var.clear();
    }

    @Override // defpackage.ix
    public float g(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.wh
    public al0 getLayoutDirection() {
        return G;
    }

    @Override // defpackage.nu1
    public boolean h(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        if (r10 == r5) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(dr0 dr0Var, ls lsVar) {
        vx vxVar;
        int iC;
        if (lsVar instanceof vx) {
            vxVar = (vx) lsVar;
            int i2 = vxVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vxVar.k = i2 - Integer.MIN_VALUE;
            } else {
                vxVar = new vx(this, lsVar);
            }
        }
        Object objP = vxVar.i;
        int i3 = vxVar.k;
        int i4 = 1;
        ks ksVar = null;
        wt wtVar = wt.e;
        if (i3 == 0) {
            xc.G(objP);
            int iOrdinal = dr0Var.i.ordinal();
            if (iOrdinal == 0) {
                vxVar.k = 1;
                lw lwVar = qy.a;
                objP = nu0.P(fw.g, new ba1("/data/local/z/.session", ksVar, 3), vxVar);
                if (objP != wtVar) {
                }
                return wtVar;
            }
            if (iOrdinal != 1) {
                ez1.a();
                return null;
            }
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append('|');
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append('|');
            String str3 = Build.BRAND;
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            sb.append('|');
            String str4 = Build.DEVICE;
            sb.append(str4 != null ? str4 : "");
            return sb.toString();
        }
        if (i3 != 1) {
            if (i3 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = vxVar.h;
            xc.G(objP);
            dr0Var = str5;
            new Integer(((Number) objP).intValue());
            return dr0Var;
        }
        xc.G(objP);
        String str6 = (String) objP;
        if (str6 != null && str6.length() != 0) {
            return str6;
        }
        StringBuilder sb2 = new StringBuilder(16);
        for (int i5 = 0; i5 < 16; i5++) {
            rh0 rh0Var = new rh0(0, 22, 1);
            g0 g0Var = wb1.e;
            try {
                g0 g0Var2 = wb1.e;
                if (rh0Var.isEmpty()) {
                    yc.n(rh0Var, "Cannot get random in empty range: ");
                    iC = 0;
                } else {
                    int i6 = rh0Var.f;
                    int i7 = rh0Var.e;
                    iC = i6 < Integer.MAX_VALUE ? wb1.e.c(i7, i6 + 1) : i7 > Integer.MIN_VALUE ? wb1.e.c(i7 - 1, i6) + 1 : wb1.e.b();
                }
                sb2.append("0123456789ABCDEFGHIJKLM".charAt(iC));
            } catch (IllegalArgumentException e) {
                yc.h(e.getMessage());
                return null;
            }
        }
        String string = sb2.toString();
        vxVar.h = string;
        vxVar.k = 2;
        lw lwVar2 = qy.a;
        objP = nu0.P(fw.g, new q71(new String[]{"mkdir -p /data/local/z", "printf '" + string + "' > /data/local/z/.session"}, ksVar, i4), vxVar);
        dr0Var = string;
    }

    public String toString() {
        switch (this.e) {
            case 26:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.an0
    public void a() {
    }

    @Override // defpackage.an0
    public void cancel() {
    }
}
