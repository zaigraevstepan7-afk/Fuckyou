package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o80 {
    public static final o80 b = new o80();
    public static final o80 c = new o80();
    public static final o80 d = new o80();
    public final iy0 a = new iy0(new q80[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(o80 o80Var) {
        o80Var.getClass();
        if (o80Var == b) {
            yc.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (o80Var == c) {
            yc.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        iy0 iy0Var = o80Var.a;
        int i = iy0Var.g;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = iy0Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (q80) objArr[i2];
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
                int i3 = iy0Var2.g;
                if (i3 != 0) {
                    sv0 sv0VarK = (sv0) iy0Var2.k(i3 - 1);
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
                                        if (((w80) sv0VarK).S0(7)) {
                                            break;
                                        }
                                    } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                        int i4 = 0;
                                        for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                            if ((sv0Var3.g & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
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
                                        if (i4 == 1) {
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
    }
}
