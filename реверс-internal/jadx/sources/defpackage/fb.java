package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fb implements Appendable {
    public final StringBuilder e = new StringBuilder(16);
    public final ArrayList f;

    public fb(hb hbVar) {
        new ArrayList();
        this.f = new ArrayList();
        new ArrayList();
        a(hbVar);
    }

    public final void a(hb hbVar) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append(hbVar.f);
        List list = hbVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gb gbVar = (gb) list.get(i);
                this.f.add(new eb(gbVar.a, gbVar.b + length, gbVar.c + length, gbVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof hb;
        StringBuilder sb = this.e;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        hb hbVar = (hb) charSequence;
        int length = sb.length();
        sb.append((CharSequence) hbVar.f, i, i2);
        List listA = ib.a(hbVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                gb gbVar = (gb) listA.get(i3);
                this.f.add(new eb(gbVar.a, gbVar.b + length, gbVar.c + length, gbVar.d));
            }
        }
        return this;
    }

    public final hb b() {
        StringBuilder sb = this.e;
        String string = sb.toString();
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eb ebVar = (eb) arrayList.get(i);
            int length = sb.length();
            int i2 = ebVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                og0.b("Item.end should be set first");
            }
            arrayList2.add(new gb(ebVar.a, ebVar.b, length, ebVar.d));
        }
        return new hb(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof hb) {
            a((hb) charSequence);
            return this;
        }
        this.e.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.e.append(c);
        return this;
    }
}
