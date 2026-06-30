package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s4 {
    public static final s4 a = new s4();

    public final void a(View view, j81 j81Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = j81Var instanceof d7 ? PointerIcon.getSystemIcon(context, ((d7) j81Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (xi0.o(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
