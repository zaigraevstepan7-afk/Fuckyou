package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class qw {
    public static final z81 a;

    static {
        a = new z81((30 & 1) == 0, dk1.e, true);
    }

    public static final void a(ww1 ww1Var, kw1 kw1Var, ob0 ob0Var, int i) {
        ob0 ob0Var2;
        Context context;
        ob0Var.X(1904307118);
        int i2 = (ob0Var.f(ww1Var) ? 4 : 2) | i | (ob0Var.h(kw1Var) ? 32 : 16);
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ob0Var.W(-1009482584);
                context = (Context) ob0Var.j(w4.b);
                ob0Var.p(false);
            } else {
                ob0Var.W(-1009433480);
                ob0Var.p(false);
                context = null;
            }
            boolean zH = ob0Var.h(kw1Var) | ((i2 & 14) == 4) | ob0Var.h(context);
            Object objK = ob0Var.K();
            if (zH || objK == kp.a) {
                objK = new kf(kw1Var, context, ww1Var, 6);
                ob0Var.f0(objK);
            }
            ob0Var2 = ob0Var;
            is.b(null, null, (sa0) objK, ob0Var2, 0, 3);
        } else {
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fi(i, 5, ww1Var, kw1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x061f, code lost:
    
        r3 = new defpackage.ze0(r25.b(), r8 | r10.b);
        r13.a.put(r15, new java.lang.ref.WeakReference(r3));
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x061c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, long j, ob0 ob0Var, final int i2) {
        TypedValue typedValue;
        int i3;
        int i4;
        boolean z;
        Object obj;
        Object f6Var;
        g41 vfVar;
        Object wfVar;
        TypedArray typedArray;
        boolean z2;
        long jF;
        int i5;
        int i6;
        XmlResourceParser xmlResourceParser;
        char c;
        int i7;
        TypedArray typedArrayObtainStyledAttributes;
        int i8;
        TypedArray typedArrayObtainStyledAttributes2;
        int i9;
        int i10;
        int i11;
        ColorStateList colorStateListA;
        final long j2 = j;
        ob0Var.X(-1240244237);
        int i12 = (i2 & 6) == 0 ? i2 | (ob0Var.d(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i12 |= ob0Var.e(j2) ? 32 : 16;
        }
        int i13 = i12;
        if (ob0Var.N(i13 & 1, (i13 & 19) != 18)) {
            nb1 nb1Var = w4.b;
            Context context = (Context) ob0Var.j(nb1Var);
            boolean zF = ob0Var.f(context) | ((i13 & 14) == 4);
            Object objK = ob0Var.K();
            if (zF || objK == kp.a) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                ob0Var.f0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                dc1 dc1VarR = ob0Var.r();
                if (dc1VarR != null) {
                    final int i14 = 1;
                    dc1VarR.d = new wa0() { // from class: pw
                        @Override // defpackage.wa0
                        public final Object h(Object obj2, Object obj3) {
                            int i15 = i14;
                            t32 t32Var = t32.a;
                            int i16 = i2;
                            long j3 = j2;
                            int i17 = i;
                            ob0 ob0Var2 = (ob0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    qw.b(i17, j3, ob0Var2, al.V(i16 | 1));
                                    break;
                                default:
                                    qw.b(i17, j3, ob0Var2, al.V(i16 | 1));
                                    break;
                            }
                            return t32Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) ob0Var.j(nb1Var);
            Resources resources = (Resources) ob0Var.j(w4.c);
            fe1 fe1Var = (fe1) ob0Var.j(w4.e);
            synchronized (fe1Var) {
                typedValue = (TypedValue) fe1Var.a.b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    hx0 hx0Var = fe1Var.a;
                    int iD = hx0Var.d(iIntValue);
                    i3 = 32;
                    Object[] objArr = hx0Var.c;
                    Object obj2 = objArr[iD];
                    hx0Var.b[iD] = iIntValue;
                    objArr[iD] = typedValue;
                } else {
                    i3 = 32;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                int i15 = 4;
                if (charSequence instanceof String ? jt1.H((String) charSequence, ".xml", false) : ct1.S(charSequence, charSequence.length() - 4, ".xml", 0, 4, false)) {
                    ob0Var.W(-1771798434);
                    Resources.Theme theme = context2.getTheme();
                    int i16 = typedValue.changingConfigurations;
                    bf0 bf0Var = (bf0) ob0Var.j(w4.d);
                    af0 af0Var = new af0(theme, iIntValue);
                    WeakReference weakReference = (WeakReference) bf0Var.a.get(af0Var);
                    ze0 ze0Var = weakReference != null ? (ze0) weakReference.get() : null;
                    if (ze0Var == null) {
                        XmlResourceParser xml = resources.getXml(iIntValue);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (!xi0.o(xml.getName(), "vector")) {
                            yc.p("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                            return;
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        z8 z8Var = new z8(xml);
                        int[] iArr = wi0.a;
                        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                        z8Var.c(typedArrayObtainAttributes.getChangingConfigurations());
                        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                            typedArray = typedArrayObtainAttributes;
                            z2 = typedArray.getBoolean(5, false);
                        } else {
                            typedArray = typedArrayObtainAttributes;
                            z2 = false;
                        }
                        z8Var.c(typedArray.getChangingConfigurations());
                        float fB = z8Var.b(typedArray, "viewportWidth", 7, 0.0f);
                        float fB2 = z8Var.b(typedArray, "viewportHeight", 8, 0.0f);
                        if (fB <= 0.0f) {
                            throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                        if (fB2 <= 0.0f) {
                            throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                        }
                        float dimension = typedArray.getDimension(3, 0.0f);
                        z8Var.c(typedArray.getChangingConfigurations());
                        float dimension2 = typedArray.getDimension(2, 0.0f);
                        z8Var.c(typedArray.getChangingConfigurations());
                        if (typedArray.hasValue(1)) {
                            TypedValue typedValue2 = new TypedValue();
                            typedArray.getValue(1, typedValue2);
                            if (typedValue2.type == 2) {
                                jF = vl.g;
                                i4 = i13;
                            } else {
                                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                    TypedValue typedValue3 = new TypedValue();
                                    typedArray.getValue(1, typedValue3);
                                    int i17 = typedValue3.type;
                                    if (i17 == 2) {
                                        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                    }
                                    if (i17 < 28 || i17 > 31) {
                                        Resources resources2 = typedArray.getResources();
                                        i4 = i13;
                                        int resourceId = typedArray.getResourceId(1, 0);
                                        ThreadLocal threadLocal = wm.a;
                                        try {
                                            colorStateListA = wm.a(resources2, resources2.getXml(resourceId), theme);
                                        } catch (Exception e) {
                                            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                                            colorStateListA = null;
                                        }
                                    } else {
                                        colorStateListA = ColorStateList.valueOf(typedValue3.data);
                                        i4 = i13;
                                    }
                                    z8Var.c(typedArray.getChangingConfigurations());
                                    jF = colorStateListA == null ? lk.f(colorStateListA.getDefaultColor()) : vl.g;
                                } else {
                                    i4 = i13;
                                }
                                colorStateListA = null;
                                z8Var.c(typedArray.getChangingConfigurations());
                                if (colorStateListA == null) {
                                }
                            }
                        } else {
                            i4 = i13;
                            jF = vl.g;
                        }
                        long j3 = jF;
                        int i18 = typedArray.getInt(6, -1);
                        z8Var.c(typedArray.getChangingConfigurations());
                        if (i18 == -1) {
                            i5 = 5;
                            float f = dimension / resources.getDisplayMetrics().density;
                            float f2 = dimension2 / resources.getDisplayMetrics().density;
                            typedArray.recycle();
                            xe0 xe0Var = new xe0(null, f, f2, fB, fB2, j3, i5, z2, 1);
                            i6 = 0;
                            while (true) {
                                if (xml.getEventType() == 1) {
                                    z = (xml.getDepth() < 1 && xml.getEventType() == 3) ? true : true;
                                    List listB = f40.e;
                                    XmlPullParser xmlPullParser = z8Var.a;
                                    l2 l2Var = z8Var.c;
                                    int i19 = i6;
                                    int eventType = xmlPullParser.getEventType();
                                    int i20 = i16;
                                    if (eventType != 2) {
                                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                            int i21 = i19 + 1;
                                            for (int i22 = 0; i22 < i21; i22++) {
                                                ArrayList arrayList = xe0Var.i;
                                                if (xe0Var.k) {
                                                    ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                we0 we0Var = (we0) arrayList.remove(arrayList.size() - 1);
                                                ((we0) arrayList.get(arrayList.size() - 1)).j.add(new z42(we0Var.a, we0Var.b, we0Var.c, we0Var.d, we0Var.e, we0Var.f, we0Var.g, we0Var.h, we0Var.i, we0Var.j));
                                            }
                                            xmlResourceParser = xml;
                                            c = '\t';
                                            i19 = 0;
                                            xmlResourceParser.next();
                                            i6 = i19;
                                            i16 = i20;
                                            xml = xmlResourceParser;
                                        }
                                        xmlResourceParser = xml;
                                    } else {
                                        String name = xmlPullParser.getName();
                                        if (name != null) {
                                            int iHashCode = name.hashCode();
                                            xmlResourceParser = xml;
                                            if (iHashCode != -1649314686) {
                                                if (iHashCode != 3433509) {
                                                    if (iHashCode == 98629247 && name.equals("group")) {
                                                        int[] iArr2 = wi0.b;
                                                        TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                                        z8Var.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                        float fB3 = z8Var.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                                        float f3 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                                        z8Var.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                        float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                                        z8Var.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                        float fB4 = z8Var.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                                        float fB5 = z8Var.b(typedArrayObtainAttributes2, "scaleY", i15, 1.0f);
                                                        float fB6 = z8Var.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                                        float fB7 = z8Var.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                                        String string = typedArrayObtainAttributes2.getString(0);
                                                        z8Var.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                        String str = string == null ? "" : string;
                                                        typedArrayObtainAttributes2.recycle();
                                                        int i23 = a52.a;
                                                        if (xe0Var.k) {
                                                            ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        xe0Var.i.add(new we0(str, fB3, f3, f4, fB4, fB5, fB6, fB7, listB, 512));
                                                    }
                                                } else if (name.equals("path")) {
                                                    int[] iArr3 = wi0.c;
                                                    if (theme == null) {
                                                        typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                                        i8 = 0;
                                                    } else {
                                                        i8 = 0;
                                                        typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                    }
                                                    z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                        yc.p("No path data available");
                                                        return;
                                                    }
                                                    String string2 = typedArrayObtainStyledAttributes2.getString(i8);
                                                    z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    String str2 = string2 == null ? "" : string2;
                                                    String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                                    z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    if (string3 == null) {
                                                        int i24 = a52.a;
                                                    } else {
                                                        listB = l2.b(l2Var, string3);
                                                    }
                                                    List list = listB;
                                                    qn qnVarA = z8Var.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                                    float fB8 = z8Var.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                    int i25 = !ef1.n(z8Var.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                                    z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    if (i25 == 0) {
                                                        i9 = 0;
                                                        i10 = ef1.n(z8Var.a, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                        z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        if (i10 != 0) {
                                                            if (i10 == 1) {
                                                                i11 = 1;
                                                            } else if (i10 == 2) {
                                                                i11 = 2;
                                                            }
                                                            float fB9 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                            qn qnVarA2 = z8Var.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                            float fB10 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                            float fB11 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                            float fB12 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                            float fB13 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                            float fB14 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                            int i26 = !ef1.n(z8Var.a, "fillType") ? 0 : typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                            z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                            typedArrayObtainStyledAttributes2.recycle();
                                                            Shader shader = (Shader) qnVarA.b;
                                                            int i27 = qnVarA.a;
                                                            lh mhVar = (shader != null && i27 == 0) ? null : shader != null ? new mh(shader) : new uq1(lk.f(i27));
                                                            Shader shader2 = (Shader) qnVarA2.b;
                                                            int i28 = qnVarA2.a;
                                                            lh mhVar2 = (shader2 == null && i28 == 0) ? null : shader2 != null ? new mh(shader2) : new uq1(lk.f(i28));
                                                            int i29 = i26 != 0 ? 0 : 1;
                                                            if (xe0Var.k) {
                                                                ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                            }
                                                            ((we0) xe0Var.i.get(r0.size() - 1)).j.add(new d52(str2, list, i29, mhVar, fB8, mhVar2, fB10, fB11, i9, i11, fB9, fB14, fB12, fB13));
                                                            i15 = 4;
                                                            c = '\t';
                                                        }
                                                        i11 = 0;
                                                        float fB92 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                        qn qnVarA22 = z8Var.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                        float fB102 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                        float fB112 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                        float fB122 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                        float fB132 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                        float fB142 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                        if (!ef1.n(z8Var.a, "fillType")) {
                                                        }
                                                        z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        typedArrayObtainStyledAttributes2.recycle();
                                                        Shader shader3 = (Shader) qnVarA.b;
                                                        int i272 = qnVarA.a;
                                                        if (shader3 != null) {
                                                            Shader shader22 = (Shader) qnVarA22.b;
                                                            int i282 = qnVarA22.a;
                                                            if (shader22 == null) {
                                                                if (i26 != 0) {
                                                                }
                                                                if (xe0Var.k) {
                                                                }
                                                                ((we0) xe0Var.i.get(r0.size() - 1)).j.add(new d52(str2, list, i29, mhVar, fB8, mhVar2, fB102, fB112, i9, i11, fB92, fB142, fB122, fB132));
                                                                i15 = 4;
                                                                c = '\t';
                                                            }
                                                        }
                                                    } else {
                                                        if (i25 == 1) {
                                                            i9 = 1;
                                                        } else if (i25 == 2) {
                                                            i9 = 2;
                                                        }
                                                        if (ef1.n(z8Var.a, "strokeLineJoin")) {
                                                        }
                                                        z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        if (i10 != 0) {
                                                        }
                                                        i11 = 0;
                                                        float fB922 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                        qn qnVarA222 = z8Var.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                        float fB1022 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                        float fB1122 = z8Var.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                        float fB1222 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                        float fB1322 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                        float fB1422 = z8Var.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                        if (!ef1.n(z8Var.a, "fillType")) {
                                                        }
                                                        z8Var.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        typedArrayObtainStyledAttributes2.recycle();
                                                        Shader shader32 = (Shader) qnVarA.b;
                                                        int i2722 = qnVarA.a;
                                                        if (shader32 != null) {
                                                        }
                                                    }
                                                    xmlResourceParser.next();
                                                    i6 = i19;
                                                    i16 = i20;
                                                    xml = xmlResourceParser;
                                                }
                                                i15 = 4;
                                                c = '\t';
                                                xmlResourceParser.next();
                                                i6 = i19;
                                                i16 = i20;
                                                xml = xmlResourceParser;
                                            } else {
                                                c = '\t';
                                                if (name.equals("clip-path")) {
                                                    int[] iArr4 = wi0.d;
                                                    if (theme == null) {
                                                        typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 0;
                                                        typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                                    }
                                                    z8Var.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                    String string4 = typedArrayObtainStyledAttributes.getString(i7);
                                                    z8Var.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                    String str3 = string4 == null ? "" : string4;
                                                    String string5 = typedArrayObtainStyledAttributes.getString(1);
                                                    z8Var.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                    if (string5 == null) {
                                                        int i30 = a52.a;
                                                    } else {
                                                        listB = l2.b(l2Var, string5);
                                                    }
                                                    List list2 = listB;
                                                    typedArrayObtainStyledAttributes.recycle();
                                                    if (xe0Var.k) {
                                                        ng0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    xe0Var.i.add(new we0(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                                    i19++;
                                                }
                                                xmlResourceParser.next();
                                                i6 = i19;
                                                i16 = i20;
                                                xml = xmlResourceParser;
                                            }
                                        } else {
                                            xmlResourceParser = xml;
                                        }
                                    }
                                    c = '\t';
                                    xmlResourceParser.next();
                                    i6 = i19;
                                    i16 = i20;
                                    xml = xmlResourceParser;
                                }
                            }
                        } else {
                            if (i18 == 3) {
                                i5 = 3;
                            } else if (i18 != 5) {
                                if (i18 != 9) {
                                    switch (i18) {
                                        case 14:
                                            i5 = 13;
                                            break;
                                        case 15:
                                            i5 = 14;
                                            break;
                                        case 16:
                                            i5 = 12;
                                            break;
                                    }
                                } else {
                                    i5 = 9;
                                }
                            }
                            float f5 = dimension / resources.getDisplayMetrics().density;
                            float f22 = dimension2 / resources.getDisplayMetrics().density;
                            typedArray.recycle();
                            xe0 xe0Var2 = new xe0(null, f5, f22, fB, fB2, j3, i5, z2, 1);
                            i6 = 0;
                            while (true) {
                                if (xml.getEventType() == 1) {
                                }
                                xmlResourceParser.next();
                                i6 = i19;
                                i16 = i20;
                                xml = xmlResourceParser;
                            }
                        }
                    } else {
                        i4 = i13;
                        z = true;
                    }
                    vfVar = uc1.z(ze0Var.a, ob0Var);
                    ob0Var.p(false);
                    obj = null;
                } else {
                    i4 = i13;
                    z = true;
                    ob0Var.W(-1771643000);
                    boolean zF2 = ob0Var.f(context2.getTheme()) | ob0Var.f(charSequence) | ob0Var.d(iIntValue);
                    Object objK2 = ob0Var.K();
                    if (zF2 || objK2 == kp.a) {
                        obj = null;
                        try {
                            Drawable drawable = resources.getDrawable(iIntValue, null);
                            drawable.getClass();
                            f6Var = new f6(((BitmapDrawable) drawable).getBitmap());
                            ob0Var.f0(f6Var);
                        } catch (Exception e2) {
                            throw new pn("Error attempting to load resource: " + ((Object) charSequence), e2);
                        }
                    } else {
                        f6Var = objK2;
                        obj = null;
                    }
                    f6 f6Var2 = (f6) f6Var;
                    vfVar = new vf(f6Var2, (((long) f6Var2.a.getHeight()) & 4294967295L) | (((long) f6Var2.a.getWidth()) << i3));
                    ob0Var.p(false);
                }
                boolean z3 = (i4 & 112) == i3 ? z : false;
                Object objK3 = ob0Var.K();
                if (z3 || objK3 == kp.a) {
                    if (j == 16) {
                        j2 = j;
                        wfVar = obj;
                    } else {
                        j2 = j;
                        wfVar = new wf(5, j2);
                    }
                    ob0Var.f0(wfVar);
                    objK3 = wfVar;
                } else {
                    j2 = j;
                }
                sg.a(nu0.E(ko1.e(qv0.a, es.e), vfVar, xr.b, (wl) objK3, 22), ob0Var, 0);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR2 = ob0Var.r();
        if (dc1VarR2 != null) {
            final int i31 = 0;
            dc1VarR2.d = new wa0() { // from class: pw
                @Override // defpackage.wa0
                public final Object h(Object obj22, Object obj3) {
                    int i152 = i31;
                    t32 t32Var = t32.a;
                    int i162 = i2;
                    long j32 = j2;
                    int i172 = i;
                    ob0 ob0Var2 = (ob0) obj22;
                    ((Integer) obj3).getClass();
                    switch (i152) {
                        case 0:
                            qw.b(i172, j32, ob0Var2, al.V(i162 | 1));
                            break;
                        default:
                            qw.b(i172, j32, ob0Var2, al.V(i162 | 1));
                            break;
                    }
                    return t32Var;
                }
            };
        }
    }

    public static final void c(ww1 ww1Var, lw1 lw1Var, ha0 ha0Var, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ob0Var.f(ww1Var) : ob0Var.h(ww1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ob0Var.f(lw1Var) : ob0Var.h(lw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(ha0Var) ? 256 : 128;
        }
        boolean z = false;
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && ob0Var.f(lw1Var));
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (z2 || objK == l91Var) {
                objK = new mt0(new qt0(13, new f8(7, lw1Var, ha0Var)));
                ob0Var.f0(objK);
            }
            mt0 mt0Var = (mt0) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && ob0Var.h(ww1Var))) {
                z = true;
            }
            Object objK2 = ob0Var.K();
            if (z || objK2 == l91Var) {
                objK2 = new p7(6, ww1Var);
                ob0Var.f0(objK2);
            }
            l7.a(mt0Var, (ha0) objK2, a, lk.d0(1315155414, new fi(4, lw1Var, ww1Var), ob0Var), ob0Var, 3456, 0);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(ww1Var, lw1Var, ha0Var, i, 6);
        }
    }

    public static final void d(tv0 tv0Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            pv.b(tv0Var, uw1.a, joVar, ob0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new m8(tv0Var, joVar, i, i3);
        }
    }
}
