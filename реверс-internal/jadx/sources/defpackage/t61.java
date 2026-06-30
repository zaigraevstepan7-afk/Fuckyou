package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class t61 implements o71, ab1, aj1 {
    public final /* synthetic */ int e;

    public t61(a7 a7Var) {
        this.e = 28;
    }

    public static final void a(t61 t61Var) {
        qs1 qs1Var;
        n61 n61Var;
        n61 n61Var2;
        qs1 qs1Var2 = jc1.z;
        do {
            qs1Var = jc1.z;
            n61Var = (n61) qs1Var.getValue();
            c61 c61VarC = n61Var.g;
            yp0 yp0Var = (yp0) c61VarC.get(t61Var);
            if (yp0Var == null) {
                n61Var2 = n61Var;
            } else {
                Object obj = yp0Var.a;
                Object obj2 = yp0Var.b;
                m22 m22Var = c61VarC.e;
                m22 m22VarV = m22Var.v(t61Var != null ? t61Var.hashCode() : 0, 0, t61Var);
                if (m22Var != m22VarV) {
                    c61VarC = m22VarV == null ? c61.g : new c61(m22VarV, c61VarC.f - 1);
                }
                v20 v20Var = v20.J;
                if (obj != v20Var) {
                    Object obj3 = c61VarC.get(obj);
                    obj3.getClass();
                    c61VarC = c61VarC.c(obj, new yp0(((yp0) obj3).a, obj2));
                }
                if (obj2 != v20Var) {
                    Object obj4 = c61VarC.get(obj2);
                    obj4.getClass();
                    c61VarC = c61VarC.c(obj2, new yp0(obj, ((yp0) obj4).b));
                }
                Object obj5 = obj != v20Var ? n61Var.e : obj2;
                if (obj2 != v20Var) {
                    obj = n61Var.f;
                }
                n61Var2 = new n61(obj5, obj, c61VarC);
            }
            if (n61Var == n61Var2) {
                return;
            }
        } while (!qs1Var.h(n61Var, n61Var2));
    }

    public static final int b(int i, long j) {
        int i2 = l12.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Typeface c(String str, aa0 aa0Var, int i) {
        if (i == 0 && xi0.o(aa0Var, aa0.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && xi0.o(aa0Var, aa0.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), aa0Var.e, i == 1);
    }

    public static Typeface d(String str, aa0 aa0Var, int i) {
        if (i == 0 && xi0.o(aa0Var, aa0.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iT = s22.t(aa0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iT) : Typeface.create(str, iT);
    }

    public static long i(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface e(zb0 zb0Var, aa0 aa0Var, int i) {
        String str;
        switch (this.e) {
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                zb0Var.getClass();
                return c("sans-serif", aa0Var, i);
            default:
                zb0Var.getClass();
                int i2 = aa0Var.e / 100;
                if (i2 >= 0 && i2 < 2) {
                    str = "sans-serif-thin";
                } else if (2 <= i2 && i2 < 4) {
                    str = "sans-serif-light";
                } else if (i2 != 4) {
                    str = i2 == 5 ? "sans-serif-medium" : ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) ? "sans-serif-black" : "sans-serif";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface typefaceD = d(str, aa0Var, i);
                    if (!xi0.o(typefaceD, Typeface.create(Typeface.DEFAULT, s22.t(aa0Var, i))) && !xi0.o(typefaceD, d(null, aa0Var, i))) {
                        typeface = typefaceD;
                    }
                }
                return typeface == null ? d("sans-serif", aa0Var, i) : typeface;
        }
    }

    @Override // defpackage.ab1
    public void f(int i, Object obj) {
        String str;
        switch (this.e) {
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case t91.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case el.a /* 9 */:
                    default:
                        str = "";
                        break;
                    case el.b /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                }
                break;
        }
    }

    public void g(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public String toString() {
        switch (this.e) {
            case 21:
                return "SharingStarted.Eagerly";
            case 22:
                return "SharingStarted.Lazily";
            case 23:
            default:
                return super.toString();
            case 24:
                return "ReusedSlotId";
        }
    }

    public /* synthetic */ t61(int i) {
        this.e = i;
    }

    private final void h(int i, Object obj) {
    }

    public void j(v81 v81Var, int i, int i2) {
    }

    @Override // defpackage.aj1
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.aj1
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
