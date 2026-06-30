package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public /* synthetic */ Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(ContentResolver contentResolver, Uri uri, k92 k92Var, rh rhVar, Context context, ks ksVar) {
        super(2, ksVar);
        this.m = contentResolver;
        this.n = uri;
        this.o = k92Var;
        this.p = rhVar;
        this.q = context;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ((pr0) o((ks) obj2, (vt) obj)).q(t32Var);
                return wt.e;
            default:
                return ((pr0) o((ks) obj2, (g70) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                pr0 pr0Var = new pr0((h9) obj5, (List) obj4, (s41) obj3, (r41) obj2, ksVar);
                pr0Var.k = obj;
                return pr0Var;
            default:
                pr0 pr0Var2 = new pr0((ContentResolver) this.m, (Uri) obj5, (k92) obj4, (rh) obj3, (Context) obj2, ksVar);
                pr0Var2.k = obj;
                return pr0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:9:0x002c, B:19:0x005d, B:22:0x006a, B:24:0x0072, B:15:0x0041, B:18:0x0056), top: B:47:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0095 -> B:19:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0131 -> B:39:0x00e8). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        vt vtVar;
        gr1 gr1Var;
        vt vtVar2;
        gr1 gr1Var2;
        uw uwVar;
        g70 g70Var;
        qh qhVar;
        Object objB;
        int i = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.n;
        wt wtVar = wt.e;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    vtVar = (vt) this.k;
                    gr1Var = new gr1(0.6f, 200.0f, new Float(0.1f));
                } else if (i2 == 1) {
                    uwVar = (uw) this.m;
                    gr1Var2 = (gr1) this.l;
                    vtVar2 = (vt) this.k;
                    xc.G(obj);
                    this.k = vtVar2;
                    this.l = gr1Var2;
                    this.m = null;
                    this.j = 2;
                    if (uwVar.h(this) != wtVar) {
                        return wtVar;
                    }
                    gr1Var = gr1Var2;
                    vtVar = vtVar2;
                } else {
                    if (i2 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gr1 gr1Var3 = (gr1) this.l;
                    vt vtVar3 = (vt) this.k;
                    xc.G(obj);
                    gr1Var = gr1Var3;
                    vtVar = vtVar3;
                }
                l6 l6Var = new l6((h9) obj4, gr1Var, (List) obj5, (s41) obj3, (r41) obj2, null, 7);
                uw uwVar2 = new uw(lk.W(vtVar, d40.e), true);
                uwVar2.o0(yt.e, uwVar2, l6Var);
                this.k = vtVar;
                this.l = gr1Var;
                this.m = uwVar2;
                this.j = 1;
                if (al.s(650L, this) == wtVar) {
                    return wtVar;
                }
                vtVar2 = vtVar;
                uwVar = uwVar2;
                gr1Var2 = gr1Var;
                this.k = vtVar2;
                this.l = gr1Var2;
                this.m = null;
                this.j = 2;
                if (uwVar.h(this) != wtVar) {
                }
                break;
            default:
                k92 k92Var = (k92) obj5;
                ContentResolver contentResolver = (ContentResolver) this.m;
                int i3 = this.j;
                try {
                    if (i3 == 0) {
                        xc.G(obj);
                        g70Var = (g70) this.k;
                        contentResolver.registerContentObserver((Uri) obj4, false, k92Var);
                        qhVar = new qh((rh) obj3);
                    } else if (i3 == 1) {
                        qh qhVar2 = (qh) this.l;
                        g70 g70Var2 = (g70) this.k;
                        xc.G(obj);
                        g70Var = g70Var2;
                        qhVar = qhVar2;
                        objB = obj;
                        if (((Boolean) objB).booleanValue()) {
                            contentResolver.unregisterContentObserver(k92Var);
                            return t32.a;
                        }
                        qhVar.c();
                        zx0 zx0Var = l92.a;
                        Float f = new Float(Settings.Global.getFloat(((Context) obj2).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.k = g70Var;
                        this.l = qhVar;
                        this.j = 2;
                        if (g70Var.l(f, this) == wtVar) {
                            return wtVar;
                        }
                    } else {
                        if (i3 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qh qhVar3 = (qh) this.l;
                        g70 g70Var3 = (g70) this.k;
                        xc.G(obj);
                        g70Var = g70Var3;
                        qhVar = qhVar3;
                    }
                    this.k = g70Var;
                    this.l = qhVar;
                    this.j = 1;
                    objB = qhVar.b(this);
                    if (objB == wtVar) {
                        return wtVar;
                    }
                    if (((Boolean) objB).booleanValue()) {
                    }
                } catch (Throwable th) {
                    contentResolver.unregisterContentObserver(k92Var);
                    throw th;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(h9 h9Var, List list, s41 s41Var, r41 r41Var, ks ksVar) {
        super(2, ksVar);
        this.n = h9Var;
        this.o = list;
        this.p = s41Var;
        this.q = r41Var;
    }
}
