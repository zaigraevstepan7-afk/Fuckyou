package p008E0;

import android.R;
import android.content.res.ColorStateList;
import p036T.AbstractC0372b;
import p036T.AbstractC0383m;
import p074l.C0873F;

/* JADX INFO: renamed from: E0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0073a extends C0873F {

    /* JADX INFO: renamed from: g */
    public static final int[][] f233g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f234e;

    /* JADX INFO: renamed from: f */
    public boolean f235f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f234e == null) {
            int iM1056v = AbstractC0383m.m1056v(this, com.reddit.frontpage.R.attr.resc);
            int iM1056v2 = AbstractC0383m.m1056v(this, com.reddit.frontpage.R.attr.resc);
            int iM1056v3 = AbstractC0383m.m1056v(this, com.reddit.frontpage.R.attr.resc);
            this.f234e = new ColorStateList(f233g, new int[]{AbstractC0383m.m1030I(iM1056v3, iM1056v, 1.0f), AbstractC0383m.m1030I(iM1056v3, iM1056v2, 0.54f), AbstractC0383m.m1030I(iM1056v3, iM1056v2, 0.38f), AbstractC0383m.m1030I(iM1056v3, iM1056v2, 0.38f)});
        }
        return this.f234e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f235f && AbstractC0372b.m1003a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f235f = z2;
        if (z2) {
            AbstractC0372b.m1005c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0372b.m1005c(this, null);
        }
    }
}
