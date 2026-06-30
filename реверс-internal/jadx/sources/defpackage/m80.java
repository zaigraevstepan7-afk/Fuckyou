package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m80 implements j80 {
    public final h4 a;
    public final h4 b;
    public final h80 d;
    public mx0 f;
    public w80 h;
    public final w80 c = new w80(2, null, 14);
    public final k80 e = new k80(this);
    public final sx0 g = new sx0(1);

    public m80(h4 h4Var, h4 h4Var2) {
        this.a = h4Var;
        this.b = h4Var2;
        this.d = new h80(this, h4Var2);
    }

    public final boolean a(boolean z) {
        xz0 xz0Var;
        if (f() != null) {
            w80 w80VarF = f();
            i(null);
            if (w80VarF != null) {
                v80 v80Var = v80.e;
                v80 v80Var2 = v80.g;
                w80VarF.M0(v80Var, v80Var2);
                if (!w80VarF.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var = w80VarF.e.i;
                ql0 ql0VarP = bl.P(w80VarF);
                while (ql0VarP != null) {
                    if ((ql0VarP.I.f.h & 1024) != 0) {
                        while (sv0Var != null) {
                            if ((sv0Var.g & 1024) != 0) {
                                sv0 sv0VarK = sv0Var;
                                iy0 iy0Var = null;
                                while (sv0VarK != null) {
                                    if (sv0VarK instanceof w80) {
                                        ((w80) sv0VarK).M0(v80.f, v80Var2);
                                    } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                        int i = 0;
                                        for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                            if ((sv0Var2.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    sv0VarK = sv0Var2;
                                                } else {
                                                    if (iy0Var == null) {
                                                        iy0Var = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK != null) {
                                                        iy0Var.b(sv0VarK);
                                                        sv0VarK = null;
                                                    }
                                                    iy0Var.b(sv0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    sv0VarK = bl.k(iy0Var);
                                }
                            }
                            sv0Var = sv0Var.i;
                        }
                    }
                    ql0VarP = ql0VarP.u();
                    sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = bk.U(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                ez1.a();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        h4 h4Var = this.a;
        if (h4Var.isFocused() || h4Var.hasFocus()) {
            h4Var.clearFocus();
        } else if (h4Var.hasFocus()) {
            View viewFindFocus = h4Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            h4Var.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v24, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v28, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v33, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [iy0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, ha0 ha0Var) {
        Object obj;
        sv0 sv0Var;
        xz0 xz0Var;
        Object obj2;
        xz0 xz0Var2;
        int size;
        xz0 xz0Var3;
        boolean z;
        w80 w80Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!j(keyEvent)) {
                return false;
            }
            w80 w80VarS = hk.s(w80Var);
            if (w80VarS != null) {
                if (!w80VarS.e.r) {
                    ng0.b("visitLocalDescendants called on an unattached node");
                }
                sv0 sv0Var2 = w80VarS.e;
                if ((sv0Var2.h & 9216) != 0) {
                    sv0Var = null;
                    for (sv0 sv0Var3 = sv0Var2.j; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                        int i = sv0Var3.g;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            sv0Var = sv0Var3;
                        }
                    }
                } else {
                    sv0Var = null;
                }
                if (sv0Var == null) {
                }
            } else if (w80VarS == null) {
                if (!w80Var.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var4 = w80Var.e.i;
                ql0 ql0VarP = bl.P(w80Var);
                loop15: while (true) {
                    if (ql0VarP == null) {
                        obj = null;
                        break;
                    }
                    if ((ql0VarP.I.f.h & 8192) != 0) {
                        while (sv0Var4 != null) {
                            if ((sv0Var4.g & 8192) != 0) {
                                sv0 sv0VarK = sv0Var4;
                                iy0 iy0Var = null;
                                while (sv0VarK != null) {
                                    if (sv0VarK instanceof jk0) {
                                        obj = sv0VarK;
                                        break loop15;
                                    }
                                    if ((sv0VarK.g & 8192) != 0 && (sv0VarK instanceof yw)) {
                                        sv0 sv0Var5 = ((yw) sv0VarK).t;
                                        int i2 = 0;
                                        sv0VarK = sv0VarK;
                                        iy0Var = iy0Var;
                                        while (sv0Var5 != null) {
                                            if ((sv0Var5.g & 8192) != 0) {
                                                i2++;
                                                iy0Var = iy0Var;
                                                if (i2 == 1) {
                                                    sv0VarK = sv0Var5;
                                                } else {
                                                    if (iy0Var == null) {
                                                        iy0Var = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK != null) {
                                                        iy0Var.b(sv0VarK);
                                                        sv0VarK = null;
                                                    }
                                                    iy0Var.b(sv0Var5);
                                                }
                                            }
                                            sv0Var5 = sv0Var5.j;
                                            sv0VarK = sv0VarK;
                                            iy0Var = iy0Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    sv0VarK = bl.k(iy0Var);
                                }
                            }
                            sv0Var4 = sv0Var4.i;
                        }
                    }
                    ql0VarP = ql0VarP.u();
                    sv0Var4 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
                }
                Object obj3 = (jk0) obj;
                sv0Var = obj3 != null ? ((sv0) obj3).e : null;
            } else {
                if (!w80VarS.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var6 = w80VarS.e;
                ql0 ql0VarP2 = bl.P(w80VarS);
                loop11: while (true) {
                    if (ql0VarP2 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((ql0VarP2.I.f.h & 8192) != 0) {
                        while (sv0Var6 != null) {
                            if ((sv0Var6.g & 8192) != 0) {
                                iy0 iy0Var2 = null;
                                sv0 sv0VarK2 = sv0Var6;
                                while (sv0VarK2 != null) {
                                    if (sv0VarK2 instanceof jk0) {
                                        obj2 = sv0VarK2;
                                        break loop11;
                                    }
                                    if ((sv0VarK2.g & 8192) != 0 && (sv0VarK2 instanceof yw)) {
                                        sv0 sv0Var7 = ((yw) sv0VarK2).t;
                                        int i3 = 0;
                                        sv0VarK2 = sv0VarK2;
                                        iy0Var2 = iy0Var2;
                                        while (sv0Var7 != null) {
                                            if ((sv0Var7.g & 8192) != 0) {
                                                i3++;
                                                iy0Var2 = iy0Var2;
                                                if (i3 == 1) {
                                                    sv0VarK2 = sv0Var7;
                                                } else {
                                                    if (iy0Var2 == null) {
                                                        iy0Var2 = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK2 != null) {
                                                        iy0Var2.b(sv0VarK2);
                                                        sv0VarK2 = null;
                                                    }
                                                    iy0Var2.b(sv0Var7);
                                                }
                                            }
                                            sv0Var7 = sv0Var7.j;
                                            sv0VarK2 = sv0VarK2;
                                            iy0Var2 = iy0Var2;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    sv0VarK2 = bl.k(iy0Var2);
                                }
                            }
                            sv0Var6 = sv0Var6.i;
                        }
                    }
                    ql0VarP2 = ql0VarP2.u();
                    sv0Var6 = (ql0VarP2 == null || (xz0Var2 = ql0VarP2.I) == null) ? null : xz0Var2.e;
                }
                Object obj4 = (jk0) obj2;
                if (obj4 != null) {
                    sv0Var = ((sv0) obj4).e;
                }
            }
            if (sv0Var != null) {
                if (!sv0Var.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var8 = sv0Var.e.i;
                ql0 ql0VarP3 = bl.P(sv0Var);
                ArrayList arrayList = null;
                while (ql0VarP3 != null) {
                    if ((ql0VarP3.I.f.h & 8192) != 0) {
                        while (sv0Var8 != null) {
                            if ((sv0Var8.g & 8192) != 0) {
                                sv0 sv0VarK3 = sv0Var8;
                                iy0 iy0Var3 = null;
                                while (sv0VarK3 != null) {
                                    if (sv0VarK3 instanceof jk0) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(sv0VarK3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (sv0VarK3.g & 8192) != 0 && (sv0VarK3 instanceof yw)) {
                                        int i4 = 0;
                                        for (sv0 sv0Var9 = ((yw) sv0VarK3).t; sv0Var9 != null; sv0Var9 = sv0Var9.j) {
                                            if ((sv0Var9.g & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    sv0VarK3 = sv0Var9;
                                                } else {
                                                    if (iy0Var3 == null) {
                                                        iy0Var3 = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK3 != null) {
                                                        iy0Var3.b(sv0VarK3);
                                                        sv0VarK3 = null;
                                                    }
                                                    iy0Var3.b(sv0Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    sv0VarK3 = bl.k(iy0Var3);
                                }
                            }
                            sv0Var8 = sv0Var8.i;
                        }
                    }
                    ql0VarP3 = ql0VarP3.u();
                    sv0Var8 = (ql0VarP3 == null || (xz0Var3 = ql0VarP3.I) == null) ? null : xz0Var3.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((jk0) arrayList.get(size)).k(keyEvent)) {
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? K = sv0Var.e;
                ?? iy0Var4 = 0;
                while (K != 0) {
                    if (K instanceof jk0) {
                        if (((jk0) K).k(keyEvent)) {
                            return true;
                        }
                    } else if ((K.g & 8192) != 0 && (K instanceof yw)) {
                        sv0 sv0Var10 = ((yw) K).t;
                        int i6 = 0;
                        iy0Var4 = iy0Var4;
                        K = K;
                        while (sv0Var10 != null) {
                            if ((sv0Var10.g & 8192) != 0) {
                                i6++;
                                iy0Var4 = iy0Var4;
                                if (i6 == 1) {
                                    K = sv0Var10;
                                } else {
                                    if (iy0Var4 == 0) {
                                        iy0Var4 = new iy0(new sv0[16]);
                                    }
                                    if (K != 0) {
                                        iy0Var4.b(K);
                                        K = 0;
                                    }
                                    iy0Var4.b(sv0Var10);
                                }
                            }
                            sv0Var10 = sv0Var10.j;
                            iy0Var4 = iy0Var4;
                            K = K;
                        }
                        if (i6 == 1) {
                        }
                    }
                    K = bl.k(iy0Var4);
                }
                if (((Boolean) ha0Var.a()).booleanValue()) {
                    return true;
                }
                ?? K2 = sv0Var.e;
                ?? iy0Var5 = 0;
                while (K2 != 0) {
                    if (K2 instanceof jk0) {
                        if (((jk0) K2).P(keyEvent)) {
                            return true;
                        }
                    } else if ((K2.g & 8192) != 0 && (K2 instanceof yw)) {
                        sv0 sv0Var11 = ((yw) K2).t;
                        int i7 = 0;
                        K2 = K2;
                        iy0Var5 = iy0Var5;
                        while (sv0Var11 != null) {
                            if ((sv0Var11.g & 8192) != 0) {
                                i7++;
                                iy0Var5 = iy0Var5;
                                if (i7 == 1) {
                                    K2 = sv0Var11;
                                } else {
                                    if (iy0Var5 == 0) {
                                        iy0Var5 = new iy0(new sv0[16]);
                                    }
                                    if (K2 != 0) {
                                        iy0Var5.b(K2);
                                        K2 = 0;
                                    }
                                    iy0Var5.b(sv0Var11);
                                }
                            }
                            sv0Var11 = sv0Var11.j;
                            K2 = K2;
                            iy0Var5 = iy0Var5;
                        }
                        if (i7 == 1) {
                        }
                    }
                    K2 = bl.k(iy0Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((jk0) arrayList.get(i8)).P(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x0113, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, pc1 pc1Var, sa0 sa0Var) {
        boolean zO;
        w80 w80Var;
        xz0 xz0Var;
        w80 w80Var2 = this.c;
        w80 w80VarS = hk.s(w80Var2);
        int i2 = 4;
        int i3 = 2;
        h4 h4Var = this.b;
        boolean zBooleanValue = false;
        if (w80VarS != null) {
            al0 layoutDirection = h4Var.getLayoutDirection();
            n80 n80VarN0 = w80VarS.N0();
            o80 o80Var = n80VarN0.h;
            o80 o80Var2 = n80VarN0.i;
            if (i == 1) {
                o80Var = n80VarN0.b;
            } else if (i == 2) {
                o80Var = n80VarN0.c;
            } else if (i == 5) {
                o80Var = n80VarN0.d;
            } else if (i == 6) {
                o80Var = n80VarN0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ez1.a();
                        return null;
                    }
                    o80Var = o80Var2;
                }
                if (o80Var == o80.b) {
                    o80Var = null;
                }
                if (o80Var == null) {
                    o80Var = n80VarN0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    o80Var = o80Var2;
                } else if (iOrdinal2 != 1) {
                    ez1.a();
                    return null;
                }
                if (o80Var == o80.b) {
                    o80Var = null;
                }
                if (o80Var == null) {
                    o80Var = n80VarN0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    yc.l("invalid FocusDirection");
                    return null;
                }
                m80 m80Var = (m80) ((h4) bl.Q(w80VarS)).getFocusOwner();
                w80 w80VarF = m80Var.f();
                if (i == 7) {
                    n80VarN0.j.getClass();
                } else {
                    n80VarN0.k.getClass();
                }
                o80Var = w80VarF != m80Var.f() ? o80.d : o80.b;
            }
            o80 o80Var3 = o80.c;
            if (!xi0.o(o80Var, o80Var3)) {
                if (xi0.o(o80Var, o80.d)) {
                    w80 w80VarS2 = hk.s(w80Var2);
                    if (w80VarS2 != null) {
                        return (Boolean) sa0Var.i(w80VarS2);
                    }
                } else {
                    o80 o80Var4 = o80.b;
                    if (!xi0.o(o80Var, o80Var4)) {
                        if (o80Var == o80Var4) {
                            yc.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (o80Var == o80Var3) {
                            yc.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        iy0 iy0Var = o80Var.a;
                        int i4 = iy0Var.g;
                        if (i4 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = iy0Var.e;
                            boolean z = false;
                            for (int i5 = 0; i5 < i4; i5++) {
                                Object obj = (q80) objArr[i5];
                                if (!((sv0) obj).e.r) {
                                    ng0.b("visitChildren called on an unattached node");
                                }
                                iy0 iy0Var2 = new iy0(new sv0[16]);
                                sv0 sv0Var = ((sv0) obj).e;
                                sv0 sv0Var2 = sv0Var.j;
                                if (sv0Var2 == null) {
                                    bl.h(iy0Var2, sv0Var);
                                } else {
                                    iy0Var2.b(sv0Var2);
                                }
                                while (true) {
                                    int i6 = iy0Var2.g;
                                    if (i6 != 0) {
                                        sv0 sv0VarK = (sv0) iy0Var2.k(i6 - 1);
                                        if ((sv0VarK.h & 1024) == 0) {
                                            bl.h(iy0Var2, sv0VarK);
                                        } else {
                                            while (true) {
                                                if (sv0VarK == null) {
                                                    break;
                                                }
                                                if ((sv0VarK.g & 1024) != 0) {
                                                    iy0 iy0Var3 = null;
                                                    while (sv0VarK != null) {
                                                        if (sv0VarK instanceof w80) {
                                                            if (((Boolean) sa0Var.i((w80) sv0VarK)).booleanValue()) {
                                                                z = true;
                                                                break;
                                                            }
                                                        } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                                            int i7 = 0;
                                                            for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                                                if ((sv0Var3.g & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        sv0VarK = sv0Var3;
                                                                    } else {
                                                                        if (iy0Var3 == null) {
                                                                            iy0Var3 = new iy0(new sv0[16]);
                                                                        }
                                                                        if (sv0VarK != null) {
                                                                            iy0Var3.b(sv0VarK);
                                                                            sv0VarK = null;
                                                                        }
                                                                        iy0Var3.b(sv0Var3);
                                                                    }
                                                                }
                                                            }
                                                            if (i7 == 1) {
                                                            }
                                                        }
                                                        sv0VarK = bl.k(iy0Var3);
                                                    }
                                                } else {
                                                    sv0VarK = sv0VarK.j;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        w80VarS = null;
        al0 layoutDirection2 = h4Var.getLayoutDirection();
        o9 o9Var = new o9(w80VarS, this, sa0Var, i3);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zO = lk.K(w80Var2, o9Var);
            } else {
                if (i != 2) {
                    yc.l("This function should only be used for 1-D focus search");
                    return null;
                }
                zO = lk.o(w80Var2, o9Var);
            }
            return Boolean.valueOf(zO);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return af1.E(i, o9Var, w80Var2, pc1Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    ez1.a();
                    return null;
                }
                i2 = 3;
            }
            w80 w80VarS3 = hk.s(w80Var2);
            if (w80VarS3 != null) {
                return af1.E(i2, o9Var, w80VarS3, pc1Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(a80.a(i)).toString());
        }
        w80 w80VarS4 = hk.s(w80Var2);
        if (w80VarS4 == null) {
            w80Var = null;
        } else {
            if (!w80VarS4.e.r) {
                ng0.b("visitAncestors called on an unattached node");
            }
            sv0 sv0Var4 = w80VarS4.e.i;
            ql0 ql0VarP = bl.P(w80VarS4);
            loop5: while (ql0VarP != null) {
                if ((ql0VarP.I.f.h & 1024) != 0) {
                    while (sv0Var4 != null) {
                        if ((sv0Var4.g & 1024) != 0) {
                            sv0 sv0VarK2 = sv0Var4;
                            iy0 iy0Var4 = null;
                            while (sv0VarK2 != null) {
                                if (sv0VarK2 instanceof w80) {
                                    w80 w80Var3 = (w80) sv0VarK2;
                                    if (w80Var3.N0().a) {
                                        w80Var = w80Var3;
                                        break loop5;
                                    }
                                } else if ((sv0VarK2.g & 1024) != 0 && (sv0VarK2 instanceof yw)) {
                                    int i8 = 0;
                                    for (sv0 sv0Var5 = ((yw) sv0VarK2).t; sv0Var5 != null; sv0Var5 = sv0Var5.j) {
                                        if ((sv0Var5.g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                sv0VarK2 = sv0Var5;
                                            } else {
                                                if (iy0Var4 == null) {
                                                    iy0Var4 = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK2 != null) {
                                                    iy0Var4.b(sv0VarK2);
                                                    sv0VarK2 = null;
                                                }
                                                iy0Var4.b(sv0Var5);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        sv0VarK2 = bl.k(iy0Var4);
                                    }
                                }
                                sv0VarK2 = bl.k(iy0Var4);
                            }
                        }
                        sv0Var4 = sv0Var4.i;
                    }
                }
                ql0VarP = ql0VarP.u();
                sv0Var4 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
            }
            w80Var = null;
        }
        if (w80Var != null && w80Var != w80Var2) {
            zBooleanValue = ((Boolean) o9Var.i(w80Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final w80 f() {
        w80 w80Var = this.h;
        if (w80Var == null || !w80Var.r) {
            return null;
        }
        return w80Var;
    }

    public final boolean g(int i, boolean z) {
        zc1 zc1Var = new zc1();
        zc1Var.e = Boolean.FALSE;
        w80 w80VarF = f();
        Boolean boolE = e(i, this.a.getEmbeddedViewFocusRect(), new l80(i, zc1Var));
        if (!xi0.o(boolE, Boolean.TRUE) || w80VarF == f()) {
            if (boolE != null && zc1Var.e != null) {
                if (!boolE.booleanValue() || !((Boolean) zc1Var.e).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new d4(i, 3));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new d4(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(w80 w80Var) {
        w80 w80Var2 = this.h;
        this.h = w80Var;
        sx0 sx0Var = this.g;
        Object[] objArr = sx0Var.a;
        int i = sx0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((i80) objArr[i2]).d(w80Var2, w80Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.d) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.nd.T(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r16 = r16 ^ (r16 << 16);
        r17 = r13;
        r13 = r16 >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | (((long) (r16 & 127)) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.e = defpackage.pi1.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.pi1.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0341, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        boolean z;
        int iNumberOfTrailingZeros2;
        long jA = bl.A(keyEvent);
        int iD = bl.D(keyEvent);
        int i = -862048943;
        long j2 = 0;
        char c = '\b';
        int i2 = 0;
        ?? r21 = 0;
        boolean z2 = true;
        if (iD == 2) {
            mx0 mx0Var = this.f;
            if (mx0Var == null) {
                mx0Var = new mx0(3);
                this.f = mx0Var;
            }
            mx0 mx0Var2 = mx0Var;
            int iHashCode = Long.hashCode(jA) * (-862048943);
            int i3 = iHashCode ^ (iHashCode << 16);
            int i4 = i3 >>> 7;
            int i5 = i3 & 127;
            int i6 = mx0Var2.c;
            int i7 = i4 & i6;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = mx0Var2.a;
                int i9 = i7 >> 3;
                int i10 = (i7 & 7) << 3;
                long j3 = (jArr[i9] >>> i10) | ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                int i11 = i;
                long j4 = i5;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                    long j7 = j2;
                    if (mx0Var2.b[iNumberOfTrailingZeros2] == jA) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i8 += 8;
                i7 = (i7 + i8) & i6;
                i = i11;
                j2 = j;
            }
            mx0Var2.b[iNumberOfTrailingZeros2] = jA;
            return z;
        }
        if (iD != 1) {
            return true;
        }
        mx0 mx0Var3 = this.f;
        if (mx0Var3 == null || !mx0Var3.a(jA)) {
            return false;
        }
        mx0 mx0Var4 = this.f;
        if (mx0Var4 != null) {
            int iHashCode2 = Long.hashCode(jA) * (-862048943);
            int i12 = iHashCode2 ^ (iHashCode2 << 16);
            int i13 = i12 & 127;
            int i14 = mx0Var4.c;
            int i15 = i12 >>> 7;
            loop5: while (true) {
                int i16 = i15 & i14;
                long[] jArr2 = mx0Var4.a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j8 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
                long j9 = (((long) i13) * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                    if (mx0Var4.b[iNumberOfTrailingZeros] == jA) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i2 += 8;
                i15 = i16 + i2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                mx0Var4.d--;
                long[] jArr3 = mx0Var4.a;
                int i19 = mx0Var4.c;
                int i20 = iNumberOfTrailingZeros >> 3;
                int i21 = (iNumberOfTrailingZeros & 7) << 3;
                long j11 = (jArr3[i20] & (~(255 << i21))) | (254 << i21);
                jArr3[i20] = j11;
                jArr3[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
