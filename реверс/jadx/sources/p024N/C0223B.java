package p024N;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: N.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0223B extends AbstractC0226D {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f761e;

    public C0223B(int i2, Class cls, int i3, int i4, int i5) {
        this.f761e = i5;
        this.f765a = i2;
        this.f768d = cls;
        this.f767c = i3;
        this.f766b = i4;
    }

    @Override // p024N.AbstractC0226D
    /* JADX INFO: renamed from: b */
    public final Object mo691b(View view) {
        switch (this.f761e) {
            case 0:
                return Boolean.valueOf(AbstractC0233K.m748d(view));
            case 1:
                return AbstractC0233K.m746b(view);
            case 2:
                return AbstractC0235M.m762b(view);
            default:
                return Boolean.valueOf(AbstractC0233K.m747c(view));
        }
    }

    @Override // p024N.AbstractC0226D
    /* JADX INFO: renamed from: c */
    public final void mo692c(View view, Object obj) {
        switch (this.f761e) {
            case 0:
                AbstractC0233K.m754j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0233K.m752h(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC0235M.m765e(view, (CharSequence) obj);
                break;
            default:
                AbstractC0233K.m751g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p024N.AbstractC0226D
    /* JADX INFO: renamed from: e */
    public final boolean mo693e(Object obj, Object obj2) {
        switch (this.f761e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
