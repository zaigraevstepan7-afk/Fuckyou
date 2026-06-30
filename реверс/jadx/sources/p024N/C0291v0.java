package p024N;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p009F.C0076c;

/* JADX INFO: renamed from: N.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C0291v0 {

    /* JADX INFO: renamed from: b */
    public static final C0295x0 f877b;

    /* JADX INFO: renamed from: a */
    public final C0295x0 f878a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f877b = (i2 >= 30 ? new C0277o0() : i2 >= 29 ? new C0275n0() : new C0273m0()).mo868b().f882a.mo909a().f882a.mo904b().f882a.mo905c();
    }

    public C0291v0(C0295x0 c0295x0) {
        this.f878a = c0295x0;
    }

    /* JADX INFO: renamed from: a */
    public C0295x0 mo909a() {
        return this.f878a;
    }

    /* JADX INFO: renamed from: b */
    public C0295x0 mo904b() {
        return this.f878a;
    }

    /* JADX INFO: renamed from: c */
    public C0295x0 mo905c() {
        return this.f878a;
    }

    /* JADX INFO: renamed from: e */
    public C0266j mo910e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0291v0)) {
            return false;
        }
        C0291v0 c0291v0 = (C0291v0) obj;
        return mo899n() == c0291v0.mo899n() && mo907m() == c0291v0.mo907m() && Objects.equals(mo897j(), c0291v0.mo897j()) && Objects.equals(mo906h(), c0291v0.mo906h()) && Objects.equals(mo910e(), c0291v0.mo910e());
    }

    /* JADX INFO: renamed from: f */
    public C0076c mo896f(int i2) {
        return C0076c.f237e;
    }

    /* JADX INFO: renamed from: g */
    public C0076c mo911g() {
        return mo897j();
    }

    /* JADX INFO: renamed from: h */
    public C0076c mo906h() {
        return C0076c.f237e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo899n()), Boolean.valueOf(mo907m()), mo897j(), mo906h(), mo910e());
    }

    /* JADX INFO: renamed from: i */
    public C0076c mo912i() {
        return mo897j();
    }

    /* JADX INFO: renamed from: j */
    public C0076c mo897j() {
        return C0076c.f237e;
    }

    /* JADX INFO: renamed from: k */
    public C0076c mo913k() {
        return mo897j();
    }

    /* JADX INFO: renamed from: l */
    public C0295x0 mo898l(int i2, int i3, int i4, int i5) {
        return f877b;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo907m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo899n() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo895d(View view) {
    }

    /* JADX INFO: renamed from: o */
    public void mo900o(C0076c[] c0076cArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo901p(C0295x0 c0295x0) {
    }

    /* JADX INFO: renamed from: q */
    public void mo908q(C0076c c0076c) {
    }
}
