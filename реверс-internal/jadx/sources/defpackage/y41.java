package defpackage;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class y41 implements pu, f70, ab1, zl, h52 {
    public final /* synthetic */ int e;
    public Object f;

    public y41(int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.f = Build.VERSION.SDK_INT >= 28 ? new t61(2) : new t61(3);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = new qs0();
                break;
            case el.a /* 9 */:
                this.f = xc.B(Boolean.FALSE);
                break;
            case el.b /* 10 */:
                this.f = new Region();
                break;
            case 24:
                this.f = new ft0();
                break;
            default:
                this.f = new ArrayList(32);
                break;
        }
    }

    public void A(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f).add(new p51(f, f2, f3, f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(mj mjVar, ha0 ha0Var) {
        ho1 ho1Var;
        im1 im1Var;
        int i;
        if (((bp) this.f) == null) {
            e91.b("Called runAndWatch on a manager that has been disposed of");
        }
        bp bpVar = (bp) this.f;
        if ((bpVar instanceof ho1) && (im1Var = (ho1Var = (ho1) bpVar).f) != null && !im1Var.equals(mjVar)) {
            ax0 ax0Var = new ax0();
            im1 im1Var2 = ho1Var.f;
            if (im1Var2 == null) {
                e91.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            ay0 ay0Var = ho1Var.d;
            ArrayList arrayList = ax0Var.c;
            if (ay0Var == null) {
                Object obj = ho1Var.b;
                obj.getClass();
                arrayList.add(new xw0(obj, im1Var2));
            } else {
                Object[] objArr = ay0Var.b;
                long[] jArr = ay0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new xw0(objArr[(i2 << 3) + i5], im1Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            ax0Var.d();
            ho1Var.e();
            this.f = ax0Var;
        }
        bp bpVar2 = (bp) this.f;
        bpVar2.getClass();
        sp1 sp1VarU = aq1.j().u(bpVar2.g(mjVar));
        bpVar2.c(mjVar);
        try {
            sp1 sp1VarJ = sp1VarU.j();
            try {
                Object objA = ha0Var.a();
                sp1VarU.c();
                bpVar2.d();
                return objA;
            } finally {
                sp1.q(sp1VarJ);
            }
        } catch (Throwable th) {
            sp1VarU.c();
            throw th;
        }
    }

    public void C(sh0 sh0Var) {
        ((Region) this.f).set(sh0Var.a, sh0Var.b, sh0Var.c, sh0Var.d);
    }

    public void D() {
        View viewFindViewById;
        View view = (View) this.f;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new p(10, viewFindViewById));
    }

    public void E(float f) {
        ((ArrayList) this.f).add(new s51(f));
    }

    public void F(float f) {
        ((ArrayList) this.f).add(new r51(f));
    }

    @Override // defpackage.h52, defpackage.e52
    public boolean a() {
        ((vu) this.f).getClass();
        return false;
    }

    @Override // defpackage.e52
    public long b(cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.f).b(cbVar, cbVar2, cbVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // defpackage.f70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(g70 g70Var, ks ksVar) throws Throwable {
        u uVar;
        yg1 yg1Var;
        int i = this.e;
        wt wtVar = wt.e;
        int i2 = 1;
        t32 t32Var = t32.a;
        switch (i) {
            case t91.LONG_FIELD_NUMBER /* 4 */:
                Object objC = ((xg0) this.f).c(new av(g70Var, i2), ksVar);
                return objC == wtVar ? objC : t32Var;
            default:
                if (ksVar instanceof u) {
                    uVar = (u) ksVar;
                    int i3 = uVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        uVar = new u(this, ksVar);
                    }
                }
                Object obj = uVar.i;
                int i4 = uVar.k;
                if (i4 != 0) {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yg1Var = uVar.h;
                    try {
                        xc.G(obj);
                        yg1Var.r();
                        return t32Var;
                    } catch (Throwable th) {
                        th = th;
                        yg1Var.r();
                        throw th;
                    }
                }
                xc.G(obj);
                lt ltVar = uVar.f;
                ltVar.getClass();
                yg1 yg1Var2 = new yg1(g70Var, ltVar);
                try {
                    uVar.h = yg1Var2;
                    uVar.k = 1;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Object objH = ((wa0) this.f).h(yg1Var2, uVar);
                    if (objH != wtVar) {
                        objH = t32Var;
                    }
                    if (objH == wtVar) {
                        return wtVar;
                    }
                    yg1Var = yg1Var2;
                    yg1Var.r();
                    return t32Var;
                } catch (Throwable th3) {
                    th = th3;
                    yg1Var = yg1Var2;
                    yg1Var.r();
                    throw th;
                }
        }
    }

    @Override // defpackage.zl
    public long d() {
        return ((vf1) this.f).c;
    }

    @Override // defpackage.ab1
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case el.a /* 9 */:
            default:
                str = "";
                break;
            case el.b /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    @Override // defpackage.pu
    public Object g(wa0 wa0Var, ls lsVar) {
        return ((pu) this.f).g(new h91(wa0Var, null, 0), lsVar);
    }

    @Override // defpackage.pu
    public f70 h() {
        return ((pu) this.f).h();
    }

    public long j(long j) {
        ft0 ft0Var = (ft0) this.f;
        ft0Var.getClass();
        if (o52.b(j) <= 0.0f || o52.c(j) <= 0.0f) {
            ng0.b("maximumVelocity should be a positive value. You specified=".concat(o52.g(j)));
        }
        return kd1.c(ft0Var.a.c(o52.b(j)), ft0Var.b.c(o52.c(j)));
    }

    @Override // defpackage.e52
    public cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.f).l(j, cbVar, cbVar2, cbVar3);
    }

    public void m() {
        ((ArrayList) this.f).add(b51.c);
    }

    @Override // defpackage.e52
    public cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.f).o(j, cbVar, cbVar2, cbVar3);
    }

    @Override // defpackage.e52
    public cb p(cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.f).p(cbVar, cbVar2, cbVar3);
    }

    public void q(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new c51(f, f2, f3, f4, f5, f6));
    }

    public void r(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new k51(f, f2, f3, f4, f5, f6));
    }

    public y60 s(int i) {
        switch (this.e) {
            case 20:
                return ((c70[]) this.f)[i];
            case 21:
                return (c70) this.f;
            default:
                return (y60) this.f;
        }
    }

    public void t() {
        View view = (View) this.f;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void u(float f) {
        ((ArrayList) this.f).add(new d51(f));
    }

    public void v(float f) {
        ((ArrayList) this.f).add(new l51(f));
    }

    public void w(float f, float f2) {
        ((ArrayList) this.f).add(new e51(f, f2));
    }

    public void x(float f, float f2) {
        ((ArrayList) this.f).add(new m51(f, f2));
    }

    public void y(float f, float f2) {
        ((ArrayList) this.f).add(new f51(f, f2));
    }

    public xg0 z(n81 n81Var, h4 h4Var) {
        long j;
        boolean z;
        long jE;
        qs0 qs0Var = (qs0) this.f;
        List list = (List) n81Var.b;
        qs0 qs0Var2 = new qs0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            o81 o81Var = (o81) list.get(i);
            long j2 = o81Var.a;
            m81 m81Var = (m81) qs0Var.a(j2);
            if (m81Var == null) {
                j = o81Var.b;
                jE = o81Var.d;
                z = false;
            } else {
                long j3 = m81Var.a;
                j = j3;
                z = m81Var.c;
                jE = h4Var.E(m81Var.b);
            }
            long j4 = o81Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            qs0Var2.c(j4, new l81(j4, o81Var.b, o81Var.d, o81Var.e, o81Var.f, j, jE, z, o81Var.g, o81Var.i, o81Var.j, o81Var.k, o81Var.l, o81Var.m));
            boolean z2 = o81Var.e;
            if (z2) {
                qs0Var.c(j2, new m81(o81Var.b, o81Var.c, z2));
            } else {
                qs0Var.d(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new xg0(18, qs0Var2, n81Var);
    }

    public /* synthetic */ y41(int i, boolean z) {
        this.e = i;
    }

    public /* synthetic */ y41(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public y41(hx hxVar) {
        this.e = 16;
        this.f = new u60(er1.a, hxVar);
    }

    public y41(View view) {
        this.e = 15;
        if (Build.VERSION.SDK_INT >= 30) {
            tq1 tq1Var = new tq1(14, view);
            tq1Var.g = view;
            this.f = tq1Var;
            return;
        }
        this.f = new y41(14, view);
    }

    public y41(long[] jArr) {
        kx0 kx0Var;
        this.e = 13;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            kx0Var = new kx0(jArrCopyOf.length);
            int i = kx0Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = kx0Var.a;
                    if (jArr2.length < length) {
                        kx0Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = kx0Var.a;
                    int i2 = kx0Var.b;
                    if (i != i2) {
                        nd.L(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    nd.L(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    kx0Var.b += jArrCopyOf.length;
                }
            } else {
                yc.o("");
                throw null;
            }
        } else {
            kx0Var = new kx0();
        }
        this.f = kx0Var;
    }

    public y41(float f, float f2, cb cbVar) {
        y41 y41Var;
        this.e = 23;
        int[] iArr = f52.a;
        if (cbVar != null) {
            y41Var = new y41(cbVar, f, f2);
        } else {
            y41Var = new y41(f, f2);
        }
        this.f = new vu(y41Var);
    }

    public y41(cb cbVar, float f, float f2) {
        this.e = 20;
        int iB = cbVar.b();
        c70[] c70VarArr = new c70[iB];
        for (int i = 0; i < iB; i++) {
            c70VarArr[i] = new c70(f, f2, cbVar.a(i));
        }
        this.f = c70VarArr;
    }

    public y41(float f, float f2) {
        this.e = 21;
        this.f = new c70(f, f2, 0.01f);
    }

    public y41(SideSheetBehavior sideSheetBehavior) {
        this.e = 11;
        this.f = sideSheetBehavior;
        new p(9, this);
    }
}
