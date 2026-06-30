package p099y;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0529T;
import java.util.Arrays;
import java.util.HashMap;
import p093v.AbstractC1068i;
import p093v.C1063d;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1100c extends View {

    /* JADX INFO: renamed from: a */
    public int[] f4591a;

    /* JADX INFO: renamed from: b */
    public int f4592b;

    /* JADX INFO: renamed from: c */
    public Context f4593c;

    /* JADX INFO: renamed from: d */
    public AbstractC1068i f4594d;

    /* JADX INFO: renamed from: e */
    public String f4595e;

    /* JADX INFO: renamed from: f */
    public String f4596f;

    /* JADX INFO: renamed from: g */
    public HashMap f4597g;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2731a(String str) {
        Context context;
        int identifier;
        HashMap map;
        if (str == null || str.length() == 0 || (context = this.f4593c) == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (AbstractC0529T.m1418g(strTrim) && (map = constraintLayout.f1432m) != null && map.containsKey(strTrim)) ? constraintLayout.f1432m.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m2736f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC1114q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f4597g.put(Integer.valueOf(identifier), strTrim);
            m2732b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2732b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f4592b + 1;
        int[] iArr = this.f4591a;
        if (i3 > iArr.length) {
            this.f4591a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4591a;
        int i4 = this.f4592b;
        iArr2[i4] = i2;
        this.f4592b = i4 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2733c(String str) {
        if (str == null || str.length() == 0 || this.f4593c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1102e) && strTrim.equals(((C1102e) layoutParams).f4623Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m2732b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2734d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f4592b; i2++) {
            View view = (View) constraintLayout.f1420a.get(this.f4591a[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2736f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f4593c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo2737g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1115r.f4802b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4595e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4596f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4591a, this.f4592b);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1241h(C1063d c1063d, boolean z2);

    /* JADX INFO: renamed from: i */
    public final void m2738i() {
        if (this.f4594d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1102e) {
            ((C1102e) layoutParams).f4656p0 = this.f4594d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4595e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4596f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4595e = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f4592b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                m2731a(str.substring(i2));
                return;
            } else {
                m2731a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4596f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f4592b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                m2733c(str.substring(i2));
                return;
            } else {
                m2733c(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4595e = null;
        this.f4592b = 0;
        for (int i2 : iArr) {
            m2732b(i2);
        }
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f4595e == null) {
            m2732b(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo2735e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
