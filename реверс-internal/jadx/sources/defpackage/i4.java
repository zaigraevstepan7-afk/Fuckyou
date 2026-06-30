package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.reddit.secondpage.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends qt0 {
    public final /* synthetic */ m4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(m4 m4Var) {
        super(2);
        this.i = m4Var;
    }

    @Override // defpackage.qt0
    public final void j(int i, m1 m1Var, String str, Bundle bundle) {
        this.i.e(i, m1Var, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Type inference failed for: r2v84, types: [f40] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v79, types: [java.util.ArrayList] */
    @Override // defpackage.qt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m1 k(int i) {
        AccessibilityManager accessibilityManager;
        dr1 dr1Var;
        m4 m4Var;
        h4 h4Var;
        fx0 fx0Var;
        rl1 rl1Var;
        nl1 nl1Var;
        yf1 yf1Var;
        ql0 ql0Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        m1 m1Var;
        zx0 zx0Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        yf1 yf1Var2;
        int i2;
        m1 m1Var2;
        Object objG;
        int i3;
        Object objG2;
        Object objG3;
        m4 m4Var2;
        boolean z;
        rl1 rl1VarL;
        boolean z2;
        Object objG4;
        h4 h4Var2;
        ql0 ql0Var2;
        boolean zO;
        boolean zBooleanValue;
        ?? arrayList;
        ?? arrayList2;
        int i4;
        int i5;
        boolean zO2;
        rl1 rl1Var2;
        int i6;
        m4 m4Var3 = this.i;
        AccessibilityManager accessibilityManager2 = m4Var3.k;
        h4 h4Var3 = m4Var3.h;
        if (h4Var3.getComposeViewContext().c().g().c == qo0.e) {
            m1Var2 = !accessibilityManager2.isEnabled() ? new m1(AccessibilityNodeInfo.obtain()) : null;
            m4Var2 = m4Var3;
            i3 = i;
        } else {
            tl1 tl1Var = (tl1) m4Var3.m().b(i);
            if (tl1Var == null) {
                if (!accessibilityManager2.isEnabled()) {
                    m1Var2 = new m1(AccessibilityNodeInfo.obtain());
                }
                m4Var2 = m4Var3;
                i3 = i;
            } else {
                rl1 rl1Var3 = tl1Var.a;
                nl1 nl1VarK = rl1Var3.k();
                ql0 ql0Var3 = rl1Var3.c;
                Object objG5 = nl1VarK.e.g(vl1.o);
                if (objG5 == null) {
                    objG5 = null;
                }
                boolean zO3 = xi0.o(objG5, Boolean.TRUE);
                if (!zO3) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    m1 m1Var3 = new m1(accessibilityNodeInfoObtain);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 34) {
                        v0.j(accessibilityNodeInfoObtain, zO3);
                    } else {
                        m1Var3.f(64, zO3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = h4Var3.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        m1Var3.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        rl1 rl1VarL2 = rl1Var3.l();
                        Integer numValueOf = rl1VarL2 != null ? Integer.valueOf(rl1VarL2.f) : null;
                        if (numValueOf == null) {
                            ng0.c("semanticsNode " + i + " has null parent");
                            yc.j();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == h4Var3.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        m1Var3.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(h4Var3, iIntValue);
                    }
                    m1Var3.c = i;
                    accessibilityNodeInfoObtain.setSource(h4Var3, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(m4Var3.f(tl1Var));
                    fx0 fx0Var2 = m4Var3.O;
                    dr1 dr1Var2 = m4Var3.w;
                    Resources resources = h4Var3.getContext().getResources();
                    m1Var3.g("android.view.View");
                    nl1 nl1Var2 = rl1Var3.d;
                    zx0 zx0Var2 = nl1Var2.e;
                    if (zx0Var2.c(vl1.G)) {
                        m1Var3.g("android.widget.EditText");
                    }
                    if (zx0Var2.c(vl1.C)) {
                        m1Var3.g("android.widget.TextView");
                    }
                    Object objG6 = zx0Var2.g(vl1.z);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    yf1 yf1Var3 = (yf1) objG6;
                    if (yf1Var3 != null) {
                        int i8 = yf1Var3.a;
                        if (rl1Var3.o()) {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            dr1Var = dr1Var2;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            dr1Var = dr1Var2;
                            if (rl1.j(4, rl1Var3).isEmpty()) {
                            }
                        }
                        if (i8 == i6) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i8 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            String strH = xc.H(i8);
                            if (i8 != 5 || rl1Var3.q() || nl1Var2.g) {
                                m1Var3.g(strH);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        dr1Var = dr1Var2;
                    }
                    accessibilityNodeInfoObtain.setPackageName(h4Var3.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(nu0.z(rl1Var3));
                    boolean zH = i7 >= 34 ? v0.h(accessibilityManager) : true;
                    List listJ = rl1.j(4, rl1Var3);
                    int size = listJ.size();
                    boolean z3 = zH;
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        rl1 rl1Var4 = (rl1) listJ.get(i10);
                        List list = listJ;
                        mh0 mh0VarM = m4Var3.m();
                        int i12 = rl1Var4.f;
                        if (mh0VarM.a(i12)) {
                            h4Var3.getAndroidViewsHandler();
                            if (i12 == -1) {
                                i5 = i10;
                            } else {
                                tl1 tl1Var2 = (tl1) m4Var3.m().b(i12);
                                if (tl1Var2 == null || (rl1Var2 = tl1Var2.a) == null) {
                                    i5 = i10;
                                    zO2 = false;
                                } else {
                                    i5 = i10;
                                    Object objG7 = rl1Var2.k().e.g(vl1.o);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    zO2 = xi0.o(objG7, Boolean.TRUE);
                                }
                                if (z3 || !zO2) {
                                    accessibilityNodeInfoObtain.addChild(h4Var3, i12);
                                }
                                fx0Var2.f(i12, i9);
                                i9++;
                            }
                        }
                        i10 = i5 + 1;
                        listJ = list;
                        size = i11;
                    }
                    int i13 = m4Var3.o;
                    AccessibilityNodeInfo accessibilityNodeInfo4 = m1Var3.a;
                    if (i == i13) {
                        accessibilityNodeInfo4.setAccessibilityFocused(true);
                        m1Var3.a(g1.e);
                    } else {
                        accessibilityNodeInfo4.setAccessibilityFocused(false);
                        m1Var3.a(g1.d);
                    }
                    hb hbVarQ = pv.q(rl1Var3);
                    if (hbVarQ != null) {
                        h4Var3.getFontFamilyResolver();
                        hx density = h4Var3.getDensity();
                        oc ocVar = m4Var3.K;
                        h4Var = h4Var3;
                        String str = hbVarQ.f;
                        ql0Var = ql0Var3;
                        List list2 = hbVarQ.e;
                        SpannableString spannableString2 = new SpannableString(str);
                        ArrayList arrayList3 = hbVarQ.g;
                        if (arrayList3 != null) {
                            int size2 = arrayList3.size();
                            m4Var = m4Var3;
                            int i14 = 0;
                            while (i14 < size2) {
                                int i15 = i14;
                                gb gbVar = (gb) arrayList3.get(i14);
                                ArrayList arrayList4 = arrayList3;
                                zq1 zq1Var = (zq1) gbVar.a;
                                int i16 = size2;
                                int i17 = gbVar.b;
                                int i18 = gbVar.c;
                                fx0 fx0Var3 = fx0Var2;
                                nl1 nl1Var3 = nl1Var2;
                                yf1 yf1Var4 = yf1Var3;
                                long jB = zq1Var.a.b();
                                rl1 rl1Var5 = rl1Var3;
                                long j = zq1Var.b;
                                aa0 aa0Var = zq1Var.c;
                                y90 y90Var = zq1Var.d;
                                dz1 dz1Var = zq1Var.j;
                                as0 as0Var = zq1Var.k;
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                m1 m1Var4 = m1Var3;
                                long j2 = zq1Var.l;
                                ax1 ax1Var = zq1Var.m;
                                cz1 xmVar = zq1Var.a;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                                zx0 zx0Var3 = zx0Var2;
                                if (!vl.c(jB, xmVar.b())) {
                                    xmVar = jB != 16 ? new xm(jB) : bz1.a;
                                }
                                uc1.C(spannableString2, xmVar.b(), i17, i18);
                                SpannableString spannableString3 = spannableString2;
                                uc1.D(spannableString3, j, density, i17, i18);
                                if (aa0Var == null && y90Var == null) {
                                    i4 = 33;
                                } else {
                                    StyleSpan styleSpan = new StyleSpan(s22.t(aa0Var == null ? aa0.g : aa0Var, y90Var != null ? y90Var.a : 0));
                                    i4 = 33;
                                    spannableString3.setSpan(styleSpan, i17, i18, 33);
                                }
                                if (ax1Var != null) {
                                    int i19 = ax1Var.a;
                                    if ((i19 | 1) == i19) {
                                        spannableString3.setSpan(new UnderlineSpan(), i17, i18, i4);
                                    }
                                    if ((i19 | 2) == i19) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i17, i18, i4);
                                    }
                                }
                                if (dz1Var != null) {
                                    spannableString3.setSpan(new ScaleXSpan(dz1Var.a), i17, i18, i4);
                                }
                                uc1.E(spannableString3, as0Var, i17, i18);
                                if (j2 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(lk.l0(j2)), i17, i18, i4);
                                }
                                spannableString2 = spannableString3;
                                i14 = i15 + 1;
                                zx0Var2 = zx0Var3;
                                arrayList3 = arrayList4;
                                size2 = i16;
                                fx0Var2 = fx0Var3;
                                nl1Var2 = nl1Var3;
                                yf1Var3 = yf1Var4;
                                rl1Var3 = rl1Var5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                m1Var3 = m1Var4;
                                accessibilityNodeInfo4 = accessibilityNodeInfo6;
                            }
                        } else {
                            m4Var = m4Var3;
                        }
                        fx0Var = fx0Var2;
                        rl1Var = rl1Var3;
                        nl1Var = nl1Var2;
                        yf1Var = yf1Var3;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        m1Var = m1Var3;
                        SpannableString spannableString4 = spannableString2;
                        zx0Var = zx0Var2;
                        int length = str.length();
                        ?? arrayList5 = f40.e;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list2.get(i20);
                                gb gbVar2 = (gb) obj;
                                if ((gbVar2.a instanceof t52) && ib.b(0, length, gbVar2.b, gbVar2.c)) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = arrayList5;
                        }
                        int size4 = arrayList.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            gb gbVar3 = (gb) arrayList.get(i21);
                            t52 t52Var = (t52) gbVar3.a;
                            int i22 = gbVar3.b;
                            int i23 = gbVar3.c;
                            if (!(t52Var instanceof t52)) {
                                ez1.a();
                                return null;
                            }
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(t52Var.a).build(), i22, i23, 33);
                        }
                        int length2 = str.length();
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i24 = 0; i24 < size5; i24++) {
                                Object obj2 = list2.get(i24);
                                gb gbVar4 = (gb) obj2;
                                if ((gbVar4.a instanceof m42) && ib.b(0, length2, gbVar4.b, gbVar4.c)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = arrayList5;
                        }
                        int size6 = arrayList2.size();
                        for (int i25 = 0; i25 < size6; i25++) {
                            gb gbVar5 = (gb) arrayList2.get(i25);
                            m42 m42Var = (m42) gbVar5.a;
                            int i26 = gbVar5.b;
                            int i27 = gbVar5.c;
                            WeakHashMap weakHashMap = (WeakHashMap) ocVar.a;
                            Object uRLSpan = weakHashMap.get(m42Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(m42Var.a);
                                weakHashMap.put(m42Var, uRLSpan);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan, i26, i27, 33);
                        }
                        int length3 = str.length();
                        if (list2 != null) {
                            arrayList5 = new ArrayList(list2.size());
                            int size7 = list2.size();
                            for (int i28 = 0; i28 < size7; i28++) {
                                Object obj3 = list2.get(i28);
                                gb gbVar6 = (gb) obj3;
                                if ((gbVar6.a instanceof xp0) && ib.b(0, length3, gbVar6.b, gbVar6.c)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        int size8 = arrayList5.size();
                        for (int i29 = 0; i29 < size8; i29++) {
                            gb gbVar7 = (gb) arrayList5.get(i29);
                            int i30 = gbVar7.b;
                            Object obj4 = gbVar7.a;
                            int i31 = gbVar7.c;
                            if (i30 != i31) {
                                xp0 xp0Var = (xp0) obj4;
                                if (xp0Var instanceof wp0) {
                                    obj4.getClass();
                                    wp0 wp0Var = (wp0) obj4;
                                    gb gbVar8 = new gb(i30, i31, wp0Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) ocVar.b;
                                    Object uRLSpan2 = weakHashMap2.get(gbVar8);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(wp0Var.a);
                                        weakHashMap2.put(gbVar8, uRLSpan2);
                                    }
                                    spannableString4.setSpan((URLSpan) uRLSpan2, i30, i31, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) ocVar.c;
                                    Object soVar = weakHashMap3.get(gbVar7);
                                    if (soVar == null) {
                                        soVar = new so(xp0Var);
                                        weakHashMap3.put(gbVar7, soVar);
                                    }
                                    spannableString4.setSpan((ClickableSpan) soVar, i30, i31, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) m4.J(spannableString4);
                        accessibilityNodeInfo2 = accessibilityNodeInfo7;
                    } else {
                        m4Var = m4Var3;
                        h4Var = h4Var3;
                        fx0Var = fx0Var2;
                        rl1Var = rl1Var3;
                        nl1Var = nl1Var2;
                        yf1Var = yf1Var3;
                        ql0Var = ql0Var3;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        m1Var = m1Var3;
                        zx0Var = zx0Var2;
                        spannableString = null;
                        accessibilityNodeInfo2 = accessibilityNodeInfo4;
                    }
                    accessibilityNodeInfo2.setText(spannableString);
                    zl1 zl1Var = vl1.M;
                    if (zx0Var.c(zl1Var)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        Object objG8 = zx0Var.g(zl1Var);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objG8);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    rl1 rl1Var6 = rl1Var;
                    String strP = pv.p(rl1Var6, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        h1.h(accessibilityNodeInfo2, strP);
                    } else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strP);
                    }
                    accessibilityNodeInfo3.setCheckable(pv.o(rl1Var6));
                    Object objG9 = zx0Var.g(vl1.K);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    e12 e12Var = (e12) objG9;
                    if (e12Var != null) {
                        if (e12Var == e12.e) {
                            accessibilityNodeInfo2.setChecked(true);
                        } else if (e12Var == e12.f) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    Object objG10 = zx0Var.g(vl1.J);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    Boolean bool = (Boolean) objG10;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (yf1Var == null) {
                            yf1Var2 = yf1Var;
                            i2 = 4;
                        } else {
                            yf1Var2 = yf1Var;
                            i2 = 4;
                            if (yf1Var2.a == 4) {
                                accessibilityNodeInfo3.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo2.setChecked(zBooleanValue2);
                    } else {
                        yf1Var2 = yf1Var;
                        i2 = 4;
                    }
                    nl1 nl1Var4 = nl1Var;
                    if (!nl1Var4.g || rl1.j(i2, rl1Var6).isEmpty()) {
                        Object objG11 = zx0Var.g(vl1.a);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        List list3 = (List) objG11;
                        accessibilityNodeInfo3.setContentDescription(list3 != null ? (String) pl.d0(list3) : null);
                    }
                    Object objG12 = zx0Var.g(vl1.A);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    String str2 = (String) objG12;
                    if (str2 != null) {
                        rl1 rl1VarL3 = rl1Var6;
                        while (true) {
                            if (rl1VarL3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            nl1 nl1Var5 = rl1VarL3.d;
                            zl1 zl1Var2 = wl1.a;
                            if (nl1Var5.e.c(zl1Var2)) {
                                zBooleanValue = ((Boolean) nl1Var5.c(zl1Var2)).booleanValue();
                                break;
                            }
                            rl1VarL3 = rl1VarL3.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str2);
                        }
                    }
                    Object objG13 = zx0Var.g(vl1.h);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    if (((t32) objG13) == null) {
                        m1Var2 = m1Var;
                        objG = zx0Var.g(vl1.i);
                        if (objG == null) {
                            objG = null;
                        }
                        if (((t32) objG) != null) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                accessibilityNodeInfo3.setTextEntryKey(true);
                            } else {
                                m1Var2.f(8, true);
                            }
                        }
                        i3 = i;
                        if (i3 != -1) {
                            int iD = fx0Var.d(rl1Var6.f);
                            if (iD != -1) {
                                accessibilityNodeInfo3.setDrawingOrder(iD);
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo3.setPassword(zx0Var.c(vl1.L));
                        objG2 = zx0Var.g(vl1.O);
                        if (objG2 == null) {
                            objG2 = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(xi0.o(objG2, bool2));
                        objG3 = zx0Var.g(vl1.P);
                        if (objG3 == null) {
                            objG3 = null;
                        }
                        Integer num = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(pv.e(rl1Var6));
                        zl1 zl1Var3 = vl1.l;
                        accessibilityNodeInfo3.setFocusable(zx0Var.c(zl1Var3));
                        if (accessibilityNodeInfo3.isFocusable()) {
                            accessibilityNodeInfo3.setFocused(((Boolean) nl1Var4.c(zl1Var3)).booleanValue());
                            if (accessibilityNodeInfo3.isFocused()) {
                                accessibilityNodeInfo2.addAction(2);
                                m4Var2 = m4Var;
                                m4Var2.p = i3;
                            } else {
                                m4Var2 = m4Var;
                                z = true;
                                accessibilityNodeInfo2.addAction(1);
                                accessibilityNodeInfo2.setVisibleToUser(nu0.y(rl1Var6) ^ z);
                                if (rl1Var6.o()) {
                                    rl1VarL = rl1Var6;
                                } else {
                                    rl1VarL = rl1Var6.l();
                                    rl1VarL.getClass();
                                }
                                if (rl1VarL.m().f()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    accessibilityNodeInfo2.setVisibleToUser(false);
                                }
                                objG4 = zx0Var.g(vl1.k);
                                if (objG4 == null) {
                                    objG4 = null;
                                }
                                if (objG4 == null) {
                                    yc.d();
                                    return null;
                                }
                                accessibilityNodeInfo2.setClickable(z2);
                                Object objG14 = zx0Var.g(ml1.b);
                                if (objG14 == null) {
                                    objG14 = null;
                                }
                                r0 r0Var = (r0) objG14;
                                if (r0Var != null) {
                                    Object objG15 = zx0Var.g(vl1.J);
                                    if (objG15 == null) {
                                        objG15 = null;
                                    }
                                    boolean zO4 = xi0.o(objG15, bool2);
                                    boolean z4 = (yf1Var2 != null && yf1Var2.a == 4) || (yf1Var2 != null && yf1Var2.a == 3);
                                    accessibilityNodeInfo2.setClickable(!z4 || (z4 && !zO4));
                                    if (pv.e(rl1Var6) && accessibilityNodeInfo3.isClickable()) {
                                        m1Var2.a(new g1(r0Var.a, 16));
                                    }
                                }
                                accessibilityNodeInfo2.setLongClickable(false);
                                Object objG16 = zx0Var.g(ml1.c);
                                if (objG16 == null) {
                                    objG16 = null;
                                }
                                r0 r0Var2 = (r0) objG16;
                                if (r0Var2 != null) {
                                    accessibilityNodeInfo2.setLongClickable(true);
                                    if (pv.e(rl1Var6)) {
                                        m1Var2.a(new g1(r0Var2.a, 32));
                                    }
                                }
                                r0 r0Var3 = (r0) uc1.m(nl1Var4, ml1.q);
                                if (r0Var3 != null) {
                                    m1Var2.a(new g1(r0Var3.a, 16384));
                                }
                                if (pv.e(rl1Var6)) {
                                    r0 r0Var4 = (r0) uc1.m(nl1Var4, ml1.k);
                                    if (r0Var4 != null) {
                                        m1Var2.a(new g1(r0Var4.a, 2097152));
                                    }
                                    r0 r0Var5 = (r0) uc1.m(nl1Var4, ml1.p);
                                    if (r0Var5 != null) {
                                        m1Var2.a(new g1(r0Var5.a, android.R.id.accessibilityActionImeEnter));
                                    }
                                    r0 r0Var6 = (r0) uc1.m(nl1Var4, ml1.r);
                                    if (r0Var6 != null) {
                                        m1Var2.a(new g1(r0Var6.a, 65536));
                                    }
                                    r0 r0Var7 = (r0) uc1.m(nl1Var4, ml1.s);
                                    if (r0Var7 != null && accessibilityNodeInfo3.isFocused()) {
                                        ClipDescription primaryClipDescription = ((xg0) h4Var.getClipboardManager()).t().getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            m1Var2.a(new g1(r0Var7.a, 32768));
                                        }
                                    }
                                }
                                String strN = m4.n(rl1Var6);
                                if (strN != null && strN.length() != 0) {
                                    accessibilityNodeInfo3.setTextSelection(m4Var2.l(rl1Var6), m4Var2.k(rl1Var6));
                                    r0 r0Var8 = (r0) uc1.m(nl1Var4, ml1.j);
                                    m1Var2.a(new g1(r0Var8 != null ? r0Var8.a : null, 131072));
                                    accessibilityNodeInfo2.addAction(256);
                                    accessibilityNodeInfo2.addAction(512);
                                    accessibilityNodeInfo2.setMovementGranularities(11);
                                    List list4 = (List) uc1.m(nl1Var4, vl1.a);
                                    if ((list4 == null || list4.isEmpty()) && zx0Var.c(ml1.a) && (!zx0Var.c(vl1.G) || xi0.o(uc1.m(nl1Var4, zl1Var3), bool2))) {
                                        ql0 ql0VarU = ql0Var.u();
                                        while (true) {
                                            if (ql0VarU == null) {
                                                ql0VarU = null;
                                                break;
                                            }
                                            nl1 nl1VarW = ql0VarU.w();
                                            if (nl1VarW != null && nl1VarW.g) {
                                                if (nl1VarW.e.c(vl1.G)) {
                                                    break;
                                                }
                                            }
                                            ql0VarU = ql0VarU.u();
                                        }
                                        if (ql0VarU == null) {
                                            accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                        } else {
                                            nl1 nl1VarW2 = ql0VarU.w();
                                            if (nl1VarW2 != null) {
                                                Object objG17 = nl1VarW2.e.g(vl1.l);
                                                if (objG17 == null) {
                                                    objG17 = null;
                                                }
                                                zO = xi0.o(objG17, Boolean.TRUE);
                                            } else {
                                                zO = false;
                                            }
                                            if (zO) {
                                            }
                                        }
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add("androidx.compose.ui.semantics.id");
                                CharSequence charSequenceE = m1Var2.e();
                                if (charSequenceE != null && charSequenceE.length() != 0 && zx0Var.c(ml1.a)) {
                                    arrayList6.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (zx0Var.c(vl1.A)) {
                                    arrayList6.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (zx0Var.c(vl1.Q)) {
                                    arrayList6.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList6.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList6.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList6.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                accessibilityNodeInfo3.setAvailableExtraData(arrayList6);
                                fb1 fb1Var = (fb1) uc1.m(nl1Var4, vl1.c);
                                if (fb1Var != null) {
                                    float f = fb1Var.a;
                                    nl1 nl1VarN = rl1Var6.n();
                                    zl1 zl1Var4 = ml1.i;
                                    if (nl1VarN.e.c(zl1Var4)) {
                                        m1Var2.g("android.widget.SeekBar");
                                    } else {
                                        m1Var2.g("android.widget.ProgressBar");
                                    }
                                    fb1 fb1Var2 = fb1.c;
                                    if (fb1Var != fb1.c) {
                                        accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new l1(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fb1Var.a().a).floatValue(), Float.valueOf(fb1Var.a().b).floatValue(), f)).a);
                                    }
                                    if (rl1Var6.n().e.c(zl1Var4) && pv.e(rl1Var6)) {
                                        float fFloatValue = Float.valueOf(fb1Var.a().b).floatValue();
                                        float fFloatValue2 = Float.valueOf(fb1Var.a().a).floatValue();
                                        if (fFloatValue < fFloatValue2) {
                                            fFloatValue = fFloatValue2;
                                        }
                                        if (f < fFloatValue) {
                                            m1Var2.a(g1.f);
                                        }
                                        float fFloatValue3 = Float.valueOf(fb1Var.a().a).floatValue();
                                        float fFloatValue4 = Float.valueOf(fb1Var.a().b).floatValue();
                                        if (fFloatValue3 > fFloatValue4) {
                                            fFloatValue3 = fFloatValue4;
                                        }
                                        if (f > fFloatValue3) {
                                            m1Var2.a(g1.g);
                                        }
                                    }
                                }
                                c2.i(m1Var2, rl1Var6);
                                Object objG18 = rl1Var6.k().e.g(vl1.f);
                                if (objG18 == null) {
                                    objG18 = null;
                                }
                                ol olVar = (ol) objG18;
                                if (olVar != null) {
                                    accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(olVar.a, olVar.b, false, 0));
                                } else {
                                    ArrayList arrayList7 = new ArrayList();
                                    Object objG19 = rl1Var6.k().e.g(vl1.e);
                                    if (objG19 == null) {
                                        objG19 = null;
                                    }
                                    if (objG19 != null) {
                                        List listJ2 = rl1.j(4, rl1Var6);
                                        int size9 = listJ2.size();
                                        for (int i32 = 0; i32 < size9; i32++) {
                                            rl1 rl1Var7 = (rl1) listJ2.get(i32);
                                            if (rl1Var7.k().e.c(vl1.J)) {
                                                arrayList7.add(rl1Var7);
                                            }
                                        }
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        boolean zM = bk.m(arrayList7);
                                        accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM ? 1 : arrayList7.size(), zM ? arrayList7.size() : 1, false, 0));
                                    }
                                }
                                bk.Y(m1Var2, rl1Var6);
                                wi1 wi1Var = (wi1) uc1.m(rl1Var6.n(), vl1.v);
                                r0 r0Var9 = (r0) uc1.m(rl1Var6.n(), ml1.d);
                                if (wi1Var != null && r0Var9 != null) {
                                    Object objG20 = rl1Var6.k().e.g(vl1.f);
                                    if (objG20 == null) {
                                        objG20 = null;
                                    }
                                    if (objG20 == null) {
                                        Object objG21 = rl1Var6.k().e.g(vl1.e);
                                        if (objG21 == null) {
                                            objG21 = null;
                                        }
                                        if (objG21 == null) {
                                            m1Var2.g("android.widget.HorizontalScrollView");
                                        }
                                    }
                                    if (((Number) wi1Var.b.a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (pv.e(rl1Var6)) {
                                        boolean zT = m4.t(wi1Var);
                                        al0 al0Var = al0.f;
                                        if (zT) {
                                            m1Var2.a(g1.f);
                                            ql0Var2 = ql0Var;
                                            m1Var2.a(ql0Var2.C == al0Var ? g1.i : g1.k);
                                        } else {
                                            ql0Var2 = ql0Var;
                                        }
                                        if (m4.s(wi1Var)) {
                                            m1Var2.a(g1.g);
                                            m1Var2.a(ql0Var2.C == al0Var ? g1.k : g1.i);
                                        }
                                    }
                                }
                                wi1 wi1Var2 = (wi1) uc1.m(rl1Var6.n(), vl1.w);
                                if (wi1Var2 != null && r0Var9 != null) {
                                    Object objG22 = rl1Var6.k().e.g(vl1.f);
                                    if (objG22 == null) {
                                        objG22 = null;
                                    }
                                    if (objG22 == null) {
                                        Object objG23 = rl1Var6.k().e.g(vl1.e);
                                        if (objG23 == null) {
                                            objG23 = null;
                                        }
                                        if (objG23 == null) {
                                            m1Var2.g("android.widget.ScrollView");
                                        }
                                    }
                                    if (((Number) wi1Var2.b.a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (pv.e(rl1Var6)) {
                                        if (m4.t(wi1Var2)) {
                                            m1Var2.a(g1.f);
                                            m1Var2.a(g1.j);
                                        }
                                        if (m4.s(wi1Var2)) {
                                            m1Var2.a(g1.g);
                                            m1Var2.a(g1.h);
                                        }
                                    }
                                }
                                int i33 = Build.VERSION.SDK_INT;
                                if (i33 >= 29) {
                                    u4.d(m1Var2, rl1Var6);
                                }
                                CharSequence charSequence = (CharSequence) uc1.m(rl1Var6.n(), vl1.d);
                                if (i33 >= 28) {
                                    accessibilityNodeInfo2.setPaneTitle(charSequence);
                                } else {
                                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (pv.e(rl1Var6)) {
                                    r0 r0Var10 = (r0) uc1.m(rl1Var6.n(), ml1.t);
                                    if (r0Var10 != null) {
                                        m1Var2.a(new g1(r0Var10.a, 262144));
                                    }
                                    r0 r0Var11 = (r0) uc1.m(rl1Var6.n(), ml1.u);
                                    if (r0Var11 != null) {
                                        m1Var2.a(new g1(r0Var11.a, 524288));
                                    }
                                    r0 r0Var12 = (r0) uc1.m(rl1Var6.n(), ml1.v);
                                    if (r0Var12 != null) {
                                        m1Var2.a(new g1(r0Var12.a, 1048576));
                                    }
                                    nl1 nl1VarN2 = rl1Var6.n();
                                    zl1 zl1Var5 = ml1.x;
                                    if (nl1VarN2.e.c(zl1Var5)) {
                                        List list5 = (List) rl1Var6.n().c(zl1Var5);
                                        int size10 = list5.size();
                                        gx0 gx0Var = m4.T;
                                        int i34 = gx0Var.b;
                                        if (size10 >= i34) {
                                            yc.l(s91.h(i34, "Can't have more than ", " custom actions for one widget"));
                                            return null;
                                        }
                                        dr1 dr1Var3 = new dr1();
                                        ox0 ox0VarA = r01.a();
                                        dr1 dr1Var4 = dr1Var;
                                        if (wi0.r(dr1Var4.g, i3, dr1Var4.e) >= 0) {
                                            ox0 ox0Var = (ox0) dr1Var4.b(i3);
                                            int[] iArr = gx0Var.a;
                                            int i35 = gx0Var.b;
                                            int[] iArrCopyOf = new int[16];
                                            int i36 = 0;
                                            int i37 = 0;
                                            while (i36 < i35) {
                                                int i38 = iArr[i36];
                                                int i39 = i35;
                                                int i40 = i37 + 1;
                                                ox0 ox0Var2 = ox0Var;
                                                if (iArrCopyOf.length < i40) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i40, (iArrCopyOf.length * 3) / 2));
                                                }
                                                iArrCopyOf[i37] = i38;
                                                i36++;
                                                i37 = i40;
                                                i35 = i39;
                                                ox0Var = ox0Var2;
                                            }
                                            ox0 ox0Var3 = ox0Var;
                                            ArrayList arrayList8 = new ArrayList();
                                            if (list5.size() > 0) {
                                                s91.t(list5.get(0));
                                                ox0Var3.getClass();
                                                throw null;
                                            }
                                            if (arrayList8.size() > 0) {
                                                s91.t(arrayList8.get(0));
                                                if (i37 <= 0) {
                                                    yc.o("Index must be between 0 and size");
                                                    return null;
                                                }
                                                int i41 = iArrCopyOf[0];
                                                throw null;
                                            }
                                        } else if (list5.size() > 0) {
                                            s91.t(list5.get(0));
                                            gx0Var.c(0);
                                            throw null;
                                        }
                                        m4Var2.v.c(i3, dr1Var3);
                                        dr1Var4.c(i3, ox0VarA);
                                    }
                                }
                                boolean zF = pv.f(rl1Var6, resources);
                                if (Build.VERSION.SDK_INT >= 28) {
                                    accessibilityNodeInfo2.setScreenReaderFocusable(zF);
                                } else {
                                    m1Var2.f(1, zF);
                                }
                                int iD2 = m4Var2.G.d(i3);
                                if (iD2 != -1) {
                                    h4Var.getAndroidViewsHandler();
                                    h4Var2 = h4Var;
                                    accessibilityNodeInfo2.setTraversalBefore(h4Var2, iD2);
                                    m4Var2.e(i3, m1Var2, m4Var2.I, null);
                                } else {
                                    h4Var2 = h4Var;
                                }
                                if (m4Var2.H.d(i3) != -1) {
                                    h4Var2.getAndroidViewsHandler();
                                }
                                String str3 = (String) uc1.m(rl1Var6.n(), wl1.b);
                                if (str3 != null) {
                                    m1Var2.g(str3);
                                }
                            }
                        } else {
                            m4Var2 = m4Var;
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(nu0.y(rl1Var6) ^ z);
                        if (rl1Var6.o()) {
                        }
                        if (rl1VarL.m().f()) {
                        }
                        objG4 = zx0Var.g(vl1.k);
                        if (objG4 == null) {
                        }
                        if (objG4 == null) {
                        }
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                        m1Var2 = m1Var;
                        objG = zx0Var.g(vl1.i);
                        if (objG == null) {
                        }
                        if (((t32) objG) != null) {
                        }
                        i3 = i;
                        if (i3 != -1) {
                        }
                        accessibilityNodeInfo3.setPassword(zx0Var.c(vl1.L));
                        objG2 = zx0Var.g(vl1.O);
                        if (objG2 == null) {
                        }
                        Boolean bool22 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(xi0.o(objG2, bool22));
                        objG3 = zx0Var.g(vl1.P);
                        if (objG3 == null) {
                        }
                        Integer num2 = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num2 != null ? num2.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(pv.e(rl1Var6));
                        zl1 zl1Var32 = vl1.l;
                        accessibilityNodeInfo3.setFocusable(zx0Var.c(zl1Var32));
                        if (accessibilityNodeInfo3.isFocusable()) {
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(nu0.y(rl1Var6) ^ z);
                        if (rl1Var6.o()) {
                        }
                        if (rl1VarL.m().f()) {
                        }
                        objG4 = zx0Var.g(vl1.k);
                        if (objG4 == null) {
                        }
                        if (objG4 == null) {
                        }
                    } else {
                        m1Var2 = m1Var;
                        m1Var2.f(2, true);
                        objG = zx0Var.g(vl1.i);
                        if (objG == null) {
                        }
                        if (((t32) objG) != null) {
                        }
                        i3 = i;
                        if (i3 != -1) {
                        }
                        accessibilityNodeInfo3.setPassword(zx0Var.c(vl1.L));
                        objG2 = zx0Var.g(vl1.O);
                        if (objG2 == null) {
                        }
                        Boolean bool222 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(xi0.o(objG2, bool222));
                        objG3 = zx0Var.g(vl1.P);
                        if (objG3 == null) {
                        }
                        Integer num22 = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num22 != null ? num22.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(pv.e(rl1Var6));
                        zl1 zl1Var322 = vl1.l;
                        accessibilityNodeInfo3.setFocusable(zx0Var.c(zl1Var322));
                        if (accessibilityNodeInfo3.isFocusable()) {
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(nu0.y(rl1Var6) ^ z);
                        if (rl1Var6.o()) {
                        }
                        if (rl1VarL.m().f()) {
                        }
                        objG4 = zx0Var.g(vl1.k);
                        if (objG4 == null) {
                        }
                        if (objG4 == null) {
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? v0.h(accessibilityManager2) : true)) {
                    m4Var2 = m4Var3;
                    i3 = i;
                    m1Var2 = null;
                }
            }
        }
        if (m4Var2.s) {
            if (i3 == m4Var2.o) {
                m4Var2.q = m1Var2;
            }
            if (i3 == m4Var2.p) {
                m4Var2.r = m1Var2;
            }
        }
        return m1Var2;
    }

    @Override // defpackage.qt0
    public final m1 p(int i) {
        m4 m4Var = this.i;
        if (i != 1) {
            if (i == 2) {
                return k(m4Var.o);
            }
            yc.p(s91.i("Unknown focus type: ", i));
            return null;
        }
        int i2 = m4Var.p;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return k(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x01b0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    @Override // defpackage.qt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i, int i2, Bundle bundle) {
        rl1 rl1Var;
        int i3;
        w0 w0Var;
        int iL;
        int i4;
        pz1 pz1VarW;
        ha0 ha0Var;
        ha0 ha0Var2;
        ha0 ha0Var3;
        ha0 ha0Var4;
        ha0 ha0Var5;
        ha0 ha0Var6;
        ha0 ha0Var7;
        ha0 ha0Var8;
        ha0 ha0Var9;
        sa0 sa0Var;
        r0 r0Var;
        long jM;
        float f;
        float f2;
        float f3;
        float f4;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        sa0 sa0Var2;
        ha0 ha0Var10;
        long j;
        r0 r0Var2;
        ha0 ha0Var11;
        float fIntBitsToFloat;
        r0 r0Var3;
        ha0 ha0Var12;
        sa0 sa0Var3;
        ha0 ha0Var13;
        ha0 ha0Var14;
        ha0 ha0Var15;
        ha0 ha0Var16;
        m4 m4Var = this.i;
        AccessibilityManager accessibilityManager = m4Var.k;
        Float fValueOf = Float.valueOf(0.0f);
        h4 h4Var = m4Var.h;
        tl1 tl1Var = (tl1) m4Var.m().b(i);
        if (tl1Var != null && (rl1Var = tl1Var.a) != null) {
            ql0 ql0Var = rl1Var.c;
            int i5 = rl1Var.f;
            nl1 nl1Var = rl1Var.d;
            zx0 zx0Var = nl1Var.e;
            Object objG = zx0Var.g(vl1.o);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean z = true;
            if (xi0.o(objG, bool)) {
                if (Build.VERSION.SDK_INT >= 34 ? v0.h(accessibilityManager) : true) {
                }
            } else {
                if (i2 == 64) {
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = m4Var.o) == i) {
                        return false;
                    }
                    if (i3 != Integer.MIN_VALUE) {
                        m4.y(m4Var, i3, 65536, null, 12);
                    }
                    m4Var.o = i;
                    h4Var.invalidate();
                    m4.y(m4Var, i, 32768, null, 12);
                    return true;
                }
                if (i2 == 128) {
                    if (m4Var.o != i) {
                        return false;
                    }
                    m4Var.o = Integer.MIN_VALUE;
                    m4Var.q = null;
                    h4Var.invalidate();
                    m4.y(m4Var, i, 65536, null, 12);
                    return true;
                }
                if (i2 == 256 || i2 == 512) {
                    if (bundle != null) {
                        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        boolean z3 = i2 == 256;
                        Integer num = m4Var.y;
                        if (num == null || i5 != num.intValue()) {
                            m4Var.x = -1;
                            m4Var.y = Integer.valueOf(i5);
                        }
                        String strN = m4.n(rl1Var);
                        if (strN != null && strN.length() != 0) {
                            String strN2 = m4.n(rl1Var);
                            if (strN2 == null || strN2.length() == 0) {
                                w0Var = null;
                                if (w0Var != null) {
                                    int iK = m4Var.k(rl1Var);
                                    if (iK == -1) {
                                        iK = z3 ? 0 : strN.length();
                                    }
                                    int[] iArrA = z3 ? w0Var.a(iK) : w0Var.d(iK);
                                    if (iArrA != null) {
                                        int i7 = iArrA[0];
                                        int i8 = iArrA[1];
                                        if (z2 && !zx0Var.c(vl1.a) && zx0Var.c(vl1.G)) {
                                            iL = m4Var.l(rl1Var);
                                            if (iL == -1) {
                                                iL = z3 ? i7 : i8;
                                            }
                                            i4 = z3 ? i8 : i7;
                                        } else {
                                            iL = z3 ? i8 : i7;
                                            i4 = iL;
                                        }
                                        m4Var.D = new j4(rl1Var, z3 ? 256 : 512, i6, i7, i8, SystemClock.uptimeMillis());
                                        m4Var.E(rl1Var, iL, i4, true);
                                        return true;
                                    }
                                }
                            } else {
                                if (i6 == 1) {
                                    Locale locale = h4Var.getContext().getResources().getConfiguration().locale;
                                    if (x0.e == null) {
                                        x0 x0Var = new x0(0);
                                        x0Var.d = BreakIterator.getCharacterInstance(locale);
                                        x0.e = x0Var;
                                    }
                                    x0 x0Var2 = x0.e;
                                    x0Var2.getClass();
                                    x0Var2.f(strN2);
                                    w0Var = x0Var2;
                                } else if (i6 == 2) {
                                    Locale locale2 = h4Var.getContext().getResources().getConfiguration().locale;
                                    if (x0.f == null) {
                                        x0 x0Var3 = new x0(1);
                                        x0Var3.d = BreakIterator.getWordInstance(locale2);
                                        x0.f = x0Var3;
                                    }
                                    x0 x0Var4 = x0.f;
                                    x0Var4.getClass();
                                    x0Var4.f(strN2);
                                    w0Var = x0Var4;
                                } else if (i6 == 4) {
                                    if (zx0Var.c(ml1.a) && (pz1VarW = xc.w(nl1Var)) != null) {
                                        if (i6 == 4) {
                                            if (x0.g == null) {
                                                x0.g = new x0(2);
                                            }
                                            x0 x0Var5 = x0.g;
                                            x0Var5.getClass();
                                            x0Var5.a = strN2;
                                            x0Var5.d = pz1VarW;
                                            w0Var = x0Var5;
                                        } else {
                                            if (y0.e == null) {
                                                y0 y0Var = new y0();
                                                new Rect();
                                                y0.e = y0Var;
                                            }
                                            y0 y0Var2 = y0.e;
                                            y0Var2.getClass();
                                            y0Var2.a = strN2;
                                            y0Var2.c = pz1VarW;
                                            y0Var2.d = rl1Var;
                                            w0Var = y0Var2;
                                        }
                                    }
                                } else if (i6 == 8) {
                                    if (z0.c == null) {
                                        z0.c = new z0();
                                    }
                                    z0 z0Var = z0.c;
                                    z0Var.getClass();
                                    z0Var.a = strN2;
                                    w0Var = z0Var;
                                } else if (i6 != 16) {
                                }
                                if (w0Var != null) {
                                }
                            }
                        }
                    }
                } else if (i2 == 16384) {
                    Object objG2 = zx0Var.g(ml1.q);
                    r0 r0Var4 = (r0) (objG2 == null ? null : objG2);
                    if (r0Var4 != null && (ha0Var = (ha0) r0Var4.b) != null) {
                        return ((Boolean) ha0Var.a()).booleanValue();
                    }
                } else {
                    if (i2 == 131072) {
                        boolean zE = m4Var.E(rl1Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                        if (zE) {
                            m4.y(m4Var, m4Var.u(i5), 0, null, 12);
                        }
                        return zE;
                    }
                    if (pv.e(rl1Var)) {
                        if (i2 == 1) {
                            if (h4Var.isInTouchMode()) {
                                h4Var.requestFocusFromTouch();
                            }
                            Object objG3 = zx0Var.g(ml1.w);
                            r0 r0Var5 = (r0) (objG3 == null ? null : objG3);
                            if (r0Var5 != null && (ha0Var2 = (ha0) r0Var5.b) != null) {
                                return ((Boolean) ha0Var2.a()).booleanValue();
                            }
                        } else if (i2 != 2) {
                            al0 al0Var = al0.f;
                            switch (i2) {
                                case 16:
                                    Object objG4 = zx0Var.g(ml1.b);
                                    if (objG4 == null) {
                                        objG4 = null;
                                    }
                                    r0 r0Var6 = (r0) objG4;
                                    Boolean bool2 = (r0Var6 == null || (ha0Var3 = (ha0) r0Var6.b) == null) ? null : (Boolean) ha0Var3.a();
                                    m4.y(m4Var, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object objG5 = zx0Var.g(ml1.c);
                                    r0 r0Var7 = (r0) (objG5 == null ? null : objG5);
                                    if (r0Var7 != null && (ha0Var4 = (ha0) r0Var7.b) != null) {
                                        return ((Boolean) ha0Var4.a()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z4 = i2 == 4096;
                                    boolean z5 = i2 == 8192;
                                    boolean z6 = i2 == 16908345;
                                    boolean z7 = i2 == 16908347;
                                    boolean z8 = i2 == 16908344;
                                    boolean z9 = i2 == 16908346;
                                    boolean z10 = z6 || z7 || z4 || z5;
                                    if (!z8 && !z9 && !z4 && !z5) {
                                        z = false;
                                    }
                                    if (z4 || z5) {
                                        Object objG6 = zx0Var.g(vl1.c);
                                        if (objG6 == null) {
                                            objG6 = null;
                                        }
                                        fb1 fb1Var = (fb1) objG6;
                                        Object objG7 = zx0Var.g(ml1.i);
                                        if (objG7 == null) {
                                            objG7 = null;
                                        }
                                        r0 r0Var8 = (r0) objG7;
                                        if (fb1Var != null) {
                                            fl flVar = fb1Var.b;
                                            if (r0Var8 != null) {
                                                float f5 = flVar.b;
                                                float f6 = flVar.a;
                                                float f7 = f5 < f6 ? f6 : f5;
                                                if (f6 <= f5) {
                                                    f5 = f6;
                                                }
                                                float f8 = (f7 - f5) / 20.0f;
                                                if (z5) {
                                                    f8 = -f8;
                                                }
                                                sa0 sa0Var4 = (sa0) r0Var8.b;
                                                if (sa0Var4 != null) {
                                                    return ((Boolean) sa0Var4.i(Float.valueOf(fb1Var.a + f8))).booleanValue();
                                                }
                                            } else {
                                                long jC = al.j(ql0Var.I.c).c();
                                                ArrayList arrayList = new ArrayList();
                                                Object objG8 = zx0Var.g(ml1.C);
                                                if (objG8 == null) {
                                                    objG8 = null;
                                                }
                                                r0 r0Var9 = (r0) objG8;
                                                Float f9 = (r0Var9 == null || (sa0Var3 = (sa0) r0Var9.b) == null || !((Boolean) sa0Var3.i(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                                Object objG9 = zx0Var.g(ml1.d);
                                                if (objG9 == null) {
                                                    objG9 = null;
                                                }
                                                r0 r0Var10 = (r0) objG9;
                                                if (r0Var10 != null) {
                                                    eb0 eb0Var = r0Var10.b;
                                                    Object objG10 = zx0Var.g(vl1.v);
                                                    if (objG10 == null) {
                                                        objG10 = null;
                                                    }
                                                    wi1 wi1Var = (wi1) objG10;
                                                    if (wi1Var == null || !z10) {
                                                        j = jC;
                                                    } else {
                                                        if (f9 != null) {
                                                            fIntBitsToFloat = f9.floatValue();
                                                            j = jC;
                                                        } else {
                                                            j = jC;
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                                        }
                                                        if (z6 || z5) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (ql0Var.C == al0Var && (z6 || z7)) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (m4.r(wi1Var, fIntBitsToFloat)) {
                                                            zl1 zl1Var = ml1.z;
                                                            if (zx0Var.c(zl1Var) || zx0Var.c(ml1.B)) {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    Object objG11 = zx0Var.g(ml1.B);
                                                                    r0Var3 = (r0) (objG11 == null ? null : objG11);
                                                                } else {
                                                                    Object objG12 = zx0Var.g(zl1Var);
                                                                    r0Var3 = (r0) (objG12 == null ? null : objG12);
                                                                }
                                                                if (r0Var3 != null && (ha0Var12 = (ha0) r0Var3.b) != null) {
                                                                    return ((Boolean) ha0Var12.a()).booleanValue();
                                                                }
                                                            } else {
                                                                wa0 wa0Var = (wa0) eb0Var;
                                                                if (wa0Var != null) {
                                                                    return ((Boolean) wa0Var.h(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Object objG13 = zx0Var.g(vl1.w);
                                                    if (objG13 == null) {
                                                        objG13 = null;
                                                    }
                                                    wi1 wi1Var2 = (wi1) objG13;
                                                    if (wi1Var2 != null && z) {
                                                        float fFloatValue = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (j & 4294967295L));
                                                        if (z8 || z5) {
                                                            fFloatValue = -fFloatValue;
                                                        }
                                                        if (m4.r(wi1Var2, fFloatValue)) {
                                                            zl1 zl1Var2 = ml1.y;
                                                            if (zx0Var.c(zl1Var2) || zx0Var.c(ml1.A)) {
                                                                if (fFloatValue > 0.0f) {
                                                                    Object objG14 = zx0Var.g(ml1.A);
                                                                    r0Var2 = (r0) (objG14 == null ? null : objG14);
                                                                } else {
                                                                    Object objG15 = zx0Var.g(zl1Var2);
                                                                    r0Var2 = (r0) (objG15 == null ? null : objG15);
                                                                }
                                                                if (r0Var2 != null && (ha0Var11 = (ha0) r0Var2.b) != null) {
                                                                    return ((Boolean) ha0Var11.a()).booleanValue();
                                                                }
                                                            } else {
                                                                wa0 wa0Var2 = (wa0) eb0Var;
                                                                if (wa0Var2 != null) {
                                                                    return ((Boolean) wa0Var2.h(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object objG16 = zx0Var.g(ml1.s);
                                    r0 r0Var11 = (r0) (objG16 == null ? null : objG16);
                                    if (r0Var11 != null && (ha0Var5 = (ha0) r0Var11.b) != null) {
                                        return ((Boolean) ha0Var5.a()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    Object objG17 = zx0Var.g(ml1.r);
                                    r0 r0Var12 = (r0) (objG17 == null ? null : objG17);
                                    if (r0Var12 != null && (ha0Var6 = (ha0) r0Var12.b) != null) {
                                        return ((Boolean) ha0Var6.a()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    Object objG18 = zx0Var.g(ml1.t);
                                    r0 r0Var13 = (r0) (objG18 == null ? null : objG18);
                                    if (r0Var13 != null && (ha0Var7 = (ha0) r0Var13.b) != null) {
                                        return ((Boolean) ha0Var7.a()).booleanValue();
                                    }
                                    break;
                                case 524288:
                                    Object objG19 = zx0Var.g(ml1.u);
                                    r0 r0Var14 = (r0) (objG19 == null ? null : objG19);
                                    if (r0Var14 != null && (ha0Var8 = (ha0) r0Var14.b) != null) {
                                        return ((Boolean) ha0Var8.a()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    Object objG20 = zx0Var.g(ml1.v);
                                    r0 r0Var15 = (r0) (objG20 == null ? null : objG20);
                                    if (r0Var15 != null && (ha0Var9 = (ha0) r0Var15.b) != null) {
                                        return ((Boolean) ha0Var9.a()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object objG21 = zx0Var.g(ml1.k);
                                    r0 r0Var16 = (r0) (objG21 == null ? null : objG21);
                                    if (r0Var16 != null && (sa0Var = (sa0) r0Var16.b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) sa0Var.i(new hb(string))).booleanValue();
                                    }
                                    break;
                                case android.R.id.accessibilityActionShowOnScreen:
                                    rl1 rl1VarL = rl1Var.l();
                                    if (rl1VarL != null) {
                                        Object objG22 = rl1VarL.d.e.g(ml1.d);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        r0Var = (r0) objG22;
                                        while (r0Var == null && rl1VarL != null) {
                                            rl1VarL = rl1VarL.l();
                                            if (rl1VarL != null) {
                                                Object objG23 = rl1VarL.d.e.g(ml1.d);
                                                if (objG23 == null) {
                                                    objG23 = null;
                                                }
                                                r0Var = (r0) objG23;
                                            }
                                        }
                                        if (rl1VarL == null) {
                                            pc1 pc1VarG = rl1Var.g();
                                            return h4Var.requestRectangleOnScreen(new Rect((int) Math.floor(pc1VarG.a), (int) Math.floor(pc1VarG.b), nu0.I((float) Math.ceil(pc1VarG.c)), nu0.I((float) Math.ceil(pc1VarG.d))));
                                        }
                                        long j2 = 0;
                                        long jD = 0;
                                        boolean z11 = false;
                                        while (rl1VarL != null) {
                                            ql0 ql0Var2 = rl1VarL.c;
                                            zx0 zx0Var2 = rl1VarL.d.e;
                                            Object objG24 = zx0Var2.g(ml1.d);
                                            if (objG24 == null) {
                                                objG24 = null;
                                            }
                                            r0 r0Var17 = (r0) objG24;
                                            if (r0Var17 != null) {
                                                pc1 pc1VarJ = al.j(ql0Var2.I.c);
                                                zk0 zk0VarJ = ql0Var2.I.c.j();
                                                pc1 pc1VarI = pc1VarJ.i(zk0VarJ != null ? ((c01) zk0VarJ).M(j2) : j2);
                                                c01 c01VarD = rl1Var.d();
                                                if (c01VarD == null) {
                                                    jM = j2;
                                                    long jE = w01.e(jM, jD);
                                                    c01 c01VarD2 = rl1Var.d();
                                                    pc1 pc1VarA = qc1.a(jE, xk.P(c01VarD2 == null ? c01VarD2.g : 0L));
                                                    f = pc1VarA.a - pc1VarI.a;
                                                    f2 = pc1VarA.c - pc1VarI.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = pc1VarA.b - pc1VarI.b;
                                                    f4 = pc1VarA.d - pc1VarI.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (w01.b(jFloatToRawIntBits, 0L)) {
                                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                                        Object objG25 = zx0Var2.g(vl1.v);
                                                        if (objG25 == null) {
                                                            objG25 = null;
                                                        }
                                                        if (ql0Var.C == al0Var) {
                                                            fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                        }
                                                        Object objG26 = zx0Var2.g(vl1.w);
                                                        if (objG26 == null) {
                                                            objG26 = null;
                                                        }
                                                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                                    } else {
                                                        jFloatToRawIntBits2 = jFloatToRawIntBits;
                                                    }
                                                    wa0 wa0Var3 = (wa0) r0Var17.b;
                                                    z11 = (wa0Var3 == null && ((Boolean) wa0Var3.h(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z11;
                                                    jD = w01.d(jD, jFloatToRawIntBits);
                                                } else {
                                                    if (!c01VarD.W0().r) {
                                                        c01VarD = null;
                                                    }
                                                    if (c01VarD != null) {
                                                        jM = c01VarD.M(j2);
                                                    }
                                                    long jE2 = w01.e(jM, jD);
                                                    c01 c01VarD22 = rl1Var.d();
                                                    pc1 pc1VarA2 = qc1.a(jE2, xk.P(c01VarD22 == null ? c01VarD22.g : 0L));
                                                    f = pc1VarA2.a - pc1VarI.a;
                                                    f2 = pc1VarA2.c - pc1VarI.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                    }
                                                    f3 = pc1VarA2.b - pc1VarI.b;
                                                    f4 = pc1VarA2.d - pc1VarI.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (w01.b(jFloatToRawIntBits, 0L)) {
                                                    }
                                                    wa0 wa0Var32 = (wa0) r0Var17.b;
                                                    if (wa0Var32 == null) {
                                                        jD = w01.d(jD, jFloatToRawIntBits);
                                                    } else {
                                                        jD = w01.d(jD, jFloatToRawIntBits);
                                                    }
                                                }
                                            }
                                            rl1VarL = rl1VarL.l();
                                            j2 = 0;
                                        }
                                        return z11;
                                    }
                                    r0Var = null;
                                    break;
                                case android.R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        Object objG27 = zx0Var.g(ml1.i);
                                        r0 r0Var18 = (r0) (objG27 == null ? null : objG27);
                                        if (r0Var18 != null && (sa0Var2 = (sa0) r0Var18.b) != null) {
                                            return ((Boolean) sa0Var2.i(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        }
                                    }
                                    break;
                                case android.R.id.accessibilityActionImeEnter:
                                    Object objG28 = zx0Var.g(ml1.p);
                                    r0 r0Var19 = (r0) (objG28 == null ? null : objG28);
                                    if (r0Var19 != null && (ha0Var10 = (ha0) r0Var19.b) != null) {
                                        return ((Boolean) ha0Var10.a()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case android.R.id.accessibilityActionScrollUp:
                                        case android.R.id.accessibilityActionScrollLeft:
                                        case android.R.id.accessibilityActionScrollDown:
                                        case android.R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i2) {
                                                case android.R.id.accessibilityActionPageUp:
                                                    Object objG29 = zx0Var.g(ml1.y);
                                                    r0 r0Var20 = (r0) (objG29 == null ? null : objG29);
                                                    if (r0Var20 != null && (ha0Var13 = (ha0) r0Var20.b) != null) {
                                                        return ((Boolean) ha0Var13.a()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageDown:
                                                    Object objG30 = zx0Var.g(ml1.A);
                                                    r0 r0Var21 = (r0) (objG30 == null ? null : objG30);
                                                    if (r0Var21 != null && (ha0Var14 = (ha0) r0Var21.b) != null) {
                                                        return ((Boolean) ha0Var14.a()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageLeft:
                                                    Object objG31 = zx0Var.g(ml1.z);
                                                    r0 r0Var22 = (r0) (objG31 == null ? null : objG31);
                                                    if (r0Var22 != null && (ha0Var15 = (ha0) r0Var22.b) != null) {
                                                        return ((Boolean) ha0Var15.a()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageRight:
                                                    Object objG32 = zx0Var.g(ml1.B);
                                                    r0 r0Var23 = (r0) (objG32 == null ? null : objG32);
                                                    if (r0Var23 != null && (ha0Var16 = (ha0) r0Var23.b) != null) {
                                                        return ((Boolean) ha0Var16.a()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    dr1 dr1Var = (dr1) m4Var.v.b(i);
                                                    if (dr1Var != null && ((CharSequence) dr1Var.b(i2)) != null) {
                                                        Object objG33 = zx0Var.g(ml1.x);
                                                        List list = (List) (objG33 == null ? null : objG33);
                                                        if (list != null && list.size() > 0) {
                                                            list.get(0).getClass();
                                                            yc.d();
                                                            return false;
                                                        }
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            Object objG34 = zx0Var.g(vl1.l);
                            if (objG34 == null) {
                                objG34 = null;
                            }
                            if (xi0.o(objG34, bool)) {
                                ((m80) h4Var.getFocusOwner()).b(8, false, true);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
