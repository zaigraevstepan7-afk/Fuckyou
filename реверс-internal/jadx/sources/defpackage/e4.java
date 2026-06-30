package defpackage;

import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e4(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int actionMasked;
        int i;
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                h4 h4Var = (h4) obj;
                h4Var.removeCallbacks(this);
                MotionEvent motionEvent = h4Var.o0;
                if (motionEvent != null && (actionMasked = motionEvent.getActionMasked()) != 10 && actionMasked != 1) {
                    if (actionMasked != 7) {
                        i = actionMasked != 8 ? actionMasked != 9 ? 2 : 7 : 9;
                    }
                    h4Var.G(motionEvent, i, h4Var.p0, false);
                    break;
                }
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((qt0) obj).f;
                int i3 = bottomSheetBehavior.q;
                if (i3 == 2 && i3 != 0) {
                    bottomSheetBehavior.q = 0;
                    break;
                }
                break;
            default:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.j) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.j = false;
                }
                break;
        }
    }
}
