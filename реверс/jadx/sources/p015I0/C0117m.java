package p015I0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p001A0.AbstractC0016e;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: I0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0117m {

    /* JADX INFO: renamed from: a */
    public AbstractC0016e f383a = new C0115k();

    /* JADX INFO: renamed from: b */
    public AbstractC0016e f384b = new C0115k();

    /* JADX INFO: renamed from: c */
    public AbstractC0016e f385c = new C0115k();

    /* JADX INFO: renamed from: d */
    public AbstractC0016e f386d = new C0115k();

    /* JADX INFO: renamed from: e */
    public InterfaceC0107c f387e = new C0105a(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC0107c f388f = new C0105a(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC0107c f389g = new C0105a(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC0107c f390h = new C0105a(0.0f);

    /* JADX INFO: renamed from: i */
    public C0109e f391i = new C0109e(0);

    /* JADX INFO: renamed from: j */
    public C0109e f392j = new C0109e(0);

    /* JADX INFO: renamed from: k */
    public C0109e f393k = new C0109e(0);

    /* JADX INFO: renamed from: l */
    public C0109e f394l = new C0109e(0);

    /* JADX INFO: renamed from: a */
    public static C0116l m491a(Context context, int i2, int i3, C0105a c0105a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1013a.f4044z);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(1, i4);
            InterfaceC0107c interfaceC0107cM493c = m493c(typedArrayObtainStyledAttributes, 5, c0105a);
            InterfaceC0107c interfaceC0107cM493c2 = m493c(typedArrayObtainStyledAttributes, 8, interfaceC0107cM493c);
            InterfaceC0107c interfaceC0107cM493c3 = m493c(typedArrayObtainStyledAttributes, 9, interfaceC0107cM493c);
            InterfaceC0107c interfaceC0107cM493c4 = m493c(typedArrayObtainStyledAttributes, 7, interfaceC0107cM493c);
            InterfaceC0107c interfaceC0107cM493c5 = m493c(typedArrayObtainStyledAttributes, 6, interfaceC0107cM493c);
            C0116l c0116l = new C0116l();
            AbstractC0016e abstractC0016eM198t = AbstractC0016e.m198t(i5);
            c0116l.f371a = abstractC0016eM198t;
            C0116l.m488b(abstractC0016eM198t);
            c0116l.f375e = interfaceC0107cM493c2;
            AbstractC0016e abstractC0016eM198t2 = AbstractC0016e.m198t(i6);
            c0116l.f372b = abstractC0016eM198t2;
            C0116l.m488b(abstractC0016eM198t2);
            c0116l.f376f = interfaceC0107cM493c3;
            AbstractC0016e abstractC0016eM198t3 = AbstractC0016e.m198t(i7);
            c0116l.f373c = abstractC0016eM198t3;
            C0116l.m488b(abstractC0016eM198t3);
            c0116l.f377g = interfaceC0107cM493c4;
            AbstractC0016e abstractC0016eM198t4 = AbstractC0016e.m198t(i8);
            c0116l.f374d = abstractC0016eM198t4;
            C0116l.m488b(abstractC0016eM198t4);
            c0116l.f378h = interfaceC0107cM493c5;
            return c0116l;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0116l m492b(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0105a c0105a = new C0105a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4037s, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m491a(context, resourceId, resourceId2, c0105a);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0107c m493c(TypedArray typedArray, int i2, InterfaceC0107c interfaceC0107c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new C0105a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new C0114j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0107c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m494d(RectF rectF) {
        boolean z2 = this.f394l.getClass().equals(C0109e.class) && this.f392j.getClass().equals(C0109e.class) && this.f391i.getClass().equals(C0109e.class) && this.f393k.getClass().equals(C0109e.class);
        float fMo453a = this.f387e.mo453a(rectF);
        return z2 && ((this.f388f.mo453a(rectF) > fMo453a ? 1 : (this.f388f.mo453a(rectF) == fMo453a ? 0 : -1)) == 0 && (this.f390h.mo453a(rectF) > fMo453a ? 1 : (this.f390h.mo453a(rectF) == fMo453a ? 0 : -1)) == 0 && (this.f389g.mo453a(rectF) > fMo453a ? 1 : (this.f389g.mo453a(rectF) == fMo453a ? 0 : -1)) == 0) && ((this.f384b instanceof C0115k) && (this.f383a instanceof C0115k) && (this.f385c instanceof C0115k) && (this.f386d instanceof C0115k));
    }

    /* JADX INFO: renamed from: e */
    public final C0116l m495e() {
        C0116l c0116l = new C0116l();
        c0116l.f371a = this.f383a;
        c0116l.f372b = this.f384b;
        c0116l.f373c = this.f385c;
        c0116l.f374d = this.f386d;
        c0116l.f375e = this.f387e;
        c0116l.f376f = this.f388f;
        c0116l.f377g = this.f389g;
        c0116l.f378h = this.f390h;
        c0116l.f379i = this.f391i;
        c0116l.f380j = this.f392j;
        c0116l.f381k = this.f393k;
        c0116l.f382l = this.f394l;
        return c0116l;
    }
}
