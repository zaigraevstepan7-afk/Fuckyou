package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v22 {
    public static final qc1 a;
    public static final dt0 b;
    public static Paint c;

    static {
        qc1.e("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new z22();
        } else if (i >= 29) {
            a = new y22();
        } else if (i >= 28) {
            a = new x22();
        } else {
            a = new w22();
        }
        b = new dt0(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, r90 r90Var, Resources resources, int i, String str, int i2, int i3, zb zbVar, boolean z) {
        Typeface typefaceH;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 3;
        if (r90Var instanceof u90) {
            u90 u90Var = (u90) r90Var;
            String str2 = u90Var.d;
            typefaceH = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = u90Var.a;
                if (arrayList.size() == 1) {
                    typefaceBuild = c(((k90) arrayList.get(0)).e);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilderG = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= arrayList.size()) {
                                    break;
                                }
                                k90 k90Var = (k90) arrayList.get(i7);
                                if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(k90Var.f)) {
                                    customFallbackBuilderG.setSystemFallback(k90Var.e);
                                    break;
                                }
                                String str3 = k90Var.e;
                                String str4 = k90Var.f;
                                Font fontD = d(c(str3));
                                if (fontD == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + k90Var.e + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    fontFamilyBuild = dh0.z(fontD).build();
                                } else {
                                    try {
                                        dh0.m();
                                        dh0.A();
                                        fontFamilyBuild = dh0.k(q4.e(fontD).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilderG == null) {
                                    customFallbackBuilderG = dh0.g(fontFamilyBuild);
                                } else {
                                    customFallbackBuilderG.addCustomFallback(fontFamilyBuild);
                                }
                                i7++;
                            }
                        } else {
                            if (c(((k90) arrayList.get(i6)).e) == null) {
                                break;
                            }
                            i6++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                if (zbVar != null) {
                    new Handler(Looper.getMainLooper()).post(new y4(i4, zbVar, typefaceBuild));
                }
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr4 = !z ? zbVar != null : u90Var.c != 0;
            int i8 = z ? u90Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            y41 y41Var = new y41(19, z2);
            y41Var.f = zbVar;
            ArrayList arrayList2 = u90Var.a;
            yd1 yd1Var = new yd1(handler);
            xg0 xg0Var = new xg0(5, y41Var, yd1Var);
            if (objArr4 != true) {
                String strA = q90.a(i3, arrayList2);
                Typeface typeface = (Typeface) q90.a.a(strA);
                if (typeface != null) {
                    yd1Var.execute(new pi(objArr2 == true ? 1 : 0, y41Var, typeface));
                    typefaceH = typeface;
                } else {
                    o90 o90Var = new o90(objArr == true ? 1 : 0, xg0Var);
                    synchronized (q90.c) {
                        try {
                            zn1 zn1Var = q90.d;
                            ArrayList arrayList3 = (ArrayList) zn1Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(o90Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(o90Var);
                                zn1Var.put(strA, arrayList4);
                                n90 n90Var = new n90(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = q90.b;
                                o90 o90Var2 = new o90(i5, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                zd1 zd1Var = new zd1();
                                zd1Var.e = n90Var;
                                zd1Var.f = o90Var2;
                                zd1Var.g = handler2;
                                threadPoolExecutor.execute(zd1Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    yc.p("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                k90 k90Var2 = (k90) arrayList2.get(0);
                dt0 dt0Var = q90.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{k90Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = q90.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) q90.a.a(strA2);
                if (typeface2 != null) {
                    yd1Var.execute(new pi(objArr3 == true ? 1 : 0, y41Var, typeface2));
                    typefaceH = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr5 = {k90Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    p90 p90VarB = q90.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    xg0Var.B(p90VarB);
                    typefaceH = p90VarB.a;
                } else {
                    try {
                        try {
                            try {
                                p90 p90Var = (p90) q90.b.submit(new n90(strA2, context, k90Var2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                xg0Var.B(p90Var);
                                typefaceH = p90Var.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((yd1) xg0Var.g).execute(new qi((y41) xg0Var.f, -3));
                    }
                }
            }
        } else {
            typefaceH = a.h(context, (s90) r90Var, resources, i3);
            if (zbVar != null) {
                if (typefaceH != null) {
                    new Handler(Looper.getMainLooper()).post(new y4(i4, zbVar, typefaceH));
                } else {
                    zbVar.a(-3);
                }
            }
        }
        if (typefaceH != null) {
            b.b(b(resources, i, str, i2, i3), typefaceH);
        }
        return typefaceH;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
