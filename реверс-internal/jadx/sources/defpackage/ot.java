package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ot extends t implements jt {
    public static final nt f = new nt(v20.z, new mt(0));

    public ot() {
        super(v20.z);
    }

    public abstract void e(lt ltVar, Runnable runnable);

    public boolean f(lt ltVar) {
        return !(this instanceof o32);
    }

    public ot g(int i) {
        bk.o(i);
        return new gp0(this, i);
    }

    @Override // defpackage.t, defpackage.lt
    public final jt l(kt ktVar) {
        jt jtVar;
        ktVar.getClass();
        if (ktVar instanceof nt) {
            nt ntVar = (nt) ktVar;
            kt ktVar2 = this.e;
            if ((ktVar2 == ntVar || ntVar.f == ktVar2) && (jtVar = (jt) ntVar.e.i(this)) != null) {
                return jtVar;
            }
        } else if (v20.z == ktVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + pv.n(this);
    }

    @Override // defpackage.t, defpackage.lt
    public final lt u(kt ktVar) {
        ktVar.getClass();
        if (ktVar instanceof nt) {
            nt ntVar = (nt) ktVar;
            kt ktVar2 = this.e;
            if ((ktVar2 != ntVar && ntVar.f != ktVar2) || ((jt) ntVar.e.i(this)) == null) {
                return this;
            }
        } else if (v20.z != ktVar) {
            return this;
        }
        return d40.e;
    }
}
