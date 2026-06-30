package p024N;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.reddit.frontpage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: N.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0239Q {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f773d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f774a;

    /* JADX INFO: renamed from: b */
    public SparseArray f775b;

    /* JADX INFO: renamed from: c */
    public WeakReference f776c;

    /* JADX INFO: renamed from: a */
    public final View m769a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f774a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM769a = m769a(viewGroup.getChildAt(childCount));
                if (viewM769a != null) {
                    return viewM769a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.resc);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
