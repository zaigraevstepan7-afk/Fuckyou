package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface xu0 extends pi0 {
    default vu0 V(int i, int i2, g3 g3Var, q qVar, Map map, u3 u3Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ng0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new wu0(i, i2, map, g3Var, qVar, this, u3Var);
    }

    default vu0 f0(int i, int i2, Map map, sa0 sa0Var) {
        return u(i, i2, map, sa0Var);
    }

    vu0 u(int i, int i2, Map map, sa0 sa0Var);
}
