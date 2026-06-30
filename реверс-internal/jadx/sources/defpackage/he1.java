package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.reddit.secondpage.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class he1 {
    public static he1 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public vb e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final ge1 h = new ge1(6);

    public static synchronized he1 c() {
        try {
            if (g == null) {
                g = new he1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ge1 ge1Var = h;
        ge1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) ge1Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        dr1 dr1Var = (dr1) this.a.get(context);
        if (dr1Var == null) {
            dr1Var = new dr1();
            this.a.put(context, dr1Var);
        }
        int i2 = dr1Var.g;
        if (i2 != 0 && i <= dr1Var.e[i2 - 1]) {
            dr1Var.c(i, colorStateList);
            return;
        }
        if (i2 >= dr1Var.e.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            dr1Var.e = Arrays.copyOf(dr1Var.e, i6);
            dr1Var.f = Arrays.copyOf(dr1Var.f, i6);
        }
        dr1Var.e[i2] = i;
        dr1Var.f[i2] = colorStateList;
        dr1Var.g = i2 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableC;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            qs0 qs0Var = (qs0) this.b.get(context);
            layerDrawableC = null;
            if (qs0Var != null && (weakReference = (WeakReference) qs0Var.a(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    qs0Var.d(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = vb.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = vb.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = vb.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                qs0 qs0Var2 = (qs0) this.b.get(context);
                if (qs0Var2 == null) {
                    qs0Var2 = new qs0();
                    this.b.put(context, qs0Var2);
                }
                qs0Var2.c(j, new WeakReference(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i);
    }

    public final synchronized Drawable e(Context context, int i) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, drawableB);
            }
            if (drawableB != null) {
                int[] iArr = x10.a;
                String name = drawableB.getClass().getName();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = drawableB.getState();
                    if (state == null || state.length == 0) {
                        drawableB.setState(x10.a);
                    } else {
                        drawableB.setState(x10.b);
                    }
                    drawableB.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        dr1 dr1Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (dr1Var = (dr1) weakHashMap.get(context)) == null) ? null : (ColorStateList) dr1Var.b(i);
        if (colorStateList == null) {
            vb vbVar = this.e;
            if (vbVar != null) {
                colorStateListD = vbVar.d(context, i);
            }
            if (colorStateListD != null) {
                a(context, i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable h(Context context, int i, Drawable drawable) {
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            PorterDuff.Mode mode = null;
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        vb vbVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (vbVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = k02.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = wb.b;
                vb.e(drawableFindDrawableByLayerId, iC, mode2);
                vb.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), k02.c(context, R.attr.colorControlNormal), mode2);
                vb.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), k02.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = k02.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = wb.b;
                vb.e(drawableFindDrawableByLayerId2, iB, mode3);
                vb.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), k02.c(context, R.attr.colorControlActivated), mode3);
                vb.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), k02.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        vb vbVar2 = this.e;
        if (vbVar2 != null) {
            PorterDuff.Mode mode4 = wb.b;
            boolean z = true;
            if (vb.a(vbVar2.a, i)) {
                iRound = -1;
                if (z) {
                }
            } else {
                if (vb.a(vbVar2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = vb.a(vbVar2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        if (z) {
                            Drawable drawableMutate2 = drawable.mutate();
                            int iC2 = k02.c(context, i2);
                            synchronized (wb.class) {
                                porterDuffColorFilterF = f(iC2, mode4);
                            }
                            drawableMutate2.setColorFilter(porterDuffColorFilterF);
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                            }
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z = false;
                    }
                }
                iRound = -1;
                if (z) {
                }
            }
        }
        return drawable;
    }
}
