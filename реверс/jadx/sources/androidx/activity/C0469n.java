package androidx.activity;

import androidx.fragment.app.C0556z;
import java.util.ListIterator;
import p033R0.C0356d;
import p035S0.C0364a;
import p048Z0.InterfaceC0432l;
import p051a1.AbstractC0452d;

/* JADX INFO: renamed from: androidx.activity.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0469n extends AbstractC0452d implements InterfaceC0432l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0485v f1202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469n(C0485v c0485v, int i2) {
        super(1);
        this.f1201a = i2;
        this.f1202b = c0485v;
    }

    @Override // p048Z0.InterfaceC0432l
    /* JADX INFO: renamed from: b */
    public final Object mo1136b(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f1201a) {
            case 0:
                C0485v c0485v = this.f1202b;
                C0364a c0364a = c0485v.f1247b;
                c0364a.getClass();
                ListIterator listIterator = c0364a.listIterator(c0364a.f1008c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0556z) objPrevious).f1822a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0485v.f1248c = (C0556z) objPrevious;
                break;
            default:
                C0364a c0364a2 = this.f1202b.f1247b;
                c0364a2.getClass();
                ListIterator listIterator2 = c0364a2.listIterator(c0364a2.f1008c);
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((C0556z) objPrevious2).f1822a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return C0356d.f999c;
    }
}
