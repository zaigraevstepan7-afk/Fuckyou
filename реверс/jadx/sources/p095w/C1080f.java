package p095w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: loaded from: classes.dex */
public class C1080f implements InterfaceC1078d {

    /* JADX INFO: renamed from: d */
    public final AbstractC1089o f4457d;

    /* JADX INFO: renamed from: f */
    public int f4459f;

    /* JADX INFO: renamed from: g */
    public int f4460g;

    /* JADX INFO: renamed from: a */
    public AbstractC1089o f4454a = null;

    /* JADX INFO: renamed from: b */
    public boolean f4455b = false;

    /* JADX INFO: renamed from: c */
    public boolean f4456c = false;

    /* JADX INFO: renamed from: e */
    public int f4458e = 1;

    /* JADX INFO: renamed from: h */
    public int f4461h = 1;

    /* JADX INFO: renamed from: i */
    public C1081g f4462i = null;

    /* JADX INFO: renamed from: j */
    public boolean f4463j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4464k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f4465l = new ArrayList();

    public C1080f(AbstractC1089o abstractC1089o) {
        this.f4457d = abstractC1089o;
    }

    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        ArrayList<C1080f> arrayList = this.f4465l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1080f) it.next()).f4463j) {
                return;
            }
        }
        this.f4456c = true;
        AbstractC1089o abstractC1089o = this.f4454a;
        if (abstractC1089o != null) {
            abstractC1089o.mo2650a(this);
        }
        if (this.f4455b) {
            this.f4457d.mo2650a(this);
            return;
        }
        C1080f c1080f = null;
        int i2 = 0;
        for (C1080f c1080f2 : arrayList) {
            if (!(c1080f2 instanceof C1081g)) {
                i2++;
                c1080f = c1080f2;
            }
        }
        if (c1080f != null && i2 == 1 && c1080f.f4463j) {
            C1081g c1081g = this.f4462i;
            if (c1081g != null) {
                if (!c1081g.f4463j) {
                    return;
                } else {
                    this.f4459f = this.f4461h * c1081g.f4460g;
                }
            }
            mo2667d(c1080f.f4460g + this.f4459f);
        }
        AbstractC1089o abstractC1089o2 = this.f4454a;
        if (abstractC1089o2 != null) {
            abstractC1089o2.mo2650a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2665b(AbstractC1089o abstractC1089o) {
        this.f4464k.add(abstractC1089o);
        if (this.f4463j) {
            abstractC1089o.mo2650a(abstractC1089o);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2666c() {
        this.f4465l.clear();
        this.f4464k.clear();
        this.f4463j = false;
        this.f4460g = 0;
        this.f4456c = false;
        this.f4455b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2667d(int i2) {
        if (this.f4463j) {
            return;
        }
        this.f4463j = true;
        this.f4460g = i2;
        for (InterfaceC1078d interfaceC1078d : this.f4464k) {
            interfaceC1078d.mo2650a(interfaceC1078d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4457d.f4480b.f4314h0);
        sb.append(":");
        switch (this.f4458e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4463j ? Integer.valueOf(this.f4460g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4465l.size());
        sb.append(":d=");
        sb.append(this.f4464k.size());
        sb.append(">");
        return sb.toString();
    }
}
