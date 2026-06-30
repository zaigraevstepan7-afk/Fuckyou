package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p089t.AbstractC1048e;

/* JADX INFO: renamed from: y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1099b {

    /* JADX INFO: renamed from: a */
    public boolean f4584a = false;

    /* JADX INFO: renamed from: b */
    public int f4585b;

    /* JADX INFO: renamed from: c */
    public int f4586c;

    /* JADX INFO: renamed from: d */
    public float f4587d;

    /* JADX INFO: renamed from: e */
    public String f4588e;

    /* JADX INFO: renamed from: f */
    public boolean f4589f;

    /* JADX INFO: renamed from: g */
    public int f4590g;

    public C1099b(C1099b c1099b, Object obj) {
        c1099b.getClass();
        this.f4585b = c1099b.f4585b;
        m2730b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m2729a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1115r.f4804d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i2 = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i2 = 4;
            } else {
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i2 = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i2 = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i2 = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i2 = 8;
                }
                i2 = 7;
            }
        }
        if (string != null && objValueOf != null) {
            C1099b c1099b = new C1099b();
            c1099b.f4585b = i2;
            c1099b.f4584a = z2;
            c1099b.m2730b(objValueOf);
            map.put(string, c1099b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m2730b(Object obj) {
        switch (AbstractC1048e.m2545a(this.f4585b)) {
            case 0:
            case 7:
                this.f4586c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4587d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4590g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4588e = (String) obj;
                break;
            case 5:
                this.f4589f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4587d = ((Float) obj).floatValue();
                break;
        }
    }
}
