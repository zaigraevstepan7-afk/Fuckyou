package defpackage;

import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import androidx.core.app.C0043;
import androidx.profileinstaller.C0064;
import com.google.android.material.appbar.C0085;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.sidesheet.C0131;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ir0 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ lr0 a;
    public final /* synthetic */ MediaPlayer b;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayerM575 = C0043.m575(this);
        lr0 lr0VarM1098 = C0085.m1098(this);
        if (C0064.m837(lr0VarM1098) == mediaPlayerM575) {
            C0131.m1650(lr0VarM1098);
            C0098.m1265(C0002.m43(lr0VarM1098), null);
        }
    }

    public /* synthetic */ ir0(lr0 lr0Var, MediaPlayer mediaPlayer) {
        this.a = lr0Var;
        this.b = mediaPlayer;
    }
}
