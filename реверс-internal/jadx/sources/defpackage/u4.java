package defpackage;

import android.R;
import android.graphics.Matrix;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u4 {
    public static final cm A;
    public static final float A0 = 48.0f;
    public static final cm B;
    public static final cm C;
    public static final cm D;
    public static final cm E;
    public static final cm F;
    public static final cm G;
    public static final cm H;
    public static final cm I;
    public static final cm J;
    public static final cm K;
    public static final cm L;
    public static final cm M;
    public static final cm N;
    public static final cm O;
    public static final cm P;
    public static final cm Q;
    public static final cm R;
    public static final cm S;
    public static final cm T;
    public static final cm U;
    public static final double[][] V;
    public static final double[][] W;
    public static final double[] X;
    public static final double[] Y;
    public static final qt0 Z;
    public static final float a0;
    public static final float b0;
    public static final zc c;
    public static final en1 c0;
    public static final zc d;
    public static final float d0;
    public static final StackTraceElement[] e0;
    public static final cm f0;
    public static final cm g0;
    public static final jo h;
    public static final cm h0;
    public static final s30 i;
    public static final cm i0;
    public static final float j0;
    public static final cm k;
    public static final cm k0;
    public static final cm l;
    public static final float l0;
    public static final cm m;
    public static final cm m0;
    public static final en1 n;
    public static final float n0;
    public static final cm o;
    public static final cm o0;
    public static final float p;
    public static final float p0;
    public static final cm q;
    public static final en1 q0;
    public static final float r;
    public static final float r0;
    public static final cm s;
    public static final cm s0;
    public static final float t;
    public static final float t0;
    public static final cm u;
    public static final float u0;
    public static final float v;
    public static final xz v0;
    public static final cm w;
    public static final t61 w0;
    public static final float x;
    public static final float x0 = 24.0f;
    public static final cm y;
    public static final float y0 = 24.0f;
    public static final float z;
    public static final float z0 = 48.0f;
    public static final rf a = new rf(-1.0f);
    public static final rf b = new rf(1.0f);
    public static final double[][] e = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final om f = new om();
    public static final vm g = new vm();
    public static final kx j = new kx(1.0f, 1.0f);

    static {
        byte b2 = 0;
        c = new zc(b2);
        int i2 = 1;
        d = new zc(i2);
        h = new jo(1694671538, false, new pc(6, b2));
        i = new s30("CLOSED", i2);
        cm cmVar = cm.j;
        k = cmVar;
        cm cmVar2 = cm.m;
        l = cmVar2;
        m = cm.q;
        n = en1.f;
        cm cmVar3 = cm.i;
        o = cmVar3;
        p = 0.38f;
        q = cmVar3;
        r = 0.38f;
        s = cmVar3;
        t = 0.38f;
        u = cmVar3;
        v = 0.38f;
        w = cmVar3;
        x = 0.38f;
        y = cmVar3;
        z = 0.38f;
        cm cmVar4 = cm.e;
        A = cmVar4;
        B = cmVar4;
        C = cmVar3;
        D = cmVar4;
        E = cmVar;
        F = cmVar4;
        G = cmVar4;
        H = cmVar2;
        I = cmVar3;
        J = cmVar2;
        K = cmVar;
        L = cmVar;
        M = cmVar;
        N = cmVar3;
        O = cmVar;
        P = cmVar;
        Q = cmVar;
        R = cmVar;
        S = cmVar;
        T = cmVar;
        U = cmVar;
        V = new double[][]{new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
        W = new double[][]{new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
        X = new double[]{0.2126d, 0.7152d, 0.0722d};
        Y = new double[]{0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
        Z = new qt0(24, new wr(16));
        a0 = 38.0f;
        b0 = 48.0f;
        en1 en1Var = en1.g;
        c0 = en1Var;
        d0 = 48.0f;
        e0 = new StackTraceElement[0];
        f0 = cmVar2;
        cm cmVar5 = cm.o;
        g0 = cmVar5;
        h0 = cmVar2;
        i0 = cmVar3;
        j0 = 0.38f;
        k0 = cmVar3;
        l0 = 0.38f;
        m0 = cmVar3;
        n0 = 0.12f;
        o0 = cmVar2;
        p0 = 44.0f;
        q0 = en1Var;
        r0 = 4.0f;
        s0 = cmVar5;
        t0 = 16.0f;
        u0 = 4.0f;
        v0 = new xz();
        w0 = new t61(25);
    }

    public static final void a(tv0 tv0Var, sa0 sa0Var, ob0 ob0Var, int i2) {
        ob0Var.X(-932836462);
        int i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2 | (ob0Var.h(sa0Var) ? 32 : 16);
        int i4 = 1;
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            qc1.b(ob0Var, pv.i(tv0Var, sa0Var));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fi(i2, i4, tv0Var, sa0Var);
        }
    }

    public static final void b(float f2, sa0 sa0Var, tv0 tv0Var, fl flVar, ob0 ob0Var, int i2) {
        int i3;
        tv0 tv0Var2;
        tv0 tv0Var3;
        sa0Var.getClass();
        ob0Var.X(-1851191671);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f("Menu scale") ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= ob0Var.f(flVar) ? 16384 : 8192;
        }
        if (ob0Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                tv0Var3 = qv0.a;
            } else {
                ob0Var.Q();
                tv0Var3 = tv0Var;
            }
            ob0Var.q();
            boolean z2 = (i4 & 112) == 32;
            Object objK = ob0Var.K();
            if (z2 || objK == kp.a) {
                objK = new r41(f2);
                ob0Var.f0(objK);
            }
            tv0 tv0VarC = tv0Var3.c(ko1.a);
            ys1 ys1Var = mu0.b;
            vu1.a(tv0VarC, ((ju0) ob0Var.j(ys1Var)).c.d, ((ju0) ob0Var.j(ys1Var)).a.G, 0L, lk.d0(858339342, new o8((r41) objK, flVar, sa0Var, 8), ob0Var), ob0Var, 12582912, 120);
            tv0Var2 = tv0Var3;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new oi1(f2, sa0Var, tv0Var2, flVar, i2);
        }
    }

    public static final void c(float[] fArr, float f2, float f3, float[] fArr2) {
        ou0.d(fArr2);
        ou0.i(fArr2, f2, f3);
        p(fArr, fArr2);
    }

    public static final void d(m1 m1Var, rl1 rl1Var) {
        nl1 nl1Var = rl1Var.d;
        zx0 zx0Var = nl1Var.e;
        Object objG = nl1Var.e.g(vl1.z);
        if (objG == null) {
            objG = null;
        }
        yf1 yf1Var = (yf1) objG;
        if (pv.e(rl1Var)) {
            if (yf1Var != null && yf1Var.a == 8) {
                return;
            }
            Object objG2 = zx0Var.g(ml1.y);
            if (objG2 == null) {
                objG2 = null;
            }
            r0 r0Var = (r0) objG2;
            if (r0Var != null) {
                m1Var.a(new g1(r0Var.a, R.id.accessibilityActionPageUp));
            }
            Object objG3 = zx0Var.g(ml1.A);
            if (objG3 == null) {
                objG3 = null;
            }
            r0 r0Var2 = (r0) objG3;
            if (r0Var2 != null) {
                m1Var.a(new g1(r0Var2.a, R.id.accessibilityActionPageDown));
            }
            Object objG4 = zx0Var.g(ml1.z);
            if (objG4 == null) {
                objG4 = null;
            }
            r0 r0Var3 = (r0) objG4;
            if (r0Var3 != null) {
                m1Var.a(new g1(r0Var3.a, R.id.accessibilityActionPageLeft));
            }
            Object objG5 = zx0Var.g(ml1.B);
            r0 r0Var4 = (r0) (objG5 != null ? objG5 : null);
            if (r0Var4 != null) {
                m1Var.a(new g1(r0Var4.a, R.id.accessibilityActionPageRight));
            }
        }
    }

    public static boolean e(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static double f(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static final float g(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final Object h(ek1 ek1Var, long j2, wa0 wa0Var) {
        while (true) {
            if (ek1Var.e >= j2 && !ek1Var.f()) {
                return ek1Var;
            }
            Object objD = ek1Var.d();
            s30 s30Var = i;
            if (objD == s30Var) {
                return s30Var;
            }
            ek1 ek1Var2 = (ek1) ((fq) objD);
            if (ek1Var2 == null) {
                ek1Var2 = (ek1) wa0Var.h(Long.valueOf(ek1Var.e + 1), ek1Var);
                if (ek1Var.i(ek1Var2)) {
                    if (ek1Var.f()) {
                        ek1Var.h();
                    }
                }
            }
            ek1Var = ek1Var2;
        }
    }

    public static final dl i(o62 o62Var) {
        dl dlVar;
        o62Var.getClass();
        synchronized (w0) {
            dlVar = (dl) o62Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (dlVar == null) {
                lt ltVar = d40.e;
                try {
                    lw lwVar = qy.a;
                    ltVar = kt0.a.j;
                } catch (IllegalStateException | o01 unused) {
                }
                dl dlVar2 = new dl(ltVar.j(new qu1(null)));
                o62Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", dlVar2);
                dlVar = dlVar2;
            }
        }
        return dlVar;
    }

    public static double j(double[] dArr) {
        dArr.getClass();
        double[] dArrG = al.G(dArr, V);
        double dF = f(dArrG[0]);
        double dF2 = f(dArrG[1]);
        double dF3 = f(dArrG[2]);
        return Math.atan2(((dF + dF2) - (dF3 * 2.0d)) / 9.0d, ((((-12.0d) * dF2) + (dF * 11.0d)) + dF3) / 11.0d);
    }

    public static final int k(md mdVar, Object obj, int i2) {
        int i3 = mdVar.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iR = wi0.r(i3, i2, mdVar.e);
            if (iR < 0 || xi0.o(obj, mdVar.f[iR])) {
                return iR;
            }
            int i4 = iR + 1;
            while (i4 < i3 && mdVar.e[i4] == i2) {
                if (xi0.o(obj, mdVar.f[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iR - 1; i5 >= 0 && mdVar.e[i5] == i2; i5--) {
                if (xi0.o(obj, mdVar.f[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static double l(double d2) {
        double dAbs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1));
    }

    public static boolean m(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final tv0 n(tv0 tv0Var, qm0 qm0Var) {
        return tv0Var.c(new vy(qm0Var));
    }

    public static final tv0 o(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new p11(sa0Var));
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float fG = g(fArr2, 0, fArr, 0);
        float fG2 = g(fArr2, 0, fArr, 1);
        float fG3 = g(fArr2, 0, fArr, 2);
        float fG4 = g(fArr2, 0, fArr, 3);
        float fG5 = g(fArr2, 1, fArr, 0);
        float fG6 = g(fArr2, 1, fArr, 1);
        float fG7 = g(fArr2, 1, fArr, 2);
        float fG8 = g(fArr2, 1, fArr, 3);
        float fG9 = g(fArr2, 2, fArr, 0);
        float fG10 = g(fArr2, 2, fArr, 1);
        float fG11 = g(fArr2, 2, fArr, 2);
        float fG12 = g(fArr2, 2, fArr, 3);
        float fG13 = g(fArr2, 3, fArr, 0);
        float fG14 = g(fArr2, 3, fArr, 1);
        float fG15 = g(fArr2, 3, fArr, 2);
        float fG16 = g(fArr2, 3, fArr, 3);
        fArr[0] = fG;
        fArr[1] = fG2;
        fArr[2] = fG3;
        fArr[3] = fG4;
        fArr[4] = fG5;
        fArr[5] = fG6;
        fArr[6] = fG7;
        fArr[7] = fG8;
        fArr[8] = fG9;
        fArr[9] = fG10;
        fArr[10] = fG11;
        fArr[11] = fG12;
        fArr[12] = fG13;
        fArr[13] = fG14;
        fArr[14] = fG15;
        fArr[15] = fG16;
    }

    public static final ha q(kg1 kg1Var, p60 p60Var, ob0 ob0Var, int i2) {
        boolean zF = ob0Var.f(p60Var);
        Object objK = ob0Var.K();
        Object obj = kp.a;
        if (zF || objK == obj) {
            objK = new ka(kg1Var, p60Var);
            ob0Var.f0(objK);
        }
        ka kaVar = (ka) objK;
        Object objK2 = ob0Var.K();
        ks ksVar = null;
        if (objK2 == obj) {
            objK2 = nu0.d(-1, 6, null);
            ob0Var.f0(objK2);
        }
        mj mjVar = (mj) objK2;
        int i3 = 0;
        boolean zH = ((((i2 & 14) ^ 6) > 4 && ob0Var.f(kg1Var)) || (i2 & 6) == 4) | ob0Var.h(mjVar);
        Object objK3 = ob0Var.K();
        if (zH || objK3 == obj) {
            objK3 = new ga(mjVar, kg1Var, i3);
            ob0Var.f0(objK3);
        }
        wi0.m((ha0) objK3, ob0Var);
        boolean zH2 = ob0Var.h(mjVar) | ob0Var.f(kaVar);
        Object objK4 = ob0Var.K();
        if (zH2 || objK4 == obj) {
            objK4 = new m6(mjVar, kaVar, ksVar, 2);
            ob0Var.f0(objK4);
        }
        wi0.j(kaVar, mjVar, (wa0) objK4, ob0Var);
        hx hxVar = (hx) ob0Var.j(aq.h);
        kaVar.d = hxVar;
        boolean zF2 = ob0Var.f(hxVar) | ob0Var.f(kaVar);
        Object objK5 = ob0Var.K();
        if (zF2 || objK5 == obj) {
            objK5 = new ha(kaVar);
            ob0Var.f0(objK5);
        }
        return (ha) objK5;
    }

    public static final ja r(kg1 kg1Var, p60 p60Var, ob0 ob0Var, int i2) {
        boolean zF = ob0Var.f(p60Var);
        Object objK = ob0Var.K();
        Object obj = kp.a;
        if (zF || objK == obj) {
            objK = new ea(kg1Var, p60Var);
            ob0Var.f0(objK);
        }
        ea eaVar = (ea) objK;
        Object objK2 = ob0Var.K();
        ks ksVar = null;
        if (objK2 == obj) {
            objK2 = nu0.d(-1, 6, null);
            ob0Var.f0(objK2);
        }
        mj mjVar = (mj) objK2;
        int i3 = 1;
        boolean zH = ((((i2 & 14) ^ 6) > 4 && ob0Var.f(kg1Var)) || (i2 & 6) == 4) | ob0Var.h(mjVar);
        Object objK3 = ob0Var.K();
        if (zH || objK3 == obj) {
            objK3 = new ga(mjVar, kg1Var, i3);
            ob0Var.f0(objK3);
        }
        wi0.m((ha0) objK3, ob0Var);
        boolean zH2 = ob0Var.h(mjVar) | ob0Var.f(eaVar);
        Object objK4 = ob0Var.K();
        if (zH2 || objK4 == obj) {
            objK4 = new m6(mjVar, eaVar, ksVar, 3);
            ob0Var.f0(objK4);
        }
        wi0.j(eaVar, mjVar, (wa0) objK4, ob0Var);
        hx hxVar = (hx) ob0Var.j(aq.h);
        eaVar.d = hxVar;
        boolean zF2 = ob0Var.f(hxVar) | ob0Var.f(eaVar);
        Object objK5 = ob0Var.K();
        if (zF2 || objK5 == obj) {
            objK5 = new ja(eaVar);
            ob0Var.f0(objK5);
        }
        return (ja) objK5;
    }

    public static final void s(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void t(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final long u(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static double v(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }
}
