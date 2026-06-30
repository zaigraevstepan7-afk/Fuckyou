package p074l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: l.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0946k1 implements InterfaceC0957o0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f3769a;

    /* JADX INFO: renamed from: b */
    public int f3770b;

    /* JADX INFO: renamed from: c */
    public View f3771c;

    /* JADX INFO: renamed from: d */
    public Drawable f3772d;

    /* JADX INFO: renamed from: e */
    public Drawable f3773e;

    /* JADX INFO: renamed from: f */
    public Drawable f3774f;

    /* JADX INFO: renamed from: g */
    public boolean f3775g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3776h;

    /* JADX INFO: renamed from: i */
    public CharSequence f3777i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3778j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f3779k;

    /* JADX INFO: renamed from: l */
    public boolean f3780l;

    /* JADX INFO: renamed from: m */
    public C0944k f3781m;

    /* JADX INFO: renamed from: n */
    public int f3782n;

    /* JADX INFO: renamed from: o */
    public Drawable f3783o;

    /* JADX INFO: renamed from: a */
    public final void m2396a(int i2) {
        View view;
        int i3 = this.f3770b ^ i2;
        this.f3770b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m2397b();
                }
                int i4 = this.f3770b & 4;
                Toolbar toolbar = this.f3769a;
                if (i4 != 0) {
                    Drawable drawable = this.f3774f;
                    if (drawable == null) {
                        drawable = this.f3783o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                m2398c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f3769a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3776h);
                    toolbar2.setSubtitle(this.f3777i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3771c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2397b() {
        if ((this.f3770b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f3778j);
            Toolbar toolbar = this.f3769a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f3782n);
            } else {
                toolbar.setNavigationContentDescription(this.f3778j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2398c() {
        Drawable drawable;
        int i2 = this.f3770b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f3773e) == null) {
            drawable = this.f3772d;
        }
        this.f3769a.setLogo(drawable);
    }
}
