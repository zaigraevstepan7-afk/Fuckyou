package p007E;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p002B.AbstractC0018a;
import p005C0.C0048n;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0058d {

    /* JADX INFO: renamed from: a */
    public final Shader f194a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f195b;

    /* JADX INFO: renamed from: c */
    public int f196c;

    public C0058d(Shader shader, ColorStateList colorStateList, int i2) {
        this.f194a = shader;
        this.f195b = colorStateList;
        this.f196c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0058d m341a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        float f;
        int i3;
        float f2;
        float f3;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM340b = AbstractC0057c.m340b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0058d(null, colorStateListM340b, colorStateListM340b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM330g = AbstractC0056b.m330g(resources, theme, attributeSetAsAttributeSet, AbstractC0018a.f43d);
        float f4 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayM330g.getFloat(8, 0.0f);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM330g.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM330g.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM330g.getFloat(11, 0.0f) : 0.0f;
        float f8 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayM330g.getFloat(3, 0.0f);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM330g.getFloat(4, 0.0f) : 0.0f;
        int i4 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayM330g.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM330g.getColor(0, 0) : 0;
        boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM330g.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM330g.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f4;
            i3 = typedArrayM330g.getInt(6, 0);
        } else {
            f = f4;
            i3 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM330g.getFloat(5, 0.0f) : 0.0f;
        typedArrayM330g.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f5;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM330g2 = AbstractC0056b.m330g(resources, theme, attributeSetAsAttributeSet, AbstractC0018a.f44e);
                boolean zHasValue = typedArrayM330g2.hasValue(0);
                boolean zHasValue2 = typedArrayM330g2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM330g2.getColor(0, 0);
                float f12 = typedArrayM330g2.getFloat(1, 0.0f);
                typedArrayM330g2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f5 = f2;
            f6 = f3;
        }
        C0048n c0048n = arrayList2.size() > 0 ? new C0048n(arrayList2, arrayList) : null;
        if (c0048n == null) {
            c0048n = z2 ? new C0048n(color, color2, color3) : new C0048n(color, color3);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                radialGradient = new LinearGradient(f, f2, f3, f7, (int[]) c0048n.f174b, (float[]) c0048n.f175c, i3 != 1 ? i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f8, f9, (int[]) c0048n.f174b, (float[]) c0048n.f175c);
            }
        } else {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f8, f9, f11, (int[]) c0048n.f174b, (float[]) c0048n.f175c, i3 != 1 ? i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new C0058d(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m342b() {
        ColorStateList colorStateList;
        return this.f194a == null && (colorStateList = this.f195b) != null && colorStateList.isStateful();
    }
}
