package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.reddit.frontpage.R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f2443r = 0;

    /* JADX INFO: renamed from: q */
    public final Chip f2444q;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0638g viewOnClickListenerC0638g = new ViewOnClickListenerC0638g(this);
        LayoutInflater.from(context).inflate(R.layout.resc, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.resc);
        materialButtonToggleGroup.f2145c.add(new C0637f());
        Chip chip = (Chip) findViewById(R.id.resc);
        Chip chip2 = (Chip) findViewById(R.id.resc);
        this.f2444q = chip2;
        ViewOnTouchListenerC0640i viewOnTouchListenerC0640i = new ViewOnTouchListenerC0640i(new GestureDetector(getContext(), new C0639h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0640i);
        chip2.setOnTouchListener(viewOnTouchListenerC0640i);
        chip.setTag(R.id.resc, 12);
        chip2.setTag(R.id.resc, 10);
        chip.setOnClickListener(viewOnClickListenerC0638g);
        chip2.setOnClickListener(viewOnClickListenerC0638g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f2444q.sendAccessibilityEvent(8);
        }
    }
}
