package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vo extends RuntimeException {
    public final sx0 e;
    public final sx0 f;
    public final gx0 g;
    public final int h;

    public vo(sx0 sx0Var, sx0 sx0Var2, gx0 gx0Var, int i, Exception exc) {
        super(exc);
        this.e = sx0Var;
        this.f = sx0Var2;
        this.g = gx0Var;
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listG;
        List listO0;
        lm1 lm1VarX = af1.x(new uo(this, null));
        if (lm1VarX.hasNext()) {
            Object next = lm1VarX.next();
            if (lm1VarX.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (lm1VarX.hasNext()) {
                    arrayList.add(lm1VarX.next());
                }
                listG = arrayList;
            } else {
                listG = hk.G(next);
            }
        } else {
            listG = f40.e;
        }
        int size = listG.size();
        if (50 >= size) {
            listO0 = pl.o0(listG);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listG instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listG.get(i));
                }
            } else {
                ListIterator listIterator = listG.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listO0 = arrayList2;
        }
        String str = "\n            |Failed to execute op number " + this.h + ":\n            |" + pl.h0(listO0, "\n", null, null, null, 62) + "\n            ";
        if (ct1.P("|")) {
            yc.p("marginPrefix must be non-blank string.");
            return null;
        }
        List listR = ct1.R(str);
        int length = str.length();
        listR.size();
        int size2 = listR.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj : listR) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                hk.V();
                throw null;
            }
            String str2 = (String) obj;
            if ((i2 == 0 || i2 == size2) && ct1.P(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!s22.x(str2.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                String strSubstring = (i4 != -1 && str2.startsWith("|", i4)) ? str2.substring("|".length() + i4) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length);
        pl.g0(arrayList3, sb, null, 124);
        return sb.toString();
    }
}
