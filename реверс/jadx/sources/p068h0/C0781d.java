package p068h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p036T.AbstractC0372b;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p074l.AbstractC0966r0;
import p074l.C0968s;
import p078n.C1009c;
import p078n.C1012f;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0781d {

    /* JADX INFO: renamed from: a */
    public boolean f3152a;

    /* JADX INFO: renamed from: b */
    public boolean f3153b;

    /* JADX INFO: renamed from: c */
    public boolean f3154c;

    /* JADX INFO: renamed from: d */
    public final Object f3155d;

    /* JADX INFO: renamed from: e */
    public Parcelable f3156e;

    /* JADX INFO: renamed from: f */
    public Object f3157f;

    public /* synthetic */ C0781d(TextView textView) {
        this.f3156e = null;
        this.f3157f = null;
        this.f3152a = false;
        this.f3153b = false;
        this.f3155d = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m2128a() {
        CompoundButton compoundButton = (CompoundButton) this.f3155d;
        Drawable drawableM157F = AbstractC0016e.m157F(compoundButton);
        if (drawableM157F != null) {
            if (this.f3152a || this.f3153b) {
                Drawable drawableMutate = AbstractC0016e.m154B0(drawableM157F).mutate();
                if (this.f3152a) {
                    AbstractC0092a.m429h(drawableMutate, (ColorStateList) this.f3156e);
                }
                if (this.f3153b) {
                    AbstractC0092a.m430i(drawableMutate, (PorterDuff.Mode) this.f3157f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2129b() {
        C0968s c0968s = (C0968s) this.f3155d;
        Drawable checkMarkDrawable = c0968s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3152a || this.f3153b) {
                Drawable drawableMutate = AbstractC0016e.m154B0(checkMarkDrawable).mutate();
                if (this.f3152a) {
                    AbstractC0092a.m429h(drawableMutate, (ColorStateList) this.f3156e);
                }
                if (this.f3153b) {
                    AbstractC0092a.m430i(drawableMutate, (PorterDuff.Mode) this.f3157f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0968s.getDrawableState());
                }
                c0968s.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m2130c(String str) {
        if (!this.f3153b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3156e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3156e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3156e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f3156e = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public void m2131d(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3155d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0641a.f2492m;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        AbstractC0240S.m784o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0383m.m1057w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0383m.m1057w(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0383m.m1057w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0372b.m1005c(compoundButton, c0270lM838m.m844g(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0372b.m1006d(compoundButton, AbstractC0966r0.m2415c(typedArray.getInt(3, -1), null));
            }
            c0270lM838m.m851o();
        } catch (Throwable th) {
            c0270lM838m.m851o();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2132e(String str, InterfaceC0780c interfaceC0780c) {
        Object obj;
        C1012f c1012f = (C1012f) this.f3155d;
        C1009c c1009cMo2457a = c1012f.mo2457a(str);
        if (c1009cMo2457a != null) {
            obj = c1009cMo2457a.f4001b;
        } else {
            C1009c c1009c = new C1009c(str, interfaceC0780c);
            c1012f.f4010d++;
            C1009c c1009c2 = c1012f.f4008b;
            if (c1009c2 == null) {
                c1012f.f4007a = c1009c;
                c1012f.f4008b = c1009c;
            } else {
                c1009c2.f4002c = c1009c;
                c1009c.f4003d = c1009c2;
                c1012f.f4008b = c1009c;
            }
            obj = null;
        }
        if (((InterfaceC0780c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0781d() {
        this.f3155d = new C1012f();
        this.f3154c = true;
    }
}
