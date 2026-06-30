package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p089t.AbstractC1048e;

/* JADX INFO: renamed from: androidx.fragment.app.T */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0529T {
    /* JADX INFO: renamed from: a */
    public static final void m1412a(View view, int i2) {
        int iM2545a = AbstractC1048e.m2545a(i2);
        if (iM2545a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM2545a == 1) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM2545a == 2) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM2545a != 3) {
            return;
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public static int m1413b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m1416e("Unknown visibility ", i2));
    }

    /* JADX INFO: renamed from: c */
    public static int m1414c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m1413b(view.getVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static String m1415d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m1596B());
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m1416e(String str, int i2) {
        return str + i2;
    }

    /* JADX INFO: renamed from: f */
    public static String m1417f(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m1418g(Object obj) {
        return obj != null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m1419h(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m1420i(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m1421j(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
