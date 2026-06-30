package p007E;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.reddit.frontpage.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p002B.AbstractC0018a;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0057c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f193a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m339a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m340b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m340b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int[] iArr;
        int i2;
        int iM328e;
        int i3;
        float fCbrt;
        TypedValue typedValue;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC0018a.f40a;
                TypedArray typedArrayObtainAttributes = theme2 == null ? resources2.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i4, i4);
                int resourceId = typedArrayObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f193a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources2.getValue(resourceId, typedValue, (boolean) r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = m339a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i4, -65281);
                    }
                    float f = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i8);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.resc && attributeNameResource != R.attr.resc) {
                            int i9 = i7 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i7);
                    boolean z2 = f2 >= 0.0f && f2 <= 100.0f;
                    if (f != 1.0f || z2) {
                        int iM183l = AbstractC0016e.m183l((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                        if (z2) {
                            C0055a c0055aM322a = C0055a.m322a(color);
                            C0072r c0072r = C0072r.f222k;
                            float f3 = c0055aM322a.f181b;
                            if (f3 < 1.0d || Math.round(f2) <= 0.0d || Math.round(f2) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i2 = depth2;
                                iM328e = AbstractC0056b.m328e(f2);
                            } else {
                                float f4 = c0055aM322a.f180a;
                                float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                                float f5 = f3;
                                C0055a c0055a = null;
                                boolean z3 = true;
                                float f6 = 0.0f;
                                while (true) {
                                    if (Math.abs(f6 - f3) >= 0.4f) {
                                        float f7 = 1000.0f;
                                        float f8 = 1000.0f;
                                        float f9 = 0.0f;
                                        float f10 = 100.0f;
                                        C0055a c0055a2 = null;
                                        while (true) {
                                            if (Math.abs(f9 - f10) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i2 = depth2;
                                                break;
                                            }
                                            float f11 = ((f10 - f9) / 2.0f) + f9;
                                            iArr = iArrTrimStateSet;
                                            int iM324c = C0055a.m323b(f11, f5, fMin).m324c(C0072r.f222k);
                                            float fM329f = AbstractC0056b.m329f(Color.red(iM324c));
                                            float fM329f2 = AbstractC0056b.m329f(Color.green(iM324c));
                                            float fM329f3 = AbstractC0056b.m329f(Color.blue(iM324c));
                                            float[] fArr = AbstractC0056b.f189d[1];
                                            float f12 = ((fM329f3 * fArr[2]) + ((fM329f2 * fArr[1]) + (fM329f * fArr[0]))) / 100.0f;
                                            if (f12 <= 0.008856452f) {
                                                fCbrt = f12 * 903.2963f;
                                                i3 = iM324c;
                                            } else {
                                                i3 = iM324c;
                                                fCbrt = (((float) Math.cbrt(f12)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f2 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0055a c0055aM322a2 = C0055a.m322a(i3);
                                                C0055a c0055aM323b = C0055a.m323b(c0055aM322a2.f182c, c0055aM322a2.f181b, fMin);
                                                float f13 = c0055aM322a2.f183d - c0055aM323b.f183d;
                                                float f14 = c0055aM322a2.f184e - c0055aM323b.f184e;
                                                float f15 = c0055aM322a2.f185f - c0055aM323b.f185f;
                                                i2 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f8 = fPow;
                                                    f7 = fAbs;
                                                    c0055a2 = c0055aM322a2;
                                                }
                                            } else {
                                                i2 = depth2;
                                            }
                                            if (f7 == 0.0f && f8 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f2) {
                                                f9 = f11;
                                            } else {
                                                f10 = f11;
                                            }
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        }
                                        C0055a c0055a3 = c0055a2;
                                        if (!z3) {
                                            if (c0055a3 == null) {
                                                f3 = f5;
                                            } else {
                                                c0055a = c0055a3;
                                                f6 = f5;
                                            }
                                            f5 = ((f3 - f6) / 2.0f) + f6;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        } else {
                                            if (c0055a3 != null) {
                                                iM328e = c0055a3.m324c(c0072r);
                                                break;
                                            }
                                            f5 = ((f3 - f6) / 2.0f) + f6;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                            z3 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i2 = depth2;
                                        iM328e = c0055a == null ? AbstractC0056b.m328e(f2) : c0055a.m324c(c0072r);
                                    }
                                }
                            }
                            color = iM328e;
                        } else {
                            iArr = iArrTrimStateSet;
                            i2 = depth2;
                        }
                        color = (16777215 & color) | (iM183l << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i2 = depth2;
                    }
                    int i10 = i5 + 1;
                    if (i10 > iArr2.length) {
                        int[] iArr5 = new int[i5 <= 4 ? 8 : i5 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i5);
                        iArr2 = iArr5;
                    }
                    iArr2[i5] = color;
                    if (i10 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i5);
                        objArr = objArr2;
                    }
                    objArr[i5] = iArr;
                    objArr = (int[][]) objArr;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i5 = i10;
                    depth2 = i2;
                    r4 = 1;
                    i4 = 0;
                    resources2 = resources;
                }
            } else {
                resources2 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                depth2 = depth2;
                r4 = 1;
                i4 = 0;
            }
        }
        int[] iArr6 = new int[i5];
        int[][] iArr7 = new int[i5][];
        System.arraycopy(iArr2, 0, iArr6, 0, i5);
        System.arraycopy(objArr, 0, iArr7, 0, i5);
        return new ColorStateList(iArr7, iArr6);
    }
}
