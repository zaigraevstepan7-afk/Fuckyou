package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yx extends RuntimeException {
    public final ap e;

    public yx(ap apVar) {
        this.e = apVar;
        if (apVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = apVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cp cpVar = (cp) list.get(i);
            int i3 = cpVar.a;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (cpVar.a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((cp) list.get(i5)).a == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(cpVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", s91.i("m$", ((cp) arrayList.get(i6)).a), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ap apVar = this.e;
        if (!apVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        aq0 aq0VarN = hk.n();
        List list = apVar.a;
        list.getClass();
        we1 we1Var = new we1(list);
        int iA = we1Var.a();
        for (int i = 0; i < iA; i++) {
            ((cp) we1Var.get(i)).getClass();
        }
        aq0 aq0VarK = hk.k(aq0VarN);
        aq0VarK.getClass();
        we1 we1Var2 = new we1(aq0VarK);
        int iA2 = we1Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) we1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
