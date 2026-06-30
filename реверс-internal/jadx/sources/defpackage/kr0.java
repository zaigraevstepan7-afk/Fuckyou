package defpackage;

import android.media.MediaPlayer;
import android.support.v4.app.C0003;
import androidx.core.graphics.drawable.C0047;
import androidx.profileinstaller.C0064;
import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.snackbar.C0135;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr0 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ lr0 a;
    public final /* synthetic */ MediaPlayer b;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (C0064.m837(C0047.m631(this)) != C0099.m1268(this)) {
            C0003.m53(mediaPlayer);
        } else {
            try {
                C0135.m1697(mediaPlayer);
            } catch (Throwable unused) {
            }
        }
    }

    public /* synthetic */ kr0(lr0 lr0Var, MediaPlayer mediaPlayer, vt vtVar) {
        this.a = lr0Var;
        this.b = mediaPlayer;
    }
}
