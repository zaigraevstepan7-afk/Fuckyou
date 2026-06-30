package p007E;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p009F.AbstractC0080g;
import p066g0.C0757j0;

/* JADX INFO: renamed from: E.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071q {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f219a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f220b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f221c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m349a(C0067m c0067m, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f221c) {
            try {
                WeakHashMap weakHashMap = f220b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c0067m);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c0067m, sparseArray);
                }
                sparseArray.append(i2, new C0066l(colorStateList, c0067m.f211a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m350b(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return m351c(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m351c(Context context, int i2, TypedValue typedValue, int i3, AbstractC0056b abstractC0056b, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM365a = null;
        if (string.startsWith("res/")) {
            int i4 = typedValue.assetCookie;
            C0757j0 c0757j0 = AbstractC0080g.f246b;
            Typeface typeface = (Typeface) c0757j0.m2085f(AbstractC0080g.m366b(resources, i2, string, i4, i3));
            if (typeface != null) {
                if (abstractC0056b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0068n(abstractC0056b, 0, typeface));
                }
                typefaceM365a = typeface;
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0060f interfaceC0060fM331j = AbstractC0056b.m331j(resources.getXml(i2), resources);
                        if (interfaceC0060fM331j == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC0056b != null) {
                                abstractC0056b.m336a(-3);
                            }
                        } else {
                            typefaceM365a = AbstractC0080g.m365a(context, interfaceC0060fM331j, resources, i2, string, typedValue.assetCookie, i3, abstractC0056b, z2);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo229x = AbstractC0080g.f245a.mo229x(context, resources, i2, string, i3);
                        if (typefaceMo229x != null) {
                            c0757j0.m2089j(AbstractC0080g.m366b(resources, i2, string, i5, i3), typefaceMo229x);
                        }
                        if (abstractC0056b != null) {
                            if (typefaceMo229x != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0068n(abstractC0056b, 0, typefaceMo229x));
                            } else {
                                abstractC0056b.m336a(-3);
                            }
                        }
                        typefaceM365a = typefaceMo229x;
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e2);
                    if (abstractC0056b != null) {
                        abstractC0056b.m336a(-3);
                    }
                } catch (XmlPullParserException e3) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
                    if (abstractC0056b != null) {
                    }
                }
            }
        } else if (abstractC0056b != null) {
            abstractC0056b.m336a(-3);
        }
        if (typefaceM365a != null || abstractC0056b != null || z3) {
            return typefaceM365a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }
}
