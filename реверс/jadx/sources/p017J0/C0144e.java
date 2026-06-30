package p017J0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p004C.RunnableC0020a;
import p023M0.RunnableC0191D;
import p024N.AbstractC0240S;

/* JADX INFO: renamed from: J0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0144e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f453a;

    /* JADX INFO: renamed from: b */
    public int f454b;

    /* JADX INFO: renamed from: c */
    public boolean f455c;

    /* JADX INFO: renamed from: d */
    public final Runnable f456d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0002c f457e;

    public C0144e(SideSheetBehavior sideSheetBehavior) {
        this.f453a = 0;
        this.f457e = sideSheetBehavior;
        this.f456d = new RunnableC0020a(2, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m554a(int i2) {
        Runnable runnable = this.f456d;
        AbstractC0002c abstractC0002c = this.f457e;
        switch (this.f453a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0002c;
                WeakReference weakReference = sideSheetBehavior.f2322p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f454b = i2;
                    if (!this.f455c) {
                        WeakHashMap weakHashMap = AbstractC0240S.f777a;
                        ((View) sideSheetBehavior.f2322p.get()).postOnAnimation((RunnableC0020a) runnable);
                        this.f455c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0002c;
                WeakReference weakReference2 = bottomSheetBehavior.f2090U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f454b = i2;
                    if (!this.f455c) {
                        WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
                        ((View) bottomSheetBehavior.f2090U.get()).postOnAnimation((RunnableC0191D) runnable);
                        this.f455c = true;
                    }
                    break;
                }
                break;
        }
    }

    public C0144e(BottomSheetBehavior bottomSheetBehavior) {
        this.f453a = 1;
        this.f457e = bottomSheetBehavior;
        this.f456d = new RunnableC0191D(14, this);
    }
}
