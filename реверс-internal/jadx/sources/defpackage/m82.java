package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class m82 {
    public static final p82 b;
    public final p82 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new b82() : i >= 35 ? new a82() : i >= 34 ? new z72() : i >= 31 ? new y72() : i >= 30 ? new x72() : i >= 29 ? new w72() : new u72()).b().a.a().a.b().a.c();
    }

    public m82(p82 p82Var) {
        this.a = p82Var;
    }

    public p82 a() {
        return this.a;
    }

    public p82 b() {
        return this.a;
    }

    public p82 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m82)) {
            return false;
        }
        m82 m82Var = (m82) obj;
        return s() == m82Var.s() && r() == m82Var.r() && Objects.equals(m(), m82Var.m()) && Objects.equals(k(), m82Var.k()) && Objects.equals(g(), m82Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public sy g() {
        return null;
    }

    public eh0 h(int i) {
        return eh0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public eh0 i(int i) {
        if ((i & 8) == 0) {
            return eh0.e;
        }
        yc.p("Unable to query the maximum insets for IME");
        return null;
    }

    public eh0 j() {
        return m();
    }

    public eh0 k() {
        return eh0.e;
    }

    public eh0 l() {
        return m();
    }

    public eh0 m() {
        return eh0.e;
    }

    public eh0 n() {
        return m();
    }

    public p82 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(uy uyVar) {
    }

    public void v(eh0[] eh0VarArr) {
    }

    public void w(p82 p82Var) {
    }

    public void x(eh0 eh0Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
