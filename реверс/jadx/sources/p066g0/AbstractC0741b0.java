package p066g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p024N.AbstractC0240S;

/* JADX INFO: renamed from: g0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0741b0 {

    /* JADX INFO: renamed from: t */
    public static final List f2930t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final View f2931a;

    /* JADX INFO: renamed from: b */
    public WeakReference f2932b;

    /* JADX INFO: renamed from: j */
    public int f2940j;

    /* JADX INFO: renamed from: r */
    public RecyclerView f2948r;

    /* JADX INFO: renamed from: s */
    public AbstractC0714B f2949s;

    /* JADX INFO: renamed from: c */
    public int f2933c = -1;

    /* JADX INFO: renamed from: d */
    public int f2934d = -1;

    /* JADX INFO: renamed from: e */
    public long f2935e = -1;

    /* JADX INFO: renamed from: f */
    public int f2936f = -1;

    /* JADX INFO: renamed from: g */
    public int f2937g = -1;

    /* JADX INFO: renamed from: h */
    public AbstractC0741b0 f2938h = null;

    /* JADX INFO: renamed from: i */
    public AbstractC0741b0 f2939i = null;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2941k = null;

    /* JADX INFO: renamed from: l */
    public final List f2942l = null;

    /* JADX INFO: renamed from: m */
    public int f2943m = 0;

    /* JADX INFO: renamed from: n */
    public C0729Q f2944n = null;

    /* JADX INFO: renamed from: o */
    public boolean f2945o = false;

    /* JADX INFO: renamed from: p */
    public int f2946p = 0;

    /* JADX INFO: renamed from: q */
    public int f2947q = -1;

    public AbstractC0741b0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2931a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2047a(int i2) {
        this.f2940j = i2 | this.f2940j;
    }

    /* JADX INFO: renamed from: b */
    public final int m2048b() {
        int i2 = this.f2937g;
        return i2 == -1 ? this.f2933c : i2;
    }

    /* JADX INFO: renamed from: c */
    public final List m2049c() {
        ArrayList arrayList;
        return ((this.f2940j & 1024) != 0 || (arrayList = this.f2941k) == null || arrayList.size() == 0) ? f2930t : this.f2942l;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2050d() {
        View view = this.f2931a;
        return (view.getParent() == null || view.getParent() == this.f2948r) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2051e() {
        return (this.f2940j & 1) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2052f() {
        return (this.f2940j & 4) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2053g() {
        if ((this.f2940j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        return !this.f2931a.hasTransientState();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2054h() {
        return (this.f2940j & 8) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2055i() {
        return this.f2944n != null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2056j() {
        return (this.f2940j & 256) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2057k() {
        return (this.f2940j & 2) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2058l(int i2, boolean z2) {
        if (this.f2934d == -1) {
            this.f2934d = this.f2933c;
        }
        if (this.f2937g == -1) {
            this.f2937g = this.f2933c;
        }
        if (z2) {
            this.f2937g += i2;
        }
        this.f2933c += i2;
        View view = this.f2931a;
        if (view.getLayoutParams() != null) {
            ((C0724L) view.getLayoutParams()).f2878c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2059m() {
        if (RecyclerView.f1934z0 && m2056j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2940j = 0;
        this.f2933c = -1;
        this.f2934d = -1;
        this.f2935e = -1L;
        this.f2937g = -1;
        this.f2943m = 0;
        this.f2938h = null;
        this.f2939i = null;
        ArrayList arrayList = this.f2941k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2940j &= -1025;
        this.f2946p = 0;
        this.f2947q = -1;
        RecyclerView.m1593l(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m2060n(boolean z2) {
        int i2 = this.f2943m;
        int i3 = z2 ? i2 - 1 : i2 + 1;
        this.f2943m = i3;
        if (i3 < 0) {
            this.f2943m = 0;
            if (RecyclerView.f1934z0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i3 == 1) {
            this.f2940j |= 16;
        } else if (z2 && i3 == 0) {
            this.f2940j &= -17;
        }
        if (RecyclerView.f1926A0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2061o() {
        return (this.f2940j & 128) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2062p() {
        return (this.f2940j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2933c + " id=" + this.f2935e + ", oldPos=" + this.f2934d + ", pLpos:" + this.f2937g);
        if (m2055i()) {
            sb.append(" scrap ");
            sb.append(this.f2945o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2052f()) {
            sb.append(" invalid");
        }
        if (!m2051e()) {
            sb.append(" unbound");
        }
        if ((this.f2940j & 2) != 0) {
            sb.append(" update");
        }
        if (m2054h()) {
            sb.append(" removed");
        }
        if (m2061o()) {
            sb.append(" ignored");
        }
        if (m2056j()) {
            sb.append(" tmpDetached");
        }
        if (!m2053g()) {
            sb.append(" not recyclable(" + this.f2943m + ")");
        }
        if ((this.f2940j & 512) != 0 || m2052f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2931a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
