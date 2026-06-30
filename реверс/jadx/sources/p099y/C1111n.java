package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0529T;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p089t.AbstractC1048e;
import p091u.AbstractC1056a;
import p093v.C1060a;
import p097x.AbstractC1093a;

/* JADX INFO: renamed from: y.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1111n {

    /* JADX INFO: renamed from: d */
    public static final int[] f4794d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4795e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f4796f;

    /* JADX INFO: renamed from: a */
    public final HashMap f4797a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f4798b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f4799c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4795e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4796f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m2751c(C1098a c1098a, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1098a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC1114q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1098a.isInEditMode() && (c1098a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1098a.getParent();
                if (AbstractC0529T.m1418g(strTrim)) {
                    HashMap map = constraintLayout.f1432m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f1432m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x05fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0088. Please report as an issue. */
    /* JADX INFO: renamed from: d */
    public static C1106i m2752d(Context context, AttributeSet attributeSet, boolean z2) {
        int i2;
        String str;
        String str2;
        int i3;
        C1106i c1106i = new C1106i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC1115r.f4803c : AbstractC1115r.f4801a);
        int[] iArr = f4794d;
        String[] strArr = AbstractC1056a.f4216a;
        SparseIntArray sparseIntArray = f4795e;
        C1109l c1109l = c1106i.f4693b;
        C1110m c1110m = c1106i.f4696e;
        C1108k c1108k = c1106i.f4694c;
        C1107j c1107j = c1106i.f4695d;
        String str3 = "ConstraintSet";
        if (z2) {
            C1105h c1105h = new C1105h();
            c1105h.f4680a = new int[10];
            c1105h.f4681b = new int[10];
            c1105h.f4682c = 0;
            c1105h.f4683d = new int[10];
            c1105h.f4684e = new float[10];
            c1105h.f4685f = 0;
            c1105h.f4686g = new int[5];
            c1105h.f4687h = new String[5];
            c1105h.f4688i = 0;
            c1105h.f4689j = new int[4];
            c1105h.f4690k = new boolean[4];
            c1105h.f4691l = 0;
            c1108k.getClass();
            c1107j.getClass();
            c1110m.getClass();
            int i4 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i4 < indexCount; indexCount = i3) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = i4;
                switch (f4796f.get(index)) {
                    case 2:
                        i3 = indexCount;
                        c1105h.m2743b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4707I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i3 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i3 = indexCount;
                        c1105h.m2745d(typedArrayObtainStyledAttributes.getString(index), 5);
                        break;
                    case 6:
                        i3 = indexCount;
                        c1105h.m2743b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1107j.f4701C));
                        break;
                    case 7:
                        i3 = indexCount;
                        c1105h.m2743b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1107j.f4702D));
                        break;
                    case 8:
                        i3 = indexCount;
                        c1105h.m2743b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4708J));
                        break;
                    case 11:
                        i3 = indexCount;
                        c1105h.m2743b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4714P));
                        break;
                    case 12:
                        i3 = indexCount;
                        c1105h.m2743b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4715Q));
                        break;
                    case 13:
                        i3 = indexCount;
                        c1105h.m2743b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4711M));
                        break;
                    case 14:
                        i3 = indexCount;
                        c1105h.m2743b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4713O));
                        break;
                    case 15:
                        i3 = indexCount;
                        c1105h.m2743b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4716R));
                        break;
                    case 16:
                        i3 = indexCount;
                        c1105h.m2743b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4712N));
                        break;
                    case 17:
                        i3 = indexCount;
                        c1105h.m2743b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1107j.f4731d));
                        break;
                    case 18:
                        i3 = indexCount;
                        c1105h.m2743b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1107j.f4733e));
                        break;
                    case 19:
                        i3 = indexCount;
                        c1105h.m2742a(19, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4735f));
                        break;
                    case 20:
                        i3 = indexCount;
                        c1105h.m2742a(20, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4762w));
                        break;
                    case 21:
                        i3 = indexCount;
                        c1105h.m2743b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1107j.f4729c));
                        break;
                    case 22:
                        i3 = indexCount;
                        c1105h.m2743b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1109l.f4776a)]);
                        break;
                    case 23:
                        i3 = indexCount;
                        c1105h.m2743b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1107j.f4727b));
                        break;
                    case 24:
                        i3 = indexCount;
                        c1105h.m2743b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4704F));
                        break;
                    case 27:
                        i3 = indexCount;
                        c1105h.m2743b(27, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4703E));
                        break;
                    case 28:
                        i3 = indexCount;
                        c1105h.m2743b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4705G));
                        break;
                    case 31:
                        i3 = indexCount;
                        c1105h.m2743b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4709K));
                        break;
                    case 34:
                        i3 = indexCount;
                        c1105h.m2743b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4706H));
                        break;
                    case 37:
                        i3 = indexCount;
                        c1105h.m2742a(37, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4763x));
                        break;
                    case 38:
                        i3 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1106i.f4692a);
                        c1106i.f4692a = resourceId;
                        c1105h.m2743b(38, resourceId);
                        break;
                    case 39:
                        i3 = indexCount;
                        c1105h.m2742a(39, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4719U));
                        break;
                    case 40:
                        i3 = indexCount;
                        c1105h.m2742a(40, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4718T));
                        break;
                    case 41:
                        i3 = indexCount;
                        c1105h.m2743b(41, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4720V));
                        break;
                    case 42:
                        i3 = indexCount;
                        c1105h.m2743b(42, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4721W));
                        break;
                    case 43:
                        i3 = indexCount;
                        c1105h.m2742a(43, typedArrayObtainStyledAttributes.getFloat(index, c1109l.f4778c));
                        break;
                    case 44:
                        i3 = indexCount;
                        c1105h.m2744c(44, true);
                        c1105h.m2742a(44, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4793m));
                        break;
                    case 45:
                        i3 = indexCount;
                        c1105h.m2742a(45, typedArrayObtainStyledAttributes.getFloat(index, c1110m.f4782b));
                        break;
                    case 46:
                        i3 = indexCount;
                        c1105h.m2742a(46, typedArrayObtainStyledAttributes.getFloat(index, c1110m.f4783c));
                        break;
                    case 47:
                        i3 = indexCount;
                        c1105h.m2742a(47, typedArrayObtainStyledAttributes.getFloat(index, c1110m.f4784d));
                        break;
                    case 48:
                        i3 = indexCount;
                        c1105h.m2742a(48, typedArrayObtainStyledAttributes.getFloat(index, c1110m.f4785e));
                        break;
                    case 49:
                        i3 = indexCount;
                        c1105h.m2742a(49, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4786f));
                        break;
                    case 50:
                        i3 = indexCount;
                        c1105h.m2742a(50, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4787g));
                        break;
                    case 51:
                        i3 = indexCount;
                        c1105h.m2742a(51, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4789i));
                        break;
                    case 52:
                        i3 = indexCount;
                        c1105h.m2742a(52, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4790j));
                        break;
                    case 53:
                        i3 = indexCount;
                        c1105h.m2742a(53, typedArrayObtainStyledAttributes.getDimension(index, c1110m.f4791k));
                        break;
                    case 54:
                        i3 = indexCount;
                        c1105h.m2743b(54, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4722X));
                        break;
                    case 55:
                        i3 = indexCount;
                        c1105h.m2743b(55, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4723Y));
                        break;
                    case 56:
                        i3 = indexCount;
                        c1105h.m2743b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4724Z));
                        break;
                    case 57:
                        i3 = indexCount;
                        c1105h.m2743b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4726a0));
                        break;
                    case 58:
                        i3 = indexCount;
                        c1105h.m2743b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4728b0));
                        break;
                    case 59:
                        i3 = indexCount;
                        c1105h.m2743b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4730c0));
                        break;
                    case 60:
                        i3 = indexCount;
                        c1105h.m2742a(60, typedArrayObtainStyledAttributes.getFloat(index, c1110m.f4781a));
                        break;
                    case 62:
                        i3 = indexCount;
                        c1105h.m2743b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4699A));
                        break;
                    case 63:
                        i3 = indexCount;
                        c1105h.m2742a(63, typedArrayObtainStyledAttributes.getFloat(index, c1107j.f4700B));
                        break;
                    case 64:
                        i3 = indexCount;
                        c1105h.m2743b(64, m2753f(typedArrayObtainStyledAttributes, index, c1108k.f4767a));
                        break;
                    case 65:
                        i3 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1105h.m2745d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            c1105h.m2745d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i3 = indexCount;
                        c1105h.m2743b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i3 = indexCount;
                        c1105h.m2742a(67, typedArrayObtainStyledAttributes.getFloat(index, c1108k.f4771e));
                        break;
                    case 68:
                        i3 = indexCount;
                        c1105h.m2742a(68, typedArrayObtainStyledAttributes.getFloat(index, c1109l.f4779d));
                        break;
                    case 69:
                        i3 = indexCount;
                        c1105h.m2742a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i3 = indexCount;
                        c1105h.m2742a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i3 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i3 = indexCount;
                        c1105h.m2743b(72, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4736f0));
                        break;
                    case 73:
                        i3 = indexCount;
                        c1105h.m2743b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4738g0));
                        break;
                    case 74:
                        i3 = indexCount;
                        c1105h.m2745d(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i3 = indexCount;
                        c1105h.m2744c(75, typedArrayObtainStyledAttributes.getBoolean(index, c1107j.f4752n0));
                        break;
                    case 76:
                        i3 = indexCount;
                        c1105h.m2743b(76, typedArrayObtainStyledAttributes.getInt(index, c1108k.f4769c));
                        break;
                    case 77:
                        i3 = indexCount;
                        c1105h.m2745d(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i3 = indexCount;
                        c1105h.m2743b(78, typedArrayObtainStyledAttributes.getInt(index, c1109l.f4777b));
                        break;
                    case 79:
                        i3 = indexCount;
                        c1105h.m2742a(79, typedArrayObtainStyledAttributes.getFloat(index, c1108k.f4770d));
                        break;
                    case 80:
                        i3 = indexCount;
                        c1105h.m2744c(80, typedArrayObtainStyledAttributes.getBoolean(index, c1107j.f4748l0));
                        break;
                    case 81:
                        i3 = indexCount;
                        c1105h.m2744c(81, typedArrayObtainStyledAttributes.getBoolean(index, c1107j.f4750m0));
                        break;
                    case 82:
                        i3 = indexCount;
                        c1105h.m2743b(82, typedArrayObtainStyledAttributes.getInteger(index, c1108k.f4768b));
                        break;
                    case 83:
                        i3 = indexCount;
                        c1105h.m2743b(83, m2753f(typedArrayObtainStyledAttributes, index, c1110m.f4788h));
                        break;
                    case 84:
                        i3 = indexCount;
                        c1105h.m2743b(84, typedArrayObtainStyledAttributes.getInteger(index, c1108k.f4773g));
                        break;
                    case 85:
                        i3 = indexCount;
                        c1105h.m2742a(85, typedArrayObtainStyledAttributes.getFloat(index, c1108k.f4772f));
                        break;
                    case 86:
                        i3 = indexCount;
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1108k.f4775i = resourceId2;
                            c1105h.m2743b(89, resourceId2);
                            if (c1108k.f4775i != -1) {
                                c1105h.m2743b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1108k.f4774h = string;
                            c1105h.m2745d(string, 90);
                            if (c1108k.f4774h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1108k.f4775i = resourceId3;
                                c1105h.m2743b(89, resourceId3);
                                c1105h.m2743b(88, -2);
                            } else {
                                c1105h.m2743b(88, -1);
                            }
                        } else {
                            c1105h.m2743b(88, typedArrayObtainStyledAttributes.getInteger(index, c1108k.f4775i));
                        }
                        break;
                    case 87:
                        i3 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i3 = indexCount;
                        c1105h.m2743b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4710L));
                        break;
                    case 94:
                        i3 = indexCount;
                        c1105h.m2743b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1107j.f4717S));
                        break;
                    case 95:
                        i3 = indexCount;
                        m2754g(c1105h, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i3 = indexCount;
                        m2754g(c1105h, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i3 = indexCount;
                        c1105h.m2743b(97, typedArrayObtainStyledAttributes.getInt(index, c1107j.f4754o0));
                        break;
                    case 98:
                        i3 = indexCount;
                        int i7 = AbstractC1093a.f4516q;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1106i.f4692a = typedArrayObtainStyledAttributes.getResourceId(index, c1106i.f4692a);
                        }
                        break;
                    case 99:
                        i3 = indexCount;
                        c1105h.m2744c(99, typedArrayObtainStyledAttributes.getBoolean(index, c1107j.f4737g));
                        break;
                }
                i4 = i5 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i8 = 1;
            int i9 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i9 < indexCount2; indexCount2 = i2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2) {
                    if (24 != index2) {
                        c1108k.getClass();
                        c1107j.getClass();
                        c1110m.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4755p = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4755p);
                        break;
                    case 2:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4707I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4707I);
                        break;
                    case 3:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4753o = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4753o);
                        break;
                    case 4:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4751n = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4751n);
                        break;
                    case 5:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4764y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4701C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1107j.f4701C);
                        break;
                    case 7:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4702D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1107j.f4702D);
                        break;
                    case 8:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4708J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4708J);
                        break;
                    case 9:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4761v = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4761v);
                        break;
                    case 10:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4760u = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4760u);
                        break;
                    case 11:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4714P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4714P);
                        break;
                    case 12:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4715Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4715Q);
                        break;
                    case 13:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4711M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4711M);
                        break;
                    case 14:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4713O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4713O);
                        break;
                    case 15:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4716R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4716R);
                        break;
                    case 16:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4712N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4712N);
                        break;
                    case 17:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4731d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1107j.f4731d);
                        break;
                    case 18:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4733e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1107j.f4733e);
                        break;
                    case 19:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4735f = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4735f);
                        break;
                    case 20:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4762w = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4762w);
                        break;
                    case 21:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4729c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1107j.f4729c);
                        break;
                    case 22:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i10 = typedArrayObtainStyledAttributes.getInt(index2, c1109l.f4776a);
                        c1109l.f4776a = i10;
                        c1109l.f4776a = iArr[i10];
                        break;
                    case 23:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4727b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1107j.f4727b);
                        break;
                    case 24:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4704F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4704F);
                        break;
                    case 25:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4739h = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4739h);
                        break;
                    case 26:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4741i = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4741i);
                        break;
                    case 27:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4703E = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4703E);
                        break;
                    case 28:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4705G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4705G);
                        break;
                    case 29:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4743j = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4743j);
                        break;
                    case 30:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4745k = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4745k);
                        break;
                    case 31:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4709K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4709K);
                        break;
                    case 32:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4758s = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4758s);
                        break;
                    case 33:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4759t = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4759t);
                        break;
                    case 34:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4706H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4706H);
                        break;
                    case 35:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4749m = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4749m);
                        break;
                    case 36:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4747l = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4747l);
                        break;
                    case 37:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4763x = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4763x);
                        break;
                    case 38:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1106i.f4692a = typedArrayObtainStyledAttributes.getResourceId(index2, c1106i.f4692a);
                        break;
                    case 39:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4719U = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4719U);
                        break;
                    case 40:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4718T = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4718T);
                        break;
                    case 41:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4720V = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4720V);
                        break;
                    case 42:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4721W = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4721W);
                        break;
                    case 43:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1109l.f4778c = typedArrayObtainStyledAttributes.getFloat(index2, c1109l.f4778c);
                        break;
                    case 44:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4792l = true;
                        c1110m.f4793m = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4793m);
                        break;
                    case 45:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4782b = typedArrayObtainStyledAttributes.getFloat(index2, c1110m.f4782b);
                        break;
                    case 46:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4783c = typedArrayObtainStyledAttributes.getFloat(index2, c1110m.f4783c);
                        break;
                    case 47:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4784d = typedArrayObtainStyledAttributes.getFloat(index2, c1110m.f4784d);
                        break;
                    case 48:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4785e = typedArrayObtainStyledAttributes.getFloat(index2, c1110m.f4785e);
                        break;
                    case 49:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4786f = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4786f);
                        break;
                    case 50:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4787g = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4787g);
                        break;
                    case 51:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4789i = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4789i);
                        break;
                    case 52:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4790j = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4790j);
                        break;
                    case 53:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4791k = typedArrayObtainStyledAttributes.getDimension(index2, c1110m.f4791k);
                        break;
                    case 54:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4722X = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4722X);
                        break;
                    case 55:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4723Y = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4723Y);
                        break;
                    case 56:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4724Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4724Z);
                        break;
                    case 57:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4726a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4726a0);
                        break;
                    case 58:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4728b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4728b0);
                        break;
                    case 59:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4730c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4730c0);
                        break;
                    case 60:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1110m.f4781a = typedArrayObtainStyledAttributes.getFloat(index2, c1110m.f4781a);
                        break;
                    case 61:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4765z = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4765z);
                        break;
                    case 62:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4699A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4699A);
                        break;
                    case 63:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1107j.f4700B = typedArrayObtainStyledAttributes.getFloat(index2, c1107j.f4700B);
                        break;
                    case 64:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1108k.f4767a = m2753f(typedArrayObtainStyledAttributes, index2, c1108k.f4767a);
                        break;
                    case 65:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c1108k.getClass();
                        } else {
                            String str5 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c1108k.getClass();
                        }
                        break;
                    case 66:
                        i2 = indexCount2;
                        str = str4;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c1108k.getClass();
                        str2 = str3;
                        break;
                    case 67:
                        i2 = indexCount2;
                        str = str4;
                        c1108k.f4771e = typedArrayObtainStyledAttributes.getFloat(index2, c1108k.f4771e);
                        str2 = str3;
                        break;
                    case 68:
                        i2 = indexCount2;
                        str = str4;
                        c1109l.f4779d = typedArrayObtainStyledAttributes.getFloat(index2, c1109l.f4779d);
                        str2 = str3;
                        break;
                    case 69:
                        i2 = indexCount2;
                        str = str4;
                        c1107j.f4732d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        break;
                    case 70:
                        i2 = indexCount2;
                        str = str4;
                        c1107j.f4734e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        break;
                    case 71:
                        i2 = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        break;
                    case 72:
                        i2 = indexCount2;
                        c1107j.f4736f0 = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4736f0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 73:
                        i2 = indexCount2;
                        c1107j.f4738g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4738g0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 74:
                        i2 = indexCount2;
                        c1107j.f4744j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str4;
                        str2 = str3;
                        break;
                    case 75:
                        i2 = indexCount2;
                        c1107j.f4752n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1107j.f4752n0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 76:
                        i2 = indexCount2;
                        c1108k.f4769c = typedArrayObtainStyledAttributes.getInt(index2, c1108k.f4769c);
                        str = str4;
                        str2 = str3;
                        break;
                    case 77:
                        i2 = indexCount2;
                        c1107j.f4746k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str4;
                        str2 = str3;
                        break;
                    case 78:
                        i2 = indexCount2;
                        c1109l.f4777b = typedArrayObtainStyledAttributes.getInt(index2, c1109l.f4777b);
                        str = str4;
                        str2 = str3;
                        break;
                    case 79:
                        i2 = indexCount2;
                        c1108k.f4770d = typedArrayObtainStyledAttributes.getFloat(index2, c1108k.f4770d);
                        str = str4;
                        str2 = str3;
                        break;
                    case 80:
                        i2 = indexCount2;
                        c1107j.f4748l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1107j.f4748l0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 81:
                        i2 = indexCount2;
                        c1107j.f4750m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1107j.f4750m0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 82:
                        i2 = indexCount2;
                        c1108k.f4768b = typedArrayObtainStyledAttributes.getInteger(index2, c1108k.f4768b);
                        str = str4;
                        str2 = str3;
                        break;
                    case 83:
                        i2 = indexCount2;
                        c1110m.f4788h = m2753f(typedArrayObtainStyledAttributes, index2, c1110m.f4788h);
                        str = str4;
                        str2 = str3;
                        break;
                    case 84:
                        i2 = indexCount2;
                        c1108k.f4773g = typedArrayObtainStyledAttributes.getInteger(index2, c1108k.f4773g);
                        str = str4;
                        str2 = str3;
                        break;
                    case 85:
                        i2 = indexCount2;
                        c1108k.f4772f = typedArrayObtainStyledAttributes.getFloat(index2, c1108k.f4772f);
                        str = str4;
                        str2 = str3;
                        break;
                    case 86:
                        i2 = indexCount2;
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c1108k.f4775i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1108k.f4774h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1108k.f4775i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1108k.f4775i);
                        }
                        str = str4;
                        str2 = str3;
                        break;
                    case 87:
                        i2 = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        str2 = str3;
                        break;
                    case 91:
                        i2 = indexCount2;
                        c1107j.f4756q = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4756q);
                        str = str4;
                        str2 = str3;
                        break;
                    case 92:
                        i2 = indexCount2;
                        c1107j.f4757r = m2753f(typedArrayObtainStyledAttributes, index2, c1107j.f4757r);
                        str = str4;
                        str2 = str3;
                        break;
                    case 93:
                        i2 = indexCount2;
                        c1107j.f4710L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4710L);
                        str = str4;
                        str2 = str3;
                        break;
                    case 94:
                        i2 = indexCount2;
                        c1107j.f4717S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1107j.f4717S);
                        str = str4;
                        str2 = str3;
                        break;
                    case 95:
                        i2 = indexCount2;
                        m2754g(c1107j, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        str2 = str3;
                        break;
                    case 96:
                        i2 = indexCount2;
                        m2754g(c1107j, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i2 = indexCount2;
                        c1107j.f4754o0 = typedArrayObtainStyledAttributes.getInt(index2, c1107j.f4754o0);
                        str = str4;
                        str2 = str3;
                        break;
                }
                i9++;
                str3 = str2;
                i8 = 1;
                str4 = str;
            }
            if (c1107j.f4744j0 != null) {
                c1107j.f4742i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1106i;
    }

    /* JADX INFO: renamed from: f */
    public static int m2753f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2754g(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z2 = true;
        int i5 = 0;
        if (i4 == 3) {
            String string = typedArray.getString(i2);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof C1102e) {
                        C1102e c1102e = (C1102e) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1102e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1102e).height = 0;
                        }
                        m2755h(c1102e, strTrim2);
                        return;
                    }
                    if (obj instanceof C1107j) {
                        ((C1107j) obj).f4764y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C1105h) {
                            ((C1105h) obj).m2745d(strTrim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof C1102e) {
                            C1102e c1102e2 = (C1102e) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1102e2).width = 0;
                                c1102e2.f4606H = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1102e2).height = 0;
                                c1102e2.f4607I = f;
                                return;
                            }
                        }
                        if (obj instanceof C1107j) {
                            C1107j c1107j = (C1107j) obj;
                            if (i3 == 0) {
                                c1107j.f4727b = 0;
                                c1107j.f4719U = f;
                                return;
                            } else {
                                c1107j.f4729c = 0;
                                c1107j.f4718T = f;
                                return;
                            }
                        }
                        if (obj instanceof C1105h) {
                            C1105h c1105h = (C1105h) obj;
                            if (i3 == 0) {
                                c1105h.m2743b(23, 0);
                                c1105h.m2742a(39, f);
                                return;
                            } else {
                                c1105h.m2743b(21, 0);
                                c1105h.m2742a(40, f);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C1102e) {
                            C1102e c1102e3 = (C1102e) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1102e3).width = 0;
                                c1102e3.f4616R = fMax;
                                c1102e3.f4610L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1102e3).height = 0;
                                c1102e3.f4617S = fMax;
                                c1102e3.f4611M = 2;
                                return;
                            }
                        }
                        if (obj instanceof C1107j) {
                            C1107j c1107j2 = (C1107j) obj;
                            if (i3 == 0) {
                                c1107j2.f4727b = 0;
                                c1107j2.f4732d0 = fMax;
                                c1107j2.f4722X = 2;
                                return;
                            } else {
                                c1107j2.f4729c = 0;
                                c1107j2.f4734e0 = fMax;
                                c1107j2.f4723Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof C1105h) {
                            C1105h c1105h2 = (C1105h) obj;
                            if (i3 == 0) {
                                c1105h2.m2743b(23, 0);
                                c1105h2.m2743b(54, 2);
                                return;
                            } else {
                                c1105h2.m2743b(21, 0);
                                c1105h2.m2743b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize != -4) {
                if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                }
                z2 = false;
                if (obj instanceof C1102e) {
                    C1102e c1102e4 = (C1102e) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1102e4).width = i5;
                        c1102e4.f4621W = z2;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1102e4).height = i5;
                        c1102e4.f4622X = z2;
                        return;
                    }
                }
                if (obj instanceof C1107j) {
                    C1107j c1107j3 = (C1107j) obj;
                    if (i3 == 0) {
                        c1107j3.f4727b = i5;
                        c1107j3.f4748l0 = z2;
                        return;
                    } else {
                        c1107j3.f4729c = i5;
                        c1107j3.f4750m0 = z2;
                        return;
                    }
                }
                if (obj instanceof C1105h) {
                    C1105h c1105h3 = (C1105h) obj;
                    if (i3 == 0) {
                        c1105h3.m2743b(23, i5);
                        c1105h3.m2744c(80, z2);
                        return;
                    } else {
                        c1105h3.m2743b(21, i5);
                        c1105h3.m2744c(81, z2);
                        return;
                    }
                }
                return;
            }
            i5 = -2;
            if (obj instanceof C1102e) {
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        }
        i5 = dimensionPixelSize;
        z2 = false;
        if (obj instanceof C1102e) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2755h(C1102e c1102e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b = -1;
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (b == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1102e.f4605G = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m2756a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        String str;
        int i3;
        String resourceEntryName;
        C1111n c1111n = this;
        int i4 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1111n.f4799c;
        HashSet<Integer> hashSet3 = new HashSet(map.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1111n.f4798b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        C1106i c1106i = (C1106i) map.get(Integer.valueOf(id));
                        if (c1106i != null) {
                            if (childAt instanceof C1098a) {
                                C1107j c1107j = c1106i.f4695d;
                                c1107j.f4740h0 = i4;
                                C1098a c1098a = (C1098a) childAt;
                                c1098a.setId(id);
                                c1098a.setType(c1107j.f4736f0);
                                c1098a.setMargin(c1107j.f4738g0);
                                c1098a.setAllowsGoneWidget(c1107j.f4752n0);
                                int[] iArr = c1107j.f4742i0;
                                if (iArr != null) {
                                    c1098a.setReferencedIds(iArr);
                                } else {
                                    String str2 = c1107j.f4744j0;
                                    if (str2 != null) {
                                        int[] iArrM2751c = m2751c(c1098a, str2);
                                        c1107j.f4742i0 = iArrM2751c;
                                        c1098a.setReferencedIds(iArrM2751c);
                                    }
                                }
                            }
                            C1102e c1102e = (C1102e) childAt.getLayoutParams();
                            c1102e.m2739a();
                            c1106i.m2746a(c1102e);
                            HashMap map2 = c1106i.f4697f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : map2.keySet()) {
                                C1099b c1099b = (C1099b) map2.get(str3);
                                if (c1099b.f4584a) {
                                    hashSet2 = hashSet3;
                                    str = str3;
                                } else {
                                    hashSet2 = hashSet3;
                                    str = "set" + str3;
                                }
                                try {
                                    int iM2545a = AbstractC1048e.m2545a(c1099b.f4585b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (iM2545a) {
                                        case 0:
                                            i3 = i5;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1099b.f4586c));
                                            break;
                                        case 1:
                                            i3 = i5;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c1099b.f4587d));
                                            break;
                                        case 2:
                                            i3 = i5;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1099b.f4590g));
                                            break;
                                        case 3:
                                            i3 = i5;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c1099b.f4590g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i3 = i5;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c1099b.f4588e);
                                            break;
                                        case 5:
                                            i3 = i5;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1099b.f4589f));
                                            break;
                                        case 6:
                                            i3 = i5;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c1099b.f4587d));
                                            break;
                                        case 7:
                                            i3 = i5;
                                            try {
                                                cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1099b.f4586c));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            }
                                            break;
                                        default:
                                            i3 = i5;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i3 = i5;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i3 = i5;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i3 = i5;
                                }
                                hashSet3 = hashSet2;
                                i5 = i3;
                            }
                            hashSet = hashSet3;
                            i2 = i5;
                            childAt.setLayoutParams(c1102e);
                            C1109l c1109l = c1106i.f4693b;
                            if (c1109l.f4777b == 0) {
                                childAt.setVisibility(c1109l.f4776a);
                            }
                            childAt.setAlpha(c1109l.f4778c);
                            C1110m c1110m = c1106i.f4696e;
                            childAt.setRotation(c1110m.f4781a);
                            childAt.setRotationX(c1110m.f4782b);
                            childAt.setRotationY(c1110m.f4783c);
                            childAt.setScaleX(c1110m.f4784d);
                            childAt.setScaleY(c1110m.f4785e);
                            if (c1110m.f4788h != -1) {
                                if (((View) childAt.getParent()).findViewById(c1110m.f4788h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c1110m.f4786f)) {
                                    childAt.setPivotX(c1110m.f4786f);
                                }
                                if (!Float.isNaN(c1110m.f4787g)) {
                                    childAt.setPivotY(c1110m.f4787g);
                                }
                            }
                            childAt.setTranslationX(c1110m.f4789i);
                            childAt.setTranslationY(c1110m.f4790j);
                            childAt.setTranslationZ(c1110m.f4791k);
                            if (c1110m.f4792l) {
                                childAt.setElevation(c1110m.f4793m);
                            }
                        }
                    } else {
                        hashSet = hashSet3;
                        i2 = i5;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i5 = i2 + 1;
                c1111n = this;
                hashSet3 = hashSet;
                i4 = 1;
            }
            hashSet = hashSet3;
            i2 = i5;
            i5 = i2 + 1;
            c1111n = this;
            hashSet3 = hashSet;
            i4 = 1;
        }
        for (Integer num : hashSet3) {
            C1106i c1106i2 = (C1106i) map.get(num);
            if (c1106i2 != null) {
                C1107j c1107j2 = c1106i2.f4695d;
                if (c1107j2.f4740h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1098a c1098a2 = new C1098a(context);
                    c1098a2.f4591a = new int[32];
                    c1098a2.f4597g = new HashMap();
                    c1098a2.f4593c = context;
                    C1060a c1060a = new C1060a();
                    c1060a.f4243s0 = 0;
                    c1060a.f4244t0 = true;
                    c1060a.f4245u0 = 0;
                    c1060a.f4246v0 = false;
                    c1098a2.f4583j = c1060a;
                    c1098a2.f4594d = c1060a;
                    c1098a2.m2738i();
                    c1098a2.setVisibility(8);
                    c1098a2.setId(num.intValue());
                    int[] iArr2 = c1107j2.f4742i0;
                    if (iArr2 != null) {
                        c1098a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = c1107j2.f4744j0;
                        if (str4 != null) {
                            int[] iArrM2751c2 = m2751c(c1098a2, str4);
                            c1107j2.f4742i0 = iArrM2751c2;
                            c1098a2.setReferencedIds(iArrM2751c2);
                        }
                    }
                    c1098a2.setType(c1107j2.f4736f0);
                    c1098a2.setMargin(c1107j2.f4738g0);
                    C1102e c1102eM1243g = ConstraintLayout.m1243g();
                    c1098a2.m2738i();
                    c1106i2.m2746a(c1102eM1243g);
                    constraintLayout.addView(c1098a2, c1102eM1243g);
                }
                if (c1107j2.f4725a) {
                    View c1113p = new C1113p(constraintLayout.getContext());
                    c1113p.setId(num.intValue());
                    C1102e c1102eM1243g2 = ConstraintLayout.m1243g();
                    c1106i2.m2746a(c1102eM1243g2);
                    constraintLayout.addView(c1113p, c1102eM1243g2);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof AbstractC1100c) {
                ((AbstractC1100c) childAt2).mo2735e(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2757b(ConstraintLayout constraintLayout) {
        int i2;
        HashMap map;
        int i3;
        HashMap map2;
        int i4;
        C1111n c1111n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c1111n.f4799c;
        map3.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            C1102e c1102e = (C1102e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1111n.f4798b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new C1106i());
            }
            C1106i c1106i = (C1106i) map3.get(Integer.valueOf(id));
            if (c1106i == null) {
                i2 = childCount;
                map = map3;
                i3 = i5;
            } else {
                HashMap map4 = c1111n.f4797a;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    C1099b c1099b = (C1099b) map4.get(str);
                    int i6 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new C1099b(c1099b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i4 = i5;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                i4 = i5;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                i4 = i5;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                i4 = i5;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            }
                        } else {
                            map2 = map3;
                            i4 = i5;
                            try {
                                map5.put(str, new C1099b(c1099b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            }
                        }
                    } catch (IllegalAccessException e8) {
                        e = e8;
                        map2 = map3;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        map2 = map3;
                    } catch (InvocationTargetException e10) {
                        e = e10;
                        map2 = map3;
                    }
                    i5 = i4;
                    childCount = i6;
                    map3 = map2;
                }
                i2 = childCount;
                map = map3;
                i3 = i5;
                c1106i.f4697f = map5;
                c1106i.f4692a = id;
                int i7 = c1102e.f4633e;
                C1107j c1107j = c1106i.f4695d;
                c1107j.f4739h = i7;
                c1107j.f4741i = c1102e.f4635f;
                c1107j.f4743j = c1102e.f4637g;
                c1107j.f4745k = c1102e.f4639h;
                c1107j.f4747l = c1102e.f4641i;
                c1107j.f4749m = c1102e.f4643j;
                c1107j.f4751n = c1102e.f4645k;
                c1107j.f4753o = c1102e.f4647l;
                c1107j.f4755p = c1102e.f4649m;
                c1107j.f4756q = c1102e.f4651n;
                c1107j.f4757r = c1102e.f4653o;
                c1107j.f4758s = c1102e.f4659s;
                c1107j.f4759t = c1102e.f4660t;
                c1107j.f4760u = c1102e.f4661u;
                c1107j.f4761v = c1102e.f4662v;
                c1107j.f4762w = c1102e.f4603E;
                c1107j.f4763x = c1102e.f4604F;
                c1107j.f4764y = c1102e.f4605G;
                c1107j.f4765z = c1102e.f4655p;
                c1107j.f4699A = c1102e.f4657q;
                c1107j.f4700B = c1102e.f4658r;
                c1107j.f4701C = c1102e.f4618T;
                c1107j.f4702D = c1102e.f4619U;
                c1107j.f4703E = c1102e.f4620V;
                c1107j.f4735f = c1102e.f4629c;
                c1107j.f4731d = c1102e.f4625a;
                c1107j.f4733e = c1102e.f4627b;
                c1107j.f4727b = ((ViewGroup.MarginLayoutParams) c1102e).width;
                c1107j.f4729c = ((ViewGroup.MarginLayoutParams) c1102e).height;
                c1107j.f4704F = ((ViewGroup.MarginLayoutParams) c1102e).leftMargin;
                c1107j.f4705G = ((ViewGroup.MarginLayoutParams) c1102e).rightMargin;
                c1107j.f4706H = ((ViewGroup.MarginLayoutParams) c1102e).topMargin;
                c1107j.f4707I = ((ViewGroup.MarginLayoutParams) c1102e).bottomMargin;
                c1107j.f4710L = c1102e.f4602D;
                c1107j.f4718T = c1102e.f4607I;
                c1107j.f4719U = c1102e.f4606H;
                c1107j.f4721W = c1102e.f4609K;
                c1107j.f4720V = c1102e.f4608J;
                c1107j.f4748l0 = c1102e.f4621W;
                c1107j.f4750m0 = c1102e.f4622X;
                c1107j.f4722X = c1102e.f4610L;
                c1107j.f4723Y = c1102e.f4611M;
                c1107j.f4724Z = c1102e.f4614P;
                c1107j.f4726a0 = c1102e.f4615Q;
                c1107j.f4728b0 = c1102e.f4612N;
                c1107j.f4730c0 = c1102e.f4613O;
                c1107j.f4732d0 = c1102e.f4616R;
                c1107j.f4734e0 = c1102e.f4617S;
                c1107j.f4746k0 = c1102e.f4623Y;
                c1107j.f4712N = c1102e.f4664x;
                c1107j.f4714P = c1102e.f4666z;
                c1107j.f4711M = c1102e.f4663w;
                c1107j.f4713O = c1102e.f4665y;
                c1107j.f4716R = c1102e.f4599A;
                c1107j.f4715Q = c1102e.f4600B;
                c1107j.f4717S = c1102e.f4601C;
                c1107j.f4754o0 = c1102e.f4624Z;
                c1107j.f4708J = c1102e.getMarginEnd();
                c1107j.f4709K = c1102e.getMarginStart();
                int visibility = childAt.getVisibility();
                C1109l c1109l = c1106i.f4693b;
                c1109l.f4776a = visibility;
                c1109l.f4778c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C1110m c1110m = c1106i.f4696e;
                c1110m.f4781a = rotation;
                c1110m.f4782b = childAt.getRotationX();
                c1110m.f4783c = childAt.getRotationY();
                c1110m.f4784d = childAt.getScaleX();
                c1110m.f4785e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1110m.f4786f = pivotX;
                    c1110m.f4787g = pivotY;
                }
                c1110m.f4789i = childAt.getTranslationX();
                c1110m.f4790j = childAt.getTranslationY();
                c1110m.f4791k = childAt.getTranslationZ();
                if (c1110m.f4792l) {
                    c1110m.f4793m = childAt.getElevation();
                }
                if (childAt instanceof C1098a) {
                    C1098a c1098a = (C1098a) childAt;
                    c1107j.f4752n0 = c1098a.getAllowsGoneWidget();
                    c1107j.f4742i0 = c1098a.getReferencedIds();
                    c1107j.f4736f0 = c1098a.getType();
                    c1107j.f4738g0 = c1098a.getMargin();
                }
            }
            i5 = i3 + 1;
            c1111n = this;
            childCount = i2;
            map3 = map;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2758e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C1106i c1106iM2752d = m2752d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1106iM2752d.f4695d.f4725a = true;
                    }
                    this.f4799c.put(Integer.valueOf(c1106iM2752d.f4692a), c1106iM2752d);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e3);
        }
    }
}
