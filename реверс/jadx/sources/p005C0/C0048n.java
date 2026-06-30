package p005C0;

import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.emoji2.text.C0507u;
import androidx.emoji2.text.C0508v;
import androidx.emoji2.text.C0510x;
import androidx.emoji2.text.InterfaceC0500n;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0528S;
import androidx.lifecycle.AbstractC0565I;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0586r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0001b;
import p000A.C0010k;
import p004C.RunnableC0024e;
import p009F.C0076c;
import p015I0.C0109e;
import p016J.InterfaceC0129a;
import p018K.C0152h;
import p018K.RunnableC0145a;
import p020L.C0176j;
import p024N.AbstractC0227E;
import p024N.AbstractC0240S;
import p024N.C0249a0;
import p024N.C0280q;
import p024N.C0291v0;
import p024N.C0295x0;
import p024N.InterfaceC0282r;
import p036T.InterfaceC0380j;
import p046Y.C0410a;
import p046Y.C0418i;
import p051a1.AbstractC0451c;
import p055c0.C0601a;
import p058d0.C0642a;
import p060e.AbstractActivityC0669k;
import p060e.C0679u;
import p060e.LayoutInflaterFactory2C0648D;
import p066g0.AbstractC0741b0;
import p066g0.C0721I;
import p066g0.C0753h0;
import p066g0.C0759k0;
import p066g0.C0761l0;
import p071j.AbstractC0786a;
import p071j.C0790e;
import p072k.MenuC0800B;
import p072k.MenuC0816m;
import p082p.AbstractC1018a;
import p084q.AbstractC1030i;
import p084q.C1029h;
import p084q.C1031j;
import p084q.C1032k;
import p089t.C1049f;
import p099y.C1099b;
import p099y.C1106i;
import p099y.C1111n;

/* JADX INFO: renamed from: C0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0048n implements InterfaceC0282r, InterfaceC0500n, InterfaceC0129a, InterfaceC0380j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173a;

    /* JADX INFO: renamed from: b */
    public Object f174b;

    /* JADX INFO: renamed from: c */
    public Object f175c;

    public /* synthetic */ C0048n(int i2, Object obj) {
        this.f173a = i2;
        this.f175c = obj;
    }

    /* JADX INFO: renamed from: x */
    public static C0048n m281x(InterfaceC0586r interfaceC0586r) {
        return new C0048n(interfaceC0586r, ((InterfaceC0568L) interfaceC0586r).mo1163c());
    }

    /* JADX INFO: renamed from: y */
    public static int m282y(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    /* JADX INFO: renamed from: A */
    public boolean m283A(View view) {
        C0721I c0721i = (C0721I) this.f174b;
        int iM1987d = c0721i.m1987d();
        int iM1986c = c0721i.m1986c();
        int iM1985b = c0721i.m1985b(view);
        int iM1984a = c0721i.m1984a(view);
        C0759k0 c0759k0 = (C0759k0) this.f175c;
        c0759k0.f3035b = iM1987d;
        c0759k0.f3036c = iM1986c;
        c0759k0.f3037d = iM1985b;
        c0759k0.f3038e = iM1984a;
        c0759k0.f3034a = 24579;
        return c0759k0.m2091a();
    }

    /* JADX INFO: renamed from: B */
    public void m284B(int i2, int i3) {
        int[] iArr = (int[]) this.f174b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m311v(i4);
        int[] iArr2 = (int[]) this.f174b;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.f174b, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.f175c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0753h0 c0753h0 = (C0753h0) ((ArrayList) this.f175c).get(size);
            int i5 = c0753h0.f2994a;
            if (i5 >= i2) {
                c0753h0.f2994a = i5 + i3;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m285C(int i2, int i3) {
        int[] iArr = (int[]) this.f174b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m311v(i4);
        int[] iArr2 = (int[]) this.f174b;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.f174b;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f175c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0753h0 c0753h0 = (C0753h0) ((ArrayList) this.f175c).get(size);
            int i5 = c0753h0.f2994a;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.f175c).remove(size);
                } else {
                    c0753h0.f2994a = i5 - i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m286D(AbstractC0786a abstractC0786a) {
        C0010k c0010k = (C0010k) this.f174b;
        ((ActionMode.Callback) c0010k.f22a).onDestroyActionMode(c0010k.m84e(abstractC0786a));
        LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D = (LayoutInflaterFactory2C0648D) this.f175c;
        if (layoutInflaterFactory2C0648D.f2574w != null) {
            layoutInflaterFactory2C0648D.f2563l.getDecorView().removeCallbacks(layoutInflaterFactory2C0648D.f2575x);
        }
        if (layoutInflaterFactory2C0648D.f2573v != null) {
            C0249a0 c0249a0 = layoutInflaterFactory2C0648D.f2576y;
            if (c0249a0 != null) {
                c0249a0.m806b();
            }
            C0249a0 c0249a0M770a = AbstractC0240S.m770a(layoutInflaterFactory2C0648D.f2573v);
            c0249a0M770a.m805a(0.0f);
            layoutInflaterFactory2C0648D.f2576y = c0249a0M770a;
            c0249a0M770a.m808d(new C0679u(2, this));
        }
        layoutInflaterFactory2C0648D.f2572u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0648D.f2528A;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(viewGroup);
        layoutInflaterFactory2C0648D.m1841I();
    }

    /* JADX INFO: renamed from: E */
    public boolean m287E(AbstractC0786a abstractC0786a, MenuC0816m menuC0816m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0648D) this.f175c).f2528A;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(viewGroup);
        C0010k c0010k = (C0010k) this.f174b;
        C0790e c0790eM84e = c0010k.m84e(abstractC0786a);
        C1031j c1031j = (C1031j) c0010k.f23b;
        Menu menuC0800B = (Menu) c1031j.get(menuC0816m);
        if (menuC0800B == null) {
            menuC0800B = new MenuC0800B((Context) c0010k.f25d, menuC0816m);
            c1031j.put(menuC0816m, menuC0800B);
        }
        return ((ActionMode.Callback) c0010k.f22a).onPrepareActionMode(c0790eM84e, menuC0800B);
    }

    /* JADX INFO: renamed from: F */
    public void m288F(C0152h c0152h) {
        int i2 = c0152h.f479b;
        Handler handler = (Handler) this.f175c;
        C0001b c0001b = (C0001b) this.f174b;
        if (i2 == 0) {
            handler.post(new RunnableC0024e(c0001b, 3, c0152h.f478a));
        } else {
            handler.post(new RunnableC0145a(c0001b, i2, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x022e, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m289G(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C1106i c1106iM2752d;
        byte b;
        C1111n c1111n = new C1111n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c1106iM2752d = null;
                } catch (IOException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                } catch (XmlPullParserException e3) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e3);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        byte b2 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    b2 = name.equals("Layout") ? (byte) 6 : (byte) -1;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        b2 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        b2 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        b2 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        b2 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        b2 = 9;
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        b2 = 8;
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        b2 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    c1106iM2752d = C1111n.m2752d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c1106iM2752d = C1111n.m2752d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c1106iM2752d = C1111n.m2752d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1106iM2752d.f4695d.f4725a = true;
                                    break;
                                case 3:
                                    c1106iM2752d = C1111n.m2752d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1106iM2752d.f4695d.f4740h0 = 1;
                                    break;
                                case 4:
                                    if (c1106iM2752d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1106iM2752d.f4693b.m2749a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 5:
                                    if (c1106iM2752d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1106iM2752d.f4696e.m2750a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 6:
                                    if (c1106iM2752d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1106iM2752d.f4695d.m2747a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 7:
                                    if (c1106iM2752d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1106iM2752d.f4694c.m2748a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 8:
                                case 9:
                                    if (c1106iM2752d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1099b.m2729a(context, xmlResourceParser, c1106iM2752d.f4697f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    b = lowerCase.equals("guideline") ? (byte) 3 : (byte) -1;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            if (b == 0) {
                                ((SparseArray) this.f175c).put(identifier, c1111n);
                                return;
                            } else if (b == 1 || b == 2 || b == 3) {
                                c1111n.f4799c.put(Integer.valueOf(c1106iM2752d.f4692a), c1106iM2752d);
                                c1106iM2752d = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f175c).put(identifier, c1111n);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public C0280q m290H(AbstractC0741b0 abstractC0741b0, int i2) {
        C0761l0 c0761l0;
        C0280q c0280q;
        C1031j c1031j = (C1031j) this.f174b;
        int iM2488d = c1031j.m2488d(abstractC0741b0);
        if (iM2488d >= 0 && (c0761l0 = (C0761l0) c1031j.m2493i(iM2488d)) != null) {
            int i3 = c0761l0.f3042a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                c0761l0.f3042a = i4;
                if (i2 == 4) {
                    c0280q = c0761l0.f3043b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0280q = c0761l0.f3044c;
                }
                if ((i4 & 12) == 0) {
                    c1031j.m2491g(iM2488d);
                    c0761l0.f3042a = 0;
                    c0761l0.f3043b = null;
                    c0761l0.f3044c = null;
                    C0761l0.f3041d.mo624c(c0761l0);
                }
                return c0280q;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public void m291I(AbstractC0741b0 abstractC0741b0) {
        C0761l0 c0761l0 = (C0761l0) ((C1031j) this.f174b).get(abstractC0741b0);
        if (c0761l0 == null) {
            return;
        }
        c0761l0.f3042a &= -2;
    }

    /* JADX INFO: renamed from: J */
    public void m292J(AbstractC0741b0 abstractC0741b0) {
        C1029h c1029h = (C1029h) this.f175c;
        int iM2482h = c1029h.m2482h() - 1;
        while (true) {
            if (iM2482h < 0) {
                break;
            }
            if (abstractC0741b0 == c1029h.m2483i(iM2482h)) {
                Object[] objArr = c1029h.f4098c;
                Object obj = objArr[iM2482h];
                Object obj2 = AbstractC1030i.f4100a;
                if (obj != obj2) {
                    objArr[iM2482h] = obj2;
                    c1029h.f4096a = true;
                }
            } else {
                iM2482h--;
            }
        }
        C0761l0 c0761l0 = (C0761l0) ((C1031j) this.f174b).remove(abstractC0741b0);
        if (c0761l0 != null) {
            c0761l0.f3042a = 0;
            c0761l0.f3043b = null;
            c0761l0.f3044c = null;
            C0761l0.f3041d.mo624c(c0761l0);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m293K(int i2, int i3, int i4, int i5) {
        AbstractC1018a abstractC1018a = (AbstractC1018a) this.f175c;
        abstractC1018a.f4063d.set(i2, i3, i4, i5);
        Rect rect = abstractC1018a.f4062c;
        super/*android.widget.FrameLayout*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    /* JADX INFO: renamed from: a */
    public void m294a(AbstractC0741b0 abstractC0741b0, C0280q c0280q) {
        C1031j c1031j = (C1031j) this.f174b;
        C0761l0 c0761l0M2092a = (C0761l0) c1031j.get(abstractC0741b0);
        if (c0761l0M2092a == null) {
            c0761l0M2092a = C0761l0.m2092a();
            c1031j.put(abstractC0741b0, c0761l0M2092a);
        }
        c0761l0M2092a.f3044c = c0280q;
        c0761l0M2092a.f3042a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public void m295b() {
        int[] iArr = (int[]) this.f174b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f175c = null;
    }

    @Override // androidx.emoji2.text.InterfaceC0500n
    /* JADX INFO: renamed from: c */
    public boolean mo38c(CharSequence charSequence, int i2, int i3, C0507u c0507u) {
        if ((c0507u.f1556c & 4) > 0) {
            return true;
        }
        if (((C0510x) this.f174b) == null) {
            this.f174b = new C0510x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0109e) this.f175c).getClass();
        ((C0510x) this.f174b).setSpan(new C0508v(c0507u), i2, i3, 33);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m296d(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m296d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m297e(boolean z2) {
        C0518H c0518h = (C0518H) this.f175c;
        AbstractActivityC0669k abstractActivityC0669k = c0518h.f1610t.f1806q;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0518h.f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m297e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m298f(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m298f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m299g(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m299g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m300h(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m300h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m301i(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m301i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m302j(boolean z2) {
        C0518H c0518h = (C0518H) this.f175c;
        AbstractActivityC0669k abstractActivityC0669k = c0518h.f1610t.f1806q;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0518h.f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m302j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0500n
    /* JADX INFO: renamed from: k */
    public Object mo46k() {
        return (C0510x) this.f174b;
    }

    /* JADX INFO: renamed from: l */
    public void m303l(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m303l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m304m(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m304m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m305n(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m305n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m306o(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m306o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    @Override // p024N.InterfaceC0282r
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0295x0 mo51p(View view, C0295x0 c0295x0) {
        boolean z2;
        C0050p c0050p = (C0050p) this.f175c;
        int i2 = c0050p.f176a;
        C0176j c0176j = (C0176j) this.f174b;
        C0291v0 c0291v0 = c0295x0.f882a;
        C0076c c0076cMo896f = c0291v0.mo896f(7);
        C0076c c0076cMo896f2 = c0291v0.mo896f(32);
        int i3 = c0076cMo896f.f239b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0176j.f595b;
        bottomSheetBehavior.f2122w = i3;
        boolean zM278g = AbstractC0047m.m278g(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.f2114o;
        if (z3) {
            int iM921a = c0295x0.m921a();
            bottomSheetBehavior.f2121v = iM921a;
            paddingBottom = iM921a + c0050p.f178c;
        }
        int i4 = c0050p.f177b;
        boolean z4 = bottomSheetBehavior.f2115p;
        int i5 = c0076cMo896f.f238a;
        if (z4) {
            paddingLeft = (zM278g ? i4 : i2) + i5;
        }
        boolean z5 = bottomSheetBehavior.f2116q;
        int i6 = c0076cMo896f.f240c;
        if (z5) {
            if (!zM278g) {
                i2 = i4;
            }
            paddingRight = i2 + i6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f2118s || marginLayoutParams.leftMargin == i5) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f2119t && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z2 = true;
        }
        if (bottomSheetBehavior.f2120u) {
            int i7 = marginLayoutParams.topMargin;
            int i8 = c0076cMo896f.f239b;
            if (i7 != i8) {
                marginLayoutParams.topMargin = i8;
            } else {
                z6 = z2;
            }
        }
        if (z6) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = c0176j.f594a;
        if (z7) {
            bottomSheetBehavior.f2112m = c0076cMo896f2.f241d;
        }
        if (!z3 && !z7) {
            return c0295x0;
        }
        bottomSheetBehavior.m1699I();
        return c0295x0;
    }

    /* JADX INFO: renamed from: q */
    public void m307q(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m307q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p016J.InterfaceC0129a
    /* JADX INFO: renamed from: r */
    public void mo53r() {
        ((Animator) this.f174b).end();
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((C0528S) this.f175c) + " has been canceled.");
        }
    }

    /* JADX INFO: renamed from: s */
    public void m308s(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m308s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m309t(boolean z2) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0518H) this.f175c).f1612v;
        if (abstractComponentCallbacksC0548r != null) {
            abstractComponentCallbacksC0548r.m1461j().f1602l.m309t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f174b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f173a) {
            case 3:
                return "Bounds{lower=" + ((C0076c) this.f174b) + " upper=" + ((C0076c) this.f175c) + "}";
            case 9:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                InterfaceC0586r interfaceC0586r = (InterfaceC0586r) this.f174b;
                if (interfaceC0586r == null) {
                    sb.append("null");
                } else {
                    String simpleName = interfaceC0586r.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC0586r.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(interfaceC0586r)));
                }
                sb.append("}}");
                return sb.toString();
            case 17:
                String str = "[ ";
                if (((C1049f) this.f174b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((C1049f) this.f174b).f4181h[i2] + " ";
                    }
                }
                return str + "] " + ((C1049f) this.f174b);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m310u(String str, PrintWriter printWriter) {
        C1032k c1032k = ((C0642a) this.f175c).f2506c;
        if (c1032k.f4107c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c1032k.f4107c <= 0) {
                return;
            }
            if (c1032k.f4106b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1032k.f4105a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m311v(int i2) {
        int[] iArr = (int[]) this.f174b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f174b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f174b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f174b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: w */
    public View m312w(int i2, int i3, int i4, int i5) {
        View viewM2013u;
        C0721I c0721i = (C0721I) this.f174b;
        int iM1987d = c0721i.m1987d();
        int iM1986c = c0721i.m1986c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (c0721i.f2855a) {
                case 0:
                    viewM2013u = c0721i.f2856b.m2013u(i2);
                    break;
                default:
                    viewM2013u = c0721i.f2856b.m2013u(i2);
                    break;
            }
            int iM1985b = c0721i.m1985b(viewM2013u);
            int iM1984a = c0721i.m1984a(viewM2013u);
            C0759k0 c0759k0 = (C0759k0) this.f175c;
            c0759k0.f3035b = iM1987d;
            c0759k0.f3036c = iM1986c;
            c0759k0.f3037d = iM1985b;
            c0759k0.f3038e = iM1984a;
            if (i4 != 0) {
                c0759k0.f3034a = i4;
                if (c0759k0.m2091a()) {
                    return viewM2013u;
                }
            }
            if (i5 != 0) {
                c0759k0.f3034a = i5;
                if (c0759k0.m2091a()) {
                    view = viewM2013u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* JADX INFO: renamed from: z */
    public void m313z() {
        ((SparseIntArray) this.f174b).clear();
    }

    public /* synthetic */ C0048n(int i2, boolean z2) {
        this.f173a = i2;
    }

    public /* synthetic */ C0048n(Object obj, int i2, Object obj2) {
        this.f173a = i2;
        this.f174b = obj;
        this.f175c = obj2;
    }

    public C0048n(InterfaceC0586r interfaceC0586r, C0567K c0567k) {
        C0642a c0642a;
        this.f173a = 9;
        this.f174b = interfaceC0586r;
        AbstractC0451c.m1146e(c0567k, "store");
        C0601a c0601a = C0601a.f2040b;
        AbstractC0451c.m1146e(c0601a, "defaultCreationExtras");
        String canonicalName = C0642a.class.getCanonicalName();
        if (canonicalName != null) {
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0451c.m1146e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0567k.f1852a;
            AbstractC0565I abstractC0565I = (AbstractC0565I) linkedHashMap.get(strConcat);
            if (C0642a.class.isInstance(abstractC0565I)) {
                AbstractC0451c.m1144c(abstractC0565I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0601a.f2041a);
                linkedHashMap2.put(C0566J.f1851b, strConcat);
                try {
                    c0642a = new C0642a();
                } catch (AbstractMethodError unused) {
                    c0642a = new C0642a();
                }
                abstractC0565I = c0642a;
                AbstractC0565I abstractC0565I2 = (AbstractC0565I) linkedHashMap.put(strConcat, abstractC0565I);
                if (abstractC0565I2 != null) {
                    abstractC0565I2.mo1384a();
                }
            }
            this.f175c = (C0642a) abstractC0565I;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0048n(C0518H c0518h) {
        this.f173a = 8;
        this.f174b = new CopyOnWriteArrayList();
        this.f175c = c0518h;
    }

    public C0048n(C0721I c0721i) {
        this.f173a = 14;
        this.f174b = c0721i;
        C0759k0 c0759k0 = new C0759k0();
        c0759k0.f3034a = 0;
        this.f175c = c0759k0;
    }

    public C0048n(Animation animation) {
        this.f173a = 7;
        this.f174b = animation;
        this.f175c = null;
    }

    public C0048n(Animator animator) {
        this.f173a = 7;
        this.f174b = null;
        this.f175c = animator;
    }

    public C0048n(ArrayList arrayList, ArrayList arrayList2) {
        this.f173a = 1;
        int size = arrayList.size();
        this.f174b = new int[size];
        this.f175c = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f174b)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f175c)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public C0048n(int i2, int i3) {
        this.f173a = 1;
        this.f174b = new int[]{i2, i3};
        this.f175c = new float[]{0.0f, 1.0f};
    }

    public C0048n(int i2, int i3, int i4) {
        this.f173a = 1;
        this.f174b = new int[]{i2, i3, i4};
        this.f175c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0048n(EditText editText) {
        this.f173a = 4;
        this.f174b = editText;
        C0418i c0418i = new C0418i(editText);
        this.f175c = c0418i;
        editText.addTextChangedListener(c0418i);
        if (C0410a.f1114b == null) {
            synchronized (C0410a.f1113a) {
                try {
                    if (C0410a.f1114b == null) {
                        C0410a c0410a = new C0410a();
                        try {
                            C0410a.f1115c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0410a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0410a.f1114b = c0410a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0410a.f1114b);
    }

    public C0048n(int i2) {
        this.f173a = i2;
        switch (i2) {
            case 15:
                this.f174b = new C1031j(0);
                this.f175c = new C1029h();
                break;
            default:
                this.f174b = new SparseIntArray();
                this.f175c = new SparseIntArray();
                break;
        }
    }

    public C0048n(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, C0010k c0010k) {
        this.f173a = 11;
        this.f175c = layoutInflaterFactory2C0648D;
        this.f174b = c0010k;
    }
}
