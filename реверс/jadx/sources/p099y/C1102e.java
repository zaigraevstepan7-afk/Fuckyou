package p099y;

import android.view.ViewGroup;
import p093v.C1063d;
import p093v.C1067h;

/* JADX INFO: renamed from: y.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1102e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f4599A;

    /* JADX INFO: renamed from: B */
    public int f4600B;

    /* JADX INFO: renamed from: C */
    public int f4601C;

    /* JADX INFO: renamed from: D */
    public int f4602D;

    /* JADX INFO: renamed from: E */
    public float f4603E;

    /* JADX INFO: renamed from: F */
    public float f4604F;

    /* JADX INFO: renamed from: G */
    public String f4605G;

    /* JADX INFO: renamed from: H */
    public float f4606H;

    /* JADX INFO: renamed from: I */
    public float f4607I;

    /* JADX INFO: renamed from: J */
    public int f4608J;

    /* JADX INFO: renamed from: K */
    public int f4609K;

    /* JADX INFO: renamed from: L */
    public int f4610L;

    /* JADX INFO: renamed from: M */
    public int f4611M;

    /* JADX INFO: renamed from: N */
    public int f4612N;

    /* JADX INFO: renamed from: O */
    public int f4613O;

    /* JADX INFO: renamed from: P */
    public int f4614P;

    /* JADX INFO: renamed from: Q */
    public int f4615Q;

    /* JADX INFO: renamed from: R */
    public float f4616R;

    /* JADX INFO: renamed from: S */
    public float f4617S;

    /* JADX INFO: renamed from: T */
    public int f4618T;

    /* JADX INFO: renamed from: U */
    public int f4619U;

    /* JADX INFO: renamed from: V */
    public int f4620V;

    /* JADX INFO: renamed from: W */
    public boolean f4621W;

    /* JADX INFO: renamed from: X */
    public boolean f4622X;

    /* JADX INFO: renamed from: Y */
    public String f4623Y;

    /* JADX INFO: renamed from: Z */
    public int f4624Z;

    /* JADX INFO: renamed from: a */
    public int f4625a;

    /* JADX INFO: renamed from: a0 */
    public boolean f4626a0;

    /* JADX INFO: renamed from: b */
    public int f4627b;

    /* JADX INFO: renamed from: b0 */
    public boolean f4628b0;

    /* JADX INFO: renamed from: c */
    public float f4629c;

    /* JADX INFO: renamed from: c0 */
    public boolean f4630c0;

    /* JADX INFO: renamed from: d */
    public boolean f4631d;

    /* JADX INFO: renamed from: d0 */
    public boolean f4632d0;

    /* JADX INFO: renamed from: e */
    public int f4633e;

    /* JADX INFO: renamed from: e0 */
    public boolean f4634e0;

    /* JADX INFO: renamed from: f */
    public int f4635f;

    /* JADX INFO: renamed from: f0 */
    public int f4636f0;

    /* JADX INFO: renamed from: g */
    public int f4637g;

    /* JADX INFO: renamed from: g0 */
    public int f4638g0;

    /* JADX INFO: renamed from: h */
    public int f4639h;

    /* JADX INFO: renamed from: h0 */
    public int f4640h0;

    /* JADX INFO: renamed from: i */
    public int f4641i;

    /* JADX INFO: renamed from: i0 */
    public int f4642i0;

    /* JADX INFO: renamed from: j */
    public int f4643j;

    /* JADX INFO: renamed from: j0 */
    public int f4644j0;

    /* JADX INFO: renamed from: k */
    public int f4645k;

    /* JADX INFO: renamed from: k0 */
    public int f4646k0;

    /* JADX INFO: renamed from: l */
    public int f4647l;

    /* JADX INFO: renamed from: l0 */
    public float f4648l0;

    /* JADX INFO: renamed from: m */
    public int f4649m;

    /* JADX INFO: renamed from: m0 */
    public int f4650m0;

    /* JADX INFO: renamed from: n */
    public int f4651n;

    /* JADX INFO: renamed from: n0 */
    public int f4652n0;

    /* JADX INFO: renamed from: o */
    public int f4653o;

    /* JADX INFO: renamed from: o0 */
    public float f4654o0;

    /* JADX INFO: renamed from: p */
    public int f4655p;

    /* JADX INFO: renamed from: p0 */
    public C1063d f4656p0;

    /* JADX INFO: renamed from: q */
    public int f4657q;

    /* JADX INFO: renamed from: r */
    public float f4658r;

    /* JADX INFO: renamed from: s */
    public int f4659s;

    /* JADX INFO: renamed from: t */
    public int f4660t;

    /* JADX INFO: renamed from: u */
    public int f4661u;

    /* JADX INFO: renamed from: v */
    public int f4662v;

    /* JADX INFO: renamed from: w */
    public int f4663w;

    /* JADX INFO: renamed from: x */
    public int f4664x;

    /* JADX INFO: renamed from: y */
    public int f4665y;

    /* JADX INFO: renamed from: z */
    public int f4666z;

    /* JADX INFO: renamed from: a */
    public final void m2739a() {
        this.f4632d0 = false;
        this.f4626a0 = true;
        this.f4628b0 = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.f4621W) {
            this.f4626a0 = false;
            if (this.f4610L == 0) {
                this.f4610L = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f4622X) {
            this.f4628b0 = false;
            if (this.f4611M == 0) {
                this.f4611M = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4626a0 = false;
            if (i2 == 0 && this.f4610L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4621W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f4628b0 = false;
            if (i3 == 0 && this.f4611M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4622X = true;
            }
        }
        if (this.f4629c == -1.0f && this.f4625a == -1 && this.f4627b == -1) {
            return;
        }
        this.f4632d0 = true;
        this.f4626a0 = true;
        this.f4628b0 = true;
        if (!(this.f4656p0 instanceof C1067h)) {
            this.f4656p0 = new C1067h();
        }
        ((C1067h) this.f4656p0).m2644S(this.f4620V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i2);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f4640h0 = -1;
        this.f4642i0 = -1;
        this.f4636f0 = -1;
        this.f4638g0 = -1;
        this.f4644j0 = this.f4663w;
        this.f4646k0 = this.f4665y;
        float f = this.f4603E;
        this.f4648l0 = f;
        int i9 = this.f4625a;
        this.f4650m0 = i9;
        int i10 = this.f4627b;
        this.f4652n0 = i10;
        float f2 = this.f4629c;
        this.f4654o0 = f2;
        if (z3) {
            int i11 = this.f4659s;
            if (i11 != -1) {
                this.f4640h0 = i11;
            } else {
                int i12 = this.f4660t;
                if (i12 != -1) {
                    this.f4642i0 = i12;
                }
                i3 = this.f4661u;
                if (i3 != -1) {
                    this.f4638g0 = i3;
                    z2 = true;
                }
                i4 = this.f4662v;
                if (i4 != -1) {
                    this.f4636f0 = i4;
                    z2 = true;
                }
                i5 = this.f4599A;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4646k0 = i5;
                }
                i6 = this.f4600B;
                if (i6 != Integer.MIN_VALUE) {
                    this.f4644j0 = i6;
                }
                if (z2) {
                    this.f4648l0 = 1.0f - f;
                }
                if (this.f4632d0 && this.f4620V == 1 && this.f4631d) {
                    if (f2 == -1.0f) {
                        this.f4654o0 = 1.0f - f2;
                        this.f4650m0 = -1;
                        this.f4652n0 = -1;
                    } else if (i9 != -1) {
                        this.f4652n0 = i9;
                        this.f4650m0 = -1;
                        this.f4654o0 = -1.0f;
                    } else if (i10 != -1) {
                        this.f4650m0 = i10;
                        this.f4652n0 = -1;
                        this.f4654o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i3 = this.f4661u;
            if (i3 != -1) {
            }
            i4 = this.f4662v;
            if (i4 != -1) {
            }
            i5 = this.f4599A;
            if (i5 != Integer.MIN_VALUE) {
            }
            i6 = this.f4600B;
            if (i6 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4632d0) {
                if (f2 == -1.0f) {
                }
            }
        } else {
            int i13 = this.f4659s;
            if (i13 != -1) {
                this.f4638g0 = i13;
            }
            int i14 = this.f4660t;
            if (i14 != -1) {
                this.f4636f0 = i14;
            }
            int i15 = this.f4661u;
            if (i15 != -1) {
                this.f4640h0 = i15;
            }
            int i16 = this.f4662v;
            if (i16 != -1) {
                this.f4642i0 = i16;
            }
            int i17 = this.f4599A;
            if (i17 != Integer.MIN_VALUE) {
                this.f4644j0 = i17;
            }
            int i18 = this.f4600B;
            if (i18 != Integer.MIN_VALUE) {
                this.f4646k0 = i18;
            }
        }
        if (this.f4661u == -1 && this.f4662v == -1 && this.f4660t == -1 && this.f4659s == -1) {
            int i19 = this.f4637g;
            if (i19 != -1) {
                this.f4640h0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                }
            } else {
                int i20 = this.f4639h;
                if (i20 != -1) {
                    this.f4642i0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                    }
                }
            }
            int i21 = this.f4633e;
            if (i21 != -1) {
                this.f4636f0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                return;
            }
            int i22 = this.f4635f;
            if (i22 != -1) {
                this.f4638g0 = i22;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
            }
        }
    }
}
