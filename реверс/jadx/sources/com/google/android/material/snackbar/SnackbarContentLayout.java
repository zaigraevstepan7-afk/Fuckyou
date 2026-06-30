package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p024N.AbstractC0240S;
import p081o0.AbstractC1015a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f2330a;

    /* JADX INFO: renamed from: b */
    public Button f2331b;

    /* JADX INFO: renamed from: c */
    public int f2332c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0016e.m195r0(context, R.attr.resc, AbstractC1015a.f4047b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1761a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2330a.getPaddingTop() == i3 && this.f2330a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f2330a;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f2331b;
    }

    public TextView getMessageView() {
        return this.f2330a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2330a = (TextView) findViewById(R.id.resc);
        this.f2331b = (Button) findViewById(R.id.resc);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.resc);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.resc);
        Layout layout = this.f2330a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f2332c <= 0 || this.f2331b.getMeasuredWidth() <= this.f2332c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1761a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1761a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f2332c = i2;
    }
}
