package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mc1 implements InputConnection {
    public final qt0 a;
    public final boolean b;
    public final jo0 c;
    public final ry1 d;
    public final j62 e;
    public int f;
    public az1 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public mc1(az1 az1Var, qt0 qt0Var, boolean z, jo0 jo0Var, ry1 ry1Var, j62 j62Var) {
        this.a = qt0Var;
        this.b = z;
        this.c = jo0Var;
        this.d = ry1Var;
        this.e = j62Var;
        this.g = az1Var;
    }

    public final void a(w20 w20Var) {
        this.f++;
        try {
            this.j.add(w20Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((ko0) this.a.f).c.i(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((ko0) this.a.f).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (xi0.o(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new in(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ex(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new fx(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new o60());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        az1 az1Var = this.g;
        return TextUtils.getCapsMode(az1Var.a.f, wz1.f(az1Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return bl.l(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (wz1.c(this.g.b)) {
            return null;
        }
        return kd1.o(this.g).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return kd1.p(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return kd1.q(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new rm1(0, this.g.a.f.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = 2;
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        i2 = 3;
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        i2 = 4;
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        i2 = 6;
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = 7;
                        break;
                    case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                ((ko0) this.a.f).d.i(new cf0(i2));
            } else {
                i2 = 1;
                ((ko0) this.a.f).d.i(new cf0(i2));
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0267  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [hb, java.lang.CharSequence] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        ?? r6;
        ?? r16;
        long jH;
        ?? r17;
        int i;
        int i2;
        String string;
        int i3;
        qz1 qz1VarD;
        qz1 qz1VarD2;
        oz1 oz1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            n nVar = new n(20, this);
            jo0 jo0Var = this.c;
            final int iV = 3;
            if (jo0Var != null && (r6 = jo0Var.j) != null) {
                qz1 qz1VarD3 = jo0Var.d();
                if (r6.equals((qz1VarD3 == null || (oz1Var = qz1VarD3.a.a) == null) ? null : oz1Var.a)) {
                    boolean zS = h6.s(handwritingGesture);
                    int i4 = 1;
                    ry1 ry1Var = this.d;
                    if (zS) {
                        SelectGesture selectGestureM = h6.m(handwritingGesture);
                        long jH2 = bk.H(jo0Var, el.S(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() == 1 ? 1 : 0);
                        if (wz1.c(jH2)) {
                            iV = el.v(gd0.m(selectGestureM), nVar);
                        } else {
                            nVar.i(new rm1((int) (jH2 >> 32), (int) (jH2 & 4294967295L)));
                            if (ry1Var != null) {
                                ry1Var.h(true);
                            }
                            iV = 1;
                        }
                    } else if (gd0.B(handwritingGesture)) {
                        DeleteGesture deleteGestureK = gd0.k(handwritingGesture);
                        int i5 = deleteGestureK.getGranularity() != 1 ? 0 : 1;
                        long jH3 = bk.H(jo0Var, el.S(deleteGestureK.getDeletionArea()), i5);
                        if (wz1.c(jH3)) {
                            iV = el.v(gd0.m(deleteGestureK), nVar);
                        } else {
                            el.I(jH3, r6, i5 == 1, nVar);
                            iV = 1;
                        }
                    } else if (gd0.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureP = gd0.p(handwritingGesture);
                        long jH4 = bk.h(jo0Var, el.S(selectRangeGestureP.getSelectionStartArea()), el.S(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() == 1 ? 1 : 0);
                        if (wz1.c(jH4)) {
                            iV = el.v(gd0.m(selectRangeGestureP), nVar);
                        } else {
                            nVar.i(new rm1((int) (jH4 >> 32), (int) (jH4 & 4294967295L)));
                            if (ry1Var != null) {
                                ry1Var.h(true);
                            }
                            iV = 1;
                        }
                    } else if (gd0.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureL = gd0.l(handwritingGesture);
                        int i6 = deleteRangeGestureL.getGranularity() != 1 ? 0 : 1;
                        long jH5 = bk.h(jo0Var, el.S(deleteRangeGestureL.getDeletionStartArea()), el.S(deleteRangeGestureL.getDeletionEndArea()), i6);
                        if (wz1.c(jH5)) {
                            iV = el.v(gd0.m(deleteRangeGestureL), nVar);
                        } else {
                            el.I(jH5, r6, i6 == 1, nVar);
                            iV = 1;
                        }
                    } else {
                        boolean z = gd0.z(handwritingGesture);
                        j62 j62Var = this.e;
                        int i7 = -1;
                        if (z) {
                            JoinOrSplitGesture joinOrSplitGestureN = gd0.n(handwritingGesture);
                            if (j62Var == null) {
                                iV = el.v(gd0.x(joinOrSplitGestureN), nVar);
                            } else {
                                int iG = bk.g(jo0Var, bk.k(joinOrSplitGestureN.getJoinOrSplitPoint()), j62Var);
                                if (iG == -1 || ((qz1VarD2 = jo0Var.d()) != null && bk.i(qz1VarD2.a, iG))) {
                                    iV = el.v(gd0.m(joinOrSplitGestureN), nVar);
                                } else {
                                    int iCharCount = iG;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore((CharSequence) r6, iCharCount);
                                        if (!bk.M(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iG < r6.f.length()) {
                                        int iCodePointAt = Character.codePointAt((CharSequence) r6, iG);
                                        if (!bk.M(iCodePointAt)) {
                                            break;
                                        } else {
                                            iG += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jG = af1.g(iCharCount, iG);
                                    if (wz1.c(jG)) {
                                        int i8 = (int) (jG >> 32);
                                        nVar.i(new hd0(new w20[]{new rm1(i8, i8), new in(" ", 1)}));
                                    } else {
                                        el.I(jG, r6, false, nVar);
                                    }
                                    iV = 1;
                                }
                            }
                        } else if (h6.y(handwritingGesture)) {
                            InsertGesture insertGestureL = h6.l(handwritingGesture);
                            if (j62Var == null) {
                                iV = el.v(gd0.x(insertGestureL), nVar);
                            } else {
                                int iG2 = bk.g(jo0Var, bk.k(insertGestureL.getInsertionPoint()), j62Var);
                                if (iG2 == -1 || ((qz1VarD = jo0Var.d()) != null && bk.i(qz1VarD.a, iG2))) {
                                    iV = el.v(gd0.m(insertGestureL), nVar);
                                } else {
                                    nVar.i(new hd0(new w20[]{new rm1(iG2, iG2), new in(insertGestureL.getTextToInsert(), 1)}));
                                    iV = 1;
                                }
                            }
                        } else if (gd0.t(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureO = gd0.o(handwritingGesture);
                            qz1 qz1VarD4 = jo0Var.d();
                            pz1 pz1Var = qz1VarD4 != null ? qz1VarD4.a : null;
                            long jK = bk.k(removeSpaceGestureO.getStartPoint());
                            long jK2 = bk.k(removeSpaceGestureO.getEndPoint());
                            zk0 zk0VarC = jo0Var.c();
                            if (pz1Var != null) {
                                vw0 vw0Var = pz1Var.b;
                                if (zk0VarC == null) {
                                    r16 = ' ';
                                    jH = wz1.b;
                                } else {
                                    long jT = zk0VarC.t(jK);
                                    long jT2 = zk0VarC.t(jK2);
                                    int iE = bk.E(vw0Var, jT, j62Var);
                                    int iE2 = bk.E(vw0Var, jT2, j62Var);
                                    if (iE != -1) {
                                        if (iE2 != -1) {
                                            iE = Math.min(iE, iE2);
                                        }
                                        iE2 = iE;
                                    } else if (iE2 == -1) {
                                        jH = wz1.b;
                                        r16 = ' ';
                                    }
                                    float fB = (vw0Var.b(iE2) + vw0Var.f(iE2)) / 2.0f;
                                    int i9 = (int) (jT >> 32);
                                    int i10 = (int) (jT2 >> 32);
                                    r16 = ' ';
                                    jH = vw0Var.h(new pc1(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fB - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fB + 0.1f), 0, l91.s);
                                }
                                if (wz1.c(jH)) {
                                    iV = el.v(gd0.m(removeSpaceGestureO), nVar);
                                } else {
                                    String str = r6.subSequence(wz1.f(jH), wz1.e(jH)).f;
                                    Pattern patternCompile = Pattern.compile("\\s+");
                                    patternCompile.getClass();
                                    str.getClass();
                                    Matcher matcher = patternCompile.matcher(str);
                                    matcher.getClass();
                                    xg0 xg0Var = !matcher.find(0) ? null : new xg0(22, matcher, str);
                                    if (xg0Var == null) {
                                        string = str.toString();
                                        r17 = 0;
                                        i3 = -1;
                                        i2 = -1;
                                        i = -1;
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb = new StringBuilder(length);
                                        int i11 = 0;
                                        r17 = 0;
                                        i = -1;
                                        while (true) {
                                            sb.append((CharSequence) str, i11, xg0Var.x().e);
                                            if (i == i7) {
                                                i = xg0Var.x().e;
                                            }
                                            i2 = xg0Var.x().f + i4;
                                            sb.append((CharSequence) "");
                                            i11 = xg0Var.x().f + i4;
                                            String str2 = (String) xg0Var.g;
                                            Matcher matcher2 = (Matcher) xg0Var.f;
                                            int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                            if (iEnd <= str2.length()) {
                                                Matcher matcher3 = matcher2.pattern().matcher(str2);
                                                matcher3.getClass();
                                                xg0Var = !matcher3.find(iEnd) ? null : new xg0(22, matcher3, str2);
                                            } else {
                                                xg0Var = null;
                                            }
                                            if (i11 >= length || xg0Var == null) {
                                                break;
                                            }
                                            i7 = -1;
                                            i4 = 1;
                                        }
                                        if (i11 < length) {
                                            sb.append((CharSequence) str, i11, length);
                                        }
                                        string = sb.toString();
                                        i3 = -1;
                                    }
                                    if (i == i3 || i2 == i3) {
                                        iV = el.v(gd0.m(removeSpaceGestureO), nVar);
                                    } else {
                                        int i12 = (int) (jH >> r16);
                                        String strSubstring = string.substring(i, string.length() - (wz1.d(jH) - i2));
                                        rm1 rm1Var = new rm1(i12 + i, i12 + i2);
                                        iV = 1;
                                        in inVar = new in(strSubstring, 1);
                                        w20[] w20VarArr = new w20[2];
                                        w20VarArr[r17] = rm1Var;
                                        w20VarArr[1] = inVar;
                                        nVar.i(new hd0(w20VarArr));
                                    }
                                }
                            }
                        } else {
                            iV = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iV);
                    }
                });
            } else {
                intConsumer.accept(iV);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        jo0 jo0Var;
        hb hbVar;
        oz1 oz1Var;
        if (Build.VERSION.SDK_INT >= 34 && (jo0Var = this.c) != null && (hbVar = jo0Var.j) != null) {
            qz1 qz1VarD = jo0Var.d();
            if (hbVar.equals((qz1VarD == null || (oz1Var = qz1VarD.a.a) == null) ? null : oz1Var.a)) {
                boolean zS = h6.s(previewableHandwritingGesture);
                int i = 1;
                cd0 cd0Var = cd0.e;
                ry1 ry1Var = this.d;
                if (zS) {
                    SelectGesture selectGestureM = h6.m(previewableHandwritingGesture);
                    if (ry1Var != null) {
                        long jH = bk.H(jo0Var, el.S(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        jo0 jo0Var2 = ry1Var.d;
                        if (jo0Var2 != null) {
                            jo0Var2.f(jH);
                        }
                        jo0 jo0Var3 = ry1Var.d;
                        if (jo0Var3 != null) {
                            jo0Var3.e(wz1.b);
                        }
                        if (!wz1.c(jH)) {
                            ry1Var.t(false);
                            ry1Var.q(cd0Var);
                        }
                    }
                } else if (gd0.B(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureK = gd0.k(previewableHandwritingGesture);
                    if (ry1Var != null) {
                        long jH2 = bk.H(jo0Var, el.S(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() != 1 ? 0 : 1);
                        jo0 jo0Var4 = ry1Var.d;
                        if (jo0Var4 != null) {
                            jo0Var4.e(jH2);
                        }
                        jo0 jo0Var5 = ry1Var.d;
                        if (jo0Var5 != null) {
                            jo0Var5.f(wz1.b);
                        }
                        if (!wz1.c(jH2)) {
                            ry1Var.t(false);
                            ry1Var.q(cd0Var);
                        }
                    }
                } else if (gd0.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = gd0.p(previewableHandwritingGesture);
                    if (ry1Var != null) {
                        long jH3 = bk.h(jo0Var, el.S(selectRangeGestureP.getSelectionStartArea()), el.S(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        jo0 jo0Var6 = ry1Var.d;
                        if (jo0Var6 != null) {
                            jo0Var6.f(jH3);
                        }
                        jo0 jo0Var7 = ry1Var.d;
                        if (jo0Var7 != null) {
                            jo0Var7.e(wz1.b);
                        }
                        if (!wz1.c(jH3)) {
                            ry1Var.t(false);
                            ry1Var.q(cd0Var);
                        }
                    }
                } else if (gd0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureL = gd0.l(previewableHandwritingGesture);
                    if (ry1Var != null) {
                        long jH4 = bk.h(jo0Var, el.S(deleteRangeGestureL.getDeletionStartArea()), el.S(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        jo0 jo0Var8 = ry1Var.d;
                        if (jo0Var8 != null) {
                            jo0Var8.e(jH4);
                        }
                        jo0 jo0Var9 = ry1Var.d;
                        if (jo0Var9 != null) {
                            jo0Var9.f(wz1.b);
                        }
                        if (!wz1.c(jH4)) {
                            ry1Var.t(false);
                            ry1Var.q(cd0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new zo(i, ry1Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        fo0 fo0Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                fo0Var = ((ko0) this.a.f).m;
                synchronized (fo0Var.c) {
                    try {
                        fo0Var.f = z2;
                        fo0Var.g = z3;
                        fo0Var.h = z5;
                        fo0Var.i = z;
                        if (z6) {
                            fo0Var.e = true;
                            if (fo0Var.j != null) {
                                fo0Var.a();
                            }
                        }
                        fo0Var.d = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        fo0Var = ((ko0) this.a.f).m;
        synchronized (fo0Var.c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((ko0) this.a.f).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new pm1(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new qm1(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new rm1(i, i2));
        return true;
    }
}
