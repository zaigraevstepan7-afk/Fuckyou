package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.reddit.frontpage.R;
import p024N.C0270l;
import p057d.AbstractC0641a;
import p072k.C0818o;
import p072k.InterfaceC0829z;
import p072k.MenuC0816m;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0829z, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C0818o f1268a;

    /* JADX INFO: renamed from: b */
    public ImageView f1269b;

    /* JADX INFO: renamed from: c */
    public RadioButton f1270c;

    /* JADX INFO: renamed from: d */
    public TextView f1271d;

    /* JADX INFO: renamed from: e */
    public CheckBox f1272e;

    /* JADX INFO: renamed from: f */
    public TextView f1273f;

    /* JADX INFO: renamed from: g */
    public ImageView f1274g;

    /* JADX INFO: renamed from: h */
    public ImageView f1275h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1276i;

    /* JADX INFO: renamed from: j */
    public final Drawable f1277j;

    /* JADX INFO: renamed from: k */
    public final int f1278k;

    /* JADX INFO: renamed from: l */
    public final Context f1279l;

    /* JADX INFO: renamed from: m */
    public boolean f1280m;

    /* JADX INFO: renamed from: n */
    public final Drawable f1281n;

    /* JADX INFO: renamed from: o */
    public final boolean f1282o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f1283p;

    /* JADX INFO: renamed from: q */
    public boolean f1284q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0270l c0270lM838m = C0270l.m838m(getContext(), attributeSet, AbstractC0641a.f2497r, R.attr.resc);
        this.f1277j = c0270lM838m.m845h(5);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        this.f1278k = typedArray.getResourceId(1, -1);
        this.f1280m = typedArray.getBoolean(7, false);
        this.f1279l = context;
        this.f1281n = c0270lM838m.m845h(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.resc, 0);
        this.f1282o = typedArrayObtainStyledAttributes.hasValue(0);
        c0270lM838m.m851o();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1283p == null) {
            this.f1283p = LayoutInflater.from(getContext());
        }
        return this.f1283p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1274g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // p072k.InterfaceC0829z
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1190a(C0818o c0818o) {
        boolean z2;
        int i2;
        String string;
        boolean z3;
        this.f1268a = c0818o;
        setVisibility(c0818o.isVisible() ? 0 : 8);
        setTitle(c0818o.f3353e);
        setCheckable(c0818o.isCheckable());
        if (c0818o.f3362n.mo2171o()) {
            if ((c0818o.f3362n.mo2170n() ? c0818o.f3358j : c0818o.f3356h) != 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        c0818o.f3362n.mo2170n();
        if (z2) {
            C0818o c0818o2 = this.f1268a;
            if (c0818o2.f3362n.mo2171o()) {
                if ((c0818o2.f3362n.mo2170n() ? c0818o2.f3358j : c0818o2.f3356h) != 0) {
                    z3 = true;
                }
                if (z3) {
                }
            } else {
                z3 = false;
                i2 = z3 ? 0 : 8;
            }
        }
        if (i2 == 0) {
            TextView textView = this.f1273f;
            C0818o c0818o3 = this.f1268a;
            char c2 = c0818o3.f3362n.mo2170n() ? c0818o3.f3358j : c0818o3.f3356h;
            if (c2 == 0) {
                string = "";
            } else {
                MenuC0816m menuC0816m = c0818o3.f3362n;
                Resources resources = menuC0816m.f3319a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuC0816m.f3319a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.resc));
                }
                int i3 = menuC0816m.mo2170n() ? c0818o3.f3359k : c0818o3.f3357i;
                C0818o.m2199c(i3, 65536, resources.getString(R.string.resc), sb);
                C0818o.m2199c(i3, 4096, resources.getString(R.string.resc), sb);
                C0818o.m2199c(i3, 2, resources.getString(R.string.resc), sb);
                C0818o.m2199c(i3, 1, resources.getString(R.string.resc), sb);
                C0818o.m2199c(i3, 4, resources.getString(R.string.resc), sb);
                C0818o.m2199c(i3, 8, resources.getString(R.string.resc), sb);
                if (c2 == '\b') {
                    sb.append(resources.getString(R.string.resc));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(R.string.resc));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.resc));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1273f.getVisibility() != i2) {
            this.f1273f.setVisibility(i2);
        }
        setIcon(c0818o.getIcon());
        setEnabled(c0818o.isEnabled());
        setSubMenuArrowVisible(c0818o.hasSubMenu());
        setContentDescription(c0818o.f3365q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1275h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1275h.getLayoutParams();
        rect.top = this.f1275h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p072k.InterfaceC0829z
    public C0818o getItemData() {
        return this.f1268a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1277j);
        TextView textView = (TextView) findViewById(R.id.resc);
        this.f1271d = textView;
        int i2 = this.f1278k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1279l, i2);
        }
        this.f1273f = (TextView) findViewById(R.id.resc);
        ImageView imageView = (ImageView) findViewById(R.id.resc);
        this.f1274g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1281n);
        }
        this.f1275h = (ImageView) findViewById(R.id.resc);
        this.f1276i = (LinearLayout) findViewById(R.id.resc);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1269b != null && this.f1280m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1269b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1270c == null && this.f1272e == null) {
            return;
        }
        if ((this.f1268a.f3372x & 4) != 0) {
            if (this.f1270c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.resc, (ViewGroup) this, false);
                this.f1270c = radioButton;
                LinearLayout linearLayout = this.f1276i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1270c;
            view = this.f1272e;
        } else {
            if (this.f1272e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.resc, (ViewGroup) this, false);
                this.f1272e = checkBox;
                LinearLayout linearLayout2 = this.f1276i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1272e;
            view = this.f1270c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1268a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1272e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1270c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1268a.f3372x & 4) != 0) {
            if (this.f1270c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.resc, (ViewGroup) this, false);
                this.f1270c = radioButton;
                LinearLayout linearLayout = this.f1276i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1270c;
        } else {
            if (this.f1272e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.resc, (ViewGroup) this, false);
                this.f1272e = checkBox;
                LinearLayout linearLayout2 = this.f1276i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1272e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1284q = z2;
        this.f1280m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1275h;
        if (imageView != null) {
            imageView.setVisibility((this.f1282o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1268a.f3362n.getClass();
        boolean z2 = this.f1284q;
        if (z2 || this.f1280m) {
            ImageView imageView = this.f1269b;
            if (imageView == null && drawable == null && !this.f1280m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.resc, (ViewGroup) this, false);
                this.f1269b = imageView2;
                LinearLayout linearLayout = this.f1276i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1280m) {
                this.f1269b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1269b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1269b.getVisibility() != 0) {
                this.f1269b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1271d.getVisibility() != 8) {
                this.f1271d.setVisibility(8);
            }
        } else {
            this.f1271d.setText(charSequence);
            if (this.f1271d.getVisibility() != 0) {
                this.f1271d.setVisibility(0);
            }
        }
    }
}
