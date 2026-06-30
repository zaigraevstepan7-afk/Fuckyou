package p098x0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import p026O.C0306f;
import p026O.C0311k;
import p042W.AbstractC0401b;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1095b extends AbstractC0401b {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Chip f4518q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1095b(Chip chip, Chip chip2) {
        super(chip2);
        this.f4518q = chip;
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: n */
    public final int mo570n(float f, float f2) {
        Rect rect = Chip.f2163w;
        Chip chip = this.f4518q;
        return (chip.m1726d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: o */
    public final void mo571o(ArrayList arrayList) {
        C1097d c1097d;
        arrayList.add(0);
        Rect rect = Chip.f2163w;
        Chip chip = this.f4518q;
        if (!chip.m1726d() || (c1097d = chip.f2166e) == null || !c1097d.f4536K || chip.f2169h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: s */
    public final boolean mo572s(int i2, int i3, Bundle bundle) {
        boolean z2 = false;
        if (i3 == 16) {
            Chip chip = this.f4518q;
            if (i2 == 0) {
                return chip.performClick();
            }
            if (i2 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f2169h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z2 = true;
                }
                if (chip.f2180s) {
                    chip.f2179r.m1114x(1, 1);
                }
            }
        }
        return z2;
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: t */
    public final void mo1111t(C0311k c0311k) {
        Chip chip = this.f4518q;
        C1097d c1097d = chip.f2166e;
        boolean z2 = c1097d != null && c1097d.f4542Q;
        AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0311k.m975i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c0311k.m978l(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: u */
    public final void mo573u(int i2, C0311k c0311k) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2163w);
            return;
        }
        Chip chip = this.f4518q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.resc, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0311k.m969b(C0306f.f894e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // p042W.AbstractC0401b
    /* JADX INFO: renamed from: v */
    public final void mo1112v(int i2, boolean z2) {
        if (i2 == 1) {
            Chip chip = this.f4518q;
            chip.f2174m = z2;
            chip.refreshDrawableState();
        }
    }
}
