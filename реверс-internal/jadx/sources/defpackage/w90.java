package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w90 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile dr1 b = new dr1();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new x90(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new x90(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new x90(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new x90(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new x90(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.e[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        pg0.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static v90 a(float f) {
        float f2;
        v90 x90Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        v90 v90Var = (v90) b.b(i);
        if (v90Var != null) {
            return v90Var;
        }
        dr1 dr1Var = b;
        int iR = wi0.r(dr1Var.g, i, dr1Var.e);
        if (iR >= 0) {
            return (v90) b.d(iR);
        }
        int i2 = -(iR + 1);
        int i3 = i2 - 1;
        if (i2 >= b.g) {
            x90 x90Var2 = new x90(new float[]{1.0f}, new float[]{f});
            b(f, x90Var2);
            return x90Var2;
        }
        if (i3 < 0) {
            x90Var = new x90(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.e[i3] / 100.0f;
            x90Var = (v90) b.d(i3);
        }
        float f3 = b.e[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        v90 v90Var2 = (v90) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = x90Var.b(f4);
            fArr2[i4] = ((v90Var2.b(f4) - fB) * fMax) + fB;
        }
        x90 x90Var3 = new x90(fArr, fArr2);
        b(f, x90Var3);
        return x90Var3;
    }

    public static void b(float f, x90 x90Var) {
        synchronized (c) {
            dr1 dr1VarA = b.clone();
            dr1VarA.c((int) (f * 100.0f), x90Var);
            b = dr1VarA;
        }
    }
}
