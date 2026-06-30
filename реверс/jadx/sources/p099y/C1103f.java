package p099y;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p089t.AbstractC1048e;
import p093v.AbstractC1069j;
import p093v.C1062c;
import p093v.C1063d;
import p093v.C1064e;
import p093v.C1066g;
import p095w.C1076b;

/* JADX INFO: renamed from: y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1103f {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f4667a;

    /* JADX INFO: renamed from: b */
    public int f4668b;

    /* JADX INFO: renamed from: c */
    public int f4669c;

    /* JADX INFO: renamed from: d */
    public int f4670d;

    /* JADX INFO: renamed from: e */
    public int f4671e;

    /* JADX INFO: renamed from: f */
    public int f4672f;

    /* JADX INFO: renamed from: g */
    public int f4673g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f4674h;

    public C1103f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4674h = constraintLayout;
        this.f4667a = constraintLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2740a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2741b(C1063d c1063d, C1076b c1076b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iM2545a;
        int iMakeMeasureSpec3;
        C1064e c1064e;
        int baseline;
        int iMax;
        int iMax2;
        int i2;
        if (c1063d == null) {
            return;
        }
        if (c1063d.f4312g0 == 8) {
            c1076b.f4438e = 0;
            c1076b.f4439f = 0;
            c1076b.f4440g = 0;
            return;
        }
        if (c1063d.f4292T == null) {
            return;
        }
        C1116s c1116s = ConstraintLayout.f1419p;
        ConstraintLayout constraintLayout = this.f4674h;
        int i3 = c1076b.f4434a;
        int i4 = c1076b.f4435b;
        int i5 = c1076b.f4436c;
        int i6 = c1076b.f4437d;
        int i7 = this.f4668b + this.f4669c;
        int i8 = this.f4670d;
        View view = c1063d.f4310f0;
        int iM2545a2 = AbstractC1048e.m2545a(i3);
        C1062c c1062c = c1063d.f4283K;
        C1062c c1062c2 = c1063d.f4281I;
        if (iM2545a2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iM2545a2 == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4672f, i8, -2);
        } else {
            if (iM2545a2 != 2) {
                if (iM2545a2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i9 = this.f4672f;
                    int i10 = c1062c2 != null ? c1062c2.f4270g : 0;
                    if (c1062c != null) {
                        i10 += c1062c.f4270g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, i8 + i10, -1);
                }
                iM2545a = AbstractC1048e.m2545a(i4);
                if (iM2545a != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else if (iM2545a == 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f4673g, i7, -2);
                } else if (iM2545a == 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f4673g, i7, -2);
                    boolean z2 = c1063d.f4333s == 1;
                    int i11 = c1076b.f4443j;
                    if (i11 == 1 || i11 == 2) {
                        boolean z3 = view.getMeasuredWidth() == c1063d.m2617q();
                        if (c1076b.f4443j == 2 || !z2 || ((z2 && z3) || c1063d.mo2571B())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1063d.m2613k(), 1073741824);
                        }
                    }
                } else if (iM2545a != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i12 = this.f4673g;
                    int i13 = c1062c2 != null ? c1063d.f4282J.f4270g : 0;
                    if (c1062c != null) {
                        i13 += c1063d.f4284L.f4270g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i12, i7 + i13, -1);
                }
                c1064e = (C1064e) c1063d.f4292T;
                if (c1064e == null && AbstractC1069j.m2648c(constraintLayout.f1428i, 256) && view.getMeasuredWidth() == c1063d.m2617q() && view.getMeasuredWidth() < c1064e.m2617q() && view.getMeasuredHeight() == c1063d.m2613k() && view.getMeasuredHeight() < c1064e.m2613k() && view.getBaseline() == c1063d.f4300a0 && !c1063d.m2626z() && m2740a(c1063d.f4279G, iMakeMeasureSpec2, c1063d.m2617q()) && m2740a(c1063d.f4280H, iMakeMeasureSpec3, c1063d.m2613k())) {
                    c1076b.f4438e = c1063d.m2617q();
                    c1076b.f4439f = c1063d.m2613k();
                    c1076b.f4440g = c1063d.f4300a0;
                    return;
                }
                boolean z4 = i3 != 3;
                boolean z5 = i4 != 3;
                boolean z6 = i4 != 4 || i4 == 1;
                boolean z7 = i3 != 4 || i3 == 1;
                boolean z8 = !z4 && c1063d.f4295W > 0.0f;
                boolean z9 = !z5 && c1063d.f4295W > 0.0f;
                if (view != null) {
                    return;
                }
                C1102e c1102e = (C1102e) view.getLayoutParams();
                int i14 = c1076b.f4443j;
                if (i14 != 1 && i14 != 2 && z4 && c1063d.f4332r == 0 && z5 && c1063d.f4333s == 0) {
                    iMax2 = 0;
                    i2 = -1;
                    baseline = 0;
                    iMax = 0;
                } else {
                    if ((view instanceof AbstractC1117t) && (c1063d instanceof C1066g)) {
                        ((AbstractC1117t) view).mo1242j((C1066g) c1063d, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    c1063d.f4279G = iMakeMeasureSpec2;
                    c1063d.f4280H = iMakeMeasureSpec3;
                    c1063d.f4311g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i15 = c1063d.f4335u;
                    iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
                    int i16 = c1063d.f4336v;
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    int i17 = c1063d.f4338x;
                    iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
                    boolean z10 = z9;
                    int i18 = c1063d.f4339y;
                    if (i18 > 0) {
                        iMax2 = Math.min(i18, iMax2);
                    }
                    if (!AbstractC1069j.m2648c(constraintLayout.f1428i, 1)) {
                        if (z8 && z6) {
                            iMax = (int) ((iMax2 * c1063d.f4295W) + 0.5f);
                        } else if (z10 && z7) {
                            iMax2 = (int) ((iMax / c1063d.f4295W) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMax && measuredHeight == iMax2) {
                        i2 = -1;
                    } else {
                        if (measuredWidth != iMax) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight != iMax2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        c1063d.f4279G = iMakeMeasureSpec2;
                        c1063d.f4280H = iMakeMeasureSpec3;
                        c1063d.f4311g = false;
                        iMax = view.getMeasuredWidth();
                        iMax2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i2 = -1;
                    }
                }
                boolean z11 = baseline != i2;
                c1076b.f4442i = (iMax == c1076b.f4436c && iMax2 == c1076b.f4437d) ? false : true;
                if (c1102e.f4630c0) {
                    z11 = true;
                }
                if (z11 && baseline != -1 && c1063d.f4300a0 != baseline) {
                    c1076b.f4442i = true;
                }
                c1076b.f4438e = iMax;
                c1076b.f4439f = iMax2;
                c1076b.f4441h = z11;
                c1076b.f4440g = baseline;
                return;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4672f, i8, -2);
            boolean z12 = c1063d.f4332r == 1;
            int i19 = c1076b.f4443j;
            if (i19 == 1 || i19 == 2) {
                boolean z13 = view.getMeasuredHeight() == c1063d.m2613k();
                if (c1076b.f4443j == 2 || !z12 || ((z12 && z13) || c1063d.mo2570A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1063d.m2617q(), 1073741824);
                }
            }
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iM2545a = AbstractC1048e.m2545a(i4);
        if (iM2545a != 0) {
        }
        c1064e = (C1064e) c1063d.f4292T;
        if (c1064e == null) {
        }
        if (i3 != 3) {
        }
        if (i4 != 3) {
        }
        if (i4 != 4) {
        }
        if (i3 != 4) {
        }
        if (z4) {
        }
        if (z5) {
        }
        if (view != null) {
        }
    }
}
