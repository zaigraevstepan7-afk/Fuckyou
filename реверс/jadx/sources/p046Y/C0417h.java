package p046Y;

import android.widget.EditText;
import androidx.emoji2.text.AbstractC0494h;
import java.lang.ref.WeakReference;
import p074l.AbstractC0909X0;

/* JADX INFO: renamed from: Y.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0417h extends AbstractC0494h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1128a = 0;

    /* JADX INFO: renamed from: b */
    public final WeakReference f1129b;

    public C0417h(EditText editText) {
        this.f1129b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0494h
    /* JADX INFO: renamed from: a */
    public void mo1133a() {
        switch (this.f1128a) {
            case 1:
                AbstractC0909X0 abstractC0909X0 = (AbstractC0909X0) this.f1129b.get();
                if (abstractC0909X0 != null) {
                    abstractC0909X0.m2338c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0494h
    /* JADX INFO: renamed from: b */
    public final void mo1132b() {
        switch (this.f1128a) {
            case 0:
                C0418i.m1134a((EditText) this.f1129b.get(), 1);
                break;
            default:
                AbstractC0909X0 abstractC0909X0 = (AbstractC0909X0) this.f1129b.get();
                if (abstractC0909X0 != null) {
                    abstractC0909X0.m2338c();
                }
                break;
        }
    }

    public C0417h(AbstractC0909X0 abstractC0909X0) {
        this.f1129b = new WeakReference(abstractC0909X0);
    }
}
