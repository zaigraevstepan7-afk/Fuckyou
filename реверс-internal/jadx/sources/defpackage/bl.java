package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.reddit.secondpage.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bl {
    public static ye0 a;
    public static ye0 b;
    public static ye0 c;

    public static final long A(KeyEvent keyEvent) {
        return hk.d(keyEvent.getKeyCode());
    }

    public static final t81 B(View view) {
        t81 t81Var = (t81) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (t81Var != null) {
            return t81Var;
        }
        t81 t81Var2 = new t81();
        view.setTag(R.id.pooling_container_listener_holder_tag, t81Var2);
        return t81Var2;
    }

    public static jg1 C(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        yc.p(s91.i("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new jg1(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static final int D(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static ks E(ks ksVar) {
        ksVar.getClass();
        ls lsVar = ksVar instanceof ls ? (ls) ksVar : null;
        if (lsVar == null || (ksVar = lsVar.g) != null) {
            return ksVar;
        }
        ot otVar = (ot) lsVar.e().l(v20.z);
        ks myVar = otVar != null ? new my(otVar, lsVar) : lsVar;
        lsVar.g = myVar;
        return myVar;
    }

    public static final void F(ob0 ob0Var, wa0 wa0Var) {
        wa0Var.getClass();
        s22.i(2, wa0Var);
        wa0Var.h(ob0Var, 1);
    }

    public static final boolean G(vt vtVar) {
        oj0 oj0Var = (oj0) vtVar.f().l(v20.O);
        if (oj0Var != null) {
            return oj0Var.b();
        }
        return true;
    }

    public static final boolean H(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static int I(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void J(jo0 jo0Var, az1 az1Var, z01 z01Var) {
        sp1 sp1VarL = uc1.l();
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            qz1 qz1VarD = jo0Var.d();
            if (qz1VarD == null) {
                return;
            }
            kz1 kz1Var = jo0Var.e;
            if (kz1Var == null) {
                return;
            }
            zk0 zk0VarC = jo0Var.c();
            if (zk0VarC == null) {
                return;
            }
            kd1.v(az1Var, jo0Var.a, qz1VarD.a, zk0VarC, kz1Var, jo0Var.b(), z01Var);
        } finally {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r90 K(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        String str;
        int i3;
        ?? r4;
        long j;
        Throwable th;
        ?? r42;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            R(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rb1.b);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rb1.c);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            R(xmlResourceParser);
                        }
                        arrayList.add(new t90(string7, i6, z, string6, i8, resourceId2));
                    } else {
                        R(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new s90((t90[]) arrayList.toArray(new t90[0]));
        }
        List listL = L(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rb1.d);
                    int i10 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i4);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                R(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r42 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            str = string5;
                            r4 = typedArrayObtainAttributes3;
                            i3 = i10;
                            i2 = integer2;
                            j = 1;
                            try {
                                k90 k90Var = new k90(string, string2, string8, listL, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r4;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(k90Var);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r42 = r4;
                            if (r42 != 0) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r42 = r4;
                    if (r42 != 0) {
                        throw th;
                    }
                    try {
                        if (r42 instanceof AutoCloseable) {
                            ((AutoCloseable) r42).close();
                            throw th;
                        }
                        if (!(r42 instanceof ExecutorService)) {
                            r42.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) r42;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer2;
                str = string5;
                i3 = integer;
                R(xmlResourceParser);
                integer = i3;
                integer2 = i2;
                string5 = str;
                i = 2;
                i4 = 0;
                i5 = 3;
            }
        }
        int i11 = integer2;
        String str2 = string5;
        int i12 = integer;
        if (!arrayList2.isEmpty()) {
            return new u90(arrayList2, i12, i11, str2);
        }
        if (string3 == null) {
            yc.p("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new k90(string, string2, string3, listL, null, null));
        if (string4 != null) {
            arrayList2.add(new k90(string, string2, string4, listL, null, null));
        }
        return new u90(arrayList2, i12, i11, str2);
    }

    public static List L(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void M(xw xwVar) {
        l3 autofillManager;
        ql0 ql0VarP = P(xwVar);
        if (ql0VarP.w || (autofillManager = ((h4) tl0.a(ql0VarP)).getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.j;
        sc1 sc1Var = autofillManager.h;
        ql0 ql0Var = (ql0) sc1Var.a.b(ql0VarP.f);
        if (ql0Var == null || ql0Var.k == -4) {
            return;
        }
        g6 g6Var = sc1Var.c;
        int iE = sc1Var.e(ql0Var);
        long[] jArr = (long[]) g6Var.b;
        long j = jArr[iE];
        long j2 = jArr[iE + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.e.w().requestAutofill(autofillManager.g, ql0VarP.f, rect);
    }

    public static final c01 N(xw xwVar, int i) {
        c01 c01Var = ((sv0) xwVar).e.l;
        c01Var.getClass();
        if (c01Var.W0() != xwVar || !d01.g(i)) {
            return c01Var;
        }
        c01 c01Var2 = c01Var.x;
        c01Var2.getClass();
        return c01Var2;
    }

    public static final c01 O(xw xwVar) {
        if (!((sv0) xwVar).e.r) {
            ng0.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        c01 c01VarN = N(xwVar, 2);
        if (!c01VarN.W0().r) {
            ng0.b("LayoutCoordinates is not attached.");
        }
        return c01VarN;
    }

    public static final ql0 P(xw xwVar) {
        c01 c01Var = ((sv0) xwVar).e.l;
        if (c01Var != null) {
            return c01Var.w;
        }
        throw s91.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final w31 Q(xw xwVar) {
        w31 w31Var = P(xwVar).r;
        if (w31Var != null) {
            return w31Var;
        }
        throw s91.g("This node does not have an owner.");
    }

    public static void R(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final void S(gz1 gz1Var, jo0 jo0Var, az1 az1Var, df0 df0Var, z01 z01Var) {
        xg0 xg0Var = jo0Var.d;
        qs qsVar = jo0Var.v;
        qs qsVar2 = jo0Var.w;
        zc1 zc1Var = new zc1();
        kf kfVar = new kf(xg0Var, qsVar, zc1Var);
        z71 z71Var = gz1Var.a;
        z71Var.a(az1Var, df0Var, kfVar, qsVar2);
        kz1 kz1Var = new kz1(gz1Var, z71Var);
        gz1Var.b.set(kz1Var);
        zc1Var.e = kz1Var;
        jo0Var.e = kz1Var;
        J(jo0Var, az1Var, z01Var);
    }

    public static final void T(List list, w6 w6Var) {
        Path path;
        int i;
        float f;
        int i2;
        t51 t51Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        w6 w6Var2 = w6Var;
        Path path2 = w6Var2.a;
        Path path3 = w6Var2.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        w6Var2.h();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        t51 t51Var2 = list2.isEmpty() ? b51.c : (t51) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            t51 t51Var3 = (t51) list2.get(i3);
            if (t51Var3 instanceof b51) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                t51Var = t51Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (t51Var3 instanceof n51) {
                    n51 n51Var = (n51) t51Var3;
                    float f17 = n51Var.c;
                    f13 += f17;
                    float f18 = n51Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (t51Var3 instanceof f51) {
                        f51 f51Var = (f51) t51Var3;
                        float f19 = f51Var.c;
                        float f20 = f51Var.d;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (t51Var3 instanceof m51) {
                            m51 m51Var = (m51) t51Var3;
                            float f21 = m51Var.d;
                            float f22 = m51Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (t51Var3 instanceof e51) {
                            e51 e51Var = (e51) t51Var3;
                            float f23 = e51Var.d;
                            float f24 = e51Var.c;
                            w6Var2.e(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (t51Var3 instanceof l51) {
                            float f25 = ((l51) t51Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (t51Var3 instanceof d51) {
                            float f26 = ((d51) t51Var3).c;
                            w6Var2.e(f26, f14);
                            f13 = f26;
                        } else {
                            if (t51Var3 instanceof r51) {
                                f9 = ((r51) t51Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (t51Var3 instanceof s51) {
                                float f27 = ((s51) t51Var3).c;
                                w6Var2.e(f13, f27);
                                f14 = f27;
                            } else if (t51Var3 instanceof k51) {
                                k51 k51Var = (k51) t51Var3;
                                path3.rCubicTo(k51Var.c, k51Var.d, k51Var.e, k51Var.f, k51Var.g, k51Var.h);
                                f11 = k51Var.e + f13;
                                f12 = k51Var.f + f14;
                                f13 += k51Var.g;
                                f9 = k51Var.h;
                            } else {
                                if (t51Var3 instanceof c51) {
                                    c51 c51Var = (c51) t51Var3;
                                    path3.cubicTo(c51Var.c, c51Var.d, c51Var.e, c51Var.f, c51Var.g, c51Var.h);
                                    f11 = c51Var.e;
                                    f12 = c51Var.f;
                                    f5 = c51Var.g;
                                    f6 = c51Var.h;
                                } else if (t51Var3 instanceof p51) {
                                    if (t51Var2.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    p51 p51Var = (p51) t51Var3;
                                    path3.rCubicTo(f7, f8, p51Var.c, p51Var.d, p51Var.e, p51Var.f);
                                    f11 = p51Var.c + f13;
                                    f12 = p51Var.d + f14;
                                    f13 += p51Var.e;
                                    f9 = p51Var.f;
                                } else if (t51Var3 instanceof h51) {
                                    if (t51Var2.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    h51 h51Var = (h51) t51Var3;
                                    path3.cubicTo(f13, f14, h51Var.c, h51Var.d, h51Var.e, h51Var.f);
                                    f11 = h51Var.c;
                                    f12 = h51Var.d;
                                    f5 = h51Var.e;
                                    f6 = h51Var.f;
                                } else if (t51Var3 instanceof o51) {
                                    o51 o51Var = (o51) t51Var3;
                                    float f28 = o51Var.f;
                                    float f29 = o51Var.e;
                                    float f30 = o51Var.d;
                                    float f31 = o51Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (t51Var3 instanceof g51) {
                                        g51 g51Var = (g51) t51Var3;
                                        float f34 = g51Var.f;
                                        float f35 = g51Var.e;
                                        float f36 = g51Var.d;
                                        f4 = g51Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (t51Var3 instanceof q51) {
                                        if (t51Var2.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        q51 q51Var = (q51) t51Var3;
                                        float f37 = q51Var.d;
                                        float f38 = q51Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (t51Var3 instanceof i51) {
                                        if (t51Var2.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        i51 i51Var = (i51) t51Var3;
                                        float f40 = i51Var.d;
                                        float f41 = i51Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        t51Var = t51Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (t51Var3 instanceof j51) {
                                        j51 j51Var = (j51) t51Var3;
                                        float f42 = j51Var.h + f13;
                                        float f43 = j51Var.i + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        u(w6Var, f13, f14, f42, f43, j51Var.c, j51Var.d, j51Var.e, j51Var.f, j51Var.g);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        t51Var = t51Var3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(t51Var3 instanceof a51)) {
                                            ez1.a();
                                            return;
                                        }
                                        a51 a51Var = (a51) t51Var3;
                                        float f44 = a51Var.i;
                                        float f45 = a51Var.h;
                                        t51Var = t51Var3;
                                        u(w6Var, f13, f14, f45, f44, a51Var.c, a51Var.d, a51Var.e, a51Var.f, a51Var.g);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    t51Var = t51Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                t51Var = t51Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            w6Var2 = w6Var;
            size = i;
            path3 = path;
            t51Var2 = t51Var;
            f10 = f;
        }
    }

    public static final boolean U(Throwable th, ha0 ha0Var) throws IllegalAccessException, InvocationTargetException {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = lj0.a;
        yx yxVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = e71.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = f40.e;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof yx) {
                return false;
            }
        }
        try {
            ap apVar = (ap) ha0Var.a();
            if (apVar != null) {
                boolean z2 = apVar.b;
                List list = apVar.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((cp) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                apVar.getClass();
                yxVar = new yx(apVar);
            }
        } catch (Throwable th2) {
            yxVar = th2;
        }
        if (yxVar != null) {
            al.h(th, yxVar);
        }
        return z;
    }

    public static final long V(long j, long j2) {
        int iD;
        int iF = wz1.f(j);
        int iE = wz1.e(j);
        if ((wz1.f(j2) < wz1.e(j)) && (wz1.f(j) < wz1.e(j2))) {
            if ((wz1.f(j2) <= wz1.f(j)) && (wz1.e(j) <= wz1.e(j2))) {
                iF = wz1.f(j2);
                iE = iF;
            } else {
                if ((wz1.f(j) <= wz1.f(j2)) && (wz1.e(j2) <= wz1.e(j))) {
                    iD = wz1.d(j2);
                } else {
                    int iF2 = wz1.f(j2);
                    if (iF >= wz1.e(j2) || iF2 > iF) {
                        iE = wz1.f(j2);
                    } else {
                        iF = wz1.f(j2);
                        iD = wz1.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > wz1.f(j2)) {
            iF -= wz1.d(j2);
            iD = wz1.d(j2);
            iE -= iD;
        }
        return af1.g(iF, iE);
    }

    public static final p60 W(jw0 jw0Var, ob0 ob0Var) {
        return y(((ju0) ob0Var.j(mu0.b)).d, jw0Var);
    }

    public static Object X(wa0 wa0Var, Object obj, ks ksVar) {
        wa0Var.getClass();
        lt ltVarE = ksVar.e();
        Object aj0Var = ltVarE == d40.e ? new aj0(ksVar) : new bj0(ksVar, ltVarE);
        s22.i(2, wa0Var);
        return wa0Var.h(obj, aj0Var);
    }

    public static final void a(ry1 ry1Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        tv0 tv0VarE;
        ob0Var.X(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(ry1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        int i4 = 1;
        int i5 = 0;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ob0Var.W(-885604480);
            if (ry1Var.k()) {
                ks ksVar = null;
                tv0VarE = pv.E(s22.L(new ly1(ry1Var, ksVar, i5)), ry1Var.x, new cv(ry1Var, ksVar, i4), new my1(ry1Var, ksVar, i5), new vs(ry1Var, i3));
            } else {
                tv0VarE = qv0.a;
            }
            el.g(tv0VarE, joVar, ob0Var, i2 & 112);
            ob0Var.p(false);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new jn(ry1Var, joVar, i, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final az1 az1Var, final sa0 sa0Var, final tv0 tv0Var, final d02 d02Var, final ez1 ez1Var, final sa0 sa0Var2, final jx0 jx0Var, final uq1 uq1Var, final boolean z, final int i, final int i2, final df0 df0Var, final lk0 lk0Var, final boolean z2, final jo joVar, ob0 ob0Var, final int i3, final int i4) {
        int i5;
        int i6;
        o80 o80Var;
        k31 k31Var;
        ky1 ky1Var;
        hb hbVar;
        wz1 wz1Var;
        Object jo0Var;
        l91 l91Var;
        j80 j80Var;
        i72 i72Var;
        boolean z3;
        int i7;
        hb hbVar2;
        d02 d02Var2;
        v12 v12Var;
        long j;
        z01 z01Var;
        wz1 wz1Var2;
        hb hbVar3;
        hx hxVar;
        c90 c90Var;
        hx hxVar2;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        az1 az1Var2;
        az1 az1VarA;
        Object objK;
        l91 l91Var2;
        final q32 q32Var;
        Object objK2;
        final vt vtVar;
        Object objK3;
        final zg zgVar;
        Object objK4;
        final ry1 ry1Var;
        final z01 z01Var2;
        o80 o80Var2;
        j80 j80Var2;
        s71 s71Var;
        boolean z7;
        int i8;
        int i9;
        boolean zH;
        Object obj;
        l91 l91Var3;
        int i10;
        ob0 ob0Var2;
        int i11;
        ky1 ky1Var2;
        o80 o80Var3;
        j80 j80Var3;
        jx0 jx0Var2;
        final df0 df0Var2;
        boolean z8;
        vt vtVar2;
        z01 z01Var3;
        zg zgVar2;
        final ry1 ry1Var2;
        jo0 jo0Var2;
        boolean z9;
        boolean z10;
        Object l6Var;
        o80 o80Var4;
        tv0 tv0Var2;
        vt vtVar3;
        final jo0 jo0Var3;
        fy0 fy0Var;
        gz1 gz1Var;
        qv0 qv0Var;
        final z01 z01Var4;
        gz1 gz1Var2;
        final i72 i72Var2;
        boolean zH2;
        Object objK5;
        qv0 qv0Var2;
        i72 i72Var3;
        final ry1 ry1Var3;
        final jo0 jo0Var4;
        z01 z01Var5;
        tv0 tv0VarQ;
        boolean zH3;
        Object objK6;
        boolean zH4;
        Object objK7;
        df0 df0Var3;
        qv0 qv0Var3;
        boolean z11;
        boolean zBooleanValue;
        boolean zG;
        Object objK8;
        tv0 tv0VarC;
        Object uq1Var2;
        long j3;
        boolean zH5;
        Object objK9;
        final boolean z12;
        final tv0 tv0VarQ2;
        ob0 ob0Var3 = ob0Var;
        long j4 = az1Var.b;
        wz1 wz1Var3 = az1Var.c;
        hb hbVar4 = az1Var.a;
        ob0Var3.X(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (ob0Var3.f(az1Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= ob0Var3.h(sa0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= ob0Var3.f(tv0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= ob0Var3.f(d02Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= ob0Var3.f(ez1Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= ob0Var3.h(sa0Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= ob0Var3.f(jx0Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= ob0Var3.f(uq1Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= ob0Var3.g(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= ob0Var3.d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (ob0Var3.d(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= ob0Var3.f(df0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= ob0Var3.f(lk0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= ob0Var3.g(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= ob0Var3.g(false) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= ob0Var3.h(joVar) ? 131072 : 65536;
        }
        int i12 = i6 | 1572864;
        if (ob0Var3.N(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
            ob0Var3.S();
            if ((i3 & 1) != 0 && !ob0Var3.x()) {
                ob0Var3.Q();
            }
            ob0Var3.q();
            Object objK10 = ob0Var3.K();
            l91 l91Var4 = kp.a;
            if (objK10 == l91Var4) {
                objK10 = new o80();
                ob0Var3.f0(objK10);
            }
            o80 o80Var5 = (o80) objK10;
            Object objK11 = ob0Var3.K();
            if (objK11 == l91Var4) {
                go0 go0Var = ho0.a;
                objK11 = new n6();
                ob0Var3.f0(objK11);
            }
            n6 n6Var = (n6) objK11;
            Object objK12 = ob0Var3.K();
            if (objK12 == l91Var4) {
                objK12 = new gz1(n6Var);
                ob0Var3.f0(objK12);
            }
            final gz1 gz1Var3 = (gz1) objK12;
            hx hxVar3 = (hx) ob0Var3.j(aq.h);
            c90 c90Var2 = (c90) ob0Var3.j(aq.k);
            long j5 = ((xz1) ob0Var3.j(yz1.a)).b;
            j80 j80Var4 = (j80) ob0Var3.j(aq.i);
            i72 i72Var4 = (i72) ob0Var3.j(aq.u);
            rq1 rq1Var = (rq1) ob0Var3.j(aq.q);
            boolean z13 = i == 1 && !z && df0Var.a;
            k31 k31Var2 = k31.e;
            k31 k31Var3 = z13 ? k31.f : k31Var2;
            ob0Var3.W(-213744626);
            Object[] objArr = {k31Var3};
            n81 n81Var = ky1.g;
            boolean zD = ob0Var3.d(k31Var3.ordinal());
            Object objK13 = ob0Var3.K();
            int i13 = 5;
            if (zD || objK13 == l91Var4) {
                o80Var = o80Var5;
                k31Var = k31Var3;
                objK13 = new p7(i13, k31Var);
                ob0Var3.f0(objK13);
            } else {
                o80Var = o80Var5;
                k31Var = k31Var3;
            }
            ky1 ky1Var3 = (ky1) kd1.y(objArr, n81Var, (ha0) objK13, ob0Var3, 0);
            ob0Var3.p(false);
            if (((k31) ky1Var3.f.getValue()) != k31Var) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(k31Var == k31Var2 ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i14 = i5 & 14;
            boolean z14 = (i14 == 4) | ((i5 & 57344) == 16384);
            Object objK14 = ob0Var3.K();
            if (z14 || objK14 == l91Var4) {
                v12 v12VarQ = s22.q(ez1Var, hbVar4);
                z01 z01Var6 = v12VarQ.b;
                if (wz1Var3 != null) {
                    ky1Var = ky1Var3;
                    long j6 = wz1Var3.a;
                    int i15 = wz1.c;
                    int iG = z01Var6.g((int) (j6 >> 32));
                    int iG2 = z01Var6.g((int) (j6 & 4294967295L));
                    int iMin = Math.min(iG, iG2);
                    int iMax = Math.max(iG, iG2);
                    fb fbVar = new fb(v12VarQ.a);
                    hbVar = hbVar4;
                    wz1Var = wz1Var3;
                    fbVar.f.add(new eb(new zq1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, ax1.c, null, 61439), iMin, iMax, ""));
                    objK14 = new v12(fbVar.b(), z01Var6);
                } else {
                    ky1Var = ky1Var3;
                    hbVar = hbVar4;
                    wz1Var = wz1Var3;
                    objK14 = v12VarQ;
                }
                ob0Var3.f0(objK14);
            } else {
                ky1Var = ky1Var3;
                hbVar = hbVar4;
                wz1Var = wz1Var3;
            }
            v12 v12Var2 = (v12) objK14;
            hb hbVar5 = v12Var2.a;
            z01 z01Var7 = v12Var2.b;
            dc1 dc1VarW = ob0Var3.w();
            if (dc1VarW == null) {
                yc.l("no recompose scope found");
                return;
            }
            dc1VarW.b |= 1;
            boolean zF = ob0Var3.f(rq1Var);
            Object objK15 = ob0Var3.K();
            if (zF || objK15 == l91Var4) {
                l91Var = l91Var4;
                j80Var = j80Var4;
                i72Var = i72Var4;
                z3 = z;
                i7 = i14;
                hbVar2 = hbVar;
                d02Var2 = d02Var;
                v12Var = v12Var2;
                j = j4;
                z01Var = z01Var7;
                cx1 cx1Var = new cx1(hbVar5, d02Var2, z3, hxVar3, c90Var2, 0);
                wz1Var2 = wz1Var;
                hbVar3 = hbVar5;
                hxVar = hxVar3;
                c90Var = c90Var2;
                jo0Var = new jo0(cx1Var, dc1VarW, rq1Var);
                ob0Var3.f0(jo0Var);
            } else {
                z3 = z;
                l91Var = l91Var4;
                hbVar3 = hbVar5;
                jo0Var = objK15;
                hxVar = hxVar3;
                c90Var = c90Var2;
                j80Var = j80Var4;
                i72Var = i72Var4;
                wz1Var2 = wz1Var;
                d02Var2 = d02Var;
                v12Var = v12Var2;
                z01Var = z01Var7;
                i7 = i14;
                hbVar2 = hbVar;
                j = j4;
            }
            final jo0 jo0Var5 = (jo0) jo0Var;
            jo0Var5.u = sa0Var;
            jo0Var5.z = j5;
            oc ocVar = jo0Var5.r;
            ocVar.b = lk0Var;
            ocVar.c = j80Var;
            jo0Var5.j = hbVar2;
            cx1 cx1Var2 = jo0Var5.a;
            if (xi0.o(cx1Var2.a, hbVar3) && xi0.o(cx1Var2.b, d02Var2) && cx1Var2.e == z3 && cx1Var2.f == 1 && cx1Var2.c == Integer.MAX_VALUE && cx1Var2.d == 1 && xi0.o(cx1Var2.g, hxVar) && xi0.o(cx1Var2.i, f40.e) && cx1Var2.h == c90Var) {
                hxVar2 = hxVar;
            } else {
                hxVar2 = hxVar;
                cx1Var2 = new cx1(hbVar3, d02Var2, z3, hxVar2, c90Var, 0);
            }
            if (jo0Var5.a != cx1Var2) {
                jo0Var5.p = true;
            }
            jo0Var5.a = cx1Var2;
            xg0 xg0Var = jo0Var5.d;
            kz1 kz1Var = jo0Var5.e;
            wz1 wz1Var4 = wz1Var2;
            boolean zO = xi0.o(wz1Var4, ((x20) xg0Var.g).c());
            if (xi0.o(((az1) xg0Var.f).a.f, hbVar2.f)) {
                j2 = j;
                if (wz1.b(((az1) xg0Var.f).b, j2)) {
                    z4 = false;
                } else {
                    ((x20) xg0Var.g).f(wz1.f(j2), wz1.e(j2));
                    z5 = true;
                    z4 = false;
                    if (wz1Var4 != null) {
                        x20 x20Var = (x20) xg0Var.g;
                        x20Var.d = -1;
                        x20Var.e = -1;
                        z6 = zO;
                    } else {
                        z6 = zO;
                        long j7 = wz1Var4.a;
                        if (!wz1.c(j7)) {
                            ((x20) xg0Var.g).e(wz1.f(j7), wz1.e(j7));
                        }
                    }
                    if (z4 && (z5 || z6)) {
                        az1VarA = az1Var;
                        az1Var2 = az1VarA;
                    } else {
                        x20 x20Var2 = (x20) xg0Var.g;
                        x20Var2.d = -1;
                        x20Var2.e = -1;
                        az1Var2 = az1Var;
                        az1VarA = az1.a(az1Var2, null, 0L, 3);
                    }
                    az1 az1Var3 = (az1) xg0Var.f;
                    xg0Var.f = az1VarA;
                    if (kz1Var != null) {
                        kz1Var.a(az1Var3, az1VarA);
                    }
                    objK = ob0Var3.K();
                    l91Var2 = l91Var;
                    if (objK == l91Var2) {
                        objK = new q32();
                        ob0Var3.f0(objK);
                    }
                    q32Var = (q32) objK;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (q32Var.e) {
                        q32Var.d = Long.valueOf(jCurrentTimeMillis);
                        q32Var.a(az1Var2);
                        objK2 = ob0Var3.K();
                        if (objK2 == l91Var2) {
                            objK2 = wi0.v(ob0Var3);
                            ob0Var3.f0(objK2);
                        }
                        vtVar = (vt) objK2;
                        objK3 = ob0Var3.K();
                        if (objK3 == l91Var2) {
                            objK3 = new zg();
                            ob0Var3.f0(objK3);
                        }
                        zgVar = (zg) objK3;
                        objK4 = ob0Var3.K();
                        if (objK4 == l91Var2) {
                            objK4 = new ry1(q32Var);
                            ob0Var3.f0(objK4);
                        }
                        ry1Var = (ry1) objK4;
                        z01Var2 = z01Var;
                        ry1Var.b = z01Var2;
                        ry1Var.c = jo0Var5.v;
                        ry1Var.d = jo0Var5;
                        ry1Var.e.setValue(az1Var2);
                        ry1Var.v = new wz1(j2);
                        ry1Var.g = (yk) ob0Var3.j(aq.f);
                        ry1Var.h = vtVar;
                        ry1Var.j = (id0) ob0Var3.j(aq.l);
                        o80Var2 = o80Var;
                        ry1Var.k = o80Var2;
                        final boolean z15 = true;
                        ry1Var.l.setValue(true);
                        ry1Var.m.setValue(Boolean.valueOf(z2));
                        ob0Var3.W(1966756105);
                        as0 as0Var = d02Var2.a.k;
                        ys1 ys1Var = u71.a;
                        ob0Var3.W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                            ob0Var3.p(false);
                            j80Var2 = j80Var;
                            z7 = false;
                            s71Var = null;
                        } else {
                            Context context = (Context) ob0Var3.j(w4.b);
                            lt ltVar = (lt) ob0Var3.j(u71.a);
                            boolean zF2 = ob0Var3.f(ltVar) | ob0Var3.f(context) | ob0Var3.f(as0Var);
                            j80Var2 = j80Var;
                            Object objK16 = ob0Var3.K();
                            if (zF2 || objK16 == l91Var2) {
                                u71.b.getClass();
                                objK16 = new s71(ltVar, context, uk1.e, as0Var);
                                ob0Var3.f0(objK16);
                            }
                            s71Var = (s71) objK16;
                            z7 = false;
                            ob0Var3.p(false);
                        }
                        ry1Var.i = s71Var;
                        ob0Var3.p(z7);
                        jo0Var5.b();
                        int i16 = i12 & 7168;
                        i8 = i7;
                        i9 = (i12 & 112) ^ 48;
                        zH = ob0Var3.h(jo0Var5) | (i16 != 2048) | ((i12 & 57344) != 16384) | ob0Var3.h(gz1Var3) | (i8 != 4) | ((i9 <= 32 && ob0Var3.f(df0Var)) || (i12 & 48) == 32) | ob0Var3.h(z01Var2) | ob0Var3.h(vtVar) | ob0Var3.h(zgVar) | ob0Var3.h(ry1Var);
                        Object objK17 = ob0Var3.K();
                        if (zH || objK17 == l91Var2) {
                            l91Var3 = l91Var2;
                            i10 = i8;
                            ob0Var2 = ob0Var3;
                            final az1 az1Var4 = az1Var2;
                            i11 = i12;
                            ky1Var2 = ky1Var;
                            o80Var3 = o80Var2;
                            j80Var3 = j80Var2;
                            jx0Var2 = jx0Var;
                            df0Var2 = df0Var;
                            obj = new sa0() { // from class: ts
                                @Override // defpackage.sa0
                                public final Object i(Object obj2) {
                                    qz1 qz1VarD;
                                    v80 v80Var = (v80) obj2;
                                    jo0 jo0Var6 = jo0Var5;
                                    boolean zB = jo0Var6.b();
                                    boolean zA = v80Var.a();
                                    t32 t32Var = t32.a;
                                    if (zB != zA) {
                                        jo0Var6.f.setValue(Boolean.valueOf(v80Var.a()));
                                        boolean zB2 = jo0Var6.b();
                                        az1 az1Var5 = az1Var4;
                                        z01 z01Var8 = z01Var2;
                                        if (zB2 && z2) {
                                            bl.S(gz1Var3, jo0Var6, az1Var5, df0Var2, z01Var8);
                                        } else {
                                            bl.v(jo0Var6);
                                        }
                                        if (v80Var.a() && (qz1VarD = jo0Var6.d()) != null) {
                                            nu0.A(vtVar, null, null, new l6(zgVar, az1Var5, jo0Var6, qz1VarD, z01Var8, null, 4), 3);
                                        }
                                        if (!v80Var.a()) {
                                            ry1Var.g(null);
                                        }
                                    }
                                    return t32Var;
                                }
                            };
                            z8 = z2;
                            vtVar2 = vtVar;
                            z01Var3 = z01Var2;
                            zgVar2 = zgVar;
                            az1Var2 = az1Var4;
                            ry1Var2 = ry1Var;
                            ob0Var2.f0(obj);
                        } else {
                            l91Var3 = l91Var2;
                            i10 = i8;
                            ry1Var2 = ry1Var;
                            vtVar2 = vtVar;
                            obj = objK17;
                            i11 = i12;
                            z01Var3 = z01Var2;
                            ky1Var2 = ky1Var;
                            o80Var3 = o80Var2;
                            j80Var3 = j80Var2;
                            jx0Var2 = jx0Var;
                            z8 = z2;
                            zgVar2 = zgVar;
                            ob0Var2 = ob0Var3;
                            df0Var2 = df0Var;
                        }
                        tv0 tv0VarO = nu0.o(wi0.E(new p80(o80Var3), (sa0) obj), z8, jx0Var2);
                        fy0 fy0VarD = xc.D(Boolean.valueOf(z8), ob0Var2);
                        boolean zF3 = ob0Var2.f(fy0VarD) | ob0Var2.h(jo0Var5) | ob0Var2.h(gz1Var3) | ob0Var2.h(ry1Var2);
                        if (i9 > 32 || !ob0Var2.f(df0Var2)) {
                            jo0Var2 = jo0Var5;
                            if ((i11 & 48) != 32) {
                                z9 = false;
                            }
                            z10 = z9 | zF3;
                            Object objK18 = ob0Var2.K();
                            if (z10 || objK18 == l91Var3) {
                                o80Var4 = o80Var3;
                                tv0Var2 = tv0VarO;
                                vtVar3 = vtVar2;
                                jo0Var3 = jo0Var2;
                                l6Var = new l6(jo0Var3, fy0VarD, gz1Var3, ry1Var2, df0Var2, null, 3);
                                fy0Var = fy0VarD;
                                gz1Var = gz1Var3;
                                ob0Var2.f0(l6Var);
                            } else {
                                l6Var = objK18;
                                gz1Var = gz1Var3;
                                o80Var4 = o80Var3;
                                tv0Var2 = tv0VarO;
                                jo0Var3 = jo0Var2;
                                vtVar3 = vtVar2;
                                fy0Var = fy0VarD;
                            }
                            wi0.i((wa0) l6Var, ob0Var2, t32.a);
                            u5 u5Var = new u5(1, new qs(jo0Var3, 4));
                            qv0Var = qv0.a;
                            tv0 tv0VarA = bv1.a(qv0Var, 8675309, u5Var);
                            final boolean z16 = z8;
                            z01Var4 = z01Var3;
                            final o80 o80Var6 = o80Var4;
                            gz1Var2 = gz1Var;
                            tv0 tv0VarC2 = (!z2 ? bk.q(tv0VarA, new fs(3, new sa0() { // from class: dy1
                                @Override // defpackage.sa0
                                public final Object i(Object obj2) {
                                    w01 w01Var = (w01) obj2;
                                    jo0 jo0Var6 = jo0Var3;
                                    if (jo0Var6.b()) {
                                        rq1 rq1Var2 = jo0Var6.c;
                                        if (rq1Var2 != null) {
                                            ((zw) rq1Var2).b();
                                        }
                                    } else {
                                        o80.a(o80Var6);
                                    }
                                    if (jo0Var6.b() && z16) {
                                        if (jo0Var6.a() != cd0.f) {
                                            qz1 qz1VarD = jo0Var6.d();
                                            if (qz1VarD != null) {
                                                long j8 = w01Var.a;
                                                xg0 xg0Var2 = jo0Var6.d;
                                                qs qsVar = jo0Var6.v;
                                                int iE = z01Var4.e(qz1VarD.b(j8, true));
                                                qsVar.i(az1.a((az1) xg0Var2.f, null, af1.g(iE, iE), 5));
                                                if (jo0Var6.a.a.f.length() > 0) {
                                                    jo0Var6.k.setValue(cd0.g);
                                                }
                                            }
                                        } else {
                                            ry1Var2.g(w01Var);
                                        }
                                    }
                                    return t32.a;
                                }
                            }, jx0Var2)) : tv0VarA).c(new av1(ry1Var2.z, ry1Var2.y, new u5(4, ry1Var2), 4));
                            j81.a.getClass();
                            tv0 tv0VarE = xk.E(tv0VarC2, wi0.x);
                            final tv0 tv0VarI = pv.i(qv0Var, new kf(jo0Var3, az1Var2, z01Var4, 5));
                            i72Var2 = i72Var;
                            boolean zH6 = ob0Var2.h(jo0Var3) | (i16 != 2048) | ob0Var2.f(i72Var2) | ob0Var2.h(ry1Var2);
                            int i17 = i10;
                            zH2 = zH6 | (i17 != 4) | ob0Var2.h(z01Var4);
                            objK5 = ob0Var2.K();
                            if (!zH2 || objK5 == l91Var3) {
                                final az1 az1Var5 = az1Var2;
                                qv0Var2 = qv0Var;
                                sa0 sa0Var3 = new sa0() { // from class: us
                                    @Override // defpackage.sa0
                                    public final Object i(Object obj2) {
                                        kz1 kz1Var2;
                                        zk0 zk0Var;
                                        zk0 zk0Var2;
                                        jo0 jo0Var6 = jo0Var3;
                                        v41 v41Var = jo0Var6.o;
                                        zk0 zk0Var3 = (zk0) obj2;
                                        jo0Var6.h = zk0Var3;
                                        qz1 qz1VarD = jo0Var6.d();
                                        if (qz1VarD != null) {
                                            qz1VarD.b = zk0Var3;
                                        }
                                        if (z2) {
                                            cd0 cd0VarA = jo0Var6.a();
                                            cd0 cd0Var = cd0.f;
                                            ry1 ry1Var4 = ry1Var2;
                                            az1 az1Var6 = az1Var5;
                                            if (cd0VarA == cd0Var) {
                                                if (((Boolean) jo0Var6.l.getValue()).booleanValue() && ((co0) i72Var2).a()) {
                                                    ry1Var4.r();
                                                } else {
                                                    ry1Var4.o();
                                                }
                                                jo0Var6.m.setValue(Boolean.valueOf(uc1.s(ry1Var4, true)));
                                                jo0Var6.n.setValue(Boolean.valueOf(uc1.s(ry1Var4, false)));
                                                v41Var.setValue(Boolean.valueOf(wz1.c(az1Var6.b)));
                                            } else if (jo0Var6.a() == cd0.g) {
                                                v41Var.setValue(Boolean.valueOf(uc1.s(ry1Var4, true)));
                                            }
                                            z01 z01Var8 = z01Var4;
                                            bl.J(jo0Var6, az1Var6, z01Var8);
                                            qz1 qz1VarD2 = jo0Var6.d();
                                            if (qz1VarD2 != null && (kz1Var2 = jo0Var6.e) != null && jo0Var6.b() && (zk0Var = qz1VarD2.b) != null && zk0Var.B() && (zk0Var2 = qz1VarD2.c) != null) {
                                                pz1 pz1Var = qz1VarD2.a;
                                                kh khVar = new kh(2, zk0Var);
                                                pc1 pc1VarY = qc1.y(zk0Var);
                                                pc1 pc1VarI = zk0Var.I(zk0Var2, false);
                                                if (xi0.o((kz1) kz1Var2.a.b.get(), kz1Var2)) {
                                                    kz1Var2.b.b(az1Var6, z01Var8, pz1Var, khVar, pc1VarY, pc1VarI);
                                                }
                                            }
                                        }
                                        return t32.a;
                                    }
                                };
                                i72Var3 = i72Var2;
                                z01Var4 = z01Var4;
                                ob0Var2.f0(sa0Var3);
                                objK5 = sa0Var3;
                            } else {
                                i72Var3 = i72Var2;
                                qv0Var2 = qv0Var;
                            }
                            final tv0 tv0VarO2 = u4.o(qv0Var2, (sa0) objK5);
                            jo0 jo0Var6 = jo0Var3;
                            ry1Var3 = ry1Var2;
                            bt btVar = new bt(v12Var, az1Var, jo0Var6, z2, z01Var4, ry1Var3, df0Var, o80Var4);
                            jo0Var4 = jo0Var6;
                            if (!z2 && ((co0) i72Var3).a() && wz1.c(((wz1) jo0Var4.A.getValue()).a) && wz1.c(((wz1) jo0Var4.B.getValue()).a)) {
                                z01Var5 = z01Var4;
                                tv0VarQ = qv0Var2;
                            } else {
                                z01Var5 = z01Var4;
                                um0 um0Var = new um0(uq1Var, jo0Var4, az1Var, z01Var5, 2);
                                jo0Var4 = jo0Var4;
                                tv0VarQ = bk.q(qv0Var2, um0Var);
                            }
                            zH3 = ob0Var2.h(ry1Var3);
                            objK6 = ob0Var2.K();
                            if (!zH3 || objK6 == l91Var3) {
                                objK6 = new vs(ry1Var3, 0);
                                ob0Var2.f0(objK6);
                            }
                            wi0.c(ry1Var3, (sa0) objK6, ob0Var2);
                            zH4 = ob0Var2.h(jo0Var4) | ob0Var2.h(gz1Var2) | (i17 != 4) | ((i9 <= 32 && ob0Var2.f(df0Var)) || (i11 & 48) == 32);
                            objK7 = ob0Var2.K();
                            if (zH4 || objK7 == l91Var3) {
                                e9 e9Var = new e9(jo0Var4, gz1Var2, az1Var, df0Var, 1);
                                df0Var3 = df0Var;
                                ob0Var2.f0(e9Var);
                                objK7 = e9Var;
                            } else {
                                df0Var3 = df0Var;
                            }
                            wi0.c(df0Var3, (sa0) objK7, ob0Var2);
                            final qs qsVar = jo0Var4.v;
                            final boolean z17 = i != 1;
                            qv0Var3 = qv0Var2;
                            final int i18 = df0Var3.e;
                            final z01 z01Var8 = z01Var5;
                            tv0 tv0VarQ3 = bk.q(qv0Var3, new xa0() { // from class: tx1
                                @Override // defpackage.xa0
                                public final Object f(Object obj2, Object obj3, Object obj4) {
                                    ob0 ob0Var4 = (ob0) obj3;
                                    ((Integer) obj4).getClass();
                                    ob0Var4.W(851809892);
                                    Object objK19 = ob0Var4.K();
                                    l91 l91Var5 = kp.a;
                                    if (objK19 == l91Var5) {
                                        objK19 = new vz1();
                                        ob0Var4.f0(objK19);
                                    }
                                    vz1 vz1Var = (vz1) objK19;
                                    Object objK20 = ob0Var4.K();
                                    if (objK20 == l91Var5) {
                                        objK20 = new nv();
                                        ob0Var4.f0(objK20);
                                    }
                                    sx1 sx1Var = new sx1(jo0Var4, ry1Var3, az1Var, z15, z17, vz1Var, z01Var8, q32Var, (nv) objK20, qsVar, i18);
                                    boolean zH7 = ob0Var4.h(sx1Var);
                                    Object objK21 = ob0Var4.K();
                                    if (zH7 || objK21 == l91Var5) {
                                        ux1 ux1Var = new ux1(1, sx1Var, sx1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
                                        ob0Var4.f0(ux1Var);
                                        objK21 = ux1Var;
                                    }
                                    tv0 tv0VarP = c2.p(qv0.a, (sa0) ((hb0) objK21));
                                    ob0Var4.p(false);
                                    return tv0VarP;
                                }
                            });
                            int i19 = df0Var3.d;
                            z11 = (i19 == 7 || i19 == 8) ? false : true;
                            zBooleanValue = ((Boolean) fy0Var.getValue()).booleanValue();
                            zG = ob0Var2.g(z11) | ob0Var2.h(n6Var);
                            objK8 = ob0Var2.K();
                            if (!zG || objK8 == l91Var3) {
                                objK8 = new gs(1, n6Var, z11);
                                ob0Var2.f0(objK8);
                            }
                            ha0 ha0Var = (ha0) objK8;
                            if (zBooleanValue || !du1.a) {
                                tv0VarC = qv0Var3;
                            } else {
                                tv0VarC = (z11 ? new eu1(u4.v0) : qv0Var3).c(new bu1(ha0Var));
                            }
                            uq1Var2 = (lh) ob0Var2.j(ee.a);
                            j3 = ((vl) ob0Var2.j(ee.b)).a;
                            if (!vl.c(j3, lk.f(1308617531))) {
                                uq1Var2 = new uq1(j3);
                            }
                            zH5 = ob0Var2.h(jo0Var4) | ob0Var2.f(uq1Var2);
                            objK9 = ob0Var2.K();
                            if (!zH5 || objK9 == l91Var3) {
                                objK9 = new d(7, jo0Var4, uq1Var2);
                                ob0Var2.f0(objK9);
                            }
                            tv0 tv0VarC3 = c2.q(c2.q(tv0Var.c(pv.l(qv0Var3, (sa0) objK9)).c(new do0(n6Var, jo0Var4, ry1Var3)).c(tv0VarC).c(tv0Var2), new cr(4, j80Var3, jo0Var4)), new cr(1, jo0Var4, ry1Var3)).c(tv0VarQ3);
                            final ky1 ky1Var4 = ky1Var2;
                            final vt vtVar4 = vtVar3;
                            tv0 tv0VarC4 = u4.o(tv0VarC3.c(new jp(new zo1(ky1Var4, z2, jx0Var))).c(tv0VarE).c(btVar), new qs(jo0Var4, 0)).c(new o2(new fi(15, ry1Var3, vtVar4)));
                            z12 = !z2 && jo0Var4.b() && ((Boolean) jo0Var4.q.getValue()).booleanValue() && ((co0) i72Var3).a();
                            if (z12) {
                                tv0VarQ2 = qv0Var3;
                            } else {
                                tv0VarQ2 = !jt0.a() ? qv0Var3 : bk.q(qv0Var3, new wi(10, ry1Var3));
                            }
                            final jo0 jo0Var7 = jo0Var4;
                            final hx hxVar4 = hxVar2;
                            final zg zgVar3 = zgVar2;
                            final tv0 tv0Var3 = tv0VarQ;
                            final i72 i72Var5 = i72Var3;
                            final boolean z18 = z13;
                            ob0Var3 = ob0Var;
                            c(tv0VarC4, ry1Var3, lk.d0(-814563849, new wa0() { // from class: rs
                                @Override // defpackage.wa0
                                public final Object h(Object obj2, Object obj3) {
                                    ob0 ob0Var4 = (ob0) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    if (ob0Var4.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        joVar.f(lk.d0(-44346382, new wa0(jo0Var7, i2, i, z18, z, ky1Var4, az1Var, ez1Var, tv0Var3, tv0VarI, tv0VarO2, tv0VarQ2, zgVar3, ry1Var3, z12, i72Var5, vtVar4, sa0Var2, z01Var8, hxVar4) { // from class: os
                                            public final /* synthetic */ jo0 f;
                                            public final /* synthetic */ int g;
                                            public final /* synthetic */ int h;
                                            public final /* synthetic */ boolean i;
                                            public final /* synthetic */ ky1 j;
                                            public final /* synthetic */ az1 k;
                                            public final /* synthetic */ ez1 l;
                                            public final /* synthetic */ tv0 m;
                                            public final /* synthetic */ tv0 n;
                                            public final /* synthetic */ tv0 o;
                                            public final /* synthetic */ tv0 p;
                                            public final /* synthetic */ zg q;
                                            public final /* synthetic */ ry1 r;
                                            public final /* synthetic */ boolean s;
                                            public final /* synthetic */ i72 t;
                                            public final /* synthetic */ vt u;
                                            public final /* synthetic */ sa0 v;
                                            public final /* synthetic */ z01 w;
                                            public final /* synthetic */ hx x;

                                            {
                                                this.i = z;
                                                this.j = ky1Var;
                                                this.k = az1Var;
                                                this.l = ez1Var;
                                                this.m = tv0Var;
                                                this.n = tv0Var;
                                                this.o = tv0Var;
                                                this.p = tv0Var;
                                                this.q = zgVar;
                                                this.r = ry1Var;
                                                this.s = z;
                                                this.t = i72Var;
                                                this.u = vtVar;
                                                this.v = sa0Var;
                                                this.w = z01Var;
                                                this.x = hxVar;
                                            }

                                            @Override // defpackage.wa0
                                            public final Object h(Object obj4, Object obj5) {
                                                tv0 z52Var;
                                                final az1 az1Var6 = this.k;
                                                long j8 = az1Var6.b;
                                                ob0 ob0Var5 = (ob0) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (ob0Var5.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    final jo0 jo0Var8 = this.f;
                                                    float f = ((tz) jo0Var8.g.getValue()).e;
                                                    tv0 tv0VarC5 = ko1.c(qv0.a, f, tz.b(f, 0.0f) ? Float.NaN : f);
                                                    int i20 = this.g;
                                                    final int i21 = this.h;
                                                    lk.q0(i20, i21);
                                                    d02 d02Var3 = this.e;
                                                    if ((i20 != 1 || i21 != Integer.MAX_VALUE) && this.i) {
                                                        tv0VarC5 = tv0VarC5.c(new md0(d02Var3, i20, i21));
                                                    }
                                                    boolean zH7 = ob0Var5.h(jo0Var8);
                                                    Object objK19 = ob0Var5.K();
                                                    if (zH7 || objK19 == kp.a) {
                                                        objK19 = new p7(4, jo0Var8);
                                                        ob0Var5.f0(objK19);
                                                    }
                                                    ha0 ha0Var2 = (ha0) objK19;
                                                    ky1 ky1Var5 = this.j;
                                                    k31 k31Var4 = (k31) ky1Var5.f.getValue();
                                                    int i22 = wz1.c;
                                                    int iF = (int) (j8 >> 32);
                                                    long j9 = ky1Var5.e;
                                                    tv0 tv0Var4 = tv0VarC5;
                                                    if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                        iF = wz1.f(j8);
                                                    }
                                                    ky1Var5.e = j8;
                                                    v12 v12VarQ2 = s22.q(this.l, az1Var6.a);
                                                    int iOrdinal = k31Var4.ordinal();
                                                    if (iOrdinal == 0) {
                                                        z52Var = new z52(ky1Var5, iF, v12VarQ2, ha0Var2);
                                                    } else {
                                                        if (iOrdinal != 1) {
                                                            ez1.a();
                                                            return null;
                                                        }
                                                        z52Var = new yd0(ky1Var5, iF, v12VarQ2, ha0Var2);
                                                    }
                                                    tv0 tv0VarC6 = xk.i(s31.a(tv0Var4)).c(z52Var).c(this.m).c(this.n).c(new xy1(d02Var3)).c(this.o).c(this.p);
                                                    final zg zgVar4 = this.q;
                                                    tv0 tv0VarC7 = tv0VarC6.c(new xg(zgVar4));
                                                    final ry1 ry1Var4 = this.r;
                                                    final boolean z19 = this.s;
                                                    final i72 i72Var6 = this.t;
                                                    final vt vtVar5 = this.u;
                                                    final sa0 sa0Var4 = this.v;
                                                    final z01 z01Var9 = this.w;
                                                    final hx hxVar5 = this.x;
                                                    af1.d(tv0VarC7, lk.d0(1412697320, new wa0() { // from class: ps
                                                        /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
                                                        /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
                                                        @Override // defpackage.wa0
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final Object h(Object obj6, Object obj7) {
                                                            ob0 ob0Var6 = (ob0) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            boolean z20 = true;
                                                            if (ob0Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                jo0 jo0Var9 = jo0Var8;
                                                                ry1 ry1Var5 = ry1Var4;
                                                                ws wsVar = new ws(jo0Var9, ry1Var5, i72Var6, vtVar5, sa0Var4, az1Var6, z01Var9, hxVar5, zgVar4, i21);
                                                                int iHashCode = Long.hashCode(ob0Var6.T);
                                                                b61 b61VarL = ob0Var6.l();
                                                                tv0 tv0VarP = bk.P(ob0Var6, qv0.a);
                                                                ep.c.getClass();
                                                                zp zpVar = dp.b;
                                                                ob0Var6.Z();
                                                                if (ob0Var6.S) {
                                                                    ob0Var6.k(zpVar);
                                                                } else {
                                                                    ob0Var6.i0();
                                                                }
                                                                xc.E(dp.f, ob0Var6, wsVar);
                                                                xc.E(dp.e, ob0Var6, b61VarL);
                                                                xc.E(dp.g, ob0Var6, Integer.valueOf(iHashCode));
                                                                xc.C(ob0Var6, dp.h);
                                                                xc.E(dp.d, ob0Var6, tv0VarP);
                                                                ob0Var6.p(true);
                                                                cd0 cd0VarA = jo0Var9.a();
                                                                cd0 cd0Var = cd0.e;
                                                                boolean z21 = z19;
                                                                if (cd0VarA == cd0Var || jo0Var9.c() == null) {
                                                                    z20 = false;
                                                                    bl.e(ry1Var5, z20, ob0Var6, 0);
                                                                    if (jo0Var9.a() == cd0.g || !z21) {
                                                                        ob0Var6.W(-713663782);
                                                                        ob0Var6.p(false);
                                                                    } else {
                                                                        ob0Var6.W(-713740662);
                                                                        bl.g(ry1Var5, ob0Var6, 0);
                                                                        ob0Var6.p(false);
                                                                    }
                                                                } else {
                                                                    zk0 zk0VarC = jo0Var9.c();
                                                                    zk0VarC.getClass();
                                                                    if (!zk0VarC.B() || !z21) {
                                                                    }
                                                                    bl.e(ry1Var5, z20, ob0Var6, 0);
                                                                    if (jo0Var9.a() == cd0.g) {
                                                                        ob0Var6.W(-713663782);
                                                                        ob0Var6.p(false);
                                                                    }
                                                                }
                                                            } else {
                                                                ob0Var6.Q();
                                                            }
                                                            return t32.a;
                                                        }
                                                    }, ob0Var5), ob0Var5, 48);
                                                } else {
                                                    ob0Var5.Q();
                                                }
                                                return t32.a;
                                            }
                                        }, ob0Var4), ob0Var4, 6);
                                    } else {
                                        ob0Var4.Q();
                                    }
                                    return t32.a;
                                }
                            }, ob0Var3), ob0Var3, 384);
                        } else {
                            jo0Var2 = jo0Var5;
                        }
                        z9 = true;
                        z10 = z9 | zF3;
                        Object objK182 = ob0Var2.K();
                        if (z10) {
                            o80Var4 = o80Var3;
                            tv0Var2 = tv0VarO;
                            vtVar3 = vtVar2;
                            jo0Var3 = jo0Var2;
                            l6Var = new l6(jo0Var3, fy0VarD, gz1Var3, ry1Var2, df0Var2, null, 3);
                            fy0Var = fy0VarD;
                            gz1Var = gz1Var3;
                            ob0Var2.f0(l6Var);
                            wi0.i((wa0) l6Var, ob0Var2, t32.a);
                            u5 u5Var2 = new u5(1, new qs(jo0Var3, 4));
                            qv0Var = qv0.a;
                            tv0 tv0VarA2 = bv1.a(qv0Var, 8675309, u5Var2);
                            final boolean z162 = z8;
                            z01Var4 = z01Var3;
                            final o80 o80Var62 = o80Var4;
                            gz1Var2 = gz1Var;
                            tv0 tv0VarC22 = (!z2 ? bk.q(tv0VarA2, new fs(3, new sa0() { // from class: dy1
                                @Override // defpackage.sa0
                                public final Object i(Object obj2) {
                                    w01 w01Var = (w01) obj2;
                                    jo0 jo0Var62 = jo0Var3;
                                    if (jo0Var62.b()) {
                                        rq1 rq1Var2 = jo0Var62.c;
                                        if (rq1Var2 != null) {
                                            ((zw) rq1Var2).b();
                                        }
                                    } else {
                                        o80.a(o80Var62);
                                    }
                                    if (jo0Var62.b() && z162) {
                                        if (jo0Var62.a() != cd0.f) {
                                            qz1 qz1VarD = jo0Var62.d();
                                            if (qz1VarD != null) {
                                                long j8 = w01Var.a;
                                                xg0 xg0Var2 = jo0Var62.d;
                                                qs qsVar2 = jo0Var62.v;
                                                int iE = z01Var4.e(qz1VarD.b(j8, true));
                                                qsVar2.i(az1.a((az1) xg0Var2.f, null, af1.g(iE, iE), 5));
                                                if (jo0Var62.a.a.f.length() > 0) {
                                                    jo0Var62.k.setValue(cd0.g);
                                                }
                                            }
                                        } else {
                                            ry1Var2.g(w01Var);
                                        }
                                    }
                                    return t32.a;
                                }
                            }, jx0Var2)) : tv0VarA2).c(new av1(ry1Var2.z, ry1Var2.y, new u5(4, ry1Var2), 4));
                            j81.a.getClass();
                            tv0 tv0VarE2 = xk.E(tv0VarC22, wi0.x);
                            final tv0 tv0VarI2 = pv.i(qv0Var, new kf(jo0Var3, az1Var2, z01Var4, 5));
                            i72Var2 = i72Var;
                            boolean zH62 = ob0Var2.h(jo0Var3) | (i16 != 2048) | ob0Var2.f(i72Var2) | ob0Var2.h(ry1Var2);
                            int i172 = i10;
                            zH2 = zH62 | (i172 != 4) | ob0Var2.h(z01Var4);
                            objK5 = ob0Var2.K();
                            if (zH2) {
                                final az1 az1Var52 = az1Var2;
                                qv0Var2 = qv0Var;
                                sa0 sa0Var32 = new sa0() { // from class: us
                                    @Override // defpackage.sa0
                                    public final Object i(Object obj2) {
                                        kz1 kz1Var2;
                                        zk0 zk0Var;
                                        zk0 zk0Var2;
                                        jo0 jo0Var62 = jo0Var3;
                                        v41 v41Var = jo0Var62.o;
                                        zk0 zk0Var3 = (zk0) obj2;
                                        jo0Var62.h = zk0Var3;
                                        qz1 qz1VarD = jo0Var62.d();
                                        if (qz1VarD != null) {
                                            qz1VarD.b = zk0Var3;
                                        }
                                        if (z2) {
                                            cd0 cd0VarA = jo0Var62.a();
                                            cd0 cd0Var = cd0.f;
                                            ry1 ry1Var4 = ry1Var2;
                                            az1 az1Var6 = az1Var52;
                                            if (cd0VarA == cd0Var) {
                                                if (((Boolean) jo0Var62.l.getValue()).booleanValue() && ((co0) i72Var2).a()) {
                                                    ry1Var4.r();
                                                } else {
                                                    ry1Var4.o();
                                                }
                                                jo0Var62.m.setValue(Boolean.valueOf(uc1.s(ry1Var4, true)));
                                                jo0Var62.n.setValue(Boolean.valueOf(uc1.s(ry1Var4, false)));
                                                v41Var.setValue(Boolean.valueOf(wz1.c(az1Var6.b)));
                                            } else if (jo0Var62.a() == cd0.g) {
                                                v41Var.setValue(Boolean.valueOf(uc1.s(ry1Var4, true)));
                                            }
                                            z01 z01Var82 = z01Var4;
                                            bl.J(jo0Var62, az1Var6, z01Var82);
                                            qz1 qz1VarD2 = jo0Var62.d();
                                            if (qz1VarD2 != null && (kz1Var2 = jo0Var62.e) != null && jo0Var62.b() && (zk0Var = qz1VarD2.b) != null && zk0Var.B() && (zk0Var2 = qz1VarD2.c) != null) {
                                                pz1 pz1Var = qz1VarD2.a;
                                                kh khVar = new kh(2, zk0Var);
                                                pc1 pc1VarY = qc1.y(zk0Var);
                                                pc1 pc1VarI = zk0Var.I(zk0Var2, false);
                                                if (xi0.o((kz1) kz1Var2.a.b.get(), kz1Var2)) {
                                                    kz1Var2.b.b(az1Var6, z01Var82, pz1Var, khVar, pc1VarY, pc1VarI);
                                                }
                                            }
                                        }
                                        return t32.a;
                                    }
                                };
                                i72Var3 = i72Var2;
                                z01Var4 = z01Var4;
                                ob0Var2.f0(sa0Var32);
                                objK5 = sa0Var32;
                                final tv0 tv0VarO22 = u4.o(qv0Var2, (sa0) objK5);
                                jo0 jo0Var62 = jo0Var3;
                                ry1Var3 = ry1Var2;
                                bt btVar2 = new bt(v12Var, az1Var, jo0Var62, z2, z01Var4, ry1Var3, df0Var, o80Var4);
                                jo0Var4 = jo0Var62;
                                if (z2) {
                                    if (!z2 && ((co0) i72Var3).a() && wz1.c(((wz1) jo0Var4.A.getValue()).a) && wz1.c(((wz1) jo0Var4.B.getValue()).a)) {
                                    }
                                    zH3 = ob0Var2.h(ry1Var3);
                                    objK6 = ob0Var2.K();
                                    if (!zH3) {
                                        objK6 = new vs(ry1Var3, 0);
                                        ob0Var2.f0(objK6);
                                        wi0.c(ry1Var3, (sa0) objK6, ob0Var2);
                                        if (i9 <= 32) {
                                            zH4 = ob0Var2.h(jo0Var4) | ob0Var2.h(gz1Var2) | (i172 != 4) | ((i9 <= 32 && ob0Var2.f(df0Var)) || (i11 & 48) == 32);
                                            objK7 = ob0Var2.K();
                                            if (zH4) {
                                                e9 e9Var2 = new e9(jo0Var4, gz1Var2, az1Var, df0Var, 1);
                                                df0Var3 = df0Var;
                                                ob0Var2.f0(e9Var2);
                                                objK7 = e9Var2;
                                                wi0.c(df0Var3, (sa0) objK7, ob0Var2);
                                                final sa0 qsVar2 = jo0Var4.v;
                                                if (i != 1) {
                                                }
                                                qv0Var3 = qv0Var2;
                                                final int i182 = df0Var3.e;
                                                final z01 z01Var82 = z01Var5;
                                                tv0 tv0VarQ32 = bk.q(qv0Var3, new xa0() { // from class: tx1
                                                    @Override // defpackage.xa0
                                                    public final Object f(Object obj2, Object obj3, Object obj4) {
                                                        ob0 ob0Var4 = (ob0) obj3;
                                                        ((Integer) obj4).getClass();
                                                        ob0Var4.W(851809892);
                                                        Object objK19 = ob0Var4.K();
                                                        l91 l91Var5 = kp.a;
                                                        if (objK19 == l91Var5) {
                                                            objK19 = new vz1();
                                                            ob0Var4.f0(objK19);
                                                        }
                                                        vz1 vz1Var = (vz1) objK19;
                                                        Object objK20 = ob0Var4.K();
                                                        if (objK20 == l91Var5) {
                                                            objK20 = new nv();
                                                            ob0Var4.f0(objK20);
                                                        }
                                                        sx1 sx1Var = new sx1(jo0Var4, ry1Var3, az1Var, z15, z17, vz1Var, z01Var82, q32Var, (nv) objK20, qsVar2, i182);
                                                        boolean zH7 = ob0Var4.h(sx1Var);
                                                        Object objK21 = ob0Var4.K();
                                                        if (zH7 || objK21 == l91Var5) {
                                                            ux1 ux1Var = new ux1(1, sx1Var, sx1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
                                                            ob0Var4.f0(ux1Var);
                                                            objK21 = ux1Var;
                                                        }
                                                        tv0 tv0VarP = c2.p(qv0.a, (sa0) ((hb0) objK21));
                                                        ob0Var4.p(false);
                                                        return tv0VarP;
                                                    }
                                                });
                                                int i192 = df0Var3.d;
                                                if (i192 == 7) {
                                                    zBooleanValue = ((Boolean) fy0Var.getValue()).booleanValue();
                                                    zG = ob0Var2.g(z11) | ob0Var2.h(n6Var);
                                                    objK8 = ob0Var2.K();
                                                    if (!zG) {
                                                        objK8 = new gs(1, n6Var, z11);
                                                        ob0Var2.f0(objK8);
                                                        ha0 ha0Var2 = (ha0) objK8;
                                                        if (zBooleanValue) {
                                                            tv0VarC = qv0Var3;
                                                            uq1Var2 = (lh) ob0Var2.j(ee.a);
                                                            j3 = ((vl) ob0Var2.j(ee.b)).a;
                                                            if (!vl.c(j3, lk.f(1308617531))) {
                                                            }
                                                            zH5 = ob0Var2.h(jo0Var4) | ob0Var2.f(uq1Var2);
                                                            objK9 = ob0Var2.K();
                                                            if (!zH5) {
                                                                objK9 = new d(7, jo0Var4, uq1Var2);
                                                                ob0Var2.f0(objK9);
                                                                tv0 tv0VarC32 = c2.q(c2.q(tv0Var.c(pv.l(qv0Var3, (sa0) objK9)).c(new do0(n6Var, jo0Var4, ry1Var3)).c(tv0VarC).c(tv0Var2), new cr(4, j80Var3, jo0Var4)), new cr(1, jo0Var4, ry1Var3)).c(tv0VarQ32);
                                                                final ky1 ky1Var42 = ky1Var2;
                                                                final vt vtVar42 = vtVar3;
                                                                tv0 tv0VarC42 = u4.o(tv0VarC32.c(new jp(new zo1(ky1Var42, z2, jx0Var))).c(tv0VarE2).c(btVar2), new qs(jo0Var4, 0)).c(new o2(new fi(15, ry1Var3, vtVar42)));
                                                                if (z2) {
                                                                    if (z12) {
                                                                    }
                                                                    final jo0 jo0Var72 = jo0Var4;
                                                                    final hx hxVar42 = hxVar2;
                                                                    final zg zgVar32 = zgVar2;
                                                                    final tv0 tv0Var32 = tv0VarQ;
                                                                    final i72 i72Var52 = i72Var3;
                                                                    final boolean z182 = z13;
                                                                    ob0Var3 = ob0Var;
                                                                    c(tv0VarC42, ry1Var3, lk.d0(-814563849, new wa0() { // from class: rs
                                                                        @Override // defpackage.wa0
                                                                        public final Object h(Object obj2, Object obj3) {
                                                                            ob0 ob0Var4 = (ob0) obj2;
                                                                            int iIntValue = ((Integer) obj3).intValue();
                                                                            if (ob0Var4.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                joVar.f(lk.d0(-44346382, new wa0(jo0Var72, i2, i, z182, z, ky1Var42, az1Var, ez1Var, tv0Var32, tv0VarI2, tv0VarO22, tv0VarQ2, zgVar32, ry1Var3, z12, i72Var52, vtVar42, sa0Var2, z01Var82, hxVar42) { // from class: os
                                                                                    public final /* synthetic */ jo0 f;
                                                                                    public final /* synthetic */ int g;
                                                                                    public final /* synthetic */ int h;
                                                                                    public final /* synthetic */ boolean i;
                                                                                    public final /* synthetic */ ky1 j;
                                                                                    public final /* synthetic */ az1 k;
                                                                                    public final /* synthetic */ ez1 l;
                                                                                    public final /* synthetic */ tv0 m;
                                                                                    public final /* synthetic */ tv0 n;
                                                                                    public final /* synthetic */ tv0 o;
                                                                                    public final /* synthetic */ tv0 p;
                                                                                    public final /* synthetic */ zg q;
                                                                                    public final /* synthetic */ ry1 r;
                                                                                    public final /* synthetic */ boolean s;
                                                                                    public final /* synthetic */ i72 t;
                                                                                    public final /* synthetic */ vt u;
                                                                                    public final /* synthetic */ sa0 v;
                                                                                    public final /* synthetic */ z01 w;
                                                                                    public final /* synthetic */ hx x;

                                                                                    {
                                                                                        this.i = z;
                                                                                        this.j = ky1Var;
                                                                                        this.k = az1Var;
                                                                                        this.l = ez1Var;
                                                                                        this.m = tv0Var;
                                                                                        this.n = tv0Var;
                                                                                        this.o = tv0Var;
                                                                                        this.p = tv0Var;
                                                                                        this.q = zgVar;
                                                                                        this.r = ry1Var;
                                                                                        this.s = z;
                                                                                        this.t = i72Var;
                                                                                        this.u = vtVar;
                                                                                        this.v = sa0Var;
                                                                                        this.w = z01Var;
                                                                                        this.x = hxVar;
                                                                                    }

                                                                                    @Override // defpackage.wa0
                                                                                    public final Object h(Object obj4, Object obj5) {
                                                                                        tv0 z52Var;
                                                                                        final az1 az1Var6 = this.k;
                                                                                        long j8 = az1Var6.b;
                                                                                        ob0 ob0Var5 = (ob0) obj4;
                                                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                                                        if (ob0Var5.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                            final jo0 jo0Var8 = this.f;
                                                                                            float f = ((tz) jo0Var8.g.getValue()).e;
                                                                                            tv0 tv0VarC5 = ko1.c(qv0.a, f, tz.b(f, 0.0f) ? Float.NaN : f);
                                                                                            int i20 = this.g;
                                                                                            final int i21 = this.h;
                                                                                            lk.q0(i20, i21);
                                                                                            d02 d02Var3 = this.e;
                                                                                            if ((i20 != 1 || i21 != Integer.MAX_VALUE) && this.i) {
                                                                                                tv0VarC5 = tv0VarC5.c(new md0(d02Var3, i20, i21));
                                                                                            }
                                                                                            boolean zH7 = ob0Var5.h(jo0Var8);
                                                                                            Object objK19 = ob0Var5.K();
                                                                                            if (zH7 || objK19 == kp.a) {
                                                                                                objK19 = new p7(4, jo0Var8);
                                                                                                ob0Var5.f0(objK19);
                                                                                            }
                                                                                            ha0 ha0Var22 = (ha0) objK19;
                                                                                            ky1 ky1Var5 = this.j;
                                                                                            k31 k31Var4 = (k31) ky1Var5.f.getValue();
                                                                                            int i22 = wz1.c;
                                                                                            int iF = (int) (j8 >> 32);
                                                                                            long j9 = ky1Var5.e;
                                                                                            tv0 tv0Var4 = tv0VarC5;
                                                                                            if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                                                                iF = wz1.f(j8);
                                                                                            }
                                                                                            ky1Var5.e = j8;
                                                                                            v12 v12VarQ2 = s22.q(this.l, az1Var6.a);
                                                                                            int iOrdinal = k31Var4.ordinal();
                                                                                            if (iOrdinal == 0) {
                                                                                                z52Var = new z52(ky1Var5, iF, v12VarQ2, ha0Var22);
                                                                                            } else {
                                                                                                if (iOrdinal != 1) {
                                                                                                    ez1.a();
                                                                                                    return null;
                                                                                                }
                                                                                                z52Var = new yd0(ky1Var5, iF, v12VarQ2, ha0Var22);
                                                                                            }
                                                                                            tv0 tv0VarC6 = xk.i(s31.a(tv0Var4)).c(z52Var).c(this.m).c(this.n).c(new xy1(d02Var3)).c(this.o).c(this.p);
                                                                                            final zg zgVar4 = this.q;
                                                                                            tv0 tv0VarC7 = tv0VarC6.c(new xg(zgVar4));
                                                                                            final ry1 ry1Var4 = this.r;
                                                                                            final boolean z19 = this.s;
                                                                                            final i72 i72Var6 = this.t;
                                                                                            final vt vtVar5 = this.u;
                                                                                            final sa0 sa0Var4 = this.v;
                                                                                            final z01 z01Var9 = this.w;
                                                                                            final hx hxVar5 = this.x;
                                                                                            af1.d(tv0VarC7, lk.d0(1412697320, new wa0() { // from class: ps
                                                                                                /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
                                                                                                /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
                                                                                                @Override // defpackage.wa0
                                                                                                /*
                                                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                                                */
                                                                                                public final Object h(Object obj6, Object obj7) {
                                                                                                    ob0 ob0Var6 = (ob0) obj6;
                                                                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                                                                    boolean z20 = true;
                                                                                                    if (ob0Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                        jo0 jo0Var9 = jo0Var8;
                                                                                                        ry1 ry1Var5 = ry1Var4;
                                                                                                        ws wsVar = new ws(jo0Var9, ry1Var5, i72Var6, vtVar5, sa0Var4, az1Var6, z01Var9, hxVar5, zgVar4, i21);
                                                                                                        int iHashCode = Long.hashCode(ob0Var6.T);
                                                                                                        b61 b61VarL = ob0Var6.l();
                                                                                                        tv0 tv0VarP = bk.P(ob0Var6, qv0.a);
                                                                                                        ep.c.getClass();
                                                                                                        zp zpVar = dp.b;
                                                                                                        ob0Var6.Z();
                                                                                                        if (ob0Var6.S) {
                                                                                                            ob0Var6.k(zpVar);
                                                                                                        } else {
                                                                                                            ob0Var6.i0();
                                                                                                        }
                                                                                                        xc.E(dp.f, ob0Var6, wsVar);
                                                                                                        xc.E(dp.e, ob0Var6, b61VarL);
                                                                                                        xc.E(dp.g, ob0Var6, Integer.valueOf(iHashCode));
                                                                                                        xc.C(ob0Var6, dp.h);
                                                                                                        xc.E(dp.d, ob0Var6, tv0VarP);
                                                                                                        ob0Var6.p(true);
                                                                                                        cd0 cd0VarA = jo0Var9.a();
                                                                                                        cd0 cd0Var = cd0.e;
                                                                                                        boolean z21 = z19;
                                                                                                        if (cd0VarA == cd0Var || jo0Var9.c() == null) {
                                                                                                            z20 = false;
                                                                                                            bl.e(ry1Var5, z20, ob0Var6, 0);
                                                                                                            if (jo0Var9.a() == cd0.g || !z21) {
                                                                                                                ob0Var6.W(-713663782);
                                                                                                                ob0Var6.p(false);
                                                                                                            } else {
                                                                                                                ob0Var6.W(-713740662);
                                                                                                                bl.g(ry1Var5, ob0Var6, 0);
                                                                                                                ob0Var6.p(false);
                                                                                                            }
                                                                                                        } else {
                                                                                                            zk0 zk0VarC = jo0Var9.c();
                                                                                                            zk0VarC.getClass();
                                                                                                            if (!zk0VarC.B() || !z21) {
                                                                                                            }
                                                                                                            bl.e(ry1Var5, z20, ob0Var6, 0);
                                                                                                            if (jo0Var9.a() == cd0.g) {
                                                                                                                ob0Var6.W(-713663782);
                                                                                                                ob0Var6.p(false);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        ob0Var6.Q();
                                                                                                    }
                                                                                                    return t32.a;
                                                                                                }
                                                                                            }, ob0Var5), ob0Var5, 48);
                                                                                        } else {
                                                                                            ob0Var5.Q();
                                                                                        }
                                                                                        return t32.a;
                                                                                    }
                                                                                }, ob0Var4), ob0Var4, 6);
                                                                            } else {
                                                                                ob0Var4.Q();
                                                                            }
                                                                            return t32.a;
                                                                        }
                                                                    }, ob0Var3), ob0Var3, 384);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            zH4 = ob0Var2.h(jo0Var4) | ob0Var2.h(gz1Var2) | (i172 != 4) | ((i9 <= 32 && ob0Var2.f(df0Var)) || (i11 & 48) == 32);
                                            objK7 = ob0Var2.K();
                                            if (zH4) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Long l = q32Var.d;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        }
                        objK2 = ob0Var3.K();
                        if (objK2 == l91Var2) {
                        }
                        vtVar = (vt) objK2;
                        objK3 = ob0Var3.K();
                        if (objK3 == l91Var2) {
                        }
                        zgVar = (zg) objK3;
                        objK4 = ob0Var3.K();
                        if (objK4 == l91Var2) {
                        }
                        ry1Var = (ry1) objK4;
                        z01Var2 = z01Var;
                        ry1Var.b = z01Var2;
                        ry1Var.c = jo0Var5.v;
                        ry1Var.d = jo0Var5;
                        ry1Var.e.setValue(az1Var2);
                        ry1Var.v = new wz1(j2);
                        ry1Var.g = (yk) ob0Var3.j(aq.f);
                        ry1Var.h = vtVar;
                        ry1Var.j = (id0) ob0Var3.j(aq.l);
                        o80Var2 = o80Var;
                        ry1Var.k = o80Var2;
                        final boolean z152 = true;
                        ry1Var.l.setValue(true);
                        ry1Var.m.setValue(Boolean.valueOf(z2));
                        ob0Var3.W(1966756105);
                        as0 as0Var2 = d02Var2.a.k;
                        ys1 ys1Var2 = u71.a;
                        ob0Var3.W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                        }
                        ry1Var.i = s71Var;
                        ob0Var3.p(z7);
                        jo0Var5.b();
                        int i162 = i12 & 7168;
                        i8 = i7;
                        i9 = (i12 & 112) ^ 48;
                        if (i9 <= 32) {
                            zH = ob0Var3.h(jo0Var5) | (i162 != 2048) | ((i12 & 57344) != 16384) | ob0Var3.h(gz1Var3) | (i8 != 4) | ((i9 <= 32 && ob0Var3.f(df0Var)) || (i12 & 48) == 32) | ob0Var3.h(z01Var2) | ob0Var3.h(vtVar) | ob0Var3.h(zgVar) | ob0Var3.h(ry1Var);
                            Object objK172 = ob0Var3.K();
                            if (zH) {
                                l91Var3 = l91Var2;
                                i10 = i8;
                                ob0Var2 = ob0Var3;
                                final az1 az1Var42 = az1Var2;
                                i11 = i12;
                                ky1Var2 = ky1Var;
                                o80Var3 = o80Var2;
                                j80Var3 = j80Var2;
                                jx0Var2 = jx0Var;
                                df0Var2 = df0Var;
                                obj = new sa0() { // from class: ts
                                    @Override // defpackage.sa0
                                    public final Object i(Object obj2) {
                                        qz1 qz1VarD;
                                        v80 v80Var = (v80) obj2;
                                        jo0 jo0Var63 = jo0Var5;
                                        boolean zB = jo0Var63.b();
                                        boolean zA = v80Var.a();
                                        t32 t32Var = t32.a;
                                        if (zB != zA) {
                                            jo0Var63.f.setValue(Boolean.valueOf(v80Var.a()));
                                            boolean zB2 = jo0Var63.b();
                                            az1 az1Var53 = az1Var42;
                                            z01 z01Var83 = z01Var2;
                                            if (zB2 && z2) {
                                                bl.S(gz1Var3, jo0Var63, az1Var53, df0Var2, z01Var83);
                                            } else {
                                                bl.v(jo0Var63);
                                            }
                                            if (v80Var.a() && (qz1VarD = jo0Var63.d()) != null) {
                                                nu0.A(vtVar, null, null, new l6(zgVar, az1Var53, jo0Var63, qz1VarD, z01Var83, null, 4), 3);
                                            }
                                            if (!v80Var.a()) {
                                                ry1Var.g(null);
                                            }
                                        }
                                        return t32Var;
                                    }
                                };
                                z8 = z2;
                                vtVar2 = vtVar;
                                z01Var3 = z01Var2;
                                zgVar2 = zgVar;
                                az1Var2 = az1Var42;
                                ry1Var2 = ry1Var;
                                ob0Var2.f0(obj);
                                tv0 tv0VarO3 = nu0.o(wi0.E(new p80(o80Var3), (sa0) obj), z8, jx0Var2);
                                fy0 fy0VarD2 = xc.D(Boolean.valueOf(z8), ob0Var2);
                                boolean zF32 = ob0Var2.f(fy0VarD2) | ob0Var2.h(jo0Var5) | ob0Var2.h(gz1Var3) | ob0Var2.h(ry1Var2);
                                if (i9 > 32) {
                                    jo0Var2 = jo0Var5;
                                    if ((i11 & 48) != 32) {
                                        z9 = true;
                                    }
                                    z10 = z9 | zF32;
                                    Object objK1822 = ob0Var2.K();
                                    if (z10) {
                                    }
                                }
                            }
                        } else {
                            zH = ob0Var3.h(jo0Var5) | (i162 != 2048) | ((i12 & 57344) != 16384) | ob0Var3.h(gz1Var3) | (i8 != 4) | ((i9 <= 32 && ob0Var3.f(df0Var)) || (i12 & 48) == 32) | ob0Var3.h(z01Var2) | ob0Var3.h(vtVar) | ob0Var3.h(zgVar) | ob0Var3.h(ry1Var);
                            Object objK1722 = ob0Var3.K();
                            if (zH) {
                            }
                        }
                    }
                }
            } else {
                j2 = j;
                xg0Var.g = new x20(hbVar2, j2);
                z4 = true;
            }
            z5 = false;
            if (wz1Var4 != null) {
            }
            if (z4) {
                x20 x20Var22 = (x20) xg0Var.g;
                x20Var22.d = -1;
                x20Var22.e = -1;
                az1Var2 = az1Var;
                az1VarA = az1.a(az1Var2, null, 0L, 3);
                az1 az1Var32 = (az1) xg0Var.f;
                xg0Var.f = az1VarA;
                if (kz1Var != null) {
                }
                objK = ob0Var3.K();
                l91Var2 = l91Var;
                if (objK == l91Var2) {
                }
                q32Var = (q32) objK;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (q32Var.e) {
                }
            }
        } else {
            ob0Var3.Q();
        }
        dc1 dc1VarR = ob0Var3.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: ss
                @Override // defpackage.wa0
                public final Object h(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iV = al.V(i3 | 1);
                    int iV2 = al.V(i4);
                    bl.b(az1Var, sa0Var, tv0Var, d02Var, ez1Var, sa0Var2, jx0Var, uq1Var, z, i, i2, df0Var, lk0Var, z2, joVar, (ob0) obj2, iV, iV2);
                    return t32.a;
                }
            };
        }
    }

    public static final void c(tv0 tv0Var, ry1 ry1Var, jo joVar, ob0 ob0Var, int i) {
        ob0Var.X(2036174316);
        int i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i | (ob0Var.h(ry1Var) ? 32 : 16);
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            uu0 uu0VarD = sg.d(v20.f, true);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            lk.k(ry1Var, joVar, ob0Var, (i2 >> 3) & 126);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new o8(tv0Var, ry1Var, joVar, i, 3);
        }
    }

    public static final js d(lt ltVar) {
        if (ltVar.l(v20.O) == null) {
            ltVar = ltVar.j(new qj0(null));
        }
        return new js(ltVar);
    }

    public static final void e(ry1 ry1Var, boolean z, ob0 ob0Var, int i) {
        qz1 qz1VarD;
        ob0Var.X(626339208);
        int i2 = 2;
        int i3 = (ob0Var.h(ry1Var) ? 4 : 2) | i | (ob0Var.g(z) ? 32 : 16);
        if (!ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            ob0Var.Q();
        } else if (z) {
            ob0Var.W(1530097388);
            jo0 jo0Var = ry1Var.d;
            pz1 pz1Var = null;
            if (jo0Var != null && (qz1VarD = jo0Var.d()) != null) {
                pz1 pz1Var2 = qz1VarD.a;
                jo0 jo0Var2 = ry1Var.d;
                if (!(jo0Var2 != null ? jo0Var2.p : true)) {
                    pz1Var = pz1Var2;
                }
            }
            if (pz1Var == null) {
                ob0Var.W(1530097387);
                ob0Var.p(false);
            } else {
                ob0Var.W(1530097388);
                if (wz1.c(ry1Var.n().b)) {
                    ob0Var.W(2110860558);
                    ob0Var.p(false);
                } else {
                    ob0Var.W(2109807302);
                    int iG = ry1Var.b.g((int) (ry1Var.n().b >> 32));
                    int iG2 = ry1Var.b.g((int) (ry1Var.n().b & 4294967295L));
                    ee1 ee1VarA = pz1Var.a(iG);
                    ee1 ee1VarA2 = pz1Var.a(Math.max(iG2 - 1, 0));
                    jo0 jo0Var3 = ry1Var.d;
                    if (jo0Var3 == null || !((Boolean) jo0Var3.m.getValue()).booleanValue()) {
                        ob0Var.W(2110490542);
                        ob0Var.p(false);
                    } else {
                        ob0Var.W(2110225306);
                        qc1.c(true, ee1VarA, ry1Var, ob0Var, ((i3 << 6) & 896) | 6);
                        ob0Var.p(false);
                    }
                    jo0 jo0Var4 = ry1Var.d;
                    if (jo0Var4 == null || !((Boolean) jo0Var4.n.getValue()).booleanValue()) {
                        ob0Var.W(2110838734);
                        ob0Var.p(false);
                    } else {
                        ob0Var.W(2110574459);
                        qc1.c(false, ee1VarA2, ry1Var, ob0Var, ((i3 << 6) & 896) | 6);
                        ob0Var.p(false);
                    }
                    ob0Var.p(false);
                }
                jo0 jo0Var5 = ry1Var.d;
                if (jo0Var5 != null) {
                    v41 v41Var = jo0Var5.l;
                    if (!xi0.o(ry1Var.t.a.f, ry1Var.n().a.f)) {
                        v41Var.setValue(Boolean.FALSE);
                    }
                    if (jo0Var5.b()) {
                        if (((Boolean) v41Var.getValue()).booleanValue()) {
                            ry1Var.r();
                        } else {
                            ry1Var.o();
                        }
                    }
                }
                ob0Var.p(false);
            }
            ob0Var.p(false);
        } else {
            ob0Var.W(1989076778);
            ob0Var.p(false);
            ry1Var.o();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new tc(ry1Var, z, i, i2);
        }
    }

    public static final void f(kn0 kn0Var, Object obj, int i, Object obj2, ob0 ob0Var, int i2) {
        ob0Var.X(1439843069);
        int i3 = (ob0Var.f(kn0Var) ? 4 : 2) | i2 | (ob0Var.f(obj) ? 32 : 16) | (ob0Var.d(i) ? 256 : 128) | (ob0Var.f(obj2) ? 2048 : 1024);
        if (ob0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ((hh1) obj).b(obj2, lk.d0(980966366, new tm0(i, kn0Var, obj2), ob0Var), ob0Var, 48);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(kn0Var, obj, i, obj2, i2);
        }
    }

    public static final void g(ry1 ry1Var, ob0 ob0Var, int i) {
        hb hbVarM;
        ob0Var.X(-1436003720);
        int i2 = 2;
        int i3 = (ob0Var.h(ry1Var) ? 4 : 2) | i;
        int i4 = 0;
        if (ob0Var.N(i3 & 1, (i3 & 3) != 2)) {
            jo0 jo0Var = ry1Var.d;
            if (jo0Var == null || !((Boolean) jo0Var.o.getValue()).booleanValue() || (hbVarM = ry1Var.m()) == null || hbVarM.f.length() <= 0) {
                ob0Var.W(-2111042550);
                ob0Var.p(false);
            } else {
                ob0Var.W(-2112351432);
                boolean zF = ob0Var.f(ry1Var);
                Object objK = ob0Var.K();
                l91 l91Var = kp.a;
                if (zF || objK == l91Var) {
                    objK = new ny1(ry1Var);
                    ob0Var.f0(objK);
                }
                ex1 ex1Var = (ex1) objK;
                hx hxVar = (hx) ob0Var.j(aq.h);
                z01 z01Var = ry1Var.b;
                long j = ry1Var.n().b;
                int i5 = wz1.c;
                int iG = z01Var.g((int) (j >> 32));
                jo0 jo0Var2 = ry1Var.d;
                qz1 qz1VarD = jo0Var2 != null ? jo0Var2.d() : null;
                qz1VarD.getClass();
                pz1 pz1Var = qz1VarD.a;
                pc1 pc1VarC = pz1Var.c(lk.A(iG, 0, pz1Var.a.a.f.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((hxVar.y(2.0f) / 2.0f) + pc1VarC.a)) << 32) | (((long) Float.floatToRawIntBits(pc1VarC.d)) & 4294967295L);
                boolean zE = ob0Var.e(jFloatToRawIntBits);
                Object objK2 = ob0Var.K();
                if (zE || objK2 == l91Var) {
                    objK2 = new xs(jFloatToRawIntBits);
                    ob0Var.f0(objK2);
                }
                a11 a11Var = (a11) objK2;
                boolean zH = ob0Var.h(ex1Var) | ob0Var.h(ry1Var);
                Object objK3 = ob0Var.K();
                if (zH || objK3 == l91Var) {
                    objK3 = new at(i4, ex1Var, ry1Var);
                    ob0Var.f0(objK3);
                }
                tv0 tv0VarA = bv1.a(qv0.a, ex1Var, (PointerInputEventHandler) objK3);
                boolean zE2 = ob0Var.e(jFloatToRawIntBits);
                Object objK4 = ob0Var.K();
                if (zE2 || objK4 == l91Var) {
                    objK4 = new g5(i2, jFloatToRawIntBits);
                    ob0Var.f0(objK4);
                }
                i5.a(a11Var, ol1.a(tv0VarA, false, (sa0) objK4), 0L, ob0Var, 0);
                ob0Var.p(false);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ud(i, 5, ry1Var);
        }
    }

    public static final void h(iy0 iy0Var, sv0 sv0Var) {
        iy0 iy0VarY = P(sv0Var).y();
        int i = iy0VarY.g - 1;
        Object[] objArr = iy0VarY.e;
        if (i < objArr.length) {
            while (i >= 0) {
                iy0Var.b(((ql0) objArr[i]).I.f);
                i--;
            }
        }
    }

    public static final int i(ws0 ws0Var, c3 c3Var) {
        ws0 ws0VarZ0 = ws0Var.z0();
        if (ws0VarZ0 == null) {
            ng0.b("Child of " + ws0Var + " cannot be null when calculating alignment line");
        }
        if (ws0Var.D0().a().containsKey(c3Var)) {
            Integer num = (Integer) ws0Var.D0().a().get(c3Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iB0 = ws0VarZ0.b0(c3Var);
            if (iB0 != Integer.MIN_VALUE) {
                boolean z = ws0Var.r;
                boolean z2 = ws0Var.s;
                ws0VarZ0.r = true;
                ws0Var.s = true;
                ws0Var.J0();
                ws0VarZ0.r = z;
                ws0Var.s = z2;
                return iB0 + ((int) (c3Var instanceof ud0 ? ws0VarZ0.F0() & 4294967295L : ws0VarZ0.F0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(s02 s02Var, yu yuVar, Throwable th, ls lsVar) throws IllegalAccessException, InvocationTargetException {
        i70 i70Var;
        if (lsVar instanceof i70) {
            i70Var = (i70) lsVar;
            int i = i70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                i70Var.j = i - Integer.MIN_VALUE;
            } else {
                i70Var = new i70(lsVar);
            }
        }
        Object obj = i70Var.i;
        int i2 = i70Var.j;
        try {
            if (i2 == 0) {
                xc.G(obj);
                i70Var.h = th;
                i70Var.j = 1;
                Object objF = yuVar.f(s02Var, th, i70Var);
                Object obj2 = wt.e;
                if (objF == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = i70Var.h;
                xc.G(obj);
            }
            return t32.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                al.h(th2, th);
            }
            throw th2;
        }
    }

    public static final sv0 k(iy0 iy0Var) {
        int i;
        if (iy0Var == null || (i = iy0Var.g) == 0) {
            return null;
        }
        return (sv0) iy0Var.k(i - 1);
    }

    public static final ExtractedText l(az1 az1Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = az1Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = az1Var.b;
        extractedText.selectionStart = wz1.f(j);
        extractedText.selectionEnd = wz1.e(j);
        extractedText.flags = !ct1.L(az1Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void m(iw1 iw1Var, Context context, final boolean z, final String str, final long j) {
        if (wz1.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) xi0.w.i(context2);
        if (list.isEmpty()) {
            return;
        }
        sx0 sx0Var = iw1Var.a;
        sx0 sx0Var2 = iw1Var.a;
        vw1 vw1Var = vw1.b;
        sx0Var.a(vw1Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            sx0Var2.a(new rw1(new va1(i), resolveInfo.loadLabel(packageManager).toString(), 0, new sa0() { // from class: wa1
                @Override // defpackage.sa0
                public final Object i(Object obj) {
                    xi0.x.j(context2, resolveInfo, Boolean.valueOf(z), str, new wz1(j));
                    ((ww1) obj).close();
                    return t32.a;
                }
            }));
            i++;
            context2 = context;
        }
        sx0Var2.a(vw1Var);
    }

    public static final gg0 n(ig0 ig0Var, float f, float f2, final fg0 fg0Var, ob0 ob0Var) {
        final Float fValueOf = Float.valueOf(f);
        final Float fValueOf2 = Float.valueOf(f2);
        Object objK = ob0Var.K();
        l91 l91Var = kp.a;
        if (objK == l91Var) {
            objK = new gg0(ig0Var, fValueOf, fValueOf2, fg0Var);
            ob0Var.f0(objK);
        }
        final gg0 gg0Var = (gg0) objK;
        boolean zH = ob0Var.h(fg0Var);
        Object objK2 = ob0Var.K();
        if (zH || objK2 == l91Var) {
            objK2 = new ha0() { // from class: jg0
                @Override // defpackage.ha0
                public final Object a() {
                    gg0 gg0Var2 = gg0Var;
                    Float f3 = gg0Var2.e;
                    Float f4 = fValueOf;
                    boolean zEquals = f4.equals(f3);
                    Float f5 = fValueOf2;
                    if (!zEquals || !f5.equals(gg0Var2.f)) {
                        gg0Var2.e = f4;
                        gg0Var2.f = f5;
                        gg0Var2.h = new yv1(fg0Var, c2.P, f4, f5, null);
                        gg0Var2.l.b.setValue(Boolean.TRUE);
                        gg0Var2.i = false;
                        gg0Var2.j = true;
                    }
                    return t32.a;
                }
            };
            ob0Var.f0(objK2);
        }
        wi0.m((ha0) objK2, ob0Var);
        boolean zH2 = ob0Var.h(ig0Var);
        Object objK3 = ob0Var.K();
        if (zH2 || objK3 == l91Var) {
            objK3 = new d(11, ig0Var, gg0Var);
            ob0Var.f0(objK3);
        }
        wi0.c(gg0Var, (sa0) objK3, ob0Var);
        return gg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final il0 o(sv0 sv0Var) {
        if ((sv0Var.g & 2) != 0) {
            if (sv0Var instanceof il0) {
                return (il0) sv0Var;
            }
            if (sv0Var instanceof yw) {
                sv0 sv0Var2 = ((yw) sv0Var).t;
                while (sv0Var2 != 0) {
                    if (sv0Var2 instanceof il0) {
                        return (il0) sv0Var2;
                    }
                    sv0Var2 = (!(sv0Var2 instanceof yw) || (sv0Var2.g & 2) == 0) ? sv0Var2.j : ((yw) sv0Var2).t;
                }
            }
        }
        return null;
    }

    public static final void p(o62 o62Var, n81 n81Var, zo0 zo0Var) {
        n81Var.getClass();
        zo0Var.getClass();
        ph1 ph1Var = (ph1) o62Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (ph1Var == null || ph1Var.g) {
            return;
        }
        ph1Var.d(zo0Var, n81Var);
        qo0 qo0Var = zo0Var.c;
        if (qo0Var == qo0.f || qo0Var.compareTo(qo0.h) >= 0) {
            n81Var.o();
        } else {
            zo0Var.a(new kw(zo0Var, n81Var));
        }
    }

    public static final void q(vt vtVar, wv0 wv0Var) {
        oj0 oj0Var = (oj0) vtVar.f().l(v20.O);
        if (oj0Var != null) {
            oj0Var.a(wv0Var);
        } else {
            yc.g(vtVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final Object r(wa0 wa0Var, ks ksVar) {
        ui1 ui1Var = new ui1(ksVar, ksVar.e());
        return kd1.D(ui1Var, true, ui1Var, wa0Var);
    }

    public static Handler s(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ry.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ks t(ks ksVar, ks ksVar2, wa0 wa0Var) {
        wa0Var.getClass();
        if (wa0Var instanceof ye) {
            return ((ye) wa0Var).o(ksVar2, ksVar);
        }
        lt ltVarE = ksVar2.e();
        return ltVarE == d40.e ? new yi0(ksVar2, ksVar, wa0Var) : new zi0(ksVar2, ltVarE, wa0Var, ksVar);
    }

    public static final void u(w6 w6Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            u(w6Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            w6Var.a.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void v(jo0 jo0Var) {
        kz1 kz1Var = jo0Var.e;
        if (kz1Var != null) {
            jo0Var.v.i(az1.a((az1) jo0Var.d.f, null, 0L, 3));
            gz1 gz1Var = kz1Var.a;
            AtomicReference atomicReference = gz1Var.b;
            while (true) {
                if (atomicReference.compareAndSet(kz1Var, null)) {
                    gz1Var.a.g();
                    break;
                } else if (atomicReference.get() != kz1Var) {
                    break;
                }
            }
        }
        jo0Var.e = null;
    }

    public static long w(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    lr.l(i6);
                    yc.j();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return lr.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long x(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    lr.l(i6);
                    yc.j();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return lr.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final p60 y(iw0 iw0Var, jw0 jw0Var) {
        int iOrdinal = jw0Var.ordinal();
        if (iOrdinal == 0) {
            return iw0Var.f();
        }
        if (iOrdinal == 1) {
            return iw0Var.a();
        }
        if (iOrdinal == 2) {
            return iw0Var.d();
        }
        if (iOrdinal == 3) {
            return iw0Var.c();
        }
        if (iOrdinal == 4) {
            return iw0Var.e();
        }
        if (iOrdinal == 5) {
            return iw0Var.b();
        }
        ez1.a();
        return null;
    }

    public static final ye0 z() {
        ye0 ye0Var = b;
        if (ye0Var != null) {
            return ye0Var;
        }
        xe0 xe0Var = new xe0("Rounded.DriveFileRenameOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = a52.a;
        long j = vl.b;
        uq1 uq1Var = new uq1(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new f51(15.0f, 16.0f));
        arrayList.add(new m51(-4.0f, 4.0f));
        arrayList.add(new l51(8.0f));
        arrayList.add(new k51(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f));
        arrayList.add(new r51(0.0f));
        arrayList.add(new k51(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
        arrayList.add(new d51(15.0f));
        b51 b51Var = b51.c;
        arrayList.add(b51Var);
        xe0.a(xe0Var, arrayList, uq1Var);
        uq1 uq1Var2 = new uq1(j);
        y41 y41Var = new y41(0);
        y41Var.y(12.06f, 7.19f);
        y41Var.x(-8.77f, 8.77f);
        y41Var.q(3.11f, 16.14f, 3.0f, 16.4f, 3.0f, 16.66f);
        y41Var.E(19.0f);
        y41Var.r(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        y41Var.v(2.34f);
        y41Var.r(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f);
        y41Var.x(8.77f, -8.77f);
        y41Var.w(12.06f, 7.19f);
        y41Var.m();
        xe0.a(xe0Var, (ArrayList) y41Var.f, uq1Var2);
        uq1 uq1Var3 = new uq1(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new f51(18.71f, 8.04f));
        arrayList2.add(new k51(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f));
        arrayList2.add(new m51(-2.34f, -2.34f));
        arrayList2.add(new k51(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f));
        arrayList2.add(new m51(-1.83f, 1.83f));
        arrayList2.add(new m51(3.75f, 3.75f));
        arrayList2.add(new e51(18.71f, 8.04f));
        arrayList2.add(b51Var);
        xe0.a(xe0Var, arrayList2, uq1Var3);
        ye0 ye0VarB = xe0Var.b();
        b = ye0VarB;
        return ye0VarB;
    }
}
