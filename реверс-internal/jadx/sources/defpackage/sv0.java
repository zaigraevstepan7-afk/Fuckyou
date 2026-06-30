package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv0 implements xw {
    public js f;
    public int g;
    public sv0 i;
    public sv0 j;
    public v01 k;
    public c01 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public y3 q;
    public boolean r;
    public sv0 e = this;
    public int h = -1;

    public boolean A0() {
        return !(this instanceof we);
    }

    public void B0() {
        if (this.r) {
            ng0.b("node attached multiple times");
        }
        if (this.l == null) {
            ng0.b("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void C0() {
        if (!this.r) {
            ng0.b("Cannot detach a node that is not attached");
        }
        if (this.o) {
            ng0.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            ng0.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        js jsVar = this.f;
        if (jsVar != null) {
            bl.q(jsVar, new wv0("The Modifier.Node was detached", 2));
            this.f = null;
        }
    }

    public void G0() {
        if (!this.r) {
            ng0.b("reset() called on an unattached node");
        }
        F0();
    }

    public void H0() {
        if (!this.r) {
            ng0.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            ng0.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        D0();
        this.p = true;
    }

    public void I0() {
        if (!this.r) {
            ng0.b("node detached multiple times");
        }
        if (this.l == null) {
            ng0.b("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            ng0.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        y3 y3Var = this.q;
        if (y3Var != null) {
            y3Var.a();
        }
        E0();
    }

    public void J0(sv0 sv0Var) {
        this.e = sv0Var;
    }

    public void K0(c01 c01Var) {
        this.l = c01Var;
    }

    public final vt z0() {
        js jsVar = this.f;
        if (jsVar != null) {
            return jsVar;
        }
        js jsVarD = bl.d(((h4) bl.Q(this)).getCoroutineContext().j(new qj0((oj0) ((h4) bl.Q(this)).getCoroutineContext().l(v20.O))));
        this.f = jsVarD;
        return jsVarD;
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
    }
}
