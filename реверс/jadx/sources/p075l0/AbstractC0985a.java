package p075l0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p007E.AbstractC0056b;
import p009F.C0079f;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985a {

    /* JADX INFO: renamed from: a */
    public static final int[] f3893a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f3894b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f3895c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f3896d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f3897e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f3898f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final int[] f3899g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h */
    public static final int[] f3900h = {R.attr.ordering};

    /* JADX INFO: renamed from: i */
    public static final int[] f3901i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j */
    public static final int[] f3902j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k */
    public static final int[] f3903k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:210:0x03af, code lost:
    
        if (r32 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03b1, code lost:
    
        if (r22 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03b3, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c2, code lost:
    
        if (r3.hasNext() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03c4, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03d0, code lost:
    
        if (r33 != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03d2, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03d6, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03d9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0381 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0391  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator m2438a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2) throws XmlPullParserException, IOException {
        int i3;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i4;
        ArrayList arrayList2;
        PropertyValuesHolder propertyValuesHolderM2439b;
        int size;
        float fraction;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList3;
        Keyframe keyframeOfFloat;
        Resources.Theme theme2;
        int i8;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlResourceParser xmlResourceParser2;
        Animator animator;
        Animator animatorM2441d;
        int depth = xmlResourceParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList4 = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i9 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i10 = 1;
            if (next == 1) {
                break;
            }
            int i11 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m2441d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorM2441d = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorM2441d = m2441d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayM330g = AbstractC0056b.m330g(resources3, theme3, attributeSet, f3900h);
                        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i8 = typedArrayM330g.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlResourceParser2 = xmlResourceParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i8 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlResourceParser2 = xmlResourceParser;
                        }
                        m2438a(context, resources2, theme2, xmlResourceParser2, attributeSet3, animatorSet2, i8);
                        animator = animatorSet2;
                        typedArrayM330g.recycle();
                        i3 = depth;
                        arrayList = arrayList4;
                        animator2 = animator;
                        if (animatorSet == null || z2) {
                            arrayList4 = arrayList;
                        } else {
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(animator2);
                        }
                        depth = i3;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList5 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i9 || eventType == i10) {
                                break;
                            }
                            if (eventType != i11) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals("propertyValuesHolder")) {
                                    TypedArray typedArrayM330g2 = AbstractC0056b.m330g(resources3, theme3, attributeSetAsAttributeSet, f3901i);
                                    String strM326c = AbstractC0056b.m326c(typedArrayM330g2, xmlResourceParser, "propertyName", i9);
                                    int i12 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayM330g2.getInt(i11, 4);
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    int i13 = i12;
                                    ArrayList arrayList6 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        i4 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = f3902j;
                                            arrayList3 = arrayList4;
                                            if (i13 == 4) {
                                                TypedArray typedArrayM330g3 = AbstractC0056b.m330g(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue typedValuePeekValue = !AbstractC0056b.m327d(xmlResourceParser, "value") ? null : typedArrayM330g3.peekValue(0);
                                                int i14 = (typedValuePeekValue == null || !m2440c(typedValuePeekValue.type)) ? 0 : 3;
                                                typedArrayM330g3.recycle();
                                                i13 = i14;
                                            }
                                            TypedArray typedArrayM330g4 = AbstractC0056b.m330g(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float f = AbstractC0056b.m327d(xmlResourceParser, "fraction") ? typedArrayM330g4.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue typedValuePeekValue2 = !AbstractC0056b.m327d(xmlResourceParser, "value") ? null : typedArrayM330g4.peekValue(0);
                                            boolean z3 = typedValuePeekValue2 != null;
                                            int i15 = i13 == 4 ? (z3 && m2440c(typedValuePeekValue2.type)) ? 3 : 0 : i13;
                                            if (!z3) {
                                                keyframeOfFloat = i15 == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
                                            } else if (i15 == 0) {
                                                keyframeOfFloat = Keyframe.ofFloat(f, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayM330g4.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i15 == 1 || i15 == 3) {
                                                keyframeOfFloat = Keyframe.ofInt(f, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayM330g4.getInt(0, 0) : 0);
                                            } else {
                                                keyframeOfFloat = null;
                                            }
                                            int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayM330g4.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            typedArrayM330g4.recycle();
                                            if (keyframeOfFloat != null) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(keyframeOfFloat);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            arrayList3 = arrayList4;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i4;
                                        arrayList4 = arrayList3;
                                    }
                                    arrayList2 = arrayList4;
                                    if (arrayList6 == null || (size = arrayList6.size()) <= 0) {
                                        propertyValuesHolderM2439b = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList6.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList6.get(size - 1);
                                        float fraction2 = keyframe2.getFraction();
                                        int i16 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction2 >= 1.0f) {
                                            fraction = keyframe.getFraction();
                                            if (fraction != 0.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList6.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i16++;
                                                }
                                            }
                                            i5 = i16;
                                            Keyframe[] keyframeArr = new Keyframe[i5];
                                            arrayList6.toArray(keyframeArr);
                                            i6 = 0;
                                            while (i6 < i5) {
                                                Keyframe keyframe3 = keyframeArr[i6];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i7 = i5;
                                                } else {
                                                    if (i6 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i17 = i5 - 1;
                                                        if (i6 == i17) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i18 = i6;
                                                            for (int i19 = i6 + 1; i19 < i17 && keyframeArr[i19].getFraction() < 0.0f; i19++) {
                                                                i18 = i19;
                                                            }
                                                            float fraction3 = (keyframeArr[i18 + 1].getFraction() - keyframeArr[i6 - 1].getFraction()) / ((i18 - i6) + 2);
                                                            int i20 = i6;
                                                            while (i20 <= i18) {
                                                                float f2 = fraction3;
                                                                keyframeArr[i20].setFraction(keyframeArr[i20 - 1].getFraction() + f2);
                                                                i20++;
                                                                i5 = i5;
                                                                fraction3 = f2;
                                                            }
                                                            i7 = i5;
                                                        }
                                                    }
                                                    i7 = i5;
                                                }
                                                i6++;
                                                i5 = i7;
                                            }
                                            propertyValuesHolderM2439b = PropertyValuesHolder.ofKeyframe(strM326c, keyframeArr);
                                            if (i13 == 3) {
                                                propertyValuesHolderM2439b.setEvaluator(C0991g.f3917a);
                                            }
                                        } else if (fraction2 < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                            fraction = keyframe.getFraction();
                                            if (fraction != 0.0f) {
                                            }
                                            i5 = i16;
                                            Keyframe[] keyframeArr2 = new Keyframe[i5];
                                            arrayList6.toArray(keyframeArr2);
                                            i6 = 0;
                                            while (i6 < i5) {
                                            }
                                            propertyValuesHolderM2439b = PropertyValuesHolder.ofKeyframe(strM326c, keyframeArr2);
                                            if (i13 == 3) {
                                            }
                                        } else {
                                            arrayList6.add(arrayList6.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            i16++;
                                            fraction = keyframe.getFraction();
                                            if (fraction != 0.0f) {
                                            }
                                            i5 = i16;
                                            Keyframe[] keyframeArr22 = new Keyframe[i5];
                                            arrayList6.toArray(keyframeArr22);
                                            i6 = 0;
                                            while (i6 < i5) {
                                            }
                                            propertyValuesHolderM2439b = PropertyValuesHolder.ofKeyframe(strM326c, keyframeArr22);
                                            if (i13 == 3) {
                                            }
                                        }
                                    }
                                    if (propertyValuesHolderM2439b == null) {
                                        propertyValuesHolderM2439b = m2439b(typedArrayM330g2, i12, 0, 1, strM326c);
                                    }
                                    if (propertyValuesHolderM2439b != null) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(propertyValuesHolderM2439b);
                                    }
                                    typedArrayM330g2.recycle();
                                } else {
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    i4 = depth;
                                    arrayList2 = arrayList4;
                                }
                                xmlResourceParser.next();
                                resources3 = resources;
                                theme3 = theme;
                                attributeSetAsAttributeSet = attributeSet2;
                                depth = i4;
                                arrayList4 = arrayList2;
                                i9 = 3;
                                i10 = 1;
                                i11 = 2;
                            }
                        }
                        i3 = depth;
                        arrayList = arrayList4;
                        if (arrayList5 != null) {
                            int size2 = arrayList5.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i21 = 0; i21 < size2; i21++) {
                                propertyValuesHolderArr[i21] = (PropertyValuesHolder) arrayList5.get(i21);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                            ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                        }
                        z2 = true;
                        animator2 = animator2;
                        if (animatorSet == null) {
                            arrayList4 = arrayList;
                            depth = i3;
                        }
                    }
                }
                animator = animatorM2441d;
                i3 = depth;
                arrayList = arrayList4;
                animator2 = animator;
                if (animatorSet == null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static PropertyValuesHolder m2439b(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue != null;
        int i5 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue2 != null;
        int i6 = z3 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && m2440c(i5)) || (z3 && m2440c(i6))) ? 3 : 0;
        }
        boolean z4 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            C0079f[] c0079fArrM202y = AbstractC0016e.m202y(string);
            C0079f[] c0079fArrM202y2 = AbstractC0016e.m202y(string2);
            if (c0079fArrM202y != null || c0079fArrM202y2 != null) {
                if (c0079fArrM202y != null) {
                    C0990f c0990f = new C0990f();
                    if (c0079fArrM202y2 == null) {
                        return PropertyValuesHolder.ofObject(str, c0990f, c0079fArrM202y);
                    }
                    if (AbstractC0016e.m176g(c0079fArrM202y, c0079fArrM202y2)) {
                        return PropertyValuesHolder.ofObject(str, c0990f, c0079fArrM202y, c0079fArrM202y2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (c0079fArrM202y2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C0990f(), c0079fArrM202y2);
                }
            }
            return null;
        }
        C0991g c0991g = i2 == 3 ? C0991g.f3917a : null;
        if (z4) {
            if (z2) {
                float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                if (z3) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z2) {
            int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2440c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            if (z3) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m2440c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z3) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m2440c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
        }
        if (propertyValuesHolderOfInt != null && c0991g != null) {
            propertyValuesHolderOfInt.setEvaluator(c0991g);
        }
        return propertyValuesHolderOfInt;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2440c(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX INFO: renamed from: d */
    public static ValueAnimator m2441d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayM330g = AbstractC0056b.m330g(resources, theme, attributeSet, f3899g);
        TypedArray typedArrayM330g2 = AbstractC0056b.m330g(resources, theme, attributeSet, f3903k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0056b.m327d(xmlResourceParser, "duration") ? typedArrayM330g.getInt(1, 300) : 300;
        long j3 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayM330g.getInt(2, 0);
        int i2 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayM330g.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayM330g.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i3 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM330g.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i2 = ((z2 && m2440c(i3)) || (z3 && m2440c(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM2439b = m2439b(typedArrayM330g, i2, 5, 6, "");
            if (propertyValuesHolderM2439b != null) {
                valueAnimator3.setValues(propertyValuesHolderM2439b);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayM330g.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayM330g.getInt(4, 1) : 1);
        if (typedArrayM330g2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strM326c = AbstractC0056b.m326c(typedArrayM330g2, xmlResourceParser, "pathData", 1);
            if (strM326c != null) {
                String strM326c2 = AbstractC0056b.m326c(typedArrayM330g2, xmlResourceParser, "propertyXName", 2);
                String strM326c3 = AbstractC0056b.m326c(typedArrayM330g2, xmlResourceParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (strM326c2 == null && strM326c3 == null) {
                    throw new InflateException(typedArrayM330g2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM204z = AbstractC0016e.m204z(strM326c);
                PathMeasure pathMeasure = new PathMeasure(pathM204z, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathM204z, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                float f2 = 0.0f;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        break;
                    }
                    int i6 = i4;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i6] = fArr3[0];
                    fArr2[i6] = fArr3[1];
                    int i7 = i5 + 1;
                    f2 += f;
                    if (i7 < arrayList.size() && f2 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4 = i6 + 1;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM326c2 != null ? PropertyValuesHolder.ofFloat(strM326c2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM326c3 != null ? PropertyValuesHolder.ofFloat(strM326c3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                resourceId = 0;
            } else {
                valueAnimator = valueAnimator3;
                resourceId = 0;
                objectAnimator2.setPropertyName(AbstractC0056b.m326c(typedArrayM330g2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayM330g.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayM330g.recycle();
        if (typedArrayM330g2 != null) {
            typedArrayM330g2.recycle();
        }
        return valueAnimator2;
    }
}
