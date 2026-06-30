package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 {
    public final View a;
    public final xg0 b;
    public jo0 e;
    public ry1 f;
    public j62 g;
    public Rect l;
    public final fo0 m;
    public sa0 c = new mt(13);
    public sa0 d = new mt(14);
    public az1 h = new az1("", wz1.b, 4);
    public df0 i = df0.g;
    public final ArrayList j = new ArrayList();
    public final hm0 k = al.E(new p7(11, this));

    public ko0(View view, k6 k6Var, xg0 xg0Var) {
        this.a = view;
        this.b = xg0Var;
        this.m = new fo0(k6Var, xg0Var);
    }

    public final mc1 a(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        az1 az1Var = this.h;
        String str = az1Var.a.f;
        long j = az1Var.b;
        df0 df0Var = this.i;
        int i4 = df0Var.e;
        int i5 = df0Var.d;
        boolean z = df0Var.a;
        if (i4 == 1) {
            i = z ? 6 : 0;
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else if (i4 != 7) {
            yc.l("invalid ImeAction");
            return null;
        }
        editorInfo.imeOptions = i;
        as0 as0Var = df0Var.f;
        if (xi0.o(as0Var, as0.g)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(ql.Y(as0Var, 10));
            Iterator it = as0Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((zr0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i5 == 1) {
            i2 = 1;
            i3 = 4;
        } else if (i5 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
            i3 = 4;
        } else if (i5 == 3) {
            i3 = 4;
            i2 = 2;
        } else if (i5 == 4) {
            i3 = 4;
            i2 = 3;
        } else {
            i2 = 17;
            i3 = 4;
            if (i5 != 5) {
                if (i5 == 6) {
                    i2 = 33;
                } else if (i5 == 7) {
                    i2 = 129;
                } else if (i5 == 8) {
                    i2 = 18;
                } else if (i5 == 9) {
                    i2 = 8194;
                } else if (i5 == 10) {
                    i2 = 145;
                } else if (i5 == 11) {
                    i2 = 113;
                } else if (i5 == 12) {
                    i2 = 97;
                } else if (i5 == 13) {
                    i2 = 49;
                } else if (i5 == 14) {
                    i2 = 65;
                } else if (i5 == 15) {
                    i2 = 81;
                } else if (i5 == 16) {
                    i2 = 177;
                } else if (i5 == 17) {
                    i2 = 193;
                } else if (i5 == 18) {
                    i2 = 4;
                } else {
                    i2 = 20;
                    if (i5 != 19) {
                        if (i5 == 20) {
                            i2 = 36;
                        } else if (i5 == 21) {
                            i2 = 4098;
                        } else if (i5 == 22) {
                            i2 = 12290;
                        } else if (i5 == 23) {
                            i2 = 8210;
                        } else if (i5 == 24) {
                            i2 = 4114;
                        } else {
                            if (i5 != 25) {
                                yc.l("Invalid Keyboard Type");
                                return null;
                            }
                            i2 = 12306;
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (df0Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 15) == 1) {
            int i7 = df0Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (df0Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i8 = wz1.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        el.N(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!du1.a || i5 == 7 || i5 == 10 || i5 == 8 || i5 == 23 || i5 == 24 || i5 == 25) {
            el.O(editorInfo, false);
        } else {
            el.O(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(hk.H(h6.n(), h6.A(), h6.x(), h6.z(), h6.B(), h6.C(), h6.D()));
            Class[] clsArr = {h6.n(), h6.A(), h6.x(), h6.z()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(bl.I(i3));
            int i9 = i3;
            for (int i10 = 0; i10 < i9; i10++) {
                linkedHashSet.add(clsArr[i10]);
            }
            editorInfo.setSupportedHandwritingGesturePreviews(linkedHashSet);
        }
        go0 go0Var = ho0.a;
        if (g30.d()) {
            g30.a().i(editorInfo);
        }
        mc1 mc1Var = new mc1(this.h, new qt0(26, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(mc1Var));
        return mc1Var;
    }
}
