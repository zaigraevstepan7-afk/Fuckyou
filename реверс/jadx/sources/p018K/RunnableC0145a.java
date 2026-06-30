package p018K;

import androidx.emoji2.text.AbstractC0494h;
import com.google.android.material.datepicker.C0616k;
import java.util.ArrayList;
import java.util.List;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p007E.AbstractC0056b;
import p019K0.AbstractC0165g;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0145a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f458a;

    /* JADX INFO: renamed from: b */
    public int f459b;

    /* JADX INFO: renamed from: c */
    public final Object f460c;

    public /* synthetic */ RunnableC0145a(Object obj, int i2, int i3) {
        this.f458a = i3;
        this.f460c = obj;
        this.f459b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f458a) {
            case 0:
                AbstractC0056b abstractC0056b = (AbstractC0056b) ((C0001b) this.f460c).f1b;
                if (abstractC0056b != null) {
                    abstractC0056b.mo337h(this.f459b);
                }
                break;
            case 1:
                ((AbstractC0165g) this.f460c).f546h.m1114x(this.f459b, 4);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f460c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f459b == 1) {
                    while (i2 < size) {
                        ((AbstractC0494h) arrayList.get(i2)).mo1132b();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((AbstractC0494h) arrayList.get(i2)).mo1133a();
                        i2++;
                    }
                }
                break;
            default:
                ((C0616k) this.f460c).f2218a0.m1629i0(this.f459b);
                break;
        }
    }

    public RunnableC0145a(List list, int i2, Throwable th) {
        this.f458a = 2;
        AbstractC0016e.m180j(list, "initCallbacks cannot be null");
        this.f460c = new ArrayList(list);
        this.f459b = i2;
    }

    public RunnableC0145a(AbstractC0165g abstractC0165g) {
        this.f458a = 1;
        this.f460c = abstractC0165g;
        this.f459b = -1;
    }
}
