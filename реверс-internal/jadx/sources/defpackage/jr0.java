package defpackage;

import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import android.support.v4.app.C0005;
import androidx.profileinstaller.C0064;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.sidesheet.C0131;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jr0 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ lr0 a;
    public final /* synthetic */ MediaPlayer b;

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaPlayer mediaPlayerM1097 = C0085.m1097(this);
        lr0 lr0VarM77 = C0005.m77(this);
        if (C0064.m837(lr0VarM77) != mediaPlayerM1097) {
            return true;
        }
        C0131.m1650(lr0VarM77);
        C0098.m1265(C0002.m43(lr0VarM77), null);
        return true;
    }

    public /* synthetic */ jr0(lr0 lr0Var, MediaPlayer mediaPlayer) {
        this.a = lr0Var;
        this.b = mediaPlayer;
    }
}
