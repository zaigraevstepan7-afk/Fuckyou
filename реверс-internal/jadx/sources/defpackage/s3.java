package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s3 implements wa0 {
    public final h4 e;

    public s3(h4 h4Var) {
        this.e = h4Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = ((a80) obj).a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Integer numB = g80.b(i);
        if (numB != null) {
            int iIntValue = numB.intValue();
            this.e.playSoundEffect(Build.VERSION.SDK_INT >= 31 ? ob.a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
        }
        return t32.a;
    }
}
