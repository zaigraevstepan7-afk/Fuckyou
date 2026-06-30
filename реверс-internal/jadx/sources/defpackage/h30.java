package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h30 implements iw {
    public final /* synthetic */ zo0 e;

    public h30(EmojiCompatInitializer emojiCompatInitializer, zo0 zo0Var) {
        this.e = zo0Var;
    }

    @Override // defpackage.iw
    public final void c(xo0 xo0Var) {
        (Build.VERSION.SDK_INT >= 28 ? eq.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new qi(), 500L);
        this.e.f(this);
    }
}
