package p018K;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p000A.C0001b;
import p022M.C0186c;
import p066g0.C0713A;
import p066g0.C0738a;

/* JADX INFO: renamed from: K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0149e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f465a;

    /* JADX INFO: renamed from: b */
    public final Object f466b;

    /* JADX INFO: renamed from: c */
    public final Serializable f467c;

    /* JADX INFO: renamed from: d */
    public final Serializable f468d;

    /* JADX INFO: renamed from: e */
    public final Object f469e;

    /* JADX INFO: renamed from: f */
    public final Object f470f;

    public C0149e(String str, String str2, String str3, List list) {
        this.f465a = 0;
        str.getClass();
        this.f466b = str;
        str2.getClass();
        this.f467c = str2;
        this.f468d = str3;
        list.getClass();
        this.f470f = list;
        this.f469e = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m557a(int i2) {
        ArrayList arrayList = (ArrayList) this.f468d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0738a c0738a = (C0738a) arrayList.get(i3);
            int i4 = c0738a.f2918a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = c0738a.f2919b;
                    int i6 = c0738a.f2920c + i5;
                    while (i5 < i6) {
                        if (m561e(i5, i3 + 1) == i2) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m561e(c0738a.f2920c, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m558b() {
        ArrayList arrayList = (ArrayList) this.f468d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0713A) this.f469e).m1966a((C0738a) arrayList.get(i2));
        }
        m565i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f467c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C0738a c0738a = (C0738a) arrayList2.get(i3);
            int i4 = c0738a.f2918a;
            C0713A c0713a = (C0713A) this.f469e;
            if (i4 == 1) {
                c0713a.m1966a(c0738a);
                c0713a.m1969d(c0738a.f2919b, c0738a.f2920c);
            } else if (i4 == 2) {
                c0713a.m1966a(c0738a);
                int i5 = c0738a.f2919b;
                int i6 = c0738a.f2920c;
                RecyclerView recyclerView = c0713a.f2845a;
                recyclerView.m1611S(i5, i6, true);
                recyclerView.f1973h0 = true;
                recyclerView.f1967e0.f2906c += i6;
            } else if (i4 == 4) {
                c0713a.m1966a(c0738a);
                c0713a.m1968c(c0738a.f2919b, c0738a.f2920c);
            } else if (i4 == 8) {
                c0713a.m1966a(c0738a);
                c0713a.m1970e(c0738a.f2919b, c0738a.f2920c);
            }
        }
        m565i(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public void m559c(C0738a c0738a) {
        int i2;
        C0186c c0186c;
        int i3 = c0738a.f2918a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM566j = m566j(c0738a.f2919b, i3);
        int i4 = c0738a.f2919b;
        int i5 = c0738a.f2918a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0738a);
            }
            i2 = 1;
        }
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = c0738a.f2920c;
            c0186c = (C0186c) this.f466b;
            if (i6 >= i8) {
                break;
            }
            int iM566j2 = m566j((i2 * i6) + c0738a.f2919b, c0738a.f2918a);
            int i9 = c0738a.f2918a;
            if (i9 == 2 ? iM566j2 != iM566j : !(i9 == 4 && iM566j2 == iM566j + 1)) {
                C0738a c0738aM563g = m563g(i9, iM566j, i7);
                m560d(c0738aM563g, i4);
                c0186c.mo624c(c0738aM563g);
                if (c0738a.f2918a == 4) {
                    i4 += i7;
                }
                iM566j = iM566j2;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
        }
        c0186c.mo624c(c0738a);
        if (i7 > 0) {
            C0738a c0738aM563g2 = m563g(c0738a.f2918a, iM566j, i7);
            m560d(c0738aM563g2, i4);
            c0186c.mo624c(c0738aM563g2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m560d(C0738a c0738a, int i2) {
        C0713A c0713a = (C0713A) this.f469e;
        c0713a.m1966a(c0738a);
        int i3 = c0738a.f2918a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0713a.m1968c(i2, c0738a.f2920c);
        } else {
            int i4 = c0738a.f2920c;
            RecyclerView recyclerView = c0713a.f2845a;
            recyclerView.m1611S(i2, i4, true);
            recyclerView.f1973h0 = true;
            recyclerView.f1967e0.f2906c += i4;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m561e(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f468d;
        int size = arrayList.size();
        while (i3 < size) {
            C0738a c0738a = (C0738a) arrayList.get(i3);
            int i4 = c0738a.f2918a;
            if (i4 == 8) {
                int i5 = c0738a.f2919b;
                if (i5 == i2) {
                    i2 = c0738a.f2920c;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (c0738a.f2920c <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = c0738a.f2919b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = c0738a.f2920c;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += c0738a.f2920c;
                }
            }
            i3++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public boolean m562f() {
        return ((ArrayList) this.f467c).size() > 0;
    }

    /* JADX INFO: renamed from: g */
    public C0738a m563g(int i2, int i3, int i4) {
        C0738a c0738a = (C0738a) ((C0186c) this.f466b).mo622a();
        if (c0738a != null) {
            c0738a.f2918a = i2;
            c0738a.f2919b = i3;
            c0738a.f2920c = i4;
            return c0738a;
        }
        C0738a c0738a2 = new C0738a();
        c0738a2.f2918a = i2;
        c0738a2.f2919b = i3;
        c0738a2.f2920c = i4;
        return c0738a2;
    }

    /* JADX INFO: renamed from: h */
    public void m564h(C0738a c0738a) {
        ((ArrayList) this.f468d).add(c0738a);
        int i2 = c0738a.f2918a;
        C0713A c0713a = (C0713A) this.f469e;
        if (i2 == 1) {
            c0713a.m1969d(c0738a.f2919b, c0738a.f2920c);
            return;
        }
        if (i2 == 2) {
            int i3 = c0738a.f2919b;
            int i4 = c0738a.f2920c;
            RecyclerView recyclerView = c0713a.f2845a;
            recyclerView.m1611S(i3, i4, false);
            recyclerView.f1973h0 = true;
            return;
        }
        if (i2 == 4) {
            c0713a.m1968c(c0738a.f2919b, c0738a.f2920c);
        } else if (i2 == 8) {
            c0713a.m1970e(c0738a.f2919b, c0738a.f2920c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0738a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m565i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0738a c0738a = (C0738a) arrayList.get(i2);
            c0738a.getClass();
            ((C0186c) this.f466b).mo624c(c0738a);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public int m566j(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.f468d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0738a c0738a = (C0738a) arrayList.get(size);
            int i6 = c0738a.f2918a;
            if (i6 == 8) {
                int i7 = c0738a.f2919b;
                int i8 = c0738a.f2920c;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            c0738a.f2919b = i7 + 1;
                            c0738a.f2920c = i8 + 1;
                        } else if (i3 == 2) {
                            c0738a.f2919b = i7 - 1;
                            c0738a.f2920c = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        c0738a.f2920c = i8 + 1;
                    } else if (i3 == 2) {
                        c0738a.f2920c = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        c0738a.f2919b = i7 + 1;
                    } else if (i3 == 2) {
                        c0738a.f2919b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = c0738a.f2919b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= c0738a.f2920c;
                    } else if (i6 == 2) {
                        i2 += c0738a.f2920c;
                    }
                } else if (i3 == 1) {
                    c0738a.f2919b = i9 + 1;
                } else if (i3 == 2) {
                    c0738a.f2919b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0738a c0738a2 = (C0738a) arrayList.get(size2);
            int i10 = c0738a2.f2918a;
            C0186c c0186c = (C0186c) this.f466b;
            if (i10 == 8) {
                int i11 = c0738a2.f2920c;
                if (i11 == c0738a2.f2919b || i11 < 0) {
                    arrayList.remove(size2);
                    c0186c.mo624c(c0738a2);
                }
            } else if (c0738a2.f2920c <= 0) {
                arrayList.remove(size2);
                c0186c.mo624c(c0738a2);
            }
        }
        return i2;
    }

    public String toString() {
        switch (this.f465a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f466b) + ", mProviderPackage: " + ((String) this.f467c) + ", mQuery: " + ((String) this.f468d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f470f;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public C0149e(C0713A c0713a) {
        this.f465a = 1;
        this.f466b = new C0186c(30);
        this.f467c = new ArrayList();
        this.f468d = new ArrayList();
        this.f469e = c0713a;
        this.f470f = new C0001b(22, this);
    }
}
