package p101z0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p015I0.C0112h;
import p015I0.C0116l;
import p018K.C0154j;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p060e.C0662d;
import p060e.DialogInterfaceC0666h;
import p071j.C0788c;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1120b extends C0154j {

    /* JADX INFO: renamed from: c */
    public final C0112h f4819c;

    /* JADX INFO: renamed from: d */
    public final Rect f4820d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1120b(Context context) {
        TypedValue typedValueM189o0 = AbstractC0016e.m189o0(context, R.attr.resc);
        int i2 = typedValueM189o0 == null ? 0 : typedValueM189o0.data;
        Context contextM979a = AbstractC0322a.m979a(context, null, R.attr.resc, R.style.resc);
        contextM979a = i2 != 0 ? new C0788c(contextM979a, i2) : contextM979a;
        TypedValue typedValueM189o02 = AbstractC0016e.m189o0(context, R.attr.resc);
        super(contextM979a, typedValueM189o02 == null ? 0 : typedValueM189o02.data);
        ContextThemeWrapper contextThemeWrapper = ((C0662d) this.f485b).f2639a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        int[] iArr = AbstractC1013a.f4028j;
        AbstractC0047m.m272a(contextThemeWrapper, null, R.attr.resc, R.style.resc);
        AbstractC0047m.m273b(contextThemeWrapper, null, iArr, R.attr.resc, R.style.resc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.resc, R.style.resc);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f4820d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iM1055u = AbstractC0383m.m1055u(contextThemeWrapper, R.attr.resc, C1120b.class.getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.resc, R.style.resc);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iM1055u);
        typedArrayObtainStyledAttributes2.recycle();
        C0112h c0112h = new C0112h(contextThemeWrapper, null, R.attr.resc, R.style.resc);
        c0112h.m478j(contextThemeWrapper);
        c0112h.m480l(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((C0662d) this.f485b).f2639a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                C0116l c0116lM495e = c0112h.f346a.f328a.m495e();
                c0116lM495e.m490c(dimension);
                c0112h.setShapeAppearanceModel(c0116lM495e.m489a());
            }
        }
        this.f4819c = c0112h;
    }

    @Override // p018K.C0154j
    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0666h mo569a() {
        DialogInterfaceC0666h dialogInterfaceC0666hMo569a = super.mo569a();
        Window window = dialogInterfaceC0666hMo569a.getWindow();
        View decorView = window.getDecorView();
        C0112h c0112h = this.f4819c;
        if (c0112h != null) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            c0112h.m479k(AbstractC0229G.m707i(decorView));
        }
        Rect rect = this.f4820d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c0112h, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC1119a(dialogInterfaceC0666hMo569a, rect));
        return dialogInterfaceC0666hMo569a;
    }
}
