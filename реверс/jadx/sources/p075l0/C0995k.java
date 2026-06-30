package p075l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p084q.C1027f;

/* JADX INFO: renamed from: l0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0995k extends AbstractC0996l {

    /* JADX INFO: renamed from: a */
    public final Matrix f3930a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3931b;

    /* JADX INFO: renamed from: c */
    public float f3932c;

    /* JADX INFO: renamed from: d */
    public float f3933d;

    /* JADX INFO: renamed from: e */
    public float f3934e;

    /* JADX INFO: renamed from: f */
    public float f3935f;

    /* JADX INFO: renamed from: g */
    public float f3936g;

    /* JADX INFO: renamed from: h */
    public float f3937h;

    /* JADX INFO: renamed from: i */
    public float f3938i;

    /* JADX INFO: renamed from: j */
    public final Matrix f3939j;

    /* JADX INFO: renamed from: k */
    public String f3940k;

    public C0995k() {
        this.f3930a = new Matrix();
        this.f3931b = new ArrayList();
        this.f3932c = 0.0f;
        this.f3933d = 0.0f;
        this.f3934e = 0.0f;
        this.f3935f = 1.0f;
        this.f3936g = 1.0f;
        this.f3937h = 0.0f;
        this.f3938i = 0.0f;
        this.f3939j = new Matrix();
        this.f3940k = null;
    }

    @Override // p075l0.AbstractC0996l
    /* JADX INFO: renamed from: a */
    public final boolean mo2442a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3931b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0996l) arrayList.get(i2)).mo2442a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // p075l0.AbstractC0996l
    /* JADX INFO: renamed from: b */
    public final boolean mo2443b(int[] iArr) {
        int i2 = 0;
        boolean zMo2443b = false;
        while (true) {
            ArrayList arrayList = this.f3931b;
            if (i2 >= arrayList.size()) {
                return zMo2443b;
            }
            zMo2443b |= ((AbstractC0996l) arrayList.get(i2)).mo2443b(iArr);
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2444c() {
        Matrix matrix = this.f3939j;
        matrix.reset();
        matrix.postTranslate(-this.f3933d, -this.f3934e);
        matrix.postScale(this.f3935f, this.f3936g);
        matrix.postRotate(this.f3932c, 0.0f, 0.0f);
        matrix.postTranslate(this.f3937h + this.f3933d, this.f3938i + this.f3934e);
    }

    public String getGroupName() {
        return this.f3940k;
    }

    public Matrix getLocalMatrix() {
        return this.f3939j;
    }

    public float getPivotX() {
        return this.f3933d;
    }

    public float getPivotY() {
        return this.f3934e;
    }

    public float getRotation() {
        return this.f3932c;
    }

    public float getScaleX() {
        return this.f3935f;
    }

    public float getScaleY() {
        return this.f3936g;
    }

    public float getTranslateX() {
        return this.f3937h;
    }

    public float getTranslateY() {
        return this.f3938i;
    }

    public void setPivotX(float f) {
        if (f != this.f3933d) {
            this.f3933d = f;
            m2444c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f3934e) {
            this.f3934e = f;
            m2444c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f3932c) {
            this.f3932c = f;
            m2444c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f3935f) {
            this.f3935f = f;
            m2444c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f3936g) {
            this.f3936g = f;
            m2444c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f3937h) {
            this.f3937h = f;
            m2444c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f3938i) {
            this.f3938i = f;
            m2444c();
        }
    }

    public C0995k(C0995k c0995k, C1027f c1027f) {
        AbstractC0997m c0993i;
        this.f3930a = new Matrix();
        this.f3931b = new ArrayList();
        this.f3932c = 0.0f;
        this.f3933d = 0.0f;
        this.f3934e = 0.0f;
        this.f3935f = 1.0f;
        this.f3936g = 1.0f;
        this.f3937h = 0.0f;
        this.f3938i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3939j = matrix;
        this.f3940k = null;
        this.f3932c = c0995k.f3932c;
        this.f3933d = c0995k.f3933d;
        this.f3934e = c0995k.f3934e;
        this.f3935f = c0995k.f3935f;
        this.f3936g = c0995k.f3936g;
        this.f3937h = c0995k.f3937h;
        this.f3938i = c0995k.f3938i;
        String str = c0995k.f3940k;
        this.f3940k = str;
        if (str != null) {
            c1027f.put(str, this);
        }
        matrix.set(c0995k.f3939j);
        ArrayList arrayList = c0995k.f3931b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C0995k) {
                this.f3931b.add(new C0995k((C0995k) obj, c1027f));
            } else {
                if (obj instanceof C0994j) {
                    C0994j c0994j = (C0994j) obj;
                    C0994j c0994j2 = new C0994j(c0994j);
                    c0994j2.f3920e = 0.0f;
                    c0994j2.f3922g = 1.0f;
                    c0994j2.f3923h = 1.0f;
                    c0994j2.f3924i = 0.0f;
                    c0994j2.f3925j = 1.0f;
                    c0994j2.f3926k = 0.0f;
                    c0994j2.f3927l = Paint.Cap.BUTT;
                    c0994j2.f3928m = Paint.Join.MITER;
                    c0994j2.f3929n = 4.0f;
                    c0994j2.f3919d = c0994j.f3919d;
                    c0994j2.f3920e = c0994j.f3920e;
                    c0994j2.f3922g = c0994j.f3922g;
                    c0994j2.f3921f = c0994j.f3921f;
                    c0994j2.f3943c = c0994j.f3943c;
                    c0994j2.f3923h = c0994j.f3923h;
                    c0994j2.f3924i = c0994j.f3924i;
                    c0994j2.f3925j = c0994j.f3925j;
                    c0994j2.f3926k = c0994j.f3926k;
                    c0994j2.f3927l = c0994j.f3927l;
                    c0994j2.f3928m = c0994j.f3928m;
                    c0994j2.f3929n = c0994j.f3929n;
                    c0993i = c0994j2;
                } else if (obj instanceof C0993i) {
                    c0993i = new C0993i((C0993i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3931b.add(c0993i);
                Object obj2 = c0993i.f3942b;
                if (obj2 != null) {
                    c1027f.put(obj2, c0993i);
                }
            }
        }
    }
}
