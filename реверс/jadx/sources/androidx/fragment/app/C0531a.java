package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0531a implements InterfaceC0516F {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1675a;

    /* JADX INFO: renamed from: b */
    public int f1676b;

    /* JADX INFO: renamed from: c */
    public int f1677c;

    /* JADX INFO: renamed from: d */
    public int f1678d;

    /* JADX INFO: renamed from: e */
    public int f1679e;

    /* JADX INFO: renamed from: f */
    public int f1680f;

    /* JADX INFO: renamed from: g */
    public boolean f1681g;

    /* JADX INFO: renamed from: h */
    public String f1682h;

    /* JADX INFO: renamed from: i */
    public int f1683i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1684j;

    /* JADX INFO: renamed from: k */
    public int f1685k;

    /* JADX INFO: renamed from: l */
    public CharSequence f1686l;

    /* JADX INFO: renamed from: m */
    public ArrayList f1687m;

    /* JADX INFO: renamed from: n */
    public ArrayList f1688n;

    /* JADX INFO: renamed from: o */
    public boolean f1689o;

    /* JADX INFO: renamed from: p */
    public final C0518H f1690p;

    /* JADX INFO: renamed from: q */
    public boolean f1691q;

    /* JADX INFO: renamed from: r */
    public int f1692r;

    public C0531a(C0518H c0518h) {
        c0518h.m1337C();
        C0550t c0550t = c0518h.f1610t;
        if (c0550t != null) {
            c0550t.f1806q.getClassLoader();
        }
        this.f1675a = new ArrayList();
        this.f1689o = false;
        this.f1692r = -1;
        this.f1690p = c0518h;
    }

    @Override // androidx.fragment.app.InterfaceC0516F
    /* JADX INFO: renamed from: a */
    public final boolean mo1328a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1681g) {
            return true;
        }
        C0518H c0518h = this.f1690p;
        if (c0518h.f1594d == null) {
            c0518h.f1594d = new ArrayList();
        }
        c0518h.f1594d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1422b(C0524N c0524n) {
        this.f1675a.add(c0524n);
        c0524n.f1652d = this.f1676b;
        c0524n.f1653e = this.f1677c;
        c0524n.f1654f = this.f1678d;
        c0524n.f1655g = this.f1679e;
    }

    /* JADX INFO: renamed from: c */
    public final void m1423c(int i2) {
        if (this.f1681g) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f1675a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0524N c0524n = (C0524N) arrayList.get(i3);
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0524n.f1650b;
                if (abstractComponentCallbacksC0548r != null) {
                    abstractComponentCallbacksC0548r.f1793q += i2;
                    if (C0518H.m1330F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0524n.f1650b + " to " + c0524n.f1650b.f1793q);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1424d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1682h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1692r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1691q);
            if (this.f1680f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1680f));
            }
            if (this.f1676b != 0 || this.f1677c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1676b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1677c));
            }
            if (this.f1678d != 0 || this.f1679e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1678d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1679e));
            }
            if (this.f1683i != 0 || this.f1684j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1683i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1684j);
            }
            if (this.f1685k != 0 || this.f1686l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1685k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1686l);
            }
        }
        ArrayList arrayList = this.f1675a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0524N c0524n = (C0524N) arrayList.get(i2);
            switch (c0524n.f1649a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0524n.f1649a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0524n.f1650b);
            if (z2) {
                if (c0524n.f1652d != 0 || c0524n.f1653e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0524n.f1652d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0524n.f1653e));
                }
                if (c0524n.f1654f != 0 || c0524n.f1655g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0524n.f1654f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0524n.f1655g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1692r >= 0) {
            sb.append(" #");
            sb.append(this.f1692r);
        }
        if (this.f1682h != null) {
            sb.append(" ");
            sb.append(this.f1682h);
        }
        sb.append("}");
        return sb.toString();
    }
}
